package simpledb.graph;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import simpledb.graph.grammar.*;

import java.util.ArrayList;
import java.util.List;

public class CypherVisitor extends CypherBaseVisitor<String> {
    String graphName = "defaultgraph";

    @Override
    public String visitQuery(CypherParser.QueryContext ctx) {
        var query = ctx.children.stream().map(this::visit).toArray(String[]::new);
        return String.join(";\n", query) + ";";
    }

    @Override
    public String visitMatchAndReturnClause(CypherParser.MatchAndReturnClauseContext ctx) {
        String matchClause = visit(ctx.matchClause());
        String returnClause = "";
        if (ctx.returnClause() != null) {
            returnClause = "\n" + visit(ctx.returnClause());
        }
        return returnClause + "\n" + matchClause;
    }

    @Override
    public String visitCreateCommand(CypherParser.CreateCommandContext ctx) {
        String nodeTableName = graphName + "_nodes";
        return "INSERT INTO " + nodeTableName + visit(ctx.createCommandPattern());
    }

    @Override
    public String visitCreateCommandPattern(CypherParser.CreateCommandPatternContext ctx) {
        var nodeId = ctx.pair().property.getText();
        var nodeLabel = ctx.pair().value.getText();

        var properties = ctx.createCommandProperties().pair();
        var propNames = properties.stream().map(p -> p.property.getText() + nodeId).toArray(String[]::new);
        var propValues = properties.stream().map(p -> "'" + p.value.getText() + nodeId + "'").toArray(String[]::new);

        String propNamesString = propNames.length == 0 ? "" : "," + String.join(",", propNames);
        String propValuesString = propValues.length == 0 ? "" : "," + String.join(",", propValues);

        String result = " (" + nodeLabel + propNamesString + ") VALUES (" + nodeLabel + propValuesString + ")";

        return result;
    }

    @Override
    public String visitMatchClause(CypherParser.MatchClauseContext ctx) {
        var p = "FROM " + ctx.pattern().nodePattern(0).pair().property.getText();
        if (ctx.pattern().nodePattern(0).pair() != null) {
            p += " AS " + ctx.pattern().nodePattern(0).pair().value.getText();
        }
        p += "\n" + visitPattern(ctx.pattern());
        return p;
    }

    @Override
    public String visitReturnClause(CypherParser.ReturnClauseContext ctx) {
        return "SELECT " + visit(ctx.returnPattern());
    }

    @Override
    public String visitReturnAll(CypherParser.ReturnAllContext ctx) {
        return "*";
    }

    @Override
    public String visitReturnSingleNode(CypherParser.ReturnSingleNodeContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitReturnMultipleNodes(CypherParser.ReturnMultipleNodesContext ctx) {
        List<String> returnItems = new ArrayList<>();
        for (CypherParser.ReturnItemContext returnItemContext : ctx.returnItem()) {
            returnItems.add(visitReturnItem(returnItemContext));
        }
        return String.join(", ", returnItems);
    }

    @Override
    public String visitReturnItem(CypherParser.ReturnItemContext ctx) {
        return ctx.object.getText() + "." + ctx.property.getText();
    }

    @Override
    public String visitPattern(CypherParser.PatternContext ctx) {

        if (ctx.relationshipPattern() == null) {
            return ";";
        } else if (ctx.relationshipPattern().pair().property == null) {
            var node1 = ctx.nodePattern(0).pair();
            var node1Label = node1.property.getText();
            var node1Id = node1.value.getText();
            var node2 = ctx.nodePattern(1).pair();
            var node2Label = node2.property.getText();
            var node2Id = node2.value.getText();

            return "JOIN " +
                    node2Id + " ON " + node1Id + "." + node1Label + "_id" + " = " + node2Id + "." + node2Id + "_id";

        }

        var relationship = ctx.relationshipPattern();
        var relationshipLabel = relationship.pair().property.getText();
        var relationshipId = relationship.pair().value.getText();
        var node1 = ctx.nodePattern(0);
        var node1Label = node1.pair().property.getText();
        var node1Id = node1.pair().value.getText();
        var node2 = ctx.nodePattern(1);
        var node2Label = node2.pair().property.getText();
        var node2Id = node2.pair().value.getText();

        var p = "JOIN " + relationshipId + " ON " + node1Id + "." + node1Label + "_id" + " = " + relationshipId + "." + node1Id + "_id";
        p = p + "\nJOIN " + node2Id + " ON " + relationshipId + "." + node2Id + "_id" + " = " + node2Id + "." + node2Id + "_id";
        return p;
    }
}
