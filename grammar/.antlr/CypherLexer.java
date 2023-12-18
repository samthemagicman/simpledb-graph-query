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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, WS=7, LEFT_BRACKET=8, 
		RIGHT_BRACKET=9, LEFT_BRACE=10, RIGHT_BRACE=11, LEFT_PAREN=12, RIGHT_PAREN=13, 
		MATCH=14, RETURN=15, CREATE=16, PERIOD=17, COMMA=18, SEMICOLON=19, COLON=20, 
		ID=21, QUOTE_STRING=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "WS", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_PAREN", "RIGHT_PAREN", 
			"MATCH", "RETURN", "CREATE", "PERIOD", "COMMA", "SEMICOLON", "COLON", 
			"ID", "QUOTE_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'->'", "'<-'", "'*'", "'--'", "'[]'", null, "'['", "']'", 
			"'{'", "'}'", "'('", "')'", "'MATCH'", "'RETURN'", "'CREATE'", "'.'", 
			"','", "';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "WS", "LEFT_BRACKET", "RIGHT_BRACKET", 
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
		case 21:
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
		"\u0004\u0000\u0016}\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0004\u0006?\b\u0006\u000b\u0006\f\u0006@\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0014\u0004\u0014n\b\u0014\u000b\u0014\f\u0014o\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015v\b\u0015\n\u0015\f\u0015y\t\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016\u0001\u0000\u0003\u0003\u0000"+
		"\t\n\r\r  \u0004\u000009AZ__az\u0003\u0000\n\n\r\r\"\"\u0080\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000"+
		"\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001"+
		"\u0000\u0000\u0000\u0001-\u0001\u0000\u0000\u0000\u0003/\u0001\u0000\u0000"+
		"\u0000\u00052\u0001\u0000\u0000\u0000\u00075\u0001\u0000\u0000\u0000\t"+
		"7\u0001\u0000\u0000\u0000\u000b:\u0001\u0000\u0000\u0000\r>\u0001\u0000"+
		"\u0000\u0000\u000fD\u0001\u0000\u0000\u0000\u0011F\u0001\u0000\u0000\u0000"+
		"\u0013H\u0001\u0000\u0000\u0000\u0015J\u0001\u0000\u0000\u0000\u0017L"+
		"\u0001\u0000\u0000\u0000\u0019N\u0001\u0000\u0000\u0000\u001bP\u0001\u0000"+
		"\u0000\u0000\u001dV\u0001\u0000\u0000\u0000\u001f]\u0001\u0000\u0000\u0000"+
		"!d\u0001\u0000\u0000\u0000#f\u0001\u0000\u0000\u0000%h\u0001\u0000\u0000"+
		"\u0000\'j\u0001\u0000\u0000\u0000)m\u0001\u0000\u0000\u0000+q\u0001\u0000"+
		"\u0000\u0000-.\u0005-\u0000\u0000.\u0002\u0001\u0000\u0000\u0000/0\u0005"+
		"-\u0000\u000001\u0005>\u0000\u00001\u0004\u0001\u0000\u0000\u000023\u0005"+
		"<\u0000\u000034\u0005-\u0000\u00004\u0006\u0001\u0000\u0000\u000056\u0005"+
		"*\u0000\u00006\b\u0001\u0000\u0000\u000078\u0005-\u0000\u000089\u0005"+
		"-\u0000\u00009\n\u0001\u0000\u0000\u0000:;\u0005[\u0000\u0000;<\u0005"+
		"]\u0000\u0000<\f\u0001\u0000\u0000\u0000=?\u0007\u0000\u0000\u0000>=\u0001"+
		"\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000"+
		"@A\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000\u0000BC\u0006\u0006\u0000"+
		"\u0000C\u000e\u0001\u0000\u0000\u0000DE\u0005[\u0000\u0000E\u0010\u0001"+
		"\u0000\u0000\u0000FG\u0005]\u0000\u0000G\u0012\u0001\u0000\u0000\u0000"+
		"HI\u0005{\u0000\u0000I\u0014\u0001\u0000\u0000\u0000JK\u0005}\u0000\u0000"+
		"K\u0016\u0001\u0000\u0000\u0000LM\u0005(\u0000\u0000M\u0018\u0001\u0000"+
		"\u0000\u0000NO\u0005)\u0000\u0000O\u001a\u0001\u0000\u0000\u0000PQ\u0005"+
		"M\u0000\u0000QR\u0005A\u0000\u0000RS\u0005T\u0000\u0000ST\u0005C\u0000"+
		"\u0000TU\u0005H\u0000\u0000U\u001c\u0001\u0000\u0000\u0000VW\u0005R\u0000"+
		"\u0000WX\u0005E\u0000\u0000XY\u0005T\u0000\u0000YZ\u0005U\u0000\u0000"+
		"Z[\u0005R\u0000\u0000[\\\u0005N\u0000\u0000\\\u001e\u0001\u0000\u0000"+
		"\u0000]^\u0005C\u0000\u0000^_\u0005R\u0000\u0000_`\u0005E\u0000\u0000"+
		"`a\u0005A\u0000\u0000ab\u0005T\u0000\u0000bc\u0005E\u0000\u0000c \u0001"+
		"\u0000\u0000\u0000de\u0005.\u0000\u0000e\"\u0001\u0000\u0000\u0000fg\u0005"+
		",\u0000\u0000g$\u0001\u0000\u0000\u0000hi\u0005;\u0000\u0000i&\u0001\u0000"+
		"\u0000\u0000jk\u0005:\u0000\u0000k(\u0001\u0000\u0000\u0000ln\u0007\u0001"+
		"\u0000\u0000ml\u0001\u0000\u0000\u0000no\u0001\u0000\u0000\u0000om\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000p*\u0001\u0000\u0000\u0000"+
		"qw\u0005\"\u0000\u0000rv\b\u0002\u0000\u0000st\u0005\"\u0000\u0000tv\u0005"+
		"\"\u0000\u0000ur\u0001\u0000\u0000\u0000us\u0001\u0000\u0000\u0000vy\u0001"+
		"\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xz\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000z{\u0005\"\u0000\u0000"+
		"{|\u0006\u0015\u0001\u0000|,\u0001\u0000\u0000\u0000\u0005\u0000@ouw\u0002"+
		"\u0006\u0000\u0000\u0001\u0015\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}