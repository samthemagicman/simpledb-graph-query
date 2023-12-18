package client;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import db.DBHelper;
import graph.grammar.CypherLexer;
import graph.grammar.CypherParser;
import graph.visitor.CypherVisitor;
import graph.visitor.VisitorNamespace;
import graph.visitor.result.MatchPattern;
import graph.visitor.result.Node;
import graph.visitor.result.Pair;
import graph.visitor.result.Properties;
import graph.visitor.result.commands.CreateCommand;
import graph.visitor.result.commands.CreateNodesWithRelationship;
import graph.visitor.result.commands.CreateSingleNode;
import graph.visitor.result.commands.MatchCommand;
import graph.visitor.result.commands.QueryResult;
import graph.visitor.result.commands.ReturnCommand;
import graph.visitor.result.core.Command;
import model.MatchQueryResult;
import model.Relationship;

public class Client {
    public DBHelper dbHelper;

    private ArrayList<VisitorNamespace> namespaces;

    public void initialize() {
        dbHelper = new DBHelper("buzzhub_nodes", "buzzhub_relationships");
    }

    public void start() {
        System.out.println("Welcome to the Graph Interpreter!");
        String userQuery = "";
        Scanner scanner = new Scanner(System.in);

        while (userQuery.toLowerCase() != "exit") {

            System.out.println("Please enter the query you want to execute");
            System.out.println("or exit to exit the program:");

            userQuery = scanner.nextLine();
            // parse and execute query
            QueryResult result = runQuery(userQuery);
            processCommands(result);
        }

        scanner.close();
        System.out.println("Exiting program.");
        System.exit(0);
    }

    public void processCommands(QueryResult result) {
        namespaces = new ArrayList<>();
        for (Command command : result.getCommands()) {
            if (command instanceof CreateCommand) {
                handleCreateCommand((CreateCommand) command);
            } else if (command instanceof MatchCommand) {
                handleMatchCommand((MatchCommand) command);
            } else if (command instanceof ReturnCommand) {
                handleReturnCommand((ReturnCommand) command);
            }
        }
    }

    public QueryResult runQuery(String query) {
        var lexer = new CypherLexer(CharStreams.fromString(query));
        var tokens = new CommonTokenStream(lexer);
        var parser = new CypherParser(tokens);
        var visitor = new CypherVisitor();
        var results = visitor.visit(parser.query());
        return (QueryResult) results;
    }

    private void handleReturnCommand(ReturnCommand command) {
        // Prints out a table of the properties requested in the return command
        Properties properties = command.getProperties();
        Pair[] returnProperties = properties.getProperties();
        ArrayList<String> alreadyPrinted = new ArrayList<>();

        ArrayList<String> uniqueReturnProperties = new ArrayList<>();

        for (Pair pair : returnProperties) {
            if (!uniqueReturnProperties.contains(pair.getValue())) {
                uniqueReturnProperties.add(pair.getValue());
            }
        }
        System.out.print("\u001B[32m");
        for (String property : uniqueReturnProperties) {
            System.out.print(property + "\t");
        }

        System.out.println("\u001B[0m");
        for (VisitorNamespace namespace : namespaces) {
            for (String i : namespace.keySet()) {
                if (properties.get(i) != null) {
                    Node node = namespace.get(i);
                    if (!alreadyPrinted.contains(node.getProperties().get("id"))) {
                        for (String property : uniqueReturnProperties) {
                            if (property.equals("*")) {
                                System.out.println(node);
                            } else {
                                System.out.print(node.getProperties().get(property) + "\t");
                            }
                            alreadyPrinted.add(node.getProperties().get("id"));
                        }
                        System.out.println();
                    }
                }
            }
        }
    }

