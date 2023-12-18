parser grammar linguineParser;

options {
	tokenVocab = linguineLexer;
	language = Java;
}

program: (
		(sentencia PUNTO_Y_COMA comentario? SALTO_LINEA?)
		| (comentario SALTO_LINEA?)
	)*;

sentencia:
	asignacion
	| sentencia_while
	| sentencia_for
	| declaracion_funcion
	| llamada_funcion
	| sentencia_show
	| sentencia_if
	| sentencia_match
	| expresion;

arreglo: CORCHETE_IZQUIERDO ((REAL | BOOLEANO | LITERAL_CADENA) (COMA (REAL | BOOLEANO | LITERAL_CADENA))*) CORCHETE_DERECHO;

mapa: LLAVE_IZQUIERDA ((REAL|LITERAL_CADENA) DOS_PUNTOS (REAL | BOOLEANO | LITERAL_CADENA))
	(SALTO_LINEA? COMA SALTO_LINEA?(REAL|LITERAL_CADENA) DOS_PUNTOS 
	(REAL | BOOLEANO | LITERAL_CADENA))* LLAVE_DERECHA;

asignacion: LET? IDENTIFICADOR IGUAL (expresion | sentencia_if | cortar_cadena | arreglo | mapa);

expresion:
	REAL #real
	| BOOLEANO #booleano
	| LITERAL_CADENA #cadena
	| IDENTIFICADOR #variable
	| expresion OP_MULT expresion	# mult
	| expresion OP_DIV expresion	# div
	| expresion OP_SUMA expresion	# suma
	| expresion OP_RESTA expresion	# resta
	| condicion #cond
	| PARENTESIS_IZQUIERDO expresion PARENTESIS_DERECHO #entre_parentesis
	| llamada_funcion #llamada;

condicion: (REAL | IDENTIFICADOR) (
		OP_MAYOR_ESTRICTO
		| OP_MENOR_ESTRICTO
		| OP_MAYOR_IGUAL
		| OP_MENOR_IGUAL
		| OP_DISTINTO
		| OP_EQUIVALENCIA
	) (REAL | IDENTIFICADOR);

cortar_cadena: LITERAL_CADENA CORCHETE_IZQUIERDO REAL DOS_PUNTOS REAL CORCHETE_DERECHO| IDENTIFICADOR CORCHETE_IZQUIERDO REAL DOS_PUNTOS REAL CORCHETE_DERECHO;

sentencia_if:
	IF PARENTESIS_IZQUIERDO condicion PARENTESIS_DERECHO THEN LLAVE_IZQUIERDA (
		program
	) LLAVE_DERECHA (
		ELSE LLAVE_IZQUIERDA (program) LLAVE_DERECHA
	)?;

sentencia_while:
	WHILE PARENTESIS_IZQUIERDO condicion PARENTESIS_DERECHO DO LLAVE_IZQUIERDA (
		program
	) LLAVE_DERECHA;

sentencia_for:
	FOR PARENTESIS_IZQUIERDO asignacion PUNTO_Y_COMA condicion PUNTO_Y_COMA asignacion
		PARENTESIS_DERECHO LLAVE_IZQUIERDA (program) LLAVE_DERECHA;

declaracion_funcion:
	FUN IDENTIFICADOR PARENTESIS_IZQUIERDO parametros PARENTESIS_DERECHO FLECHA_DERECHA (
		program | expresion
	);
parametros: (IDENTIFICADOR (COMA IDENTIFICADOR)*)?;

llamada_funcion:
	IDENTIFICADOR PARENTESIS_IZQUIERDO argumentos PARENTESIS_DERECHO;
argumentos: (expresion (COMA expresion)*)?;

sentencia_match: MATCH IDENTIFICADOR WITH casos_match;
casos_match: (SALTO_LINEA? caso_match)+;
valores_match: expresion | INTERROGACION;
caso_match:
	SEPARADOR_MATCH valores_match FLECHA_DERECHA (
		expresion
		| LITERAL_CADENA
	);
sentencia_show:
	SHOW PARENTESIS_IZQUIERDO expresion PARENTESIS_DERECHO;

//COMENTARIOS
comentario:
	COMENTARIOLINEA textos* FINAL_COMENTARIO_LINEA
	| COMENTARIOABRIR (textos | SALTO_LINEA)* COMENTARIOCERRAR;

textos: TEXTO_COMENTARIO_LINEA+ | TEXTO_COMENTARIO_BLOQUE+;