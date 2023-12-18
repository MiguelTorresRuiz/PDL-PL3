// Generated from linguineLexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class linguineLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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
		COMENTARIO_LINEA_MODE=1, COMENTARIO_BLOQUE_MODE=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "COMENTARIO_LINEA_MODE", "COMENTARIO_BLOQUE_MODE"
	};

	public static final String[] ruleNames = {
		"LET", "IF", "THEN", "ELSE", "WHILE", "DO", "FOR", "FUN", "MATCH", "WITH", 
		"SHOW", "AND", "OR", "LLAVE_IZQUIERDA", "LLAVE_DERECHA", "PARENTESIS_IZQUIERDO", 
		"PARENTESIS_DERECHO", "SEPARADOR_MATCH", "INTERROGACION", "CORCHETE_IZQUIERDO", 
		"CORCHETE_DERECHO", "FLECHA_DERECHA", "LITERAL_CADENA", "COMA", "IGUAL", 
		"PUNTO_Y_COMA", "DOS_PUNTOS", "OP_SUMA", "OP_RESTA", "OP_MULT", "OP_DIV", 
		"OP_MENOR_ESTRICTO", "OP_MAYOR_ESTRICTO", "OP_MENOR_IGUAL", "OP_MAYOR_IGUAL", 
		"OP_DISTINTO", "OP_EQUIVALENCIA", "BOOLEANO", "TRUE", "FALSE", "IDENTIFICADOR", 
		"REAL", "SALTO_LINEA", "ESPACIOS", "COMENTARIOLINEA", "COMENTARIOABRIR", 
		"FINAL_COMENTARIO_LINEA", "TEXTO_COMENTARIO_LINEA", "COMENTARIOCERRAR", 
		"TEXTO_COMENTARIO_BLOQUE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'{'", "'}'", "'('", "')'", "'|'", "'?'", "'['", "']'", "'->'", 
		null, "','", "'='", "';'", "':'", "'+'", "'-'", "'*'", "'/'", "'<'", "'>'", 
		"'<='", "'>='", "'!='", "'=='", null, "'true'", "'false'", null, null, 
		null, null, "'%%'", "'<*'", "'\r\n'", null, "'*>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
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


	public linguineLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "linguineLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\64\u0176\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t"+
		"\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4"+
		"*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63"+
		"\t\63\3\2\3\2\3\2\3\2\3\2\3\2\5\2p\n\2\3\3\3\3\3\3\3\3\5\3v\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0080\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u008a\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\5\6\u009c\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a8"+
		"\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00b2\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u00ba\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c6\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d0\n\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u00da\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e2\n"+
		"\r\3\16\3\16\3\16\3\16\5\16\u00e8\n\16\3\17\3\17\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3"+
		"\30\7\30\u00ff\n\30\f\30\16\30\u0102\13\30\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\5\'\u0128\n\'\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3)\3*\6*\u0136\n*\r*\16*\u0137\3*\7*\u013b\n*\f"+
		"*\16*\u013e\13*\3+\6+\u0141\n+\r+\16+\u0142\3+\3+\6+\u0147\n+\r+\16+\u0148"+
		"\5+\u014b\n+\3,\6,\u014e\n,\r,\16,\u014f\3-\6-\u0153\n-\r-\16-\u0154\3"+
		"-\3-\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\61\6\61"+
		"\u0169\n\61\r\61\16\61\u016a\3\62\3\62\3\62\3\62\3\62\3\63\6\63\u0173"+
		"\n\63\r\63\16\63\u0174\5\u0100\u016a\u0174\2\64\5\3\7\4\t\5\13\6\r\7\17"+
		"\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26"+
		"-\27/\30\61\31\63\32\65\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U"+
		"+W,Y-[.]/_\60a\61c\62e\63g\64\5\2\3\4\7\4\2C\\c|\6\2\62;C\\aac|\3\2\62"+
		";\4\2\f\f\17\17\4\2\13\13\"\"\2\u018b\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2"+
		"\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]"+
		"\3\2\2\2\2_\3\2\2\2\3a\3\2\2\2\3c\3\2\2\2\4e\3\2\2\2\4g\3\2\2\2\5o\3\2"+
		"\2\2\7u\3\2\2\2\t\177\3\2\2\2\13\u0089\3\2\2\2\r\u009b\3\2\2\2\17\u00a7"+
		"\3\2\2\2\21\u00b1\3\2\2\2\23\u00b9\3\2\2\2\25\u00c5\3\2\2\2\27\u00cf\3"+
		"\2\2\2\31\u00d9\3\2\2\2\33\u00e1\3\2\2\2\35\u00e7\3\2\2\2\37\u00e9\3\2"+
		"\2\2!\u00eb\3\2\2\2#\u00ed\3\2\2\2%\u00ef\3\2\2\2\'\u00f1\3\2\2\2)\u00f3"+
		"\3\2\2\2+\u00f5\3\2\2\2-\u00f7\3\2\2\2/\u00f9\3\2\2\2\61\u00fc\3\2\2\2"+
		"\63\u0105\3\2\2\2\65\u0107\3\2\2\2\67\u0109\3\2\2\29\u010b\3\2\2\2;\u010d"+
		"\3\2\2\2=\u010f\3\2\2\2?\u0111\3\2\2\2A\u0113\3\2\2\2C\u0115\3\2\2\2E"+
		"\u0117\3\2\2\2G\u0119\3\2\2\2I\u011c\3\2\2\2K\u011f\3\2\2\2M\u0122\3\2"+
		"\2\2O\u0127\3\2\2\2Q\u0129\3\2\2\2S\u012e\3\2\2\2U\u0135\3\2\2\2W\u0140"+
		"\3\2\2\2Y\u014d\3\2\2\2[\u0152\3\2\2\2]\u0158\3\2\2\2_\u015d\3\2\2\2a"+
		"\u0162\3\2\2\2c\u0168\3\2\2\2e\u016c\3\2\2\2g\u0172\3\2\2\2ij\7n\2\2j"+
		"k\7g\2\2kp\7v\2\2lm\7N\2\2mn\7G\2\2np\7V\2\2oi\3\2\2\2ol\3\2\2\2p\6\3"+
		"\2\2\2qr\7k\2\2rv\7h\2\2st\7K\2\2tv\7H\2\2uq\3\2\2\2us\3\2\2\2v\b\3\2"+
		"\2\2wx\7v\2\2xy\7j\2\2yz\7g\2\2z\u0080\7p\2\2{|\7V\2\2|}\7J\2\2}~\7G\2"+
		"\2~\u0080\7P\2\2\177w\3\2\2\2\177{\3\2\2\2\u0080\n\3\2\2\2\u0081\u0082"+
		"\7g\2\2\u0082\u0083\7n\2\2\u0083\u0084\7u\2\2\u0084\u008a\7g\2\2\u0085"+
		"\u0086\7G\2\2\u0086\u0087\7N\2\2\u0087\u0088\7U\2\2\u0088\u008a\7G\2\2"+
		"\u0089\u0081\3\2\2\2\u0089\u0085\3\2\2\2\u008a\f\3\2\2\2\u008b\u008c\7"+
		"o\2\2\u008c\u008d\7k\2\2\u008d\u008e\7g\2\2\u008e\u008f\7p\2\2\u008f\u0090"+
		"\7v\2\2\u0090\u0091\7t\2\2\u0091\u0092\7c\2\2\u0092\u009c\7u\2\2\u0093"+
		"\u0094\7O\2\2\u0094\u0095\7K\2\2\u0095\u0096\7G\2\2\u0096\u0097\7P\2\2"+
		"\u0097\u0098\7V\2\2\u0098\u0099\7T\2\2\u0099\u009a\7C\2\2\u009a\u009c"+
		"\7U\2\2\u009b\u008b\3\2\2\2\u009b\u0093\3\2\2\2\u009c\16\3\2\2\2\u009d"+
		"\u009e\7j\2\2\u009e\u009f\7c\2\2\u009f\u00a0\7e\2\2\u00a0\u00a1\7g\2\2"+
		"\u00a1\u00a8\7t\2\2\u00a2\u00a3\7J\2\2\u00a3\u00a4\7C\2\2\u00a4\u00a5"+
		"\7E\2\2\u00a5\u00a6\7G\2\2\u00a6\u00a8\7T\2\2\u00a7\u009d\3\2\2\2\u00a7"+
		"\u00a2\3\2\2\2\u00a8\20\3\2\2\2\u00a9\u00aa\7r\2\2\u00aa\u00ab\7c\2\2"+
		"\u00ab\u00ac\7t\2\2\u00ac\u00b2\7c\2\2\u00ad\u00ae\7R\2\2\u00ae\u00af"+
		"\7C\2\2\u00af\u00b0\7T\2\2\u00b0\u00b2\7C\2\2\u00b1\u00a9\3\2\2\2\u00b1"+
		"\u00ad\3\2\2\2\u00b2\22\3\2\2\2\u00b3\u00b4\7h\2\2\u00b4\u00b5\7w\2\2"+
		"\u00b5\u00ba\7p\2\2\u00b6\u00b7\7H\2\2\u00b7\u00b8\7W\2\2\u00b8\u00ba"+
		"\7P\2\2\u00b9\u00b3\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba\24\3\2\2\2\u00bb"+
		"\u00bc\7o\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7e\2\2"+
		"\u00bf\u00c6\7j\2\2\u00c0\u00c1\7O\2\2\u00c1\u00c2\7C\2\2\u00c2\u00c3"+
		"\7V\2\2\u00c3\u00c4\7E\2\2\u00c4\u00c6\7J\2\2\u00c5\u00bb\3\2\2\2\u00c5"+
		"\u00c0\3\2\2\2\u00c6\26\3\2\2\2\u00c7\u00c8\7y\2\2\u00c8\u00c9\7k\2\2"+
		"\u00c9\u00ca\7v\2\2\u00ca\u00d0\7j\2\2\u00cb\u00cc\7Y\2\2\u00cc\u00cd"+
		"\7K\2\2\u00cd\u00ce\7V\2\2\u00ce\u00d0\7J\2\2\u00cf\u00c7\3\2\2\2\u00cf"+
		"\u00cb\3\2\2\2\u00d0\30\3\2\2\2\u00d1\u00d2\7u\2\2\u00d2\u00d3\7j\2\2"+
		"\u00d3\u00d4\7q\2\2\u00d4\u00da\7y\2\2\u00d5\u00d6\7U\2\2\u00d6\u00d7"+
		"\7J\2\2\u00d7\u00d8\7Q\2\2\u00d8\u00da\7Y\2\2\u00d9\u00d1\3\2\2\2\u00d9"+
		"\u00d5\3\2\2\2\u00da\32\3\2\2\2\u00db\u00dc\7C\2\2\u00dc\u00dd\7P\2\2"+
		"\u00dd\u00e2\7F\2\2\u00de\u00df\7c\2\2\u00df\u00e0\7p\2\2\u00e0\u00e2"+
		"\7f\2\2\u00e1\u00db\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\34\3\2\2\2\u00e3"+
		"\u00e4\7Q\2\2\u00e4\u00e8\7T\2\2\u00e5\u00e6\7q\2\2\u00e6\u00e8\7t\2\2"+
		"\u00e7\u00e3\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\36\3\2\2\2\u00e9\u00ea"+
		"\7}\2\2\u00ea \3\2\2\2\u00eb\u00ec\7\177\2\2\u00ec\"\3\2\2\2\u00ed\u00ee"+
		"\7*\2\2\u00ee$\3\2\2\2\u00ef\u00f0\7+\2\2\u00f0&\3\2\2\2\u00f1\u00f2\7"+
		"~\2\2\u00f2(\3\2\2\2\u00f3\u00f4\7A\2\2\u00f4*\3\2\2\2\u00f5\u00f6\7]"+
		"\2\2\u00f6,\3\2\2\2\u00f7\u00f8\7_\2\2\u00f8.\3\2\2\2\u00f9\u00fa\7/\2"+
		"\2\u00fa\u00fb\7@\2\2\u00fb\60\3\2\2\2\u00fc\u0100\7$\2\2\u00fd\u00ff"+
		"\13\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0102\3\2\2\2\u0100\u0101\3\2\2\2"+
		"\u0100\u00fe\3\2\2\2\u0101\u0103\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104"+
		"\7$\2\2\u0104\62\3\2\2\2\u0105\u0106\7.\2\2\u0106\64\3\2\2\2\u0107\u0108"+
		"\7?\2\2\u0108\66\3\2\2\2\u0109\u010a\7=\2\2\u010a8\3\2\2\2\u010b\u010c"+
		"\7<\2\2\u010c:\3\2\2\2\u010d\u010e\7-\2\2\u010e<\3\2\2\2\u010f\u0110\7"+
		"/\2\2\u0110>\3\2\2\2\u0111\u0112\7,\2\2\u0112@\3\2\2\2\u0113\u0114\7\61"+
		"\2\2\u0114B\3\2\2\2\u0115\u0116\7>\2\2\u0116D\3\2\2\2\u0117\u0118\7@\2"+
		"\2\u0118F\3\2\2\2\u0119\u011a\7>\2\2\u011a\u011b\7?\2\2\u011bH\3\2\2\2"+
		"\u011c\u011d\7@\2\2\u011d\u011e\7?\2\2\u011eJ\3\2\2\2\u011f\u0120\7#\2"+
		"\2\u0120\u0121\7?\2\2\u0121L\3\2\2\2\u0122\u0123\7?\2\2\u0123\u0124\7"+
		"?\2\2\u0124N\3\2\2\2\u0125\u0128\5Q(\2\u0126\u0128\5S)\2\u0127\u0125\3"+
		"\2\2\2\u0127\u0126\3\2\2\2\u0128P\3\2\2\2\u0129\u012a\7v\2\2\u012a\u012b"+
		"\7t\2\2\u012b\u012c\7w\2\2\u012c\u012d\7g\2\2\u012dR\3\2\2\2\u012e\u012f"+
		"\7h\2\2\u012f\u0130\7c\2\2\u0130\u0131\7n\2\2\u0131\u0132\7u\2\2\u0132"+
		"\u0133\7g\2\2\u0133T\3\2\2\2\u0134\u0136\t\2\2\2\u0135\u0134\3\2\2\2\u0136"+
		"\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013c\3\2"+
		"\2\2\u0139\u013b\t\3\2\2\u013a\u0139\3\2\2\2\u013b\u013e\3\2\2\2\u013c"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013dV\3\2\2\2\u013e\u013c\3\2\2\2"+
		"\u013f\u0141\t\4\2\2\u0140\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142\u0140"+
		"\3\2\2\2\u0142\u0143\3\2\2\2\u0143\u014a\3\2\2\2\u0144\u0146\7\60\2\2"+
		"\u0145\u0147\t\4\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0146"+
		"\3\2\2\2\u0148\u0149\3\2\2\2\u0149\u014b\3\2\2\2\u014a\u0144\3\2\2\2\u014a"+
		"\u014b\3\2\2\2\u014bX\3\2\2\2\u014c\u014e\t\5\2\2\u014d\u014c\3\2\2\2"+
		"\u014e\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150Z\3"+
		"\2\2\2\u0151\u0153\t\6\2\2\u0152\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154"+
		"\u0152\3\2\2\2\u0154\u0155\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0157\b-"+
		"\2\2\u0157\\\3\2\2\2\u0158\u0159\7\'\2\2\u0159\u015a\7\'\2\2\u015a\u015b"+
		"\3\2\2\2\u015b\u015c\b.\3\2\u015c^\3\2\2\2\u015d\u015e\7>\2\2\u015e\u015f"+
		"\7,\2\2\u015f\u0160\3\2\2\2\u0160\u0161\b/\4\2\u0161`\3\2\2\2\u0162\u0163"+
		"\7\17\2\2\u0163\u0164\7\f\2\2\u0164\u0165\3\2\2\2\u0165\u0166\b\60\5\2"+
		"\u0166b\3\2\2\2\u0167\u0169\13\2\2\2\u0168\u0167\3\2\2\2\u0169\u016a\3"+
		"\2\2\2\u016a\u016b\3\2\2\2\u016a\u0168\3\2\2\2\u016bd\3\2\2\2\u016c\u016d"+
		"\7,\2\2\u016d\u016e\7@\2\2\u016e\u016f\3\2\2\2\u016f\u0170\b\62\5\2\u0170"+
		"f\3\2\2\2\u0171\u0173\13\2\2\2\u0172\u0171\3\2\2\2\u0173\u0174\3\2\2\2"+
		"\u0174\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175h\3\2\2\2\35\2\3\4ou\177"+
		"\u0089\u009b\u00a7\u00b1\u00b9\u00c5\u00cf\u00d9\u00e1\u00e7\u0100\u0127"+
		"\u0137\u013c\u0142\u0148\u014a\u014f\u0154\u016a\u0174\6\b\2\2\7\3\2\7"+
		"\4\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}