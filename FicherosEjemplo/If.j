.class public If
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
  ; Declaración de variables
    .limit stack 100
    .limit locals 100

    ; Asignar valores a las variables
    ldc 2  ; Primer número
    istore_0

    ldc 3  ; Segundo número
    istore_1

    ; Comparar los números e imprimir mensajes
    iload_0
    iload_1
    if_icmplt menor
    if_icmpgt mayor

    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "Los números son iguales"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    goto fin

menor:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "El primer número es menor"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    goto fin

mayor:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "El primer número es mayor"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    goto fin

fin:
    return
.end method

