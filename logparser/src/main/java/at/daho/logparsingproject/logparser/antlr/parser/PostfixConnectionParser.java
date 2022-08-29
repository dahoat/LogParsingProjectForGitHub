// Generated from PostfixConnectionParser.g4 by ANTLR 4.9

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
public class PostfixConnectionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Whitespace=1, Linebreak=2, Colon=3, Dot=4, Slash=5, SquareBracketOpen=6, 
		SquareBracketClose=7, Connect=8, Disconnect=9, From=10, Month=11, Ip=12, 
		Integer=13, Float=14, Word=15, Char=16, String=17, Remainder=18;
	public static final int
		RULE_hostnameWithIp = 0, RULE_hostname = 1, RULE_domainname = 2, RULE_log = 3, 
		RULE_logline = 4, RULE_logheader = 5, RULE_timestamp = 6, RULE_time = 7, 
		RULE_day = 8, RULE_hour = 9, RULE_minute = 10, RULE_second = 11, RULE_processinformation = 12, 
		RULE_service = 13, RULE_processName = 14, RULE_processId = 15, RULE_logcontent = 16, 
		RULE_connect = 17, RULE_disconnect = 18;
	private static String[] makeRuleNames() {
		return new String[] {
			"hostnameWithIp", "hostname", "domainname", "log", "logline", "logheader", 
			"timestamp", "time", "day", "hour", "minute", "second", "processinformation", 
			"service", "processName", "processId", "logcontent", "connect", "disconnect"
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

	@Override
	public String getGrammarFileName() { return "PostfixConnectionParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PostfixConnectionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class HostnameWithIpContext extends ParserRuleContext {
		public HostnameContext hostname() {
			return getRuleContext(HostnameContext.class,0);
		}
		public TerminalNode SquareBracketOpen() { return getToken(PostfixConnectionParser.SquareBracketOpen, 0); }
		public TerminalNode Ip() { return getToken(PostfixConnectionParser.Ip, 0); }
		public TerminalNode SquareBracketClose() { return getToken(PostfixConnectionParser.SquareBracketClose, 0); }
		public HostnameWithIpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostnameWithIp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).enterHostnameWithIp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).exitHostnameWithIp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixConnectionParserVisitor ) return ((PostfixConnectionParserVisitor<? extends T>)visitor).visitHostnameWithIp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostnameWithIpContext hostnameWithIp() throws RecognitionException {
		HostnameWithIpContext _localctx = new HostnameWithIpContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_hostnameWithIp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			hostname();
			setState(39);
			match(SquareBracketOpen);
			setState(40);
			match(Ip);
			setState(41);
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

	public static class HostnameContext extends ParserRuleContext {
		public List<DomainnameContext> domainname() {
			return getRuleContexts(DomainnameContext.class);
		}
		public DomainnameContext domainname(int i) {
			return getRuleContext(DomainnameContext.class,i);
		}
		public List<TerminalNode> Dot() { return getTokens(PostfixConnectionParser.Dot); }
		public TerminalNode Dot(int i) {
			return getToken(PostfixConnectionParser.Dot, i);
		}
		public HostnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).enterHostname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).exitHostname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixConnectionParserVisitor ) return ((PostfixConnectionParserVisitor<? extends T>)visitor).visitHostname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostnameContext hostname() throws RecognitionException {
		HostnameContext _localctx = new HostnameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hostname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			domainname();
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Dot) {
				{
				{
				setState(44);
				match(Dot);
				setState(45);
				domainname();
				}
				}
				setState(50);
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

	public static class DomainnameContext extends ParserRuleContext {
		public TerminalNode String() { return getToken(PostfixConnectionParser.String, 0); }
		public TerminalNode Word() { return getToken(PostfixConnectionParser.Word, 0); }
		public TerminalNode Ip() { return getToken(PostfixConnectionParser.Ip, 0); }
		public TerminalNode Integer() { return getToken(PostfixConnectionParser.Integer, 0); }
		public DomainnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domainname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).enterDomainname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).exitDomainname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixConnectionParserVisitor ) return ((PostfixConnectionParserVisitor<? extends T>)visitor).visitDomainname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DomainnameContext domainname() throws RecognitionException {
		DomainnameContext _localctx = new DomainnameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_domainname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Ip) | (1L << Integer) | (1L << Word) | (1L << String))) != 0)) ) {
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

	public static class LogContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PostfixConnectionParser.EOF, 0); }
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
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).exitLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixConnectionParserVisitor ) return ((PostfixConnectionParserVisitor<? extends T>)visitor).visitLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_log);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Month) {
				{
				{
				setState(53);
				logline();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
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
		public TerminalNode Colon() { return getToken(PostfixConnectionParser.Colon, 0); }
		public LogcontentContext logcontent() {
			return getRuleContext(LogcontentContext.class,0);
		}
		public TerminalNode Linebreak() { return getToken(PostfixConnectionParser.Linebreak, 0); }
		public LoglineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).enterLogline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).exitLogline(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixConnectionParserVisitor ) return ((PostfixConnectionParserVisitor<? extends T>)visitor).visitLogline(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoglineContext logline() throws RecognitionException {
		LoglineContext _localctx = new LoglineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_logline);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			logheader();
			setState(62);
			match(Colon);
			setState(63);
			logcontent();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Linebreak) {
				{
				setState(64);
				match(Linebreak);
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

	public static class LogheaderContext extends ParserRuleContext {
		public TimestampContext timestamp() {
			return getRuleContext(TimestampContext.class,0);
		}
		public HostnameContext hostname() {
			return getRuleContext(HostnameContext.class,0);
		}
		public ProcessinformationContext processinformation() {
			return getRuleContext(ProcessinformationContext.class,0);
		}
		public LogheaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logheader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).enterLogheader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).exitLogheader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixConnectionParserVisitor ) return ((PostfixConnectionParserVisitor<? extends T>)visitor).visitLogheader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogheaderContext logheader() throws RecognitionException {
		LogheaderContext _localctx = new LogheaderContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_logheader);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			timestamp();
			setState(68);
			hostname();
			setState(69);
			processinformation();
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
		public TerminalNode Month() { return getToken(PostfixConnectionParser.Month, 0); }
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
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).enterTimestamp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).exitTimestamp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixConnectionParserVisitor ) return ((PostfixConnectionParserVisitor<? extends T>)visitor).visitTimestamp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimestampContext timestamp() throws RecognitionException {
		TimestampContext _localctx = new TimestampContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_timestamp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(Month);
			setState(72);
			day();
			setState(73);
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
		public List<TerminalNode> Colon() { return getTokens(PostfixConnectionParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(PostfixConnectionParser.Colon, i);
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
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).enterTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).exitTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixConnectionParserVisitor ) return ((PostfixConnectionParserVisitor<? extends T>)visitor).visitTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeContext time() throws RecognitionException {
		TimeContext _localctx = new TimeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			hour();
			setState(76);
			match(Colon);
			setState(77);
			minute();
			setState(78);
			match(Colon);
			setState(79);
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
		public TerminalNode Integer() { return getToken(PostfixConnectionParser.Integer, 0); }
		public DayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).enterDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).exitDay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixConnectionParserVisitor ) return ((PostfixConnectionParserVisitor<? extends T>)visitor).visitDay(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DayContext day() throws RecognitionException {
		DayContext _localctx = new DayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_day);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(Integer);
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
		public TerminalNode Integer() { return getToken(PostfixConnectionParser.Integer, 0); }
		public HourContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hour; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).enterHour(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).exitHour(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixConnectionParserVisitor ) return ((PostfixConnectionParserVisitor<? extends T>)visitor).visitHour(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HourContext hour() throws RecognitionException {
		HourContext _localctx = new HourContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_hour);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(Integer);
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
		public TerminalNode Integer() { return getToken(PostfixConnectionParser.Integer, 0); }
		public MinuteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).enterMinute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).exitMinute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixConnectionParserVisitor ) return ((PostfixConnectionParserVisitor<? extends T>)visitor).visitMinute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MinuteContext minute() throws RecognitionException {
		MinuteContext _localctx = new MinuteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_minute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			match(Integer);
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
		public TerminalNode Integer() { return getToken(PostfixConnectionParser.Integer, 0); }
		public SecondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).enterSecond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).exitSecond(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixConnectionParserVisitor ) return ((PostfixConnectionParserVisitor<? extends T>)visitor).visitSecond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecondContext second() throws RecognitionException {
		SecondContext _localctx = new SecondContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_second);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(Integer);
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

	public static class ProcessinformationContext extends ParserRuleContext {
		public ProcessNameContext processName() {
			return getRuleContext(ProcessNameContext.class,0);
		}
		public TerminalNode SquareBracketOpen() { return getToken(PostfixConnectionParser.SquareBracketOpen, 0); }
		public ProcessIdContext processId() {
			return getRuleContext(ProcessIdContext.class,0);
		}
		public TerminalNode SquareBracketClose() { return getToken(PostfixConnectionParser.SquareBracketClose, 0); }
		public List<ServiceContext> service() {
			return getRuleContexts(ServiceContext.class);
		}
		public ServiceContext service(int i) {
			return getRuleContext(ServiceContext.class,i);
		}
		public List<TerminalNode> Slash() { return getTokens(PostfixConnectionParser.Slash); }
		public TerminalNode Slash(int i) {
			return getToken(PostfixConnectionParser.Slash, i);
		}
		public ProcessinformationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_processinformation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).enterProcessinformation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).exitProcessinformation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixConnectionParserVisitor ) return ((PostfixConnectionParserVisitor<? extends T>)visitor).visitProcessinformation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessinformationContext processinformation() throws RecognitionException {
		ProcessinformationContext _localctx = new ProcessinformationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_processinformation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(89);
					service();
					setState(90);
					match(Slash);
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(97);
			processName();
			setState(98);
			match(SquareBracketOpen);
			setState(99);
			processId();
			setState(100);
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

	public static class ServiceContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(PostfixConnectionParser.Word, 0); }
		public TerminalNode String() { return getToken(PostfixConnectionParser.String, 0); }
		public ServiceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_service; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).enterService(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).exitService(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixConnectionParserVisitor ) return ((PostfixConnectionParserVisitor<? extends T>)visitor).visitService(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServiceContext service() throws RecognitionException {
		ServiceContext _localctx = new ServiceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_service);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			_la = _input.LA(1);
			if ( !(_la==Word || _la==String) ) {
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

	public static class ProcessNameContext extends ParserRuleContext {
		public TerminalNode Word() { return getToken(PostfixConnectionParser.Word, 0); }
		public TerminalNode String() { return getToken(PostfixConnectionParser.String, 0); }
		public ProcessNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_processName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).enterProcessName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).exitProcessName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixConnectionParserVisitor ) return ((PostfixConnectionParserVisitor<? extends T>)visitor).visitProcessName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessNameContext processName() throws RecognitionException {
		ProcessNameContext _localctx = new ProcessNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_processName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_la = _input.LA(1);
			if ( !(_la==Word || _la==String) ) {
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

	public static class ProcessIdContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(PostfixConnectionParser.Integer, 0); }
		public ProcessIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_processId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).enterProcessId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).exitProcessId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixConnectionParserVisitor ) return ((PostfixConnectionParserVisitor<? extends T>)visitor).visitProcessId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcessIdContext processId() throws RecognitionException {
		ProcessIdContext _localctx = new ProcessIdContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_processId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(Integer);
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

	public static class LogcontentContext extends ParserRuleContext {
		public ConnectContext connect() {
			return getRuleContext(ConnectContext.class,0);
		}
		public DisconnectContext disconnect() {
			return getRuleContext(DisconnectContext.class,0);
		}
		public LogcontentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logcontent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).enterLogcontent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).exitLogcontent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixConnectionParserVisitor ) return ((PostfixConnectionParserVisitor<? extends T>)visitor).visitLogcontent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogcontentContext logcontent() throws RecognitionException {
		LogcontentContext _localctx = new LogcontentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_logcontent);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Connect:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				connect();
				}
				break;
			case Disconnect:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				disconnect();
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

	public static class ConnectContext extends ParserRuleContext {
		public TerminalNode Connect() { return getToken(PostfixConnectionParser.Connect, 0); }
		public TerminalNode From() { return getToken(PostfixConnectionParser.From, 0); }
		public HostnameWithIpContext hostnameWithIp() {
			return getRuleContext(HostnameWithIpContext.class,0);
		}
		public ConnectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).enterConnect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).exitConnect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixConnectionParserVisitor ) return ((PostfixConnectionParserVisitor<? extends T>)visitor).visitConnect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectContext connect() throws RecognitionException {
		ConnectContext _localctx = new ConnectContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_connect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(Connect);
			setState(113);
			match(From);
			setState(114);
			hostnameWithIp();
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
		public TerminalNode Disconnect() { return getToken(PostfixConnectionParser.Disconnect, 0); }
		public TerminalNode From() { return getToken(PostfixConnectionParser.From, 0); }
		public HostnameWithIpContext hostnameWithIp() {
			return getRuleContext(HostnameWithIpContext.class,0);
		}
		public DisconnectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disconnect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).enterDisconnect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PostfixConnectionParserListener ) ((PostfixConnectionParserListener)listener).exitDisconnect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PostfixConnectionParserVisitor ) return ((PostfixConnectionParserVisitor<? extends T>)visitor).visitDisconnect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DisconnectContext disconnect() throws RecognitionException {
		DisconnectContext _localctx = new DisconnectContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_disconnect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(Disconnect);
			setState(117);
			match(From);
			setState(118);
			hostnameWithIp();
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\24{\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23"+
		"\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3\61\n\3\f\3\16\3\64"+
		"\13\3\3\4\3\4\3\5\7\59\n\5\f\5\16\5<\13\5\3\5\3\5\3\6\3\6\3\6\3\6\5\6"+
		"D\n\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n"+
		"\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\7\16_\n\16\f\16\16\16b\13\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\5\22"+
		"q\n\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\2\2\25\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&\2\4\5\2\16\17\21\21\23\23\4\2\21\21\23"+
		"\23\2l\2(\3\2\2\2\4-\3\2\2\2\6\65\3\2\2\2\b:\3\2\2\2\n?\3\2\2\2\fE\3\2"+
		"\2\2\16I\3\2\2\2\20M\3\2\2\2\22S\3\2\2\2\24U\3\2\2\2\26W\3\2\2\2\30Y\3"+
		"\2\2\2\32`\3\2\2\2\34h\3\2\2\2\36j\3\2\2\2 l\3\2\2\2\"p\3\2\2\2$r\3\2"+
		"\2\2&v\3\2\2\2()\5\4\3\2)*\7\b\2\2*+\7\16\2\2+,\7\t\2\2,\3\3\2\2\2-\62"+
		"\5\6\4\2./\7\6\2\2/\61\5\6\4\2\60.\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2"+
		"\62\63\3\2\2\2\63\5\3\2\2\2\64\62\3\2\2\2\65\66\t\2\2\2\66\7\3\2\2\2\67"+
		"9\5\n\6\28\67\3\2\2\29<\3\2\2\2:8\3\2\2\2:;\3\2\2\2;=\3\2\2\2<:\3\2\2"+
		"\2=>\7\2\2\3>\t\3\2\2\2?@\5\f\7\2@A\7\5\2\2AC\5\"\22\2BD\7\4\2\2CB\3\2"+
		"\2\2CD\3\2\2\2D\13\3\2\2\2EF\5\16\b\2FG\5\4\3\2GH\5\32\16\2H\r\3\2\2\2"+
		"IJ\7\r\2\2JK\5\22\n\2KL\5\20\t\2L\17\3\2\2\2MN\5\24\13\2NO\7\5\2\2OP\5"+
		"\26\f\2PQ\7\5\2\2QR\5\30\r\2R\21\3\2\2\2ST\7\17\2\2T\23\3\2\2\2UV\7\17"+
		"\2\2V\25\3\2\2\2WX\7\17\2\2X\27\3\2\2\2YZ\7\17\2\2Z\31\3\2\2\2[\\\5\34"+
		"\17\2\\]\7\7\2\2]_\3\2\2\2^[\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2ac\3"+
		"\2\2\2b`\3\2\2\2cd\5\36\20\2de\7\b\2\2ef\5 \21\2fg\7\t\2\2g\33\3\2\2\2"+
		"hi\t\3\2\2i\35\3\2\2\2jk\t\3\2\2k\37\3\2\2\2lm\7\17\2\2m!\3\2\2\2nq\5"+
		"$\23\2oq\5&\24\2pn\3\2\2\2po\3\2\2\2q#\3\2\2\2rs\7\n\2\2st\7\f\2\2tu\5"+
		"\2\2\2u%\3\2\2\2vw\7\13\2\2wx\7\f\2\2xy\5\2\2\2y\'\3\2\2\2\7\62:C`p";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}