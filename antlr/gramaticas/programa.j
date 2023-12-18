.class public LinguineJasmin
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit stack 100
    .limit locals 100

ldc 5.0
fstore 0
ldc 3.0
fstore 1
fload 0
fload 1
fcmpg
ifge else
fload 0
fload 1
fadd
fload 0
fload 1
fsub
fmul
goto fin_comparacion
else:
fload 0
fload 1
fdiv
fin_comparacion:
fstore 2
return

.end method