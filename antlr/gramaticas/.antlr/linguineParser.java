// Generated from c:/Users/david/Desktop/Universidad/Otro/Github/PDL-PL3/antlr/gramaticas/linguineParser.g4 by ANTLR 4.13.1
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
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentencia", "asignacion", "expresion", "condicion", "sentencia_if", 
			"sentencia_while", "sentencia_for", "declaracion_funcion", "parametros", 
			"llamada_funcion", "argumentos", "sentencia_match", "casos_match", "valores_match", 
			"caso_match", "sentencia_show", "comentario", "textos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'{'", "'}'", "'('", "')'", "'|'", "'?'", "'->'", null, "','", "'='", 
			"';'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", "'!='", 
			"'=='", null, null, null, null, "'%%'", "'<*'", "'\\r\\n'", null, "'*>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "IF", "THEN", "ELSE", "WHILE", "DO", "FOR", "FUN", "MATCH", 
			"WITH", "SHOW", "LLAVE_IZQUIERDA", "LLAVE_DERECHA", "PARENTESIS_IZQUIERDO", 
			"PARENTESIS_DERECHO", "SEPARADOR_MATCH", "INTERROGACION", "FLECHA_DERECHA", 
			"LITERAL_CADENA", "COMA", "IGUAL", "PUNTO_Y_COMA", "OP_SUMA", "OP_RESTA", 
			"OP_MULT", "OP_DIV", "OP_MENOR_ESTRICTO", "OP_MAYOR_ESTRICTO", "OP_MENOR_IGUAL", 
			"OP_MAYOR_IGUAL", "OP_DISTINTO", "OP_EQUIVALENCIA", "IDENTIFICADOR", 
			"REAL", "SALTO_LINEA", "ESPACIOS", "COMENTARIOLINEA", "COMENTARIOABRIR", 
			"FINAL_COMENTARIO_LINEA", "TEXTO_COMENTARIO_LINEA", "COMENTARIOCERRAR", 
			"TEXTO_COMENTARIO_BLOQUE"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 420906797990L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Entre_parentesisContext extends ExpresionContext {
		public TerminalNode PARENTESIS_IZQUIERDO() { return getToken(linguineParser.PARENTESIS_IZQUIERDO, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARENTESIS_DERECHO() { return getToken(linguineParser.PARENTESIS_DERECHO, 0); }
		public Entre_parentesisContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode OP_DIV() { return getToken(linguineParser.OP_DIV, 0); }
		public DivContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumaContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode OP_SUMA() { return getToken(linguineParser.OP_SUMA, 0); }
		public SumaContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MultContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode OP_MULT() { return getToken(linguineParser.OP_MULT, 0); }
		public MultContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LlamadaContext extends ExpresionContext {
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public LlamadaContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ExpresionContext {
		public TerminalNode IDENTIFICADOR() { return getToken(linguineParser.IDENTIFICADOR, 0); }
		public VariableContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RealContext extends ExpresionContext {
		public TerminalNode REAL() { return getToken(linguineParser.REAL, 0); }
		public RealContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RestaContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode OP_RESTA() { return getToken(linguineParser.OP_RESTA, 0); }
		public RestaContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CondContext extends ExpresionContext {
		public CondicionContext condicion() {
			return getRuleContext(CondicionContext.class,0);
		}
		public CondContext(ExpresionContext ctx) { copyFrom(ctx); }
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				_localctx = new RealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(75);
				match(REAL);
				}
				break;
			case 2:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(76);
				match(IDENTIFICADOR);
				}
				break;
			case 3:
				{
				_localctx = new CondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				condicion();
				}
				break;
			case 4:
				{
				_localctx = new Entre_parentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
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
				_localctx = new LlamadaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				llamada_funcion();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(97);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(85);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(86);
						match(OP_MULT);
						setState(87);
						expresion(8);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(88);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(89);
						match(OP_DIV);
						setState(90);
						expresion(7);
						}
						break;
					case 3:
						{
						_localctx = new SumaContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(91);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(92);
						match(OP_SUMA);
						setState(93);
						expresion(6);
						}
						break;
					case 4:
						{
						_localctx = new RestaContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(94);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(95);
						match(OP_RESTA);
						setState(96);
						expresion(5);
						}
						break;
					}
					} 
				}
				setState(101);
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
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFICADOR || _la==REAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(103);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716864L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(104);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final Sentencia_ifContext sentencia_if() throws RecognitionException {
		Sentencia_ifContext _localctx = new Sentencia_ifContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sentencia_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(IF);
			setState(107);
			match(PARENTESIS_IZQUIERDO);
			setState(108);
			condicion();
			setState(109);
			match(PARENTESIS_DERECHO);
			setState(110);
			match(THEN);
			setState(111);
			match(LLAVE_IZQUIERDA);
			{
			setState(112);
			program();
			}
			setState(113);
			match(LLAVE_DERECHA);
			setState(119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(114);
				match(ELSE);
				setState(115);
				match(LLAVE_IZQUIERDA);
				{
				setState(116);
				program();
				}
				setState(117);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final Sentencia_whileContext sentencia_while() throws RecognitionException {
		Sentencia_whileContext _localctx = new Sentencia_whileContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_sentencia_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(WHILE);
			setState(122);
			match(PARENTESIS_IZQUIERDO);
			setState(123);
			condicion();
			setState(124);
			match(PARENTESIS_DERECHO);
			setState(125);
			match(DO);
			setState(126);
			match(LLAVE_IZQUIERDA);
			{
			setState(127);
			program();
			}
			setState(128);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final Sentencia_forContext sentencia_for() throws RecognitionException {
		Sentencia_forContext _localctx = new Sentencia_forContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentencia_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(FOR);
			setState(131);
			match(PARENTESIS_IZQUIERDO);
			setState(132);
			asignacion();
			setState(133);
			match(PUNTO_Y_COMA);
			setState(134);
			condicion();
			setState(135);
			match(PUNTO_Y_COMA);
			setState(136);
			asignacion();
			setState(137);
			match(PARENTESIS_DERECHO);
			setState(138);
			match(LLAVE_IZQUIERDA);
			{
			setState(139);
			program();
			}
			setState(140);
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
	}

	public final Declaracion_funcionContext declaracion_funcion() throws RecognitionException {
		Declaracion_funcionContext _localctx = new Declaracion_funcionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(FUN);
			setState(143);
			match(IDENTIFICADOR);
			setState(144);
			match(PARENTESIS_IZQUIERDO);
			setState(145);
			parametros();
			setState(146);
			match(PARENTESIS_DERECHO);
			setState(147);
			match(FLECHA_DERECHA);
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(148);
				sentencia();
				}
				break;
			case 2:
				{
				setState(149);
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
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(linguineParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(linguineParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> COMA() { return getTokens(linguineParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(linguineParser.COMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(152);
				match(IDENTIFICADOR);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(153);
					match(COMA);
					setState(154);
					match(IDENTIFICADOR);
					}
					}
					setState(159);
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
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_llamada_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(IDENTIFICADOR);
			setState(163);
			match(PARENTESIS_IZQUIERDO);
			setState(164);
			argumentos();
			setState(165);
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
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 25769820160L) != 0)) {
				{
				setState(167);
				expresion(0);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(168);
					match(COMA);
					setState(169);
					expresion(0);
					}
					}
					setState(174);
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
	}

	public final Sentencia_matchContext sentencia_match() throws RecognitionException {
		Sentencia_matchContext _localctx = new Sentencia_matchContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sentencia_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(MATCH);
			setState(178);
			match(IDENTIFICADOR);
			setState(179);
			match(WITH);
			setState(180);
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
	}

	public final Casos_matchContext casos_match() throws RecognitionException {
		Casos_matchContext _localctx = new Casos_matchContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_casos_match);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SALTO_LINEA) {
					{
					setState(182);
					match(SALTO_LINEA);
					}
				}

				setState(185);
				caso_match();
				}
				}
				setState(188); 
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
	}

	public final Valores_matchContext valores_match() throws RecognitionException {
		Valores_matchContext _localctx = new Valores_matchContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_valores_match);
		try {
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTESIS_IZQUIERDO:
			case IDENTIFICADOR:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				expresion(0);
				}
				break;
			case INTERROGACION:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
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
	}

	public final Caso_matchContext caso_match() throws RecognitionException {
		Caso_matchContext _localctx = new Caso_matchContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_caso_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(SEPARADOR_MATCH);
			setState(195);
			valores_match();
			setState(196);
			match(FLECHA_DERECHA);
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTESIS_IZQUIERDO:
			case IDENTIFICADOR:
			case REAL:
				{
				setState(197);
				expresion(0);
				}
				break;
			case LITERAL_CADENA:
				{
				setState(198);
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
	}

	public final Sentencia_showContext sentencia_show() throws RecognitionException {
		Sentencia_showContext _localctx = new Sentencia_showContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sentencia_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(SHOW);
			setState(202);
			match(PARENTESIS_IZQUIERDO);
			setState(203);
			expresion(0);
			setState(204);
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
	}

	public final ComentarioContext comentario() throws RecognitionException {
		ComentarioContext _localctx = new ComentarioContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comentario);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOLINEA:
				enterOuterAlt(_localctx, 1);
				{
				setState(206);
				match(COMENTARIOLINEA);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTO_COMENTARIO_LINEA || _la==TEXTO_COMENTARIO_BLOQUE) {
					{
					{
					setState(207);
					textos();
					}
					}
					setState(212);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(213);
				match(FINAL_COMENTARIO_LINEA);
				}
				break;
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
				match(COMENTARIOABRIR);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5531917877248L) != 0)) {
					{
					setState(217);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXTO_COMENTARIO_LINEA:
					case TEXTO_COMENTARIO_BLOQUE:
						{
						setState(215);
						textos();
						}
						break;
					case SALTO_LINEA:
						{
						setState(216);
						match(SALTO_LINEA);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
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
	}

	public final TextosContext textos() throws RecognitionException {
		TextosContext _localctx = new TextosContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_textos);
		try {
			int _alt;
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO_COMENTARIO_LINEA:
				enterOuterAlt(_localctx, 1);
				{
				setState(226); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(225);
						match(TEXTO_COMENTARIO_LINEA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(228); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case TEXTO_COMENTARIO_BLOQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(231); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(230);
						match(TEXTO_COMENTARIO_BLOQUE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(233); 
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
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 6);
		case 2:
			return precpred(_ctx, 5);
		case 3:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001*\u00ee\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000*\b\u0000\u0001\u0000"+
		"\u0003\u0000-\b\u0000\u0001\u0000\u0001\u0000\u0003\u00001\b\u0000\u0005"+
		"\u00003\b\u0000\n\u0000\f\u00006\t\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001@\b\u0001\u0001\u0002\u0003\u0002C\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003T\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003b\b\u0003\n\u0003\f\u0003"+
		"e\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005x\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0097\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u009c\b\t\n\t\f\t\u009f\t\t\u0003\t\u00a1\b"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0005\u000b\u00ab\b\u000b\n\u000b\f\u000b\u00ae\t\u000b\u0003\u000b"+
		"\u00b0\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0003\r"+
		"\u00b8\b\r\u0001\r\u0004\r\u00bb\b\r\u000b\r\f\r\u00bc\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00c1\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00c8\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0005\u0011\u00d1"+
		"\b\u0011\n\u0011\f\u0011\u00d4\t\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u00da\b\u0011\n\u0011\f\u0011\u00dd\t\u0011\u0001"+
		"\u0011\u0003\u0011\u00e0\b\u0011\u0001\u0012\u0004\u0012\u00e3\b\u0012"+
		"\u000b\u0012\f\u0012\u00e4\u0001\u0012\u0004\u0012\u00e8\b\u0012\u000b"+
		"\u0012\f\u0012\u00e9\u0003\u0012\u00ec\b\u0012\u0001\u0012\u0000\u0001"+
		"\u0006\u0013\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$\u0000\u0002\u0001\u0000!\"\u0001\u0000\u001b"+
		" \u0101\u00004\u0001\u0000\u0000\u0000\u0002?\u0001\u0000\u0000\u0000"+
		"\u0004B\u0001\u0000\u0000\u0000\u0006S\u0001\u0000\u0000\u0000\bf\u0001"+
		"\u0000\u0000\u0000\nj\u0001\u0000\u0000\u0000\fy\u0001\u0000\u0000\u0000"+
		"\u000e\u0082\u0001\u0000\u0000\u0000\u0010\u008e\u0001\u0000\u0000\u0000"+
		"\u0012\u00a0\u0001\u0000\u0000\u0000\u0014\u00a2\u0001\u0000\u0000\u0000"+
		"\u0016\u00af\u0001\u0000\u0000\u0000\u0018\u00b1\u0001\u0000\u0000\u0000"+
		"\u001a\u00ba\u0001\u0000\u0000\u0000\u001c\u00c0\u0001\u0000\u0000\u0000"+
		"\u001e\u00c2\u0001\u0000\u0000\u0000 \u00c9\u0001\u0000\u0000\u0000\""+
		"\u00df\u0001\u0000\u0000\u0000$\u00eb\u0001\u0000\u0000\u0000&\'\u0003"+
		"\u0002\u0001\u0000\')\u0005\u0016\u0000\u0000(*\u0003\"\u0011\u0000)("+
		"\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*,\u0001\u0000\u0000"+
		"\u0000+-\u0005#\u0000\u0000,+\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000"+
		"\u0000-3\u0001\u0000\u0000\u0000.0\u0003\"\u0011\u0000/1\u0005#\u0000"+
		"\u00000/\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u000013\u0001\u0000"+
		"\u0000\u00002&\u0001\u0000\u0000\u00002.\u0001\u0000\u0000\u000036\u0001"+
		"\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000\u0000\u0000"+
		"5\u0001\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u00007@\u0003\u0004"+
		"\u0002\u00008@\u0003\f\u0006\u00009@\u0003\u000e\u0007\u0000:@\u0003\u0010"+
		"\b\u0000;@\u0003\u0014\n\u0000<@\u0003 \u0010\u0000=@\u0003\n\u0005\u0000"+
		">@\u0003\u0018\f\u0000?7\u0001\u0000\u0000\u0000?8\u0001\u0000\u0000\u0000"+
		"?9\u0001\u0000\u0000\u0000?:\u0001\u0000\u0000\u0000?;\u0001\u0000\u0000"+
		"\u0000?<\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000?>\u0001\u0000"+
		"\u0000\u0000@\u0003\u0001\u0000\u0000\u0000AC\u0005\u0001\u0000\u0000"+
		"BA\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0001\u0000\u0000"+
		"\u0000DE\u0005!\u0000\u0000EH\u0005\u0015\u0000\u0000FI\u0003\u0006\u0003"+
		"\u0000GI\u0003\n\u0005\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000"+
		"\u0000I\u0005\u0001\u0000\u0000\u0000JK\u0006\u0003\uffff\uffff\u0000"+
		"KT\u0005\"\u0000\u0000LT\u0005!\u0000\u0000MT\u0003\b\u0004\u0000NO\u0005"+
		"\u000e\u0000\u0000OP\u0003\u0006\u0003\u0000PQ\u0005\u000f\u0000\u0000"+
		"QT\u0001\u0000\u0000\u0000RT\u0003\u0014\n\u0000SJ\u0001\u0000\u0000\u0000"+
		"SL\u0001\u0000\u0000\u0000SM\u0001\u0000\u0000\u0000SN\u0001\u0000\u0000"+
		"\u0000SR\u0001\u0000\u0000\u0000Tc\u0001\u0000\u0000\u0000UV\n\u0007\u0000"+
		"\u0000VW\u0005\u0019\u0000\u0000Wb\u0003\u0006\u0003\bXY\n\u0006\u0000"+
		"\u0000YZ\u0005\u001a\u0000\u0000Zb\u0003\u0006\u0003\u0007[\\\n\u0005"+
		"\u0000\u0000\\]\u0005\u0017\u0000\u0000]b\u0003\u0006\u0003\u0006^_\n"+
		"\u0004\u0000\u0000_`\u0005\u0018\u0000\u0000`b\u0003\u0006\u0003\u0005"+
		"aU\u0001\u0000\u0000\u0000aX\u0001\u0000\u0000\u0000a[\u0001\u0000\u0000"+
		"\u0000a^\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000"+
		"\u0000\u0000cd\u0001\u0000\u0000\u0000d\u0007\u0001\u0000\u0000\u0000"+
		"ec\u0001\u0000\u0000\u0000fg\u0007\u0000\u0000\u0000gh\u0007\u0001\u0000"+
		"\u0000hi\u0007\u0000\u0000\u0000i\t\u0001\u0000\u0000\u0000jk\u0005\u0002"+
		"\u0000\u0000kl\u0005\u000e\u0000\u0000lm\u0003\b\u0004\u0000mn\u0005\u000f"+
		"\u0000\u0000no\u0005\u0003\u0000\u0000op\u0005\f\u0000\u0000pq\u0003\u0000"+
		"\u0000\u0000qw\u0005\r\u0000\u0000rs\u0005\u0004\u0000\u0000st\u0005\f"+
		"\u0000\u0000tu\u0003\u0000\u0000\u0000uv\u0005\r\u0000\u0000vx\u0001\u0000"+
		"\u0000\u0000wr\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u000b"+
		"\u0001\u0000\u0000\u0000yz\u0005\u0005\u0000\u0000z{\u0005\u000e\u0000"+
		"\u0000{|\u0003\b\u0004\u0000|}\u0005\u000f\u0000\u0000}~\u0005\u0006\u0000"+
		"\u0000~\u007f\u0005\f\u0000\u0000\u007f\u0080\u0003\u0000\u0000\u0000"+
		"\u0080\u0081\u0005\r\u0000\u0000\u0081\r\u0001\u0000\u0000\u0000\u0082"+
		"\u0083\u0005\u0007\u0000\u0000\u0083\u0084\u0005\u000e\u0000\u0000\u0084"+
		"\u0085\u0003\u0004\u0002\u0000\u0085\u0086\u0005\u0016\u0000\u0000\u0086"+
		"\u0087\u0003\b\u0004\u0000\u0087\u0088\u0005\u0016\u0000\u0000\u0088\u0089"+
		"\u0003\u0004\u0002\u0000\u0089\u008a\u0005\u000f\u0000\u0000\u008a\u008b"+
		"\u0005\f\u0000\u0000\u008b\u008c\u0003\u0000\u0000\u0000\u008c\u008d\u0005"+
		"\r\u0000\u0000\u008d\u000f\u0001\u0000\u0000\u0000\u008e\u008f\u0005\b"+
		"\u0000\u0000\u008f\u0090\u0005!\u0000\u0000\u0090\u0091\u0005\u000e\u0000"+
		"\u0000\u0091\u0092\u0003\u0012\t\u0000\u0092\u0093\u0005\u000f\u0000\u0000"+
		"\u0093\u0096\u0005\u0012\u0000\u0000\u0094\u0097\u0003\u0002\u0001\u0000"+
		"\u0095\u0097\u0003\u0006\u0003\u0000\u0096\u0094\u0001\u0000\u0000\u0000"+
		"\u0096\u0095\u0001\u0000\u0000\u0000\u0097\u0011\u0001\u0000\u0000\u0000"+
		"\u0098\u009d\u0005!\u0000\u0000\u0099\u009a\u0005\u0014\u0000\u0000\u009a"+
		"\u009c\u0005!\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009f"+
		"\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000\u009f\u009d"+
		"\u0001\u0000\u0000\u0000\u00a0\u0098\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0001\u0000\u0000\u0000\u00a1\u0013\u0001\u0000\u0000\u0000\u00a2\u00a3"+
		"\u0005!\u0000\u0000\u00a3\u00a4\u0005\u000e\u0000\u0000\u00a4\u00a5\u0003"+
		"\u0016\u000b\u0000\u00a5\u00a6\u0005\u000f\u0000\u0000\u00a6\u0015\u0001"+
		"\u0000\u0000\u0000\u00a7\u00ac\u0003\u0006\u0003\u0000\u00a8\u00a9\u0005"+
		"\u0014\u0000\u0000\u00a9\u00ab\u0003\u0006\u0003\u0000\u00aa\u00a8\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001"+
		"\u0000\u0000\u0000\u00ae\u00ac\u0001\u0000\u0000\u0000\u00af\u00a7\u0001"+
		"\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000\u00b0\u0017\u0001"+
		"\u0000\u0000\u0000\u00b1\u00b2\u0005\t\u0000\u0000\u00b2\u00b3\u0005!"+
		"\u0000\u0000\u00b3\u00b4\u0005\n\u0000\u0000\u00b4\u00b5\u0003\u001a\r"+
		"\u0000\u00b5\u0019\u0001\u0000\u0000\u0000\u00b6\u00b8\u0005#\u0000\u0000"+
		"\u00b7\u00b6\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00bb\u0003\u001e\u000f\u0000"+
		"\u00ba\u00b7\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bd\u001b\u0001\u0000\u0000\u0000\u00be\u00c1\u0003\u0006\u0003\u0000"+
		"\u00bf\u00c1\u0005\u0011\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c0\u00bf\u0001\u0000\u0000\u0000\u00c1\u001d\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0005\u0010\u0000\u0000\u00c3\u00c4\u0003\u001c\u000e\u0000"+
		"\u00c4\u00c7\u0005\u0012\u0000\u0000\u00c5\u00c8\u0003\u0006\u0003\u0000"+
		"\u00c6\u00c8\u0005\u0013\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000"+
		"\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u001f\u0001\u0000\u0000\u0000"+
		"\u00c9\u00ca\u0005\u000b\u0000\u0000\u00ca\u00cb\u0005\u000e\u0000\u0000"+
		"\u00cb\u00cc\u0003\u0006\u0003\u0000\u00cc\u00cd\u0005\u000f\u0000\u0000"+
		"\u00cd!\u0001\u0000\u0000\u0000\u00ce\u00d2\u0005%\u0000\u0000\u00cf\u00d1"+
		"\u0003$\u0012\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d3\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001"+
		"\u0000\u0000\u0000\u00d5\u00e0\u0005\'\u0000\u0000\u00d6\u00db\u0005&"+
		"\u0000\u0000\u00d7\u00da\u0003$\u0012\u0000\u00d8\u00da\u0005#\u0000\u0000"+
		"\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000"+
		"\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000"+
		"\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000"+
		"\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00e0\u0005)\u0000\u0000\u00df"+
		"\u00ce\u0001\u0000\u0000\u0000\u00df\u00d6\u0001\u0000\u0000\u0000\u00e0"+
		"#\u0001\u0000\u0000\u0000\u00e1\u00e3\u0005(\u0000\u0000\u00e2\u00e1\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00ec\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e8\u0005*\u0000\u0000\u00e7\u00e6\u0001\u0000"+
		"\u0000\u0000\u00e8\u00e9\u0001\u0000\u0000\u0000\u00e9\u00e7\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00ec\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e2\u0001\u0000\u0000\u0000\u00eb\u00e7\u0001\u0000"+
		"\u0000\u0000\u00ec%\u0001\u0000\u0000\u0000\u001c),024?BHSacw\u0096\u009d"+
		"\u00a0\u00ac\u00af\u00b7\u00bc\u00c0\u00c7\u00d2\u00d9\u00db\u00df\u00e4"+
		"\u00e9\u00eb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}