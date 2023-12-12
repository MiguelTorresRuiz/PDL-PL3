grammar Expr;
prog: ((expr|asignacion) NEWLINE)* ;
asignacion: VARIABLE ':=' expr;
expr: expr ('*'|'/') expr
    | expr ('+'|'-') expr
    |expr ('<'|'>'|'=='|'!=') expr
    | INT
    | '(' expr ')'
    | OPERACION '(' (expr(','expr)*)? ')'
    | VARIABLE
    ;
OPERACION: 'SELECT'|'sen'|'tan';
NEWLINE : [\r\n]+;
INT     : [0-9]+;
VARIABLE: [a-zA-Z]+;