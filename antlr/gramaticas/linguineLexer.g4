lexer grammar linguineLexer;

// Reglas para palabras clave y operadores
LET: 'let'|'LET';
IF: 'if'|'IF';
THEN: 'then'|'THEN';
ELSE: 'else'|'ELSE';
FUN: 'fun'|'FUN';
MATCH: 'match'|'MATCH';
WITH: 'with'|'WITH';
SHOW: 'show'|'SHOW';
PARENTESIS_IZQUIERDO: '(';
PARENTESIS_DERECHO: ')';
SEPARADOR_MATCH: '|';
INTERROGACION: '?';
FLECHA_DERECHA: '->';
LITERAL_CADENA: '"' .*? '"';
COMA: ',';
IGUAL: '=';
PUNTO_Y_COMA: ';';
OP_SUMA: '+';
OP_RESTA: '-';
OP_MULT: '*';
OP_DIV: '/';
OP_MENOR_ESTRICTO: '<';
OP_MAYOR_ESTRICTO: '>';
OP_MENOR_IGUAL: '<=';
OP_MAYOR_IGUAL: '>=';
OP_DISTINTO: '!=';

// Regla para identificadores
IDENTIFICADOR: [a-zA-Z]+ [a-zA-Z0-9_]*;

// Regla para números reales
REAL: [0-9]+('.'[0-9]+)?;

// Espacios en blanco y salto de línea
SALTO_LINEA : [\r\n]+;
ESPACIOS: [ \t]+ -> skip;

//Comentarios
COMENTARIOLINEA: '%%' -> pushMode(COMENTARIO_LINEA_MODE);
COMENTARIOABRIR: '<*' -> pushMode(COMENTARIO_BLOQUE_MODE);

mode COMENTARIO_LINEA_MODE;
FINAL_COMENTARIO_LINEA: '\r\n' ->popMode;
TEXTO_COMENTARIO_LINEA:.+?;

mode COMENTARIO_BLOQUE_MODE;
COMENTARIOCERRAR: '*>' -> popMode;
TEXTO_COMENTARIO_BLOQUE:.+?;