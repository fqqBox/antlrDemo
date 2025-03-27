// Generated from C:/Users/xc/Desktop/workspace/antlrDemo/src/main/java/com/fqq/antlr/demo2/Logic.g4 by ANTLR 4.13.2
package com.fqq.antlr.demo2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LogicParser}.
 */
public interface LogicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LogicParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(LogicParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link LogicParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(LogicParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link LogicParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(LogicParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link LogicParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(LogicParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link LogicParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(LogicParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link LogicParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(LogicParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link LogicParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(LogicParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link LogicParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(LogicParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link LogicParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(LogicParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link LogicParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(LogicParser.AndExprContext ctx);
}