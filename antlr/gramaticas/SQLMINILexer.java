// Generated from SQLMINILexer.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SQLMINILexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

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

	public static final String[] ruleNames = {
		"SELECT", "FROM", "WHERE", "ORDER_BY", "AND", "OR", "ASC", "DESC", "OP_MENOR_ESTRICTO", 
		"OP_MAYOR_ESTRICTO", "OP_MENOR_IGUAL", "OP_MAYOR_IGUAL", "OP_DISTINTO", 
		"IGUAL", "PARENTESIS_IZQUIERDO", "PARENTESIS_DERECHO", "ASTERISCO", "COMA", 
		"IDENTIFICADOR", "ENTRE_COMILLAS", "REAL", "SALTO_LINEA", "ESPACIO", "COMENTARIOLINEA", 
		"COMENTARIOABRIR", "FINAL_COMENTARIO_LINEA", "TEXTO_COMENTARIO_LINEA", 
		"COMENTARIOCERRAR", "TEXTO_COMENTARIO_BLOQUE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, null, null, null, null, "'<'", "'>'", "'<='", 
		"'>='", "'!='", "'='", "'('", "')'", "'*'", "','", null, null, null, null, 
		null, "'--'", "'/*'", "'\r\n'", null, "'*/'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SELECT", "FROM", "WHERE", "ORDER_BY", "AND", "OR", "ASC", "DESC", 
		"OP_MENOR_ESTRICTO", "OP_MAYOR_ESTRICTO", "OP_MENOR_IGUAL", "OP_MAYOR_IGUAL", 
		"OP_DISTINTO", "IGUAL", "PARENTESIS_IZQUIERDO", "PARENTESIS_DERECHO", 
		"ASTERISCO", "COMA", "IDENTIFICADOR", "ENTRE_COMILLAS", "REAL", "SALTO_LINEA", 
		"ESPACIO", "COMENTARIOLINEA", "COMENTARIOABRIR", "FINAL_COMENTARIO_LINEA", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\37\u00f7\b\1\b\1"+
		"\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4"+
		"\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t"+
		"\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t"+
		"\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2L\n\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\5\3V\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4b\n"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5"+
		"t\n\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6|\n\6\3\7\3\7\3\7\3\7\5\7\u0082\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\5\b\u008a\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0094\n\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\6\24\u00ae\n\24"+
		"\r\24\16\24\u00af\3\24\7\24\u00b3\n\24\f\24\16\24\u00b6\13\24\3\25\3\25"+
		"\7\25\u00ba\n\25\f\25\16\25\u00bd\13\25\3\25\3\25\3\26\6\26\u00c2\n\26"+
		"\r\26\16\26\u00c3\3\26\3\26\6\26\u00c8\n\26\r\26\16\26\u00c9\5\26\u00cc"+
		"\n\26\3\27\6\27\u00cf\n\27\r\27\16\27\u00d0\3\30\6\30\u00d4\n\30\r\30"+
		"\16\30\u00d5\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\33\3\33\3\34\6\34\u00ea\n\34\r\34\16\34\u00eb\3\35"+
		"\3\35\3\35\3\35\3\35\3\36\6\36\u00f4\n\36\r\36\16\36\u00f5\4\u00eb\u00f5"+
		"\2\37\5\3\7\4\t\5\13\6\r\7\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17"+
		"\37\20!\21#\22%\23\'\24)\25+\26-\27/\30\61\31\63\32\65\33\67\349\35;\36"+
		"=\37\5\2\3\4\b\4\2C\\c|\5\2C\\aac|\3\2))\3\2\62;\4\2\f\f\17\17\4\2\13"+
		"\13\"\"\2\u0106\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3"+
		"\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2"+
		"\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\3\67\3\2\2\2\39\3\2\2\2\4"+
		";\3\2\2\2\4=\3\2\2\2\5K\3\2\2\2\7U\3\2\2\2\ta\3\2\2\2\13s\3\2\2\2\r{\3"+
		"\2\2\2\17\u0081\3\2\2\2\21\u0089\3\2\2\2\23\u0093\3\2\2\2\25\u0095\3\2"+
		"\2\2\27\u0097\3\2\2\2\31\u0099\3\2\2\2\33\u009c\3\2\2\2\35\u009f\3\2\2"+
		"\2\37\u00a2\3\2\2\2!\u00a4\3\2\2\2#\u00a6\3\2\2\2%\u00a8\3\2\2\2\'\u00aa"+
		"\3\2\2\2)\u00ad\3\2\2\2+\u00b7\3\2\2\2-\u00c1\3\2\2\2/\u00ce\3\2\2\2\61"+
		"\u00d3\3\2\2\2\63\u00d9\3\2\2\2\65\u00de\3\2\2\2\67\u00e3\3\2\2\29\u00e9"+
		"\3\2\2\2;\u00ed\3\2\2\2=\u00f3\3\2\2\2?@\7U\2\2@A\7G\2\2AB\7N\2\2BC\7"+
		"G\2\2CD\7E\2\2DL\7V\2\2EF\7u\2\2FG\7g\2\2GH\7n\2\2HI\7g\2\2IJ\7e\2\2J"+
		"L\7v\2\2K?\3\2\2\2KE\3\2\2\2L\6\3\2\2\2MN\7H\2\2NO\7T\2\2OP\7Q\2\2PV\7"+
		"O\2\2QR\7h\2\2RS\7t\2\2ST\7q\2\2TV\7o\2\2UM\3\2\2\2UQ\3\2\2\2V\b\3\2\2"+
		"\2WX\7Y\2\2XY\7J\2\2YZ\7G\2\2Z[\7T\2\2[b\7G\2\2\\]\7y\2\2]^\7j\2\2^_\7"+
		"g\2\2_`\7t\2\2`b\7g\2\2aW\3\2\2\2a\\\3\2\2\2b\n\3\2\2\2cd\7Q\2\2de\7T"+
		"\2\2ef\7F\2\2fg\7G\2\2gh\7T\2\2hi\7\"\2\2ij\7D\2\2jt\7[\2\2kl\7q\2\2l"+
		"m\7t\2\2mn\7f\2\2no\7g\2\2op\7t\2\2pq\7\"\2\2qr\7d\2\2rt\7{\2\2sc\3\2"+
		"\2\2sk\3\2\2\2t\f\3\2\2\2uv\7C\2\2vw\7P\2\2w|\7F\2\2xy\7c\2\2yz\7p\2\2"+
		"z|\7f\2\2{u\3\2\2\2{x\3\2\2\2|\16\3\2\2\2}~\7Q\2\2~\u0082\7T\2\2\177\u0080"+
		"\7q\2\2\u0080\u0082\7t\2\2\u0081}\3\2\2\2\u0081\177\3\2\2\2\u0082\20\3"+
		"\2\2\2\u0083\u0084\7C\2\2\u0084\u0085\7U\2\2\u0085\u008a\7E\2\2\u0086"+
		"\u0087\7c\2\2\u0087\u0088\7u\2\2\u0088\u008a\7e\2\2\u0089\u0083\3\2\2"+
		"\2\u0089\u0086\3\2\2\2\u008a\22\3\2\2\2\u008b\u008c\7F\2\2\u008c\u008d"+
		"\7G\2\2\u008d\u008e\7U\2\2\u008e\u0094\7E\2\2\u008f\u0090\7f\2\2\u0090"+
		"\u0091\7g\2\2\u0091\u0092\7u\2\2\u0092\u0094\7e\2\2\u0093\u008b\3\2\2"+
		"\2\u0093\u008f\3\2\2\2\u0094\24\3\2\2\2\u0095\u0096\7>\2\2\u0096\26\3"+
		"\2\2\2\u0097\u0098\7@\2\2\u0098\30\3\2\2\2\u0099\u009a\7>\2\2\u009a\u009b"+
		"\7?\2\2\u009b\32\3\2\2\2\u009c\u009d\7@\2\2\u009d\u009e\7?\2\2\u009e\34"+
		"\3\2\2\2\u009f\u00a0\7#\2\2\u00a0\u00a1\7?\2\2\u00a1\36\3\2\2\2\u00a2"+
		"\u00a3\7?\2\2\u00a3 \3\2\2\2\u00a4\u00a5\7*\2\2\u00a5\"\3\2\2\2\u00a6"+
		"\u00a7\7+\2\2\u00a7$\3\2\2\2\u00a8\u00a9\7,\2\2\u00a9&\3\2\2\2\u00aa\u00ab"+
		"\7.\2\2\u00ab(\3\2\2\2\u00ac\u00ae\t\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00af"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b4\3\2\2\2\u00b1"+
		"\u00b3\t\3\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5*\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00bb"+
		"\7)\2\2\u00b8\u00ba\n\4\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00be\u00bf\7)\2\2\u00bf,\3\2\2\2\u00c0\u00c2\t\5\2\2\u00c1\u00c0"+
		"\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00cb\3\2\2\2\u00c5\u00c7\7\60\2\2\u00c6\u00c8\t\5\2\2\u00c7\u00c6\3"+
		"\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cc\3\2\2\2\u00cb\u00c5\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc.\3\2\2\2"+
		"\u00cd\u00cf\t\6\2\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\60\3\2\2\2\u00d2\u00d4\t\7\2\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b\30\2\2\u00d8\62\3\2\2\2\u00d9\u00da"+
		"\7/\2\2\u00da\u00db\7/\2\2\u00db\u00dc\3\2\2\2\u00dc\u00dd\b\31\3\2\u00dd"+
		"\64\3\2\2\2\u00de\u00df\7\61\2\2\u00df\u00e0\7,\2\2\u00e0\u00e1\3\2\2"+
		"\2\u00e1\u00e2\b\32\4\2\u00e2\66\3\2\2\2\u00e3\u00e4\7\17\2\2\u00e4\u00e5"+
		"\7\f\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\b\33\5\2\u00e78\3\2\2\2\u00e8"+
		"\u00ea\13\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3"+
		"\2\2\2\u00eb\u00e9\3\2\2\2\u00ec:\3\2\2\2\u00ed\u00ee\7,\2\2\u00ee\u00ef"+
		"\7\61\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\b\35\5\2\u00f1<\3\2\2\2\u00f2"+
		"\u00f4\13\2\2\2\u00f3\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f6\3"+
		"\2\2\2\u00f5\u00f3\3\2\2\2\u00f6>\3\2\2\2\27\2\3\4KUas{\u0081\u0089\u0093"+
		"\u00af\u00b4\u00bb\u00c3\u00c9\u00cb\u00d0\u00d5\u00eb\u00f5\6\b\2\2\7"+
		"\3\2\7\4\2\6\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}