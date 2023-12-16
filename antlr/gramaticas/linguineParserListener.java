// Generated from linguineParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link linguineParser}.
 */
public interface linguineParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link linguineParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(linguineParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link linguineParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(linguineParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link linguineParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void enterSentencia(linguineParser.SentenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link linguineParser#sentencia}.
	 * @param ctx the parse tree
	 */
	void exitSentencia(linguineParser.SentenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link linguineParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(linguineParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link linguineParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(linguineParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code entre_parentesis}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterEntre_parentesis(linguineParser.Entre_parentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code entre_parentesis}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitEntre_parentesis(linguineParser.Entre_parentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code div}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterDiv(linguineParser.DivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code div}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitDiv(linguineParser.DivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code suma}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterSuma(linguineParser.SumaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code suma}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitSuma(linguineParser.SumaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mult}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterMult(linguineParser.MultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitMult(linguineParser.MultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code llamada}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada(linguineParser.LlamadaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code llamada}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada(linguineParser.LlamadaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variable}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterVariable(linguineParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitVariable(linguineParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code real}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterReal(linguineParser.RealContext ctx);
	/**
	 * Exit a parse tree produced by the {@code real}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitReal(linguineParser.RealContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resta}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterResta(linguineParser.RestaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resta}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitResta(linguineParser.RestaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cond}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterCond(linguineParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cond}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitCond(linguineParser.CondContext ctx);
	/**
	 * Enter a parse tree produced by {@link linguineParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(linguineParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link linguineParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(linguineParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link linguineParser#sentencia_if}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_if(linguineParser.Sentencia_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link linguineParser#sentencia_if}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_if(linguineParser.Sentencia_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link linguineParser#sentencia_while}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_while(linguineParser.Sentencia_whileContext ctx);
	/**
	 * Exit a parse tree produced by {@link linguineParser#sentencia_while}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_while(linguineParser.Sentencia_whileContext ctx);
	/**
	 * Enter a parse tree produced by {@link linguineParser#sentencia_for}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_for(linguineParser.Sentencia_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link linguineParser#sentencia_for}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_for(linguineParser.Sentencia_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link linguineParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_funcion(linguineParser.Declaracion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link linguineParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_funcion(linguineParser.Declaracion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link linguineParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(linguineParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link linguineParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(linguineParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link linguineParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion(linguineParser.Llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link linguineParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion(linguineParser.Llamada_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link linguineParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(linguineParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link linguineParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(linguineParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link linguineParser#sentencia_match}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_match(linguineParser.Sentencia_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link linguineParser#sentencia_match}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_match(linguineParser.Sentencia_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link linguineParser#casos_match}.
	 * @param ctx the parse tree
	 */
	void enterCasos_match(linguineParser.Casos_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link linguineParser#casos_match}.
	 * @param ctx the parse tree
	 */
	void exitCasos_match(linguineParser.Casos_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link linguineParser#valores_match}.
	 * @param ctx the parse tree
	 */
	void enterValores_match(linguineParser.Valores_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link linguineParser#valores_match}.
	 * @param ctx the parse tree
	 */
	void exitValores_match(linguineParser.Valores_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link linguineParser#caso_match}.
	 * @param ctx the parse tree
	 */
	void enterCaso_match(linguineParser.Caso_matchContext ctx);
	/**
	 * Exit a parse tree produced by {@link linguineParser#caso_match}.
	 * @param ctx the parse tree
	 */
	void exitCaso_match(linguineParser.Caso_matchContext ctx);
	/**
	 * Enter a parse tree produced by {@link linguineParser#sentencia_show}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_show(linguineParser.Sentencia_showContext ctx);
	/**
	 * Exit a parse tree produced by {@link linguineParser#sentencia_show}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_show(linguineParser.Sentencia_showContext ctx);
	/**
	 * Enter a parse tree produced by {@link linguineParser#comentario}.
	 * @param ctx the parse tree
	 */
	void enterComentario(linguineParser.ComentarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link linguineParser#comentario}.
	 * @param ctx the parse tree
	 */
	void exitComentario(linguineParser.ComentarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link linguineParser#textos}.
	 * @param ctx the parse tree
	 */
	void enterTextos(linguineParser.TextosContext ctx);
	/**
	 * Exit a parse tree produced by {@link linguineParser#textos}.
	 * @param ctx the parse tree
	 */
	void exitTextos(linguineParser.TextosContext ctx);
}