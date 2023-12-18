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
		SHOW=11, AND=12, OR=13, LLAVE_IZQUIERDA=14, LLAVE_DERECHA=15, PARENTESIS_IZQUIERDO=16, 
		PARENTESIS_DERECHO=17, SEPARADOR_MATCH=18, INTERROGACION=19, CORCHETE_IZQUIERDO=20, 
		CORCHETE_DERECHO=21, FLECHA_DERECHA=22, LITERAL_CADENA=23, COMA=24, IGUAL=25, 
		PUNTO_Y_COMA=26, DOS_PUNTOS=27, OP_SUMA=28, OP_RESTA=29, OP_MULT=30, OP_DIV=31, 
		OP_MENOR_ESTRICTO=32, OP_MAYOR_ESTRICTO=33, OP_MENOR_IGUAL=34, OP_MAYOR_IGUAL=35, 
		OP_DISTINTO=36, OP_EQUIVALENCIA=37, BOOLEANO=38, TRUE=39, FALSE=40, IDENTIFICADOR=41, 
		REAL=42, SALTO_LINEA=43, ESPACIOS=44, COMENTARIOLINEA=45, COMENTARIOABRIR=46, 
		FINAL_COMENTARIO_LINEA=47, TEXTO_COMENTARIO_LINEA=48, COMENTARIOCERRAR=49, 
		TEXTO_COMENTARIO_BLOQUE=50;
	public static final int
		RULE_program = 0, RULE_sentencia = 1, RULE_arreglo = 2, RULE_mapa = 3, 
		RULE_asignacion = 4, RULE_expresion = 5, RULE_condicion = 6, RULE_cortar_cadena = 7, 
		RULE_sentencia_if = 8, RULE_sentencia_while = 9, RULE_sentencia_for = 10, 
		RULE_declaracion_funcion = 11, RULE_parametros = 12, RULE_llamada_funcion = 13, 
		RULE_argumentos = 14, RULE_sentencia_match = 15, RULE_casos_match = 16, 
		RULE_valores_match = 17, RULE_caso_match = 18, RULE_sentencia_show = 19, 
		RULE_comentario = 20, RULE_textos = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sentencia", "arreglo", "mapa", "asignacion", "expresion", 
			"condicion", "cortar_cadena", "sentencia_if", "sentencia_while", "sentencia_for", 
			"declaracion_funcion", "parametros", "llamada_funcion", "argumentos", 
			"sentencia_match", "casos_match", "valores_match", "caso_match", "sentencia_show", 
			"comentario", "textos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "'{'", "'}'", "'('", "')'", "'|'", "'?'", "'['", "']'", "'->'", 
			null, "','", "'='", "';'", "':'", "'+'", "'-'", "'*'", "'/'", "'<'", 
			"'>'", "'<='", "'>='", "'!='", "'=='", null, "'true'", "'false'", null, 
			null, null, null, "'%%'", "'<*'", "'\\r\\n'", null, "'*>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LET", "IF", "THEN", "ELSE", "WHILE", "DO", "FOR", "FUN", "MATCH", 
			"WITH", "SHOW", "AND", "OR", "LLAVE_IZQUIERDA", "LLAVE_DERECHA", "PARENTESIS_IZQUIERDO", 
			"PARENTESIS_DERECHO", "SEPARADOR_MATCH", "INTERROGACION", "CORCHETE_IZQUIERDO", 
			"CORCHETE_DERECHO", "FLECHA_DERECHA", "LITERAL_CADENA", "COMA", "IGUAL", 
			"PUNTO_Y_COMA", "DOS_PUNTOS", "OP_SUMA", "OP_RESTA", "OP_MULT", "OP_DIV", 
			"OP_MENOR_ESTRICTO", "OP_MAYOR_ESTRICTO", "OP_MENOR_IGUAL", "OP_MAYOR_IGUAL", 
			"OP_DISTINTO", "OP_EQUIVALENCIA", "BOOLEANO", "TRUE", "FALSE", "IDENTIFICADOR", 
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
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 112425072397222L) != 0)) {
				{
				setState(56);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LET:
				case IF:
				case WHILE:
				case FOR:
				case FUN:
				case MATCH:
				case SHOW:
				case PARENTESIS_IZQUIERDO:
				case LITERAL_CADENA:
				case BOOLEANO:
				case IDENTIFICADOR:
				case REAL:
					{
					{
					setState(44);
					sentencia();
					setState(45);
					match(PUNTO_Y_COMA);
					setState(47);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(46);
						comentario();
						}
						break;
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SALTO_LINEA) {
						{
						setState(49);
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
					setState(52);
					comentario();
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SALTO_LINEA) {
						{
						setState(53);
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
				setState(60);
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
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
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
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(61);
				asignacion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				sentencia_while();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(63);
				sentencia_for();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(64);
				declaracion_funcion();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(65);
				llamada_funcion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				sentencia_show();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				sentencia_if();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(68);
				sentencia_match();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(69);
				expresion(0);
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
	public static class ArregloContext extends ParserRuleContext {
		public TerminalNode CORCHETE_IZQUIERDO() { return getToken(linguineParser.CORCHETE_IZQUIERDO, 0); }
		public TerminalNode CORCHETE_DERECHO() { return getToken(linguineParser.CORCHETE_DERECHO, 0); }
		public List<TerminalNode> REAL() { return getTokens(linguineParser.REAL); }
		public TerminalNode REAL(int i) {
			return getToken(linguineParser.REAL, i);
		}
		public List<TerminalNode> BOOLEANO() { return getTokens(linguineParser.BOOLEANO); }
		public TerminalNode BOOLEANO(int i) {
			return getToken(linguineParser.BOOLEANO, i);
		}
		public List<TerminalNode> LITERAL_CADENA() { return getTokens(linguineParser.LITERAL_CADENA); }
		public TerminalNode LITERAL_CADENA(int i) {
			return getToken(linguineParser.LITERAL_CADENA, i);
		}
		public List<TerminalNode> COMA() { return getTokens(linguineParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(linguineParser.COMA, i);
		}
		public ArregloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arreglo; }
	}

	public final ArregloContext arreglo() throws RecognitionException {
		ArregloContext _localctx = new ArregloContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_arreglo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(CORCHETE_IZQUIERDO);
			{
			setState(73);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4672932806656L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(74);
				match(COMA);
				setState(75);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4672932806656L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(81);
			match(CORCHETE_DERECHO);
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
	public static class MapaContext extends ParserRuleContext {
		public TerminalNode LLAVE_IZQUIERDA() { return getToken(linguineParser.LLAVE_IZQUIERDA, 0); }
		public TerminalNode LLAVE_DERECHA() { return getToken(linguineParser.LLAVE_DERECHA, 0); }
		public List<TerminalNode> DOS_PUNTOS() { return getTokens(linguineParser.DOS_PUNTOS); }
		public TerminalNode DOS_PUNTOS(int i) {
			return getToken(linguineParser.DOS_PUNTOS, i);
		}
		public List<TerminalNode> REAL() { return getTokens(linguineParser.REAL); }
		public TerminalNode REAL(int i) {
			return getToken(linguineParser.REAL, i);
		}
		public List<TerminalNode> LITERAL_CADENA() { return getTokens(linguineParser.LITERAL_CADENA); }
		public TerminalNode LITERAL_CADENA(int i) {
			return getToken(linguineParser.LITERAL_CADENA, i);
		}
		public List<TerminalNode> BOOLEANO() { return getTokens(linguineParser.BOOLEANO); }
		public TerminalNode BOOLEANO(int i) {
			return getToken(linguineParser.BOOLEANO, i);
		}
		public List<TerminalNode> COMA() { return getTokens(linguineParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(linguineParser.COMA, i);
		}
		public List<TerminalNode> SALTO_LINEA() { return getTokens(linguineParser.SALTO_LINEA); }
		public TerminalNode SALTO_LINEA(int i) {
			return getToken(linguineParser.SALTO_LINEA, i);
		}
		public MapaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapa; }
	}

	public final MapaContext mapa() throws RecognitionException {
		MapaContext _localctx = new MapaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mapa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(LLAVE_IZQUIERDA);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !(_la==LITERAL_CADENA || _la==REAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(85);
			match(DOS_PUNTOS);
			setState(86);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4672932806656L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA || _la==SALTO_LINEA) {
				{
				{
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SALTO_LINEA) {
					{
					setState(88);
					match(SALTO_LINEA);
					}
				}

				setState(91);
				match(COMA);
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SALTO_LINEA) {
					{
					setState(92);
					match(SALTO_LINEA);
					}
				}

				setState(95);
				_la = _input.LA(1);
				if ( !(_la==LITERAL_CADENA || _la==REAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(96);
				match(DOS_PUNTOS);
				setState(97);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4672932806656L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(103);
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
	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(linguineParser.IDENTIFICADOR, 0); }
		public TerminalNode IGUAL() { return getToken(linguineParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Sentencia_ifContext sentencia_if() {
			return getRuleContext(Sentencia_ifContext.class,0);
		}
		public Cortar_cadenaContext cortar_cadena() {
			return getRuleContext(Cortar_cadenaContext.class,0);
		}
		public ArregloContext arreglo() {
			return getRuleContext(ArregloContext.class,0);
		}
		public MapaContext mapa() {
			return getRuleContext(MapaContext.class,0);
		}
		public TerminalNode LET() { return getToken(linguineParser.LET, 0); }
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_asignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LET) {
				{
				setState(105);
				match(LET);
				}
			}

			setState(108);
			match(IDENTIFICADOR);
			setState(109);
			match(IGUAL);
			setState(115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(110);
				expresion(0);
				}
				break;
			case 2:
				{
				setState(111);
				sentencia_if();
				}
				break;
			case 3:
				{
				setState(112);
				cortar_cadena();
				}
				break;
			case 4:
				{
				setState(113);
				arreglo();
				}
				break;
			case 5:
				{
				setState(114);
				mapa();
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
	public static class BooleanoContext extends ExpresionContext {
		public TerminalNode BOOLEANO() { return getToken(linguineParser.BOOLEANO, 0); }
		public BooleanoContext(ExpresionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CadenaContext extends ExpresionContext {
		public TerminalNode LITERAL_CADENA() { return getToken(linguineParser.LITERAL_CADENA, 0); }
		public CadenaContext(ExpresionContext ctx) { copyFrom(ctx); }
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
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				_localctx = new RealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(118);
				match(REAL);
				}
				break;
			case 2:
				{
				_localctx = new BooleanoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(119);
				match(BOOLEANO);
				}
				break;
			case 3:
				{
				_localctx = new CadenaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(120);
				match(LITERAL_CADENA);
				}
				break;
			case 4:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(121);
				match(IDENTIFICADOR);
				}
				break;
			case 5:
				{
				_localctx = new CondContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(122);
				condicion();
				}
				break;
			case 6:
				{
				_localctx = new Entre_parentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(123);
				match(PARENTESIS_IZQUIERDO);
				setState(124);
				expresion(0);
				setState(125);
				match(PARENTESIS_DERECHO);
				}
				break;
			case 7:
				{
				_localctx = new LlamadaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				llamada_funcion();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(142);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new MultContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(130);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(131);
						match(OP_MULT);
						setState(132);
						expresion(8);
						}
						break;
					case 2:
						{
						_localctx = new DivContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(133);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(134);
						match(OP_DIV);
						setState(135);
						expresion(7);
						}
						break;
					case 3:
						{
						_localctx = new SumaContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(136);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(137);
						match(OP_SUMA);
						setState(138);
						expresion(6);
						}
						break;
					case 4:
						{
						_localctx = new RestaContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(139);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(140);
						match(OP_RESTA);
						setState(141);
						expresion(5);
						}
						break;
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
		enterRule(_localctx, 12, RULE_condicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFICADOR || _la==REAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(148);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 270582939648L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(149);
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
	public static class Cortar_cadenaContext extends ParserRuleContext {
		public TerminalNode LITERAL_CADENA() { return getToken(linguineParser.LITERAL_CADENA, 0); }
		public TerminalNode CORCHETE_IZQUIERDO() { return getToken(linguineParser.CORCHETE_IZQUIERDO, 0); }
		public List<TerminalNode> REAL() { return getTokens(linguineParser.REAL); }
		public TerminalNode REAL(int i) {
			return getToken(linguineParser.REAL, i);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(linguineParser.DOS_PUNTOS, 0); }
		public TerminalNode CORCHETE_DERECHO() { return getToken(linguineParser.CORCHETE_DERECHO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(linguineParser.IDENTIFICADOR, 0); }
		public Cortar_cadenaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cortar_cadena; }
	}

	public final Cortar_cadenaContext cortar_cadena() throws RecognitionException {
		Cortar_cadenaContext _localctx = new Cortar_cadenaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cortar_cadena);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LITERAL_CADENA:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(LITERAL_CADENA);
				setState(152);
				match(CORCHETE_IZQUIERDO);
				setState(153);
				match(REAL);
				setState(154);
				match(DOS_PUNTOS);
				setState(155);
				match(REAL);
				setState(156);
				match(CORCHETE_DERECHO);
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				match(IDENTIFICADOR);
				setState(158);
				match(CORCHETE_IZQUIERDO);
				setState(159);
				match(REAL);
				setState(160);
				match(DOS_PUNTOS);
				setState(161);
				match(REAL);
				setState(162);
				match(CORCHETE_DERECHO);
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
		enterRule(_localctx, 16, RULE_sentencia_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(IF);
			setState(166);
			match(PARENTESIS_IZQUIERDO);
			setState(167);
			condicion();
			setState(168);
			match(PARENTESIS_DERECHO);
			setState(169);
			match(THEN);
			setState(170);
			match(LLAVE_IZQUIERDA);
			{
			setState(171);
			program();
			}
			setState(172);
			match(LLAVE_DERECHA);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(173);
				match(ELSE);
				setState(174);
				match(LLAVE_IZQUIERDA);
				{
				setState(175);
				program();
				}
				setState(176);
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
		enterRule(_localctx, 18, RULE_sentencia_while);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(WHILE);
			setState(181);
			match(PARENTESIS_IZQUIERDO);
			setState(182);
			condicion();
			setState(183);
			match(PARENTESIS_DERECHO);
			setState(184);
			match(DO);
			setState(185);
			match(LLAVE_IZQUIERDA);
			{
			setState(186);
			program();
			}
			setState(187);
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
		enterRule(_localctx, 20, RULE_sentencia_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(FOR);
			setState(190);
			match(PARENTESIS_IZQUIERDO);
			setState(191);
			asignacion();
			setState(192);
			match(PUNTO_Y_COMA);
			setState(193);
			condicion();
			setState(194);
			match(PUNTO_Y_COMA);
			setState(195);
			asignacion();
			setState(196);
			match(PARENTESIS_DERECHO);
			setState(197);
			match(LLAVE_IZQUIERDA);
			{
			setState(198);
			program();
			}
			setState(199);
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
		public ProgramContext program() {
			return getRuleContext(ProgramContext.class,0);
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
		enterRule(_localctx, 22, RULE_declaracion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(FUN);
			setState(202);
			match(IDENTIFICADOR);
			setState(203);
			match(PARENTESIS_IZQUIERDO);
			setState(204);
			parametros();
			setState(205);
			match(PARENTESIS_DERECHO);
			setState(206);
			match(FLECHA_DERECHA);
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(207);
				program();
				}
				break;
			case 2:
				{
				setState(208);
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
		enterRule(_localctx, 24, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(211);
				match(IDENTIFICADOR);
				setState(216);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(212);
					match(COMA);
					setState(213);
					match(IDENTIFICADOR);
					}
					}
					setState(218);
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
		enterRule(_localctx, 26, RULE_llamada_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(IDENTIFICADOR);
			setState(222);
			match(PARENTESIS_IZQUIERDO);
			setState(223);
			argumentos();
			setState(224);
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
		enterRule(_localctx, 28, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 6871956127744L) != 0)) {
				{
				setState(226);
				expresion(0);
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(227);
					match(COMA);
					setState(228);
					expresion(0);
					}
					}
					setState(233);
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
		enterRule(_localctx, 30, RULE_sentencia_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(MATCH);
			setState(237);
			match(IDENTIFICADOR);
			setState(238);
			match(WITH);
			setState(239);
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
		enterRule(_localctx, 32, RULE_casos_match);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SALTO_LINEA) {
					{
					setState(241);
					match(SALTO_LINEA);
					}
				}

				setState(244);
				caso_match();
				}
				}
				setState(247); 
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
		enterRule(_localctx, 34, RULE_valores_match);
		try {
			setState(251);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PARENTESIS_IZQUIERDO:
			case LITERAL_CADENA:
			case BOOLEANO:
			case IDENTIFICADOR:
			case REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(249);
				expresion(0);
				}
				break;
			case INTERROGACION:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
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
		enterRule(_localctx, 36, RULE_caso_match);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			match(SEPARADOR_MATCH);
			setState(254);
			valores_match();
			setState(255);
			match(FLECHA_DERECHA);
			setState(258);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(256);
				expresion(0);
				}
				break;
			case 2:
				{
				setState(257);
				match(LITERAL_CADENA);
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
		enterRule(_localctx, 38, RULE_sentencia_show);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(SHOW);
			setState(261);
			match(PARENTESIS_IZQUIERDO);
			setState(262);
			expresion(0);
			setState(263);
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
		enterRule(_localctx, 40, RULE_comentario);
		int _la;
		try {
			setState(282);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMENTARIOLINEA:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				match(COMENTARIOLINEA);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==TEXTO_COMENTARIO_LINEA || _la==TEXTO_COMENTARIO_BLOQUE) {
					{
					{
					setState(266);
					textos();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
				match(FINAL_COMENTARIO_LINEA);
				}
				break;
			case COMENTARIOABRIR:
				enterOuterAlt(_localctx, 2);
				{
				setState(273);
				match(COMENTARIOABRIR);
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1416170976575488L) != 0)) {
					{
					setState(276);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case TEXTO_COMENTARIO_LINEA:
					case TEXTO_COMENTARIO_BLOQUE:
						{
						setState(274);
						textos();
						}
						break;
					case SALTO_LINEA:
						{
						setState(275);
						match(SALTO_LINEA);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(280);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(281);
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
		enterRule(_localctx, 42, RULE_textos);
		try {
			int _alt;
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO_COMENTARIO_LINEA:
				enterOuterAlt(_localctx, 1);
				{
				setState(285); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(284);
						match(TEXTO_COMENTARIO_LINEA);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(287); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case TEXTO_COMENTARIO_BLOQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(290); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(289);
						match(TEXTO_COMENTARIO_BLOQUE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(292); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		case 5:
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
		"\u0004\u00012\u0129\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u00000\b\u0000\u0001\u0000"+
		"\u0003\u00003\b\u0000\u0001\u0000\u0001\u0000\u0003\u00007\b\u0000\u0005"+
		"\u00009\b\u0000\n\u0000\f\u0000<\t\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001G\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002M\b\u0002\n\u0002\f\u0002P\t\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0003\u0003Z\b\u0003\u0001\u0003\u0001\u0003\u0003\u0003^\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003c\b\u0003\n\u0003\f\u0003"+
		"f\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0003\u0004k\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004t\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u0081\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u008f\b\u0005\n"+
		"\u0005\f\u0005\u0092\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00a4\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003"+
		"\b\u00b3\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00d2\b\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00d7\b\f\n\f\f\f\u00da"+
		"\t\f\u0003\f\u00dc\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0005\u000e\u00e6\b\u000e\n\u000e\f\u000e\u00e9"+
		"\t\u000e\u0003\u000e\u00eb\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0003\u0010\u00f3\b\u0010\u0001\u0010"+
		"\u0004\u0010\u00f6\b\u0010\u000b\u0010\f\u0010\u00f7\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00fc\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u0103\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0005\u0014\u010c"+
		"\b\u0014\n\u0014\f\u0014\u010f\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014\u0115\b\u0014\n\u0014\f\u0014\u0118\t\u0014\u0001"+
		"\u0014\u0003\u0014\u011b\b\u0014\u0001\u0015\u0004\u0015\u011e\b\u0015"+
		"\u000b\u0015\f\u0015\u011f\u0001\u0015\u0004\u0015\u0123\b\u0015\u000b"+
		"\u0015\f\u0015\u0124\u0003\u0015\u0127\b\u0015\u0001\u0015\u0000\u0001"+
		"\n\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*\u0000\u0004\u0003\u0000\u0017\u0017&&**\u0002"+
		"\u0000\u0017\u0017**\u0001\u0000)*\u0001\u0000 %\u0144\u0000:\u0001\u0000"+
		"\u0000\u0000\u0002F\u0001\u0000\u0000\u0000\u0004H\u0001\u0000\u0000\u0000"+
		"\u0006S\u0001\u0000\u0000\u0000\bj\u0001\u0000\u0000\u0000\n\u0080\u0001"+
		"\u0000\u0000\u0000\f\u0093\u0001\u0000\u0000\u0000\u000e\u00a3\u0001\u0000"+
		"\u0000\u0000\u0010\u00a5\u0001\u0000\u0000\u0000\u0012\u00b4\u0001\u0000"+
		"\u0000\u0000\u0014\u00bd\u0001\u0000\u0000\u0000\u0016\u00c9\u0001\u0000"+
		"\u0000\u0000\u0018\u00db\u0001\u0000\u0000\u0000\u001a\u00dd\u0001\u0000"+
		"\u0000\u0000\u001c\u00ea\u0001\u0000\u0000\u0000\u001e\u00ec\u0001\u0000"+
		"\u0000\u0000 \u00f5\u0001\u0000\u0000\u0000\"\u00fb\u0001\u0000\u0000"+
		"\u0000$\u00fd\u0001\u0000\u0000\u0000&\u0104\u0001\u0000\u0000\u0000("+
		"\u011a\u0001\u0000\u0000\u0000*\u0126\u0001\u0000\u0000\u0000,-\u0003"+
		"\u0002\u0001\u0000-/\u0005\u001a\u0000\u0000.0\u0003(\u0014\u0000/.\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u000002\u0001\u0000\u0000\u0000"+
		"13\u0005+\u0000\u000021\u0001\u0000\u0000\u000023\u0001\u0000\u0000\u0000"+
		"39\u0001\u0000\u0000\u000046\u0003(\u0014\u000057\u0005+\u0000\u00006"+
		"5\u0001\u0000\u0000\u000067\u0001\u0000\u0000\u000079\u0001\u0000\u0000"+
		"\u00008,\u0001\u0000\u0000\u000084\u0001\u0000\u0000\u00009<\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;\u0001"+
		"\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=G\u0003\b\u0004\u0000"+
		">G\u0003\u0012\t\u0000?G\u0003\u0014\n\u0000@G\u0003\u0016\u000b\u0000"+
		"AG\u0003\u001a\r\u0000BG\u0003&\u0013\u0000CG\u0003\u0010\b\u0000DG\u0003"+
		"\u001e\u000f\u0000EG\u0003\n\u0005\u0000F=\u0001\u0000\u0000\u0000F>\u0001"+
		"\u0000\u0000\u0000F?\u0001\u0000\u0000\u0000F@\u0001\u0000\u0000\u0000"+
		"FA\u0001\u0000\u0000\u0000FB\u0001\u0000\u0000\u0000FC\u0001\u0000\u0000"+
		"\u0000FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000G\u0003\u0001"+
		"\u0000\u0000\u0000HI\u0005\u0014\u0000\u0000IN\u0007\u0000\u0000\u0000"+
		"JK\u0005\u0018\u0000\u0000KM\u0007\u0000\u0000\u0000LJ\u0001\u0000\u0000"+
		"\u0000MP\u0001\u0000\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000"+
		"\u0000\u0000OQ\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000QR\u0005"+
		"\u0015\u0000\u0000R\u0005\u0001\u0000\u0000\u0000ST\u0005\u000e\u0000"+
		"\u0000TU\u0007\u0001\u0000\u0000UV\u0005\u001b\u0000\u0000VW\u0007\u0000"+
		"\u0000\u0000Wd\u0001\u0000\u0000\u0000XZ\u0005+\u0000\u0000YX\u0001\u0000"+
		"\u0000\u0000YZ\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[]\u0005"+
		"\u0018\u0000\u0000\\^\u0005+\u0000\u0000]\\\u0001\u0000\u0000\u0000]^"+
		"\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_`\u0007\u0001\u0000"+
		"\u0000`a\u0005\u001b\u0000\u0000ac\u0007\u0000\u0000\u0000bY\u0001\u0000"+
		"\u0000\u0000cf\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001"+
		"\u0000\u0000\u0000eg\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"gh\u0005\u000f\u0000\u0000h\u0007\u0001\u0000\u0000\u0000ik\u0005\u0001"+
		"\u0000\u0000ji\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kl\u0001"+
		"\u0000\u0000\u0000lm\u0005)\u0000\u0000ms\u0005\u0019\u0000\u0000nt\u0003"+
		"\n\u0005\u0000ot\u0003\u0010\b\u0000pt\u0003\u000e\u0007\u0000qt\u0003"+
		"\u0004\u0002\u0000rt\u0003\u0006\u0003\u0000sn\u0001\u0000\u0000\u0000"+
		"so\u0001\u0000\u0000\u0000sp\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000"+
		"\u0000sr\u0001\u0000\u0000\u0000t\t\u0001\u0000\u0000\u0000uv\u0006\u0005"+
		"\uffff\uffff\u0000v\u0081\u0005*\u0000\u0000w\u0081\u0005&\u0000\u0000"+
		"x\u0081\u0005\u0017\u0000\u0000y\u0081\u0005)\u0000\u0000z\u0081\u0003"+
		"\f\u0006\u0000{|\u0005\u0010\u0000\u0000|}\u0003\n\u0005\u0000}~\u0005"+
		"\u0011\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f\u0081\u0003\u001a"+
		"\r\u0000\u0080u\u0001\u0000\u0000\u0000\u0080w\u0001\u0000\u0000\u0000"+
		"\u0080x\u0001\u0000\u0000\u0000\u0080y\u0001\u0000\u0000\u0000\u0080z"+
		"\u0001\u0000\u0000\u0000\u0080{\u0001\u0000\u0000\u0000\u0080\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\u0090\u0001\u0000\u0000\u0000\u0082\u0083\n\u0007"+
		"\u0000\u0000\u0083\u0084\u0005\u001e\u0000\u0000\u0084\u008f\u0003\n\u0005"+
		"\b\u0085\u0086\n\u0006\u0000\u0000\u0086\u0087\u0005\u001f\u0000\u0000"+
		"\u0087\u008f\u0003\n\u0005\u0007\u0088\u0089\n\u0005\u0000\u0000\u0089"+
		"\u008a\u0005\u001c\u0000\u0000\u008a\u008f\u0003\n\u0005\u0006\u008b\u008c"+
		"\n\u0004\u0000\u0000\u008c\u008d\u0005\u001d\u0000\u0000\u008d\u008f\u0003"+
		"\n\u0005\u0005\u008e\u0082\u0001\u0000\u0000\u0000\u008e\u0085\u0001\u0000"+
		"\u0000\u0000\u008e\u0088\u0001\u0000\u0000\u0000\u008e\u008b\u0001\u0000"+
		"\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u000b\u0001\u0000"+
		"\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0007\u0002"+
		"\u0000\u0000\u0094\u0095\u0007\u0003\u0000\u0000\u0095\u0096\u0007\u0002"+
		"\u0000\u0000\u0096\r\u0001\u0000\u0000\u0000\u0097\u0098\u0005\u0017\u0000"+
		"\u0000\u0098\u0099\u0005\u0014\u0000\u0000\u0099\u009a\u0005*\u0000\u0000"+
		"\u009a\u009b\u0005\u001b\u0000\u0000\u009b\u009c\u0005*\u0000\u0000\u009c"+
		"\u00a4\u0005\u0015\u0000\u0000\u009d\u009e\u0005)\u0000\u0000\u009e\u009f"+
		"\u0005\u0014\u0000\u0000\u009f\u00a0\u0005*\u0000\u0000\u00a0\u00a1\u0005"+
		"\u001b\u0000\u0000\u00a1\u00a2\u0005*\u0000\u0000\u00a2\u00a4\u0005\u0015"+
		"\u0000\u0000\u00a3\u0097\u0001\u0000\u0000\u0000\u00a3\u009d\u0001\u0000"+
		"\u0000\u0000\u00a4\u000f\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0002"+
		"\u0000\u0000\u00a6\u00a7\u0005\u0010\u0000\u0000\u00a7\u00a8\u0003\f\u0006"+
		"\u0000\u00a8\u00a9\u0005\u0011\u0000\u0000\u00a9\u00aa\u0005\u0003\u0000"+
		"\u0000\u00aa\u00ab\u0005\u000e\u0000\u0000\u00ab\u00ac\u0003\u0000\u0000"+
		"\u0000\u00ac\u00b2\u0005\u000f\u0000\u0000\u00ad\u00ae\u0005\u0004\u0000"+
		"\u0000\u00ae\u00af\u0005\u000e\u0000\u0000\u00af\u00b0\u0003\u0000\u0000"+
		"\u0000\u00b0\u00b1\u0005\u000f\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b2\u00ad\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b3\u0011\u0001\u0000\u0000\u0000\u00b4\u00b5\u0005\u0005\u0000"+
		"\u0000\u00b5\u00b6\u0005\u0010\u0000\u0000\u00b6\u00b7\u0003\f\u0006\u0000"+
		"\u00b7\u00b8\u0005\u0011\u0000\u0000\u00b8\u00b9\u0005\u0006\u0000\u0000"+
		"\u00b9\u00ba\u0005\u000e\u0000\u0000\u00ba\u00bb\u0003\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005\u000f\u0000\u0000\u00bc\u0013\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0005\u0007\u0000\u0000\u00be\u00bf\u0005\u0010\u0000\u0000"+
		"\u00bf\u00c0\u0003\b\u0004\u0000\u00c0\u00c1\u0005\u001a\u0000\u0000\u00c1"+
		"\u00c2\u0003\f\u0006\u0000\u00c2\u00c3\u0005\u001a\u0000\u0000\u00c3\u00c4"+
		"\u0003\b\u0004\u0000\u00c4\u00c5\u0005\u0011\u0000\u0000\u00c5\u00c6\u0005"+
		"\u000e\u0000\u0000\u00c6\u00c7\u0003\u0000\u0000\u0000\u00c7\u00c8\u0005"+
		"\u000f\u0000\u0000\u00c8\u0015\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005"+
		"\b\u0000\u0000\u00ca\u00cb\u0005)\u0000\u0000\u00cb\u00cc\u0005\u0010"+
		"\u0000\u0000\u00cc\u00cd\u0003\u0018\f\u0000\u00cd\u00ce\u0005\u0011\u0000"+
		"\u0000\u00ce\u00d1\u0005\u0016\u0000\u0000\u00cf\u00d2\u0003\u0000\u0000"+
		"\u0000\u00d0\u00d2\u0003\n\u0005\u0000\u00d1\u00cf\u0001\u0000\u0000\u0000"+
		"\u00d1\u00d0\u0001\u0000\u0000\u0000\u00d2\u0017\u0001\u0000\u0000\u0000"+
		"\u00d3\u00d8\u0005)\u0000\u0000\u00d4\u00d5\u0005\u0018\u0000\u0000\u00d5"+
		"\u00d7\u0005)\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d7\u00da"+
		"\u0001\u0000\u0000\u0000\u00d8\u00d6\u0001\u0000\u0000\u0000\u00d8\u00d9"+
		"\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da\u00d8"+
		"\u0001\u0000\u0000\u0000\u00db\u00d3\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc\u0019\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u0005)\u0000\u0000\u00de\u00df\u0005\u0010\u0000\u0000\u00df\u00e0\u0003"+
		"\u001c\u000e\u0000\u00e0\u00e1\u0005\u0011\u0000\u0000\u00e1\u001b\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e7\u0003\n\u0005\u0000\u00e3\u00e4\u0005\u0018"+
		"\u0000\u0000\u00e4\u00e6\u0003\n\u0005\u0000\u00e5\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8\u00eb\u0001\u0000\u0000"+
		"\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00e2\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u001d\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0005\t\u0000\u0000\u00ed\u00ee\u0005)\u0000\u0000"+
		"\u00ee\u00ef\u0005\n\u0000\u0000\u00ef\u00f0\u0003 \u0010\u0000\u00f0"+
		"\u001f\u0001\u0000\u0000\u0000\u00f1\u00f3\u0005+\u0000\u0000\u00f2\u00f1"+
		"\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4"+
		"\u0001\u0000\u0000\u0000\u00f4\u00f6\u0003$\u0012\u0000\u00f5\u00f2\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8!\u0001\u0000"+
		"\u0000\u0000\u00f9\u00fc\u0003\n\u0005\u0000\u00fa\u00fc\u0005\u0013\u0000"+
		"\u0000\u00fb\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fc#\u0001\u0000\u0000\u0000\u00fd\u00fe\u0005\u0012\u0000\u0000"+
		"\u00fe\u00ff\u0003\"\u0011\u0000\u00ff\u0102\u0005\u0016\u0000\u0000\u0100"+
		"\u0103\u0003\n\u0005\u0000\u0101\u0103\u0005\u0017\u0000\u0000\u0102\u0100"+
		"\u0001\u0000\u0000\u0000\u0102\u0101\u0001\u0000\u0000\u0000\u0103%\u0001"+
		"\u0000\u0000\u0000\u0104\u0105\u0005\u000b\u0000\u0000\u0105\u0106\u0005"+
		"\u0010\u0000\u0000\u0106\u0107\u0003\n\u0005\u0000\u0107\u0108\u0005\u0011"+
		"\u0000\u0000\u0108\'\u0001\u0000\u0000\u0000\u0109\u010d\u0005-\u0000"+
		"\u0000\u010a\u010c\u0003*\u0015\u0000\u010b\u010a\u0001\u0000\u0000\u0000"+
		"\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000\u0000\u0000"+
		"\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u011b\u0005/\u0000\u0000\u0111"+
		"\u0116\u0005.\u0000\u0000\u0112\u0115\u0003*\u0015\u0000\u0113\u0115\u0005"+
		"+\u0000\u0000\u0114\u0112\u0001\u0000\u0000\u0000\u0114\u0113\u0001\u0000"+
		"\u0000\u0000\u0115\u0118\u0001\u0000\u0000\u0000\u0116\u0114\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0119\u0001\u0000"+
		"\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0119\u011b\u00051\u0000"+
		"\u0000\u011a\u0109\u0001\u0000\u0000\u0000\u011a\u0111\u0001\u0000\u0000"+
		"\u0000\u011b)\u0001\u0000\u0000\u0000\u011c\u011e\u00050\u0000\u0000\u011d"+
		"\u011c\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000\u0000\u0000\u011f"+
		"\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120"+
		"\u0127\u0001\u0000\u0000\u0000\u0121\u0123\u00052\u0000\u0000\u0122\u0121"+
		"\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000\u0124\u0122"+
		"\u0001\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0127"+
		"\u0001\u0000\u0000\u0000\u0126\u011d\u0001\u0000\u0000\u0000\u0126\u0122"+
		"\u0001\u0000\u0000\u0000\u0127+\u0001\u0000\u0000\u0000!/268:FNY]djs\u0080"+
		"\u008e\u0090\u00a3\u00b2\u00d1\u00d8\u00db\u00e7\u00ea\u00f2\u00f7\u00fb"+
		"\u0102\u010d\u0114\u0116\u011a\u011f\u0124\u0126";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}