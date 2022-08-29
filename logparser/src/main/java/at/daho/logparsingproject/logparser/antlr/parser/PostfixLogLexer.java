// Generated from PostfixLogLexer.g4 by ANTLR 4.9

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
public class PostfixLogLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, NewLine=2, Text=3, Colon=4, Slash=5, RoundBracketOpen=6, RoundBracketClose=7, 
		SquareBracketOpen=8, SquareBracketClose=9, Dot=10, Comma=11, Singlequote=12, 
		Doublequote=13, Quote=14, Connect=15, Disconnect=16, From=17, AnonymousTlsConnectionEstablished=18, 
		TlsVersion=19, WithCipher=20, Bits=21, Warning=22, Lost=23, Statistics=24, 
		SaslLoginAuthenticationFailed=25, LostConnectionAfter=26, MaxConnectionRate=27, 
		MaxConnectionCount=28, MaxCacheSize=29, SixtySeconds=30, At=31, For=32, 
		NotInternal=33, Less=34, Greater=35, NotAuthenticated=36, DkimVerificationSuccessful=37, 
		SelectorEquals=38, DomainEquals=39, Ssl=40, FromEquals=41, ToEquals=42, 
		RelayEquals=43, DelayEquals=44, DelaysEquals=45, SizeEquals=46, NumRecipientsEquals=47, 
		MessageIdEquals=48, ClientEquals=49, PrivateDovecot=50, DsnEquals=51, 
		StatusEquals=52, Saved=53, Removed=54, KeyRetrieval=55, DoesNotResolveToAddress=56, 
		Hostname=57, Char=58, Int=59, Float=60, Month=61, Jan=62, Feb=63, Mar=64, 
		Apr=65, May=66, Jun=67, Jul=68, Aug=69, Sep=70, Oct=71, Nov=72, Dec=73, 
		Ip=74, Word=75, Alphanum=76, Email=77, String=78;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "NewLine", "Text", "Colon", "Slash", "RoundBracketOpen", "RoundBracketClose", 
			"SquareBracketOpen", "SquareBracketClose", "Dot", "Comma", "Singlequote", 
			"Doublequote", "Quote", "Connect", "Disconnect", "From", "AnonymousTlsConnectionEstablished", 
			"TlsVersion", "WithCipher", "Bits", "Warning", "Lost", "Statistics", 
			"SaslLoginAuthenticationFailed", "LostConnectionAfter", "MaxConnectionRate", 
			"MaxConnectionCount", "MaxCacheSize", "SixtySeconds", "At", "For", "NotInternal", 
			"Less", "Greater", "NotAuthenticated", "DkimVerificationSuccessful", 
			"SelectorEquals", "DomainEquals", "Ssl", "FromEquals", "ToEquals", "RelayEquals", 
			"DelayEquals", "DelaysEquals", "SizeEquals", "NumRecipientsEquals", "MessageIdEquals", 
			"ClientEquals", "PrivateDovecot", "DsnEquals", "StatusEquals", "Saved", 
			"Removed", "KeyRetrieval", "DoesNotResolveToAddress", "Hostname", "Char", 
			"Int", "Float", "Month", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", 
			"Aug", "Sep", "Oct", "Nov", "Dec", "Ip", "Word", "Alphanum", "Email", 
			"String", "Specialchar"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "':'", "'/'", "'('", "')'", "'['", "']'", "'.'", 
			"','", "'''", "'\"'", null, "'connect'", "'disconnect'", "'from'", "'Anonymous TLS connection established'", 
			null, "'with cipher'", "'bits'", "'warning'", "'lost'", "'statistics'", 
			"'SASL LOGIN authentication failed'", "'lost connection after'", "'max connection rate'", 
			"'max connection count'", "'max cache size'", "'60s'", "'at'", "'for'", 
			"'not internal'", "'<'", "'>'", "'not authenticated'", "'DKIM verification successful'", 
			"'s='", "'d='", "'SSL'", "'from='", "'to='", "'relay='", "'delay='", 
			"'delays='", "'size='", "'nrcpt='", "'message-id='", "'client='", "'private/dovecot-lmtp'", 
			"'dsn='", "'status='", "'Saved'", "'removed'", "'key retrieval'", "'does not resolve to address'", 
			"'hostname'", null, null, null, null, "'Jan'", "'Feb'", "'Mar'", "'Apr'", 
			"'May'", "'Jun'", "'Jul'", "'Aug'", "'Sep'", "'Oct'", "'Nov'", "'Dec'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "NewLine", "Text", "Colon", "Slash", "RoundBracketOpen", 
			"RoundBracketClose", "SquareBracketOpen", "SquareBracketClose", "Dot", 
			"Comma", "Singlequote", "Doublequote", "Quote", "Connect", "Disconnect", 
			"From", "AnonymousTlsConnectionEstablished", "TlsVersion", "WithCipher", 
			"Bits", "Warning", "Lost", "Statistics", "SaslLoginAuthenticationFailed", 
			"LostConnectionAfter", "MaxConnectionRate", "MaxConnectionCount", "MaxCacheSize", 
			"SixtySeconds", "At", "For", "NotInternal", "Less", "Greater", "NotAuthenticated", 
			"DkimVerificationSuccessful", "SelectorEquals", "DomainEquals", "Ssl", 
			"FromEquals", "ToEquals", "RelayEquals", "DelayEquals", "DelaysEquals", 
			"SizeEquals", "NumRecipientsEquals", "MessageIdEquals", "ClientEquals", 
			"PrivateDovecot", "DsnEquals", "StatusEquals", "Saved", "Removed", "KeyRetrieval", 
			"DoesNotResolveToAddress", "Hostname", "Char", "Int", "Float", "Month", 
			"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", 
			"Nov", "Dec", "Ip", "Word", "Alphanum", "Email", "String"
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


	public PostfixLogLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PostfixLogLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2P\u0307\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\3\2\6\2\u00a3\n\2\r\2\16"+
		"\2\u00a4\3\2\3\2\3\3\3\3\3\3\5\3\u00ac\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3"+
		"\16\3\17\3\17\5\17\u00c8\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3$\3$\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3"+
		"(\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3"+
		"-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3"+
		"\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3"+
		"\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3"+
		"\67\3\67\3\67\38\38\38\38\38\38\38\38\38\38\38\38\38\38\39\39\39\39\3"+
		"9\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\3"+
		"9\3:\3:\3:\3:\3:\3:\3:\3:\3:\3;\3;\3<\6<\u02a2\n<\r<\16<\u02a3\3=\3=\3"+
		"=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u02b6\n>\3?\3?\3?\3?\3@\3"+
		"@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3C\3C\3C\3C\3D\3D\3D\3D\3E\3E\3E\3E\3"+
		"F\3F\3F\3F\3G\3G\3G\3G\3H\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3K\3K\3K\3"+
		"K\3K\3K\3K\3K\3L\6L\u02f1\nL\rL\16L\u02f2\3M\3M\6M\u02f7\nM\rM\16M\u02f8"+
		"\3N\3N\3N\3N\3O\3O\3O\6O\u0302\nO\rO\16O\u0303\3P\3P\2\2Q\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f\2\3\2\5\4\2\13\13\""+
		"\"\4\2C\\c|\5\2/\60BBaa\2\u031a\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2"+
		"\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093"+
		"\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2"+
		"\2\2\u009d\3\2\2\2\3\u00a2\3\2\2\2\5\u00ab\3\2\2\2\7\u00ad\3\2\2\2\t\u00b1"+
		"\3\2\2\2\13\u00b3\3\2\2\2\r\u00b5\3\2\2\2\17\u00b7\3\2\2\2\21\u00b9\3"+
		"\2\2\2\23\u00bb\3\2\2\2\25\u00bd\3\2\2\2\27\u00bf\3\2\2\2\31\u00c1\3\2"+
		"\2\2\33\u00c3\3\2\2\2\35\u00c7\3\2\2\2\37\u00c9\3\2\2\2!\u00d1\3\2\2\2"+
		"#\u00dc\3\2\2\2%\u00e1\3\2\2\2\'\u0106\3\2\2\2)\u010d\3\2\2\2+\u0119\3"+
		"\2\2\2-\u011e\3\2\2\2/\u0126\3\2\2\2\61\u012b\3\2\2\2\63\u0136\3\2\2\2"+
		"\65\u0157\3\2\2\2\67\u016d\3\2\2\29\u0181\3\2\2\2;\u0196\3\2\2\2=\u01a5"+
		"\3\2\2\2?\u01a9\3\2\2\2A\u01ac\3\2\2\2C\u01b0\3\2\2\2E\u01bd\3\2\2\2G"+
		"\u01bf\3\2\2\2I\u01c1\3\2\2\2K\u01d3\3\2\2\2M\u01f0\3\2\2\2O\u01f3\3\2"+
		"\2\2Q\u01f6\3\2\2\2S\u01fa\3\2\2\2U\u0200\3\2\2\2W\u0204\3\2\2\2Y\u020b"+
		"\3\2\2\2[\u0212\3\2\2\2]\u021a\3\2\2\2_\u0220\3\2\2\2a\u0227\3\2\2\2c"+
		"\u0233\3\2\2\2e\u023b\3\2\2\2g\u0250\3\2\2\2i\u0255\3\2\2\2k\u025d\3\2"+
		"\2\2m\u0263\3\2\2\2o\u026b\3\2\2\2q\u0279\3\2\2\2s\u0295\3\2\2\2u\u029e"+
		"\3\2\2\2w\u02a1\3\2\2\2y\u02a5\3\2\2\2{\u02b5\3\2\2\2}\u02b7\3\2\2\2\177"+
		"\u02bb\3\2\2\2\u0081\u02bf\3\2\2\2\u0083\u02c3\3\2\2\2\u0085\u02c7\3\2"+
		"\2\2\u0087\u02cb\3\2\2\2\u0089\u02cf\3\2\2\2\u008b\u02d3\3\2\2\2\u008d"+
		"\u02d7\3\2\2\2\u008f\u02db\3\2\2\2\u0091\u02df\3\2\2\2\u0093\u02e3\3\2"+
		"\2\2\u0095\u02e7\3\2\2\2\u0097\u02f0\3\2\2\2\u0099\u02f6\3\2\2\2\u009b"+
		"\u02fa\3\2\2\2\u009d\u0301\3\2\2\2\u009f\u0305\3\2\2\2\u00a1\u00a3\t\2"+
		"\2\2\u00a2\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4"+
		"\u00a5\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\b\2\2\2\u00a7\4\3\2\2\2"+
		"\u00a8\u00a9\7\17\2\2\u00a9\u00ac\7\f\2\2\u00aa\u00ac\7\f\2\2\u00ab\u00a8"+
		"\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\6\3\2\2\2\u00ad\u00ae\5\35\17\2\u00ae"+
		"\u00af\5\u009dO\2\u00af\u00b0\5\35\17\2\u00b0\b\3\2\2\2\u00b1\u00b2\7"+
		"<\2\2\u00b2\n\3\2\2\2\u00b3\u00b4\7\61\2\2\u00b4\f\3\2\2\2\u00b5\u00b6"+
		"\7*\2\2\u00b6\16\3\2\2\2\u00b7\u00b8\7+\2\2\u00b8\20\3\2\2\2\u00b9\u00ba"+
		"\7]\2\2\u00ba\22\3\2\2\2\u00bb\u00bc\7_\2\2\u00bc\24\3\2\2\2\u00bd\u00be"+
		"\7\60\2\2\u00be\26\3\2\2\2\u00bf\u00c0\7.\2\2\u00c0\30\3\2\2\2\u00c1\u00c2"+
		"\7)\2\2\u00c2\32\3\2\2\2\u00c3\u00c4\7$\2\2\u00c4\34\3\2\2\2\u00c5\u00c8"+
		"\5\31\r\2\u00c6\u00c8\5\33\16\2\u00c7\u00c5\3\2\2\2\u00c7\u00c6\3\2\2"+
		"\2\u00c8\36\3\2\2\2\u00c9\u00ca\7e\2\2\u00ca\u00cb\7q\2\2\u00cb\u00cc"+
		"\7p\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf\7e\2\2\u00cf"+
		"\u00d0\7v\2\2\u00d0 \3\2\2\2\u00d1\u00d2\7f\2\2\u00d2\u00d3\7k\2\2\u00d3"+
		"\u00d4\7u\2\2\u00d4\u00d5\7e\2\2\u00d5\u00d6\7q\2\2\u00d6\u00d7\7p\2\2"+
		"\u00d7\u00d8\7p\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7e\2\2\u00da\u00db"+
		"\7v\2\2\u00db\"\3\2\2\2\u00dc\u00dd\7h\2\2\u00dd\u00de\7t\2\2\u00de\u00df"+
		"\7q\2\2\u00df\u00e0\7o\2\2\u00e0$\3\2\2\2\u00e1\u00e2\7C\2\2\u00e2\u00e3"+
		"\7p\2\2\u00e3\u00e4\7q\2\2\u00e4\u00e5\7p\2\2\u00e5\u00e6\7{\2\2\u00e6"+
		"\u00e7\7o\2\2\u00e7\u00e8\7q\2\2\u00e8\u00e9\7w\2\2\u00e9\u00ea\7u\2\2"+
		"\u00ea\u00eb\7\"\2\2\u00eb\u00ec\7V\2\2\u00ec\u00ed\7N\2\2\u00ed\u00ee"+
		"\7U\2\2\u00ee\u00ef\7\"\2\2\u00ef\u00f0\7e\2\2\u00f0\u00f1\7q\2\2\u00f1"+
		"\u00f2\7p\2\2\u00f2\u00f3\7p\2\2\u00f3\u00f4\7g\2\2\u00f4\u00f5\7e\2\2"+
		"\u00f5\u00f6\7v\2\2\u00f6\u00f7\7k\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9"+
		"\7p\2\2\u00f9\u00fa\7\"\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7u\2\2\u00fc"+
		"\u00fd\7v\2\2\u00fd\u00fe\7c\2\2\u00fe\u00ff\7d\2\2\u00ff\u0100\7n\2\2"+
		"\u0100\u0101\7k\2\2\u0101\u0102\7u\2\2\u0102\u0103\7j\2\2\u0103\u0104"+
		"\7g\2\2\u0104\u0105\7f\2\2\u0105&\3\2\2\2\u0106\u0107\7V\2\2\u0107\u0108"+
		"\7N\2\2\u0108\u0109\7U\2\2\u0109\u010a\7x\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010c\5\u009dO\2\u010c(\3\2\2\2\u010d\u010e\7y\2\2\u010e\u010f\7k\2\2"+
		"\u010f\u0110\7v\2\2\u0110\u0111\7j\2\2\u0111\u0112\7\"\2\2\u0112\u0113"+
		"\7e\2\2\u0113\u0114\7k\2\2\u0114\u0115\7r\2\2\u0115\u0116\7j\2\2\u0116"+
		"\u0117\7g\2\2\u0117\u0118\7t\2\2\u0118*\3\2\2\2\u0119\u011a\7d\2\2\u011a"+
		"\u011b\7k\2\2\u011b\u011c\7v\2\2\u011c\u011d\7u\2\2\u011d,\3\2\2\2\u011e"+
		"\u011f\7y\2\2\u011f\u0120\7c\2\2\u0120\u0121\7t\2\2\u0121\u0122\7p\2\2"+
		"\u0122\u0123\7k\2\2\u0123\u0124\7p\2\2\u0124\u0125\7i\2\2\u0125.\3\2\2"+
		"\2\u0126\u0127\7n\2\2\u0127\u0128\7q\2\2\u0128\u0129\7u\2\2\u0129\u012a"+
		"\7v\2\2\u012a\60\3\2\2\2\u012b\u012c\7u\2\2\u012c\u012d\7v\2\2\u012d\u012e"+
		"\7c\2\2\u012e\u012f\7v\2\2\u012f\u0130\7k\2\2\u0130\u0131\7u\2\2\u0131"+
		"\u0132\7v\2\2\u0132\u0133\7k\2\2\u0133\u0134\7e\2\2\u0134\u0135\7u\2\2"+
		"\u0135\62\3\2\2\2\u0136\u0137\7U\2\2\u0137\u0138\7C\2\2\u0138\u0139\7"+
		"U\2\2\u0139\u013a\7N\2\2\u013a\u013b\7\"\2\2\u013b\u013c\7N\2\2\u013c"+
		"\u013d\7Q\2\2\u013d\u013e\7I\2\2\u013e\u013f\7K\2\2\u013f\u0140\7P\2\2"+
		"\u0140\u0141\7\"\2\2\u0141\u0142\7c\2\2\u0142\u0143\7w\2\2\u0143\u0144"+
		"\7v\2\2\u0144\u0145\7j\2\2\u0145\u0146\7g\2\2\u0146\u0147\7p\2\2\u0147"+
		"\u0148\7v\2\2\u0148\u0149\7k\2\2\u0149\u014a\7e\2\2\u014a\u014b\7c\2\2"+
		"\u014b\u014c\7v\2\2\u014c\u014d\7k\2\2\u014d\u014e\7q\2\2\u014e\u014f"+
		"\7p\2\2\u014f\u0150\7\"\2\2\u0150\u0151\7h\2\2\u0151\u0152\7c\2\2\u0152"+
		"\u0153\7k\2\2\u0153\u0154\7n\2\2\u0154\u0155\7g\2\2\u0155\u0156\7f\2\2"+
		"\u0156\64\3\2\2\2\u0157\u0158\7n\2\2\u0158\u0159\7q\2\2\u0159\u015a\7"+
		"u\2\2\u015a\u015b\7v\2\2\u015b\u015c\7\"\2\2\u015c\u015d\7e\2\2\u015d"+
		"\u015e\7q\2\2\u015e\u015f\7p\2\2\u015f\u0160\7p\2\2\u0160\u0161\7g\2\2"+
		"\u0161\u0162\7e\2\2\u0162\u0163\7v\2\2\u0163\u0164\7k\2\2\u0164\u0165"+
		"\7q\2\2\u0165\u0166\7p\2\2\u0166\u0167\7\"\2\2\u0167\u0168\7c\2\2\u0168"+
		"\u0169\7h\2\2\u0169\u016a\7v\2\2\u016a\u016b\7g\2\2\u016b\u016c\7t\2\2"+
		"\u016c\66\3\2\2\2\u016d\u016e\7o\2\2\u016e\u016f\7c\2\2\u016f\u0170\7"+
		"z\2\2\u0170\u0171\7\"\2\2\u0171\u0172\7e\2\2\u0172\u0173\7q\2\2\u0173"+
		"\u0174\7p\2\2\u0174\u0175\7p\2\2\u0175\u0176\7g\2\2\u0176\u0177\7e\2\2"+
		"\u0177\u0178\7v\2\2\u0178\u0179\7k\2\2\u0179\u017a\7q\2\2\u017a\u017b"+
		"\7p\2\2\u017b\u017c\7\"\2\2\u017c\u017d\7t\2\2\u017d\u017e\7c\2\2\u017e"+
		"\u017f\7v\2\2\u017f\u0180\7g\2\2\u01808\3\2\2\2\u0181\u0182\7o\2\2\u0182"+
		"\u0183\7c\2\2\u0183\u0184\7z\2\2\u0184\u0185\7\"\2\2\u0185\u0186\7e\2"+
		"\2\u0186\u0187\7q\2\2\u0187\u0188\7p\2\2\u0188\u0189\7p\2\2\u0189\u018a"+
		"\7g\2\2\u018a\u018b\7e\2\2\u018b\u018c\7v\2\2\u018c\u018d\7k\2\2\u018d"+
		"\u018e\7q\2\2\u018e\u018f\7p\2\2\u018f\u0190\7\"\2\2\u0190\u0191\7e\2"+
		"\2\u0191\u0192\7q\2\2\u0192\u0193\7w\2\2\u0193\u0194\7p\2\2\u0194\u0195"+
		"\7v\2\2\u0195:\3\2\2\2\u0196\u0197\7o\2\2\u0197\u0198\7c\2\2\u0198\u0199"+
		"\7z\2\2\u0199\u019a\7\"\2\2\u019a\u019b\7e\2\2\u019b\u019c\7c\2\2\u019c"+
		"\u019d\7e\2\2\u019d\u019e\7j\2\2\u019e\u019f\7g\2\2\u019f\u01a0\7\"\2"+
		"\2\u01a0\u01a1\7u\2\2\u01a1\u01a2\7k\2\2\u01a2\u01a3\7|\2\2\u01a3\u01a4"+
		"\7g\2\2\u01a4<\3\2\2\2\u01a5\u01a6\78\2\2\u01a6\u01a7\7\62\2\2\u01a7\u01a8"+
		"\7u\2\2\u01a8>\3\2\2\2\u01a9\u01aa\7c\2\2\u01aa\u01ab\7v\2\2\u01ab@\3"+
		"\2\2\2\u01ac\u01ad\7h\2\2\u01ad\u01ae\7q\2\2\u01ae\u01af\7t\2\2\u01af"+
		"B\3\2\2\2\u01b0\u01b1\7p\2\2\u01b1\u01b2\7q\2\2\u01b2\u01b3\7v\2\2\u01b3"+
		"\u01b4\7\"\2\2\u01b4\u01b5\7k\2\2\u01b5\u01b6\7p\2\2\u01b6\u01b7\7v\2"+
		"\2\u01b7\u01b8\7g\2\2\u01b8\u01b9\7t\2\2\u01b9\u01ba\7p\2\2\u01ba\u01bb"+
		"\7c\2\2\u01bb\u01bc\7n\2\2\u01bcD\3\2\2\2\u01bd\u01be\7>\2\2\u01beF\3"+
		"\2\2\2\u01bf\u01c0\7@\2\2\u01c0H\3\2\2\2\u01c1\u01c2\7p\2\2\u01c2\u01c3"+
		"\7q\2\2\u01c3\u01c4\7v\2\2\u01c4\u01c5\7\"\2\2\u01c5\u01c6\7c\2\2\u01c6"+
		"\u01c7\7w\2\2\u01c7\u01c8\7v\2\2\u01c8\u01c9\7j\2\2\u01c9\u01ca\7g\2\2"+
		"\u01ca\u01cb\7p\2\2\u01cb\u01cc\7v\2\2\u01cc\u01cd\7k\2\2\u01cd\u01ce"+
		"\7e\2\2\u01ce\u01cf\7c\2\2\u01cf\u01d0\7v\2\2\u01d0\u01d1\7g\2\2\u01d1"+
		"\u01d2\7f\2\2\u01d2J\3\2\2\2\u01d3\u01d4\7F\2\2\u01d4\u01d5\7M\2\2\u01d5"+
		"\u01d6\7K\2\2\u01d6\u01d7\7O\2\2\u01d7\u01d8\7\"\2\2\u01d8\u01d9\7x\2"+
		"\2\u01d9\u01da\7g\2\2\u01da\u01db\7t\2\2\u01db\u01dc\7k\2\2\u01dc\u01dd"+
		"\7h\2\2\u01dd\u01de\7k\2\2\u01de\u01df\7e\2\2\u01df\u01e0\7c\2\2\u01e0"+
		"\u01e1\7v\2\2\u01e1\u01e2\7k\2\2\u01e2\u01e3\7q\2\2\u01e3\u01e4\7p\2\2"+
		"\u01e4\u01e5\7\"\2\2\u01e5\u01e6\7u\2\2\u01e6\u01e7\7w\2\2\u01e7\u01e8"+
		"\7e\2\2\u01e8\u01e9\7e\2\2\u01e9\u01ea\7g\2\2\u01ea\u01eb\7u\2\2\u01eb"+
		"\u01ec\7u\2\2\u01ec\u01ed\7h\2\2\u01ed\u01ee\7w\2\2\u01ee\u01ef\7n\2\2"+
		"\u01efL\3\2\2\2\u01f0\u01f1\7u\2\2\u01f1\u01f2\7?\2\2\u01f2N\3\2\2\2\u01f3"+
		"\u01f4\7f\2\2\u01f4\u01f5\7?\2\2\u01f5P\3\2\2\2\u01f6\u01f7\7U\2\2\u01f7"+
		"\u01f8\7U\2\2\u01f8\u01f9\7N\2\2\u01f9R\3\2\2\2\u01fa\u01fb\7h\2\2\u01fb"+
		"\u01fc\7t\2\2\u01fc\u01fd\7q\2\2\u01fd\u01fe\7o\2\2\u01fe\u01ff\7?\2\2"+
		"\u01ffT\3\2\2\2\u0200\u0201\7v\2\2\u0201\u0202\7q\2\2\u0202\u0203\7?\2"+
		"\2\u0203V\3\2\2\2\u0204\u0205\7t\2\2\u0205\u0206\7g\2\2\u0206\u0207\7"+
		"n\2\2\u0207\u0208\7c\2\2\u0208\u0209\7{\2\2\u0209\u020a\7?\2\2\u020aX"+
		"\3\2\2\2\u020b\u020c\7f\2\2\u020c\u020d\7g\2\2\u020d\u020e\7n\2\2\u020e"+
		"\u020f\7c\2\2\u020f\u0210\7{\2\2\u0210\u0211\7?\2\2\u0211Z\3\2\2\2\u0212"+
		"\u0213\7f\2\2\u0213\u0214\7g\2\2\u0214\u0215\7n\2\2\u0215\u0216\7c\2\2"+
		"\u0216\u0217\7{\2\2\u0217\u0218\7u\2\2\u0218\u0219\7?\2\2\u0219\\\3\2"+
		"\2\2\u021a\u021b\7u\2\2\u021b\u021c\7k\2\2\u021c\u021d\7|\2\2\u021d\u021e"+
		"\7g\2\2\u021e\u021f\7?\2\2\u021f^\3\2\2\2\u0220\u0221\7p\2\2\u0221\u0222"+
		"\7t\2\2\u0222\u0223\7e\2\2\u0223\u0224\7r\2\2\u0224\u0225\7v\2\2\u0225"+
		"\u0226\7?\2\2\u0226`\3\2\2\2\u0227\u0228\7o\2\2\u0228\u0229\7g\2\2\u0229"+
		"\u022a\7u\2\2\u022a\u022b\7u\2\2\u022b\u022c\7c\2\2\u022c\u022d\7i\2\2"+
		"\u022d\u022e\7g\2\2\u022e\u022f\7/\2\2\u022f\u0230\7k\2\2\u0230\u0231"+
		"\7f\2\2\u0231\u0232\7?\2\2\u0232b\3\2\2\2\u0233\u0234\7e\2\2\u0234\u0235"+
		"\7n\2\2\u0235\u0236\7k\2\2\u0236\u0237\7g\2\2\u0237\u0238\7p\2\2\u0238"+
		"\u0239\7v\2\2\u0239\u023a\7?\2\2\u023ad\3\2\2\2\u023b\u023c\7r\2\2\u023c"+
		"\u023d\7t\2\2\u023d\u023e\7k\2\2\u023e\u023f\7x\2\2\u023f\u0240\7c\2\2"+
		"\u0240\u0241\7v\2\2\u0241\u0242\7g\2\2\u0242\u0243\7\61\2\2\u0243\u0244"+
		"\7f\2\2\u0244\u0245\7q\2\2\u0245\u0246\7x\2\2\u0246\u0247\7g\2\2\u0247"+
		"\u0248\7e\2\2\u0248\u0249\7q\2\2\u0249\u024a\7v\2\2\u024a\u024b\7/\2\2"+
		"\u024b\u024c\7n\2\2\u024c\u024d\7o\2\2\u024d\u024e\7v\2\2\u024e\u024f"+
		"\7r\2\2\u024ff\3\2\2\2\u0250\u0251\7f\2\2\u0251\u0252\7u\2\2\u0252\u0253"+
		"\7p\2\2\u0253\u0254\7?\2\2\u0254h\3\2\2\2\u0255\u0256\7u\2\2\u0256\u0257"+
		"\7v\2\2\u0257\u0258\7c\2\2\u0258\u0259\7v\2\2\u0259\u025a\7w\2\2\u025a"+
		"\u025b\7u\2\2\u025b\u025c\7?\2\2\u025cj\3\2\2\2\u025d\u025e\7U\2\2\u025e"+
		"\u025f\7c\2\2\u025f\u0260\7x\2\2\u0260\u0261\7g\2\2\u0261\u0262\7f\2\2"+
		"\u0262l\3\2\2\2\u0263\u0264\7t\2\2\u0264\u0265\7g\2\2\u0265\u0266\7o\2"+
		"\2\u0266\u0267\7q\2\2\u0267\u0268\7x\2\2\u0268\u0269\7g\2\2\u0269\u026a"+
		"\7f\2\2\u026an\3\2\2\2\u026b\u026c\7m\2\2\u026c\u026d\7g\2\2\u026d\u026e"+
		"\7{\2\2\u026e\u026f\7\"\2\2\u026f\u0270\7t\2\2\u0270\u0271\7g\2\2\u0271"+
		"\u0272\7v\2\2\u0272\u0273\7t\2\2\u0273\u0274\7k\2\2\u0274\u0275\7g\2\2"+
		"\u0275\u0276\7x\2\2\u0276\u0277\7c\2\2\u0277\u0278\7n\2\2\u0278p\3\2\2"+
		"\2\u0279\u027a\7f\2\2\u027a\u027b\7q\2\2\u027b\u027c\7g\2\2\u027c\u027d"+
		"\7u\2\2\u027d\u027e\7\"\2\2\u027e\u027f\7p\2\2\u027f\u0280\7q\2\2\u0280"+
		"\u0281\7v\2\2\u0281\u0282\7\"\2\2\u0282\u0283\7t\2\2\u0283\u0284\7g\2"+
		"\2\u0284\u0285\7u\2\2\u0285\u0286\7q\2\2\u0286\u0287\7n\2\2\u0287\u0288"+
		"\7x\2\2\u0288\u0289\7g\2\2\u0289\u028a\7\"\2\2\u028a\u028b\7v\2\2\u028b"+
		"\u028c\7q\2\2\u028c\u028d\7\"\2\2\u028d\u028e\7c\2\2\u028e\u028f\7f\2"+
		"\2\u028f\u0290\7f\2\2\u0290\u0291\7t\2\2\u0291\u0292\7g\2\2\u0292\u0293"+
		"\7u\2\2\u0293\u0294\7u\2\2\u0294r\3\2\2\2\u0295\u0296\7j\2\2\u0296\u0297"+
		"\7q\2\2\u0297\u0298\7u\2\2\u0298\u0299\7v\2\2\u0299\u029a\7p\2\2\u029a"+
		"\u029b\7c\2\2\u029b\u029c\7o\2\2\u029c\u029d\7g\2\2\u029dt\3\2\2\2\u029e"+
		"\u029f\t\3\2\2\u029fv\3\2\2\2\u02a0\u02a2\4\62;\2\u02a1\u02a0\3\2\2\2"+
		"\u02a2\u02a3\3\2\2\2\u02a3\u02a1\3\2\2\2\u02a3\u02a4\3\2\2\2\u02a4x\3"+
		"\2\2\2\u02a5\u02a6\5w<\2\u02a6\u02a7\7\60\2\2\u02a7\u02a8\5w<\2\u02a8"+
		"z\3\2\2\2\u02a9\u02b6\5}?\2\u02aa\u02b6\5\177@\2\u02ab\u02b6\5\u0081A"+
		"\2\u02ac\u02b6\5\u0083B\2\u02ad\u02b6\5\u0085C\2\u02ae\u02b6\5\u0087D"+
		"\2\u02af\u02b6\5\u0089E\2\u02b0\u02b6\5\u008bF\2\u02b1\u02b6\5\u008dG"+
		"\2\u02b2\u02b6\5\u008fH\2\u02b3\u02b6\5\u0091I\2\u02b4\u02b6\5\u0093J"+
		"\2\u02b5\u02a9\3\2\2\2\u02b5\u02aa\3\2\2\2\u02b5\u02ab\3\2\2\2\u02b5\u02ac"+
		"\3\2\2\2\u02b5\u02ad\3\2\2\2\u02b5\u02ae\3\2\2\2\u02b5\u02af\3\2\2\2\u02b5"+
		"\u02b0\3\2\2\2\u02b5\u02b1\3\2\2\2\u02b5\u02b2\3\2\2\2\u02b5\u02b3\3\2"+
		"\2\2\u02b5\u02b4\3\2\2\2\u02b6|\3\2\2\2\u02b7\u02b8\7L\2\2\u02b8\u02b9"+
		"\7c\2\2\u02b9\u02ba\7p\2\2\u02ba~\3\2\2\2\u02bb\u02bc\7H\2\2\u02bc\u02bd"+
		"\7g\2\2\u02bd\u02be\7d\2\2\u02be\u0080\3\2\2\2\u02bf\u02c0\7O\2\2\u02c0"+
		"\u02c1\7c\2\2\u02c1\u02c2\7t\2\2\u02c2\u0082\3\2\2\2\u02c3\u02c4\7C\2"+
		"\2\u02c4\u02c5\7r\2\2\u02c5\u02c6\7t\2\2\u02c6\u0084\3\2\2\2\u02c7\u02c8"+
		"\7O\2\2\u02c8\u02c9\7c\2\2\u02c9\u02ca\7{\2\2\u02ca\u0086\3\2\2\2\u02cb"+
		"\u02cc\7L\2\2\u02cc\u02cd\7w\2\2\u02cd\u02ce\7p\2\2\u02ce\u0088\3\2\2"+
		"\2\u02cf\u02d0\7L\2\2\u02d0\u02d1\7w\2\2\u02d1\u02d2\7n\2\2\u02d2\u008a"+
		"\3\2\2\2\u02d3\u02d4\7C\2\2\u02d4\u02d5\7w\2\2\u02d5\u02d6\7i\2\2\u02d6"+
		"\u008c\3\2\2\2\u02d7\u02d8\7U\2\2\u02d8\u02d9\7g\2\2\u02d9\u02da\7r\2"+
		"\2\u02da\u008e\3\2\2\2\u02db\u02dc\7Q\2\2\u02dc\u02dd\7e\2\2\u02dd\u02de"+
		"\7v\2\2\u02de\u0090\3\2\2\2\u02df\u02e0\7P\2\2\u02e0\u02e1\7q\2\2\u02e1"+
		"\u02e2\7x\2\2\u02e2\u0092\3\2\2\2\u02e3\u02e4\7F\2\2\u02e4\u02e5\7g\2"+
		"\2\u02e5\u02e6\7e\2\2\u02e6\u0094\3\2\2\2\u02e7\u02e8\5w<\2\u02e8\u02e9"+
		"\5\25\13\2\u02e9\u02ea\5w<\2\u02ea\u02eb\5\25\13\2\u02eb\u02ec\5w<\2\u02ec"+
		"\u02ed\5\25\13\2\u02ed\u02ee\5w<\2\u02ee\u0096\3\2\2\2\u02ef\u02f1\5u"+
		";\2\u02f0\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2"+
		"\u02f3\3\2\2\2\u02f3\u0098\3\2\2\2\u02f4\u02f7\5u;\2\u02f5\u02f7\5w<\2"+
		"\u02f6\u02f4\3\2\2\2\u02f6\u02f5\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f6"+
		"\3\2\2\2\u02f8\u02f9\3\2\2\2\u02f9\u009a\3\2\2\2\u02fa\u02fb\5\u009dO"+
		"\2\u02fb\u02fc\7B\2\2\u02fc\u02fd\5\u009dO\2\u02fd\u009c\3\2\2\2\u02fe"+
		"\u0302\5u;\2\u02ff\u0302\5w<\2\u0300\u0302\5\u009fP\2\u0301\u02fe\3\2"+
		"\2\2\u0301\u02ff\3\2\2\2\u0301\u0300\3\2\2\2\u0302\u0303\3\2\2\2\u0303"+
		"\u0301\3\2\2\2\u0303\u0304\3\2\2\2\u0304\u009e\3\2\2\2\u0305\u0306\t\4"+
		"\2\2\u0306\u00a0\3\2\2\2\r\2\u00a4\u00ab\u00c7\u02a3\u02b5\u02f2\u02f6"+
		"\u02f8\u0301\u0303\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}