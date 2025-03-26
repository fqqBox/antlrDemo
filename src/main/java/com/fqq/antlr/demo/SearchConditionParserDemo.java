package com.fqq.antlr.demo;

import com.fqq.antlr.SearchConditionLexer;
import com.fqq.antlr.SearchConditionParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import java.util.HashMap;
import java.util.Map;

public class SearchConditionParserDemo {
    public static void main(String[] args) {
        // 示例行数据
        Map<String, Object> rowData = new HashMap<>();
        rowData.put("年龄", 25);
        rowData.put("姓名", "小明");

        // 示例搜索条件
        String condition = "(年龄 大于 20 且 年龄 小于 30) 或 姓名 等于 小明";

        // 创建词法分析器
        SearchConditionLexer lexer = new SearchConditionLexer(CharStreams.fromString(condition));
        // 创建词法单元流
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // 创建语法分析器
        SearchConditionParser parser = new SearchConditionParser(tokens);
        // 解析条件
        SearchConditionParser.ConditionContext tree = parser.condition();

        // 创建访问器
        SearchConditionVisitor visitor = new SearchConditionVisitor(rowData);
        // 访问解析树
        boolean result = visitor.visit(tree);

        System.out.println("解析结果: " + result);
    }
}    