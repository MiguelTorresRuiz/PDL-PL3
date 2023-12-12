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
		SHOW=11, LLAVE_IZQUIERDA=12, LLAVE_DERECHA=13, PARENTESIS_IZQUIERDO=14, 
		PARENTESIS_DERECHO=15, SEPARADOR_MATCH=16, INTERROGACION=17, FLECHA_DERECHA=18, 
		LITERAL_CADENA=19, COMA=20, IGUAL=21, PUNTO_Y_COMA=22, OP_SUMA=23, OP_RESTA=24, 
		OP_MULT=25, OP_DIV=26, OP_MENOR_ESTRICTO=27, OP_MAYOR_ESTRICTO=28, OP_MENOR_IGUAL=29, 
		OP_MAYOR_IGUAL=30, OP_DISTINTO=31, OP_EQUIVALENCIA=32, IDENTIFICADOR=33, 
		REAL=34, SALTO_LINEA=35, ESPACIOS=36, COMENTARIOLINEA=37, COMENTARIOABRIR=38, 
		FINAL_COMENTARIO_LINEA=39, TEXTO_COMENTARIO_LINEA=40, COMENTARIOCERRAR=41, 
		TEXTO_COMENTARIO_BLOQUE=42;
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
		"SHOW", "LLAVE_IZQUIERDA", "LLAVE_DERECHA", "PARENTESIS_IZQUIERDO", "PARENTESIS_DERECHO", 
		"SEPARADOR_MATCH", "INTERROGACION", "FLECHA_DERECHA", "LITERAL_CADENA", 
		"COMA", "IGUAL", "PUNTO_Y_COMA", "OP_SUMA", "OP_RESTA", "OP_MULT", "OP_DIV", 
		"OP_MENOR_ESTRICTO", "OP_MAYOR_ESTRICTO", "OP_MENOR_IGUAL", "OP_MAYOR_IGUAL", 
		"OP_DISTINTO", "OP_EQUIVALENCIA", "IDENTIFICADOR", "REAL", "SALTO_LINEA", 
		"ESPACIOS", "COMENTARIOLINEA", "COMENTARIOABRIR", "FINAL_COMENTARIO_LINEA", 
		"TEXTO_COMENTARIO_LINEA", "COMENTARIOCERRAR", "TEXTO_COMENTARIO_BLOQUE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0143\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t"+
		"*\4+\t+\3\2\3\2\3\2\3\2\3\2\3\2\5\2`\n\2\3\3\3\3\3\3\3\3\5\3f\n\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4p\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\5\5z\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\5\6\u008c\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0098\n"+
		"\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00a2\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u00aa\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b6\n\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c0\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\5\f\u00ca\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\7\24\u00dd\n\24\f\24\16"+
		"\24\u00e0\13\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31"+
		"\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3 \3 \3 \3!\3!\3!\3\"\6\"\u0103\n\"\r\"\16\"\u0104\3\"\7\"\u0108"+
		"\n\"\f\"\16\"\u010b\13\"\3#\6#\u010e\n#\r#\16#\u010f\3#\3#\6#\u0114\n"+
		"#\r#\16#\u0115\5#\u0118\n#\3$\6$\u011b\n$\r$\16$\u011c\3%\6%\u0120\n%"+
		"\r%\16%\u0121\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3("+
		"\3)\6)\u0136\n)\r)\16)\u0137\3*\3*\3*\3*\3*\3+\6+\u0140\n+\r+\16+\u0141"+
		"\5\u00de\u0137\u0141\2,\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f"+
		"\31\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65"+
		"\33\67\349\35;\36=\37? A!C\"E#G$I%K&M\'O(Q)S*U+W,\5\2\3\4\7\4\2C\\c|\6"+
		"\2\62;C\\aac|\3\2\62;\4\2\f\f\17\17\4\2\13\13\"\"\2\u0155\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2"+
		"\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2"+
		"\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2"+
		"\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2"+
		"\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2"+
		"\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\3S\3\2\2\2\4U\3\2\2\2\4W\3\2\2\2\5_"+
		"\3\2\2\2\7e\3\2\2\2\to\3\2\2\2\13y\3\2\2\2\r\u008b\3\2\2\2\17\u0097\3"+
		"\2\2\2\21\u00a1\3\2\2\2\23\u00a9\3\2\2\2\25\u00b5\3\2\2\2\27\u00bf\3\2"+
		"\2\2\31\u00c9\3\2\2\2\33\u00cb\3\2\2\2\35\u00cd\3\2\2\2\37\u00cf\3\2\2"+
		"\2!\u00d1\3\2\2\2#\u00d3\3\2\2\2%\u00d5\3\2\2\2\'\u00d7\3\2\2\2)\u00da"+
		"\3\2\2\2+\u00e3\3\2\2\2-\u00e5\3\2\2\2/\u00e7\3\2\2\2\61\u00e9\3\2\2\2"+
		"\63\u00eb\3\2\2\2\65\u00ed\3\2\2\2\67\u00ef\3\2\2\29\u00f1\3\2\2\2;\u00f3"+
		"\3\2\2\2=\u00f5\3\2\2\2?\u00f8\3\2\2\2A\u00fb\3\2\2\2C\u00fe\3\2\2\2E"+
		"\u0102\3\2\2\2G\u010d\3\2\2\2I\u011a\3\2\2\2K\u011f\3\2\2\2M\u0125\3\2"+
		"\2\2O\u012a\3\2\2\2Q\u012f\3\2\2\2S\u0135\3\2\2\2U\u0139\3\2\2\2W\u013f"+
		"\3\2\2\2YZ\7n\2\2Z[\7g\2\2[`\7v\2\2\\]\7N\2\2]^\7G\2\2^`\7V\2\2_Y\3\2"+
		"\2\2_\\\3\2\2\2`\6\3\2\2\2ab\7k\2\2bf\7h\2\2cd\7K\2\2df\7H\2\2ea\3\2\2"+
		"\2ec\3\2\2\2f\b\3\2\2\2gh\7v\2\2hi\7j\2\2ij\7g\2\2jp\7p\2\2kl\7V\2\2l"+
		"m\7J\2\2mn\7G\2\2np\7P\2\2og\3\2\2\2ok\3\2\2\2p\n\3\2\2\2qr\7g\2\2rs\7"+
		"n\2\2st\7u\2\2tz\7g\2\2uv\7G\2\2vw\7N\2\2wx\7U\2\2xz\7G\2\2yq\3\2\2\2"+
		"yu\3\2\2\2z\f\3\2\2\2{|\7o\2\2|}\7k\2\2}~\7g\2\2~\177\7p\2\2\177\u0080"+
		"\7v\2\2\u0080\u0081\7t\2\2\u0081\u0082\7c\2\2\u0082\u008c\7u\2\2\u0083"+
		"\u0084\7O\2\2\u0084\u0085\7K\2\2\u0085\u0086\7G\2\2\u0086\u0087\7P\2\2"+
		"\u0087\u0088\7V\2\2\u0088\u0089\7T\2\2\u0089\u008a\7C\2\2\u008a\u008c"+
		"\7U\2\2\u008b{\3\2\2\2\u008b\u0083\3\2\2\2\u008c\16\3\2\2\2\u008d\u008e"+
		"\7j\2\2\u008e\u008f\7c\2\2\u008f\u0090\7e\2\2\u0090\u0091\7g\2\2\u0091"+
		"\u0098\7t\2\2\u0092\u0093\7J\2\2\u0093\u0094\7C\2\2\u0094\u0095\7E\2\2"+
		"\u0095\u0096\7G\2\2\u0096\u0098\7T\2\2\u0097\u008d\3\2\2\2\u0097\u0092"+
		"\3\2\2\2\u0098\20\3\2\2\2\u0099\u009a\7r\2\2\u009a\u009b\7c\2\2\u009b"+
		"\u009c\7t\2\2\u009c\u00a2\7c\2\2\u009d\u009e\7R\2\2\u009e\u009f\7C\2\2"+
		"\u009f\u00a0\7T\2\2\u00a0\u00a2\7C\2\2\u00a1\u0099\3\2\2\2\u00a1\u009d"+
		"\3\2\2\2\u00a2\22\3\2\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7w\2\2\u00a5"+
		"\u00aa\7p\2\2\u00a6\u00a7\7H\2\2\u00a7\u00a8\7W\2\2\u00a8\u00aa\7P\2\2"+
		"\u00a9\u00a3\3\2\2\2\u00a9\u00a6\3\2\2\2\u00aa\24\3\2\2\2\u00ab\u00ac"+
		"\7o\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae\7v\2\2\u00ae\u00af\7e\2\2\u00af"+
		"\u00b6\7j\2\2\u00b0\u00b1\7O\2\2\u00b1\u00b2\7C\2\2\u00b2\u00b3\7V\2\2"+
		"\u00b3\u00b4\7E\2\2\u00b4\u00b6\7J\2\2\u00b5\u00ab\3\2\2\2\u00b5\u00b0"+
		"\3\2\2\2\u00b6\26\3\2\2\2\u00b7\u00b8\7y\2\2\u00b8\u00b9\7k\2\2\u00b9"+
		"\u00ba\7v\2\2\u00ba\u00c0\7j\2\2\u00bb\u00bc\7Y\2\2\u00bc\u00bd\7K\2\2"+
		"\u00bd\u00be\7V\2\2\u00be\u00c0\7J\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00bb"+
		"\3\2\2\2\u00c0\30\3\2\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7j\2\2\u00c3"+
		"\u00c4\7q\2\2\u00c4\u00ca\7y\2\2\u00c5\u00c6\7U\2\2\u00c6\u00c7\7J\2\2"+
		"\u00c7\u00c8\7Q\2\2\u00c8\u00ca\7Y\2\2\u00c9\u00c1\3\2\2\2\u00c9\u00c5"+
		"\3\2\2\2\u00ca\32\3\2\2\2\u00cb\u00cc\7}\2\2\u00cc\34\3\2\2\2\u00cd\u00ce"+
		"\7\177\2\2\u00ce\36\3\2\2\2\u00cf\u00d0\7*\2\2\u00d0 \3\2\2\2\u00d1\u00d2"+
		"\7+\2\2\u00d2\"\3\2\2\2\u00d3\u00d4\7~\2\2\u00d4$\3\2\2\2\u00d5\u00d6"+
		"\7A\2\2\u00d6&\3\2\2\2\u00d7\u00d8\7/\2\2\u00d8\u00d9\7@\2\2\u00d9(\3"+
		"\2\2\2\u00da\u00de\7$\2\2\u00db\u00dd\13\2\2\2\u00dc\u00db\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00e1\3\2"+
		"\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7$\2\2\u00e2*\3\2\2\2\u00e3\u00e4"+
		"\7.\2\2\u00e4,\3\2\2\2\u00e5\u00e6\7?\2\2\u00e6.\3\2\2\2\u00e7\u00e8\7"+
		"=\2\2\u00e8\60\3\2\2\2\u00e9\u00ea\7-\2\2\u00ea\62\3\2\2\2\u00eb\u00ec"+
		"\7/\2\2\u00ec\64\3\2\2\2\u00ed\u00ee\7,\2\2\u00ee\66\3\2\2\2\u00ef\u00f0"+
		"\7\61\2\2\u00f08\3\2\2\2\u00f1\u00f2\7>\2\2\u00f2:\3\2\2\2\u00f3\u00f4"+
		"\7@\2\2\u00f4<\3\2\2\2\u00f5\u00f6\7>\2\2\u00f6\u00f7\7?\2\2\u00f7>\3"+
		"\2\2\2\u00f8\u00f9\7@\2\2\u00f9\u00fa\7?\2\2\u00fa@\3\2\2\2\u00fb\u00fc"+
		"\7#\2\2\u00fc\u00fd\7?\2\2\u00fdB\3\2\2\2\u00fe\u00ff\7?\2\2\u00ff\u0100"+
		"\7?\2\2\u0100D\3\2\2\2\u0101\u0103\t\2\2\2\u0102\u0101\3\2\2\2\u0103\u0104"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0109\3\2\2\2\u0106"+
		"\u0108\t\3\2\2\u0107\u0106\3\2\2\2\u0108\u010b\3\2\2\2\u0109\u0107\3\2"+
		"\2\2\u0109\u010a\3\2\2\2\u010aF\3\2\2\2\u010b\u0109\3\2\2\2\u010c\u010e"+
		"\t\4\2\2\u010d\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u010d\3\2\2\2\u010f"+
		"\u0110\3\2\2\2\u0110\u0117\3\2\2\2\u0111\u0113\7\60\2\2\u0112\u0114\t"+
		"\4\2\2\u0113\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\u0118\3\2\2\2\u0117\u0111\3\2\2\2\u0117\u0118\3\2"+
		"\2\2\u0118H\3\2\2\2\u0119\u011b\t\5\2\2\u011a\u0119\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011dJ\3\2\2\2\u011e"+
		"\u0120\t\6\2\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u011f\3\2"+
		"\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\b%\2\2\u0124"+
		"L\3\2\2\2\u0125\u0126\7\'\2\2\u0126\u0127\7\'\2\2\u0127\u0128\3\2\2\2"+
		"\u0128\u0129\b&\3\2\u0129N\3\2\2\2\u012a\u012b\7>\2\2\u012b\u012c\7,\2"+
		"\2\u012c\u012d\3\2\2\2\u012d\u012e\b\'\4\2\u012eP\3\2\2\2\u012f\u0130"+
		"\7\17\2\2\u0130\u0131\7\f\2\2\u0131\u0132\3\2\2\2\u0132\u0133\b(\5\2\u0133"+
		"R\3\2\2\2\u0134\u0136\13\2\2\2\u0135\u0134\3\2\2\2\u0136\u0137\3\2\2\2"+
		"\u0137\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138T\3\2\2\2\u0139\u013a\7"+
		",\2\2\u013a\u013b\7@\2\2\u013b\u013c\3\2\2\2\u013c\u013d\b*\5\2\u013d"+
		"V\3\2\2\2\u013e\u0140\13\2\2\2\u013f\u013e\3\2\2\2\u0140\u0141\3\2\2\2"+
		"\u0141\u0142\3\2\2\2\u0141\u013f\3\2\2\2\u0142X\3\2\2\2\32\2\3\4_eoy\u008b"+
		"\u0097\u00a1\u00a9\u00b5\u00bf\u00c9\u00de\u0104\u0109\u010f\u0115\u0117"+
		"\u011c\u0121\u0137\u0141\6\b\2\2\7\3\2\7\4\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}