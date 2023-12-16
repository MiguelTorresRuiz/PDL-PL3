// Generated from linguineParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link linguineParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface linguineParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link linguineParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(linguineParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguineParser#sentencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia(linguineParser.SentenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguineParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(linguineParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code entre_parentesis}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntre_parentesis(linguineParser.Entre_parentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code div}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiv(linguineParser.DivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code suma}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuma(linguineParser.SumaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mult}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMult(linguineParser.MultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code llamada}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada(linguineParser.LlamadaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variable}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(linguineParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code real}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReal(linguineParser.RealContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resta}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResta(linguineParser.RestaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cond}
	 * labeled alternative in {@link linguineParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond(linguineParser.CondContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguineParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(linguineParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguineParser#sentencia_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_if(linguineParser.Sentencia_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguineParser#sentencia_while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_while(linguineParser.Sentencia_whileContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguineParser#sentencia_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_for(linguineParser.Sentencia_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguineParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_funcion(linguineParser.Declaracion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguineParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(linguineParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguineParser#llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion(linguineParser.Llamada_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguineParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(linguineParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguineParser#sentencia_match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_match(linguineParser.Sentencia_matchContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguineParser#casos_match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasos_match(linguineParser.Casos_matchContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguineParser#valores_match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValores_match(linguineParser.Valores_matchContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguineParser#caso_match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaso_match(linguineParser.Caso_matchContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguineParser#sentencia_show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_show(linguineParser.Sentencia_showContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguineParser#comentario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComentario(linguineParser.ComentarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link linguineParser#textos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextos(linguineParser.TextosContext ctx);
}