// Generated from C:/Users/xc/Desktop/workspace/antlrDemo/src/main/java/com/fqq/antlr/SearchCondition.g4 by ANTLR 4.13.2
package com.fqq.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SearchConditionParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SearchConditionVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SearchConditionParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SearchConditionParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchConditionParser#orCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCondition(SearchConditionParser.OrConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchConditionParser#andCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCondition(SearchConditionParser.AndConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchConditionParser#atomCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomCondition(SearchConditionParser.AtomConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchConditionParser#fieldCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldCompare(SearchConditionParser.FieldCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchConditionParser#field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField(SearchConditionParser.FieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link SearchConditionParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SearchConditionParser.ValueContext ctx);
}