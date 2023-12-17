// Generated from c:/Users/Samuel/Documents/GitHub/simpledb-graph-query/grammar/Cypher.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CypherLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WS=6, LEFT_BRACKET=7, RIGHT_BRACKET=8, 
		LEFT_BRACE=9, RIGHT_BRACE=10, LEFT_PAREN=11, RIGHT_PAREN=12, MATCH=13, 
		RETURN=14, CREATE=15, PERIOD=16, COMMA=17, SEMICOLON=18, COLON=19, ID=20, 
		QUOTE_STRING=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "WS", "LEFT_BRACKET", "RIGHT_BRACKET", 
			"LEFT_BRACE", "RIGHT_BRACE", "LEFT_PAREN", "RIGHT_PAREN", "MATCH", "RETURN", 
			"CREATE", "PERIOD", "COMMA", "SEMICOLON", "COLON", "ID", "QUOTE_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'->'", "'<-'", "'*'", "'[]'", null, "'['", "']'", "'{'", 
			"'}'", "'('", "')'", "'MATCH'", "'RETURN'", "'CREATE'", "'.'", "','", 
			"';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "WS", "LEFT_BRACKET", "RIGHT_BRACKET", 
			"LEFT_BRACE", "RIGHT_BRACE", "LEFT_PAREN", "RIGHT_PAREN", "MATCH", "RETURN", 
			"CREATE", "PERIOD", "COMMA", "SEMICOLON", "COLON", "ID", "QUOTE_STRING"
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


	public CypherLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cypher.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 20:
			QUOTE_STRING_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void QUOTE_STRING_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:

			     // Strip the quotes
			     String s = getText();
			     s = s.substring(1, s.length() - 1);
			     setText(s);
			   
			break;
		}
	}

	public static final String _serializedATN =
		"\u0004\u0000\u0015x\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0004\u0005:\b\u0005\u000b\u0005\f\u0005;\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0004"+
		"\u0013i\b\u0013\u000b\u0013\f\u0013j\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0005\u0014q\b\u0014\n\u0014\f\u0014t\t\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0000\u0000\u0015\u0001\u0001\u0003\u0002\u0005"+
		"\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n"+
		"\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011"+
		"#\u0012%\u0013\'\u0014)\u0015\u0001\u0000\u0003\u0003\u0000\t\n\r\r  "+
		"\u0004\u000009AZ__az\u0003\u0000\n\n\r\r\"\"{\u0000\u0001\u0001\u0000"+
		"\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000"+
		"\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000"+
		"\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000"+
		"\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000"+
		"\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000"+
		"\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000"+
		"\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000"+
		"\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000"+
		"#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001"+
		"\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0001+\u0001\u0000\u0000"+
		"\u0000\u0003-\u0001\u0000\u0000\u0000\u00050\u0001\u0000\u0000\u0000\u0007"+
		"3\u0001\u0000\u0000\u0000\t5\u0001\u0000\u0000\u0000\u000b9\u0001\u0000"+
		"\u0000\u0000\r?\u0001\u0000\u0000\u0000\u000fA\u0001\u0000\u0000\u0000"+
		"\u0011C\u0001\u0000\u0000\u0000\u0013E\u0001\u0000\u0000\u0000\u0015G"+
		"\u0001\u0000\u0000\u0000\u0017I\u0001\u0000\u0000\u0000\u0019K\u0001\u0000"+
		"\u0000\u0000\u001bQ\u0001\u0000\u0000\u0000\u001dX\u0001\u0000\u0000\u0000"+
		"\u001f_\u0001\u0000\u0000\u0000!a\u0001\u0000\u0000\u0000#c\u0001\u0000"+
		"\u0000\u0000%e\u0001\u0000\u0000\u0000\'h\u0001\u0000\u0000\u0000)l\u0001"+
		"\u0000\u0000\u0000+,\u0005-\u0000\u0000,\u0002\u0001\u0000\u0000\u0000"+
		"-.\u0005-\u0000\u0000./\u0005>\u0000\u0000/\u0004\u0001\u0000\u0000\u0000"+
		"01\u0005<\u0000\u000012\u0005-\u0000\u00002\u0006\u0001\u0000\u0000\u0000"+
		"34\u0005*\u0000\u00004\b\u0001\u0000\u0000\u000056\u0005[\u0000\u0000"+
		"67\u0005]\u0000\u00007\n\u0001\u0000\u0000\u00008:\u0007\u0000\u0000\u0000"+
		"98\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000"+
		"\u0000;<\u0001\u0000\u0000\u0000<=\u0001\u0000\u0000\u0000=>\u0006\u0005"+
		"\u0000\u0000>\f\u0001\u0000\u0000\u0000?@\u0005[\u0000\u0000@\u000e\u0001"+
		"\u0000\u0000\u0000AB\u0005]\u0000\u0000B\u0010\u0001\u0000\u0000\u0000"+
		"CD\u0005{\u0000\u0000D\u0012\u0001\u0000\u0000\u0000EF\u0005}\u0000\u0000"+
		"F\u0014\u0001\u0000\u0000\u0000GH\u0005(\u0000\u0000H\u0016\u0001\u0000"+
		"\u0000\u0000IJ\u0005)\u0000\u0000J\u0018\u0001\u0000\u0000\u0000KL\u0005"+
		"M\u0000\u0000LM\u0005A\u0000\u0000MN\u0005T\u0000\u0000NO\u0005C\u0000"+
		"\u0000OP\u0005H\u0000\u0000P\u001a\u0001\u0000\u0000\u0000QR\u0005R\u0000"+
		"\u0000RS\u0005E\u0000\u0000ST\u0005T\u0000\u0000TU\u0005U\u0000\u0000"+
		"UV\u0005R\u0000\u0000VW\u0005N\u0000\u0000W\u001c\u0001\u0000\u0000\u0000"+
		"XY\u0005C\u0000\u0000YZ\u0005R\u0000\u0000Z[\u0005E\u0000\u0000[\\\u0005"+
		"A\u0000\u0000\\]\u0005T\u0000\u0000]^\u0005E\u0000\u0000^\u001e\u0001"+
		"\u0000\u0000\u0000_`\u0005.\u0000\u0000` \u0001\u0000\u0000\u0000ab\u0005"+
		",\u0000\u0000b\"\u0001\u0000\u0000\u0000cd\u0005;\u0000\u0000d$\u0001"+
		"\u0000\u0000\u0000ef\u0005:\u0000\u0000f&\u0001\u0000\u0000\u0000gi\u0007"+
		"\u0001\u0000\u0000hg\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000"+
		"jh\u0001\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000k(\u0001\u0000\u0000"+
		"\u0000lr\u0005\"\u0000\u0000mq\b\u0002\u0000\u0000no\u0005\"\u0000\u0000"+
		"oq\u0005\"\u0000\u0000pm\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000"+
		"\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000uv\u0005\"\u0000"+
		"\u0000vw\u0006\u0014\u0001\u0000w*\u0001\u0000\u0000\u0000\u0005\u0000"+
		";jpr\u0002\u0006\u0000\u0000\u0001\u0014\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}