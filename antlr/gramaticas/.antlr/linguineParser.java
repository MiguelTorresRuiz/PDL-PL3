// Generated from c:/Oscar/Universidad/3º/Procesadores de lenguaje/PL2/antlr/gramaticas/linguineParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class linguineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LET=1, IF=2, THEN=3, ELSE=4, FUN=5, MATCH=6, WITH=7, SHOW=8, PARENTESIS_IZQUIERDO=9, 
		PARENTESIS_DERECHO=10, SEPARADOR_MATCH=11, INTERROGACION=12, FLECHA_DERECHA=13, 
		LITERAL_CADENA=14, COMA=15, IGUAL=16, PUNTO_Y_COMA=17, OP_SUMA=18, OP_RESTA=19, 
		OP_MULT=20, OP_DIV=21, OP_MENOR_ESTRICTO=22, OP_MAYOR_ESTRICTO=23, OP_MENOR_IGUAL=24, 
		OP_MAYOR_IGUAL=25, OP_DISTINTO=26, IDENTIFICADOR=27, REAL=28, SALTO_LINEA=29, 
		ESPACIOS=30, COMENTARIOLINEA=31, COMENTARIOABRIR=32, FINAL_COMENTARIO_LINEA=33, 
		TEXTO_COMENTARIO_LINEA=34, COMENTARIOCERRAR=35, TEXTO_COMENTARIO_BLOQUE=36;
	public static final int
		RULE_program = 0, RULE_sentencia = 1, RULE_asignacion = 2, RULE_expresion = 3, 
		RULE_sentencia_if = 4, RULE_declaracion_funcion = 5, RULE_parametros = 6, 
		RULE_llamada_funcion = 7, RULE_argumentos = 8, RULE_sentencia_match = 9, 
		RULE_casos_match = 10, RULE_valores_match = 11, RULE_caso_match = 12, 
		RULE_sentencia_show = 13, RULE_comentario = 14, RULE_textos = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentencia", "asignacion", "expresion", "sentencia_if", "declaracion_funcion", 
			"parametros", "llamada_funcion", "argumentos", "sentencia_match", "casos_match", 
			"valores_match", "caso_match", "sentencia_show", "comentario", "textos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "'('", "')'", "'|'", 
			"'?'", "'->'", null, "','", "'='", "';'", "'+'", "'-'", "'*'", "'/'", 
			"'<'", "'>'", "'<='", "'>='", "'!='", null, null, null, null, "'%%'", 
			"'<*'", "'\\r\\n'", null, "'*>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "IF", "THEN", "ELSE", "FUN", "MATCH", "WITH", "SHOW", "PARENTESIS_IZQUIERDO", 
			"PARENTESIS_DERECHO", "SEPARADOR_MATCH", "INTERROGACION", "FLECHA_DERECHA", 
			"LITERAL_CADENA", "COMA", "IGUAL", "PUNTO_Y_COMA", "OP_SUMA", "OP_RESTA", 
			"OP_MULT", "OP_DIV", "OP_MENOR_ESTRICTO", "OP_MAYOR_ESTRICTO", "OP_MENOR_IGUAL", 
			"OP_MAYOR_IGUAL", "OP_DISTINTO", "IDENTIFICADOR", "REAL", "SALTO_LINEA", 
			"ESPACIOS", "COMENTARIOLINEA", "COMENTARIOABRIR", "FINAL_COMENTARIO_LINEA", 
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
	public String getGrammarFileName() { return "linguineParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public linguineParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(linguineParser.PUNTO_Y_COMA); }
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(linguineParser.PUNTO_Y_COMA, i);
		}
		public List<ComentarioContext> comentario() {
			return getRuleContexts(ComentarioContext.class);
		}
		public ComentarioContext comentario(int i) {
			return getRuleContext(ComentarioContext.class,i);
		}
		public List<TerminalNode> SALTO_LINEA() { return getTokens(linguineParser.SALTO_LINEA); }
		public TerminalNode SALTO_LINEA(int i) {
			return getToken(linguineParser.SALTO_LINEA, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6576669030L) != 0)) {
				{
				setState(44);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LET:
				case IF:
				case FUN:
				case MATCH:
				case SHOW:
				case IDENTIFICADOR:
					{
					{
					setState(32);
					sentencia();
					setState(33);
					match(PUNTO_Y_COMA);
					setState(35);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(34);
						comentario();
						}
						break;
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SALTO_LINEA) {
						{
						setState(37);
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
					setState(40);
					comentario();
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SALTO_LINEA) {
						{
						setState(41);
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
				setState(48);
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
	public static class SentenciaContext extends ParserRuleContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public Declaracion_funcionContext declaracion_funcion() {
			return getRuleContext(Declaracion_funcionContext.class,0);
		}
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public Sentencia_showContext sentencia_show() {
			return getRuleContext(Sentencia_showContext.class,0);
		}
		public Sentencia_ifContext sentencia_if() {
			return getRuleContext(Sentencia_ifContext.class,0);
		}
		public Sentencia_matchContext sentencia_match() {
			return getRuleContext(Sentencia_matchContext.class,0);
		}
		public SentenciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).enterSentencia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).exitSentencia(this);
		}
	}

	public final SentenciaContext sentencia() throws RecognitionException {
		SentenciaContext _localctx = new SentenciaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencia);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LET:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				asignacion();
				}
				break;
			case FUN:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				declaracion_funcion();
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				llamada_funcion();
				}
				break;
			case SHOW:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				sentencia_show();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				sentencia_if();
				}
				break;
			case MATCH:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				sentencia_match();
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
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(linguineParser.LET, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(linguineParser.IDENTIFICADOR, 0); }
		public TerminalNode IGUAL() { return getToken(linguineParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Sentencia_ifContext sentencia_if() {
			return getRuleContext(Sentencia_ifContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(LET);
			setState(58);
			match(IDENTIFICADOR);
			setState(59);
			match(IGUAL);
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTESIS_IZQUIERDO:
			case IDENTIFICADOR:
			case REAL:
				{
				setState(60);
				expresion(0);
				}
				break;
			case IF:
				{
				setState(61);
				sentencia_if();
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
	public static class ExpresionContext extends ParserRuleContext {
		public TerminalNode REAL() { return getToken(linguineParser.REAL, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(linguineParser.IDENTIFICADOR, 0); }
		public TerminalNode PARENTESIS_IZQUIERDO() { return getToken(linguineParser.PARENTESIS_IZQUIERDO, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PARENTESIS_DERECHO() { return getToken(linguineParser.PARENTESIS_DERECHO, 0); }
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public TerminalNode OP_SUMA() { return getToken(linguineParser.OP_SUMA, 0); }
		public TerminalNode OP_RESTA() { return getToken(linguineParser.OP_RESTA, 0); }
		public TerminalNode OP_MULT() { return getToken(linguineParser.OP_MULT, 0); }
		public TerminalNode OP_DIV() { return getToken(linguineParser.OP_DIV, 0); }
		public TerminalNode OP_MAYOR_ESTRICTO() { return getToken(linguineParser.OP_MAYOR_ESTRICTO, 0); }
		public TerminalNode OP_MENOR_ESTRICTO() { return getToken(linguineParser.OP_MENOR_ESTRICTO, 0); }
		public TerminalNode OP_MAYOR_IGUAL() { return getToken(linguineParser.OP_MAYOR_IGUAL, 0); }
		public TerminalNode OP_MENOR_IGUAL() { return getToken(linguineParser.OP_MENOR_IGUAL, 0); }
		public TerminalNode OP_DISTINTO() { return getToken(linguineParser.OP_DISTINTO, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expresion, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(65);
				match(REAL);
				}
				break;
			case 2:
				{
				setState(66);
				match(IDENTIFICADOR);
				}
				break;
			case 3:
				{
				setState(67);
				match(PARENTESIS_IZQUIERDO);
				setState(68);
				expresion(0);
				setState(69);
				match(PARENTESIS_DERECHO);
				}
				break;
			case 4:
				{
				setState(71);
				llamada_funcion();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(79);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion);
					setState(74);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(75);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 133955584L) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(76);
					expresion(4);
					}
					} 
				}
				setState(81);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class Sentencia_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(linguineParser.IF, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode THEN() { return getToken(linguineParser.THEN, 0); }
		public List<SentenciaContext> sentencia() {
			return getRuleContexts(SentenciaContext.class);
		}
		public SentenciaContext sentencia(int i) {
			return getRuleContext(SentenciaContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(linguineParser.ELSE, 0); }
		public Sentencia_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).enterSentencia_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).exitSentencia_if(this);
		}
	}

	public final Sentencia_ifContext sentencia_if() throws RecognitionException {
		Sentencia_ifContext _localctx = new Sentencia_ifContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sentencia_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(IF);
			setState(83);
			expresion(0);
			setState(84);
			match(THEN);
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(85);
				sentencia();
				}
				break;
			case 2:
				{
				setState(86);
				expresion(0);
				}
				break;
			}
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(89);
				match(ELSE);
				setState(92);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(90);
					sentencia();
					}
					break;
				case 2:
					{
					setState(91);
					expresion(0);
					}
					break;
				}
				}
				break;
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
	public static class Declaracion_funcionContext extends ParserRuleContext {
		public TerminalNode FUN() { return getToken(linguineParser.FUN, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(linguineParser.IDENTIFICADOR, 0); }
		public TerminalNode PARENTESIS_IZQUIERDO() { return getToken(linguineParser.PARENTESIS_IZQUIERDO, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public TerminalNode PARENTESIS_DERECHO() { return getToken(linguineParser.PARENTESIS_DERECHO, 0); }
		public TerminalNode FLECHA_DERECHA() { return getToken(linguineParser.FLECHA_DERECHA, 0); }
		public SentenciaContext sentencia() {
			return getRuleContext(SentenciaContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Declaracion_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).enterDeclaracion_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).exitDeclaracion_funcion(this);
		}
	}

	public final Declaracion_funcionContext declaracion_funcion() throws RecognitionException {
		Declaracion_funcionContext _localctx = new Declaracion_funcionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(FUN);
			setState(97);
			match(IDENTIFICADOR);
			setState(98);
			match(PARENTESIS_IZQUIERDO);
			setState(99);
			parametros();
			setState(100);
			match(PARENTESIS_DERECHO);
			setState(101);
			match(FLECHA_DERECHA);
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(102);
				sentencia();
				}
				break;
			case 2:
				{
				setState(103);
				expresion(0);
				}
				break;
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
	public static class ParametrosContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(linguineParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(linguineParser.COMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).exitParametros(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 402653696L) != 0)) {
				{
				setState(106);
				expresion(0);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(107);
					match(COMA);
					setState(108);
					expresion(0);
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class Llamada_funcionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(linguineParser.IDENTIFICADOR, 0); }
		public TerminalNode PARENTESIS_IZQUIERDO() { return getToken(linguineParser.PARENTESIS_IZQUIERDO, 0); }
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TerminalNode PARENTESIS_DERECHO() { return getToken(linguineParser.PARENTESIS_DERECHO, 0); }
		public Llamada_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).enterLlamada_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).exitLlamada_funcion(this);
		}
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_llamada_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(IDENTIFICADOR);
			setState(117);
			match(PARENTESIS_IZQUIERDO);
			setState(118);
			argumentos();
			setState(119);
			match(PARENTESIS_DERECHO);
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
	public static class ArgumentosContext extends ParserRuleContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(linguineParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(linguineParser.COMA, i);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).exitArgumentos(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 402653696L) != 0)) {
				{
				setState(121);
				expresion(0);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(122);
					match(COMA);
					setState(123);
					expresion(0);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
	public static class Sentencia_matchContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(linguineParser.MATCH, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(linguineParser.IDENTIFICADOR, 0); }
		public TerminalNode WITH() { return getToken(linguineParser.WITH, 0); }
		public Casos_matchContext casos_match() {
			return getRuleContext(Casos_matchContext.class,0);
		}
		public Sentencia_matchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).enterSentencia_match(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).exitSentencia_match(this);
		}
	}

	public final Sentencia_matchContext sentencia_match() throws RecognitionException {
		Sentencia_matchContext _localctx = new Sentencia_matchContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_sentencia_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(MATCH);
			setState(132);
			match(IDENTIFICADOR);
			setState(133);
			match(WITH);
			setState(134);
			casos_match();
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
	public static class Casos_matchContext extends ParserRuleContext {
		public List<Caso_matchContext> caso_match() {
			return getRuleContexts(Caso_matchContext.class);
		}
		public Caso_matchContext caso_match(int i) {
			return getRuleContext(Caso_matchContext.class,i);
		}
		public List<TerminalNode> SALTO_LINEA() { return getTokens(linguineParser.SALTO_LINEA); }
		public TerminalNode SALTO_LINEA(int i) {
			return getToken(linguineParser.SALTO_LINEA, i);
		}
		public Casos_matchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casos_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).enterCasos_match(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).exitCasos_match(this);
		}
	}

	public final Casos_matchContext casos_match() throws RecognitionException {
		Casos_matchContext _localctx = new Casos_matchContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_casos_match);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SALTO_LINEA) {
					{
					setState(136);
					match(SALTO_LINEA);
					}
				}

				setState(139);
				caso_match();
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SEPARADOR_MATCH || _la==SALTO_LINEA );
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
	public static class Valores_matchContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode INTERROGACION() { return getToken(linguineParser.INTERROGACION, 0); }
		public Valores_matchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).enterValores_match(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).exitValores_match(this);
		}
	}

	public final Valores_matchContext valores_match() throws RecognitionException {
		Valores_matchContext _localctx = new Valores_matchContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_valores_match);
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTESIS_IZQUIERDO:
			case IDENTIFICADOR:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				expresion(0);
				}
				break;
			case INTERROGACION:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(INTERROGACION);
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
	public static class Caso_matchContext extends ParserRuleContext {
		public TerminalNode SEPARADOR_MATCH() { return getToken(linguineParser.SEPARADOR_MATCH, 0); }
		public Valores_matchContext valores_match() {
			return getRuleContext(Valores_matchContext.class,0);
		}
		public TerminalNode FLECHA_DERECHA() { return getToken(linguineParser.FLECHA_DERECHA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode LITERAL_CADENA() { return getToken(linguineParser.LITERAL_CADENA, 0); }
		public Caso_matchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caso_match; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).enterCaso_match(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).exitCaso_match(this);
		}
	}

	public final Caso_matchContext caso_match() throws RecognitionException {
		Caso_matchContext _localctx = new Caso_matchContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_caso_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(SEPARADOR_MATCH);
			setState(149);
			valores_match();
			setState(150);
			match(FLECHA_DERECHA);
			setState(153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTESIS_IZQUIERDO:
			case IDENTIFICADOR:
			case REAL:
				{
				setState(151);
				expresion(0);
				}
				break;
			case LITERAL_CADENA:
				{
				setState(152);
				match(LITERAL_CADENA);
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
	public static class Sentencia_showContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(linguineParser.SHOW, 0); }
		public TerminalNode PARENTESIS_IZQUIERDO() { return getToken(linguineParser.PARENTESIS_IZQUIERDO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENTESIS_DERECHO() { return getToken(linguineParser.PARENTESIS_DERECHO, 0); }
		public Sentencia_showContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_show; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).enterSentencia_show(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).exitSentencia_show(this);
		}
	}

	public final Sentencia_showContext sentencia_show() throws RecognitionException {
		Sentencia_showContext _localctx = new Sentencia_showContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sentencia_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(SHOW);
			setState(156);
			match(PARENTESIS_IZQUIERDO);
			setState(157);
			expresion(0);
			setState(158);
			match(PARENTESIS_DERECHO);
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
		public TerminalNode COMENTARIOLINEA() { return getToken(linguineParser.COMENTARIOLINEA, 0); }
		public TerminalNode FINAL_COMENTARIO_LINEA() { return getToken(linguineParser.FINAL_COMENTARIO_LINEA, 0); }
		public List<TextosContext> textos() {
			return getRuleContexts(TextosContext.class);
		}
		public TextosContext textos(int i) {
			return getRuleContext(TextosContext.class,i);
		}
		public TerminalNode COMENTARIOABRIR() { return getToken(linguineParser.COMENTARIOABRIR, 0); }
		public TerminalNode COMENTARIOCERRAR() { return getToken(linguineParser.COMENTARIOCERRAR, 0); }
		public List<TerminalNode> SALTO_LINEA() { return getTokens(linguineParser.SALTO_LINEA); }
		public TerminalNode SALTO_LINEA(int i) {
			return getToken(linguineParser.SALTO_LINEA, i);
		}
		public ComentarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comentario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).enterComentario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).exitComentario(this);
		}
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_comentario);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOLINEA:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(COMENTARIOLINEA);
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTO_COMENTARIO_LINEA || _la==TEXTO_COMENTARIO_BLOQUE) {
					{
					{
					setState(161);
					textos();
					}
					}
					setState(166);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(167);
				match(FINAL_COMENTARIO_LINEA);
				}
				break;
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(168);
				match(COMENTARIOABRIR);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 86436216832L) != 0)) {
					{
					setState(171);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXTO_COMENTARIO_LINEA:
					case TEXTO_COMENTARIO_BLOQUE:
						{
						setState(169);
						textos();
						}
						break;
					case SALTO_LINEA:
						{
						setState(170);
						match(SALTO_LINEA);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
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
		public List<TerminalNode> TEXTO_COMENTARIO_LINEA() { return getTokens(linguineParser.TEXTO_COMENTARIO_LINEA); }
		public TerminalNode TEXTO_COMENTARIO_LINEA(int i) {
			return getToken(linguineParser.TEXTO_COMENTARIO_LINEA, i);
		}
		public List<TerminalNode> TEXTO_COMENTARIO_BLOQUE() { return getTokens(linguineParser.TEXTO_COMENTARIO_BLOQUE); }
		public TerminalNode TEXTO_COMENTARIO_BLOQUE(int i) {
			return getToken(linguineParser.TEXTO_COMENTARIO_BLOQUE, i);
		}
		public TextosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).enterTextos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).exitTextos(this);
		}
	}

	public final TextosContext textos() throws RecognitionException {
		TextosContext _localctx = new TextosContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_textos);
		try {
			int _alt;
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO_COMENTARIO_LINEA:
				enterOuterAlt(_localctx, 1);
				{
				setState(180); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(179);
						match(TEXTO_COMENTARIO_LINEA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(182); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case TEXTO_COMENTARIO_BLOQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(185); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(184);
						match(TEXTO_COMENTARIO_BLOQUE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(187); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
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
		case 3:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001$\u00c0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000$\b\u0000\u0001\u0000"+
		"\u0003\u0000\'\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000+\b\u0000\u0005"+
		"\u0000-\b\u0000\n\u0000\f\u00000\t\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00018\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002?\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003N\b\u0003\n\u0003\f\u0003Q\t\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004X\b"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004]\b\u0004\u0003"+
		"\u0004_\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005i\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006n\b\u0006\n\u0006\f\u0006q\t"+
		"\u0006\u0003\u0006s\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\b}\b\b\n\b\f\b\u0080"+
		"\t\b\u0003\b\u0082\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n"+
		"\u0003\n\u008a\b\n\u0001\n\u0004\n\u008d\b\n\u000b\n\f\n\u008e\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u0093\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0003\f\u009a\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00a3\b\u000e\n\u000e\f\u000e\u00a6\t\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ac\b\u000e"+
		"\n\u000e\f\u000e\u00af\t\u000e\u0001\u000e\u0003\u000e\u00b2\b\u000e\u0001"+
		"\u000f\u0004\u000f\u00b5\b\u000f\u000b\u000f\f\u000f\u00b6\u0001\u000f"+
		"\u0004\u000f\u00ba\b\u000f\u000b\u000f\f\u000f\u00bb\u0003\u000f\u00be"+
		"\b\u000f\u0001\u000f\u0000\u0001\u0006\u0010\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0001"+
		"\u0001\u0000\u0012\u001a\u00d1\u0000.\u0001\u0000\u0000\u0000\u00027\u0001"+
		"\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006H\u0001\u0000\u0000"+
		"\u0000\bR\u0001\u0000\u0000\u0000\n`\u0001\u0000\u0000\u0000\fr\u0001"+
		"\u0000\u0000\u0000\u000et\u0001\u0000\u0000\u0000\u0010\u0081\u0001\u0000"+
		"\u0000\u0000\u0012\u0083\u0001\u0000\u0000\u0000\u0014\u008c\u0001\u0000"+
		"\u0000\u0000\u0016\u0092\u0001\u0000\u0000\u0000\u0018\u0094\u0001\u0000"+
		"\u0000\u0000\u001a\u009b\u0001\u0000\u0000\u0000\u001c\u00b1\u0001\u0000"+
		"\u0000\u0000\u001e\u00bd\u0001\u0000\u0000\u0000 !\u0003\u0002\u0001\u0000"+
		"!#\u0005\u0011\u0000\u0000\"$\u0003\u001c\u000e\u0000#\"\u0001\u0000\u0000"+
		"\u0000#$\u0001\u0000\u0000\u0000$&\u0001\u0000\u0000\u0000%\'\u0005\u001d"+
		"\u0000\u0000&%\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'-\u0001"+
		"\u0000\u0000\u0000(*\u0003\u001c\u000e\u0000)+\u0005\u001d\u0000\u0000"+
		"*)\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+-\u0001\u0000\u0000"+
		"\u0000, \u0001\u0000\u0000\u0000,(\u0001\u0000\u0000\u0000-0\u0001\u0000"+
		"\u0000\u0000.,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/\u0001"+
		"\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u000018\u0003\u0004\u0002"+
		"\u000028\u0003\n\u0005\u000038\u0003\u000e\u0007\u000048\u0003\u001a\r"+
		"\u000058\u0003\b\u0004\u000068\u0003\u0012\t\u000071\u0001\u0000\u0000"+
		"\u000072\u0001\u0000\u0000\u000073\u0001\u0000\u0000\u000074\u0001\u0000"+
		"\u0000\u000075\u0001\u0000\u0000\u000076\u0001\u0000\u0000\u00008\u0003"+
		"\u0001\u0000\u0000\u00009:\u0005\u0001\u0000\u0000:;\u0005\u001b\u0000"+
		"\u0000;>\u0005\u0010\u0000\u0000<?\u0003\u0006\u0003\u0000=?\u0003\b\u0004"+
		"\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?\u0005\u0001"+
		"\u0000\u0000\u0000@A\u0006\u0003\uffff\uffff\u0000AI\u0005\u001c\u0000"+
		"\u0000BI\u0005\u001b\u0000\u0000CD\u0005\t\u0000\u0000DE\u0003\u0006\u0003"+
		"\u0000EF\u0005\n\u0000\u0000FI\u0001\u0000\u0000\u0000GI\u0003\u000e\u0007"+
		"\u0000H@\u0001\u0000\u0000\u0000HB\u0001\u0000\u0000\u0000HC\u0001\u0000"+
		"\u0000\u0000HG\u0001\u0000\u0000\u0000IO\u0001\u0000\u0000\u0000JK\n\u0003"+
		"\u0000\u0000KL\u0007\u0000\u0000\u0000LN\u0003\u0006\u0003\u0004MJ\u0001"+
		"\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000P\u0007\u0001\u0000\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000RS\u0005\u0002\u0000\u0000ST\u0003\u0006\u0003\u0000TW\u0005"+
		"\u0003\u0000\u0000UX\u0003\u0002\u0001\u0000VX\u0003\u0006\u0003\u0000"+
		"WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000X^\u0001\u0000\u0000"+
		"\u0000Y\\\u0005\u0004\u0000\u0000Z]\u0003\u0002\u0001\u0000[]\u0003\u0006"+
		"\u0003\u0000\\Z\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000\u0000]_\u0001"+
		"\u0000\u0000\u0000^Y\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000"+
		"_\t\u0001\u0000\u0000\u0000`a\u0005\u0005\u0000\u0000ab\u0005\u001b\u0000"+
		"\u0000bc\u0005\t\u0000\u0000cd\u0003\f\u0006\u0000de\u0005\n\u0000\u0000"+
		"eh\u0005\r\u0000\u0000fi\u0003\u0002\u0001\u0000gi\u0003\u0006\u0003\u0000"+
		"hf\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000\u0000i\u000b\u0001\u0000"+
		"\u0000\u0000jo\u0003\u0006\u0003\u0000kl\u0005\u000f\u0000\u0000ln\u0003"+
		"\u0006\u0003\u0000mk\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000op\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000rj\u0001\u0000\u0000\u0000rs\u0001\u0000"+
		"\u0000\u0000s\r\u0001\u0000\u0000\u0000tu\u0005\u001b\u0000\u0000uv\u0005"+
		"\t\u0000\u0000vw\u0003\u0010\b\u0000wx\u0005\n\u0000\u0000x\u000f\u0001"+
		"\u0000\u0000\u0000y~\u0003\u0006\u0003\u0000z{\u0005\u000f\u0000\u0000"+
		"{}\u0003\u0006\u0003\u0000|z\u0001\u0000\u0000\u0000}\u0080\u0001\u0000"+
		"\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0081"+
		"y\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0011"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0006\u0000\u0000\u0084\u0085"+
		"\u0005\u001b\u0000\u0000\u0085\u0086\u0005\u0007\u0000\u0000\u0086\u0087"+
		"\u0003\u0014\n\u0000\u0087\u0013\u0001\u0000\u0000\u0000\u0088\u008a\u0005"+
		"\u001d\u0000\u0000\u0089\u0088\u0001\u0000\u0000\u0000\u0089\u008a\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0003"+
		"\u0018\f\u0000\u008c\u0089\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u0015\u0001\u0000\u0000\u0000\u0090\u0093\u0003\u0006"+
		"\u0003\u0000\u0091\u0093\u0005\f\u0000\u0000\u0092\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0017\u0001\u0000\u0000"+
		"\u0000\u0094\u0095\u0005\u000b\u0000\u0000\u0095\u0096\u0003\u0016\u000b"+
		"\u0000\u0096\u0099\u0005\r\u0000\u0000\u0097\u009a\u0003\u0006\u0003\u0000"+
		"\u0098\u009a\u0005\u000e\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u0098\u0001\u0000\u0000\u0000\u009a\u0019\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0005\b\u0000\u0000\u009c\u009d\u0005\t\u0000\u0000\u009d"+
		"\u009e\u0003\u0006\u0003\u0000\u009e\u009f\u0005\n\u0000\u0000\u009f\u001b"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a4\u0005\u001f\u0000\u0000\u00a1\u00a3"+
		"\u0003\u001e\u000f\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a6"+
		"\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a7\u00b2\u0005!\u0000\u0000\u00a8\u00ad\u0005"+
		" \u0000\u0000\u00a9\u00ac\u0003\u001e\u000f\u0000\u00aa\u00ac\u0005\u001d"+
		"\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00aa\u0001\u0000"+
		"\u0000\u0000\u00ac\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000"+
		"\u0000\u0000\u00af\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b2\u0005#\u0000"+
		"\u0000\u00b1\u00a0\u0001\u0000\u0000\u0000\u00b1\u00a8\u0001\u0000\u0000"+
		"\u0000\u00b2\u001d\u0001\u0000\u0000\u0000\u00b3\u00b5\u0005\"\u0000\u0000"+
		"\u00b4\u00b3\u0001\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b7\u00be\u0001\u0000\u0000\u0000\u00b8\u00ba\u0005$\u0000\u0000\u00b9"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc"+
		"\u00be\u0001\u0000\u0000\u0000\u00bd\u00b4\u0001\u0000\u0000\u0000\u00bd"+
		"\u00b9\u0001\u0000\u0000\u0000\u00be\u001f\u0001\u0000\u0000\u0000\u001c"+
		"#&*,.7>HOW\\^hor~\u0081\u0089\u008e\u0092\u0099\u00a4\u00ab\u00ad\u00b1"+
		"\u00b6\u00bb\u00bd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}