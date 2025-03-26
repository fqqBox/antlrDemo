// Generated from C:/Users/xc/Desktop/workspace/antlrDemo/src/main/java/com/fqq/antlr/SearchCondition.g4 by ANTLR 4.13.2
package com.fqq.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SearchConditionLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OPERATOR=1, AND=2, OR=3, LPAREN=4, RPAREN=5, IDENTIFIER=6, STRING=7, NUMBER=8, 
		WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"OPERATOR", "AND", "OR", "LPAREN", "RPAREN", "IDENTIFIER", "STRING", 
			"NUMBER", "WS"
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


	public SearchConditionLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SearchCondition.g4"; }

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
		"\u0004\u0000\t\u0081\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000H\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0005\u0005W\b\u0005\n\u0005"+
		"\f\u0005Z\t\u0005\u0001\u0006\u0001\u0006\u0005\u0006^\b\u0006\n\u0006"+
		"\f\u0006a\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006f\b\u0006"+
		"\n\u0006\f\u0006i\t\u0006\u0001\u0006\u0003\u0006l\b\u0006\u0001\u0007"+
		"\u0004\u0007o\b\u0007\u000b\u0007\f\u0007p\u0001\u0007\u0001\u0007\u0004"+
		"\u0007u\b\u0007\u000b\u0007\f\u0007v\u0003\u0007y\b\u0007\u0001\b\u0004"+
		"\b|\b\b\u000b\b\f\b}\u0001\b\u0001\b\u0000\u0000\t\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0001"+
		"\u0000\u0006\u0003\u0000AZ__az\u0004\u000009AZ__az\u0001\u0000\"\"\u0001"+
		"\u0000\'\'\u0001\u000009\u0003\u0000\t\n\r\r  \u0092\u0000\u0001\u0001"+
		"\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001"+
		"\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000"+
		"\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000"+
		"\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000"+
		"\u0000\u0001G\u0001\u0000\u0000\u0000\u0003I\u0001\u0000\u0000\u0000\u0005"+
		"M\u0001\u0000\u0000\u0000\u0007P\u0001\u0000\u0000\u0000\tR\u0001\u0000"+
		"\u0000\u0000\u000bT\u0001\u0000\u0000\u0000\rk\u0001\u0000\u0000\u0000"+
		"\u000fn\u0001\u0000\u0000\u0000\u0011{\u0001\u0000\u0000\u0000\u0013\u0014"+
		"\u0005\u6fb6\u0000\u0000\u0014\u0015\u0005\u0442\u0000\u0000\u0015H\u0005"+
		"\u7c2c\u0000\u0000\u0016\u0017\u0005\u704f\u0000\u0000\u0017\u0018\u0005"+
		"\u5fce\u0000\u0000\u0018H\u0005\u7c2c\u0000\u0000\u0019\u001a\u0005\u7edb"+
		"\u0000\u0000\u001a\u001b\u0005\u5909\u0000\u0000\u001bH\u0005\u7c2c\u0000"+
		"\u0000\u001c\u001d\u0005\u8000\u9356\u0000\u0000\u001d\u001e\u0005\u546d"+
		"\u0000\u0000\u001eH\u0005\u60c8\u0000\u0000\u001f \u0005\u6d93\u0000\u0000"+
		" !\u0005\u5d85\u0000\u0000!\"\u0005\u5bd8\u0000\u0000\"#\u0005\u8000\u935a"+
		"\u0000\u0000#H\u0005\u8000\ufffd\u0000\u0000$%\u0005\u5bee\u0000\u0000"+
		"%&\u0005\u8000\ufffd\u0000\u0000&\'\u0005\u6fb6\u0000\u0000\'(\u0005\u5b58"+
		"\u0000\u0000(H\u0005\u69f8\u0000\u0000)*\u0005\u5bee\u0000\u0000*+\u0005"+
		"\u8000\ufffd\u0000\u0000+,\u0005\u6fb6\u0000\u0000,-\u0005\u7fe0\u0000"+
		"\u0000-.\u0005\u7b09\u0000\u0000./\u0005\u8000\u93c4\u0000\u0000/H\u0005"+
		"\u8000\ufffd\u0000\u000001\u0005\u7f01\u0000\u000012\u0005\u64b3\u0000"+
		"\u000023\u0005\u71ac\u0000\u000034\u0005\u8000\u93c4\u0000\u00004H\u0005"+
		"\u8000\ufffd\u0000\u000056\u0005\u7f01\u0000\u000067\u0005\u64b3\u0000"+
		"\u000078\u0005\u71ac\u0000\u000089\u0005\u6d93\u0000\u00009:\u0005\u5d86"+
		"\u0000\u0000:H\u0005\u69f8\u0000\u0000;<\u0005\u6fb6\u0000\u0000<=\u0005"+
		"\u0442\u0000\u0000=>\u0005\u7c2c\u0000\u0000>?\u0005\u7edb\u0000\u0000"+
		"?@\u0005\u5909\u0000\u0000@H\u0005\u7c2c\u0000\u0000AB\u0005\u704f\u0000"+
		"\u0000BC\u0005\u5fce\u0000\u0000CD\u0005\u7c2c\u0000\u0000DE\u0005\u7edb"+
		"\u0000\u0000EF\u0005\u5909\u0000\u0000FH\u0005\u7c2c\u0000\u0000G\u0013"+
		"\u0001\u0000\u0000\u0000G\u0016\u0001\u0000\u0000\u0000G\u0019\u0001\u0000"+
		"\u0000\u0000G\u001c\u0001\u0000\u0000\u0000G\u001f\u0001\u0000\u0000\u0000"+
		"G$\u0001\u0000\u0000\u0000G)\u0001\u0000\u0000\u0000G0\u0001\u0000\u0000"+
		"\u0000G5\u0001\u0000\u0000\u0000G;\u0001\u0000\u0000\u0000GA\u0001\u0000"+
		"\u0000\u0000H\u0002\u0001\u0000\u0000\u0000IJ\u0005\u8000\u9a9e\u0000"+
		"\u0000JK\u0005\u6735\u0000\u0000KL\u0005\u7b16\u0000\u0000L\u0004\u0001"+
		"\u0000\u0000\u0000MN\u0005\u8000\u93b4\u0000\u0000NO\u0005\u8000\ufffd"+
		"\u0000\u0000O\u0006\u0001\u0000\u0000\u0000PQ\u0005(\u0000\u0000Q\b\u0001"+
		"\u0000\u0000\u0000RS\u0005)\u0000\u0000S\n\u0001\u0000\u0000\u0000TX\u0007"+
		"\u0000\u0000\u0000UW\u0007\u0001\u0000\u0000VU\u0001\u0000\u0000\u0000"+
		"WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000XY\u0001\u0000\u0000"+
		"\u0000Y\f\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000[_\u0005\""+
		"\u0000\u0000\\^\b\u0002\u0000\u0000]\\\u0001\u0000\u0000\u0000^a\u0001"+
		"\u0000\u0000\u0000_]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000"+
		"`b\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000bl\u0005\"\u0000\u0000"+
		"cg\u0005\'\u0000\u0000df\b\u0003\u0000\u0000ed\u0001\u0000\u0000\u0000"+
		"fi\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000"+
		"\u0000hj\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jl\u0005\'\u0000"+
		"\u0000k[\u0001\u0000\u0000\u0000kc\u0001\u0000\u0000\u0000l\u000e\u0001"+
		"\u0000\u0000\u0000mo\u0007\u0004\u0000\u0000nm\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000"+
		"\u0000qx\u0001\u0000\u0000\u0000rt\u0005.\u0000\u0000su\u0007\u0004\u0000"+
		"\u0000ts\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000"+
		"\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xr\u0001"+
		"\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y\u0010\u0001\u0000\u0000"+
		"\u0000z|\u0007\u0005\u0000\u0000{z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0080\u0006\b\u0000\u0000\u0080\u0012\u0001"+
		"\u0000\u0000\u0000\n\u0000GX_gkpvx}\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}