// Generated from ./Cypher.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, WS=8, LEFT_BRACKET=9, 
		RIGHT_BRACKET=10, LEFT_BRACE=11, RIGHT_BRACE=12, LEFT_PAREN=13, RIGHT_PAREN=14, 
		MATCH=15, RETURN=16, CREATE=17, PERIOD=18, COMMA=19, SEMICOLON=20, COLON=21, 
		ID=22, QUOTE_STRING=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "WS", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_PAREN", "RIGHT_PAREN", 
			"MATCH", "RETURN", "CREATE", "PERIOD", "COMMA", "SEMICOLON", "COLON", 
			"ID", "QUOTE_STRING"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'-'", "'->'", "'<-'", "'DELETE'", "'*'", "'--'", "'[]'", null, 
			"'['", "']'", "'{'", "'}'", "'('", "')'", "'MATCH'", "'RETURN'", "'CREATE'", 
			"'.'", "','", "';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "WS", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "LEFT_BRACE", "RIGHT_BRACE", "LEFT_PAREN", "RIGHT_PAREN", 
			"MATCH", "RETURN", "CREATE", "PERIOD", "COMMA", "SEMICOLON", "COLON", 
			"ID", "QUOTE_STRING"
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
		case 22:
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
		"\u0004\u0000\u0017\u0086\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0004\u0007H\b\u0007"+
		"\u000b\u0007\f\u0007I\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0004\u0015w\b\u0015\u000b\u0015\f\u0015x\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u007f\b\u0016\n\u0016\f\u0016\u0082\t\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0000\u0000\u0017\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000\u0003\u0003"+
		"\u0000\t\n\r\r  \u0004\u000009AZ__az\u0003\u0000\n\n\r\r\"\"\u0089\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%\u0001\u0000\u0000"+
		"\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001\u0000\u0000\u0000"+
		"\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000\u0000\u0001/"+
		"\u0001\u0000\u0000\u0000\u00031\u0001\u0000\u0000\u0000\u00054\u0001\u0000"+
		"\u0000\u0000\u00077\u0001\u0000\u0000\u0000\t>\u0001\u0000\u0000\u0000"+
		"\u000b@\u0001\u0000\u0000\u0000\rC\u0001\u0000\u0000\u0000\u000fG\u0001"+
		"\u0000\u0000\u0000\u0011M\u0001\u0000\u0000\u0000\u0013O\u0001\u0000\u0000"+
		"\u0000\u0015Q\u0001\u0000\u0000\u0000\u0017S\u0001\u0000\u0000\u0000\u0019"+
		"U\u0001\u0000\u0000\u0000\u001bW\u0001\u0000\u0000\u0000\u001dY\u0001"+
		"\u0000\u0000\u0000\u001f_\u0001\u0000\u0000\u0000!f\u0001\u0000\u0000"+
		"\u0000#m\u0001\u0000\u0000\u0000%o\u0001\u0000\u0000\u0000\'q\u0001\u0000"+
		"\u0000\u0000)s\u0001\u0000\u0000\u0000+v\u0001\u0000\u0000\u0000-z\u0001"+
		"\u0000\u0000\u0000/0\u0005-\u0000\u00000\u0002\u0001\u0000\u0000\u0000"+
		"12\u0005-\u0000\u000023\u0005>\u0000\u00003\u0004\u0001\u0000\u0000\u0000"+
		"45\u0005<\u0000\u000056\u0005-\u0000\u00006\u0006\u0001\u0000\u0000\u0000"+
		"78\u0005D\u0000\u000089\u0005E\u0000\u00009:\u0005L\u0000\u0000:;\u0005"+
		"E\u0000\u0000;<\u0005T\u0000\u0000<=\u0005E\u0000\u0000=\b\u0001\u0000"+
		"\u0000\u0000>?\u0005*\u0000\u0000?\n\u0001\u0000\u0000\u0000@A\u0005-"+
		"\u0000\u0000AB\u0005-\u0000\u0000B\f\u0001\u0000\u0000\u0000CD\u0005["+
		"\u0000\u0000DE\u0005]\u0000\u0000E\u000e\u0001\u0000\u0000\u0000FH\u0007"+
		"\u0000\u0000\u0000GF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000"+
		"IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000"+
		"\u0000KL\u0006\u0007\u0000\u0000L\u0010\u0001\u0000\u0000\u0000MN\u0005"+
		"[\u0000\u0000N\u0012\u0001\u0000\u0000\u0000OP\u0005]\u0000\u0000P\u0014"+
		"\u0001\u0000\u0000\u0000QR\u0005{\u0000\u0000R\u0016\u0001\u0000\u0000"+
		"\u0000ST\u0005}\u0000\u0000T\u0018\u0001\u0000\u0000\u0000UV\u0005(\u0000"+
		"\u0000V\u001a\u0001\u0000\u0000\u0000WX\u0005)\u0000\u0000X\u001c\u0001"+
		"\u0000\u0000\u0000YZ\u0005M\u0000\u0000Z[\u0005A\u0000\u0000[\\\u0005"+
		"T\u0000\u0000\\]\u0005C\u0000\u0000]^\u0005H\u0000\u0000^\u001e\u0001"+
		"\u0000\u0000\u0000_`\u0005R\u0000\u0000`a\u0005E\u0000\u0000ab\u0005T"+
		"\u0000\u0000bc\u0005U\u0000\u0000cd\u0005R\u0000\u0000de\u0005N\u0000"+
		"\u0000e \u0001\u0000\u0000\u0000fg\u0005C\u0000\u0000gh\u0005R\u0000\u0000"+
		"hi\u0005E\u0000\u0000ij\u0005A\u0000\u0000jk\u0005T\u0000\u0000kl\u0005"+
		"E\u0000\u0000l\"\u0001\u0000\u0000\u0000mn\u0005.\u0000\u0000n$\u0001"+
		"\u0000\u0000\u0000op\u0005,\u0000\u0000p&\u0001\u0000\u0000\u0000qr\u0005"+
		";\u0000\u0000r(\u0001\u0000\u0000\u0000st\u0005:\u0000\u0000t*\u0001\u0000"+
		"\u0000\u0000uw\u0007\u0001\u0000\u0000vu\u0001\u0000\u0000\u0000wx\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000"+
		"y,\u0001\u0000\u0000\u0000z\u0080\u0005\"\u0000\u0000{\u007f\b\u0002\u0000"+
		"\u0000|}\u0005\"\u0000\u0000}\u007f\u0005\"\u0000\u0000~{\u0001\u0000"+
		"\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0082\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081"+
		"\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083"+
		"\u0084\u0005\"\u0000\u0000\u0084\u0085\u0006\u0016\u0001\u0000\u0085."+
		"\u0001\u0000\u0000\u0000\u0005\u0000Ix~\u0080\u0002\u0006\u0000\u0000"+
		"\u0001\u0016\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}