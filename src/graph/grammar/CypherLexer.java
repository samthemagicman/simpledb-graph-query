// Generated from .//Cypher.g4 by ANTLR 4.13.1
package graph.grammar;
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
		T__0=1, T__1=2, T__2=3, WS=4, LEFT_BRACKET=5, RIGHT_BRACKET=6, LEFT_BRACE=7, 
		RIGHT_BRACE=8, LEFT_PAREN=9, RIGHT_PAREN=10, MATCH=11, RETURN=12, CREATE=13, 
		PERIOD=14, COMMA=15, SEMICOLON=16, COLON=17, ID=18, QUOTE_STRING=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "WS", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_BRACE", 
			"RIGHT_BRACE", "LEFT_PAREN", "RIGHT_PAREN", "MATCH", "RETURN", "CREATE", 
			"PERIOD", "COMMA", "SEMICOLON", "COLON", "ID", "QUOTE_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'-'", "'[]'", null, "'['", "']'", "'{'", "'}'", "'('", 
			"')'", "'MATCH'", "'RETURN'", "'CREATE'", "'.'", "','", "';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "WS", "LEFT_BRACKET", "RIGHT_BRACKET", "LEFT_BRACE", 
			"RIGHT_BRACE", "LEFT_PAREN", "RIGHT_PAREN", "MATCH", "RETURN", "CREATE", 
			"PERIOD", "COMMA", "SEMICOLON", "COLON", "ID", "QUOTE_STRING"
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
		case 18:
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
		"\u0004\u0000\u0013n\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0004\u00030\b\u0003\u000b"+
		"\u0003\f\u00031\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0004\u0011_\b\u0011\u000b\u0011\f\u0011`\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012g\b\u0012\n\u0012"+
		"\f\u0012j\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0000\u0000\u0013"+
		"\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r"+
		"\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\u0001\u0000\u0003\u0003"+
		"\u0000\t\n\r\r  \u0002\u0000AZaz\u0003\u0000\n\n\r\r\"\"q\u0000\u0001"+
		"\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005"+
		"\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001"+
		"\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000"+
		"\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000"+
		"\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000"+
		"\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000"+
		"\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000"+
		"\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000"+
		"\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0001"+
		"\'\u0001\u0000\u0000\u0000\u0003)\u0001\u0000\u0000\u0000\u0005+\u0001"+
		"\u0000\u0000\u0000\u0007/\u0001\u0000\u0000\u0000\t5\u0001\u0000\u0000"+
		"\u0000\u000b7\u0001\u0000\u0000\u0000\r9\u0001\u0000\u0000\u0000\u000f"+
		";\u0001\u0000\u0000\u0000\u0011=\u0001\u0000\u0000\u0000\u0013?\u0001"+
		"\u0000\u0000\u0000\u0015A\u0001\u0000\u0000\u0000\u0017G\u0001\u0000\u0000"+
		"\u0000\u0019N\u0001\u0000\u0000\u0000\u001bU\u0001\u0000\u0000\u0000\u001d"+
		"W\u0001\u0000\u0000\u0000\u001fY\u0001\u0000\u0000\u0000![\u0001\u0000"+
		"\u0000\u0000#^\u0001\u0000\u0000\u0000%b\u0001\u0000\u0000\u0000\'(\u0005"+
		"*\u0000\u0000(\u0002\u0001\u0000\u0000\u0000)*\u0005-\u0000\u0000*\u0004"+
		"\u0001\u0000\u0000\u0000+,\u0005[\u0000\u0000,-\u0005]\u0000\u0000-\u0006"+
		"\u0001\u0000\u0000\u0000.0\u0007\u0000\u0000\u0000/.\u0001\u0000\u0000"+
		"\u000001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000012\u0001\u0000"+
		"\u0000\u000023\u0001\u0000\u0000\u000034\u0006\u0003\u0000\u00004\b\u0001"+
		"\u0000\u0000\u000056\u0005[\u0000\u00006\n\u0001\u0000\u0000\u000078\u0005"+
		"]\u0000\u00008\f\u0001\u0000\u0000\u00009:\u0005{\u0000\u0000:\u000e\u0001"+
		"\u0000\u0000\u0000;<\u0005}\u0000\u0000<\u0010\u0001\u0000\u0000\u0000"+
		"=>\u0005(\u0000\u0000>\u0012\u0001\u0000\u0000\u0000?@\u0005)\u0000\u0000"+
		"@\u0014\u0001\u0000\u0000\u0000AB\u0005M\u0000\u0000BC\u0005A\u0000\u0000"+
		"CD\u0005T\u0000\u0000DE\u0005C\u0000\u0000EF\u0005H\u0000\u0000F\u0016"+
		"\u0001\u0000\u0000\u0000GH\u0005R\u0000\u0000HI\u0005E\u0000\u0000IJ\u0005"+
		"T\u0000\u0000JK\u0005U\u0000\u0000KL\u0005R\u0000\u0000LM\u0005N\u0000"+
		"\u0000M\u0018\u0001\u0000\u0000\u0000NO\u0005C\u0000\u0000OP\u0005R\u0000"+
		"\u0000PQ\u0005E\u0000\u0000QR\u0005A\u0000\u0000RS\u0005T\u0000\u0000"+
		"ST\u0005E\u0000\u0000T\u001a\u0001\u0000\u0000\u0000UV\u0005.\u0000\u0000"+
		"V\u001c\u0001\u0000\u0000\u0000WX\u0005,\u0000\u0000X\u001e\u0001\u0000"+
		"\u0000\u0000YZ\u0005;\u0000\u0000Z \u0001\u0000\u0000\u0000[\\\u0005:"+
		"\u0000\u0000\\\"\u0001\u0000\u0000\u0000]_\u0007\u0001\u0000\u0000^]\u0001"+
		"\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000a$\u0001\u0000\u0000\u0000bh\u0005\"\u0000\u0000"+
		"cg\b\u0002\u0000\u0000de\u0005\"\u0000\u0000eg\u0005\"\u0000\u0000fc\u0001"+
		"\u0000\u0000\u0000fd\u0001\u0000\u0000\u0000gj\u0001\u0000\u0000\u0000"+
		"hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000ik\u0001\u0000\u0000"+
		"\u0000jh\u0001\u0000\u0000\u0000kl\u0005\"\u0000\u0000lm\u0006\u0012\u0001"+
		"\u0000m&\u0001\u0000\u0000\u0000\u0005\u00001`fh\u0002\u0006\u0000\u0000"+
		"\u0001\u0012\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}