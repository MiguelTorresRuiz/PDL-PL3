import java.util.Map;
import java.util.Set;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class VisitorLinguine extends linguineParserBaseVisitor<String> {
    SymbolTable tabla = new SymbolTable();

    @Override
    public String visitDeclaracion_funcion(linguineParser.Declaracion_funcionContext ctx) {
        List<Parameter> parametros = new ArrayList<>();
        for (String s : getParametros(ctx.parametros()).split(",")) {
            Parameter p = new Parameter(s);
            parametros.add(p);
        }
        if (ctx.program() == null) {
            // String res = tabla.addFuncion(ctx.IDENTIFICADOR().getText(), parametros, ctx.expresion());
        }
        String res = tabla.addFuncion(ctx.IDENTIFICADOR().getText(), parametros, ctx.program());
        return res;
    }

    public String getParametros(linguineParser.ParametrosContext ctx) {
        String parametros = "";
        int i = 0;
        while (ctx.IDENTIFICADOR(i) != null) {
            parametros += ctx.IDENTIFICADOR(i).getText();
            parametros += ",";
            i++;
        }
        return parametros;
    }

    @Override
    public String visitAsignacion(linguineParser.AsignacionContext ctx) {
        String resultadoHijos = visitChildren(ctx);

        String tipo = "";
        // determinar el tipo
        if (!ctx.IDENTIFICADOR().getText().contains("\"")) {
            tipo = "numerico";
        } else {
            tipo = "cadena";
        }

        // si no hay LET, la variable tiene que estar ya definida en la tabla de símbolos
        if (ctx.LET() == null) {
            int index = tabla.nombres.indexOf(ctx.IDENTIFICADOR().getText());
            if (index == -1) {
                // si no está definida lanzamos un error
                return "Error: la variable " + ctx.IDENTIFICADOR() + " no esta definida";
            } else {
                tabla.addVariable(ctx.IDENTIFICADOR().getText(), "?", tipo);
                return visitChildren(ctx)+ "\nfstore "
                        + (tabla.nombres.indexOf(ctx.IDENTIFICADOR().getText()));
            }
        }
        // si hay LET, es una variable nueva
        else {
            tabla.addVariable(ctx.IDENTIFICADOR().getText(), "?", tipo);
            return visitChildren(ctx) +  "\nfstore "
                    + (tabla.nombres.indexOf(ctx.IDENTIFICADOR().getText()));
        }
    }

    @Override
    public String visitSuma(linguineParser.SumaContext ctx) {
        String hijos = visitChildren(ctx);
        String[] hijosArray = hijos.split("\n");
        boolean hayCadenas = false;
        for (int i = 0; i < hijosArray.length; i++) {
            if (hijosArray[i].contains("\"")) {
                hayCadenas = true;
            }
        }
        if (hayCadenas) {
            return hijos + "\ninvokevirtual java/lang/string/concat(Ljava/lang/string;)Ljava/lang/string;";
        }
        else {
            return hijos + "\nfadd";
        }
    }

    @Override
    public String visitCadena(linguineParser.CadenaContext ctx) {
        return "ldc " + ctx.LITERAL_CADENA().getText();
    }

    @Override
    public String visitResta(linguineParser.RestaContext ctx) {
        return visitChildren(ctx) + "\nfsub";
    }

    @Override
    public String visitMult(linguineParser.MultContext ctx) {
        return visitChildren(ctx) + "\nfmul";
    }
    
    @Override
    public String visitDiv(linguineParser.DivContext ctx) {
        return visitChildren(ctx) + "\nfdiv";
    }

    @Override
    public String visitReal(linguineParser.RealContext ctx) {
        return "ldc " + String.valueOf(Float.parseFloat(ctx.REAL().getText()));
    }
    @Override
    public String visitVariable(linguineParser.VariableContext ctx) {
        int index = tabla.nombres.indexOf(ctx.IDENTIFICADOR().getText());
        if (index == -1) {
            return "Error, la variable " + ctx.IDENTIFICADOR().getText() + " no esta definida";
        }
        else {
            return "fload " + index;
        }
    }

    @Override
    public String visitSentencia_if(linguineParser.Sentencia_ifContext ctx) {
        return visitCondicion(ctx.condicion()) + "\nifge else\n" + visitChildren(ctx.program(0))
                + "\ngoto fin_comparacion\nelse:\n" + visitChildren(ctx.program(1)) + "\nfin_comparacion:";
    }

    @Override
    public String visitCondicion(linguineParser.CondicionContext ctx) {
        String op_comparacion = "fcmpg";
        // ?? no se explica nada en la documentación sobre que hace cada operación
        // así que dejamos por defecto que la única operación que se haga es '>', mayor estricto
        if (ctx.OP_DISTINTO() != null) {
            // op_comparacion = "fcmpne";
        }
        else if(ctx.OP_EQUIVALENCIA() != null) {
            // op_comparacion = "fcmpeql";
        }
        else if (ctx.OP_MAYOR_ESTRICTO() != null) {
            // op_comparacion = "fcmpg";
        }
        else if (ctx.OP_MAYOR_IGUAL() != null) {
            // op_comparacion = "fcmpg";
        }
        else if (ctx.OP_MENOR_ESTRICTO() != null) {
            // op_comparacion = "fcmpl";
        }
        else { // ctx.OP_MENOR_IGUAL() != null
            // op_comparacion = "fcmpl";
        }

        String res = "";
        if (ctx.IDENTIFICADOR(0) != null && ctx.IDENTIFICADOR(1) != null) {
            if (tabla.nombres.indexOf(ctx.IDENTIFICADOR(0).getText()) == -1) {
                return "Error: no se ha definido la variable " + ctx.IDENTIFICADOR(0).getText();
            }
            else if (tabla.nombres.indexOf(ctx.IDENTIFICADOR(1).getText()) == -1) {
                return "Error: no se ha definido la variable " + ctx.IDENTIFICADOR(1).getText();
            }
            res += "fload " + tabla.nombres.indexOf(ctx.IDENTIFICADOR(0).getText()) + "\nfload "
            + tabla.nombres.indexOf(ctx.IDENTIFICADOR(1).getText());
        } else if (ctx.IDENTIFICADOR(0) != null) {
            if (tabla.nombres.indexOf(ctx.IDENTIFICADOR(0).getText()) == -1) {
                return "Error: no se ha definido la variable " + ctx.IDENTIFICADOR(0).getText();
            }
            res += "fload " + tabla.nombres.indexOf(ctx.IDENTIFICADOR(0).getText()) + "\nldc "
            + String.valueOf(Float.parseFloat(ctx.REAL(0).getText()));
        } else if (ctx.IDENTIFICADOR(1) != null) {
            if (tabla.nombres.indexOf(ctx.IDENTIFICADOR(1).getText()) == -1) {
                return "Error: no se ha definido la variable " + ctx.IDENTIFICADOR(1).getText();
            }
            res += "ldc " + String.valueOf(Float.parseFloat(ctx.REAL(0).getText())) + "\nfload "
                    + tabla.nombres.indexOf(ctx.IDENTIFICADOR(1).getText());
        } else {
            res += "ldc " + String.valueOf(Float.parseFloat(ctx.REAL(0).getText())) + "\nldc "
                    + String.valueOf(Float.parseFloat(ctx.REAL(1).getText()));
        }
        return res + "\n" + op_comparacion;
    }

    @Override
    public String visitLlamada_funcion(linguineParser.Llamada_funcionContext ctx) {
        List<Parameter> nombreParametros = tabla.parametros.get(tabla.nombresFunciones.indexOf(ctx.IDENTIFICADOR().getText()));
        String[] valores = visitChildren(ctx).split("\n");
        // añadimos como variables los parámetros de la función con los valores de la llamada como valor
        for (int i = 0; i < valores.length; i++) {
            tabla.addVariable(nombreParametros.get(i).getName(), valores[i].substring(4), "numerico");
        }
        // aquí se devolvería el código de la función en jasmin
        String res = "ldc 'resultado de la funcion " + ctx.IDENTIFICADOR().getText() + "(";
        for (int i = 0; i < valores.length; i++) {
            res += nombreParametros.get(i).getName() + ": " + valores[i].substring(4);

            if (i != valores.length - 1) {
                res += ", ";
            }
        }
        res += ")'";
        return res;
    }

    @Override
    public String visitSentencia_show(linguineParser.Sentencia_showContext ctx) {
        // cargamos el PrintStream y el valor a mostrar (visitChildren), y ejecutamos println para mostrar por pantalla
        return "getstatic java/lang/System/out Ljava/io/PrintStream;\n" + visitChildren(ctx) + "\ninvokevirtual java/io/PrintStream/println(F)V";
    }



    @Override
    protected String aggregateResult(String aggregate, String nextResult) {
        if (aggregate == null) {
            return nextResult;
        }
        if (nextResult == null) {
            return aggregate;
        }
        return aggregate + "\n" + nextResult;
    }

    public SymbolTable getTablaSimbolos() {
        return this.tabla;
    }
}

