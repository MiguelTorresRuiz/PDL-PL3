.class public If
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit stack 2
    .limit locals 2

    ; Definir dos variables
    ldc 5   ; Carga el valor 5
    istore_0  ; Almacena el valor 5 en la variable local 0
    ldc 3   ; Carga el valor 3
    istore_1  ; Almacena el valor 3 en la variable local 1

    ; Comparar los números
    iload_0  ; Carga el valor de la variable local 0 (valor 5)
    iload_1  ; Carga el valor de la variable local 1 (valor 3)
    if_icmpgt mayorQue  ; Compara los valores, si el primero es mayor que el segundo, salta a la etiqueta 'mayorQue'

    ; Si el segundo numero es mayor o igual que el primero
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "El segundo numero es mayor o igual que el primero"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    goto fin  ; Salta a la etiqueta 'fin'

    ; Etiqueta si el primer numero es mayor que el segundo
    mayorQue:
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "El primer numero es mayor que el segundo"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

    ; Etiqueta de fin
    fin:
    return  ; Termina el método
.end method
