// Generated from ./Cypher.g4 by ANTLR 4.13.1
package graph.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CypherParser}.
 */
public interface CypherListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CypherParser#multiQuery}.
	 * @param ctx the parse tree
	 */
	void enterMultiQuery(CypherParser.MultiQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#multiQuery}.
	 * @param ctx the parse tree
	 */
	void exitMultiQuery(CypherParser.MultiQueryContext ctx);
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
	 * Enter a parse tree produced by the {@code createNodeRelationship}
	 * labeled alternative in {@link CypherParser#createCommandPattern}.
	 * @param ctx the parse tree
	 */
	void enterCreateNodeRelationship(CypherParser.CreateNodeRelationshipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createNodeRelationship}
	 * labeled alternative in {@link CypherParser#createCommandPattern}.
	 * @param ctx the parse tree
	 */
	void exitCreateNodeRelationship(CypherParser.CreateNodeRelationshipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createNodeInverseRelationship}
	 * labeled alternative in {@link CypherParser#createCommandPattern}.
	 * @param ctx the parse tree
	 */
	void enterCreateNodeInverseRelationship(CypherParser.CreateNodeInverseRelationshipContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createNodeInverseRelationship}
	 * labeled alternative in {@link CypherParser#createCommandPattern}.
	 * @param ctx the parse tree
	 */
	void exitCreateNodeInverseRelationship(CypherParser.CreateNodeInverseRelationshipContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createSingleNode}
	 * labeled alternative in {@link CypherParser#createCommandPattern}.
	 * @param ctx the parse tree
	 */
	void enterCreateSingleNode(CypherParser.CreateSingleNodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createSingleNode}
	 * labeled alternative in {@link CypherParser#createCommandPattern}.
	 * @param ctx the parse tree
	 */
	void exitCreateSingleNode(CypherParser.CreateSingleNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherParser#nodeRelationshipPattern}.
	 * @param ctx the parse tree
	 */
	void enterNodeRelationshipPattern(CypherParser.NodeRelationshipPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#nodeRelationshipPattern}.
	 * @param ctx the parse tree
	 */
	void exitNodeRelationshipPattern(CypherParser.NodeRelationshipPatternContext ctx);
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
	 * Enter a parse tree produced by {@link CypherParser#nodeProperties}.
	 * @param ctx the parse tree
	 */
	void enterNodeProperties(CypherParser.NodePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#nodeProperties}.
	 * @param ctx the parse tree
	 */
	void exitNodeProperties(CypherParser.NodePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherParser#matchAndReturnCommand}.
	 * @param ctx the parse tree
	 */
	void enterMatchAndReturnCommand(CypherParser.MatchAndReturnCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#matchAndReturnCommand}.
	 * @param ctx the parse tree
	 */
	void exitMatchAndReturnCommand(CypherParser.MatchAndReturnCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherParser#deleteCommand}.
	 * @param ctx the parse tree
	 */
	void enterDeleteCommand(CypherParser.DeleteCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#deleteCommand}.
	 * @param ctx the parse tree
	 */
	void exitDeleteCommand(CypherParser.DeleteCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherParser#matchCommand}.
	 * @param ctx the parse tree
	 */
	void enterMatchCommand(CypherParser.MatchCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#matchCommand}.
	 * @param ctx the parse tree
	 */
	void exitMatchCommand(CypherParser.MatchCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CypherParser#returnCommand}.
	 * @param ctx the parse tree
	 */
	void enterReturnCommand(CypherParser.ReturnCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#returnCommand}.
	 * @param ctx the parse tree
	 */
	void exitReturnCommand(CypherParser.ReturnCommandContext ctx);
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
	 * Enter a parse tree produced by {@link CypherParser#matchPattern}.
	 * @param ctx the parse tree
	 */
	void enterMatchPattern(CypherParser.MatchPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link CypherParser#matchPattern}.
	 * @param ctx the parse tree
	 */
	void exitMatchPattern(CypherParser.MatchPatternContext ctx);
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