import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class AnalizadorLinguine {

    // Método de entrada por defecto
    public static void main(String[] args) throws Exception {
        // Inicializamos la entrada de datos
        String inputFile = null;
        if (args.length > 0)
            inputFile = args[0];

        // Inicializamos los streams de datos
        InputStream is = System.in;
        if (inputFile != null)
            is = new FileInputStream(inputFile);

        // Inicializamos ANTLR con el fichero
        ANTLRInputStream input = new ANTLRInputStream(is);

        // Conectamos con el lexer
        linguineLexer lexer = new linguineLexer(input);

        // Inicializamos el canal de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Preparamos el parser
        linguineParser parser = new linguineParser(tokens);
        parser.setBuildParseTree(true);

        // Generar árbol a partir del axioma de la gramática
        ParseTree tree = parser.program();

        // COMPILAR A JASMIN
        // esto habría que escribirlo en un archivo y ya ejecutarlo como código jasmin
        System.out.println(compilar(tree));

        // Imprimir el árbol en la consola
        // System.out.println("En formato de texto plano con el metodo toStringTree:");
        // System.out.println(tree.toStringTree(parser));

        // System.out.println("En un formato mas legible:");
        // printTree(tree, "");

        // // Crear el listener y recorrer el árbol
        // ListenerLinguine listener = new ListenerLinguine();
        // ParseTreeWalker walker = new ParseTreeWalker();
        // walker.walk(listener, tree);

        // // Imprimir la información recopilada
        // System.out.println("Tabla de simbolos:");
        // Iterator<String> keys = listener.getVariables().keySet().iterator();
        // Iterator<String[]> values = listener.getVariables().values().iterator();
        // int i = 0;
        // while (values.hasNext()) {
        //     String[] array = values.next();
                
        //     System.out.print("variable " + keys.next() + ": ");
        //     for (String elemento : array) {
        //         System.out.print(elemento + " ");
        //     }
        //     System.out.println();
        //     i++;
        // }
    }

    private static void printTree(ParseTree tree, String indent) {
        System.out.println(indent + tree.getClass().getSimpleName() + ": " + tree.getText());

        for (int i = 0; i < tree.getChildCount(); i++) {
            printTree(tree.getChild(i), indent + "  ");
        }
    }
    public static String compilar(ParseTree tree) {

        VisitorLinguine v = new VisitorLinguine();

        String instruccionesJasmin = v.visit(tree);

        System.out.println(v.getTablaSimbolos().toString());

        return instruccionesJasmin;

        // return ".class public LinguineJasmin\n"
        // + ".super java/lang/Object\n"
        // + "\n"
        // + ".method public static main([Ljava/lang/String;)V\n"
        // + "    .limit stack 100\n"
        // + "    .limit locals 100\n"
        // + "\n"
        // + "    getstatic java/lang/System/out Ljava/io/PrintStream;\n"
        // + instruccionesJasmin + "\n"
        // + "    invokevirtual java/io/PrintStream/println(I)V\n"
        // + "return\n"
        // + "\n"
        // + ".end method";
    }
}