import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class ListenerLinguine extends linguineParserBaseListener {
    private Map<String, String> variables = new HashMap<>();

    @Override
    public void exitAsignacion(linguineParser.AsignacionContext ctx) {
        String variableName = ctx.IDENTIFICADOR().getText();
        String value;
        if (ctx.expresion() == null) {
            value = ctx.sentencia_if().getText();  
        }
        else {
            value = ctx.expresion().getText();
        }
        variables.put(variableName, value);
    }

    public Map<String, String> getVariables() {
        return variables;
    }
}