package com.fqq.antlr.demo;

import com.fqq.antlr.SearchConditionBaseVisitor;
import com.fqq.antlr.SearchConditionParser;
import org.antlr.v4.runtime.tree.ParseTree;
import java.util.HashMap;
import java.util.Map;

public class SearchConditionVisitor extends SearchConditionBaseVisitor<Boolean> {
    private Map<String, Object> rowData;

    public SearchConditionVisitor(Map<String, Object> rowData) {
        this.rowData = rowData;
    }

    @Override
    public Boolean visitCondition(SearchConditionParser.ConditionContext ctx) {
        return visit(ctx.orCondition());
    }

    @Override
    public Boolean visitOrCondition(SearchConditionParser.OrConditionContext ctx) {
        boolean result = visit(ctx.andCondition(0));
        for (int i = 1; i < ctx.andCondition().size(); i++) {
            result = result || visit(ctx.andCondition(i));
        }
        return result;
    }

    @Override
    public Boolean visitAndCondition(SearchConditionParser.AndConditionContext ctx) {
        boolean result = visit(ctx.atomCondition(0));
        for (int i = 1; i < ctx.atomCondition().size(); i++) {
            result = result && visit(ctx.atomCondition(i));
        }
        return result;
    }

    @Override
    public Boolean visitAtomCondition(SearchConditionParser.AtomConditionContext ctx) {
        if (ctx.LPAREN() != null) {
            return visit(ctx.orCondition());
        } else {
            return visit(ctx.fieldCompare());
        }
    }

    @Override
    public Boolean visitFieldCompare(SearchConditionParser.FieldCompareContext ctx) {
        String fieldName = ctx.field().getText();
        String operator = null;
        if (ctx.OPERATOR() != null) {
            operator = ctx.OPERATOR().getText();
        } else {
            return false; // 如果操作符为空，直接返回 false
        }
        String valueText = ctx.value().getText();

        Object fieldValue = rowData.get(fieldName);
        if (fieldValue == null) {
            return false;
        }

        if (fieldValue instanceof String) {
            String strValue = valueText.replaceAll("^['\"]|['\"]$", "");
            switch (operator) {
                case "等于":
                    return fieldValue.equals(strValue);
                case "包含":
                    return ((String) fieldValue).contains(strValue);
                case "不包含":
                    return !((String) fieldValue).contains(strValue);
                case "开头是":
                    return ((String) fieldValue).startsWith(strValue);
                case "开头不是":
                    return !((String) fieldValue).startsWith(strValue);
                case "结尾是":
                    return ((String) fieldValue).endsWith(strValue);
                case "结尾不是":
                    return !((String) fieldValue).endsWith(strValue);
            }
        } else if (fieldValue instanceof Number) {
            double numValue = Double.parseDouble(valueText);
            switch (operator) {
                case "大于":
                    return ((Number) fieldValue).doubleValue() > numValue;
                case "小于":
                    return ((Number) fieldValue).doubleValue() < numValue;
                case "等于":
                    return ((Number) fieldValue).doubleValue() == numValue;
                case "大于等于":
                    return ((Number) fieldValue).doubleValue() >= numValue;
                case "小于等于":
                    return ((Number) fieldValue).doubleValue() <= numValue;
            }
        }
        return false;
    }
}