// Generated from .//Cypher.g4 by ANTLR 4.13.1
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
	 * Enter a parse tree produced by {@link CypherParser#createCommand}.
	 * @param ctx the parse tree
	 */
	void enterCreateCommand(CypherParser.CreateCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#createCommand}.
	 * @param ctx the parse tree
	 */
	void exitCreateCommand(CypherParser.CreateCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherParser#createCommandPattern}.
	 * @param ctx the parse tree
	 */
	void enterCreateCommandPattern(CypherParser.CreateCommandPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#createCommandPattern}.
	 * @param ctx the parse tree
	 */
	void exitCreateCommandPattern(CypherParser.CreateCommandPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherParser#createCommandProperties}.
	 * @param ctx the parse tree
	 */
	void enterCreateCommandProperties(CypherParser.CreateCommandPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#createCommandProperties}.
	 * @param ctx the parse tree
	 */
	void exitCreateCommandProperties(CypherParser.CreateCommandPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherParser#matchAndReturnClause}.
	 * @param ctx the parse tree
	 */
	void enterMatchAndReturnClause(CypherParser.MatchAndReturnClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#matchAndReturnClause}.
	 * @param ctx the parse tree
	 */
	void exitMatchAndReturnClause(CypherParser.MatchAndReturnClauseContext ctx);
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
	 * Enter a parse tree produced by the {@code returnAll}
	 * labeled alternative in {@link CypherParser#returnPattern}.
	 * @param ctx the parse tree
	 */
	void enterReturnAll(CypherParser.ReturnAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnAll}
	 * labeled alternative in {@link CypherParser#returnPattern}.
	 * @param ctx the parse tree
	 */
	void exitReturnAll(CypherParser.ReturnAllContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnSingleNode}
	 * labeled alternative in {@link CypherParser#returnPattern}.
	 * @param ctx the parse tree
	 */
	void enterReturnSingleNode(CypherParser.ReturnSingleNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnSingleNode}
	 * labeled alternative in {@link CypherParser#returnPattern}.
	 * @param ctx the parse tree
	 */
	void exitReturnSingleNode(CypherParser.ReturnSingleNodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnMultipleNodes}
	 * labeled alternative in {@link CypherParser#returnPattern}.
	 * @param ctx the parse tree
	 */
	void enterReturnMultipleNodes(CypherParser.ReturnMultipleNodesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnMultipleNodes}
	 * labeled alternative in {@link CypherParser#returnPattern}.
	 * @param ctx the parse tree
	 */
	void exitReturnMultipleNodes(CypherParser.ReturnMultipleNodesContext ctx);
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
	 * Enter a parse tree produced by {@link CypherParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(CypherParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(CypherParser.PairContext ctx);
}