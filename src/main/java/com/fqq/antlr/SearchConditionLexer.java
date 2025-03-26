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
			null, null, "'\\u6D93\\uFFFD'", "'\\u93B4\\uFFFD'", "'('", "')'"
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
		"\u0004\u0000\t\u0080\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
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
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0005\u0005V\b\u0005\n\u0005\f\u0005Y\t"+
		"\u0005\u0001\u0006\u0001\u0006\u0005\u0006]\b\u0006\n\u0006\f\u0006`\t"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006e\b\u0006\n\u0006"+
		"\f\u0006h\t\u0006\u0001\u0006\u0003\u0006k\b\u0006\u0001\u0007\u0004\u0007"+
		"n\b\u0007\u000b\u0007\f\u0007o\u0001\u0007\u0001\u0007\u0004\u0007t\b"+
		"\u0007\u000b\u0007\f\u0007u\u0003\u0007x\b\u0007\u0001\b\u0004\b{\b\b"+
		"\u000b\b\f\b|\u0001\b\u0001\b\u0000\u0000\t\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0001\u0000"+
		"\u0006\u0004\u0000AZ__az\u4e00\u8000\u9fa5\u0005\u000009AZ__az\u4e00\u8000"+
		"\u9fa5\u0001\u0000\"\"\u0001\u0000\'\'\u0001\u000009\u0003\u0000\t\n\r"+
		"\r  \u0091\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0001G\u0001\u0000\u0000\u0000\u0003"+
		"I\u0001\u0000\u0000\u0000\u0005L\u0001\u0000\u0000\u0000\u0007O\u0001"+
		"\u0000\u0000\u0000\tQ\u0001\u0000\u0000\u0000\u000bS\u0001\u0000\u0000"+
		"\u0000\rj\u0001\u0000\u0000\u0000\u000fm\u0001\u0000\u0000\u0000\u0011"+
		"z\u0001\u0000\u0000\u0000\u0013\u0014\u0005\u6fb6\u0000\u0000\u0014\u0015"+
		"\u0005\u0442\u0000\u0000\u0015H\u0005\u7c2c\u0000\u0000\u0016\u0017\u0005"+
		"\u704f\u0000\u0000\u0017\u0018\u0005\u5fce\u0000\u0000\u0018H\u0005\u7c2c"+
		"\u0000\u0000\u0019\u001a\u0005\u7edb\u0000\u0000\u001a\u001b\u0005\u5909"+
		"\u0000\u0000\u001bH\u0005\u7c2c\u0000\u0000\u001c\u001d\u0005\u8000\u9356"+
		"\u0000\u0000\u001d\u001e\u0005\u546d\u0000\u0000\u001eH\u0005\u60c8\u0000"+
		"\u0000\u001f \u0005\u6d93\u0000\u0000 !\u0005\u5d85\u0000\u0000!\"\u0005"+
		"\u5bd8\u0000\u0000\"#\u0005\u8000\u935a\u0000\u0000#H\u0005\u8000\ufffd"+
		"\u0000\u0000$%\u0005\u5bee\u0000\u0000%&\u0005\u8000\ufffd\u0000\u0000"+
		"&\'\u0005\u6fb6\u0000\u0000\'(\u0005\u5b58\u0000\u0000(H\u0005\u69f8\u0000"+
		"\u0000)*\u0005\u5bee\u0000\u0000*+\u0005\u8000\ufffd\u0000\u0000+,\u0005"+
		"\u6fb6\u0000\u0000,-\u0005\u7fe0\u0000\u0000-.\u0005\u7b09\u0000\u0000"+
		"./\u0005\u8000\u93c4\u0000\u0000/H\u0005\u8000\ufffd\u0000\u000001\u0005"+
		"\u7f01\u0000\u000012\u0005\u64b3\u0000\u000023\u0005\u71ac\u0000\u0000"+
		"34\u0005\u8000\u93c4\u0000\u00004H\u0005\u8000\ufffd\u0000\u000056\u0005"+
		"\u7f01\u0000\u000067\u0005\u64b3\u0000\u000078\u0005\u71ac\u0000\u0000"+
		"89\u0005\u6d93\u0000\u00009:\u0005\u5d86\u0000\u0000:H\u0005\u69f8\u0000"+
		"\u0000;<\u0005\u6fb6\u0000\u0000<=\u0005\u0442\u0000\u0000=>\u0005\u7c2c"+
		"\u0000\u0000>?\u0005\u7edb\u0000\u0000?@\u0005\u5909\u0000\u0000@H\u0005"+
		"\u7c2c\u0000\u0000AB\u0005\u704f\u0000\u0000BC\u0005\u5fce\u0000\u0000"+
		"CD\u0005\u7c2c\u0000\u0000DE\u0005\u7edb\u0000\u0000EF\u0005\u5909\u0000"+
		"\u0000FH\u0005\u7c2c\u0000\u0000G\u0013\u0001\u0000\u0000\u0000G\u0016"+
		"\u0001\u0000\u0000\u0000G\u0019\u0001\u0000\u0000\u0000G\u001c\u0001\u0000"+
		"\u0000\u0000G\u001f\u0001\u0000\u0000\u0000G$\u0001\u0000\u0000\u0000"+
		"G)\u0001\u0000\u0000\u0000G0\u0001\u0000\u0000\u0000G5\u0001\u0000\u0000"+
		"\u0000G;\u0001\u0000\u0000\u0000GA\u0001\u0000\u0000\u0000H\u0002\u0001"+
		"\u0000\u0000\u0000IJ\u0005\u6d93\u0000\u0000JK\u0005\u8000\ufffd\u0000"+
		"\u0000K\u0004\u0001\u0000\u0000\u0000LM\u0005\u8000\u93b4\u0000\u0000"+
		"MN\u0005\u8000\ufffd\u0000\u0000N\u0006\u0001\u0000\u0000\u0000OP\u0005"+
		"(\u0000\u0000P\b\u0001\u0000\u0000\u0000QR\u0005)\u0000\u0000R\n\u0001"+
		"\u0000\u0000\u0000SW\u0007\u0000\u0000\u0000TV\u0007\u0001\u0000\u0000"+
		"UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000"+
		"\u0000WX\u0001\u0000\u0000\u0000X\f\u0001\u0000\u0000\u0000YW\u0001\u0000"+
		"\u0000\u0000Z^\u0005\"\u0000\u0000[]\b\u0002\u0000\u0000\\[\u0001\u0000"+
		"\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^_\u0001"+
		"\u0000\u0000\u0000_a\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"ak\u0005\"\u0000\u0000bf\u0005\'\u0000\u0000ce\b\u0003\u0000\u0000dc\u0001"+
		"\u0000\u0000\u0000eh\u0001\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000"+
		"fg\u0001\u0000\u0000\u0000gi\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000"+
		"\u0000ik\u0005\'\u0000\u0000jZ\u0001\u0000\u0000\u0000jb\u0001\u0000\u0000"+
		"\u0000k\u000e\u0001\u0000\u0000\u0000ln\u0007\u0004\u0000\u0000ml\u0001"+
		"\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000pw\u0001\u0000\u0000\u0000qs\u0005.\u0000\u0000"+
		"rt\u0007\u0004\u0000\u0000sr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000"+
		"\u0000\u0000wq\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000x\u0010"+
		"\u0001\u0000\u0000\u0000y{\u0007\u0005\u0000\u0000zy\u0001\u0000\u0000"+
		"\u0000{|\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}~\u0001\u0000\u0000\u0000~\u007f\u0006\b\u0000\u0000\u007f"+
		"\u0012\u0001\u0000\u0000\u0000\n\u0000GW^fjouw|\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}