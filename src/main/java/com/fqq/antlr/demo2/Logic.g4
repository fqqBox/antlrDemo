grammar Logic;

parse
    : expr EOF
    ;

expr
    : NOT expr          # notExpr
    | expr AND expr     # andExpr
    | expr OR expr      # orExpr
    | ID                # idExpr
    ;

AND : 'and';
OR  : 'or';
NOT : '!';

ID  : [a-zA-Z_][a-zA-Z0-9_]*; // 允许英文标识符
WS  : [ \t\r\n]+ -> skip;