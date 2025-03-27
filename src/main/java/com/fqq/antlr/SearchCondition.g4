grammar SearchCondition;

// 词法规则
OPERATOR: 'GreaterThan' | 'LessThan' | 'Equal' | 'Contains' | 'NotContains' | 'StartsWith' | 'NotStartsWith' | 'EndsWith' | 'NotEndsWith' | 'GreaterThanOrEqual' | 'LessThanOrEqual';
AND: 'AND';
OR: 'OR';
LPAREN: '(';
RPAREN: ')';
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
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