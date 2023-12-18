package graph.visitor;

import java.util.ArrayList;
import java.util.UUID;

import graph.grammar.*;
import graph.grammar.CypherParser.*;
import graph.visitor.result.*;
import graph.visitor.result.commands.*;
import graph.visitor.result.core.*;

public class CypherVisitor extends CypherBaseVisitor<VisitorResult> {
    String graphName = "defaultgraph";
    VisitorNamespace namespace;

    Node addNodeToNamespace(Node node) {
        namespace.put(node.getVariableName(), node);
        return node;
    }

    @Override
    public MultiQuery visitMultiQuery(MultiQueryContext ctx) {
        Query[] queries = ctx.query().stream().map(this::visit).toArray(Query[]::new);

        return new MultiQuery(queries);
    }

    @Override
    public Query visitQuery(CypherParser.QueryContext ctx) {
        namespace = new VisitorNamespace();
        var query = ctx.children.stream().map(this::visit).toArray(Command[]::new);

        return new Query(query);
    }

    @Override
    public DeleteCommand visitDeleteCommand(DeleteCommandContext ctx) {
        return new DeleteCommand(ctx.nodeVariable.getText());
    }

    @Override
    public CreateCommand visitCreateCommand(CreateCommandContext ctx) {
        CreateNodePattern[] result = ctx.createCommandPattern().stream().map(this::visit)
                .toArray(CreateNodePattern[]::new);

        ArrayList<CreateSingleNode> singleNodes = new ArrayList<>();
        ArrayList<CreateNodesWithRelationship> relationshipNodes = new ArrayList<>();

        for (CreateNodePattern pattern : result) {
            if (pattern.getType() == CreateNodePattern.Type.SINGLE_NODE) {
                singleNodes.add(new CreateSingleNode(pattern.getNode()));
            } else {
                relationshipNodes.add(new CreateNodesWithRelationship(pattern.getNodeTo(), pattern.getNodeFrom(),
                        pattern.getRelationship()));
            }
        }

        return new CreateCommand(singleNodes.toArray(CreateSingleNode[]::new),
                relationshipNodes.toArray(CreateNodesWithRelationship[]::new));
    }

    @Override
    public CreateNodePattern visitCreateSingleNode(CreateSingleNodeContext ctx) {
        Node node = (Node) visit(ctx.node);
        return new CreateNodePattern(node);
    }

    @Override
    public CreateNodePattern visitCreateNodeRelationship(CreateNodeRelationshipContext ctx) {
        Node nodeTo = (Node) visit(ctx.nodeTo);
        Node nodeFrom = (Node) visit(ctx.nodeFrom);
        Node relationship = (Node) visit(ctx.relationship);
        return new CreateNodePattern(nodeTo, nodeFrom, relationship);
    }

    @Override
    public CreateNodePattern visitCreateNodeInverseRelationship(CreateNodeInverseRelationshipContext ctx) {
        Node nodeTo = (Node) visit(ctx.nodeTo);
        Node nodeFrom = (Node) visit(ctx.nodeFrom);
        Node relationship = (Node) visit(ctx.relationship);
        return new CreateNodePattern(nodeTo, nodeFrom, relationship);
    }

    @Override
    public ReturnCommand visitReturnCommand(ReturnCommandContext ctx) {
        Properties returnPattern = (Properties) visit(ctx.returnPattern());
        for (Pair pair : returnPattern.getProperties()) {
            if (namespace.containsKey(pair.getProperty())) {
                Node node = namespace.get(pair.getProperty());
                node.addSelectProperty(pair.getValue());
            }
        }

        return new ReturnCommand(returnPattern);
    }

    @Override
    public MatchCommand visitMatchCommand(MatchCommandContext ctx) {
        MatchPattern[] matches = ctx.matchPattern().stream().map(this::visit).toArray(MatchPattern[]::new);

        return new MatchCommand(matches);
    }

    @Override
    public Properties visitReturnSingleNode(ReturnSingleNodeContext ctx) {
        Pair pair = new Pair(ctx.children.get(0).getText(), "*");
        return new Properties(new Pair[] { pair });
    }

    @Override
    public Properties visitReturnMultipleNodes(ReturnMultipleNodesContext ctx) {
        return new Properties(ctx.returnItem().stream().map(this::visit).toArray(Pair[]::new));
    }

    @Override
    public Pair visitReturnItem(ReturnItemContext ctx) {
        return new Pair(ctx.object.getText(), ctx.property.getText());
    }

    @Override
    public MatchPattern visitMatchPattern(MatchPatternContext ctx) {
        if (ctx.node != null) { // It's a single node
            Node node = (Node) visit(ctx.node);

            return new MatchPattern(node, MatchPattern.Type.SINGLE);
        } else if (ctx.relationship != null) {
            Node nodeTo = (Node) visit(ctx.nodeTo);
            Node nodeFrom = (Node) visit(ctx.nodeFrom);
            Node relationship = (Node) visit(ctx.relationship);

            return new MatchPattern(nodeFrom, nodeTo, relationship, MatchPattern.Type.RELATIONSHIP);
        } else if (ctx.nodeTo != null && ctx.nodeFrom != null) {
            Node nodeTo = (Node) visit(ctx.nodeTo);
            Node nodeFrom = (Node) visit(ctx.nodeFrom);
            return new MatchPattern(nodeFrom, nodeTo, MatchPattern.Type.ANY_RELATIONSHIP);
        }

        throw new RuntimeException("Invalid match pattern");
    }

    @Override
    public Node visitNodeRelationshipPattern(NodeRelationshipPatternContext ctx) {
        Pair variableAndLabel = (Pair) visit(ctx.nodeNameAndLabel);
        Properties properties = (Properties) visit(ctx.properties);
        return addNodeToNamespace(new Node(
                Node.Type.RELATIONSHIP,
                properties,
                variableAndLabel.getProperty(),
                variableAndLabel.getValue()));
    }

    @Override
    public Node visitNodePattern(NodePatternContext ctx) {
        Pair variableAndLabel = (Pair) visit(ctx.nodeNameAndLabel);
        Properties properties = (Properties) visit(ctx.properties);
        String variableName = variableAndLabel.getProperty();

        if (variableName == null || variableName.equals("")) {
            // return namespace.get(variableAndLabel.getValue());
            // variableName = UUID.randomUUID().toString();
        }
        return addNodeToNamespace(new Node(
                Node.Type.NODE,
                properties,
                variableName,
                variableAndLabel.getValue()));
    }

    @Override
    public Properties visitNodeProperties(NodePropertiesContext ctx) {
        return new Properties(ctx.pair().stream().map(this::visit).toArray(Pair[]::new));
    }

    @Override
    public Pair visitPair(PairContext ctx) {
        var property = "";
        var value = "";
        if (ctx.value != null) {
            value = ctx.value.getText();
        }
        if (ctx.property != null) {
            property = ctx.property.getText();
        }
        return new Pair(property, value);
    }
}
