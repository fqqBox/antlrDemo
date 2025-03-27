package com.fqq.antlr.demo2;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.HashMap;
import java.util.Map;

public class LogicEvaluator {
    public static void main(String[] args) {
        String input = "!A and B or C"; // 示例输入表达式

        // 创建词法分析器
        LogicLexer lexer = new LogicLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LogicParser parser = new LogicParser(tokens);

        // 定义变量环境（假设A为true，B为false，C为true）
        Map<String, Boolean> env = new HashMap<>();
        env.put("A", true);
        env.put("B", false);
        env.put("C", true);

        // 解析表达式并计算结果
        ParseTree tree = parser.parse();
        LogicBaseVisitor<Boolean> visitor = new Evaluator(env);
        boolean result = visitor.visit(tree);

        // 输出结果
        System.out.println("表达式: " + input);
        System.out.println("结果: " + result);
    }
}

class Evaluator extends LogicBaseVisitor<Boolean> {
    private final Map<String, Boolean> env;

    public Evaluator(Map<String, Boolean> env) {
        this.env = env;
    }

    // 新增：覆盖 parse 节点的访问器
    @Override
    public Boolean visitParse(LogicParser.ParseContext ctx) {
        return visit(ctx.expr()); // 直接返回 expr 的计算结果
    }

    @Override
    public Boolean visitNotExpr(LogicParser.NotExprContext ctx) {
        Boolean childResult = visit(ctx.expr());
        if (childResult == null) {
            throw new RuntimeException("NOT操作符的子表达式结果为null");
        }
        return !childResult;
    }

    @Override
    public Boolean visitAndExpr(LogicParser.AndExprContext ctx) {
        Boolean left = visit(ctx.expr(0));
        Boolean right = visit(ctx.expr(1));
        if (left == null || right == null) {
            throw new RuntimeException("AND操作符的子表达式结果为null");
        }
        return left && right;
    }

    @Override
    public Boolean visitOrExpr(LogicParser.OrExprContext ctx) {
        Boolean left = visit(ctx.expr(0));
        Boolean right = visit(ctx.expr(1));
        if (left == null || right == null) {
            throw new RuntimeException("OR操作符的子表达式结果为null");
        }
        return left || right;
    }

    @Override
    public Boolean visitIdExpr(LogicParser.IdExprContext ctx) {
        String varName = ctx.ID().getText();
        Boolean value = env.get(varName);
        if (value == null) {
            throw new RuntimeException("变量未定义: " + varName);
        }
        return value;
    }
}