final class SymbolTable {
    /*
     * Arrays paralelos para guardar información de la tabla de símbolos de las
     * variables
     * nombres -> guarda nombres de las variables declaradas
     * valores -> guarda los valores de las variables declaradas
     * tipos -> guarda los tipos de las variables declaradas
     */
    public List<String> nombres = new ArrayList<>();
    public List<String> valores = new ArrayList<>();
    public List<String> tipos = new ArrayList<>();

    /*
     * Arrays paralelos para guardar información de la tabla de símbolos de las
     * funciones
     * nombresFunciones -> guarda nombres de las funciones declaradas
     * parametros -> guarda la lista de los parámetros de cada función
     */
    public List<String> nombresFunciones = new ArrayList<>();
    public List<List<Parameter>> parametros = new ArrayList<>();

    public void addVariable(String name, String value, String type) {
        int index = nombres.indexOf(name);
        if (index == -1) {
            // no existe y hay que añadirla
            nombres.add(name);
            valores.add(value);
            tipos.add(type);
        } else {
            // existe y solo hay que cambiar el anterior valor por el nuevo
            valores.set(index, value);
            tipos.set(index, type);
        }
    }

    public String getValor(String name) {
        int index = nombres.indexOf(name);
        if (index == -1) {
            return null;
        } else {
            return valores.get(index);
        }
    }

