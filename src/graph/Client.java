package graph;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import db.DBHelper;
import graph.grammar.CypherLexer;
import graph.grammar.CypherParser;
import graph.visitor.CypherVisitor;
import graph.visitor.result.MatchPattern;
import graph.visitor.result.Properties;
import graph.visitor.result.commands.CreateCommand;
import graph.visitor.result.commands.CreateNodesWithRelationship;
import graph.visitor.result.commands.CreateSingleNode;
import graph.visitor.result.commands.MatchReturnCommand;
import graph.visitor.result.commands.QueryResult;
import graph.visitor.result.core.Command;
import model.Node;
import model.Relationship;

public class Client {
    public DBHelper dbHelper;

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
        for (Command command : result.getCommands()) {
            if (command instanceof CreateCommand) {
                handleCreateCommand((CreateCommand) command);
            } else if (command instanceof MatchReturnCommand) {
                handleMatchCommand((MatchReturnCommand) command);
            }
        }
    }

    public model.Node visitorNodeToDBNode(graph.visitor.result.Node node) {
        Properties properties = node.getProperties();
        String name = properties.get("name");
        String username = properties.get("username");
        String email = properties.get("email");
        String content = properties.get("content");
        String tags = properties.get("tags");
        String country = properties.get("country");
        String city = properties.get("city");

        LocalDate dateCreated = LocalDate.now();

        return new model.Node(node.getLabel(), name, username, email, content, dateCreated, tags,
                country, city);
    }

    // public model.Relationship
    // visitorRelationshipToDBRelationship(graph.visitor.types.Node node) {
    // Properties properties = node.getProperties();
    // int edgeSourceNodeId = properties.get("name");

    // return new model.Relationship(node.getLabel(), name, username, email, dob,
    // content, dateCreated, tags,
    // country, city);
    // }

    public QueryResult runQuery(String query) {
        var lexer = new CypherLexer(CharStreams.fromString(query));
        var tokens = new CommonTokenStream(lexer);
        var parser = new CypherParser(tokens);
        var visitor = new CypherVisitor();
        var results = visitor.visit(parser.query());
        return (QueryResult) results;
    }

    private void handleMatchCommand(MatchReturnCommand command) {
        MatchPattern pattern = command.getMatchPattern();

        if (pattern.getType() == MatchPattern.Type.SINGLE) {
            // String[] filters = pattern.getNodeSource().getSelectProperties();
            // filters = Arrays.stream(filters)
            // .map(filter -> "node_" + filter.toLowerCase())
            // .toArray(String[]::new);
            graph.visitor.result.Node[] nodes = dbHelper.matchNode(pattern.getNodeSource());
            for (graph.visitor.result.Node node : nodes) {
                System.out.println(node);
            }
        } else {

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
        dbHelper.createNode(visitorNodeToDBNode(node.getNode()));
    }

    private void handleCreateNodeWithRelationships(CreateNodesWithRelationship node) {
        Node nodeTo = visitorNodeToDBNode(node.getNodeTo());
        Node nodeFrom = visitorNodeToDBNode(node.getNodeFrom());
        var nodeRelationship = node.getRelationshipNode();

        int nodeToId = dbHelper.createNode(nodeTo);
        int nodeFromId = dbHelper.createNode(nodeFrom);

        Relationship relationship = new Relationship(nodeRelationship.getLabel(),
                nodeFromId, nodeToId, LocalDate.now(), nodeRelationship.getProperties().get("description"),
                nodeRelationship.getLabel());

        dbHelper.createRelationship(relationship);
    }
}
