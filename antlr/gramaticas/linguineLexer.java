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
		LET=1, IF=2, THEN=3, ELSE=4, FUN=5, MATCH=6, WITH=7, SHOW=8, PARENTESIS_IZQUIERDO=9, 
		PARENTESIS_DERECHO=10, SEPARADOR_MATCH=11, INTERROGACION=12, FLECHA_DERECHA=13, 
		LITERAL_CADENA=14, COMA=15, IGUAL=16, PUNTO_Y_COMA=17, OP_SUMA=18, OP_RESTA=19, 
		OP_MULT=20, OP_DIV=21, OP_MENOR_ESTRICTO=22, OP_MAYOR_ESTRICTO=23, OP_MENOR_IGUAL=24, 
		OP_MAYOR_IGUAL=25, OP_DISTINTO=26, IDENTIFICADOR=27, REAL=28, SALTO_LINEA=29, 
		ESPACIOS=30, COMENTARIOLINEA=31, COMENTARIOABRIR=32, FINAL_COMENTARIO_LINEA=33, 
		TEXTO_COMENTARIO_LINEA=34, COMENTARIOCERRAR=35, TEXTO_COMENTARIO_BLOQUE=36;
	public static final int
		COMENTARIO_LINEA_MODE=1, COMENTARIO_BLOQUE_MODE=2;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE", "COMENTARIO_LINEA_MODE", "COMENTARIO_BLOQUE_MODE"
	};

	public static final String[] ruleNames = {
		"LET", "IF", "THEN", "ELSE", "FUN", "MATCH", "WITH", "SHOW", "PARENTESIS_IZQUIERDO", 
		"PARENTESIS_DERECHO", "SEPARADOR_MATCH", "INTERROGACION", "FLECHA_DERECHA", 
		"LITERAL_CADENA", "COMA", "IGUAL", "PUNTO_Y_COMA", "OP_SUMA", "OP_RESTA", 
		"OP_MULT", "OP_DIV", "OP_MENOR_ESTRICTO", "OP_MAYOR_ESTRICTO", "OP_MENOR_IGUAL", 
		"OP_MAYOR_IGUAL", "OP_DISTINTO", "IDENTIFICADOR", "REAL", "SALTO_LINEA", 
		"ESPACIOS", "COMENTARIOLINEA", "COMENTARIOABRIR", "FINAL_COMENTARIO_LINEA", 
		"TEXTO_COMENTARIO_LINEA", "COMENTARIOCERRAR", "TEXTO_COMENTARIO_BLOQUE"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0108\b\1\b\1\b"+
		"\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n"+
		"\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21"+
		"\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30"+
		"\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37"+
		"\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\2\3\2\3\2\3\2\5\2T\n"+
		"\2\3\3\3\3\3\3\3\3\5\3Z\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4d\n\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5n\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6v\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0082\n\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\5\b\u008c\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0096"+
		"\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\7\17\u00a5"+
		"\n\17\f\17\16\17\u00a8\13\17\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\6\34\u00c8\n\34\r\34\16\34\u00c9"+
		"\3\34\7\34\u00cd\n\34\f\34\16\34\u00d0\13\34\3\35\6\35\u00d3\n\35\r\35"+
		"\16\35\u00d4\3\35\3\35\6\35\u00d9\n\35\r\35\16\35\u00da\5\35\u00dd\n\35"+
		"\3\36\6\36\u00e0\n\36\r\36\16\36\u00e1\3\37\6\37\u00e5\n\37\r\37\16\37"+
		"\u00e6\3\37\3\37\3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#"+
		"\6#\u00fb\n#\r#\16#\u00fc\3$\3$\3$\3$\3$\3%\6%\u0105\n%\r%\16%\u0106\5"+
		"\u00a6\u00fc\u0106\2&\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31"+
		"\r\33\16\35\17\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33"+
		"\67\349\35;\36=\37? A!C\"E#G$I%K&\5\2\3\4\7\4\2C\\c|\6\2\62;C\\aac|\3"+
		"\2\62;\4\2\f\f\17\17\4\2\13\13\"\"\2\u0117\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\3E\3\2\2\2\3G\3\2\2\2\4I\3\2\2\2\4K\3\2\2\2\5S\3\2\2\2\7Y\3"+
		"\2\2\2\tc\3\2\2\2\13m\3\2\2\2\ru\3\2\2\2\17\u0081\3\2\2\2\21\u008b\3\2"+
		"\2\2\23\u0095\3\2\2\2\25\u0097\3\2\2\2\27\u0099\3\2\2\2\31\u009b\3\2\2"+
		"\2\33\u009d\3\2\2\2\35\u009f\3\2\2\2\37\u00a2\3\2\2\2!\u00ab\3\2\2\2#"+
		"\u00ad\3\2\2\2%\u00af\3\2\2\2\'\u00b1\3\2\2\2)\u00b3\3\2\2\2+\u00b5\3"+
		"\2\2\2-\u00b7\3\2\2\2/\u00b9\3\2\2\2\61\u00bb\3\2\2\2\63\u00bd\3\2\2\2"+
		"\65\u00c0\3\2\2\2\67\u00c3\3\2\2\29\u00c7\3\2\2\2;\u00d2\3\2\2\2=\u00df"+
		"\3\2\2\2?\u00e4\3\2\2\2A\u00ea\3\2\2\2C\u00ef\3\2\2\2E\u00f4\3\2\2\2G"+
		"\u00fa\3\2\2\2I\u00fe\3\2\2\2K\u0104\3\2\2\2MN\7n\2\2NO\7g\2\2OT\7v\2"+
		"\2PQ\7N\2\2QR\7G\2\2RT\7V\2\2SM\3\2\2\2SP\3\2\2\2T\6\3\2\2\2UV\7k\2\2"+
		"VZ\7h\2\2WX\7K\2\2XZ\7H\2\2YU\3\2\2\2YW\3\2\2\2Z\b\3\2\2\2[\\\7v\2\2\\"+
		"]\7j\2\2]^\7g\2\2^d\7p\2\2_`\7V\2\2`a\7J\2\2ab\7G\2\2bd\7P\2\2c[\3\2\2"+
		"\2c_\3\2\2\2d\n\3\2\2\2ef\7g\2\2fg\7n\2\2gh\7u\2\2hn\7g\2\2ij\7G\2\2j"+
		"k\7N\2\2kl\7U\2\2ln\7G\2\2me\3\2\2\2mi\3\2\2\2n\f\3\2\2\2op\7h\2\2pq\7"+
		"w\2\2qv\7p\2\2rs\7H\2\2st\7W\2\2tv\7P\2\2uo\3\2\2\2ur\3\2\2\2v\16\3\2"+
		"\2\2wx\7o\2\2xy\7c\2\2yz\7v\2\2z{\7e\2\2{\u0082\7j\2\2|}\7O\2\2}~\7C\2"+
		"\2~\177\7V\2\2\177\u0080\7E\2\2\u0080\u0082\7J\2\2\u0081w\3\2\2\2\u0081"+
		"|\3\2\2\2\u0082\20\3\2\2\2\u0083\u0084\7y\2\2\u0084\u0085\7k\2\2\u0085"+
		"\u0086\7v\2\2\u0086\u008c\7j\2\2\u0087\u0088\7Y\2\2\u0088\u0089\7K\2\2"+
		"\u0089\u008a\7V\2\2\u008a\u008c\7J\2\2\u008b\u0083\3\2\2\2\u008b\u0087"+
		"\3\2\2\2\u008c\22\3\2\2\2\u008d\u008e\7u\2\2\u008e\u008f\7j\2\2\u008f"+
		"\u0090\7q\2\2\u0090\u0096\7y\2\2\u0091\u0092\7U\2\2\u0092\u0093\7J\2\2"+
		"\u0093\u0094\7Q\2\2\u0094\u0096\7Y\2\2\u0095\u008d\3\2\2\2\u0095\u0091"+
		"\3\2\2\2\u0096\24\3\2\2\2\u0097\u0098\7*\2\2\u0098\26\3\2\2\2\u0099\u009a"+
		"\7+\2\2\u009a\30\3\2\2\2\u009b\u009c\7~\2\2\u009c\32\3\2\2\2\u009d\u009e"+
		"\7A\2\2\u009e\34\3\2\2\2\u009f\u00a0\7/\2\2\u00a0\u00a1\7@\2\2\u00a1\36"+
		"\3\2\2\2\u00a2\u00a6\7$\2\2\u00a3\u00a5\13\2\2\2\u00a4\u00a3\3\2\2\2\u00a5"+
		"\u00a8\3\2\2\2\u00a6\u00a7\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\3\2"+
		"\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00aa\7$\2\2\u00aa \3\2\2\2\u00ab\u00ac"+
		"\7.\2\2\u00ac\"\3\2\2\2\u00ad\u00ae\7?\2\2\u00ae$\3\2\2\2\u00af\u00b0"+
		"\7=\2\2\u00b0&\3\2\2\2\u00b1\u00b2\7-\2\2\u00b2(\3\2\2\2\u00b3\u00b4\7"+
		"/\2\2\u00b4*\3\2\2\2\u00b5\u00b6\7,\2\2\u00b6,\3\2\2\2\u00b7\u00b8\7\61"+
		"\2\2\u00b8.\3\2\2\2\u00b9\u00ba\7>\2\2\u00ba\60\3\2\2\2\u00bb\u00bc\7"+
		"@\2\2\u00bc\62\3\2\2\2\u00bd\u00be\7>\2\2\u00be\u00bf\7?\2\2\u00bf\64"+
		"\3\2\2\2\u00c0\u00c1\7@\2\2\u00c1\u00c2\7?\2\2\u00c2\66\3\2\2\2\u00c3"+
		"\u00c4\7#\2\2\u00c4\u00c5\7?\2\2\u00c58\3\2\2\2\u00c6\u00c8\t\2\2\2\u00c7"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00cd\t\3\2\2\u00cc\u00cb\3\2\2\2\u00cd"+
		"\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf:\3\2\2\2"+
		"\u00d0\u00ce\3\2\2\2\u00d1\u00d3\t\4\2\2\u00d2\u00d1\3\2\2\2\u00d3\u00d4"+
		"\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00dc\3\2\2\2\u00d6"+
		"\u00d8\7\60\2\2\u00d7\u00d9\t\4\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00da\3"+
		"\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc"+
		"\u00d6\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd<\3\2\2\2\u00de\u00e0\t\5\2\2"+
		"\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2"+
		"\3\2\2\2\u00e2>\3\2\2\2\u00e3\u00e5\t\6\2\2\u00e4\u00e3\3\2\2\2\u00e5"+
		"\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3\2"+
		"\2\2\u00e8\u00e9\b\37\2\2\u00e9@\3\2\2\2\u00ea\u00eb\7\'\2\2\u00eb\u00ec"+
		"\7\'\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\b \3\2\u00eeB\3\2\2\2\u00ef\u00f0"+
		"\7>\2\2\u00f0\u00f1\7,\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\b!\4\2\u00f3"+
		"D\3\2\2\2\u00f4\u00f5\7\17\2\2\u00f5\u00f6\7\f\2\2\u00f6\u00f7\3\2\2\2"+
		"\u00f7\u00f8\b\"\5\2\u00f8F\3\2\2\2\u00f9\u00fb\13\2\2\2\u00fa\u00f9\3"+
		"\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"H\3\2\2\2\u00fe\u00ff\7,\2\2\u00ff\u0100\7@\2\2\u0100\u0101\3\2\2\2\u0101"+
		"\u0102\b$\5\2\u0102J\3\2\2\2\u0103\u0105\13\2\2\2\u0104\u0103\3\2\2\2"+
		"\u0105\u0106\3\2\2\2\u0106\u0107\3\2\2\2\u0106\u0104\3\2\2\2\u0107L\3"+
		"\2\2\2\27\2\3\4SYcmu\u0081\u008b\u0095\u00a6\u00c9\u00ce\u00d4\u00da\u00dc"+
		"\u00e1\u00e6\u00fc\u0106\6\b\2\2\7\3\2\7\4\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}