import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        String programa = compilar(tree);
        System.out.println(programa);

        // Ruta del archivo donde deseas escribir el string
        FileWriter fileWriter = new FileWriter("programa.j");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(programa);
        bufferedWriter.close();

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

        return ".class public LinguineJasmin\n"
                + ".super java/lang/Object\n"
                + "\n"
                + ".method public static main([Ljava/lang/String;)V\n"
                + "    .limit stack 100\n"
                + "    .limit locals 100\n"
                + "\n"
                + instruccionesJasmin + "\n"
                + "return\n"
                + "\n"
                + ".end method";
    }
}