.class public FuncionConParametro
.super java/lang/Object

.method public static funcion(I)V
  ; Cuerpo de la función que toma un parámetro entero
    .limit stack 100
    .limit locals 100

    ; Imprimir el parámetro
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload_0
    invokevirtual java/io/PrintStream/println(I)V

    return
.end method

.method public static main([Ljava/lang/String;)V
  ; Declaración de variables
    .limit stack 100
    .limit locals 100

    ; Cargar el valor del parámetro en la pila 
    bipush 14
    ; Llamar a la función pasando el parámetro
    invokestatic FuncionConParametro/funcion(I)V

    return
.end method
