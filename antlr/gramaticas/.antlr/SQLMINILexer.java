// Generated from c:/Oscar/Universidad/3�/Procesadores de lenguaje/PL2/antlr/gramaticas/SQLMINILexer.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SQLMINILexer extends Lexer {
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
		COMENTARIO_LINEA_MODE=1, COMENTARIO_BLOQUE_MODE=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "COMENTARIO_LINEA_MODE", "COMENTARIO_BLOQUE_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELECT", "FROM", "WHERE", "ORDER_BY", "AND", "OR", "ASC", "DESC", "OP_MENOR_ESTRICTO", 
			"OP_MAYOR_ESTRICTO", "OP_MENOR_IGUAL", "OP_MAYOR_IGUAL", "OP_DISTINTO", 
			"IGUAL", "PARENTESIS_IZQUIERDO", "PARENTESIS_DERECHO", "ASTERISCO", "COMA", 
			"IDENTIFICADOR", "ENTRE_COMILLAS", "REAL", "SALTO_LINEA", "ESPACIO", 
			"COMENTARIOLINEA", "COMENTARIOABRIR", "FINAL_COMENTARIO_LINEA", "TEXTO_COMENTARIO_LINEA", 
			"COMENTARIOCERRAR", "TEXTO_COMENTARIO_BLOQUE"
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


	public SQLMINILexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SQLMINILexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u001d\u00f5\u0006\uffff\uffff\u0006\uffff\uffff\u0006\uffff"+
		"\uffff\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002\u0007"+
		"\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005\u0007"+
		"\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002\b\u0007\b"+
		"\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002\f\u0007"+
		"\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f\u0002"+
		"\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012\u0002"+
		"\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015\u0002"+
		"\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018\u0002"+
		"\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b\u0002"+
		"\u001c\u0007\u001c\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0003\u0000J\b\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003"+
		"\u0001T\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002`\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003r\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004z\b\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005\u0080\b\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0088\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0092\b\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0004"+
		"\u0012\u00ac\b\u0012\u000b\u0012\f\u0012\u00ad\u0001\u0012\u0005\u0012"+
		"\u00b1\b\u0012\n\u0012\f\u0012\u00b4\t\u0012\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u00b8\b\u0013\n\u0013\f\u0013\u00bb\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0014\u0004\u0014\u00c0\b\u0014\u000b\u0014\f\u0014\u00c1\u0001"+
		"\u0014\u0001\u0014\u0004\u0014\u00c6\b\u0014\u000b\u0014\f\u0014\u00c7"+
		"\u0003\u0014\u00ca\b\u0014\u0001\u0015\u0004\u0015\u00cd\b\u0015\u000b"+
		"\u0015\f\u0015\u00ce\u0001\u0016\u0004\u0016\u00d2\b\u0016\u000b\u0016"+
		"\f\u0016\u00d3\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u001a\u0004\u001a\u00e8\b\u001a\u000b\u001a\f\u001a\u00e9\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0004"+
		"\u001c\u00f2\b\u001c\u000b\u001c\f\u001c\u00f3\u0002\u00e9\u00f3\u0000"+
		"\u001d\u0003\u0001\u0005\u0002\u0007\u0003\t\u0004\u000b\u0005\r\u0006"+
		"\u000f\u0007\u0011\b\u0013\t\u0015\n\u0017\u000b\u0019\f\u001b\r\u001d"+
		"\u000e\u001f\u000f!\u0010#\u0011%\u0012\'\u0013)\u0014+\u0015-\u0016/"+
		"\u00171\u00183\u00195\u001a7\u001b9\u001c;\u001d\u0003\u0000\u0001\u0002"+
		"\u0006\u0002\u0000AZaz\u0003\u0000AZ__az\u0001\u0000\'\'\u0001\u00000"+
		"9\u0002\u0000\n\n\r\r\u0002\u0000\t\t  \u0104\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000"+
		"\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%"+
		"\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000\u0000\u0000\u0000"+
		"3\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000\u0000\u00017\u0001"+
		"\u0000\u0000\u0000\u00029\u0001\u0000\u0000\u0000\u0002;\u0001\u0000\u0000"+
		"\u0000\u0003I\u0001\u0000\u0000\u0000\u0005S\u0001\u0000\u0000\u0000\u0007"+
		"_\u0001\u0000\u0000\u0000\tq\u0001\u0000\u0000\u0000\u000by\u0001\u0000"+
		"\u0000\u0000\r\u007f\u0001\u0000\u0000\u0000\u000f\u0087\u0001\u0000\u0000"+
		"\u0000\u0011\u0091\u0001\u0000\u0000\u0000\u0013\u0093\u0001\u0000\u0000"+
		"\u0000\u0015\u0095\u0001\u0000\u0000\u0000\u0017\u0097\u0001\u0000\u0000"+
		"\u0000\u0019\u009a\u0001\u0000\u0000\u0000\u001b\u009d\u0001\u0000\u0000"+
		"\u0000\u001d\u00a0\u0001\u0000\u0000\u0000\u001f\u00a2\u0001\u0000\u0000"+
		"\u0000!\u00a4\u0001\u0000\u0000\u0000#\u00a6\u0001\u0000\u0000\u0000%"+
		"\u00a8\u0001\u0000\u0000\u0000\'\u00ab\u0001\u0000\u0000\u0000)\u00b5"+
		"\u0001\u0000\u0000\u0000+\u00bf\u0001\u0000\u0000\u0000-\u00cc\u0001\u0000"+
		"\u0000\u0000/\u00d1\u0001\u0000\u0000\u00001\u00d7\u0001\u0000\u0000\u0000"+
		"3\u00dc\u0001\u0000\u0000\u00005\u00e1\u0001\u0000\u0000\u00007\u00e7"+
		"\u0001\u0000\u0000\u00009\u00eb\u0001\u0000\u0000\u0000;\u00f1\u0001\u0000"+
		"\u0000\u0000=>\u0005S\u0000\u0000>?\u0005E\u0000\u0000?@\u0005L\u0000"+
		"\u0000@A\u0005E\u0000\u0000AB\u0005C\u0000\u0000BJ\u0005T\u0000\u0000"+
		"CD\u0005s\u0000\u0000DE\u0005e\u0000\u0000EF\u0005l\u0000\u0000FG\u0005"+
		"e\u0000\u0000GH\u0005c\u0000\u0000HJ\u0005t\u0000\u0000I=\u0001\u0000"+
		"\u0000\u0000IC\u0001\u0000\u0000\u0000J\u0004\u0001\u0000\u0000\u0000"+
		"KL\u0005F\u0000\u0000LM\u0005R\u0000\u0000MN\u0005O\u0000\u0000NT\u0005"+
		"M\u0000\u0000OP\u0005f\u0000\u0000PQ\u0005r\u0000\u0000QR\u0005o\u0000"+
		"\u0000RT\u0005m\u0000\u0000SK\u0001\u0000\u0000\u0000SO\u0001\u0000\u0000"+
		"\u0000T\u0006\u0001\u0000\u0000\u0000UV\u0005W\u0000\u0000VW\u0005H\u0000"+
		"\u0000WX\u0005E\u0000\u0000XY\u0005R\u0000\u0000Y`\u0005E\u0000\u0000"+
		"Z[\u0005w\u0000\u0000[\\\u0005h\u0000\u0000\\]\u0005e\u0000\u0000]^\u0005"+
		"r\u0000\u0000^`\u0005e\u0000\u0000_U\u0001\u0000\u0000\u0000_Z\u0001\u0000"+
		"\u0000\u0000`\b\u0001\u0000\u0000\u0000ab\u0005O\u0000\u0000bc\u0005R"+
		"\u0000\u0000cd\u0005D\u0000\u0000de\u0005E\u0000\u0000ef\u0005R\u0000"+
		"\u0000fg\u0005 \u0000\u0000gh\u0005B\u0000\u0000hr\u0005Y\u0000\u0000"+
		"ij\u0005o\u0000\u0000jk\u0005r\u0000\u0000kl\u0005d\u0000\u0000lm\u0005"+
		"e\u0000\u0000mn\u0005r\u0000\u0000no\u0005 \u0000\u0000op\u0005b\u0000"+
		"\u0000pr\u0005y\u0000\u0000qa\u0001\u0000\u0000\u0000qi\u0001\u0000\u0000"+
		"\u0000r\n\u0001\u0000\u0000\u0000st\u0005A\u0000\u0000tu\u0005N\u0000"+
		"\u0000uz\u0005D\u0000\u0000vw\u0005a\u0000\u0000wx\u0005n\u0000\u0000"+
		"xz\u0005d\u0000\u0000ys\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000"+
		"z\f\u0001\u0000\u0000\u0000{|\u0005O\u0000\u0000|\u0080\u0005R\u0000\u0000"+
		"}~\u0005o\u0000\u0000~\u0080\u0005r\u0000\u0000\u007f{\u0001\u0000\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u0080\u000e\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u0005A\u0000\u0000\u0082\u0083\u0005S\u0000\u0000\u0083\u0088"+
		"\u0005C\u0000\u0000\u0084\u0085\u0005a\u0000\u0000\u0085\u0086\u0005s"+
		"\u0000\u0000\u0086\u0088\u0005c\u0000\u0000\u0087\u0081\u0001\u0000\u0000"+
		"\u0000\u0087\u0084\u0001\u0000\u0000\u0000\u0088\u0010\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0005D\u0000\u0000\u008a\u008b\u0005E\u0000\u0000\u008b"+
		"\u008c\u0005S\u0000\u0000\u008c\u0092\u0005C\u0000\u0000\u008d\u008e\u0005"+
		"d\u0000\u0000\u008e\u008f\u0005e\u0000\u0000\u008f\u0090\u0005s\u0000"+
		"\u0000\u0090\u0092\u0005c\u0000\u0000\u0091\u0089\u0001\u0000\u0000\u0000"+
		"\u0091\u008d\u0001\u0000\u0000\u0000\u0092\u0012\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0005<\u0000\u0000\u0094\u0014\u0001\u0000\u0000\u0000\u0095"+
		"\u0096\u0005>\u0000\u0000\u0096\u0016\u0001\u0000\u0000\u0000\u0097\u0098"+
		"\u0005<\u0000\u0000\u0098\u0099\u0005=\u0000\u0000\u0099\u0018\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005>\u0000\u0000\u009b\u009c\u0005=\u0000\u0000"+
		"\u009c\u001a\u0001\u0000\u0000\u0000\u009d\u009e\u0005!\u0000\u0000\u009e"+
		"\u009f\u0005=\u0000\u0000\u009f\u001c\u0001\u0000\u0000\u0000\u00a0\u00a1"+
		"\u0005=\u0000\u0000\u00a1\u001e\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"(\u0000\u0000\u00a3 \u0001\u0000\u0000\u0000\u00a4\u00a5\u0005)\u0000"+
		"\u0000\u00a5\"\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005*\u0000\u0000"+
		"\u00a7$\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005,\u0000\u0000\u00a9&"+
		"\u0001\u0000\u0000\u0000\u00aa\u00ac\u0007\u0000\u0000\u0000\u00ab\u00aa"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ab"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b2"+
		"\u0001\u0000\u0000\u0000\u00af\u00b1\u0007\u0001\u0000\u0000\u00b0\u00af"+
		"\u0001\u0000\u0000\u0000\u00b1\u00b4\u0001\u0000\u0000\u0000\u00b2\u00b0"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3(\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b9\u0005"+
		"\'\u0000\u0000\u00b6\u00b8\b\u0002\u0000\u0000\u00b7\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00bc\u0001\u0000"+
		"\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\'\u0000"+
		"\u0000\u00bd*\u0001\u0000\u0000\u0000\u00be\u00c0\u0007\u0003\u0000\u0000"+
		"\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000\u0000"+
		"\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c9\u0001\u0000\u0000\u0000\u00c3\u00c5\u0005.\u0000\u0000\u00c4"+
		"\u00c6\u0007\u0003\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c7\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c3\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca"+
		",\u0001\u0000\u0000\u0000\u00cb\u00cd\u0007\u0004\u0000\u0000\u00cc\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cc"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf.\u0001"+
		"\u0000\u0000\u0000\u00d0\u00d2\u0007\u0005\u0000\u0000\u00d1\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d1\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d5\u00d6\u0006\u0016\u0000\u0000\u00d60\u0001\u0000"+
		"\u0000\u0000\u00d7\u00d8\u0005-\u0000\u0000\u00d8\u00d9\u0005-\u0000\u0000"+
		"\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00db\u0006\u0017\u0001\u0000"+
		"\u00db2\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005/\u0000\u0000\u00dd\u00de"+
		"\u0005*\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0\u0006"+
		"\u0018\u0002\u0000\u00e04\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\r"+
		"\u0000\u0000\u00e2\u00e3\u0005\n\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0006\u0019\u0003\u0000\u00e56\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e8\t\u0000\u0000\u0000\u00e7\u00e6\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e7\u0001\u0000\u0000\u0000\u00ea8\u0001\u0000\u0000\u0000\u00eb\u00ec"+
		"\u0005*\u0000\u0000\u00ec\u00ed\u0005/\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0006\u001b\u0003\u0000\u00ef:\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f2\t\u0000\u0000\u0000\u00f1\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0001\u0000\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f1\u0001\u0000\u0000\u0000\u00f4<\u0001\u0000\u0000\u0000\u0015"+
		"\u0000\u0001\u0002IS_qy\u007f\u0087\u0091\u00ad\u00b2\u00b9\u00c1\u00c7"+
		"\u00c9\u00ce\u00d3\u00e9\u00f3\u0004\u0006\u0000\u0000\u0005\u0001\u0000"+
		"\u0005\u0002\u0000\u0004\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}