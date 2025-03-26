// Generated from C:/Users/xc/Desktop/workspace/antlrDemo/src/main/java/com/fqq/antlr/SearchCondition.g4 by ANTLR 4.13.2
package com.fqq.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SearchConditionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPERATOR=1, AND=2, OR=3, LPAREN=4, RPAREN=5, IDENTIFIER=6, STRING=7, NUMBER=8, 
		WS=9;
	public static final int
		RULE_condition = 0, RULE_orCondition = 1, RULE_andCondition = 2, RULE_atomCondition = 3, 
		RULE_fieldCompare = 4, RULE_field = 5, RULE_value = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"condition", "orCondition", "andCondition", "atomCondition", "fieldCompare", 
			"field", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\\u9A9E\\u6735\\u7B16'", "'\\u93B4\\uFFFD'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "OPERATOR", "AND", "OR", "LPAREN", "RPAREN", "IDENTIFIER", "STRING", 
			"NUMBER", "WS"
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
	public String getGrammarFileName() { return "SearchCondition.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SearchConditionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public OrConditionContext orCondition() {
			return getRuleContext(OrConditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchConditionListener ) ((SearchConditionListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchConditionListener ) ((SearchConditionListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchConditionVisitor ) return ((SearchConditionVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			orCondition();
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
	public static class OrConditionContext extends ParserRuleContext {
		public List<AndConditionContext> andCondition() {
			return getRuleContexts(AndConditionContext.class);
		}
		public AndConditionContext andCondition(int i) {
			return getRuleContext(AndConditionContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SearchConditionParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SearchConditionParser.OR, i);
		}
		public OrConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchConditionListener ) ((SearchConditionListener)listener).enterOrCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchConditionListener ) ((SearchConditionListener)listener).exitOrCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchConditionVisitor ) return ((SearchConditionVisitor<? extends T>)visitor).visitOrCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrConditionContext orCondition() throws RecognitionException {
		OrConditionContext _localctx = new OrConditionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_orCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			andCondition();
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(17);
				match(OR);
				setState(18);
				andCondition();
				}
				}
				setState(23);
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
	public static class AndConditionContext extends ParserRuleContext {
		public List<AtomConditionContext> atomCondition() {
			return getRuleContexts(AtomConditionContext.class);
		}
		public AtomConditionContext atomCondition(int i) {
			return getRuleContext(AtomConditionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(SearchConditionParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(SearchConditionParser.AND, i);
		}
		public AndConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchConditionListener ) ((SearchConditionListener)listener).enterAndCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchConditionListener ) ((SearchConditionListener)listener).exitAndCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchConditionVisitor ) return ((SearchConditionVisitor<? extends T>)visitor).visitAndCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndConditionContext andCondition() throws RecognitionException {
		AndConditionContext _localctx = new AndConditionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_andCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			atomCondition();
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(25);
				match(AND);
				setState(26);
				atomCondition();
				}
				}
				setState(31);
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
	public static class AtomConditionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(SearchConditionParser.LPAREN, 0); }
		public OrConditionContext orCondition() {
			return getRuleContext(OrConditionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SearchConditionParser.RPAREN, 0); }
		public FieldCompareContext fieldCompare() {
			return getRuleContext(FieldCompareContext.class,0);
		}
		public AtomConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchConditionListener ) ((SearchConditionListener)listener).enterAtomCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchConditionListener ) ((SearchConditionListener)listener).exitAtomCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchConditionVisitor ) return ((SearchConditionVisitor<? extends T>)visitor).visitAtomCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomConditionContext atomCondition() throws RecognitionException {
		AtomConditionContext _localctx = new AtomConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atomCondition);
		try {
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				match(LPAREN);
				setState(33);
				orCondition();
				setState(34);
				match(RPAREN);
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				fieldCompare();
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
	public static class FieldCompareContext extends ParserRuleContext {
		public FieldContext field() {
			return getRuleContext(FieldContext.class,0);
		}
		public TerminalNode OPERATOR() { return getToken(SearchConditionParser.OPERATOR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public FieldCompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldCompare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchConditionListener ) ((SearchConditionListener)listener).enterFieldCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchConditionListener ) ((SearchConditionListener)listener).exitFieldCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchConditionVisitor ) return ((SearchConditionVisitor<? extends T>)visitor).visitFieldCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldCompareContext fieldCompare() throws RecognitionException {
		FieldCompareContext _localctx = new FieldCompareContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_fieldCompare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			field();
			setState(40);
			match(OPERATOR);
			setState(41);
			value();
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
	public static class FieldContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(SearchConditionParser.IDENTIFIER, 0); }
		public FieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_field; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchConditionListener ) ((SearchConditionListener)listener).enterField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchConditionListener ) ((SearchConditionListener)listener).exitField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchConditionVisitor ) return ((SearchConditionVisitor<? extends T>)visitor).visitField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldContext field() throws RecognitionException {
		FieldContext _localctx = new FieldContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_field);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(IDENTIFIER);
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SearchConditionParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(SearchConditionParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SearchConditionListener ) ((SearchConditionListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SearchConditionListener ) ((SearchConditionListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SearchConditionVisitor ) return ((SearchConditionVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==NUMBER) ) {
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

	public static final String _serializedATN =
		"\u0004\u0001\t0\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0014\b\u0001\n\u0001\f\u0001"+
		"\u0017\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002\u001c\b"+
		"\u0002\n\u0002\f\u0002\u001f\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003&\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0000\u0000\u0007\u0000\u0002\u0004\u0006\b\n\f\u0000\u0001"+
		"\u0001\u0000\u0007\b+\u0000\u000e\u0001\u0000\u0000\u0000\u0002\u0010"+
		"\u0001\u0000\u0000\u0000\u0004\u0018\u0001\u0000\u0000\u0000\u0006%\u0001"+
		"\u0000\u0000\u0000\b\'\u0001\u0000\u0000\u0000\n+\u0001\u0000\u0000\u0000"+
		"\f-\u0001\u0000\u0000\u0000\u000e\u000f\u0003\u0002\u0001\u0000\u000f"+
		"\u0001\u0001\u0000\u0000\u0000\u0010\u0015\u0003\u0004\u0002\u0000\u0011"+
		"\u0012\u0005\u0003\u0000\u0000\u0012\u0014\u0003\u0004\u0002\u0000\u0013"+
		"\u0011\u0001\u0000\u0000\u0000\u0014\u0017\u0001\u0000\u0000\u0000\u0015"+
		"\u0013\u0001\u0000\u0000\u0000\u0015\u0016\u0001\u0000\u0000\u0000\u0016"+
		"\u0003\u0001\u0000\u0000\u0000\u0017\u0015\u0001\u0000\u0000\u0000\u0018"+
		"\u001d\u0003\u0006\u0003\u0000\u0019\u001a\u0005\u0002\u0000\u0000\u001a"+
		"\u001c\u0003\u0006\u0003\u0000\u001b\u0019\u0001\u0000\u0000\u0000\u001c"+
		"\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d"+
		"\u001e\u0001\u0000\u0000\u0000\u001e\u0005\u0001\u0000\u0000\u0000\u001f"+
		"\u001d\u0001\u0000\u0000\u0000 !\u0005\u0004\u0000\u0000!\"\u0003\u0002"+
		"\u0001\u0000\"#\u0005\u0005\u0000\u0000#&\u0001\u0000\u0000\u0000$&\u0003"+
		"\b\u0004\u0000% \u0001\u0000\u0000\u0000%$\u0001\u0000\u0000\u0000&\u0007"+
		"\u0001\u0000\u0000\u0000\'(\u0003\n\u0005\u0000()\u0005\u0001\u0000\u0000"+
		")*\u0003\f\u0006\u0000*\t\u0001\u0000\u0000\u0000+,\u0005\u0006\u0000"+
		"\u0000,\u000b\u0001\u0000\u0000\u0000-.\u0007\u0000\u0000\u0000.\r\u0001"+
		"\u0000\u0000\u0000\u0003\u0015\u001d%";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}