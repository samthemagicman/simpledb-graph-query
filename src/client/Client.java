package client;

import java.util.ArrayList;
import java.util.Scanner;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import db.DBHelper;
import graph.grammar.CypherLexer;
import graph.grammar.CypherParser;
import graph.visitor.CypherVisitor;
import graph.visitor.result.MatchPattern;
import graph.visitor.result.Node;
import graph.visitor.result.Pair;
import graph.visitor.result.Properties;
import graph.visitor.result.commands.CreateCommand;
import graph.visitor.result.commands.CreateNodesWithRelationship;
import graph.visitor.result.commands.CreateSingleNode;
import graph.visitor.result.commands.DeleteCommand;
import graph.visitor.result.commands.MatchCommand;
import graph.visitor.result.commands.MultiQuery;
import graph.visitor.result.commands.Query;
import graph.visitor.result.commands.ReturnCommand;
import graph.visitor.result.core.Command;
import model.MatchQueryResult;
import model.NodeNamespace;

public class Client {
    public DBHelper dbHelper;

    private NodeNamespace nodeNamespace;

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
            MultiQuery result = processQueryString(userQuery);
            processQueries(result);
        }

        scanner.close();
        System.out.println("Exiting program.");
        System.exit(0);
    }

    public String[][] processQueries(MultiQuery result) {
        ArrayList<String[]> outputs = new ArrayList<>();
        for (Query query : result.getQueries()) {
            outputs.add(processQuery(query));
        }

        return outputs.toArray(new String[outputs.size()][]);
    }

    public String[] processQuery(Query query) {
        nodeNamespace = new NodeNamespace();
        ArrayList<String> outputs = new ArrayList<>();
        for (Command command : query.getCommands()) {
            if (command instanceof CreateCommand) {
                outputs.add(handleCreateCommand((CreateCommand) command));
            } else if (command instanceof MatchCommand) {
                outputs.add(handleMatchCommand((MatchCommand) command));
            } else if (command instanceof ReturnCommand) {
                outputs.add(handleReturnCommand((ReturnCommand) command));
            } else if (command instanceof DeleteCommand) {
                outputs.add(handleDeleteCommand((DeleteCommand) command));
            }
        }

        return outputs.toArray(new String[outputs.size()]);
    }

    private String handleDeleteCommand(DeleteCommand command) {
        StringBuilder output = new StringBuilder();
        String variableName = command.getVariableName();
        ArrayList<Node> nodes = nodeNamespace.get(variableName);
        ArrayList<Node> nodesToDelete = new ArrayList<>();
        if (nodes != null) {
            for (Node node : nodes) {
                if (node.getType() == Node.Type.RELATIONSHIP) {
                    dbHelper.DeleteRelationshipById(Integer.parseInt(node.getProperties().get("id")));
                } else if (node.getType() == Node.Type.NODE) {
                    dbHelper.DeleteNode(Integer.parseInt(node.getProperties().get("id")));
                    nodesToDelete.add(node);
                }
            }
        } else {
            output.append("Could not delete " + variableName);
        }

        for (Node node : nodesToDelete) {
            output.append(node + " deleted\n");
            nodes.remove(node);
        }

        return output.toString();
    }

    public MultiQuery processQueryString(String query) {
        var lexer = new CypherLexer(CharStreams.fromString(query));
        var tokens = new CommonTokenStream(lexer);
        var parser = new CypherParser(tokens);
        var visitor = new CypherVisitor();
        var results = visitor.visit(parser.multiQuery());
        return (MultiQuery) results;
    }

    private String handleReturnCommand(ReturnCommand command) {
        // Prints out a table of the properties requested in the return command
        StringBuilder output = new StringBuilder();
        Properties properties = command.getProperties();
        Pair[] returnProperties = properties.getProperties();
        ArrayList<String> uniqueReturnProperties = new ArrayList<>();
        ArrayList<Node> alreadyPrinted = new ArrayList<>();

        for (Pair pair : returnProperties) {
            if (!uniqueReturnProperties.contains(pair.getValue())) {
                uniqueReturnProperties.add(pair.getValue());
            }
        }
        output.append("\u001B[32m");
        for (String property : uniqueReturnProperties) {
            output.append(property + "\t");
        }

        output.append("\u001B[0m\n");

        for (Pair pair : returnProperties) {
            ArrayList<Node> nodes = nodeNamespace.get(pair.getProperty());
            if (nodes != null) {
                for (Node node : nodes) {
                    if (!alreadyPrinted.contains(node)) {
                        for (String property : uniqueReturnProperties) {
                            if (property.equals("*")) {
                                output.append(node);
                            } else {
                                output.append(node.getProperties().get(property) + "\t");
                            }
                            alreadyPrinted.add(node);
                        }
                        output.append("\n");
                    }
                }
            }
        }

        return output.toString();
    }

    private String handleMatchCommand(MatchCommand command) {
        StringBuilder output = new StringBuilder();
        MatchPattern[] patterns = command.getMatchPatterns();

        for (MatchPattern pattern : patterns) {
            if (pattern.getType() == MatchPattern.Type.SINGLE) {
                Node[] nodes = dbHelper.matchNode(pattern.getNodeSource());
                for (Node node : nodes) {
                    nodeNamespace.addNode(pattern.getNodeSource().getVariableName(), node);
                    output.append("Matched node " + node.getProperties().get("id") + "\n");
                }
            } else if (pattern.getType() == MatchPattern.Type.RELATIONSHIP) {
                MatchQueryResult[] result = dbHelper.getNodesWithDirectedRelationship(pattern.getNodeSource(),
                        pattern.getNodeTarget(),
                        pattern.getNodeRelationship());

                for (MatchQueryResult match : result) {
                    nodeNamespace.addNode(pattern.getNodeSource().getVariableName(), match.getSource());
                    nodeNamespace.addNode(pattern.getNodeTarget().getVariableName(), match.getTarget());
                    nodeNamespace.addNode(pattern.getNodeRelationship().getVariableName(), match.getRelationship());
                    output.append("Matched node " + match.getSource().getProperties().get("id") + " - "
                            + match.getTarget().getProperties().get("id") + " -> "
                            + match.getRelationship() + "\n");
                }
            } else if (pattern.getType() == MatchPattern.Type.ANY_RELATIONSHIP) {
                MatchQueryResult[] result = dbHelper.getNodesWithAnyRelationship(pattern.getNodeSource(),
                        pattern.getNodeTarget());

                for (MatchQueryResult match : result) {
                    nodeNamespace.addNode(pattern.getNodeSource().getVariableName(), match.getSource());
                    nodeNamespace.addNode(pattern.getNodeTarget().getVariableName(), match.getTarget());
                    output.append("Matched node " + match.getSource().getProperties().get("id") + " - "
                            + match.getTarget().getProperties().get("id") + "\n");
                }
            }
        }

        return output.toString();
    }

    private String handleCreateCommand(CreateCommand command) {
        command.getSingleNodes();
        command.getNodesWithRelationships();

        for (CreateSingleNode node : command.getSingleNodes()) {
            return createSingleNode(node);
        }

        for (CreateNodesWithRelationship node : command.getNodesWithRelationships()) {
            return handleCreateNodeWithRelationships(node);
        }

        return "No nodes created";
    }

    private String createSingleNode(CreateSingleNode node) {
        Node newNode = dbHelper.createNodeInDb(node.getNode());
        nodeNamespace.addNode(node.getNode().getVariableName(), newNode);
        return "Created node " + newNode.getVariableName() + " with id " + newNode.getProperties().get("id");
    }

    private String handleCreateNodeWithRelationships(CreateNodesWithRelationship createData) {
        String output = "";

        var nodeRelationship = createData.getRelationshipNode();

        Node nodeTo = createData.getNodeTo();
        Node nodeFrom = createData.getNodeFrom();
        String nodeToVariableName = nodeTo.getVariableName();
        String nodeFromVariableName = nodeFrom.getVariableName();

        ArrayList<Node> nodeToResults = nodeNamespace.get(nodeToVariableName) == null ? new ArrayList<>()
                : nodeNamespace.get(nodeToVariableName);
        ArrayList<Node> nodeFromResults = nodeNamespace.get(nodeFromVariableName) == null ? new ArrayList<>()
                : nodeNamespace.get(nodeFromVariableName);

        if (nodeToResults.size() == 0) { // Node doesn't exist (match did not find it, or it's not in namespace
                                         // otherwise)
            nodeTo = dbHelper.createNodeInDb(createData.getNodeTo());
            nodeToResults.add(nodeTo);

            nodeNamespace.addNode(createData.getNodeTo().getVariableName(), nodeTo);
            output += "Created node " + nodeTo.getVariableName() + " with id " + nodeTo.getProperties().get("id")
                    + "\n";
        }

        if (nodeFromResults.size() == 0) {
            nodeFrom = dbHelper.createNodeInDb(createData.getNodeFrom());
            nodeFromResults.add(nodeFrom);

            nodeNamespace.addNode(createData.getNodeFrom().getVariableName(), nodeFrom);
            output += "Created node " + nodeFrom.getVariableName() + " with id " + nodeFrom.getProperties().get("id")
                    + "\n";
        }

        for (Node nodeToResult : nodeToResults) {
            for (Node nodeFromResult : nodeFromResults) {
                int nodeToId = Integer.parseInt(nodeToResult.getProperties().get("id"));
                int nodeFromId = Integer.parseInt(nodeFromResult.getProperties().get("id"));

                Node relationshipNode = dbHelper.createRelationship(nodeRelationship, nodeFromId, nodeToId);
                nodeNamespace.addNode(relationshipNode.getVariableName(), relationshipNode);
                output += "Created relationship " + relationshipNode.getVariableName() + " with id "
                        + relationshipNode.getProperties().get("id") + "\n";
            }
        }

        return output;
    }

    public void close() {
        dbHelper.closeDBConnection();
    }
}
