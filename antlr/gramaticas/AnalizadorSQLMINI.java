import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.Arrays;
import java.util.stream.Stream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnalizadorSQLMINI {

    // Método de entrada por defecto
    public static void main(String[] args) throws Exception {

        // Inicializamos los streams de datos
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Pedimos la consulta por consola y la convertimos a CharStream
        System.out.println("Introduzca la consulta SQLMINI:");
        String query = br.readLine();
        CharStream inputStream = CharStreams.fromString(query);

        // Conectamos con el lexer
        SQLMINILexer lexer = new SQLMINILexer(inputStream);

        // Inicializamos el canal de tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Preparamos el parser
        SQLMINIParser parser = new SQLMINIParser(tokens);

        // Generar árbol a partir del axioma de la gramática
        ParseTree tree = parser.prog();

        // Imprimir el árbol en la consola
        System.out.println("En formato de texto plano con el metodo toStringTree:");
        System.out.println(tree.toStringTree(parser));

        System.out.println("");
        System.out.println("En un formato mas legible:");
        printTree(tree, "");
    }

    private static void printTree(ParseTree tree, String indent) {
        System.out.println(indent + tree.getClass().getSimpleName() + ": " + tree.getText());

        for (int i = 0; i < tree.getChildCount(); i++) {
            printTree(tree.getChild(i), indent + "  ");
        }
    }
}