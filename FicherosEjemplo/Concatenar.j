.class public Concatenar
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
  .limit stack 100
  .limit locals 100

  getstatic java/lang/System/out Ljava/io/PrintStream;
  ldc "El numero es "
  ldc 33

  ;Convierte el número en una cadena usando 'invokestatic'
  invokestatic java/lang/String.valueOf(I)Ljava/lang/String;

  ;Llama al método concat
  invokevirtual java/lang/String/concat(Ljava/lang/String;)Ljava/lang/String;

  invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
return

.end method