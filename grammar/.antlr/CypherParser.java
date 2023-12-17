// Generated from c:/Users/Samuel/Documents/GitHub/simpledb-graph-query/grammar/Cypher.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CypherParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, WS=6, LEFT_BRACKET=7, RIGHT_BRACKET=8, 
		LEFT_BRACE=9, RIGHT_BRACE=10, LEFT_PAREN=11, RIGHT_PAREN=12, MATCH=13, 
		RETURN=14, CREATE=15, PERIOD=16, COMMA=17, SEMICOLON=18, COLON=19, ID=20, 
		QUOTE_STRING=21;
	public static final int
		RULE_query = 0, RULE_createCommand = 1, RULE_createCommandPattern = 2, 
		RULE_nodeRelationshipPattern = 3, RULE_nodePattern = 4, RULE_nodeProperties = 5, 
		RULE_matchAndReturnCommand = 6, RULE_matchCommand = 7, RULE_returnCommand = 8, 
		RULE_returnPattern = 9, RULE_returnItem = 10, RULE_matchPattern = 11, 
		RULE_relationshipPattern = 12, RULE_pair = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "createCommand", "createCommandPattern", "nodeRelationshipPattern", 
			"nodePattern", "nodeProperties", "matchAndReturnCommand", "matchCommand", 
			"returnCommand", "returnPattern", "returnItem", "matchPattern", "relationshipPattern", 
			"pair"
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

	@Override
	public String getGrammarFileName() { return "Cypher.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CypherParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryContext extends ParserRuleContext {
		public List<MatchAndReturnCommandContext> matchAndReturnCommand() {
			return getRuleContexts(MatchAndReturnCommandContext.class);
		}
		public MatchAndReturnCommandContext matchAndReturnCommand(int i) {
			return getRuleContext(MatchAndReturnCommandContext.class,i);
		}
		public List<CreateCommandContext> createCommand() {
			return getRuleContexts(CreateCommandContext.class);
		}
		public CreateCommandContext createCommand(int i) {
			return getRuleContext(CreateCommandContext.class,i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(30);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MATCH:
					{
					setState(28);
					matchAndReturnCommand();
					}
					break;
				case CREATE:
					{
					setState(29);
					createCommand();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==MATCH || _la==CREATE );
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
	public static class CreateCommandContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(CypherParser.CREATE, 0); }
		public List<CreateCommandPatternContext> createCommandPattern() {
			return getRuleContexts(CreateCommandPatternContext.class);
		}
		public CreateCommandPatternContext createCommandPattern(int i) {
			return getRuleContext(CreateCommandPatternContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(CypherParser.COMMA, 0); }
		public CreateCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createCommand; }
	}

	public final CreateCommandContext createCommand() throws RecognitionException {
		CreateCommandContext _localctx = new CreateCommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_createCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(34);
			match(CREATE);
			setState(35);
			createCommandPattern();
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(36);
				match(COMMA);
				setState(37);
				createCommandPattern();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateCommandPatternContext extends ParserRuleContext {
		public CreateCommandPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createCommandPattern; }
	 
		public CreateCommandPatternContext() { }
		public void copyFrom(CreateCommandPatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateNodeRelationshipContext extends CreateCommandPatternContext {
		public NodePatternContext nodeFrom;
		public NodeRelationshipPatternContext relationship;
		public NodePatternContext nodeTo;
		public List<NodePatternContext> nodePattern() {
			return getRuleContexts(NodePatternContext.class);
		}
		public NodePatternContext nodePattern(int i) {
			return getRuleContext(NodePatternContext.class,i);
		}
		public NodeRelationshipPatternContext nodeRelationshipPattern() {
			return getRuleContext(NodeRelationshipPatternContext.class,0);
		}
		public CreateNodeRelationshipContext(CreateCommandPatternContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateSingleNodeContext extends CreateCommandPatternContext {
		public NodePatternContext node;
		public NodePatternContext nodePattern() {
			return getRuleContext(NodePatternContext.class,0);
		}
		public CreateSingleNodeContext(CreateCommandPatternContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateNodeInverseRelationshipContext extends CreateCommandPatternContext {
		public NodePatternContext nodeTo;
		public NodeRelationshipPatternContext relationship;
		public NodePatternContext nodeFrom;
		public List<NodePatternContext> nodePattern() {
			return getRuleContexts(NodePatternContext.class);
		}
		public NodePatternContext nodePattern(int i) {
			return getRuleContext(NodePatternContext.class,i);
		}
		public NodeRelationshipPatternContext nodeRelationshipPattern() {
			return getRuleContext(NodeRelationshipPatternContext.class,0);
		}
		public CreateNodeInverseRelationshipContext(CreateCommandPatternContext ctx) { copyFrom(ctx); }
	}

	public final CreateCommandPatternContext createCommandPattern() throws RecognitionException {
		CreateCommandPatternContext _localctx = new CreateCommandPatternContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createCommandPattern);
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new CreateNodeRelationshipContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				((CreateNodeRelationshipContext)_localctx).nodeFrom = nodePattern();
				setState(41);
				match(T__0);
				setState(42);
				((CreateNodeRelationshipContext)_localctx).relationship = nodeRelationshipPattern();
				setState(43);
				match(T__1);
				setState(44);
				((CreateNodeRelationshipContext)_localctx).nodeTo = nodePattern();
				}
				break;
			case 2:
				_localctx = new CreateNodeInverseRelationshipContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				((CreateNodeInverseRelationshipContext)_localctx).nodeTo = nodePattern();
				setState(47);
				match(T__2);
				setState(48);
				((CreateNodeInverseRelationshipContext)_localctx).relationship = nodeRelationshipPattern();
				setState(49);
				match(T__0);
				setState(50);
				((CreateNodeInverseRelationshipContext)_localctx).nodeFrom = nodePattern();
				}
				break;
			case 3:
				_localctx = new CreateSingleNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				((CreateSingleNodeContext)_localctx).node = nodePattern();
				}
				break;
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
	public static class NodeRelationshipPatternContext extends ParserRuleContext {
		public PairContext nodeNameAndLabel;
		public NodePropertiesContext properties;
		public TerminalNode LEFT_BRACKET() { return getToken(CypherParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(CypherParser.RIGHT_BRACKET, 0); }
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public NodePropertiesContext nodeProperties() {
			return getRuleContext(NodePropertiesContext.class,0);
		}
		public NodeRelationshipPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeRelationshipPattern; }
	}

	public final NodeRelationshipPatternContext nodeRelationshipPattern() throws RecognitionException {
		NodeRelationshipPatternContext _localctx = new NodeRelationshipPatternContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_nodeRelationshipPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(LEFT_BRACKET);
			setState(56);
			((NodeRelationshipPatternContext)_localctx).nodeNameAndLabel = pair();
			setState(57);
			((NodeRelationshipPatternContext)_localctx).properties = nodeProperties();
			setState(58);
			match(RIGHT_BRACKET);
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
	public static class NodePatternContext extends ParserRuleContext {
		public PairContext nodeNameAndLabel;
		public NodePropertiesContext properties;
		public TerminalNode LEFT_PAREN() { return getToken(CypherParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(CypherParser.RIGHT_PAREN, 0); }
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public NodePropertiesContext nodeProperties() {
			return getRuleContext(NodePropertiesContext.class,0);
		}
		public NodePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodePattern; }
	}

	public final NodePatternContext nodePattern() throws RecognitionException {
		NodePatternContext _localctx = new NodePatternContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nodePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(LEFT_PAREN);
			setState(61);
			((NodePatternContext)_localctx).nodeNameAndLabel = pair();
			setState(62);
			((NodePatternContext)_localctx).properties = nodeProperties();
			setState(63);
			match(RIGHT_PAREN);
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
	public static class NodePropertiesContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACE() { return getToken(CypherParser.LEFT_BRACE, 0); }
		public TerminalNode RIGHT_BRACE() { return getToken(CypherParser.RIGHT_BRACE, 0); }
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public NodePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeProperties; }
	}

	public final NodePropertiesContext nodeProperties() throws RecognitionException {
		NodePropertiesContext _localctx = new NodePropertiesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nodeProperties);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(LEFT_BRACE);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID || _la==QUOTE_STRING) {
					{
					setState(66);
					pair();
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(67);
						match(COMMA);
						setState(68);
						pair();
						}
						}
						setState(73);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(76);
				match(RIGHT_BRACE);
				}
				break;
			case RIGHT_BRACKET:
			case RIGHT_PAREN:
				enterOuterAlt(_localctx, 2);
				{
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
	public static class MatchAndReturnCommandContext extends ParserRuleContext {
		public MatchCommandContext matchCommand() {
			return getRuleContext(MatchCommandContext.class,0);
		}
		public ReturnCommandContext returnCommand() {
			return getRuleContext(ReturnCommandContext.class,0);
		}
		public MatchAndReturnCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchAndReturnCommand; }
	}

	public final MatchAndReturnCommandContext matchAndReturnCommand() throws RecognitionException {
		MatchAndReturnCommandContext _localctx = new MatchAndReturnCommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_matchAndReturnCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			matchCommand();
			setState(81);
			returnCommand();
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
	public static class MatchCommandContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(CypherParser.MATCH, 0); }
		public MatchPatternContext matchPattern() {
			return getRuleContext(MatchPatternContext.class,0);
		}
		public MatchCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchCommand; }
	}

	public final MatchCommandContext matchCommand() throws RecognitionException {
		MatchCommandContext _localctx = new MatchCommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_matchCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(MATCH);
			setState(84);
			matchPattern();
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
	public static class ReturnCommandContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CypherParser.RETURN, 0); }
		public ReturnPatternContext returnPattern() {
			return getRuleContext(ReturnPatternContext.class,0);
		}
		public ReturnCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnCommand; }
	}

	public final ReturnCommandContext returnCommand() throws RecognitionException {
		ReturnCommandContext _localctx = new ReturnCommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(RETURN);
			setState(87);
			returnPattern();
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
	public static class ReturnPatternContext extends ParserRuleContext {
		public ReturnPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnPattern; }
	 
		public ReturnPatternContext() { }
		public void copyFrom(ReturnPatternContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnSingleNodeContext extends ReturnPatternContext {
		public TerminalNode ID() { return getToken(CypherParser.ID, 0); }
		public ReturnSingleNodeContext(ReturnPatternContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnAllContext extends ReturnPatternContext {
		public ReturnAllContext(ReturnPatternContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnMultipleNodesContext extends ReturnPatternContext {
		public List<ReturnItemContext> returnItem() {
			return getRuleContexts(ReturnItemContext.class);
		}
		public ReturnItemContext returnItem(int i) {
			return getRuleContext(ReturnItemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CypherParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CypherParser.COMMA, i);
		}
		public ReturnMultipleNodesContext(ReturnPatternContext ctx) { copyFrom(ctx); }
	}

	public final ReturnPatternContext returnPattern() throws RecognitionException {
		ReturnPatternContext _localctx = new ReturnPatternContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnPattern);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ReturnAllContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new ReturnSingleNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(ID);
				}
				break;
			case 3:
				_localctx = new ReturnMultipleNodesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(91);
					returnItem();
					setState(96);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(92);
						match(COMMA);
						setState(93);
						returnItem();
						}
						}
						setState(98);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
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
	public static class ReturnItemContext extends ParserRuleContext {
		public Token object;
		public Token property;
		public TerminalNode PERIOD() { return getToken(CypherParser.PERIOD, 0); }
		public List<TerminalNode> ID() { return getTokens(CypherParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CypherParser.ID, i);
		}
		public ReturnItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnItem; }
	}

	public final ReturnItemContext returnItem() throws RecognitionException {
		ReturnItemContext _localctx = new ReturnItemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			((ReturnItemContext)_localctx).object = match(ID);
			setState(104);
			match(PERIOD);
			setState(105);
			((ReturnItemContext)_localctx).property = match(ID);
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
	public static class MatchPatternContext extends ParserRuleContext {
		public NodePatternContext nodeFrom;
		public NodeRelationshipPatternContext undirectedRelationship;
		public NodePatternContext nodeTo;
		public NodeRelationshipPatternContext relationship;
		public NodePatternContext node;
		public List<NodePatternContext> nodePattern() {
			return getRuleContexts(NodePatternContext.class);
		}
		public NodePatternContext nodePattern(int i) {
			return getRuleContext(NodePatternContext.class,i);
		}
		public NodeRelationshipPatternContext nodeRelationshipPattern() {
			return getRuleContext(NodeRelationshipPatternContext.class,0);
		}
		public MatchPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchPattern; }
	}

	public final MatchPatternContext matchPattern() throws RecognitionException {
		MatchPatternContext _localctx = new MatchPatternContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_matchPattern);
		int _la;
		try {
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				((MatchPatternContext)_localctx).nodeFrom = nodePattern();
				setState(108);
				match(T__0);
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_BRACKET) {
					{
					setState(109);
					((MatchPatternContext)_localctx).undirectedRelationship = nodeRelationshipPattern();
					}
				}

				setState(112);
				match(T__0);
				setState(113);
				((MatchPatternContext)_localctx).nodeTo = nodePattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				((MatchPatternContext)_localctx).nodeFrom = nodePattern();
				setState(116);
				match(T__0);
				setState(117);
				((MatchPatternContext)_localctx).relationship = nodeRelationshipPattern();
				setState(118);
				match(T__1);
				setState(119);
				((MatchPatternContext)_localctx).nodeTo = nodePattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				((MatchPatternContext)_localctx).nodeTo = nodePattern();
				setState(122);
				match(T__2);
				setState(123);
				((MatchPatternContext)_localctx).relationship = nodeRelationshipPattern();
				setState(124);
				match(T__0);
				setState(125);
				((MatchPatternContext)_localctx).nodeFrom = nodePattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				((MatchPatternContext)_localctx).node = nodePattern();
				}
				break;
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
	public static class RelationshipPatternContext extends ParserRuleContext {
		public TerminalNode LEFT_BRACKET() { return getToken(CypherParser.LEFT_BRACKET, 0); }
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public TerminalNode RIGHT_BRACKET() { return getToken(CypherParser.RIGHT_BRACKET, 0); }
		public RelationshipPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationshipPattern; }
	}

	public final RelationshipPatternContext relationshipPattern() throws RecognitionException {
		RelationshipPatternContext _localctx = new RelationshipPatternContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_relationshipPattern);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(T__4);
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(LEFT_BRACKET);
				setState(132);
				pair();
				setState(133);
				match(RIGHT_BRACKET);
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
	public static class PairContext extends ParserRuleContext {
		public Token property;
		public Token value;
		public List<TerminalNode> ID() { return getTokens(CypherParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CypherParser.ID, i);
		}
		public List<TerminalNode> COLON() { return getTokens(CypherParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CypherParser.COLON, i);
		}
		public TerminalNode QUOTE_STRING() { return getToken(CypherParser.QUOTE_STRING, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pair);
		int _la;
		try {
			int _alt;
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(141);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(137);
						((PairContext)_localctx).property = match(ID);
						setState(138);
						match(COLON);
						}
						} 
					}
					setState(143);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(144);
				((PairContext)_localctx).value = match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(145);
					((PairContext)_localctx).property = match(ID);
					setState(146);
					match(COLON);
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(152);
				((PairContext)_localctx).value = match(QUOTE_STRING);
				}
				break;
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
		"\u0004\u0001\u0015\u009c\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0004\u0000\u001f"+
		"\b\u0000\u000b\u0000\f\u0000 \u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\'\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0005\u0005F\b\u0005\n\u0005\f\u0005I\t\u0005\u0003"+
		"\u0005K\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005O\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t_\b\t\n\t\f"+
		"\tb\t\t\u0003\td\b\t\u0003\tf\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000bo\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0081\b\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u0088\b\f\u0001\r\u0001\r\u0005\r\u008c"+
		"\b\r\n\r\f\r\u008f\t\r\u0001\r\u0001\r\u0001\r\u0005\r\u0094\b\r\n\r\f"+
		"\r\u0097\t\r\u0001\r\u0003\r\u009a\b\r\u0001\r\u0000\u0000\u000e\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u0000"+
		"\u0000\u00a1\u0000\u001e\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000"+
		"\u0000\u00045\u0001\u0000\u0000\u0000\u00067\u0001\u0000\u0000\u0000\b"+
		"<\u0001\u0000\u0000\u0000\nN\u0001\u0000\u0000\u0000\fP\u0001\u0000\u0000"+
		"\u0000\u000eS\u0001\u0000\u0000\u0000\u0010V\u0001\u0000\u0000\u0000\u0012"+
		"e\u0001\u0000\u0000\u0000\u0014g\u0001\u0000\u0000\u0000\u0016\u0080\u0001"+
		"\u0000\u0000\u0000\u0018\u0087\u0001\u0000\u0000\u0000\u001a\u0099\u0001"+
		"\u0000\u0000\u0000\u001c\u001f\u0003\f\u0006\u0000\u001d\u001f\u0003\u0002"+
		"\u0001\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001e\u001d\u0001\u0000"+
		"\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000"+
		" !\u0001\u0000\u0000\u0000!\u0001\u0001\u0000\u0000\u0000\"#\u0005\u000f"+
		"\u0000\u0000#&\u0003\u0004\u0002\u0000$%\u0005\u0011\u0000\u0000%\'\u0003"+
		"\u0004\u0002\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000"+
		"\'\u0003\u0001\u0000\u0000\u0000()\u0003\b\u0004\u0000)*\u0005\u0001\u0000"+
		"\u0000*+\u0003\u0006\u0003\u0000+,\u0005\u0002\u0000\u0000,-\u0003\b\u0004"+
		"\u0000-6\u0001\u0000\u0000\u0000./\u0003\b\u0004\u0000/0\u0005\u0003\u0000"+
		"\u000001\u0003\u0006\u0003\u000012\u0005\u0001\u0000\u000023\u0003\b\u0004"+
		"\u000036\u0001\u0000\u0000\u000046\u0003\b\u0004\u00005(\u0001\u0000\u0000"+
		"\u00005.\u0001\u0000\u0000\u000054\u0001\u0000\u0000\u00006\u0005\u0001"+
		"\u0000\u0000\u000078\u0005\u0007\u0000\u000089\u0003\u001a\r\u00009:\u0003"+
		"\n\u0005\u0000:;\u0005\b\u0000\u0000;\u0007\u0001\u0000\u0000\u0000<="+
		"\u0005\u000b\u0000\u0000=>\u0003\u001a\r\u0000>?\u0003\n\u0005\u0000?"+
		"@\u0005\f\u0000\u0000@\t\u0001\u0000\u0000\u0000AJ\u0005\t\u0000\u0000"+
		"BG\u0003\u001a\r\u0000CD\u0005\u0011\u0000\u0000DF\u0003\u001a\r\u0000"+
		"EC\u0001\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000"+
		"\u0000GH\u0001\u0000\u0000\u0000HK\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000JB\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000LO\u0005\n\u0000\u0000MO\u0001\u0000\u0000\u0000NA\u0001"+
		"\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000O\u000b\u0001\u0000\u0000"+
		"\u0000PQ\u0003\u000e\u0007\u0000QR\u0003\u0010\b\u0000R\r\u0001\u0000"+
		"\u0000\u0000ST\u0005\r\u0000\u0000TU\u0003\u0016\u000b\u0000U\u000f\u0001"+
		"\u0000\u0000\u0000VW\u0005\u000e\u0000\u0000WX\u0003\u0012\t\u0000X\u0011"+
		"\u0001\u0000\u0000\u0000Yf\u0005\u0004\u0000\u0000Zf\u0005\u0014\u0000"+
		"\u0000[`\u0003\u0014\n\u0000\\]\u0005\u0011\u0000\u0000]_\u0003\u0014"+
		"\n\u0000^\\\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000c[\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000df\u0001\u0000\u0000\u0000eY\u0001\u0000\u0000\u0000eZ\u0001\u0000"+
		"\u0000\u0000ec\u0001\u0000\u0000\u0000f\u0013\u0001\u0000\u0000\u0000"+
		"gh\u0005\u0014\u0000\u0000hi\u0005\u0010\u0000\u0000ij\u0005\u0014\u0000"+
		"\u0000j\u0015\u0001\u0000\u0000\u0000kl\u0003\b\u0004\u0000ln\u0005\u0001"+
		"\u0000\u0000mo\u0003\u0006\u0003\u0000nm\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pq\u0005\u0001\u0000\u0000"+
		"qr\u0003\b\u0004\u0000r\u0081\u0001\u0000\u0000\u0000st\u0003\b\u0004"+
		"\u0000tu\u0005\u0001\u0000\u0000uv\u0003\u0006\u0003\u0000vw\u0005\u0002"+
		"\u0000\u0000wx\u0003\b\u0004\u0000x\u0081\u0001\u0000\u0000\u0000yz\u0003"+
		"\b\u0004\u0000z{\u0005\u0003\u0000\u0000{|\u0003\u0006\u0003\u0000|}\u0005"+
		"\u0001\u0000\u0000}~\u0003\b\u0004\u0000~\u0081\u0001\u0000\u0000\u0000"+
		"\u007f\u0081\u0003\b\u0004\u0000\u0080k\u0001\u0000\u0000\u0000\u0080"+
		"s\u0001\u0000\u0000\u0000\u0080y\u0001\u0000\u0000\u0000\u0080\u007f\u0001"+
		"\u0000\u0000\u0000\u0081\u0017\u0001\u0000\u0000\u0000\u0082\u0088\u0005"+
		"\u0005\u0000\u0000\u0083\u0084\u0005\u0007\u0000\u0000\u0084\u0085\u0003"+
		"\u001a\r\u0000\u0085\u0086\u0005\b\u0000\u0000\u0086\u0088\u0001\u0000"+
		"\u0000\u0000\u0087\u0082\u0001\u0000\u0000\u0000\u0087\u0083\u0001\u0000"+
		"\u0000\u0000\u0088\u0019\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0014"+
		"\u0000\u0000\u008a\u008c\u0005\u0013\u0000\u0000\u008b\u0089\u0001\u0000"+
		"\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000"+
		"\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090\u0001\u0000"+
		"\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u009a\u0005\u0014"+
		"\u0000\u0000\u0091\u0092\u0005\u0014\u0000\u0000\u0092\u0094\u0005\u0013"+
		"\u0000\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000"+
		"\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0098\u009a\u0005\u0015\u0000\u0000\u0099\u008d\u0001\u0000"+
		"\u0000\u0000\u0099\u0095\u0001\u0000\u0000\u0000\u009a\u001b\u0001\u0000"+
		"\u0000\u0000\u0010\u001e &5GJN`cen\u0080\u0087\u008d\u0095\u0099";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}