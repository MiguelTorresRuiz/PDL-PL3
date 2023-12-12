// Generated from linguineParser.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class linguineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
	public static final String[] ruleNames = {
		"program", "sentencia", "asignacion", "expresion", "sentencia_if", "declaracion_funcion", 
		"parametros", "llamada_funcion", "argumentos", "sentencia_match", "casos_match", 
		"valores_match", "caso_match", "sentencia_show", "comentario", "textos"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, "'('", "')'", "'|'", 
		"'?'", "'->'", null, "','", "'='", "';'", "'+'", "'-'", "'*'", "'/'", 
		"'<'", "'>'", "'<='", "'>='", "'!='", null, null, null, null, "'%%'", 
		"'<*'", "'\r\n'", null, "'*>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LET", "IF", "THEN", "ELSE", "FUN", "MATCH", "WITH", "SHOW", "PARENTESIS_IZQUIERDO", 
		"PARENTESIS_DERECHO", "SEPARADOR_MATCH", "INTERROGACION", "FLECHA_DERECHA", 
		"LITERAL_CADENA", "COMA", "IGUAL", "PUNTO_Y_COMA", "OP_SUMA", "OP_RESTA", 
		"OP_MULT", "OP_DIV", "OP_MENOR_ESTRICTO", "OP_MAYOR_ESTRICTO", "OP_MENOR_IGUAL", 
		"OP_MAYOR_IGUAL", "OP_DISTINTO", "IDENTIFICADOR", "REAL", "SALTO_LINEA", 
		"ESPACIOS", "COMENTARIOLINEA", "COMENTARIOABRIR", "FINAL_COMENTARIO_LINEA", 
		"TEXTO_COMENTARIO_LINEA", "COMENTARIOCERRAR", "TEXTO_COMENTARIO_BLOQUE"
	};
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << IF) | (1L << FUN) | (1L << MATCH) | (1L << SHOW) | (1L << IDENTIFICADOR) | (1L << COMENTARIOLINEA) | (1L << COMENTARIOABRIR))) != 0)) {
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
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_SUMA) | (1L << OP_RESTA) | (1L << OP_MULT) | (1L << OP_DIV) | (1L << OP_MENOR_ESTRICTO) | (1L << OP_MAYOR_ESTRICTO) | (1L << OP_MENOR_IGUAL) | (1L << OP_MAYOR_IGUAL) | (1L << OP_DISTINTO))) != 0)) ) {
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTESIS_IZQUIERDO) | (1L << IDENTIFICADOR) | (1L << REAL))) != 0)) {
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTESIS_IZQUIERDO) | (1L << IDENTIFICADOR) | (1L << REAL))) != 0)) {
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SALTO_LINEA) | (1L << TEXTO_COMENTARIO_LINEA) | (1L << TEXTO_COMENTARIO_BLOQUE))) != 0)) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u00c2\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2\3"+
		"\2\5\2&\n\2\3\2\5\2)\n\2\3\2\3\2\5\2-\n\2\7\2/\n\2\f\2\16\2\62\13\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\5\5K\n\5\3\5\3\5\3\5\7\5P\n\5\f\5\16\5S\13\5\3"+
		"\6\3\6\3\6\3\6\3\6\5\6Z\n\6\3\6\3\6\3\6\5\6_\n\6\5\6a\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7k\n\7\3\b\3\b\3\b\7\bp\n\b\f\b\16\bs\13\b\5\b"+
		"u\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\177\n\n\f\n\16\n\u0082\13\n"+
		"\5\n\u0084\n\n\3\13\3\13\3\13\3\13\3\13\3\f\5\f\u008c\n\f\3\f\6\f\u008f"+
		"\n\f\r\f\16\f\u0090\3\r\3\r\5\r\u0095\n\r\3\16\3\16\3\16\3\16\3\16\5\16"+
		"\u009c\n\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\7\20\u00a5\n\20\f\20\16"+
		"\20\u00a8\13\20\3\20\3\20\3\20\3\20\7\20\u00ae\n\20\f\20\16\20\u00b1\13"+
		"\20\3\20\5\20\u00b4\n\20\3\21\6\21\u00b7\n\21\r\21\16\21\u00b8\3\21\6"+
		"\21\u00bc\n\21\r\21\16\21\u00bd\5\21\u00c0\n\21\3\21\2\3\b\22\2\4\6\b"+
		"\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\2\24\34\2\u00d3\2\60\3\2\2\2\4"+
		"9\3\2\2\2\6;\3\2\2\2\bJ\3\2\2\2\nT\3\2\2\2\fb\3\2\2\2\16t\3\2\2\2\20v"+
		"\3\2\2\2\22\u0083\3\2\2\2\24\u0085\3\2\2\2\26\u008e\3\2\2\2\30\u0094\3"+
		"\2\2\2\32\u0096\3\2\2\2\34\u009d\3\2\2\2\36\u00b3\3\2\2\2 \u00bf\3\2\2"+
		"\2\"#\5\4\3\2#%\7\23\2\2$&\5\36\20\2%$\3\2\2\2%&\3\2\2\2&(\3\2\2\2\')"+
		"\7\37\2\2(\'\3\2\2\2()\3\2\2\2)/\3\2\2\2*,\5\36\20\2+-\7\37\2\2,+\3\2"+
		"\2\2,-\3\2\2\2-/\3\2\2\2.\"\3\2\2\2.*\3\2\2\2/\62\3\2\2\2\60.\3\2\2\2"+
		"\60\61\3\2\2\2\61\3\3\2\2\2\62\60\3\2\2\2\63:\5\6\4\2\64:\5\f\7\2\65:"+
		"\5\20\t\2\66:\5\34\17\2\67:\5\n\6\28:\5\24\13\29\63\3\2\2\29\64\3\2\2"+
		"\29\65\3\2\2\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2:\5\3\2\2\2;<\7\3\2\2"+
		"<=\7\35\2\2=@\7\22\2\2>A\5\b\5\2?A\5\n\6\2@>\3\2\2\2@?\3\2\2\2A\7\3\2"+
		"\2\2BC\b\5\1\2CK\7\36\2\2DK\7\35\2\2EF\7\13\2\2FG\5\b\5\2GH\7\f\2\2HK"+
		"\3\2\2\2IK\5\20\t\2JB\3\2\2\2JD\3\2\2\2JE\3\2\2\2JI\3\2\2\2KQ\3\2\2\2"+
		"LM\f\5\2\2MN\t\2\2\2NP\5\b\5\6OL\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2"+
		"R\t\3\2\2\2SQ\3\2\2\2TU\7\4\2\2UV\5\b\5\2VY\7\5\2\2WZ\5\4\3\2XZ\5\b\5"+
		"\2YW\3\2\2\2YX\3\2\2\2Z`\3\2\2\2[^\7\6\2\2\\_\5\4\3\2]_\5\b\5\2^\\\3\2"+
		"\2\2^]\3\2\2\2_a\3\2\2\2`[\3\2\2\2`a\3\2\2\2a\13\3\2\2\2bc\7\7\2\2cd\7"+
		"\35\2\2de\7\13\2\2ef\5\16\b\2fg\7\f\2\2gj\7\17\2\2hk\5\4\3\2ik\5\b\5\2"+
		"jh\3\2\2\2ji\3\2\2\2k\r\3\2\2\2lq\5\b\5\2mn\7\21\2\2np\5\b\5\2om\3\2\2"+
		"\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2ru\3\2\2\2sq\3\2\2\2tl\3\2\2\2tu\3\2\2"+
		"\2u\17\3\2\2\2vw\7\35\2\2wx\7\13\2\2xy\5\22\n\2yz\7\f\2\2z\21\3\2\2\2"+
		"{\u0080\5\b\5\2|}\7\21\2\2}\177\5\b\5\2~|\3\2\2\2\177\u0082\3\2\2\2\u0080"+
		"~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2"+
		"\u0083{\3\2\2\2\u0083\u0084\3\2\2\2\u0084\23\3\2\2\2\u0085\u0086\7\b\2"+
		"\2\u0086\u0087\7\35\2\2\u0087\u0088\7\t\2\2\u0088\u0089\5\26\f\2\u0089"+
		"\25\3\2\2\2\u008a\u008c\7\37\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2"+
		"\2\u008c\u008d\3\2\2\2\u008d\u008f\5\32\16\2\u008e\u008b\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\27\3\2\2"+
		"\2\u0092\u0095\5\b\5\2\u0093\u0095\7\16\2\2\u0094\u0092\3\2\2\2\u0094"+
		"\u0093\3\2\2\2\u0095\31\3\2\2\2\u0096\u0097\7\r\2\2\u0097\u0098\5\30\r"+
		"\2\u0098\u009b\7\17\2\2\u0099\u009c\5\b\5\2\u009a\u009c\7\20\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009a\3\2\2\2\u009c\33\3\2\2\2\u009d\u009e\7\n\2"+
		"\2\u009e\u009f\7\13\2\2\u009f\u00a0\5\b\5\2\u00a0\u00a1\7\f\2\2\u00a1"+
		"\35\3\2\2\2\u00a2\u00a6\7!\2\2\u00a3\u00a5\5 \21\2\u00a4\u00a3\3\2\2\2"+
		"\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a7\u00a9"+
		"\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00b4\7#\2\2\u00aa\u00af\7\"\2\2\u00ab"+
		"\u00ae\5 \21\2\u00ac\u00ae\7\37\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3"+
		"\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b4\7%\2\2\u00b3\u00a2\3\2"+
		"\2\2\u00b3\u00aa\3\2\2\2\u00b4\37\3\2\2\2\u00b5\u00b7\7$\2\2\u00b6\u00b5"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00c0\3\2\2\2\u00ba\u00bc\7&\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00bb\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf"+
		"\u00b6\3\2\2\2\u00bf\u00bb\3\2\2\2\u00c0!\3\2\2\2\36%(,.\609@JQY^`jqt"+
		"\u0080\u0083\u008b\u0090\u0094\u009b\u00a6\u00ad\u00af\u00b3\u00b8\u00bd"+
		"\u00bf";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}