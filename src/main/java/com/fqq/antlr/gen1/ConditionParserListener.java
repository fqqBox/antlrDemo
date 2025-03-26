// Generated from C:/Users/xc/Desktop/workspace/poitest/src/main/java/com/szsh/antlr/ConditionParser.g4 by ANTLR 4.13.2
package com.fqq.antlr.gen1;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ConditionParserParser}.
 */
public interface ConditionParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ConditionParserParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(ConditionParserParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionParserParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(ConditionParserParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ConditionParserParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionParserParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ConditionParserParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionParserParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(ConditionParserParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionParserParser#orExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(ConditionParserParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionParserParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(ConditionParserParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionParserParser#andExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(ConditionParserParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void enterAtom(ConditionParserParser.AtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionParserParser#atom}.
	 * @param ctx the parse tree
	 */
	void exitAtom(ConditionParserParser.AtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionParserParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(ConditionParserParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionParserParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(ConditionParserParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link ConditionParserParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(ConditionParserParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ConditionParserParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(ConditionParserParser.ValueContext ctx);
}