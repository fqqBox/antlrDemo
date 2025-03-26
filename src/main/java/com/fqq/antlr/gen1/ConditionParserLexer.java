// Generated from C:/Users/xc/Desktop/workspace/antlrDemo/src/main/java/com/fqq/antlr/ConditionParser.g4 by ANTLR 4.13.2
package com.fqq.antlr.gen1;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ConditionParserLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, OP=5, ID=6, NUMBER=7, STRING=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "OP", "ID", "NUMBER", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'\\u93B4\\uFFFD'", "'\\u6D93\\uFFFD'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "OP", "ID", "NUMBER", "STRING", "WS"
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


	public ConditionParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ConditionParser.g4"; }

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
		"\u0004\u0000\t~\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004R\b"+
		"\u0004\u0001\u0005\u0001\u0005\u0005\u0005V\b\u0005\n\u0005\f\u0005Y\t"+
		"\u0005\u0001\u0005\u0004\u0005\\\b\u0005\u000b\u0005\f\u0005]\u0003\u0005"+
		"`\b\u0005\u0001\u0006\u0004\u0006c\b\u0006\u000b\u0006\f\u0006d\u0001"+
		"\u0006\u0001\u0006\u0004\u0006i\b\u0006\u000b\u0006\f\u0006j\u0003\u0006"+
		"m\b\u0006\u0001\u0007\u0001\u0007\u0005\u0007q\b\u0007\n\u0007\f\u0007"+
		"t\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0004\by\b\b\u000b\b\f\bz\u0001"+
		"\b\u0001\b\u0000\u0000\t\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0001\u0000\u0006\u0003\u0000"+
		"AZ__az\u0004\u000009AZ__az\u0001\u0000\u4e00\u8000\u9fa5\u0001\u00000"+
		"9\u0001\u0000\'\'\u0003\u0000\t\n\r\r  \u008f\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0001\u0013\u0001\u0000\u0000\u0000\u0003\u0016\u0001\u0000\u0000\u0000"+
		"\u0005\u0019\u0001\u0000\u0000\u0000\u0007\u001b\u0001\u0000\u0000\u0000"+
		"\tQ\u0001\u0000\u0000\u0000\u000b_\u0001\u0000\u0000\u0000\rb\u0001\u0000"+
		"\u0000\u0000\u000fn\u0001\u0000\u0000\u0000\u0011x\u0001\u0000\u0000\u0000"+
		"\u0013\u0014\u0005\u8000\u93b4\u0000\u0000\u0014\u0015\u0005\u8000\ufffd"+
		"\u0000\u0000\u0015\u0002\u0001\u0000\u0000\u0000\u0016\u0017\u0005\u6d93"+
		"\u0000\u0000\u0017\u0018\u0005\u8000\ufffd\u0000\u0000\u0018\u0004\u0001"+
		"\u0000\u0000\u0000\u0019\u001a\u0005(\u0000\u0000\u001a\u0006\u0001\u0000"+
		"\u0000\u0000\u001b\u001c\u0005)\u0000\u0000\u001c\b\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0005\u6fb6\u0000\u0000\u001e\u001f\u0005\u0442\u0000"+
		"\u0000\u001fR\u0005\u7c2c\u0000\u0000 !\u0005\u704f\u0000\u0000!\"\u0005"+
		"\u5fce\u0000\u0000\"R\u0005\u7c2c\u0000\u0000#$\u0005\u7edb\u0000\u0000"+
		"$%\u0005\u5909\u0000\u0000%R\u0005\u7c2c\u0000\u0000&\'\u0005\u6fb6\u0000"+
		"\u0000\'(\u0005\u0442\u0000\u0000()\u0005\u7c2c\u0000\u0000)*\u0005\u7edb"+
		"\u0000\u0000*+\u0005\u5909\u0000\u0000+R\u0005\u7c2c\u0000\u0000,-\u0005"+
		"\u704f\u0000\u0000-.\u0005\u5fce\u0000\u0000./\u0005\u7c2c\u0000\u0000"+
		"/0\u0005\u7edb\u0000\u000001\u0005\u5909\u0000\u00001R\u0005\u7c2c\u0000"+
		"\u000023\u0005\u8000\u9356\u0000\u000034\u0005\u546d\u0000\u00004R\u0005"+
		"\u60c8\u0000\u000056\u0005\u6d93\u0000\u000067\u0005\u5d85\u0000\u0000"+
		"78\u0005\u5bd8\u0000\u000089\u0005\u8000\u935a\u0000\u00009R\u0005\u8000"+
		"\ufffd\u0000\u0000:;\u0005\u5bee\u0000\u0000;<\u0005\u8000\ufffd\u0000"+
		"\u0000<=\u0005\u6fb6\u0000\u0000=>\u0005\u5b58\u0000\u0000>R\u0005\u69f8"+
		"\u0000\u0000?@\u0005\u7f01\u0000\u0000@A\u0005\u64b3\u0000\u0000AB\u0005"+
		"\u71ac\u0000\u0000BC\u0005\u8000\u93c4\u0000\u0000CR\u0005\u8000\ufffd"+
		"\u0000\u0000DE\u0005\u5bee\u0000\u0000EF\u0005\u8000\ufffd\u0000\u0000"+
		"FG\u0005\u6fb6\u0000\u0000GH\u0005\u7fe0\u0000\u0000HI\u0005\u7b09\u0000"+
		"\u0000IJ\u0005\u8000\u93c4\u0000\u0000JR\u0005\u8000\ufffd\u0000\u0000"+
		"KL\u0005\u7f01\u0000\u0000LM\u0005\u64b3\u0000\u0000MN\u0005\u71ac\u0000"+
		"\u0000NO\u0005\u6d93\u0000\u0000OP\u0005\u5d86\u0000\u0000PR\u0005\u69f8"+
		"\u0000\u0000Q\u001d\u0001\u0000\u0000\u0000Q \u0001\u0000\u0000\u0000"+
		"Q#\u0001\u0000\u0000\u0000Q&\u0001\u0000\u0000\u0000Q,\u0001\u0000\u0000"+
		"\u0000Q2\u0001\u0000\u0000\u0000Q5\u0001\u0000\u0000\u0000Q:\u0001\u0000"+
		"\u0000\u0000Q?\u0001\u0000\u0000\u0000QD\u0001\u0000\u0000\u0000QK\u0001"+
		"\u0000\u0000\u0000R\n\u0001\u0000\u0000\u0000SW\u0007\u0000\u0000\u0000"+
		"TV\u0007\u0001\u0000\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000"+
		"\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X`\u0001\u0000"+
		"\u0000\u0000YW\u0001\u0000\u0000\u0000Z\\\u0007\u0002\u0000\u0000[Z\u0001"+
		"\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000"+
		"]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_S\u0001\u0000\u0000"+
		"\u0000_[\u0001\u0000\u0000\u0000`\f\u0001\u0000\u0000\u0000ac\u0007\u0003"+
		"\u0000\u0000ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000db\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000el\u0001\u0000\u0000\u0000"+
		"fh\u0005.\u0000\u0000gi\u0007\u0003\u0000\u0000hg\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000"+
		"\u0000km\u0001\u0000\u0000\u0000lf\u0001\u0000\u0000\u0000lm\u0001\u0000"+
		"\u0000\u0000m\u000e\u0001\u0000\u0000\u0000nr\u0005\'\u0000\u0000oq\b"+
		"\u0004\u0000\u0000po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000"+
		"rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000"+
		"\u0000tr\u0001\u0000\u0000\u0000uv\u0005\'\u0000\u0000v\u0010\u0001\u0000"+
		"\u0000\u0000wy\u0007\u0005\u0000\u0000xw\u0001\u0000\u0000\u0000yz\u0001"+
		"\u0000\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|}\u0006\b\u0000\u0000}\u0012\u0001\u0000\u0000"+
		"\u0000\n\u0000QW]_djlrz\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}