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
            Parameter p = new Parameter(s, "tipo aqui");
            parametros.add(p);
        }
        tabla.addFunction(ctx.IDENTIFICADOR().getText(), parametros);
        return "declaracion funcion";
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
        // si no hay LET, la variable tiene que estar ya definida en la tabla de
        // símbolos
        if (ctx.LET() == null) {
            String valueAnterior = tabla.getVariable(ctx.IDENTIFICADOR().getText());
            if (valueAnterior == null) {
                // si no está definida lanzamos un error
                return "Error: la variable " + ctx.IDENTIFICADOR() + " no esta definida";
            } else {
                tabla.addVariable(ctx.IDENTIFICADOR().getText(), resultadoHijos);
                return "asignacion sin LET";
            }
        }
        // si hay LET, es una variable nueva
        else {
            tabla.addVariable(ctx.IDENTIFICADOR().getText(), resultadoHijos);
            return "asignacion con LET / declaracion";
        }
    }

    @Override
    public String visitSuma(linguineParser.SumaContext ctx) {
        float suma = 0.0f;
        for (String s : visitChildren(ctx).split("\n")) {
            if (s.contains(".")) {
                // si tiene parte decimal
                suma += Float.parseFloat(s);
            }
            else {
                // si es un entero
                suma += Integer.parseInt(s);
            }
        }
        return String.valueOf(suma);
    }

    @Override
    public String visitResta(linguineParser.RestaContext ctx) {
        float suma = 0.0f;
        int i = 2;
        for (String s : visitChildren(ctx).split("\n")) {
            if (s.contains(".")) {
                // si tiene parte decimal
                if (i % 2 == 0) {
                    suma += Float.parseFloat(s);
                } else {
                    suma -= Float.parseFloat(s);
                }
            }
            else {
                // si es un entero
                if (i % 2 == 0) {
                    suma += Integer.parseInt(s);
                } else {
                    suma -= Integer.parseInt(s);
                }
            }
            i++;
        }
        return String.valueOf(suma);
    }

    @Override
    public String visitMult(linguineParser.MultContext ctx) {
        float suma = 1.0f;
        for (String s : visitChildren(ctx).split("\n")) {
            if (s.contains(".")) {
                // si tiene parte decimal
                suma *= Float.parseFloat(s);
            }
            else {
                // si es un entero
                suma *= Integer.parseInt(s);
            }
        }
        return String.valueOf(suma);
    }
    
    @Override
    public String visitDiv(linguineParser.DivContext ctx) {
        String[] numeros = visitChildren(ctx).split("\n");
        float res = Float.parseFloat(numeros[0]);
        for (int i = 1; i < numeros.length; i++) {
            res = res / Float.parseFloat(numeros[i]);
        }
        return String.valueOf(res);
    }

    @Override
    public String visitReal(linguineParser.RealContext ctx) {
        return ctx.REAL().getText();
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
    private Map<String, String> variables;
    private Map<String, List<Parameter>> functions;

    public SymbolTable() {
        this.variables = new HashMap<>();
        this.functions = new HashMap<>();
    }

    public void addVariable(String name, String info) {
        variables.put(name, info);
    }

    public String getVariable(String name) {
        String value = variables.get(name);
        return value;
    }

    public void addFunction(String name, List<Parameter> parameters) {
        functions.put(name, parameters);
    }

    @Override
    public String toString() {
        String res = "Variables:\n" + variables.toString() + "\nFunciones:\n{";
        Set<String> keys = functions.keySet();
        Iterator<String> iteratorKeys = keys.iterator();
        while (iteratorKeys.hasNext()) {
            String siguiente = iteratorKeys.next();
            res += "{" + siguiente + ", parametros: ";
            List<Parameter> parametros = functions.get(siguiente);
            for (Parameter p : parametros) {
                res += p.getName() + ",";
            }
            res += "}";
        }
        res += "}";
        return res;
    }

}

final class Parameter {
    private String name;
    private String type;

    public Parameter(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }
}