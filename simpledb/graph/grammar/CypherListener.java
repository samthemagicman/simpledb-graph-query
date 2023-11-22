// Generated from C:/Users/samsa/Documents/GitHub/simpledb-graph-query/grammar/Cypher.g4 by ANTLR 4.13.1
package simpledb.graph.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CypherParser}.
 */
public interface CypherListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CypherParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(CypherParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(CypherParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherParser#matchClause}.
	 * @param ctx the parse tree
	 */
	void enterMatchClause(CypherParser.MatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#matchClause}.
	 * @param ctx the parse tree
	 */
	void exitMatchClause(CypherParser.MatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void enterReturnClause(CypherParser.ReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#returnClause}.
	 * @param ctx the parse tree
	 */
	void exitReturnClause(CypherParser.ReturnClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherParser#returnPattern}.
	 * @param ctx the parse tree
	 */
	void enterReturnPattern(CypherParser.ReturnPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#returnPattern}.
	 * @param ctx the parse tree
	 */
	void exitReturnPattern(CypherParser.ReturnPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherParser#returnAll}.
	 * @param ctx the parse tree
	 */
	void enterReturnAll(CypherParser.ReturnAllContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#returnAll}.
	 * @param ctx the parse tree
	 */
	void exitReturnAll(CypherParser.ReturnAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherParser#returnItem}.
	 * @param ctx the parse tree
	 */
	void enterReturnItem(CypherParser.ReturnItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#returnItem}.
	 * @param ctx the parse tree
	 */
	void exitReturnItem(CypherParser.ReturnItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(CypherParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(CypherParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(CypherParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(CypherParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherParser#relationshipPattern}.
	 * @param ctx the parse tree
	 */
	void enterRelationshipPattern(CypherParser.RelationshipPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#relationshipPattern}.
	 * @param ctx the parse tree
	 */
	void exitRelationshipPattern(CypherParser.RelationshipPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherParser#nodePattern}.
	 * @param ctx the parse tree
	 */
	void enterNodePattern(CypherParser.NodePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#nodePattern}.
	 * @param ctx the parse tree
	 */
	void exitNodePattern(CypherParser.NodePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherParser#nodeLabel}.
	 * @param ctx the parse tree
	 */
	void enterNodeLabel(CypherParser.NodeLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#nodeLabel}.
	 * @param ctx the parse tree
	 */
	void exitNodeLabel(CypherParser.NodeLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherParser#nodeId}.
	 * @param ctx the parse tree
	 */
	void enterNodeId(CypherParser.NodeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#nodeId}.
	 * @param ctx the parse tree
	 */
	void exitNodeId(CypherParser.NodeIdContext ctx);
}