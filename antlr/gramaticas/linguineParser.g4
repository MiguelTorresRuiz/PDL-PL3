parser grammar linguineParser;

options {
    tokenVocab = linguineLexer;
    language = Java;
}

program: ((sentencia PUNTO_Y_COMA comentario? SALTO_LINEA?) | (comentario SALTO_LINEA?))*;

sentencia: asignacion | declaracion_funcion | llamada_funcion | sentencia_show | sentencia_if | sentencia_match;

asignacion: LET IDENTIFICADOR IGUAL (expresion | sentencia_if);
expresion: REAL | IDENTIFICADOR | expresion (OP_SUMA | OP_RESTA | OP_MULT | OP_DIV | OP_MAYOR_ESTRICTO | OP_MENOR_ESTRICTO | OP_MAYOR_IGUAL | OP_MENOR_IGUAL | OP_DISTINTO) expresion | PARENTESIS_IZQUIERDO expresion PARENTESIS_DERECHO | llamada_funcion;

sentencia_if: IF expresion THEN (sentencia | expresion) (ELSE (sentencia | expresion))?;

declaracion_funcion: FUN IDENTIFICADOR PARENTESIS_IZQUIERDO parametros PARENTESIS_DERECHO FLECHA_DERECHA (sentencia | expresion);
parametros: (expresion (COMA expresion)*)?;

llamada_funcion: IDENTIFICADOR PARENTESIS_IZQUIERDO argumentos PARENTESIS_DERECHO;
argumentos: (expresion (COMA expresion)*)?;

sentencia_match: MATCH IDENTIFICADOR WITH casos_match;
casos_match: (SALTO_LINEA? caso_match)+;
valores_match: expresion | INTERROGACION;
caso_match: SEPARADOR_MATCH valores_match FLECHA_DERECHA (expresion | LITERAL_CADENA);
sentencia_show: SHOW PARENTESIS_IZQUIERDO expresion PARENTESIS_DERECHO;


//COMENTARIOS
comentario: COMENTARIOLINEA textos* FINAL_COMENTARIO_LINEA
            | COMENTARIOABRIR (textos|SALTO_LINEA)* COMENTARIOCERRAR;

textos: TEXTO_COMENTARIO_LINEA+|TEXTO_COMENTARIO_BLOQUE+;