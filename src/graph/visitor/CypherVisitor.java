package graph.visitor;

import java.util.ArrayList;

import graph.grammar.*;
import graph.grammar.CypherParser.*;
import graph.visitor.types.*;
import graph.visitor.types.commands.*;
import graph.visitor.types.core.*;

public class CypherVisitor extends CypherBaseVisitor<VisitorResult> {
    String graphName = "defaultgraph";

    @Override
    public QueryResult visitQuery(CypherParser.QueryContext ctx) {
        var query = ctx.children.stream().map(this::visit).toArray(Command[]::new);

        return new QueryResult(query);
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
    public Node visitCreateRelationshipPattern(CreateRelationshipPatternContext ctx) {
        Pair variableAndLabel = (Pair) visit(ctx.nodeNameAndLabel);
        Properties properties = (Properties) visit(ctx.properties);
        return new Node(
                Node.Type.RELATIONSHIP,
                properties,
                variableAndLabel.getProperty(),
                variableAndLabel.getValue());
    }

    @Override
    public Node visitCreateNodePattern(CreateNodePatternContext ctx) {
        Pair variableAndLabel = (Pair) visit(ctx.nodeNameAndLabel);
        Properties properties = (Properties) visit(ctx.properties);
        return new Node(
                Node.Type.NODE,
                properties,
                variableAndLabel.getProperty(),
                variableAndLabel.getValue());
    }

    @Override
    public Properties visitNodeProperties(NodePropertiesContext ctx) {
        return new Properties(ctx.pair().stream().map(this::visit).toArray(Pair[]::new));
    }

    @Override
    public Pair visitPair(PairContext ctx) {
        var property = "";
        if (ctx.property != null) {
            property = ctx.property.getText();
        }
        return new Pair(property, ctx.value.getText());
    }
}
