// Generated from C:/Users/xc/Desktop/workspace/antlrDemo/src/main/java/com/fqq/antlr/SearchCondition.g4 by ANTLR 4.13.2
package com.fqq.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SearchConditionParser}.
 */
public interface SearchConditionListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SearchConditionParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SearchConditionParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchConditionParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SearchConditionParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchConditionParser#orCondition}.
	 * @param ctx the parse tree
	 */
	void enterOrCondition(SearchConditionParser.OrConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchConditionParser#orCondition}.
	 * @param ctx the parse tree
	 */
	void exitOrCondition(SearchConditionParser.OrConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchConditionParser#andCondition}.
	 * @param ctx the parse tree
	 */
	void enterAndCondition(SearchConditionParser.AndConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchConditionParser#andCondition}.
	 * @param ctx the parse tree
	 */
	void exitAndCondition(SearchConditionParser.AndConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchConditionParser#atomCondition}.
	 * @param ctx the parse tree
	 */
	void enterAtomCondition(SearchConditionParser.AtomConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchConditionParser#atomCondition}.
	 * @param ctx the parse tree
	 */
	void exitAtomCondition(SearchConditionParser.AtomConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchConditionParser#fieldCompare}.
	 * @param ctx the parse tree
	 */
	void enterFieldCompare(SearchConditionParser.FieldCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchConditionParser#fieldCompare}.
	 * @param ctx the parse tree
	 */
	void exitFieldCompare(SearchConditionParser.FieldCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchConditionParser#field}.
	 * @param ctx the parse tree
	 */
	void enterField(SearchConditionParser.FieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchConditionParser#field}.
	 * @param ctx the parse tree
	 */
	void exitField(SearchConditionParser.FieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link SearchConditionParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SearchConditionParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SearchConditionParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SearchConditionParser.ValueContext ctx);
}