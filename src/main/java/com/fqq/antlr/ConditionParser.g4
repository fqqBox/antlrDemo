
grammar ConditionParser;

condition : expr EOF;


expr : orExpr;

orExpr : andExpr (OR andExpr)*;

andExpr : atom (AND atom)*;

atom : '(' expr ')'
     | comparison;

comparison : ID OP value;

// 关键修改1：使用fragment优化匹配
fragment Greater : '大';
fragment Less : '小';
fragment Equal : '等';
fragment Contain : '包';
fragment Start : '开';
fragment End : '结';

OP : ( Greater Equal '于'    // 大于等于
      | Less Equal '于'     // 小于等于
      | Greater '于'        // 大于
      | Less '于'           // 小于
      | Equal '于'          // 等于
      | Start '头不是'      // 开头不是
      | End '尾不是'        // 结尾不是
      | Start '头是'        // 开头是
      | End '尾是'          // 结尾是
      | Contain '含'        // 包含
      | '不' Contain '含'   // 不包含
      );

value : NUMBER | STRING;

OR : '或' | '||';
AND : '且' | '&&';
ID : [\u4E00-\u9FA5a-zA-Z_]+;
NUMBER : '-'? [0-9]+ ( '.' [0-9]+ )?;
STRING : '\'' (~['\r\n] | '\\\'')* '\''
       | '"' (~["\r\n] | '\\"')* '"';

WS : [ \t\n\r]+ -> skip;