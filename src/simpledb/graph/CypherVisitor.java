package simpledb.graph;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import simpledb.graph.grammar.*;

import java.util.ArrayList;
import java.util.List;

public class CypherVisitor extends CypherBaseVisitor<String> {

    @Override
    public String visitQuery(CypherParser.QueryContext ctx) {
        String matchClause = visitMatchClause(ctx.matchClause());
        String returnClause = "";
        if (ctx.returnClause() != null) {
            returnClause = "\n" + visitReturnClause(ctx.returnClause());
        }
        return returnClause + "\n" + matchClause;
    }

    @Override
    public String visitMatchClause(CypherParser.MatchClauseContext ctx) {
        var p = "FROM " + ctx.pattern().nodePattern(0).nodeLabel().getText();
        if (ctx.pattern().nodePattern(0).nodeId() != null) {
            p += " AS " + ctx.pattern().nodePattern(0).nodeId().ID().getText();
        }
        p += "\n" + visitPattern(ctx.pattern());
        return p;
    }

    @Override
    public String visitReturnClause(CypherParser.ReturnClauseContext ctx) {
        List<String> returnItems = new ArrayList<>();
        for (CypherParser.ReturnItemContext returnItemContext : ctx.returnItem()) {
            returnItems.add(visitReturnItem(returnItemContext));
        }
        return "SELECT " + String.join(", ", returnItems);
    }

    @Override
    public String visitReturnItem(CypherParser.ReturnItemContext ctx) {
        String nodeId = visitNodeId(ctx.nodeId());
        String property = visitProperty(ctx.property());
        return nodeId + "." + property;
    }

    @Override
    public String visitProperty(CypherParser.PropertyContext ctx) {
        TerminalNode idNode = ctx.ID();
        if (idNode != null) {
            return idNode.getText();
        }
        return "";
    }

    @Override
    public String visitPattern(CypherParser.PatternContext ctx) {

        if (ctx.relationshipPattern() == null) {
            return ";";
        } else if (ctx.relationshipPattern().nodeId() == null) {
            var node1 = ctx.nodePattern(0);
            var node1Label = node1.nodeLabel().getText();
            var node1Id = node1.nodeId().ID().getText();
            var node2 = ctx.nodePattern(1);
            var node2Label = node2.nodeLabel().getText();
            var node2Id = node2.nodeId().ID().getText();

            return "JOIN " +
                    node2Id + " ON " + node1Id + "." + node1Label + "_id" + " = " + node2Id + "." + node2Id + "_id";

        }

        var relationship = ctx.relationshipPattern();
        var relationshipLabel = relationship.nodeLabel().getText();
        var relationshipId = relationship.nodeId().ID().getText();
        var node1 = ctx.nodePattern(0);
        var node1Label = node1.nodeLabel().getText();
        var node1Id = node1.nodeId().ID().getText();
        var node2 = ctx.nodePattern(1);
        var node2Label = node2.nodeLabel().getText();
        var node2Id = node2.nodeId().ID().getText();

        var p = "JOIN " + relationshipId + " ON " + node1Id + "." + node1Label + "_id" + " = " + relationshipId + "." + node1Id + "_id";
        p = p + "\nJOIN " + node2Id + " ON " + relationshipId + "." + node2Id + "_id" + " = " + node2Id + "." + node2Id + "_id";
        return p;
    }

    @Override
    public String visitNodePattern(CypherParser.NodePatternContext ctx) {
        TerminalNode nodeId = ctx.nodeId().ID();
        if (nodeId != null) {
            return "SCAN(" + nodeId.getText() + ")";
        }
        return "";
    }

    @Override
    public String visitNodeId(CypherParser.NodeIdContext ctx) {
        TerminalNode idNode = ctx.ID();
        if (idNode != null) {
            return idNode.getText();
        }
        return "";
    }

}
