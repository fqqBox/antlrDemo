package com.fqq.antlr;

import com.fqq.antlr.gen1.ConditionParserBaseVisitor;
import com.fqq.antlr.gen1.ConditionParserLexer;
import com.fqq.antlr.gen1.ConditionParserParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.Map;

public class ConditionEvaluator {

    public static void main(String[] args) {
        Map<String, Object> dataRow = new HashMap<>();
        dataRow.put("年龄", 25);
        dataRow.put("姓名", "小明");

        // 测试1：简单条件
        testCondition("年龄 大于 20", dataRow); // 应返回true

        // 测试2：嵌套逻辑
        testCondition("(年龄 大于等于 25 且 姓名 等于 '小明') 或 年龄 小于 10", dataRow); // 应返回true

        // 测试3：字符串操作
        testCondition("姓名 开头是 '小'", dataRow); // 应返回true
    }

    private static void testCondition(String condition, Map<String, Object> row) {
        System.out.println("测试条件: " + condition);
        System.out.println("结果: " + evaluate(condition, row));
        System.out.println("----------");
    }

    public static boolean evaluate(String condition, Map<String, Object> row) {
        try {

            CharStream input = CharStreams.fromString(condition);
            ConditionParserLexer lexer = new ConditionParserLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ConditionParserParser parser = new ConditionParserParser(tokens);

            // 添加错误监听器（关键新增）
            parser.removeErrorListeners();
            parser.addErrorListener(new BaseErrorListener() {
                @Override
                public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                        int line, int charPositionInLine, String msg,
                                        RecognitionException e) {
                    // 在evaluate方法中添加：
                    tokens.fill();
                    for (Token token : tokens.getTokens()) {
                        System.out.printf("[%s] %s\n", ConditionParserLexer.VOCABULARY.getSymbolicName(token.getType()), token.getText());
                    }
                    throw new RuntimeException("语法错误 at line " + line + ":" + charPositionInLine + " - " + msg);
                }
            });

            ParseTree tree = parser.condition();
            return new ConditionVisitor(row).visit(tree);
        } catch (RuntimeException e) {
            System.err.println("解析失败: " + e.getMessage());
            return false;
        }
    }

    static class ConditionVisitor extends ConditionParserBaseVisitor<Boolean> {
        private final Map<String, Object> row;

        public ConditionVisitor(Map<String, Object> row) {
            this.row = row;
        }

        @Override
        public Boolean visitCondition(ConditionParserParser.ConditionContext ctx) {
            return visit(ctx.expr());
        }

        @Override
        public Boolean visitOrExpr(ConditionParserParser.OrExprContext ctx) {
            boolean result = visit(ctx.andExpr(0));
            for (int i = 1; i < ctx.andExpr().size(); i++) {
                result = result || visit(ctx.andExpr(i));
            }
            return result;
        }

        @Override
        public Boolean visitAndExpr(ConditionParserParser.AndExprContext ctx) {
            boolean result = visit(ctx.atom(0));
            for (int i = 1; i < ctx.atom().size(); i++) {
                result = result && visit(ctx.atom(i));
            }
            return result;
        }

        @Override
        public Boolean visitComparison(ConditionParserParser.ComparisonContext ctx) {
            String field = ctx.ID().getText();
            String op = ctx.OP().getText();
            Object value = parseValue(ctx.value());
            
            Object fieldValue = row.get(field);
            if (fieldValue == null) return false;
            
            return compare(fieldValue, op, value);
        }

        private Object parseValue(ConditionParserParser.ValueContext ctx) {
            if (ctx.NUMBER() != null) {
                String num = ctx.NUMBER().getText();
                if (num.contains(".")) return Double.parseDouble(num);
                return Long.parseLong(num);
            }
            String str = ctx.STRING().getText();
            return str.substring(1, str.length()-1);
        }

        private boolean compare(Object fieldValue, String op, Object value) {
            try {
                switch (op) {
                    case "等于":
                        return fieldValue.equals(value);
                    case "大于":
                        return compareNumbers(fieldValue, value) > 0;
                    case "小于":
                        return compareNumbers(fieldValue, value) < 0;
                    case "大于等于":
                        return compareNumbers(fieldValue, value) >= 0;
                    case "小于等于":
                        return compareNumbers(fieldValue, value) <= 0;
                    case "包含":
                        return fieldValue.toString().contains(value.toString());
                    case "不包含":
                        return !fieldValue.toString().contains(value.toString());
                    case "开头是":
                        return fieldValue.toString().startsWith(value.toString());
                    case "结尾是":
                        return fieldValue.toString().endsWith(value.toString());
                    case "开头不是":
                        return !fieldValue.toString().startsWith(value.toString());
                    case "结尾不是":
                        return !fieldValue.toString().endsWith(value.toString());
                    default:
                        return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }

        private int compareNumbers(Object a, Object b) {
            double numA = a instanceof Number ? ((Number) a).doubleValue() : Double.parseDouble(a.toString());
            double numB = b instanceof Number ? ((Number) b).doubleValue() : Double.parseDouble(b.toString());
            return Double.compare(numA, numB);
        }
    }
}