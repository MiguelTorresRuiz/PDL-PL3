lexer grammar SQLMINILexer;

// Reglas para palabras clave, operadores y símbolos
SELECT: 'SELECT'|'select';
FROM: 'FROM'|'from';
WHERE: 'WHERE'|'where';
ORDER_BY: 'ORDER BY'|'order by';
AND: 'AND'|'and';
OR: 'OR'|'or';
ASC: 'ASC'|'asc';
DESC: 'DESC'|'desc';
OP_MENOR_ESTRICTO: '<';
OP_MAYOR_ESTRICTO: '>';
OP_MENOR_IGUAL: '<=';
OP_MAYOR_IGUAL: '>=';
OP_DISTINTO: '!=';
IGUAL: '=';
PARENTESIS_IZQUIERDO: '(';
PARENTESIS_DERECHO: ')';
ASTERISCO: '*';
COMA: ',';

// Regla para identificadores (nombres de columnas, tablas, valores, etc.)
IDENTIFICADOR: [a-zA-Z]+ [a-zA-Z_]*;

// Regla para literales de cadena (por ejemplo, 'Electronics')
ENTRE_COMILLAS: '\'' ~('\'')* '\'';

// Regla para números reales
REAL: [0-9]+('.'[0-9]+)?;

// Espacios en blanco y salto de línea
SALTO_LINEA : [\r\n]+;
ESPACIO: [ \t]+ -> skip;

//Comentarios
COMENTARIOLINEA: '--' -> pushMode(COMENTARIO_LINEA_MODE);
COMENTARIOABRIR: '/*' -> pushMode(COMENTARIO_BLOQUE_MODE);

mode COMENTARIO_LINEA_MODE;
FINAL_COMENTARIO_LINEA: '\r\n' ->popMode;
TEXTO_COMENTARIO_LINEA:.+?;

mode COMENTARIO_BLOQUE_MODE;
COMENTARIOCERRAR: '*/' -> popMode;
TEXTO_COMENTARIO_BLOQUE:.+?;