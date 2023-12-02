.class public LlamarFuncion
.super java/lang/Object

.method public static funcion()V
  ; Cuerpo de la función
    .limit stack 100
    .limit locals 100

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "Llamando a funcion"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    return
.end method

.method public static main([Ljava/lang/String;)V
  ; Declaración de variables
    .limit stack 100
    .limit locals 100

    ; Llamar a la función
    invokestatic LlamarFuncion/funcion()V

    return
.end method
