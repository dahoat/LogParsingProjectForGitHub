// Generated from PostfixLogParser.g4 by ANTLR 4.9

package at.daho.logparsingproject.logparser.antlr.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PostfixLogParser extends Parser {
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
	public static final int
		RULE_log = 0, RULE_logline = 1, RULE_serverNameWithIp = 2, RULE_cipher = 3, 
		RULE_bits = 4, RULE_saslAuthString = 5, RULE_command = 6, RULE_numConnections = 7, 
		RULE_size = 8, RULE_mailIdentifier = 9, RULE_timestamp = 10, RULE_time = 11, 
		RULE_day = 12, RULE_hour = 13, RULE_minute = 14, RULE_second = 15, RULE_logheader = 16, 
		RULE_pid = 17, RULE_service = 18, RULE_process = 19, RULE_localTransport = 20, 
		RULE_event = 21, RULE_connect = 22, RULE_disconnect = 23, RULE_anonymousTlsConnection = 24, 
		RULE_failedSaslLogin = 25, RULE_reverseLookupDifferent = 26, RULE_lostConnectionAfterAuth = 27, 
		RULE_cleanupMessageId = 28, RULE_getMailFrom = 29, RULE_getMailTo = 30, 
		RULE_getMailRemovedFromQueue = 31, RULE_statistics = 32, RULE_statisticsMaxConRate = 33, 
		RULE_statisticsMaxConCount = 34, RULE_statisticsMaxCacheSize = 35, RULE_transaction = 36, 
		RULE_openDkim = 37, RULE_openDkimNotInternal = 38, RULE_openDkimNotAuthenticated = 39, 
		RULE_openDkimVerificationSuccessful = 40, RULE_openDkimKeySelection = 41, 
		RULE_openDkimKeyRetrieval = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"log", "logline", "serverNameWithIp", "cipher", "bits", "saslAuthString", 
			"command", "numConnections", "size", "mailIdentifier", "timestamp", "time", 
			"day", "hour", "minute", "second", "logheader", "pid", "service", "process", 
			"localTransport", "event", "connect", "disconnect", "anonymousTlsConnection", 
			"failedSaslLogin", "reverseLookupDifferent", "lostConnectionAfterAuth", 
			"cleanupMessageId", "getMailFrom", "getMailTo", "getMailRemovedFromQueue", 
			"statistics", "statisticsMaxConRate", "statisticsMaxConCount", "statisticsMaxCacheSize", 
			"transaction", "openDkim", "openDkimNotInternal", "openDkimNotAuthenticated", 
			"openDkimVerificationSuccessful", "openDkimKeySelection", "openDkimKeyRetrieval"
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

	@Override
	public String getGrammarFileName() { return "PostfixLogParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PostfixLogParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class LogContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PostfixLogParser.EOF, 0); }
		public List<LoglineContext> logline() {
			return getRuleContexts(LoglineContext.class);
		}
		public LoglineContext logline(int i) {
			return getRuleContext(LoglineContext.class,i);
		}
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Month) {
				{
				{
				setState(86);
				logline();
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
			match(EOF);
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

	public static class LoglineContext extends ParserRuleContext {
		public LogheaderContext logheader() {
			return getRuleContext(LogheaderContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public TerminalNode NewLine() { return getToken(PostfixLogParser.NewLine, 0); }
		public LoglineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterLogline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitLogline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitLogline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoglineContext logline() throws RecognitionException {
		LoglineContext _localctx = new LoglineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_logline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			logheader();
			setState(95);
			event();
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NewLine) {
				{
				setState(96);
				match(NewLine);
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

	public static class ServerNameWithIpContext extends ParserRuleContext {
		public TerminalNode SquareBracketOpen() { return getToken(PostfixLogParser.SquareBracketOpen, 0); }
		public TerminalNode Ip() { return getToken(PostfixLogParser.Ip, 0); }
		public TerminalNode SquareBracketClose() { return getToken(PostfixLogParser.SquareBracketClose, 0); }
		public TerminalNode Word() { return getToken(PostfixLogParser.Word, 0); }
		public TerminalNode String() { return getToken(PostfixLogParser.String, 0); }
		public ServerNameWithIpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverNameWithIp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterServerNameWithIp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitServerNameWithIp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitServerNameWithIp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServerNameWithIpContext serverNameWithIp() throws RecognitionException {
		ServerNameWithIpContext _localctx = new ServerNameWithIpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_serverNameWithIp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			_la = _input.LA(1);
			if ( !(_la==Word || _la==String) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(100);
			match(SquareBracketOpen);
			setState(101);
			match(Ip);
			setState(102);
			match(SquareBracketClose);
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

	public static class CipherContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(PostfixLogParser.String, 0); }
		public CipherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cipher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterCipher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitCipher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitCipher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CipherContext cipher() throws RecognitionException {
		CipherContext _localctx = new CipherContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cipher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(String);
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

	public static class BitsContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(PostfixLogParser.Int, 0); }
		public BitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterBits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitBits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitBits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitsContext bits() throws RecognitionException {
		BitsContext _localctx = new BitsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(Int);
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

	public static class SaslAuthStringContext extends ParserRuleContext {
		public TerminalNode Alphanum() { return getToken(PostfixLogParser.Alphanum, 0); }
		public SaslAuthStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_saslAuthString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterSaslAuthString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitSaslAuthString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitSaslAuthString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SaslAuthStringContext saslAuthString() throws RecognitionException {
		SaslAuthStringContext _localctx = new SaslAuthStringContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_saslAuthString);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(Alphanum);
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

	public static class CommandContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(PostfixLogParser.Word, 0); }
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(Word);
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

	public static class NumConnectionsContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(PostfixLogParser.Int, 0); }
		public NumConnectionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numConnections; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterNumConnections(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitNumConnections(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitNumConnections(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumConnectionsContext numConnections() throws RecognitionException {
		NumConnectionsContext _localctx = new NumConnectionsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numConnections);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(Int);
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

	public static class SizeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(PostfixLogParser.Int, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(Int);
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

	public static class MailIdentifierContext extends ParserRuleContext {
		public TerminalNode Alphanum() { return getToken(PostfixLogParser.Alphanum, 0); }
		public MailIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mailIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterMailIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitMailIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitMailIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MailIdentifierContext mailIdentifier() throws RecognitionException {
		MailIdentifierContext _localctx = new MailIdentifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_mailIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(Alphanum);
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

	public static class TimestampContext extends ParserRuleContext {
		public TerminalNode Month() { return getToken(PostfixLogParser.Month, 0); }
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
		}
		public TimeContext time() {
			return getRuleContext(TimeContext.class,0);
		}
		public TimestampContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timestamp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterTimestamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitTimestamp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitTimestamp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimestampContext timestamp() throws RecognitionException {
		TimestampContext _localctx = new TimestampContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_timestamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(Month);
			setState(119);
			day();
			setState(120);
			time();
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

	public static class TimeContext extends ParserRuleContext {
		public HourContext hour() {
			return getRuleContext(HourContext.class,0);
		}
		public List<TerminalNode> Colon() { return getTokens(PostfixLogParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(PostfixLogParser.Colon, i);
		}
		public MinuteContext minute() {
			return getRuleContext(MinuteContext.class,0);
		}
		public SecondContext second() {
			return getRuleContext(SecondContext.class,0);
		}
		public TimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			hour();
			setState(123);
			match(Colon);
			setState(124);
			minute();
			setState(125);
			match(Colon);
			setState(126);
			second();
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

	public static class DayContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(PostfixLogParser.Int, 0); }
		public DayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitDay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitDay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayContext day() throws RecognitionException {
		DayContext _localctx = new DayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_day);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(Int);
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

	public static class HourContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(PostfixLogParser.Int, 0); }
		public HourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterHour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitHour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitHour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HourContext hour() throws RecognitionException {
		HourContext _localctx = new HourContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_hour);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(Int);
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

	public static class MinuteContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(PostfixLogParser.Int, 0); }
		public MinuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterMinute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitMinute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitMinute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinuteContext minute() throws RecognitionException {
		MinuteContext _localctx = new MinuteContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_minute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(Int);
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

	public static class SecondContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(PostfixLogParser.Int, 0); }
		public SecondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterSecond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitSecond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitSecond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondContext second() throws RecognitionException {
		SecondContext _localctx = new SecondContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_second);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(Int);
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

	public static class LogheaderContext extends ParserRuleContext {
		public TimestampContext timestamp() {
			return getRuleContext(TimestampContext.class,0);
		}
		public TerminalNode Word() { return getToken(PostfixLogParser.Word, 0); }
		public ProcessContext process() {
			return getRuleContext(ProcessContext.class,0);
		}
		public TerminalNode SquareBracketOpen() { return getToken(PostfixLogParser.SquareBracketOpen, 0); }
		public PidContext pid() {
			return getRuleContext(PidContext.class,0);
		}
		public TerminalNode SquareBracketClose() { return getToken(PostfixLogParser.SquareBracketClose, 0); }
		public TerminalNode Colon() { return getToken(PostfixLogParser.Colon, 0); }
		public ServiceContext service() {
			return getRuleContext(ServiceContext.class,0);
		}
		public TerminalNode Slash() { return getToken(PostfixLogParser.Slash, 0); }
		public LogheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logheader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterLogheader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitLogheader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitLogheader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogheaderContext logheader() throws RecognitionException {
		LogheaderContext _localctx = new LogheaderContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logheader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			timestamp();
			setState(137);
			match(Word);
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(138);
				service();
				setState(139);
				match(Slash);
				}
				break;
			}
			setState(143);
			process();
			setState(144);
			match(SquareBracketOpen);
			setState(145);
			pid();
			setState(146);
			match(SquareBracketClose);
			setState(147);
			match(Colon);
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

	public static class PidContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(PostfixLogParser.Int, 0); }
		public PidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterPid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitPid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitPid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PidContext pid() throws RecognitionException {
		PidContext _localctx = new PidContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(Int);
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

	public static class ServiceContext extends ParserRuleContext {
		public List<TerminalNode> Word() { return getTokens(PostfixLogParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(PostfixLogParser.Word, i);
		}
		public TerminalNode Slash() { return getToken(PostfixLogParser.Slash, 0); }
		public ServiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_service; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterService(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitService(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitService(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceContext service() throws RecognitionException {
		ServiceContext _localctx = new ServiceContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_service);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(151);
				match(Word);
				setState(152);
				match(Slash);
				setState(153);
				match(Word);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(Word);
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

	public static class ProcessContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(PostfixLogParser.Word, 0); }
		public ProcessContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_process; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterProcess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitProcess(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitProcess(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessContext process() throws RecognitionException {
		ProcessContext _localctx = new ProcessContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_process);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(Word);
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

	public static class LocalTransportContext extends ParserRuleContext {
		public TerminalNode PrivateDovecot() { return getToken(PostfixLogParser.PrivateDovecot, 0); }
		public LocalTransportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localTransport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterLocalTransport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitLocalTransport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitLocalTransport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalTransportContext localTransport() throws RecognitionException {
		LocalTransportContext _localctx = new LocalTransportContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_localTransport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(PrivateDovecot);
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

	public static class EventContext extends ParserRuleContext {
		public ConnectContext connect() {
			return getRuleContext(ConnectContext.class,0);
		}
		public DisconnectContext disconnect() {
			return getRuleContext(DisconnectContext.class,0);
		}
		public AnonymousTlsConnectionContext anonymousTlsConnection() {
			return getRuleContext(AnonymousTlsConnectionContext.class,0);
		}
		public FailedSaslLoginContext failedSaslLogin() {
			return getRuleContext(FailedSaslLoginContext.class,0);
		}
		public LostConnectionAfterAuthContext lostConnectionAfterAuth() {
			return getRuleContext(LostConnectionAfterAuthContext.class,0);
		}
		public StatisticsContext statistics() {
			return getRuleContext(StatisticsContext.class,0);
		}
		public TransactionContext transaction() {
			return getRuleContext(TransactionContext.class,0);
		}
		public OpenDkimContext openDkim() {
			return getRuleContext(OpenDkimContext.class,0);
		}
		public CleanupMessageIdContext cleanupMessageId() {
			return getRuleContext(CleanupMessageIdContext.class,0);
		}
		public GetMailFromContext getMailFrom() {
			return getRuleContext(GetMailFromContext.class,0);
		}
		public GetMailToContext getMailTo() {
			return getRuleContext(GetMailToContext.class,0);
		}
		public GetMailRemovedFromQueueContext getMailRemovedFromQueue() {
			return getRuleContext(GetMailRemovedFromQueueContext.class,0);
		}
		public ReverseLookupDifferentContext reverseLookupDifferent() {
			return getRuleContext(ReverseLookupDifferentContext.class,0);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_event);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				connect();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				disconnect();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				anonymousTlsConnection();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(164);
				failedSaslLogin();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(165);
				lostConnectionAfterAuth();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(166);
				statistics();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(167);
				transaction();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(168);
				openDkim();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(169);
				cleanupMessageId();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(170);
				getMailFrom();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(171);
				getMailTo();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(172);
				getMailRemovedFromQueue();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(173);
				reverseLookupDifferent();
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

	public static class ConnectContext extends ParserRuleContext {
		public TerminalNode Connect() { return getToken(PostfixLogParser.Connect, 0); }
		public TerminalNode From() { return getToken(PostfixLogParser.From, 0); }
		public ServerNameWithIpContext serverNameWithIp() {
			return getRuleContext(ServerNameWithIpContext.class,0);
		}
		public ConnectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterConnect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitConnect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitConnect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectContext connect() throws RecognitionException {
		ConnectContext _localctx = new ConnectContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_connect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(Connect);
			setState(177);
			match(From);
			setState(178);
			serverNameWithIp();
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

	public static class DisconnectContext extends ParserRuleContext {
		public TerminalNode Disconnect() { return getToken(PostfixLogParser.Disconnect, 0); }
		public TerminalNode From() { return getToken(PostfixLogParser.From, 0); }
		public ServerNameWithIpContext serverNameWithIp() {
			return getRuleContext(ServerNameWithIpContext.class,0);
		}
		public DisconnectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disconnect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterDisconnect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitDisconnect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitDisconnect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisconnectContext disconnect() throws RecognitionException {
		DisconnectContext _localctx = new DisconnectContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_disconnect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(Disconnect);
			setState(181);
			match(From);
			setState(182);
			serverNameWithIp();
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

	public static class AnonymousTlsConnectionContext extends ParserRuleContext {
		public TerminalNode AnonymousTlsConnectionEstablished() { return getToken(PostfixLogParser.AnonymousTlsConnectionEstablished, 0); }
		public TerminalNode From() { return getToken(PostfixLogParser.From, 0); }
		public ServerNameWithIpContext serverNameWithIp() {
			return getRuleContext(ServerNameWithIpContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PostfixLogParser.Colon, 0); }
		public TerminalNode TlsVersion() { return getToken(PostfixLogParser.TlsVersion, 0); }
		public TerminalNode WithCipher() { return getToken(PostfixLogParser.WithCipher, 0); }
		public CipherContext cipher() {
			return getRuleContext(CipherContext.class,0);
		}
		public TerminalNode RoundBracketOpen() { return getToken(PostfixLogParser.RoundBracketOpen, 0); }
		public List<BitsContext> bits() {
			return getRuleContexts(BitsContext.class);
		}
		public BitsContext bits(int i) {
			return getRuleContext(BitsContext.class,i);
		}
		public TerminalNode Slash() { return getToken(PostfixLogParser.Slash, 0); }
		public TerminalNode Bits() { return getToken(PostfixLogParser.Bits, 0); }
		public TerminalNode RoundBracketClose() { return getToken(PostfixLogParser.RoundBracketClose, 0); }
		public AnonymousTlsConnectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymousTlsConnection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterAnonymousTlsConnection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitAnonymousTlsConnection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitAnonymousTlsConnection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnonymousTlsConnectionContext anonymousTlsConnection() throws RecognitionException {
		AnonymousTlsConnectionContext _localctx = new AnonymousTlsConnectionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_anonymousTlsConnection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(AnonymousTlsConnectionEstablished);
			setState(185);
			match(From);
			setState(186);
			serverNameWithIp();
			setState(187);
			match(Colon);
			setState(188);
			match(TlsVersion);
			setState(189);
			match(WithCipher);
			setState(190);
			cipher();
			setState(191);
			match(RoundBracketOpen);
			setState(192);
			bits();
			setState(193);
			match(Slash);
			setState(194);
			bits();
			setState(195);
			match(Bits);
			setState(196);
			match(RoundBracketClose);
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

	public static class FailedSaslLoginContext extends ParserRuleContext {
		public TerminalNode Warning() { return getToken(PostfixLogParser.Warning, 0); }
		public List<TerminalNode> Colon() { return getTokens(PostfixLogParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(PostfixLogParser.Colon, i);
		}
		public ServerNameWithIpContext serverNameWithIp() {
			return getRuleContext(ServerNameWithIpContext.class,0);
		}
		public TerminalNode SaslLoginAuthenticationFailed() { return getToken(PostfixLogParser.SaslLoginAuthenticationFailed, 0); }
		public SaslAuthStringContext saslAuthString() {
			return getRuleContext(SaslAuthStringContext.class,0);
		}
		public FailedSaslLoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_failedSaslLogin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterFailedSaslLogin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitFailedSaslLogin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitFailedSaslLogin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FailedSaslLoginContext failedSaslLogin() throws RecognitionException {
		FailedSaslLoginContext _localctx = new FailedSaslLoginContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_failedSaslLogin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			match(Warning);
			setState(199);
			match(Colon);
			setState(200);
			serverNameWithIp();
			setState(201);
			match(Colon);
			setState(202);
			match(SaslLoginAuthenticationFailed);
			setState(203);
			match(Colon);
			setState(204);
			saslAuthString();
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

	public static class ReverseLookupDifferentContext extends ParserRuleContext {
		public TerminalNode Warning() { return getToken(PostfixLogParser.Warning, 0); }
		public TerminalNode Colon() { return getToken(PostfixLogParser.Colon, 0); }
		public TerminalNode Hostname() { return getToken(PostfixLogParser.Hostname, 0); }
		public TerminalNode String() { return getToken(PostfixLogParser.String, 0); }
		public TerminalNode DoesNotResolveToAddress() { return getToken(PostfixLogParser.DoesNotResolveToAddress, 0); }
		public TerminalNode Ip() { return getToken(PostfixLogParser.Ip, 0); }
		public ReverseLookupDifferentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reverseLookupDifferent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterReverseLookupDifferent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitReverseLookupDifferent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitReverseLookupDifferent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReverseLookupDifferentContext reverseLookupDifferent() throws RecognitionException {
		ReverseLookupDifferentContext _localctx = new ReverseLookupDifferentContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_reverseLookupDifferent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(Warning);
			setState(207);
			match(Colon);
			setState(208);
			match(Hostname);
			setState(209);
			match(String);
			setState(210);
			match(DoesNotResolveToAddress);
			setState(211);
			match(Ip);
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

	public static class LostConnectionAfterAuthContext extends ParserRuleContext {
		public TerminalNode LostConnectionAfter() { return getToken(PostfixLogParser.LostConnectionAfter, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode From() { return getToken(PostfixLogParser.From, 0); }
		public ServerNameWithIpContext serverNameWithIp() {
			return getRuleContext(ServerNameWithIpContext.class,0);
		}
		public LostConnectionAfterAuthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lostConnectionAfterAuth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterLostConnectionAfterAuth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitLostConnectionAfterAuth(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitLostConnectionAfterAuth(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LostConnectionAfterAuthContext lostConnectionAfterAuth() throws RecognitionException {
		LostConnectionAfterAuthContext _localctx = new LostConnectionAfterAuthContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_lostConnectionAfterAuth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(LostConnectionAfter);
			setState(214);
			command();
			setState(215);
			match(From);
			setState(216);
			serverNameWithIp();
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

	public static class CleanupMessageIdContext extends ParserRuleContext {
		public TerminalNode Alphanum() { return getToken(PostfixLogParser.Alphanum, 0); }
		public TerminalNode Colon() { return getToken(PostfixLogParser.Colon, 0); }
		public TerminalNode MessageIdEquals() { return getToken(PostfixLogParser.MessageIdEquals, 0); }
		public TerminalNode Less() { return getToken(PostfixLogParser.Less, 0); }
		public TerminalNode Email() { return getToken(PostfixLogParser.Email, 0); }
		public TerminalNode Greater() { return getToken(PostfixLogParser.Greater, 0); }
		public CleanupMessageIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cleanupMessageId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterCleanupMessageId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitCleanupMessageId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitCleanupMessageId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CleanupMessageIdContext cleanupMessageId() throws RecognitionException {
		CleanupMessageIdContext _localctx = new CleanupMessageIdContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_cleanupMessageId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(Alphanum);
			setState(219);
			match(Colon);
			setState(220);
			match(MessageIdEquals);
			setState(221);
			match(Less);
			setState(222);
			match(Email);
			setState(223);
			match(Greater);
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

	public static class GetMailFromContext extends ParserRuleContext {
		public MailIdentifierContext mailIdentifier() {
			return getRuleContext(MailIdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PostfixLogParser.Colon, 0); }
		public TerminalNode FromEquals() { return getToken(PostfixLogParser.FromEquals, 0); }
		public TerminalNode Less() { return getToken(PostfixLogParser.Less, 0); }
		public TerminalNode Email() { return getToken(PostfixLogParser.Email, 0); }
		public TerminalNode Greater() { return getToken(PostfixLogParser.Greater, 0); }
		public List<TerminalNode> Comma() { return getTokens(PostfixLogParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PostfixLogParser.Comma, i);
		}
		public TerminalNode SizeEquals() { return getToken(PostfixLogParser.SizeEquals, 0); }
		public List<TerminalNode> Int() { return getTokens(PostfixLogParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(PostfixLogParser.Int, i);
		}
		public TerminalNode NumRecipientsEquals() { return getToken(PostfixLogParser.NumRecipientsEquals, 0); }
		public TerminalNode RoundBracketOpen() { return getToken(PostfixLogParser.RoundBracketOpen, 0); }
		public List<TerminalNode> Word() { return getTokens(PostfixLogParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(PostfixLogParser.Word, i);
		}
		public TerminalNode RoundBracketClose() { return getToken(PostfixLogParser.RoundBracketClose, 0); }
		public GetMailFromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getMailFrom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterGetMailFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitGetMailFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitGetMailFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetMailFromContext getMailFrom() throws RecognitionException {
		GetMailFromContext _localctx = new GetMailFromContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_getMailFrom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			mailIdentifier();
			setState(226);
			match(Colon);
			setState(227);
			match(FromEquals);
			setState(228);
			match(Less);
			setState(229);
			match(Email);
			setState(230);
			match(Greater);
			setState(231);
			match(Comma);
			setState(232);
			match(SizeEquals);
			setState(233);
			match(Int);
			setState(234);
			match(Comma);
			setState(235);
			match(NumRecipientsEquals);
			setState(236);
			match(Int);
			setState(237);
			match(RoundBracketOpen);
			setState(238);
			match(Word);
			setState(239);
			match(Word);
			setState(240);
			match(RoundBracketClose);
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

	public static class GetMailToContext extends ParserRuleContext {
		public MailIdentifierContext mailIdentifier() {
			return getRuleContext(MailIdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PostfixLogParser.Colon, 0); }
		public TerminalNode ToEquals() { return getToken(PostfixLogParser.ToEquals, 0); }
		public List<TerminalNode> Less() { return getTokens(PostfixLogParser.Less); }
		public TerminalNode Less(int i) {
			return getToken(PostfixLogParser.Less, i);
		}
		public List<TerminalNode> Email() { return getTokens(PostfixLogParser.Email); }
		public TerminalNode Email(int i) {
			return getToken(PostfixLogParser.Email, i);
		}
		public List<TerminalNode> Greater() { return getTokens(PostfixLogParser.Greater); }
		public TerminalNode Greater(int i) {
			return getToken(PostfixLogParser.Greater, i);
		}
		public List<TerminalNode> Comma() { return getTokens(PostfixLogParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(PostfixLogParser.Comma, i);
		}
		public TerminalNode RelayEquals() { return getToken(PostfixLogParser.RelayEquals, 0); }
		public List<TerminalNode> String() { return getTokens(PostfixLogParser.String); }
		public TerminalNode String(int i) {
			return getToken(PostfixLogParser.String, i);
		}
		public TerminalNode SquareBracketOpen() { return getToken(PostfixLogParser.SquareBracketOpen, 0); }
		public LocalTransportContext localTransport() {
			return getRuleContext(LocalTransportContext.class,0);
		}
		public TerminalNode SquareBracketClose() { return getToken(PostfixLogParser.SquareBracketClose, 0); }
		public TerminalNode DelayEquals() { return getToken(PostfixLogParser.DelayEquals, 0); }
		public TerminalNode DelaysEquals() { return getToken(PostfixLogParser.DelaysEquals, 0); }
		public TerminalNode DsnEquals() { return getToken(PostfixLogParser.DsnEquals, 0); }
		public TerminalNode StatusEquals() { return getToken(PostfixLogParser.StatusEquals, 0); }
		public TerminalNode Word() { return getToken(PostfixLogParser.Word, 0); }
		public TerminalNode RoundBracketOpen() { return getToken(PostfixLogParser.RoundBracketOpen, 0); }
		public List<TerminalNode> Int() { return getTokens(PostfixLogParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(PostfixLogParser.Int, i);
		}
		public TerminalNode Alphanum() { return getToken(PostfixLogParser.Alphanum, 0); }
		public TerminalNode Saved() { return getToken(PostfixLogParser.Saved, 0); }
		public TerminalNode RoundBracketClose() { return getToken(PostfixLogParser.RoundBracketClose, 0); }
		public List<TerminalNode> Float() { return getTokens(PostfixLogParser.Float); }
		public TerminalNode Float(int i) {
			return getToken(PostfixLogParser.Float, i);
		}
		public List<TerminalNode> Slash() { return getTokens(PostfixLogParser.Slash); }
		public TerminalNode Slash(int i) {
			return getToken(PostfixLogParser.Slash, i);
		}
		public GetMailToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getMailTo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterGetMailTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitGetMailTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitGetMailTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetMailToContext getMailTo() throws RecognitionException {
		GetMailToContext _localctx = new GetMailToContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_getMailTo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			mailIdentifier();
			setState(243);
			match(Colon);
			setState(244);
			match(ToEquals);
			setState(245);
			match(Less);
			setState(246);
			match(Email);
			setState(247);
			match(Greater);
			setState(248);
			match(Comma);
			setState(249);
			match(RelayEquals);
			setState(250);
			match(String);
			setState(251);
			match(SquareBracketOpen);
			setState(252);
			localTransport();
			setState(253);
			match(SquareBracketClose);
			setState(254);
			match(Comma);
			setState(255);
			match(DelayEquals);
			setState(256);
			_la = _input.LA(1);
			if ( !(_la==Int || _la==Float) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(257);
			match(Comma);
			setState(258);
			match(DelaysEquals);
			setState(263); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(259);
				_la = _input.LA(1);
				if ( !(_la==Int || _la==Float) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Slash) {
					{
					setState(260);
					match(Slash);
					}
				}

				}
				}
				setState(265); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Int || _la==Float );
			setState(267);
			match(Comma);
			setState(268);
			match(DsnEquals);
			setState(269);
			match(String);
			setState(270);
			match(Comma);
			setState(271);
			match(StatusEquals);
			setState(272);
			match(Word);
			setState(273);
			match(RoundBracketOpen);
			setState(274);
			match(Int);
			setState(275);
			match(String);
			setState(276);
			match(Less);
			setState(277);
			match(Email);
			setState(278);
			match(Greater);
			setState(279);
			match(Alphanum);
			setState(280);
			match(Saved);
			setState(281);
			match(RoundBracketClose);
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

	public static class GetMailRemovedFromQueueContext extends ParserRuleContext {
		public MailIdentifierContext mailIdentifier() {
			return getRuleContext(MailIdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PostfixLogParser.Colon, 0); }
		public TerminalNode Removed() { return getToken(PostfixLogParser.Removed, 0); }
		public GetMailRemovedFromQueueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getMailRemovedFromQueue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterGetMailRemovedFromQueue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitGetMailRemovedFromQueue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitGetMailRemovedFromQueue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetMailRemovedFromQueueContext getMailRemovedFromQueue() throws RecognitionException {
		GetMailRemovedFromQueueContext _localctx = new GetMailRemovedFromQueueContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_getMailRemovedFromQueue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			mailIdentifier();
			setState(284);
			match(Colon);
			setState(285);
			match(Removed);
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

	public static class StatisticsContext extends ParserRuleContext {
		public TerminalNode Statistics() { return getToken(PostfixLogParser.Statistics, 0); }
		public TerminalNode Colon() { return getToken(PostfixLogParser.Colon, 0); }
		public TerminalNode At() { return getToken(PostfixLogParser.At, 0); }
		public TimestampContext timestamp() {
			return getRuleContext(TimestampContext.class,0);
		}
		public StatisticsMaxConRateContext statisticsMaxConRate() {
			return getRuleContext(StatisticsMaxConRateContext.class,0);
		}
		public StatisticsMaxConCountContext statisticsMaxConCount() {
			return getRuleContext(StatisticsMaxConCountContext.class,0);
		}
		public StatisticsMaxCacheSizeContext statisticsMaxCacheSize() {
			return getRuleContext(StatisticsMaxCacheSizeContext.class,0);
		}
		public StatisticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statistics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterStatistics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitStatistics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitStatistics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatisticsContext statistics() throws RecognitionException {
		StatisticsContext _localctx = new StatisticsContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_statistics);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(Statistics);
			setState(288);
			match(Colon);
			setState(292);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MaxConnectionRate:
				{
				setState(289);
				statisticsMaxConRate();
				}
				break;
			case MaxConnectionCount:
				{
				setState(290);
				statisticsMaxConCount();
				}
				break;
			case MaxCacheSize:
				{
				setState(291);
				statisticsMaxCacheSize();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(294);
			match(At);
			setState(295);
			timestamp();
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

	public static class StatisticsMaxConRateContext extends ParserRuleContext {
		public TerminalNode MaxConnectionRate() { return getToken(PostfixLogParser.MaxConnectionRate, 0); }
		public NumConnectionsContext numConnections() {
			return getRuleContext(NumConnectionsContext.class,0);
		}
		public TerminalNode Slash() { return getToken(PostfixLogParser.Slash, 0); }
		public TerminalNode SixtySeconds() { return getToken(PostfixLogParser.SixtySeconds, 0); }
		public TerminalNode For() { return getToken(PostfixLogParser.For, 0); }
		public TerminalNode RoundBracketOpen() { return getToken(PostfixLogParser.RoundBracketOpen, 0); }
		public ServiceContext service() {
			return getRuleContext(ServiceContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PostfixLogParser.Colon, 0); }
		public TerminalNode Ip() { return getToken(PostfixLogParser.Ip, 0); }
		public TerminalNode RoundBracketClose() { return getToken(PostfixLogParser.RoundBracketClose, 0); }
		public StatisticsMaxConRateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statisticsMaxConRate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterStatisticsMaxConRate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitStatisticsMaxConRate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitStatisticsMaxConRate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatisticsMaxConRateContext statisticsMaxConRate() throws RecognitionException {
		StatisticsMaxConRateContext _localctx = new StatisticsMaxConRateContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_statisticsMaxConRate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(MaxConnectionRate);
			setState(298);
			numConnections();
			setState(299);
			match(Slash);
			setState(300);
			match(SixtySeconds);
			setState(301);
			match(For);
			setState(302);
			match(RoundBracketOpen);
			setState(303);
			service();
			setState(304);
			match(Colon);
			setState(305);
			match(Ip);
			setState(306);
			match(RoundBracketClose);
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

	public static class StatisticsMaxConCountContext extends ParserRuleContext {
		public TerminalNode MaxConnectionCount() { return getToken(PostfixLogParser.MaxConnectionCount, 0); }
		public NumConnectionsContext numConnections() {
			return getRuleContext(NumConnectionsContext.class,0);
		}
		public TerminalNode For() { return getToken(PostfixLogParser.For, 0); }
		public TerminalNode RoundBracketOpen() { return getToken(PostfixLogParser.RoundBracketOpen, 0); }
		public ServiceContext service() {
			return getRuleContext(ServiceContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PostfixLogParser.Colon, 0); }
		public TerminalNode Ip() { return getToken(PostfixLogParser.Ip, 0); }
		public TerminalNode RoundBracketClose() { return getToken(PostfixLogParser.RoundBracketClose, 0); }
		public StatisticsMaxConCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statisticsMaxConCount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterStatisticsMaxConCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitStatisticsMaxConCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitStatisticsMaxConCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatisticsMaxConCountContext statisticsMaxConCount() throws RecognitionException {
		StatisticsMaxConCountContext _localctx = new StatisticsMaxConCountContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_statisticsMaxConCount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(308);
			match(MaxConnectionCount);
			setState(309);
			numConnections();
			setState(310);
			match(For);
			setState(311);
			match(RoundBracketOpen);
			setState(312);
			service();
			setState(313);
			match(Colon);
			setState(314);
			match(Ip);
			setState(315);
			match(RoundBracketClose);
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

	public static class StatisticsMaxCacheSizeContext extends ParserRuleContext {
		public TerminalNode MaxCacheSize() { return getToken(PostfixLogParser.MaxCacheSize, 0); }
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public StatisticsMaxCacheSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statisticsMaxCacheSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterStatisticsMaxCacheSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitStatisticsMaxCacheSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitStatisticsMaxCacheSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatisticsMaxCacheSizeContext statisticsMaxCacheSize() throws RecognitionException {
		StatisticsMaxCacheSizeContext _localctx = new StatisticsMaxCacheSizeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_statisticsMaxCacheSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			match(MaxCacheSize);
			setState(318);
			size();
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

	public static class TransactionContext extends ParserRuleContext {
		public MailIdentifierContext mailIdentifier() {
			return getRuleContext(MailIdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PostfixLogParser.Colon, 0); }
		public TerminalNode ClientEquals() { return getToken(PostfixLogParser.ClientEquals, 0); }
		public ServerNameWithIpContext serverNameWithIp() {
			return getRuleContext(ServerNameWithIpContext.class,0);
		}
		public TransactionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transaction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitTransaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitTransaction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionContext transaction() throws RecognitionException {
		TransactionContext _localctx = new TransactionContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_transaction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			mailIdentifier();
			setState(321);
			match(Colon);
			setState(322);
			match(ClientEquals);
			setState(323);
			serverNameWithIp();
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

	public static class OpenDkimContext extends ParserRuleContext {
		public OpenDkimNotInternalContext openDkimNotInternal() {
			return getRuleContext(OpenDkimNotInternalContext.class,0);
		}
		public OpenDkimNotAuthenticatedContext openDkimNotAuthenticated() {
			return getRuleContext(OpenDkimNotAuthenticatedContext.class,0);
		}
		public OpenDkimVerificationSuccessfulContext openDkimVerificationSuccessful() {
			return getRuleContext(OpenDkimVerificationSuccessfulContext.class,0);
		}
		public OpenDkimKeySelectionContext openDkimKeySelection() {
			return getRuleContext(OpenDkimKeySelectionContext.class,0);
		}
		public OpenDkimKeyRetrievalContext openDkimKeyRetrieval() {
			return getRuleContext(OpenDkimKeyRetrievalContext.class,0);
		}
		public OpenDkimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openDkim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterOpenDkim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitOpenDkim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitOpenDkim(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenDkimContext openDkim() throws RecognitionException {
		OpenDkimContext _localctx = new OpenDkimContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_openDkim);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				openDkimNotInternal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				openDkimNotAuthenticated();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				openDkimVerificationSuccessful();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(328);
				openDkimKeySelection();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(329);
				openDkimKeyRetrieval();
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

	public static class OpenDkimNotInternalContext extends ParserRuleContext {
		public MailIdentifierContext mailIdentifier() {
			return getRuleContext(MailIdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PostfixLogParser.Colon, 0); }
		public ServerNameWithIpContext serverNameWithIp() {
			return getRuleContext(ServerNameWithIpContext.class,0);
		}
		public TerminalNode NotInternal() { return getToken(PostfixLogParser.NotInternal, 0); }
		public OpenDkimNotInternalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openDkimNotInternal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterOpenDkimNotInternal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitOpenDkimNotInternal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitOpenDkimNotInternal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenDkimNotInternalContext openDkimNotInternal() throws RecognitionException {
		OpenDkimNotInternalContext _localctx = new OpenDkimNotInternalContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_openDkimNotInternal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			mailIdentifier();
			setState(333);
			match(Colon);
			setState(334);
			serverNameWithIp();
			setState(335);
			match(NotInternal);
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

	public static class OpenDkimNotAuthenticatedContext extends ParserRuleContext {
		public MailIdentifierContext mailIdentifier() {
			return getRuleContext(MailIdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PostfixLogParser.Colon, 0); }
		public TerminalNode NotAuthenticated() { return getToken(PostfixLogParser.NotAuthenticated, 0); }
		public OpenDkimNotAuthenticatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openDkimNotAuthenticated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterOpenDkimNotAuthenticated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitOpenDkimNotAuthenticated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitOpenDkimNotAuthenticated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenDkimNotAuthenticatedContext openDkimNotAuthenticated() throws RecognitionException {
		OpenDkimNotAuthenticatedContext _localctx = new OpenDkimNotAuthenticatedContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_openDkimNotAuthenticated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			mailIdentifier();
			setState(338);
			match(Colon);
			setState(339);
			match(NotAuthenticated);
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

	public static class OpenDkimVerificationSuccessfulContext extends ParserRuleContext {
		public MailIdentifierContext mailIdentifier() {
			return getRuleContext(MailIdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PostfixLogParser.Colon, 0); }
		public TerminalNode DkimVerificationSuccessful() { return getToken(PostfixLogParser.DkimVerificationSuccessful, 0); }
		public OpenDkimVerificationSuccessfulContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openDkimVerificationSuccessful; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterOpenDkimVerificationSuccessful(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitOpenDkimVerificationSuccessful(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitOpenDkimVerificationSuccessful(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenDkimVerificationSuccessfulContext openDkimVerificationSuccessful() throws RecognitionException {
		OpenDkimVerificationSuccessfulContext _localctx = new OpenDkimVerificationSuccessfulContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_openDkimVerificationSuccessful);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			mailIdentifier();
			setState(342);
			match(Colon);
			setState(343);
			match(DkimVerificationSuccessful);
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

	public static class OpenDkimKeySelectionContext extends ParserRuleContext {
		public MailIdentifierContext mailIdentifier() {
			return getRuleContext(MailIdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(PostfixLogParser.Colon, 0); }
		public TerminalNode SelectorEquals() { return getToken(PostfixLogParser.SelectorEquals, 0); }
		public List<TerminalNode> String() { return getTokens(PostfixLogParser.String); }
		public TerminalNode String(int i) {
			return getToken(PostfixLogParser.String, i);
		}
		public TerminalNode DomainEquals() { return getToken(PostfixLogParser.DomainEquals, 0); }
		public TerminalNode Ssl() { return getToken(PostfixLogParser.Ssl, 0); }
		public OpenDkimKeySelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openDkimKeySelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterOpenDkimKeySelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitOpenDkimKeySelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitOpenDkimKeySelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenDkimKeySelectionContext openDkimKeySelection() throws RecognitionException {
		OpenDkimKeySelectionContext _localctx = new OpenDkimKeySelectionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_openDkimKeySelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			mailIdentifier();
			setState(346);
			match(Colon);
			setState(347);
			match(SelectorEquals);
			setState(348);
			match(String);
			setState(349);
			match(DomainEquals);
			setState(350);
			match(String);
			setState(351);
			match(Ssl);
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

	public static class OpenDkimKeyRetrievalContext extends ParserRuleContext {
		public MailIdentifierContext mailIdentifier() {
			return getRuleContext(MailIdentifierContext.class,0);
		}
		public List<TerminalNode> Colon() { return getTokens(PostfixLogParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(PostfixLogParser.Colon, i);
		}
		public TerminalNode KeyRetrieval() { return getToken(PostfixLogParser.KeyRetrieval, 0); }
		public List<TerminalNode> Word() { return getTokens(PostfixLogParser.Word); }
		public TerminalNode Word(int i) {
			return getToken(PostfixLogParser.Word, i);
		}
		public TerminalNode RoundBracketOpen() { return getToken(PostfixLogParser.RoundBracketOpen, 0); }
		public TerminalNode SelectorEquals() { return getToken(PostfixLogParser.SelectorEquals, 0); }
		public List<TerminalNode> String() { return getTokens(PostfixLogParser.String); }
		public TerminalNode String(int i) {
			return getToken(PostfixLogParser.String, i);
		}
		public TerminalNode Comma() { return getToken(PostfixLogParser.Comma, 0); }
		public TerminalNode DomainEquals() { return getToken(PostfixLogParser.DomainEquals, 0); }
		public TerminalNode RoundBracketClose() { return getToken(PostfixLogParser.RoundBracketClose, 0); }
		public TerminalNode Text() { return getToken(PostfixLogParser.Text, 0); }
		public List<TerminalNode> Alphanum() { return getTokens(PostfixLogParser.Alphanum); }
		public TerminalNode Alphanum(int i) {
			return getToken(PostfixLogParser.Alphanum, i);
		}
		public OpenDkimKeyRetrievalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_openDkimKeyRetrieval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).enterOpenDkimKeyRetrieval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixLogParserListener ) ((PostfixLogParserListener)listener).exitOpenDkimKeyRetrieval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixLogParserVisitor ) return ((PostfixLogParserVisitor<? extends T>)visitor).visitOpenDkimKeyRetrieval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpenDkimKeyRetrievalContext openDkimKeyRetrieval() throws RecognitionException {
		OpenDkimKeyRetrievalContext _localctx = new OpenDkimKeyRetrievalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_openDkimKeyRetrieval);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			mailIdentifier();
			setState(354);
			match(Colon);
			setState(355);
			match(KeyRetrieval);
			setState(356);
			match(Word);
			setState(357);
			match(RoundBracketOpen);
			setState(358);
			match(SelectorEquals);
			setState(359);
			match(String);
			setState(360);
			match(Comma);
			setState(361);
			match(DomainEquals);
			setState(362);
			match(String);
			setState(363);
			match(RoundBracketClose);
			setState(364);
			match(Colon);
			setState(365);
			match(Text);
			setState(367); 
			_errHandler.sync(this);
			_alt = 1+1;
			do {
				switch (_alt) {
				case 1+1:
					{
					{
					setState(366);
					_la = _input.LA(1);
					if ( !(((((_la - 75)) & ~0x3f) == 0 && ((1L << (_la - 75)) & ((1L << (Word - 75)) | (1L << (Alphanum - 75)) | (1L << (String - 75)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(369); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			} while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3P\u0176\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\3\2\7\2Z\n\2\f\2\16\2]\13\2\3\2\3\2\3\3\3\3\3\3\5\3d\n\3\3\4\3\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u0090\n\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\24\5\24\u009e\n\24\3\25\3\25\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\5\27\u00b1\n\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3"+
		" \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u0108\n \6 \u010a"+
		"\n \r \16 \u010b\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3"+
		"!\3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u0127\n\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3&\3"+
		"\'\3\'\3\'\3\'\3\'\5\'\u014d\n\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3"+
		"*\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\3,\6"+
		",\u0172\n,\r,\16,\u0173\3,\3\u0173\2-\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTV\2\5\4\2MMPP\3\2=>\4\2MNPP"+
		"\2\u0163\2[\3\2\2\2\4`\3\2\2\2\6e\3\2\2\2\bj\3\2\2\2\nl\3\2\2\2\fn\3\2"+
		"\2\2\16p\3\2\2\2\20r\3\2\2\2\22t\3\2\2\2\24v\3\2\2\2\26x\3\2\2\2\30|\3"+
		"\2\2\2\32\u0082\3\2\2\2\34\u0084\3\2\2\2\36\u0086\3\2\2\2 \u0088\3\2\2"+
		"\2\"\u008a\3\2\2\2$\u0097\3\2\2\2&\u009d\3\2\2\2(\u009f\3\2\2\2*\u00a1"+
		"\3\2\2\2,\u00b0\3\2\2\2.\u00b2\3\2\2\2\60\u00b6\3\2\2\2\62\u00ba\3\2\2"+
		"\2\64\u00c8\3\2\2\2\66\u00d0\3\2\2\28\u00d7\3\2\2\2:\u00dc\3\2\2\2<\u00e3"+
		"\3\2\2\2>\u00f4\3\2\2\2@\u011d\3\2\2\2B\u0121\3\2\2\2D\u012b\3\2\2\2F"+
		"\u0136\3\2\2\2H\u013f\3\2\2\2J\u0142\3\2\2\2L\u014c\3\2\2\2N\u014e\3\2"+
		"\2\2P\u0153\3\2\2\2R\u0157\3\2\2\2T\u015b\3\2\2\2V\u0163\3\2\2\2XZ\5\4"+
		"\3\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7"+
		"\2\2\3_\3\3\2\2\2`a\5\"\22\2ac\5,\27\2bd\7\4\2\2cb\3\2\2\2cd\3\2\2\2d"+
		"\5\3\2\2\2ef\t\2\2\2fg\7\n\2\2gh\7L\2\2hi\7\13\2\2i\7\3\2\2\2jk\7P\2\2"+
		"k\t\3\2\2\2lm\7=\2\2m\13\3\2\2\2no\7N\2\2o\r\3\2\2\2pq\7M\2\2q\17\3\2"+
		"\2\2rs\7=\2\2s\21\3\2\2\2tu\7=\2\2u\23\3\2\2\2vw\7N\2\2w\25\3\2\2\2xy"+
		"\7?\2\2yz\5\32\16\2z{\5\30\r\2{\27\3\2\2\2|}\5\34\17\2}~\7\6\2\2~\177"+
		"\5\36\20\2\177\u0080\7\6\2\2\u0080\u0081\5 \21\2\u0081\31\3\2\2\2\u0082"+
		"\u0083\7=\2\2\u0083\33\3\2\2\2\u0084\u0085\7=\2\2\u0085\35\3\2\2\2\u0086"+
		"\u0087\7=\2\2\u0087\37\3\2\2\2\u0088\u0089\7=\2\2\u0089!\3\2\2\2\u008a"+
		"\u008b\5\26\f\2\u008b\u008f\7M\2\2\u008c\u008d\5&\24\2\u008d\u008e\7\7"+
		"\2\2\u008e\u0090\3\2\2\2\u008f\u008c\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\u0092\5(\25\2\u0092\u0093\7\n\2\2\u0093\u0094\5$"+
		"\23\2\u0094\u0095\7\13\2\2\u0095\u0096\7\6\2\2\u0096#\3\2\2\2\u0097\u0098"+
		"\7=\2\2\u0098%\3\2\2\2\u0099\u009a\7M\2\2\u009a\u009b\7\7\2\2\u009b\u009e"+
		"\7M\2\2\u009c\u009e\7M\2\2\u009d\u0099\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\'\3\2\2\2\u009f\u00a0\7M\2\2\u00a0)\3\2\2\2\u00a1\u00a2\7\64\2\2\u00a2"+
		"+\3\2\2\2\u00a3\u00b1\5.\30\2\u00a4\u00b1\5\60\31\2\u00a5\u00b1\5\62\32"+
		"\2\u00a6\u00b1\5\64\33\2\u00a7\u00b1\58\35\2\u00a8\u00b1\5B\"\2\u00a9"+
		"\u00b1\5J&\2\u00aa\u00b1\5L\'\2\u00ab\u00b1\5:\36\2\u00ac\u00b1\5<\37"+
		"\2\u00ad\u00b1\5> \2\u00ae\u00b1\5@!\2\u00af\u00b1\5\66\34\2\u00b0\u00a3"+
		"\3\2\2\2\u00b0\u00a4\3\2\2\2\u00b0\u00a5\3\2\2\2\u00b0\u00a6\3\2\2\2\u00b0"+
		"\u00a7\3\2\2\2\u00b0\u00a8\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b0\u00aa\3\2"+
		"\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1-\3\2\2\2\u00b2\u00b3\7\21\2\2"+
		"\u00b3\u00b4\7\23\2\2\u00b4\u00b5\5\6\4\2\u00b5/\3\2\2\2\u00b6\u00b7\7"+
		"\22\2\2\u00b7\u00b8\7\23\2\2\u00b8\u00b9\5\6\4\2\u00b9\61\3\2\2\2\u00ba"+
		"\u00bb\7\24\2\2\u00bb\u00bc\7\23\2\2\u00bc\u00bd\5\6\4\2\u00bd\u00be\7"+
		"\6\2\2\u00be\u00bf\7\25\2\2\u00bf\u00c0\7\26\2\2\u00c0\u00c1\5\b\5\2\u00c1"+
		"\u00c2\7\b\2\2\u00c2\u00c3\5\n\6\2\u00c3\u00c4\7\7\2\2\u00c4\u00c5\5\n"+
		"\6\2\u00c5\u00c6\7\27\2\2\u00c6\u00c7\7\t\2\2\u00c7\63\3\2\2\2\u00c8\u00c9"+
		"\7\30\2\2\u00c9\u00ca\7\6\2\2\u00ca\u00cb\5\6\4\2\u00cb\u00cc\7\6\2\2"+
		"\u00cc\u00cd\7\33\2\2\u00cd\u00ce\7\6\2\2\u00ce\u00cf\5\f\7\2\u00cf\65"+
		"\3\2\2\2\u00d0\u00d1\7\30\2\2\u00d1\u00d2\7\6\2\2\u00d2\u00d3\7;\2\2\u00d3"+
		"\u00d4\7P\2\2\u00d4\u00d5\7:\2\2\u00d5\u00d6\7L\2\2\u00d6\67\3\2\2\2\u00d7"+
		"\u00d8\7\34\2\2\u00d8\u00d9\5\16\b\2\u00d9\u00da\7\23\2\2\u00da\u00db"+
		"\5\6\4\2\u00db9\3\2\2\2\u00dc\u00dd\7N\2\2\u00dd\u00de\7\6\2\2\u00de\u00df"+
		"\7\62\2\2\u00df\u00e0\7$\2\2\u00e0\u00e1\7O\2\2\u00e1\u00e2\7%\2\2\u00e2"+
		";\3\2\2\2\u00e3\u00e4\5\24\13\2\u00e4\u00e5\7\6\2\2\u00e5\u00e6\7+\2\2"+
		"\u00e6\u00e7\7$\2\2\u00e7\u00e8\7O\2\2\u00e8\u00e9\7%\2\2\u00e9\u00ea"+
		"\7\r\2\2\u00ea\u00eb\7\60\2\2\u00eb\u00ec\7=\2\2\u00ec\u00ed\7\r\2\2\u00ed"+
		"\u00ee\7\61\2\2\u00ee\u00ef\7=\2\2\u00ef\u00f0\7\b\2\2\u00f0\u00f1\7M"+
		"\2\2\u00f1\u00f2\7M\2\2\u00f2\u00f3\7\t\2\2\u00f3=\3\2\2\2\u00f4\u00f5"+
		"\5\24\13\2\u00f5\u00f6\7\6\2\2\u00f6\u00f7\7,\2\2\u00f7\u00f8\7$\2\2\u00f8"+
		"\u00f9\7O\2\2\u00f9\u00fa\7%\2\2\u00fa\u00fb\7\r\2\2\u00fb\u00fc\7-\2"+
		"\2\u00fc\u00fd\7P\2\2\u00fd\u00fe\7\n\2\2\u00fe\u00ff\5*\26\2\u00ff\u0100"+
		"\7\13\2\2\u0100\u0101\7\r\2\2\u0101\u0102\7.\2\2\u0102\u0103\t\3\2\2\u0103"+
		"\u0104\7\r\2\2\u0104\u0109\7/\2\2\u0105\u0107\t\3\2\2\u0106\u0108\7\7"+
		"\2\2\u0107\u0106\3\2\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109"+
		"\u0105\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0109\3\2\2\2\u010b\u010c\3\2"+
		"\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7\r\2\2\u010e\u010f\7\65\2\2\u010f"+
		"\u0110\7P\2\2\u0110\u0111\7\r\2\2\u0111\u0112\7\66\2\2\u0112\u0113\7M"+
		"\2\2\u0113\u0114\7\b\2\2\u0114\u0115\7=\2\2\u0115\u0116\7P\2\2\u0116\u0117"+
		"\7$\2\2\u0117\u0118\7O\2\2\u0118\u0119\7%\2\2\u0119\u011a\7N\2\2\u011a"+
		"\u011b\7\67\2\2\u011b\u011c\7\t\2\2\u011c?\3\2\2\2\u011d\u011e\5\24\13"+
		"\2\u011e\u011f\7\6\2\2\u011f\u0120\78\2\2\u0120A\3\2\2\2\u0121\u0122\7"+
		"\32\2\2\u0122\u0126\7\6\2\2\u0123\u0127\5D#\2\u0124\u0127\5F$\2\u0125"+
		"\u0127\5H%\2\u0126\u0123\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0125\3\2\2"+
		"\2\u0127\u0128\3\2\2\2\u0128\u0129\7!\2\2\u0129\u012a\5\26\f\2\u012aC"+
		"\3\2\2\2\u012b\u012c\7\35\2\2\u012c\u012d\5\20\t\2\u012d\u012e\7\7\2\2"+
		"\u012e\u012f\7 \2\2\u012f\u0130\7\"\2\2\u0130\u0131\7\b\2\2\u0131\u0132"+
		"\5&\24\2\u0132\u0133\7\6\2\2\u0133\u0134\7L\2\2\u0134\u0135\7\t\2\2\u0135"+
		"E\3\2\2\2\u0136\u0137\7\36\2\2\u0137\u0138\5\20\t\2\u0138\u0139\7\"\2"+
		"\2\u0139\u013a\7\b\2\2\u013a\u013b\5&\24\2\u013b\u013c\7\6\2\2\u013c\u013d"+
		"\7L\2\2\u013d\u013e\7\t\2\2\u013eG\3\2\2\2\u013f\u0140\7\37\2\2\u0140"+
		"\u0141\5\22\n\2\u0141I\3\2\2\2\u0142\u0143\5\24\13\2\u0143\u0144\7\6\2"+
		"\2\u0144\u0145\7\63\2\2\u0145\u0146\5\6\4\2\u0146K\3\2\2\2\u0147\u014d"+
		"\5N(\2\u0148\u014d\5P)\2\u0149\u014d\5R*\2\u014a\u014d\5T+\2\u014b\u014d"+
		"\5V,\2\u014c\u0147\3\2\2\2\u014c\u0148\3\2\2\2\u014c\u0149\3\2\2\2\u014c"+
		"\u014a\3\2\2\2\u014c\u014b\3\2\2\2\u014dM\3\2\2\2\u014e\u014f\5\24\13"+
		"\2\u014f\u0150\7\6\2\2\u0150\u0151\5\6\4\2\u0151\u0152\7#\2\2\u0152O\3"+
		"\2\2\2\u0153\u0154\5\24\13\2\u0154\u0155\7\6\2\2\u0155\u0156\7&\2\2\u0156"+
		"Q\3\2\2\2\u0157\u0158\5\24\13\2\u0158\u0159\7\6\2\2\u0159\u015a\7\'\2"+
		"\2\u015aS\3\2\2\2\u015b\u015c\5\24\13\2\u015c\u015d\7\6\2\2\u015d\u015e"+
		"\7(\2\2\u015e\u015f\7P\2\2\u015f\u0160\7)\2\2\u0160\u0161\7P\2\2\u0161"+
		"\u0162\7*\2\2\u0162U\3\2\2\2\u0163\u0164\5\24\13\2\u0164\u0165\7\6\2\2"+
		"\u0165\u0166\79\2\2\u0166\u0167\7M\2\2\u0167\u0168\7\b\2\2\u0168\u0169"+
		"\7(\2\2\u0169\u016a\7P\2\2\u016a\u016b\7\r\2\2\u016b\u016c\7)\2\2\u016c"+
		"\u016d\7P\2\2\u016d\u016e\7\t\2\2\u016e\u016f\7\6\2\2\u016f\u0171\7\5"+
		"\2\2\u0170\u0172\t\4\2\2\u0171\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0173\u0171\3\2\2\2\u0174W\3\2\2\2\f[c\u008f\u009d\u00b0"+
		"\u0107\u010b\u0126\u014c\u0173";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}