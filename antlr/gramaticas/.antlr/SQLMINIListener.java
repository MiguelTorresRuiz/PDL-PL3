// Generated from c:/Oscar/Universidad/3º/Procesadores de lenguaje/PL2/antlr/gramaticas/SQLMINI.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLMINIParser}.
 */
public interface SQLMINIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLMINIParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SQLMINIParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMINIParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SQLMINIParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMINIParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SQLMINIParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMINIParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SQLMINIParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMINIParser#item_select}.
	 * @param ctx the parse tree
	 */
	void enterItem_select(SQLMINIParser.Item_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMINIParser#item_select}.
	 * @param ctx the parse tree
	 */
	void exitItem_select(SQLMINIParser.Item_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMINIParser#atributos_select}.
	 * @param ctx the parse tree
	 */
	void enterAtributos_select(SQLMINIParser.Atributos_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMINIParser#atributos_select}.
	 * @param ctx the parse tree
	 */
	void exitAtributos_select(SQLMINIParser.Atributos_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMINIParser#clausula_select}.
	 * @param ctx the parse tree
	 */
	void enterClausula_select(SQLMINIParser.Clausula_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMINIParser#clausula_select}.
	 * @param ctx the parse tree
	 */
	void exitClausula_select(SQLMINIParser.Clausula_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMINIParser#clausula_from}.
	 * @param ctx the parse tree
	 */
	void enterClausula_from(SQLMINIParser.Clausula_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMINIParser#clausula_from}.
	 * @param ctx the parse tree
	 */
	void exitClausula_from(SQLMINIParser.Clausula_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMINIParser#nombreTabla}.
	 * @param ctx the parse tree
	 */
	void enterNombreTabla(SQLMINIParser.NombreTablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMINIParser#nombreTabla}.
	 * @param ctx the parse tree
	 */
	void exitNombreTabla(SQLMINIParser.NombreTablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMINIParser#clausula_where}.
	 * @param ctx the parse tree
	 */
	void enterClausula_where(SQLMINIParser.Clausula_whereContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMINIParser#clausula_where}.
	 * @param ctx the parse tree
	 */
	void exitClausula_where(SQLMINIParser.Clausula_whereContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMINIParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(SQLMINIParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMINIParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(SQLMINIParser.CondicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMINIParser#comparadores}.
	 * @param ctx the parse tree
	 */
	void enterComparadores(SQLMINIParser.ComparadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMINIParser#comparadores}.
	 * @param ctx the parse tree
	 */
	void exitComparadores(SQLMINIParser.ComparadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMINIParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SQLMINIParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMINIParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SQLMINIParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLMINIParser#clausula_order_by}.
	 * @param ctx the parse tree
	 */
	void enterClausula_order_by(SQLMINIParser.Clausula_order_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLMINIParser#clausula_order_by}.
	 * @param ctx the parse tree
	 */
	void exitClausula_order_by(SQLMINIParser.Clausula_order_byContext ctx);
}