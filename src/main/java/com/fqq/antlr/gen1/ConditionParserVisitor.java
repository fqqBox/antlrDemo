// Generated from C:/Users/xc/Desktop/workspace/antlrDemo/src/main/java/com/fqq/antlr/ConditionParser.g4 by ANTLR 4.13.2
package com.fqq.antlr.gen1;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ConditionParserParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ConditionParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ConditionParserParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(ConditionParserParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConditionParserParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ConditionParserParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConditionParserParser#orExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(ConditionParserParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConditionParserParser#andExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(ConditionParserParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConditionParserParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(ConditionParserParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConditionParserParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(ConditionParserParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConditionParserParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ConditionParserParser.ValueContext ctx);
}