    public String addFuncion(String nombre, List<Parameter> parametros, linguineParser.ProgramContext context) {
        if (nombresFunciones.contains(nombre)) {
            // si la función ya está declarada devolvemos un error
            return "Error: la función " + nombre + " tiene declaraciones duplicadas";
        } else {
            this.nombresFunciones.add(nombre);
            this.parametros.add(parametros);
            // si todo correcto devuelve string vacío
            return "";
        }
    }

    @Override
    public String toString() {

        String res = "Variables:\n";
        res += "Nombre | Valor | Tipo\n";
        for (int i = 0; i < nombres.size(); i++) {
            res += "{" + nombres.get(i) + ", " + valores.get(i) + ", " + tipos.get(i) + "}\n";
        }

        res += "Funciones:\n";
        res += "Nombre | Parametros\n";
        for (int j = 0; j < nombresFunciones.size(); j++) {
            res += "{" + nombresFunciones.get(j) + ", (";
            int size = parametros.get(j).size();
            for (int i = 0; i < size; i++) {
                Parameter p = parametros.get(j).get(i);
                res += p.getName();
                // Agregar la coma y el espacio si no es la última iteración
                if (i < size - 1) {
                    res += ", ";
                }
            }
            res += ")}\n";
        }

        return res;
    }

}

final class Parameter {
    private String name;

    public Parameter(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "(" + this.name + ")";
    }
}