    private void handleMatchCommand(MatchCommand command) {
        MatchPattern pattern = command.getMatchPattern();

        if (pattern.getType() == MatchPattern.Type.SINGLE) {
            // String[] filters = pattern.getNodeSource().getSelectProperties();
            // filters = Arrays.stream(filters)
            // .map(filter -> "node_" + filter.toLowerCase())
            // .toArray(String[]::new);
            Node[] nodes = dbHelper.matchNode(pattern.getNodeSource());
            for (Node node : nodes) {
                // System.out.println(node);
                VisitorNamespace namespace = new VisitorNamespace();
                namespace.put(pattern.getNodeSource().getVariableName(), node);
                namespaces.add(namespace);
            }
        } else if (pattern.getType() == MatchPattern.Type.RELATIONSHIP) {
            MatchQueryResult[] result = dbHelper.getNodesWithUndirectedRelationship(pattern.getNodeSource(),
                    pattern.getNodeTarget(),
                    pattern.getNodeRelationship());

            for (MatchQueryResult match : result) {
                // System.out.println(match.getSource() + " - " + match.getRelationship() + " ->
                // " + match.getTarget());
                VisitorNamespace namespace = new VisitorNamespace();
                namespace.put(pattern.getNodeSource().getVariableName(), match.getSource());
                namespace.put(pattern.getNodeTarget().getVariableName(), match.getTarget());
                namespace.put(pattern.getNodeRelationship().getVariableName(), match.getRelationship());
                namespaces.add(namespace);
            }
        } else if (pattern.getType() == MatchPattern.Type.ANY_RELATIONSHIP) {
            MatchQueryResult[] result = dbHelper.getNodesWithAnyRelationship(pattern.getNodeSource(),
                    pattern.getNodeTarget());

            for (MatchQueryResult match : result) {
                // System.out.println(match.getSource() + " - " + match.getRelationship() + " ->
                // " + match.getTarget());
                VisitorNamespace namespace = new VisitorNamespace();
                namespace.put(pattern.getNodeSource().getVariableName(), match.getSource());
                namespace.put(pattern.getNodeTarget().getVariableName(), match.getTarget());
                namespaces.add(namespace);
            }
        }
    }

    private void handleCreateCommand(CreateCommand command) {
        command.getSingleNodes();
        command.getNodesWithRelationships();

        for (CreateSingleNode node : command.getSingleNodes()) {
            handleSingleNode(node);
        }

        for (CreateNodesWithRelationship node : command.getNodesWithRelationships()) {
            handleCreateNodeWithRelationships(node);
        }
    }

    private void handleSingleNode(CreateSingleNode node) {
        VisitorNamespace namespace = new VisitorNamespace();
        Node newNode = dbHelper.createNewNode(node.getNode());
        namespace.put(node.getNode().getVariableName(), newNode);
        namespaces.add(namespace);
    }

    private void handleCreateNodeWithRelationships(CreateNodesWithRelationship node) {
        VisitorNamespace namespace = new VisitorNamespace();
        // Node nodeTo = visitorNodeToDBNode(node.getNodeTo());
        // Node nodeFrom = visitorNodeToDBNode(node.getNodeFrom());
        var nodeRelationship = node.getRelationshipNode();

        // int nodeToId = dbHelper.createNode(nodeTo);
        // int nodeFromId = dbHelper.createNode(nodeFrom);

        Node nodeTo = dbHelper.createNewNode(node.getNodeTo());
        Node nodeFrom = dbHelper.createNewNode(node.getNodeFrom());

        int nodeToId = Integer.parseInt(nodeTo.getProperties().get("id"));
        int nodeFromId = Integer.parseInt(nodeFrom.getProperties().get("id"));

        Relationship relationship = new Relationship(nodeRelationship.getLabel(),
                nodeFromId, nodeToId, LocalDate.now(), nodeRelationship.getProperties().get("description"),
                nodeRelationship.getLabel());

        dbHelper.createRelationship(relationship);

        namespace.put(node.getNodeTo().getVariableName(), nodeTo);
        namespace.put(node.getNodeFrom().getVariableName(), nodeFrom);
        namespaces.add(namespace);
    }

    public void close() {
        dbHelper.closeDBConnection();
    }
}
