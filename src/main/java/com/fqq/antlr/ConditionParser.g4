grammar ConditionParser;

// 词法规则
OP: '大于' | '小于' | '等于' | '大于等于' | '小于等于' | '包含' | '不包含' | '开头是' | '结尾是' | '开头不是' | '结尾不是';
ID: [a-zA-Z_][a-zA-Z0-9_]* | [\u4e00-\u9fa5]+; // 支持中文作为字段名
NUMBER: [0-9]+('.' [0-9]+)?;
STRING: '\'' ~('\'')* '\'';
WS: [ \t\r\n]+ -> skip;

// 语法规则
condition: expr EOF;
expr: orExpr;
orExpr: andExpr ('或' andExpr)*;
andExpr: atom ('且' atom)*;
atom: '(' expr ')' | comparison;
comparison: ID OP value;
value: NUMBER | STRING;