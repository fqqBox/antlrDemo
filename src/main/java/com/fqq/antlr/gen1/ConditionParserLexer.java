// Generated from C:/Users/xc/Desktop/workspace/poitest/src/main/java/com/szsh/antlr/ConditionParser.g4 by ANTLR 4.13.2
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
		T__0=1, T__1=2, OP=3, OR=4, AND=5, ID=6, NUMBER=7, STRING=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "OP", "OR", "AND", "ID", "NUMBER", "STRING", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "OP", "OR", "AND", "ID", "NUMBER", "STRING", "WS"
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
		"\u0004\u0000\t\u008b\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002L\b"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003R\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004X\b"+
		"\u0004\u0001\u0005\u0004\u0005[\b\u0005\u000b\u0005\f\u0005\\\u0001\u0006"+
		"\u0003\u0006`\b\u0006\u0001\u0006\u0004\u0006c\b\u0006\u000b\u0006\f\u0006"+
		"d\u0001\u0006\u0001\u0006\u0004\u0006i\b\u0006\u000b\u0006\f\u0006j\u0003"+
		"\u0006m\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005"+
		"\u0007s\b\u0007\n\u0007\f\u0007v\t\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0005\u0007}\b\u0007\n\u0007\f\u0007\u0080"+
		"\t\u0007\u0001\u0007\u0003\u0007\u0083\b\u0007\u0001\b\u0004\b\u0086\b"+
		"\b\u000b\b\f\b\u0087\u0001\b\u0001\b\u0000\u0000\t\u0001\u0001\u0003\u0002"+
		"\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0001"+
		"\u0000\u0005\u0004\u0000AZ__az\u4e00\u8000\u9fa5\u0001\u000009\u0003\u0000"+
		"\n\n\r\r\'\'\u0003\u0000\n\n\r\r\"\"\u0003\u0000\t\n\r\r  \u00a1\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0001\u0013\u0001\u0000\u0000\u0000\u0003\u0015"+
		"\u0001\u0000\u0000\u0000\u0005K\u0001\u0000\u0000\u0000\u0007Q\u0001\u0000"+
		"\u0000\u0000\tW\u0001\u0000\u0000\u0000\u000bZ\u0001\u0000\u0000\u0000"+
		"\r_\u0001\u0000\u0000\u0000\u000f\u0082\u0001\u0000\u0000\u0000\u0011"+
		"\u0085\u0001\u0000\u0000\u0000\u0013\u0014\u0005(\u0000\u0000\u0014\u0002"+
		"\u0001\u0000\u0000\u0000\u0015\u0016\u0005)\u0000\u0000\u0016\u0004\u0001"+
		"\u0000\u0000\u0000\u0017\u0018\u0005\u6fb6\u0000\u0000\u0018\u0019\u0005"+
		"\u0442\u0000\u0000\u0019\u001a\u0005\u7c2c\u0000\u0000\u001a\u001b\u0005"+
		"\u7edb\u0000\u0000\u001b\u001c\u0005\u5909\u0000\u0000\u001cL\u0005\u7c2c"+
		"\u0000\u0000\u001d\u001e\u0005\u704f\u0000\u0000\u001e\u001f\u0005\u5fce"+
		"\u0000\u0000\u001f \u0005\u7c2c\u0000\u0000 !\u0005\u7edb\u0000\u0000"+
		"!\"\u0005\u5909\u0000\u0000\"L\u0005\u7c2c\u0000\u0000#$\u0005\u5bee\u0000"+
		"\u0000$%\u0005\u8000\ufffd\u0000\u0000%&\u0005\u6fb6\u0000\u0000&\'\u0005"+
		"\u7fe0\u0000\u0000\'(\u0005\u7b09\u0000\u0000()\u0005\u8000\u93c4\u0000"+
		"\u0000)L\u0005\u8000\ufffd\u0000\u0000*+\u0005\u7f01\u0000\u0000+,\u0005"+
		"\u64b3\u0000\u0000,-\u0005\u71ac\u0000\u0000-.\u0005\u6d93\u0000\u0000"+
		"./\u0005\u5d86\u0000\u0000/L\u0005\u69f8\u0000\u000001\u0005\u6fb6\u0000"+
		"\u000012\u0005\u0442\u0000\u00002L\u0005\u7c2c\u0000\u000034\u0005\u704f"+
		"\u0000\u000045\u0005\u5fce\u0000\u00005L\u0005\u7c2c\u0000\u000067\u0005"+
		"\u7edb\u0000\u000078\u0005\u5909\u0000\u00008L\u0005\u7c2c\u0000\u0000"+
		"9:\u0005\u8000\u9356\u0000\u0000:;\u0005\u546d\u0000\u0000;L\u0005\u60c8"+
		"\u0000\u0000<=\u0005\u6d93\u0000\u0000=>\u0005\u5d85\u0000\u0000>?\u0005"+
		"\u5bd8\u0000\u0000?@\u0005\u8000\u935a\u0000\u0000@L\u0005\u8000\ufffd"+
		"\u0000\u0000AB\u0005\u5bee\u0000\u0000BC\u0005\u8000\ufffd\u0000\u0000"+
		"CD\u0005\u6fb6\u0000\u0000DE\u0005\u5b58\u0000\u0000EL\u0005\u69f8\u0000"+
		"\u0000FG\u0005\u7f01\u0000\u0000GH\u0005\u64b3\u0000\u0000HI\u0005\u71ac"+
		"\u0000\u0000IJ\u0005\u8000\u93c4\u0000\u0000JL\u0005\u8000\ufffd\u0000"+
		"\u0000K\u0017\u0001\u0000\u0000\u0000K\u001d\u0001\u0000\u0000\u0000K"+
		"#\u0001\u0000\u0000\u0000K*\u0001\u0000\u0000\u0000K0\u0001\u0000\u0000"+
		"\u0000K3\u0001\u0000\u0000\u0000K6\u0001\u0000\u0000\u0000K9\u0001\u0000"+
		"\u0000\u0000K<\u0001\u0000\u0000\u0000KA\u0001\u0000\u0000\u0000KF\u0001"+
		"\u0000\u0000\u0000L\u0006\u0001\u0000\u0000\u0000MN\u0005\u8000\u93b4"+
		"\u0000\u0000NR\u0005\u8000\ufffd\u0000\u0000OP\u0005|\u0000\u0000PR\u0005"+
		"|\u0000\u0000QM\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000R\b\u0001"+
		"\u0000\u0000\u0000ST\u0005\u6d93\u0000\u0000TX\u0005\u8000\ufffd\u0000"+
		"\u0000UV\u0005&\u0000\u0000VX\u0005&\u0000\u0000WS\u0001\u0000\u0000\u0000"+
		"WU\u0001\u0000\u0000\u0000X\n\u0001\u0000\u0000\u0000Y[\u0007\u0000\u0000"+
		"\u0000ZY\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\Z\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]\f\u0001\u0000\u0000\u0000^`\u0005"+
		"-\u0000\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`b\u0001"+
		"\u0000\u0000\u0000ac\u0007\u0001\u0000\u0000ba\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000"+
		"\u0000el\u0001\u0000\u0000\u0000fh\u0005.\u0000\u0000gi\u0007\u0001\u0000"+
		"\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jh\u0001\u0000"+
		"\u0000\u0000jk\u0001\u0000\u0000\u0000km\u0001\u0000\u0000\u0000lf\u0001"+
		"\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u000e\u0001\u0000\u0000"+
		"\u0000nt\u0005\'\u0000\u0000os\b\u0002\u0000\u0000pq\u0005\\\u0000\u0000"+
		"qs\u0005\'\u0000\u0000ro\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000"+
		"sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000"+
		"\u0000uw\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000w\u0083\u0005"+
		"\'\u0000\u0000x~\u0005\"\u0000\u0000y}\b\u0003\u0000\u0000z{\u0005\\\u0000"+
		"\u0000{}\u0005\"\u0000\u0000|y\u0001\u0000\u0000\u0000|z\u0001\u0000\u0000"+
		"\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f"+
		"\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001"+
		"\u0000\u0000\u0000\u0081\u0083\u0005\"\u0000\u0000\u0082n\u0001\u0000"+
		"\u0000\u0000\u0082x\u0001\u0000\u0000\u0000\u0083\u0010\u0001\u0000\u0000"+
		"\u0000\u0084\u0086\u0007\u0004\u0000\u0000\u0085\u0084\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000"+
		"\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0006\b\u0000\u0000\u008a\u0012\u0001\u0000\u0000\u0000"+
		"\u000f\u0000KQW\\_djlrt|~\u0082\u0087\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}