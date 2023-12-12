parser grammar SQLMINIParser;

options {
    tokenVocab = SQLMINILexer;
    language = Java;
}

prog: ((query comentario? SALTO_LINEA?) | (comentario SALTO_LINEA?))*;
query: clausula_select clausula_from (clausula_where)? (clausula_order_by)?;

// SELECT
atributos_select: (ASTERISCO | (IDENTIFICADOR (COMA IDENTIFICADOR)*));
clausula_select: SELECT atributos_select;
// FROM
clausula_from: FROM IDENTIFICADOR;
// WHERE
clausula_where: WHERE condicion;
condicion: PARENTESIS_IZQUIERDO condicion PARENTESIS_DERECHO | condicion (AND | OR) condicion | IDENTIFICADOR comparadores value;
comparadores: IGUAL | OP_MAYOR_ESTRICTO | OP_MENOR_ESTRICTO | OP_MAYOR_IGUAL | OP_MENOR_IGUAL | OP_DISTINTO;
value: ENTRE_COMILLAS | REAL;
// ORDER BY
clausula_order_by: ORDER_BY IDENTIFICADOR (ASC | DESC)?;

//COMENTARIOS
comentario: COMENTARIOLINEA textos* FINAL_COMENTARIO_LINEA
            | COMENTARIOABRIR (textos|SALTO_LINEA)* COMENTARIOCERRAR;

textos: TEXTO_COMENTARIO_LINEA+|TEXTO_COMENTARIO_BLOQUE+;