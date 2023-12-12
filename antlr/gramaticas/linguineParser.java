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
		LET=1, IF=2, THEN=3, ELSE=4, WHILE=5, DO=6, FOR=7, FUN=8, MATCH=9, WITH=10, 
		SHOW=11, LLAVE_IZQUIERDA=12, LLAVE_DERECHA=13, PARENTESIS_IZQUIERDO=14, 
		PARENTESIS_DERECHO=15, SEPARADOR_MATCH=16, INTERROGACION=17, FLECHA_DERECHA=18, 
		LITERAL_CADENA=19, COMA=20, IGUAL=21, PUNTO_Y_COMA=22, OP_SUMA=23, OP_RESTA=24, 
		OP_MULT=25, OP_DIV=26, OP_MENOR_ESTRICTO=27, OP_MAYOR_ESTRICTO=28, OP_MENOR_IGUAL=29, 
		OP_MAYOR_IGUAL=30, OP_DISTINTO=31, OP_EQUIVALENCIA=32, IDENTIFICADOR=33, 
		REAL=34, SALTO_LINEA=35, ESPACIOS=36, COMENTARIOLINEA=37, COMENTARIOABRIR=38, 
		FINAL_COMENTARIO_LINEA=39, TEXTO_COMENTARIO_LINEA=40, COMENTARIOCERRAR=41, 
		TEXTO_COMENTARIO_BLOQUE=42;
	public static final int
		RULE_program = 0, RULE_sentencia = 1, RULE_asignacion = 2, RULE_expresion = 3, 
		RULE_condicion = 4, RULE_sentencia_if = 5, RULE_sentencia_while = 6, RULE_sentencia_for = 7, 
		RULE_declaracion_funcion = 8, RULE_parametros = 9, RULE_llamada_funcion = 10, 
		RULE_argumentos = 11, RULE_sentencia_match = 12, RULE_casos_match = 13, 
		RULE_valores_match = 14, RULE_caso_match = 15, RULE_sentencia_show = 16, 
		RULE_comentario = 17, RULE_textos = 18;
	public static final String[] ruleNames = {
		"program", "sentencia", "asignacion", "expresion", "condicion", "sentencia_if", 
		"sentencia_while", "sentencia_for", "declaracion_funcion", "parametros", 
		"llamada_funcion", "argumentos", "sentencia_match", "casos_match", "valores_match", 
		"caso_match", "sentencia_show", "comentario", "textos"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"'{'", "'}'", "'('", "')'", "'|'", "'?'", "'->'", null, "','", "'='", 
		"';'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", "'!='", 
		"'=='", null, null, null, null, "'%%'", "'<*'", "'\r\n'", null, "'*>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LET", "IF", "THEN", "ELSE", "WHILE", "DO", "FOR", "FUN", "MATCH", 
		"WITH", "SHOW", "LLAVE_IZQUIERDA", "LLAVE_DERECHA", "PARENTESIS_IZQUIERDO", 
		"PARENTESIS_DERECHO", "SEPARADOR_MATCH", "INTERROGACION", "FLECHA_DERECHA", 
		"LITERAL_CADENA", "COMA", "IGUAL", "PUNTO_Y_COMA", "OP_SUMA", "OP_RESTA", 
		"OP_MULT", "OP_DIV", "OP_MENOR_ESTRICTO", "OP_MAYOR_ESTRICTO", "OP_MENOR_IGUAL", 
		"OP_MAYOR_IGUAL", "OP_DISTINTO", "OP_EQUIVALENCIA", "IDENTIFICADOR", "REAL", 
		"SALTO_LINEA", "ESPACIOS", "COMENTARIOLINEA", "COMENTARIOABRIR", "FINAL_COMENTARIO_LINEA", 
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
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LET) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << FUN) | (1L << MATCH) | (1L << SHOW) | (1L << IDENTIFICADOR) | (1L << COMENTARIOLINEA) | (1L << COMENTARIOABRIR))) != 0)) {
				{
				setState(50);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LET:
				case IF:
				case WHILE:
				case FOR:
				case FUN:
				case MATCH:
				case SHOW:
				case IDENTIFICADOR:
					{
					{
					setState(38);
					sentencia();
					setState(39);
					match(PUNTO_Y_COMA);
					setState(41);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(40);
						comentario();
						}
						break;
					}
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SALTO_LINEA) {
						{
						setState(43);
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
					setState(46);
					comentario();
					setState(48);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SALTO_LINEA) {
						{
						setState(47);
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
				setState(54);
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
		public Sentencia_whileContext sentencia_while() {
			return getRuleContext(Sentencia_whileContext.class,0);
		}
		public Sentencia_forContext sentencia_for() {
			return getRuleContext(Sentencia_forContext.class,0);
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
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				sentencia_while();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				sentencia_for();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(58);
				declaracion_funcion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(59);
				llamada_funcion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(60);
				sentencia_show();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(61);
				sentencia_if();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(62);
				sentencia_match();
				}
				break;
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
		public TerminalNode IDENTIFICADOR() { return getToken(linguineParser.IDENTIFICADOR, 0); }
		public TerminalNode IGUAL() { return getToken(linguineParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Sentencia_ifContext sentencia_if() {
			return getRuleContext(Sentencia_ifContext.class,0);
		}
		public TerminalNode LET() { return getToken(linguineParser.LET, 0); }
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(65);
				match(LET);
				}
			}

			setState(68);
			match(IDENTIFICADOR);
			setState(69);
			match(IGUAL);
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTESIS_IZQUIERDO:
			case IDENTIFICADOR:
			case REAL:
				{
				setState(70);
				expresion(0);
				}
				break;
			case IF:
				{
				setState(71);
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
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
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
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(75);
				match(REAL);
				}
				break;
			case 2:
				{
				setState(76);
				match(IDENTIFICADOR);
				}
				break;
			case 3:
				{
				setState(77);
				condicion();
				}
				break;
			case 4:
				{
				setState(78);
				match(PARENTESIS_IZQUIERDO);
				setState(79);
				expresion(0);
				setState(80);
				match(PARENTESIS_DERECHO);
				}
				break;
			case 5:
				{
				setState(82);
				llamada_funcion();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpresionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_expresion);
					setState(85);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(86);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_SUMA) | (1L << OP_RESTA) | (1L << OP_MULT) | (1L << OP_DIV))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(87);
					expresion(5);
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
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

	public static class CondicionContext extends ParserRuleContext {
		public List<TerminalNode> REAL() { return getTokens(linguineParser.REAL); }
		public TerminalNode REAL(int i) {
			return getToken(linguineParser.REAL, i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(linguineParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(linguineParser.IDENTIFICADOR, i);
		}
		public TerminalNode OP_MAYOR_ESTRICTO() { return getToken(linguineParser.OP_MAYOR_ESTRICTO, 0); }
		public TerminalNode OP_MENOR_ESTRICTO() { return getToken(linguineParser.OP_MENOR_ESTRICTO, 0); }
		public TerminalNode OP_MAYOR_IGUAL() { return getToken(linguineParser.OP_MAYOR_IGUAL, 0); }
		public TerminalNode OP_MENOR_IGUAL() { return getToken(linguineParser.OP_MENOR_IGUAL, 0); }
		public TerminalNode OP_DISTINTO() { return getToken(linguineParser.OP_DISTINTO, 0); }
		public TerminalNode OP_EQUIVALENCIA() { return getToken(linguineParser.OP_EQUIVALENCIA, 0); }
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).exitCondicion(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFICADOR || _la==REAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(94);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << OP_MENOR_ESTRICTO) | (1L << OP_MAYOR_ESTRICTO) | (1L << OP_MENOR_IGUAL) | (1L << OP_MAYOR_IGUAL) | (1L << OP_DISTINTO) | (1L << OP_EQUIVALENCIA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFICADOR || _la==REAL) ) {
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

	public static class Sentencia_ifContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(linguineParser.IF, 0); }
		public TerminalNode PARENTESIS_IZQUIERDO() { return getToken(linguineParser.PARENTESIS_IZQUIERDO, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PARENTESIS_DERECHO() { return getToken(linguineParser.PARENTESIS_DERECHO, 0); }
		public TerminalNode THEN() { return getToken(linguineParser.THEN, 0); }
		public List<TerminalNode> LLAVE_IZQUIERDA() { return getTokens(linguineParser.LLAVE_IZQUIERDA); }
		public TerminalNode LLAVE_IZQUIERDA(int i) {
			return getToken(linguineParser.LLAVE_IZQUIERDA, i);
		}
		public List<TerminalNode> LLAVE_DERECHA() { return getTokens(linguineParser.LLAVE_DERECHA); }
		public TerminalNode LLAVE_DERECHA(int i) {
			return getToken(linguineParser.LLAVE_DERECHA, i);
		}
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
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
		enterRule(_localctx, 10, RULE_sentencia_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IF);
			setState(98);
			match(PARENTESIS_IZQUIERDO);
			setState(99);
			condicion();
			setState(100);
			match(PARENTESIS_DERECHO);
			setState(101);
			match(THEN);
			setState(102);
			match(LLAVE_IZQUIERDA);
			{
			setState(103);
			program();
			}
			setState(104);
			match(LLAVE_DERECHA);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(105);
				match(ELSE);
				setState(106);
				match(LLAVE_IZQUIERDA);
				{
				setState(107);
				program();
				}
				setState(108);
				match(LLAVE_DERECHA);
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

	public static class Sentencia_whileContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(linguineParser.WHILE, 0); }
		public TerminalNode PARENTESIS_IZQUIERDO() { return getToken(linguineParser.PARENTESIS_IZQUIERDO, 0); }
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PARENTESIS_DERECHO() { return getToken(linguineParser.PARENTESIS_DERECHO, 0); }
		public TerminalNode DO() { return getToken(linguineParser.DO, 0); }
		public TerminalNode LLAVE_IZQUIERDA() { return getToken(linguineParser.LLAVE_IZQUIERDA, 0); }
		public TerminalNode LLAVE_DERECHA() { return getToken(linguineParser.LLAVE_DERECHA, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public Sentencia_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_while; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).enterSentencia_while(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).exitSentencia_while(this);
		}
	}

	public final Sentencia_whileContext sentencia_while() throws RecognitionException {
		Sentencia_whileContext _localctx = new Sentencia_whileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentencia_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(WHILE);
			setState(113);
			match(PARENTESIS_IZQUIERDO);
			setState(114);
			condicion();
			setState(115);
			match(PARENTESIS_DERECHO);
			setState(116);
			match(DO);
			setState(117);
			match(LLAVE_IZQUIERDA);
			{
			setState(118);
			program();
			}
			setState(119);
			match(LLAVE_DERECHA);
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

	public static class Sentencia_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(linguineParser.FOR, 0); }
		public TerminalNode PARENTESIS_IZQUIERDO() { return getToken(linguineParser.PARENTESIS_IZQUIERDO, 0); }
		public List<AsignacionContext> asignacion() {
			return getRuleContexts(AsignacionContext.class);
		}
		public AsignacionContext asignacion(int i) {
			return getRuleContext(AsignacionContext.class,i);
		}
		public List<TerminalNode> PUNTO_Y_COMA() { return getTokens(linguineParser.PUNTO_Y_COMA); }
		public TerminalNode PUNTO_Y_COMA(int i) {
			return getToken(linguineParser.PUNTO_Y_COMA, i);
		}
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public TerminalNode PARENTESIS_DERECHO() { return getToken(linguineParser.PARENTESIS_DERECHO, 0); }
		public TerminalNode LLAVE_IZQUIERDA() { return getToken(linguineParser.LLAVE_IZQUIERDA, 0); }
		public TerminalNode LLAVE_DERECHA() { return getToken(linguineParser.LLAVE_DERECHA, 0); }
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
		}
		public Sentencia_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).enterSentencia_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof linguineParserListener ) ((linguineParserListener)listener).exitSentencia_for(this);
		}
	}

	public final Sentencia_forContext sentencia_for() throws RecognitionException {
		Sentencia_forContext _localctx = new Sentencia_forContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentencia_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(FOR);
			setState(122);
			match(PARENTESIS_IZQUIERDO);
			setState(123);
			asignacion();
			setState(124);
			match(PUNTO_Y_COMA);
			setState(125);
			condicion();
			setState(126);
			match(PUNTO_Y_COMA);
			setState(127);
			asignacion();
			setState(128);
			match(PARENTESIS_DERECHO);
			setState(129);
			match(LLAVE_IZQUIERDA);
			{
			setState(130);
			program();
			}
			setState(131);
			match(LLAVE_DERECHA);
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
		enterRule(_localctx, 16, RULE_declaracion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(FUN);
			setState(134);
			match(IDENTIFICADOR);
			setState(135);
			match(PARENTESIS_IZQUIERDO);
			setState(136);
			parametros();
			setState(137);
			match(PARENTESIS_DERECHO);
			setState(138);
			match(FLECHA_DERECHA);
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(139);
				sentencia();
				}
				break;
			case 2:
				{
				setState(140);
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
		enterRule(_localctx, 18, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTESIS_IZQUIERDO) | (1L << IDENTIFICADOR) | (1L << REAL))) != 0)) {
				{
				setState(143);
				expresion(0);
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(144);
					match(COMA);
					setState(145);
					expresion(0);
					}
					}
					setState(150);
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
		enterRule(_localctx, 20, RULE_llamada_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(IDENTIFICADOR);
			setState(154);
			match(PARENTESIS_IZQUIERDO);
			setState(155);
			argumentos();
			setState(156);
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
		enterRule(_localctx, 22, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PARENTESIS_IZQUIERDO) | (1L << IDENTIFICADOR) | (1L << REAL))) != 0)) {
				{
				setState(158);
				expresion(0);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(159);
					match(COMA);
					setState(160);
					expresion(0);
					}
					}
					setState(165);
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
		enterRule(_localctx, 24, RULE_sentencia_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(MATCH);
			setState(169);
			match(IDENTIFICADOR);
			setState(170);
			match(WITH);
			setState(171);
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
		enterRule(_localctx, 26, RULE_casos_match);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SALTO_LINEA) {
					{
					setState(173);
					match(SALTO_LINEA);
					}
				}

				setState(176);
				caso_match();
				}
				}
				setState(179); 
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
		enterRule(_localctx, 28, RULE_valores_match);
		try {
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTESIS_IZQUIERDO:
			case IDENTIFICADOR:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				expresion(0);
				}
				break;
			case INTERROGACION:
				enterOuterAlt(_localctx, 2);
				{
				setState(182);
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
		enterRule(_localctx, 30, RULE_caso_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(SEPARADOR_MATCH);
			setState(186);
			valores_match();
			setState(187);
			match(FLECHA_DERECHA);
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTESIS_IZQUIERDO:
			case IDENTIFICADOR:
			case REAL:
				{
				setState(188);
				expresion(0);
				}
				break;
			case LITERAL_CADENA:
				{
				setState(189);
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
		enterRule(_localctx, 32, RULE_sentencia_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(SHOW);
			setState(193);
			match(PARENTESIS_IZQUIERDO);
			setState(194);
			expresion(0);
			setState(195);
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
		enterRule(_localctx, 34, RULE_comentario);
		int _la;
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOLINEA:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(COMENTARIOLINEA);
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTO_COMENTARIO_LINEA || _la==TEXTO_COMENTARIO_BLOQUE) {
					{
					{
					setState(198);
					textos();
					}
					}
					setState(203);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(204);
				match(FINAL_COMENTARIO_LINEA);
				}
				break;
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(COMENTARIOABRIR);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SALTO_LINEA) | (1L << TEXTO_COMENTARIO_LINEA) | (1L << TEXTO_COMENTARIO_BLOQUE))) != 0)) {
					{
					setState(208);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXTO_COMENTARIO_LINEA:
					case TEXTO_COMENTARIO_BLOQUE:
						{
						setState(206);
						textos();
						}
						break;
					case SALTO_LINEA:
						{
						setState(207);
						match(SALTO_LINEA);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
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
		enterRule(_localctx, 36, RULE_textos);
		try {
			int _alt;
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO_COMENTARIO_LINEA:
				enterOuterAlt(_localctx, 1);
				{
				setState(217); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(216);
						match(TEXTO_COMENTARIO_LINEA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(219); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case TEXTO_COMENTARIO_BLOQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(222); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(221);
						match(TEXTO_COMENTARIO_BLOQUE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(224); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00e7\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\2\5\2,\n\2\3\2\5\2/\n\2\3\2\3\2\5\2\63"+
		"\n\2\7\2\65\n\2\f\2\16\28\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n"+
		"\3\3\4\5\4E\n\4\3\4\3\4\3\4\3\4\5\4K\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5V\n\5\3\5\3\5\3\5\7\5[\n\5\f\5\16\5^\13\5\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0090\n\n\3\13\3\13\3\13\7\13"+
		"\u0095\n\13\f\13\16\13\u0098\13\13\5\13\u009a\n\13\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\7\r\u00a4\n\r\f\r\16\r\u00a7\13\r\5\r\u00a9\n\r\3\16\3\16"+
		"\3\16\3\16\3\16\3\17\5\17\u00b1\n\17\3\17\6\17\u00b4\n\17\r\17\16\17\u00b5"+
		"\3\20\3\20\5\20\u00ba\n\20\3\21\3\21\3\21\3\21\3\21\5\21\u00c1\n\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\23\3\23\7\23\u00ca\n\23\f\23\16\23\u00cd\13"+
		"\23\3\23\3\23\3\23\3\23\7\23\u00d3\n\23\f\23\16\23\u00d6\13\23\3\23\5"+
		"\23\u00d9\n\23\3\24\6\24\u00dc\n\24\r\24\16\24\u00dd\3\24\6\24\u00e1\n"+
		"\24\r\24\16\24\u00e2\5\24\u00e5\n\24\3\24\2\3\b\25\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&\2\5\3\2\31\34\3\2#$\3\2\35\"\2\u00f7\2\66\3\2"+
		"\2\2\4A\3\2\2\2\6D\3\2\2\2\bU\3\2\2\2\n_\3\2\2\2\fc\3\2\2\2\16r\3\2\2"+
		"\2\20{\3\2\2\2\22\u0087\3\2\2\2\24\u0099\3\2\2\2\26\u009b\3\2\2\2\30\u00a8"+
		"\3\2\2\2\32\u00aa\3\2\2\2\34\u00b3\3\2\2\2\36\u00b9\3\2\2\2 \u00bb\3\2"+
		"\2\2\"\u00c2\3\2\2\2$\u00d8\3\2\2\2&\u00e4\3\2\2\2()\5\4\3\2)+\7\30\2"+
		"\2*,\5$\23\2+*\3\2\2\2+,\3\2\2\2,.\3\2\2\2-/\7%\2\2.-\3\2\2\2./\3\2\2"+
		"\2/\65\3\2\2\2\60\62\5$\23\2\61\63\7%\2\2\62\61\3\2\2\2\62\63\3\2\2\2"+
		"\63\65\3\2\2\2\64(\3\2\2\2\64\60\3\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66"+
		"\67\3\2\2\2\67\3\3\2\2\28\66\3\2\2\29B\5\6\4\2:B\5\16\b\2;B\5\20\t\2<"+
		"B\5\22\n\2=B\5\26\f\2>B\5\"\22\2?B\5\f\7\2@B\5\32\16\2A9\3\2\2\2A:\3\2"+
		"\2\2A;\3\2\2\2A<\3\2\2\2A=\3\2\2\2A>\3\2\2\2A?\3\2\2\2A@\3\2\2\2B\5\3"+
		"\2\2\2CE\7\3\2\2DC\3\2\2\2DE\3\2\2\2EF\3\2\2\2FG\7#\2\2GJ\7\27\2\2HK\5"+
		"\b\5\2IK\5\f\7\2JH\3\2\2\2JI\3\2\2\2K\7\3\2\2\2LM\b\5\1\2MV\7$\2\2NV\7"+
		"#\2\2OV\5\n\6\2PQ\7\20\2\2QR\5\b\5\2RS\7\21\2\2SV\3\2\2\2TV\5\26\f\2U"+
		"L\3\2\2\2UN\3\2\2\2UO\3\2\2\2UP\3\2\2\2UT\3\2\2\2V\\\3\2\2\2WX\f\6\2\2"+
		"XY\t\2\2\2Y[\5\b\5\7ZW\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]\t\3\2"+
		"\2\2^\\\3\2\2\2_`\t\3\2\2`a\t\4\2\2ab\t\3\2\2b\13\3\2\2\2cd\7\4\2\2de"+
		"\7\20\2\2ef\5\n\6\2fg\7\21\2\2gh\7\5\2\2hi\7\16\2\2ij\5\2\2\2jp\7\17\2"+
		"\2kl\7\6\2\2lm\7\16\2\2mn\5\2\2\2no\7\17\2\2oq\3\2\2\2pk\3\2\2\2pq\3\2"+
		"\2\2q\r\3\2\2\2rs\7\7\2\2st\7\20\2\2tu\5\n\6\2uv\7\21\2\2vw\7\b\2\2wx"+
		"\7\16\2\2xy\5\2\2\2yz\7\17\2\2z\17\3\2\2\2{|\7\t\2\2|}\7\20\2\2}~\5\6"+
		"\4\2~\177\7\30\2\2\177\u0080\5\n\6\2\u0080\u0081\7\30\2\2\u0081\u0082"+
		"\5\6\4\2\u0082\u0083\7\21\2\2\u0083\u0084\7\16\2\2\u0084\u0085\5\2\2\2"+
		"\u0085\u0086\7\17\2\2\u0086\21\3\2\2\2\u0087\u0088\7\n\2\2\u0088\u0089"+
		"\7#\2\2\u0089\u008a\7\20\2\2\u008a\u008b\5\24\13\2\u008b\u008c\7\21\2"+
		"\2\u008c\u008f\7\24\2\2\u008d\u0090\5\4\3\2\u008e\u0090\5\b\5\2\u008f"+
		"\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\23\3\2\2\2\u0091\u0096\5\b\5"+
		"\2\u0092\u0093\7\26\2\2\u0093\u0095\5\b\5\2\u0094\u0092\3\2\2\2\u0095"+
		"\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u009a\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0099\u0091\3\2\2\2\u0099\u009a\3\2\2\2\u009a"+
		"\25\3\2\2\2\u009b\u009c\7#\2\2\u009c\u009d\7\20\2\2\u009d\u009e\5\30\r"+
		"\2\u009e\u009f\7\21\2\2\u009f\27\3\2\2\2\u00a0\u00a5\5\b\5\2\u00a1\u00a2"+
		"\7\26\2\2\u00a2\u00a4\5\b\5\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2\2\2"+
		"\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00a0\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\31\3\2\2\2\u00aa"+
		"\u00ab\7\13\2\2\u00ab\u00ac\7#\2\2\u00ac\u00ad\7\f\2\2\u00ad\u00ae\5\34"+
		"\17\2\u00ae\33\3\2\2\2\u00af\u00b1\7%\2\2\u00b0\u00af\3\2\2\2\u00b0\u00b1"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\5 \21\2\u00b3\u00b0\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\35\3\2\2"+
		"\2\u00b7\u00ba\5\b\5\2\u00b8\u00ba\7\23\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\37\3\2\2\2\u00bb\u00bc\7\22\2\2\u00bc\u00bd\5\36"+
		"\20\2\u00bd\u00c0\7\24\2\2\u00be\u00c1\5\b\5\2\u00bf\u00c1\7\25\2\2\u00c0"+
		"\u00be\3\2\2\2\u00c0\u00bf\3\2\2\2\u00c1!\3\2\2\2\u00c2\u00c3\7\r\2\2"+
		"\u00c3\u00c4\7\20\2\2\u00c4\u00c5\5\b\5\2\u00c5\u00c6\7\21\2\2\u00c6#"+
		"\3\2\2\2\u00c7\u00cb\7\'\2\2\u00c8\u00ca\5&\24\2\u00c9\u00c8\3\2\2\2\u00ca"+
		"\u00cd\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2"+
		"\2\2\u00cd\u00cb\3\2\2\2\u00ce\u00d9\7)\2\2\u00cf\u00d4\7(\2\2\u00d0\u00d3"+
		"\5&\24\2\u00d1\u00d3\7%\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d1\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2"+
		"\2\2\u00d6\u00d4\3\2\2\2\u00d7\u00d9\7+\2\2\u00d8\u00c7\3\2\2\2\u00d8"+
		"\u00cf\3\2\2\2\u00d9%\3\2\2\2\u00da\u00dc\7*\2\2\u00db\u00da\3\2\2\2\u00dc"+
		"\u00dd\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00e5\3\2"+
		"\2\2\u00df\u00e1\7,\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e5\3\2\2\2\u00e4\u00db\3\2"+
		"\2\2\u00e4\u00e0\3\2\2\2\u00e5\'\3\2\2\2\35+.\62\64\66ADJU\\p\u008f\u0096"+
		"\u0099\u00a5\u00a8\u00b0\u00b5\u00b9\u00c0\u00cb\u00d2\u00d4\u00d8\u00dd"+
		"\u00e2\u00e4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}