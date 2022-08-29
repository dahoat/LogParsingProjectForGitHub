// Generated from PostfixConnectionLexer.g4 by ANTLR 4.9

package at.daho.logparsingproject.logparser.antlr.parser;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PostfixConnectionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Whitespace=1, Linebreak=2, Colon=3, Dot=4, Slash=5, SquareBracketOpen=6, 
		SquareBracketClose=7, Connect=8, Disconnect=9, From=10, Month=11, Ip=12, 
		Integer=13, Float=14, Word=15, Char=16, String=17, Remainder=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"Whitespace", "Linebreak", "Colon", "Dot", "Slash", "SquareBracketOpen", 
			"SquareBracketClose", "Connect", "Disconnect", "From", "Month", "Jan", 
			"Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", 
			"Dec", "Ip", "Integer", "Float", "Word", "LowerWord", "UpperWord", "MixedWord", 
			"Char", "LowerChar", "UpperChar", "SpecialChar", "String", "Remainder"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "':'", "'.'", "'/'", "'['", "']'", "'connect'", "'disconnect'", 
			"'from'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Whitespace", "Linebreak", "Colon", "Dot", "Slash", "SquareBracketOpen", 
			"SquareBracketClose", "Connect", "Disconnect", "From", "Month", "Ip", 
			"Integer", "Float", "Word", "Char", "String", "Remainder"
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


	public PostfixConnectionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PostfixConnectionLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\24\u00f3\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\6\2M\n\2\r\2\16\2N\3\2\3\2\3\3\5"+
		"\3T\n\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f"+
		"\u0086\n\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\6\32\u00c1\n\32\r\32\16\32\u00c2\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\5\34\u00cc\n\34\3\35\6\35\u00cf\n\35\r\35\16\35\u00d0\3\36\6"+
		"\36\u00d4\n\36\r\36\16\36\u00d5\3\37\3\37\6\37\u00da\n\37\r\37\16\37\u00db"+
		"\3 \3 \5 \u00e0\n \3!\3!\3\"\3\"\3#\3#\3$\3$\3$\6$\u00eb\n$\r$\16$\u00ec"+
		"\3%\6%\u00f0\n%\r%\16%\u00f1\3\u00f1\2&\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\2\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\2/\2\61"+
		"\16\63\17\65\20\67\219\2;\2=\2?\22A\2C\2E\2G\23I\24\3\2\4\4\2\13\13\""+
		"\"\3\2//\2\u00f9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"?\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\3L\3\2\2\2\5S\3\2\2\2\7W\3\2\2\2\tY\3"+
		"\2\2\2\13[\3\2\2\2\r]\3\2\2\2\17_\3\2\2\2\21a\3\2\2\2\23i\3\2\2\2\25t"+
		"\3\2\2\2\27\u0085\3\2\2\2\31\u0087\3\2\2\2\33\u008b\3\2\2\2\35\u008f\3"+
		"\2\2\2\37\u0093\3\2\2\2!\u0097\3\2\2\2#\u009b\3\2\2\2%\u009f\3\2\2\2\'"+
		"\u00a3\3\2\2\2)\u00a7\3\2\2\2+\u00ab\3\2\2\2-\u00af\3\2\2\2/\u00b3\3\2"+
		"\2\2\61\u00b7\3\2\2\2\63\u00c0\3\2\2\2\65\u00c4\3\2\2\2\67\u00cb\3\2\2"+
		"\29\u00ce\3\2\2\2;\u00d3\3\2\2\2=\u00d9\3\2\2\2?\u00df\3\2\2\2A\u00e1"+
		"\3\2\2\2C\u00e3\3\2\2\2E\u00e5\3\2\2\2G\u00ea\3\2\2\2I\u00ef\3\2\2\2K"+
		"M\t\2\2\2LK\3\2\2\2MN\3\2\2\2NL\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\b\2\2\2"+
		"Q\4\3\2\2\2RT\7\17\2\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UV\7\f\2\2V\6\3\2"+
		"\2\2WX\7<\2\2X\b\3\2\2\2YZ\7\60\2\2Z\n\3\2\2\2[\\\7\61\2\2\\\f\3\2\2\2"+
		"]^\7]\2\2^\16\3\2\2\2_`\7_\2\2`\20\3\2\2\2ab\7e\2\2bc\7q\2\2cd\7p\2\2"+
		"de\7p\2\2ef\7g\2\2fg\7e\2\2gh\7v\2\2h\22\3\2\2\2ij\7f\2\2jk\7k\2\2kl\7"+
		"u\2\2lm\7e\2\2mn\7q\2\2no\7p\2\2op\7p\2\2pq\7g\2\2qr\7e\2\2rs\7v\2\2s"+
		"\24\3\2\2\2tu\7h\2\2uv\7t\2\2vw\7q\2\2wx\7o\2\2x\26\3\2\2\2y\u0086\5\31"+
		"\r\2z\u0086\5\33\16\2{\u0086\5\35\17\2|\u0086\5\37\20\2}\u0086\5!\21\2"+
		"~\u0086\5#\22\2\177\u0086\5%\23\2\u0080\u0086\5\'\24\2\u0081\u0086\5)"+
		"\25\2\u0082\u0086\5+\26\2\u0083\u0086\5-\27\2\u0084\u0086\5/\30\2\u0085"+
		"y\3\2\2\2\u0085z\3\2\2\2\u0085{\3\2\2\2\u0085|\3\2\2\2\u0085}\3\2\2\2"+
		"\u0085~\3\2\2\2\u0085\177\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0081\3\2"+
		"\2\2\u0085\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086"+
		"\30\3\2\2\2\u0087\u0088\7L\2\2\u0088\u0089\7c\2\2\u0089\u008a\7p\2\2\u008a"+
		"\32\3\2\2\2\u008b\u008c\7H\2\2\u008c\u008d\7g\2\2\u008d\u008e\7d\2\2\u008e"+
		"\34\3\2\2\2\u008f\u0090\7O\2\2\u0090\u0091\7c\2\2\u0091\u0092\7t\2\2\u0092"+
		"\36\3\2\2\2\u0093\u0094\7C\2\2\u0094\u0095\7r\2\2\u0095\u0096\7t\2\2\u0096"+
		" \3\2\2\2\u0097\u0098\7O\2\2\u0098\u0099\7c\2\2\u0099\u009a\7{\2\2\u009a"+
		"\"\3\2\2\2\u009b\u009c\7L\2\2\u009c\u009d\7w\2\2\u009d\u009e\7p\2\2\u009e"+
		"$\3\2\2\2\u009f\u00a0\7L\2\2\u00a0\u00a1\7w\2\2\u00a1\u00a2\7n\2\2\u00a2"+
		"&\3\2\2\2\u00a3\u00a4\7C\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7i\2\2\u00a6"+
		"(\3\2\2\2\u00a7\u00a8\7U\2\2\u00a8\u00a9\7g\2\2\u00a9\u00aa\7r\2\2\u00aa"+
		"*\3\2\2\2\u00ab\u00ac\7Q\2\2\u00ac\u00ad\7e\2\2\u00ad\u00ae\7v\2\2\u00ae"+
		",\3\2\2\2\u00af\u00b0\7P\2\2\u00b0\u00b1\7q\2\2\u00b1\u00b2\7x\2\2\u00b2"+
		".\3\2\2\2\u00b3\u00b4\7F\2\2\u00b4\u00b5\7g\2\2\u00b5\u00b6\7e\2\2\u00b6"+
		"\60\3\2\2\2\u00b7\u00b8\5\63\32\2\u00b8\u00b9\5\t\5\2\u00b9\u00ba\5\63"+
		"\32\2\u00ba\u00bb\5\t\5\2\u00bb\u00bc\5\63\32\2\u00bc\u00bd\5\t\5\2\u00bd"+
		"\u00be\5\63\32\2\u00be\62\3\2\2\2\u00bf\u00c1\4\62;\2\u00c0\u00bf\3\2"+
		"\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3"+
		"\64\3\2\2\2\u00c4\u00c5\5\63\32\2\u00c5\u00c6\7\60\2\2\u00c6\u00c7\5\63"+
		"\32\2\u00c7\66\3\2\2\2\u00c8\u00cc\59\35\2\u00c9\u00cc\5;\36\2\u00ca\u00cc"+
		"\5=\37\2\u00cb\u00c8\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"8\3\2\2\2\u00cd\u00cf\5A!\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1:\3\2\2\2\u00d2\u00d4\5C\"\2\u00d3"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2"+
		"\2\2\u00d6<\3\2\2\2\u00d7\u00da\5A!\2\u00d8\u00da\5C\"\2\u00d9\u00d7\3"+
		"\2\2\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc>\3\2\2\2\u00dd\u00e0\5A!\2\u00de\u00e0\5C\"\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0@\3\2\2\2\u00e1\u00e2\4c|\2\u00e2"+
		"B\3\2\2\2\u00e3\u00e4\4C\\\2\u00e4D\3\2\2\2\u00e5\u00e6\t\3\2\2\u00e6"+
		"F\3\2\2\2\u00e7\u00eb\5? \2\u00e8\u00eb\5\63\32\2\u00e9\u00eb\5E#\2\u00ea"+
		"\u00e7\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00edH\3\2\2\2\u00ee\u00f0"+
		"\13\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2"+
		"\u00f1\u00ef\3\2\2\2\u00f2J\3\2\2\2\20\2NS\u0085\u00c2\u00cb\u00d0\u00d5"+
		"\u00d9\u00db\u00df\u00ea\u00ec\u00f1\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}