.class public While
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
  ; Declaración de variables
    .limit stack 100
    .limit locals 100

    ; Inicializar la variable de control del bucle (i = 1)
    ldc 1
    istore_0

    ; Inicio del bucle while
    while_start:
        ; Cargar la variable de control en la pila
        iload_0

        ; Cargar el límite superior del bucle en la pila
        ldc 8

        ; Comparar i con el límite superior
        if_icmpgt while_end

        ; Cuerpo del bucle: Imprimir el valor de i
        getstatic java/lang/System/out Ljava/io/PrintStream;
        iload_0

        invokevirtual java/io/PrintStream/print(I)V
        getstatic java/lang/System/out Ljava/io/PrintStream;
        ldc " "
        invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V
   
        
        ; Incrementar la variable de control (i++)
        iinc 0 1

        ; Salto de vuelta al inicio del bucle
        goto while_start

    ; Fin del bucle while
    while_end:
    return
.end method
