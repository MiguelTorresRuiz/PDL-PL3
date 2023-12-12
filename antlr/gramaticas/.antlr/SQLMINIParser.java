// Generated from c:/Oscar/Universidad/3º/Procesadores de lenguaje/PL2/antlr/gramaticas/SQLMINIParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SQLMINIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, ORDER_BY=4, AND=5, OR=6, ASC=7, DESC=8, OP_MENOR_ESTRICTO=9, 
		OP_MAYOR_ESTRICTO=10, OP_MENOR_IGUAL=11, OP_MAYOR_IGUAL=12, OP_DISTINTO=13, 
		IGUAL=14, PARENTESIS_IZQUIERDO=15, PARENTESIS_DERECHO=16, ASTERISCO=17, 
		COMA=18, IDENTIFICADOR=19, ENTRE_COMILLAS=20, REAL=21, SALTO_LINEA=22, 
		ESPACIO=23, COMENTARIOLINEA=24, COMENTARIOABRIR=25, FINAL_COMENTARIO_LINEA=26, 
		TEXTO_COMENTARIO_LINEA=27, COMENTARIOCERRAR=28, TEXTO_COMENTARIO_BLOQUE=29;
	public static final int
		RULE_prog = 0, RULE_query = 1, RULE_atributos_select = 2, RULE_clausula_select = 3, 
		RULE_clausula_from = 4, RULE_clausula_where = 5, RULE_condicion = 6, RULE_comparadores = 7, 
		RULE_value = 8, RULE_clausula_order_by = 9, RULE_comentario = 10, RULE_textos = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "query", "atributos_select", "clausula_select", "clausula_from", 
			"clausula_where", "condicion", "comparadores", "value", "clausula_order_by", 
			"comentario", "textos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'<'", "'>'", "'<='", 
			"'>='", "'!='", "'='", "'('", "')'", "'*'", "','", null, null, null, 
			null, null, "'--'", "'/*'", "'\\r\\n'", null, "'*/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "ORDER_BY", "AND", "OR", "ASC", "DESC", 
			"OP_MENOR_ESTRICTO", "OP_MAYOR_ESTRICTO", "OP_MENOR_IGUAL", "OP_MAYOR_IGUAL", 
			"OP_DISTINTO", "IGUAL", "PARENTESIS_IZQUIERDO", "PARENTESIS_DERECHO", 
			"ASTERISCO", "COMA", "IDENTIFICADOR", "ENTRE_COMILLAS", "REAL", "SALTO_LINEA", 
			"ESPACIO", "COMENTARIOLINEA", "COMENTARIOABRIR", "FINAL_COMENTARIO_LINEA", 
			"TEXTO_COMENTARIO_LINEA", "COMENTARIOCERRAR", "TEXTO_COMENTARIO_BLOQUE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQLMINIParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLMINIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public List<TerminalNode> SALTO_LINEA() { return getTokens(SQLMINIParser.SALTO_LINEA); }
		public TerminalNode SALTO_LINEA(int i) {
			return getToken(SQLMINIParser.SALTO_LINEA, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 50331650L) != 0)) {
				{
				setState(35);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SELECT:
					{
					{
					setState(24);
					query();
					setState(26);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(25);
						comentario();
						}
						break;
					}
					setState(29);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SALTO_LINEA) {
						{
						setState(28);
						match(SALTO_LINEA);
						}
					}

					}
					}
					break;
				case COMENTARIOLINEA:
				case COMENTARIOABRIR:
					{
					{
					setState(31);
					comentario();
					setState(33);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SALTO_LINEA) {
						{
						setState(32);
						match(SALTO_LINEA);
						}
					}

					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public Clausula_selectContext clausula_select() {
			return getRuleContext(Clausula_selectContext.class,0);
		}
		public Clausula_fromContext clausula_from() {
			return getRuleContext(Clausula_fromContext.class,0);
		}
		public Clausula_whereContext clausula_where() {
			return getRuleContext(Clausula_whereContext.class,0);
		}
		public Clausula_order_byContext clausula_order_by() {
			return getRuleContext(Clausula_order_byContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			clausula_select();
			setState(41);
			clausula_from();
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(42);
				clausula_where();
				}
			}

			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER_BY) {
				{
				setState(45);
				clausula_order_by();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Atributos_selectContext extends ParserRuleContext {
		public TerminalNode ASTERISCO() { return getToken(SQLMINIParser.ASTERISCO, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SQLMINIParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SQLMINIParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> COMA() { return getTokens(SQLMINIParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(SQLMINIParser.COMA, i);
		}
		public Atributos_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributos_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).enterAtributos_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).exitAtributos_select(this);
		}
	}

	public final Atributos_selectContext atributos_select() throws RecognitionException {
		Atributos_selectContext _localctx = new Atributos_selectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_atributos_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASTERISCO:
				{
				setState(48);
				match(ASTERISCO);
				}
				break;
			case IDENTIFICADOR:
				{
				{
				setState(49);
				match(IDENTIFICADOR);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(50);
					match(COMA);
					setState(51);
					match(IDENTIFICADOR);
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Clausula_selectContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLMINIParser.SELECT, 0); }
		public Atributos_selectContext atributos_select() {
			return getRuleContext(Atributos_selectContext.class,0);
		}
		public Clausula_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clausula_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).enterClausula_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).exitClausula_select(this);
		}
	}

	public final Clausula_selectContext clausula_select() throws RecognitionException {
		Clausula_selectContext _localctx = new Clausula_selectContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_clausula_select);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(SELECT);
			setState(60);
			atributos_select();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Clausula_fromContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SQLMINIParser.FROM, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SQLMINIParser.IDENTIFICADOR, 0); }
		public Clausula_fromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clausula_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).enterClausula_from(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).exitClausula_from(this);
		}
	}

	public final Clausula_fromContext clausula_from() throws RecognitionException {
		Clausula_fromContext _localctx = new Clausula_fromContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_clausula_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(FROM);
			setState(63);
			match(IDENTIFICADOR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Clausula_whereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SQLMINIParser.WHERE, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public Clausula_whereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clausula_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).enterClausula_where(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).exitClausula_where(this);
		}
	}

	public final Clausula_whereContext clausula_where() throws RecognitionException {
		Clausula_whereContext _localctx = new Clausula_whereContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_clausula_where);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(WHERE);
			setState(66);
			condicion(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionContext extends ParserRuleContext {
		public TerminalNode PARENTESIS_IZQUIERDO() { return getToken(SQLMINIParser.PARENTESIS_IZQUIERDO, 0); }
		public List<CondicionContext> condicion() {
			return getRuleContexts(CondicionContext.class);
		}
		public CondicionContext condicion(int i) {
			return getRuleContext(CondicionContext.class,i);
		}
		public TerminalNode PARENTESIS_DERECHO() { return getToken(SQLMINIParser.PARENTESIS_DERECHO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SQLMINIParser.IDENTIFICADOR, 0); }
		public ComparadoresContext comparadores() {
			return getRuleContext(ComparadoresContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode AND() { return getToken(SQLMINIParser.AND, 0); }
		public TerminalNode OR() { return getToken(SQLMINIParser.OR, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		return condicion(0);
	}

	private CondicionContext condicion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CondicionContext _localctx = new CondicionContext(_ctx, _parentState);
		CondicionContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_condicion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTESIS_IZQUIERDO:
				{
				setState(69);
				match(PARENTESIS_IZQUIERDO);
				setState(70);
				condicion(0);
				setState(71);
				match(PARENTESIS_DERECHO);
				}
				break;
			case IDENTIFICADOR:
				{
				setState(73);
				match(IDENTIFICADOR);
				setState(74);
				comparadores();
				setState(75);
				value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CondicionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_condicion);
					setState(79);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(80);
					_la = _input.LA(1);
					if ( !(_la==AND || _la==OR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(81);
					condicion(3);
					}
					} 
				}
				setState(86);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparadoresContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(SQLMINIParser.IGUAL, 0); }
		public TerminalNode OP_MAYOR_ESTRICTO() { return getToken(SQLMINIParser.OP_MAYOR_ESTRICTO, 0); }
		public TerminalNode OP_MENOR_ESTRICTO() { return getToken(SQLMINIParser.OP_MENOR_ESTRICTO, 0); }
		public TerminalNode OP_MAYOR_IGUAL() { return getToken(SQLMINIParser.OP_MAYOR_IGUAL, 0); }
		public TerminalNode OP_MENOR_IGUAL() { return getToken(SQLMINIParser.OP_MENOR_IGUAL, 0); }
		public TerminalNode OP_DISTINTO() { return getToken(SQLMINIParser.OP_DISTINTO, 0); }
		public ComparadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparadores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).enterComparadores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).exitComparadores(this);
		}
	}

	public final ComparadoresContext comparadores() throws RecognitionException {
		ComparadoresContext _localctx = new ComparadoresContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comparadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 32256L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode ENTRE_COMILLAS() { return getToken(SQLMINIParser.ENTRE_COMILLAS, 0); }
		public TerminalNode REAL() { return getToken(SQLMINIParser.REAL, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_la = _input.LA(1);
			if ( !(_la==ENTRE_COMILLAS || _la==REAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Clausula_order_byContext extends ParserRuleContext {
		public TerminalNode ORDER_BY() { return getToken(SQLMINIParser.ORDER_BY, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SQLMINIParser.IDENTIFICADOR, 0); }
		public TerminalNode ASC() { return getToken(SQLMINIParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLMINIParser.DESC, 0); }
		public Clausula_order_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clausula_order_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).enterClausula_order_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).exitClausula_order_by(this);
		}
	}

	public final Clausula_order_byContext clausula_order_by() throws RecognitionException {
		Clausula_order_byContext _localctx = new Clausula_order_byContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_clausula_order_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(ORDER_BY);
			setState(92);
			match(IDENTIFICADOR);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(93);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComentarioContext extends ParserRuleContext {
		public TerminalNode COMENTARIOLINEA() { return getToken(SQLMINIParser.COMENTARIOLINEA, 0); }
		public TerminalNode FINAL_COMENTARIO_LINEA() { return getToken(SQLMINIParser.FINAL_COMENTARIO_LINEA, 0); }
		public List<TextosContext> textos() {
			return getRuleContexts(TextosContext.class);
		}
		public TextosContext textos(int i) {
			return getRuleContext(TextosContext.class,i);
		}
		public TerminalNode COMENTARIOABRIR() { return getToken(SQLMINIParser.COMENTARIOABRIR, 0); }
		public TerminalNode COMENTARIOCERRAR() { return getToken(SQLMINIParser.COMENTARIOCERRAR, 0); }
		public List<TerminalNode> SALTO_LINEA() { return getTokens(SQLMINIParser.SALTO_LINEA); }
		public TerminalNode SALTO_LINEA(int i) {
			return getToken(SQLMINIParser.SALTO_LINEA, i);
		}
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).exitComentario(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_comentario);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOLINEA:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(COMENTARIOLINEA);
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTO_COMENTARIO_LINEA || _la==TEXTO_COMENTARIO_BLOQUE) {
					{
					{
					setState(97);
					textos();
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				match(FINAL_COMENTARIO_LINEA);
				}
				break;
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				match(COMENTARIOABRIR);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 675282944L) != 0)) {
					{
					setState(107);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXTO_COMENTARIO_LINEA:
					case TEXTO_COMENTARIO_BLOQUE:
						{
						setState(105);
						textos();
						}
						break;
					case SALTO_LINEA:
						{
						setState(106);
						match(SALTO_LINEA);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
				match(COMENTARIOCERRAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextosContext extends ParserRuleContext {
		public List<TerminalNode> TEXTO_COMENTARIO_LINEA() { return getTokens(SQLMINIParser.TEXTO_COMENTARIO_LINEA); }
		public TerminalNode TEXTO_COMENTARIO_LINEA(int i) {
			return getToken(SQLMINIParser.TEXTO_COMENTARIO_LINEA, i);
		}
		public List<TerminalNode> TEXTO_COMENTARIO_BLOQUE() { return getTokens(SQLMINIParser.TEXTO_COMENTARIO_BLOQUE); }
		public TerminalNode TEXTO_COMENTARIO_BLOQUE(int i) {
			return getToken(SQLMINIParser.TEXTO_COMENTARIO_BLOQUE, i);
		}
		public TextosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).enterTextos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLMINIParserListener ) ((SQLMINIParserListener)listener).exitTextos(this);
		}
	}

	public final TextosContext textos() throws RecognitionException {
		TextosContext _localctx = new TextosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_textos);
		try {
			int _alt;
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO_COMENTARIO_LINEA:
				enterOuterAlt(_localctx, 1);
				{
				setState(116); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(115);
						match(TEXTO_COMENTARIO_LINEA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(118); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case TEXTO_COMENTARIO_BLOQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(121); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(120);
						match(TEXTO_COMENTARIO_BLOQUE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(123); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return condicion_sempred((CondicionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean condicion_sempred(CondicionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u0080\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0001\u0000\u0001\u0000\u0003\u0000\u001b\b\u0000\u0001\u0000\u0003\u0000"+
		"\u001e\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000\"\b\u0000\u0005\u0000"+
		"$\b\u0000\n\u0000\f\u0000\'\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001,\b\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u00025\b\u0002\n\u0002\f\u00028\t"+
		"\u0002\u0003\u0002:\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0003\u0006N\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006S\b\u0006\n\u0006\f\u0006V\t\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0003\t_\b"+
		"\t\u0001\n\u0001\n\u0005\nc\b\n\n\n\f\nf\t\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\nl\b\n\n\n\f\no\t\n\u0001\n\u0003\nr\b\n\u0001\u000b\u0004\u000b"+
		"u\b\u000b\u000b\u000b\f\u000bv\u0001\u000b\u0004\u000bz\b\u000b\u000b"+
		"\u000b\f\u000b{\u0003\u000b~\b\u000b\u0001\u000b\u0000\u0001\f\f\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0004\u0001"+
		"\u0000\u0005\u0006\u0001\u0000\t\u000e\u0001\u0000\u0014\u0015\u0001\u0000"+
		"\u0007\b\u0086\u0000%\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000"+
		"\u0000\u00049\u0001\u0000\u0000\u0000\u0006;\u0001\u0000\u0000\u0000\b"+
		">\u0001\u0000\u0000\u0000\nA\u0001\u0000\u0000\u0000\fM\u0001\u0000\u0000"+
		"\u0000\u000eW\u0001\u0000\u0000\u0000\u0010Y\u0001\u0000\u0000\u0000\u0012"+
		"[\u0001\u0000\u0000\u0000\u0014q\u0001\u0000\u0000\u0000\u0016}\u0001"+
		"\u0000\u0000\u0000\u0018\u001a\u0003\u0002\u0001\u0000\u0019\u001b\u0003"+
		"\u0014\n\u0000\u001a\u0019\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000"+
		"\u0000\u0000\u001b\u001d\u0001\u0000\u0000\u0000\u001c\u001e\u0005\u0016"+
		"\u0000\u0000\u001d\u001c\u0001\u0000\u0000\u0000\u001d\u001e\u0001\u0000"+
		"\u0000\u0000\u001e$\u0001\u0000\u0000\u0000\u001f!\u0003\u0014\n\u0000"+
		" \"\u0005\u0016\u0000\u0000! \u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"$\u0001\u0000\u0000\u0000#\u0018\u0001\u0000\u0000\u0000#\u001f"+
		"\u0001\u0000\u0000\u0000$\'\u0001\u0000\u0000\u0000%#\u0001\u0000\u0000"+
		"\u0000%&\u0001\u0000\u0000\u0000&\u0001\u0001\u0000\u0000\u0000\'%\u0001"+
		"\u0000\u0000\u0000()\u0003\u0006\u0003\u0000)+\u0003\b\u0004\u0000*,\u0003"+
		"\n\u0005\u0000+*\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,.\u0001"+
		"\u0000\u0000\u0000-/\u0003\u0012\t\u0000.-\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/\u0003\u0001\u0000\u0000\u00000:\u0005\u0011\u0000"+
		"\u000016\u0005\u0013\u0000\u000023\u0005\u0012\u0000\u000035\u0005\u0013"+
		"\u0000\u000042\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u00007:\u0001\u0000\u0000\u0000"+
		"86\u0001\u0000\u0000\u000090\u0001\u0000\u0000\u000091\u0001\u0000\u0000"+
		"\u0000:\u0005\u0001\u0000\u0000\u0000;<\u0005\u0001\u0000\u0000<=\u0003"+
		"\u0004\u0002\u0000=\u0007\u0001\u0000\u0000\u0000>?\u0005\u0002\u0000"+
		"\u0000?@\u0005\u0013\u0000\u0000@\t\u0001\u0000\u0000\u0000AB\u0005\u0003"+
		"\u0000\u0000BC\u0003\f\u0006\u0000C\u000b\u0001\u0000\u0000\u0000DE\u0006"+
		"\u0006\uffff\uffff\u0000EF\u0005\u000f\u0000\u0000FG\u0003\f\u0006\u0000"+
		"GH\u0005\u0010\u0000\u0000HN\u0001\u0000\u0000\u0000IJ\u0005\u0013\u0000"+
		"\u0000JK\u0003\u000e\u0007\u0000KL\u0003\u0010\b\u0000LN\u0001\u0000\u0000"+
		"\u0000MD\u0001\u0000\u0000\u0000MI\u0001\u0000\u0000\u0000NT\u0001\u0000"+
		"\u0000\u0000OP\n\u0002\u0000\u0000PQ\u0007\u0000\u0000\u0000QS\u0003\f"+
		"\u0006\u0003RO\u0001\u0000\u0000\u0000SV\u0001\u0000\u0000\u0000TR\u0001"+
		"\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000U\r\u0001\u0000\u0000\u0000"+
		"VT\u0001\u0000\u0000\u0000WX\u0007\u0001\u0000\u0000X\u000f\u0001\u0000"+
		"\u0000\u0000YZ\u0007\u0002\u0000\u0000Z\u0011\u0001\u0000\u0000\u0000"+
		"[\\\u0005\u0004\u0000\u0000\\^\u0005\u0013\u0000\u0000]_\u0007\u0003\u0000"+
		"\u0000^]\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0013\u0001"+
		"\u0000\u0000\u0000`d\u0005\u0018\u0000\u0000ac\u0003\u0016\u000b\u0000"+
		"ba\u0001\u0000\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000"+
		"\u0000de\u0001\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000"+
		"\u0000\u0000gr\u0005\u001a\u0000\u0000hm\u0005\u0019\u0000\u0000il\u0003"+
		"\u0016\u000b\u0000jl\u0005\u0016\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000pr\u0005\u001c\u0000\u0000q`\u0001\u0000\u0000\u0000qh\u0001"+
		"\u0000\u0000\u0000r\u0015\u0001\u0000\u0000\u0000su\u0005\u001b\u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000w~\u0001\u0000\u0000\u0000xz\u0005"+
		"\u001d\u0000\u0000yx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{y\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|~\u0001\u0000\u0000"+
		"\u0000}t\u0001\u0000\u0000\u0000}y\u0001\u0000\u0000\u0000~\u0017\u0001"+
		"\u0000\u0000\u0000\u0013\u001a\u001d!#%+.69MT^dkmqv{}";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}