// Generated from C:/Users/samsa/Documents/GitHub/simpledb-graph-query/grammar/Cypher.g4 by ANTLR 4.13.1
package graph.grammar;
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
	 * Visit a parse tree produced by {@link CypherParser#returnPattern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnPattern(CypherParser.ReturnPatternContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherParser#returnAll}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnAll(CypherParser.ReturnAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherParser#returnItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnItem(CypherParser.ReturnItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty(CypherParser.PropertyContext ctx);
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
	 * Visit a parse tree produced by {@link CypherParser#nodeLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeLabel(CypherParser.NodeLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link CypherParser#nodeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodeId(CypherParser.NodeIdContext ctx);
}