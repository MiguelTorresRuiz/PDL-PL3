.class public FuncionConRetorno
.super java/lang/Object

.method public static funcion()I
  ; Cuerpo de la función
    .limit stack 100
    .limit locals 100

    ldc 33  ; Valor de retorno 
    ireturn  ; Devolver el valor entero
.end method

.method public static main([Ljava/lang/String;)V
  ; Declaración de variables
    .limit stack 100
    .limit locals 100

    ; Llamar a la función con retorno
    invokestatic FuncionConRetorno/funcion()I
    istore_1  ; Almacenar el resultado en una variable local

    ; Imprimir el resultado 
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload_1
    invokevirtual java/io/PrintStream/println(I)V

    ; Resto del código principal (si lo hay)

    return
.end method
