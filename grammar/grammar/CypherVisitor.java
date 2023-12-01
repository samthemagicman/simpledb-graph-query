// Generated from .//Cypher.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CypherParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CypherVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CypherParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(CypherParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherParser#createCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateCommand(CypherParser.CreateCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherParser#createCommandPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateCommandPattern(CypherParser.CreateCommandPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherParser#createRelationshipPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateRelationshipPattern(CypherParser.CreateRelationshipPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherParser#createNodePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateNodePattern(CypherParser.CreateNodePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherParser#nodeProperties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeProperties(CypherParser.NodePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherParser#matchAndReturnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchAndReturnClause(CypherParser.MatchAndReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherParser#matchClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchClause(CypherParser.MatchClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherParser#returnClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnClause(CypherParser.ReturnClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnAll}
	 * labeled alternative in {@link CypherParser#returnPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnAll(CypherParser.ReturnAllContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnSingleNode}
	 * labeled alternative in {@link CypherParser#returnPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnSingleNode(CypherParser.ReturnSingleNodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnMultipleNodes}
	 * labeled alternative in {@link CypherParser#returnPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnMultipleNodes(CypherParser.ReturnMultipleNodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherParser#returnItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnItem(CypherParser.ReturnItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherParser#pattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern(CypherParser.PatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherParser#relationshipPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationshipPattern(CypherParser.RelationshipPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherParser#nodePattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodePattern(CypherParser.NodePatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(CypherParser.PairContext ctx);
}