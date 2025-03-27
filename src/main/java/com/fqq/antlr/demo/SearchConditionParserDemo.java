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
        rowData.put("Age", 253);
        rowData.put("Name", "小明");

        // 示例搜索条件，使用英文操作符和逻辑连接词
        String condition = "(Age GreaterThan 20 AND Age LessThan 30) OR Name Equal '小明'";

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