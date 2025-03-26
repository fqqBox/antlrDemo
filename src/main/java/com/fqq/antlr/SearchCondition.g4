grammar SearchCondition;

// 词法规则
OPERATOR: '大于' | '小于' | '等于' | '包含' | '不包含' | '开头是' | '开头不是' | '结尾是' | '结尾不是' | '大于等于' | '小于等于';
AND: '且';
OR: '或';
LPAREN: '(';
RPAREN: ')';
IDENTIFIER: [a-zA-Z_\u4e00-\u9fa5][a-zA-Z0-9_\u4e00-\u9fa5]*;
STRING: '"' ~["]* '"' | '\'' ~[']* '\'';
NUMBER: [0-9]+ ('.' [0-9]+)?;
WS: [ \t\r\n]+ -> skip;

// 语法规则
condition: orCondition EOF;
orCondition: andCondition (OR andCondition)*;
andCondition: atomCondition (AND atomCondition)*;
atomCondition: LPAREN orCondition RPAREN | fieldCompare;
fieldCompare: field OPERATOR value;
field: IDENTIFIER;
value: STRING | NUMBER;