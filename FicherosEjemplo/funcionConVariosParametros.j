.class public FuncionConVariosParametros
.super java/lang/Object

.method public static funcion(III)V
  ; Cuerpo de la función que toma tres parámetros enteros
    .limit stack 100
    .limit locals 100

    ; Imprimir los parámetros 
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload_0
    invokevirtual java/io/PrintStream/println(I)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload_1
    invokevirtual java/io/PrintStream/println(I)V

    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload_2
    invokevirtual java/io/PrintStream/println(I)V

    return
.end method

.method public static main([Ljava/lang/String;)V
  ; Declaración de variables
    .limit stack 100
    .limit locals 100

    ; Cargar los valores de los parámetros en la pila
    bipush 14
    bipush 33
    bipush 69

    ; Llamar a la función pasando los parámetros
    invokestatic FuncionConVariosParametros/funcion(III)V

    return
.end method
