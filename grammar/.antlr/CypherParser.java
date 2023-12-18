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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, WS=8, LEFT_BRACKET=9, 
		RIGHT_BRACKET=10, LEFT_BRACE=11, RIGHT_BRACE=12, LEFT_PAREN=13, RIGHT_PAREN=14, 
		MATCH=15, RETURN=16, CREATE=17, PERIOD=18, COMMA=19, SEMICOLON=20, COLON=21, 
		ID=22, QUOTE_STRING=23;
	public static final int
		RULE_query = 0, RULE_createCommand = 1, RULE_createCommandPattern = 2, 
		RULE_nodeRelationshipPattern = 3, RULE_nodePattern = 4, RULE_nodeProperties = 5, 
		RULE_matchAndReturnCommand = 6, RULE_deleteCommand = 7, RULE_matchCommand = 8, 
		RULE_returnCommand = 9, RULE_returnPattern = 10, RULE_returnItem = 11, 
		RULE_matchPattern = 12, RULE_relationshipPattern = 13, RULE_pair = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "createCommand", "createCommandPattern", "nodeRelationshipPattern", 
			"nodePattern", "nodeProperties", "matchAndReturnCommand", "deleteCommand", 
			"matchCommand", "returnCommand", "returnPattern", "returnItem", "matchPattern", 
			"relationshipPattern", "pair"
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
		public List<MatchCommandContext> matchCommand() {
			return getRuleContexts(MatchCommandContext.class);
		}
		public MatchCommandContext matchCommand(int i) {
			return getRuleContext(MatchCommandContext.class,i);
		}
		public List<ReturnCommandContext> returnCommand() {
			return getRuleContexts(ReturnCommandContext.class);
		}
		public ReturnCommandContext returnCommand(int i) {
			return getRuleContext(ReturnCommandContext.class,i);
		}
		public List<CreateCommandContext> createCommand() {
			return getRuleContexts(CreateCommandContext.class);
		}
		public CreateCommandContext createCommand(int i) {
			return getRuleContext(CreateCommandContext.class,i);
		}
		public List<DeleteCommandContext> deleteCommand() {
			return getRuleContexts(DeleteCommandContext.class);
		}
		public DeleteCommandContext deleteCommand(int i) {
			return getRuleContext(DeleteCommandContext.class,i);
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
			setState(34); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(34);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MATCH:
					{
					setState(30);
					matchCommand();
					}
					break;
				case RETURN:
					{
					setState(31);
					returnCommand();
					}
					break;
				case CREATE:
					{
					setState(32);
					createCommand();
					}
					break;
				case T__3:
					{
					setState(33);
					deleteCommand();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(36); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 229392L) != 0) );
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
			setState(38);
			match(CREATE);
			setState(39);
			createCommandPattern();
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(40);
				match(COMMA);
				setState(41);
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
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new CreateNodeRelationshipContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(44);
				((CreateNodeRelationshipContext)_localctx).nodeFrom = nodePattern();
				setState(45);
				match(T__0);
				setState(46);
				((CreateNodeRelationshipContext)_localctx).relationship = nodeRelationshipPattern();
				setState(47);
				match(T__1);
				setState(48);
				((CreateNodeRelationshipContext)_localctx).nodeTo = nodePattern();
				}
				break;
			case 2:
				_localctx = new CreateNodeInverseRelationshipContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				((CreateNodeInverseRelationshipContext)_localctx).nodeTo = nodePattern();
				setState(51);
				match(T__2);
				setState(52);
				((CreateNodeInverseRelationshipContext)_localctx).relationship = nodeRelationshipPattern();
				setState(53);
				match(T__0);
				setState(54);
				((CreateNodeInverseRelationshipContext)_localctx).nodeFrom = nodePattern();
				}
				break;
			case 3:
				_localctx = new CreateSingleNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
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
			setState(59);
			match(LEFT_BRACKET);
			setState(60);
			((NodeRelationshipPatternContext)_localctx).nodeNameAndLabel = pair();
			setState(61);
			((NodeRelationshipPatternContext)_localctx).properties = nodeProperties();
			setState(62);
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
			setState(64);
			match(LEFT_PAREN);
			setState(65);
			((NodePatternContext)_localctx).nodeNameAndLabel = pair();
			setState(66);
			((NodePatternContext)_localctx).properties = nodeProperties();
			setState(67);
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
			setState(82);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(LEFT_BRACE);
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 14680064L) != 0)) {
					{
					setState(70);
					pair();
					setState(75);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(71);
						match(COMMA);
						setState(72);
						pair();
						}
						}
						setState(77);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(80);
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
			setState(84);
			matchCommand();
			setState(85);
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
	public static class DeleteCommandContext extends ParserRuleContext {
		public Token nodeVariable;
		public TerminalNode ID() { return getToken(CypherParser.ID, 0); }
		public DeleteCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteCommand; }
	}

	public final DeleteCommandContext deleteCommand() throws RecognitionException {
		DeleteCommandContext _localctx = new DeleteCommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_deleteCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(T__3);
			setState(88);
			((DeleteCommandContext)_localctx).nodeVariable = match(ID);
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
		enterRule(_localctx, 16, RULE_matchCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(MATCH);
			setState(91);
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
		enterRule(_localctx, 18, RULE_returnCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(RETURN);
			setState(94);
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
		enterRule(_localctx, 20, RULE_returnPattern);
		int _la;
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ReturnAllContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new ReturnSingleNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				match(ID);
				}
				break;
			case 3:
				_localctx = new ReturnMultipleNodesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(98);
					returnItem();
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(99);
						match(COMMA);
						setState(100);
						returnItem();
						}
						}
						setState(105);
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
		enterRule(_localctx, 22, RULE_returnItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			((ReturnItemContext)_localctx).object = match(ID);
			setState(111);
			match(PERIOD);
			setState(112);
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
		enterRule(_localctx, 24, RULE_matchPattern);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				((MatchPatternContext)_localctx).nodeFrom = nodePattern();
				setState(115);
				match(T__5);
				setState(116);
				((MatchPatternContext)_localctx).nodeTo = nodePattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				((MatchPatternContext)_localctx).nodeFrom = nodePattern();
				setState(119);
				match(T__0);
				setState(120);
				((MatchPatternContext)_localctx).relationship = nodeRelationshipPattern();
				setState(121);
				match(T__1);
				setState(122);
				((MatchPatternContext)_localctx).nodeTo = nodePattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				((MatchPatternContext)_localctx).nodeTo = nodePattern();
				setState(125);
				match(T__2);
				setState(126);
				((MatchPatternContext)_localctx).relationship = nodeRelationshipPattern();
				setState(127);
				match(T__0);
				setState(128);
				((MatchPatternContext)_localctx).nodeFrom = nodePattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
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
		enterRule(_localctx, 26, RULE_relationshipPattern);
		try {
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(T__6);
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(LEFT_BRACKET);
				setState(135);
				pair();
				setState(136);
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
		enterRule(_localctx, 28, RULE_pair);
		int _la;
		try {
			int _alt;
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(143);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==ID) {
							{
							{
							setState(140);
							((PairContext)_localctx).property = match(ID);
							}
							}
							setState(145);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(146);
						match(COLON);
						}
						} 
					}
					setState(151);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				}
				setState(152);
				((PairContext)_localctx).value = match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(153);
					((PairContext)_localctx).property = match(ID);
					setState(154);
					match(COLON);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
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
		"\u0004\u0001\u0017\u00a4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0004\u0000#\b\u0000\u000b\u0000\f\u0000"+
		"$\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001+\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002:\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"J\b\u0005\n\u0005\f\u0005M\t\u0005\u0003\u0005O\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005S\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t"+
		"\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\nf\b\n\n\n\f\n"+
		"i\t\n\u0003\nk\b\n\u0003\nm\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\f\u0084\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u008b"+
		"\b\r\u0001\u000e\u0005\u000e\u008e\b\u000e\n\u000e\f\u000e\u0091\t\u000e"+
		"\u0001\u000e\u0005\u000e\u0094\b\u000e\n\u000e\f\u000e\u0097\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u009c\b\u000e\n\u000e\f\u000e"+
		"\u009f\t\u000e\u0001\u000e\u0003\u000e\u00a2\b\u000e\u0001\u000e\u0000"+
		"\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u0000\u0000\u00aa\u0000\"\u0001\u0000\u0000\u0000\u0002"+
		"&\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000\u0000\u0006;\u0001"+
		"\u0000\u0000\u0000\b@\u0001\u0000\u0000\u0000\nR\u0001\u0000\u0000\u0000"+
		"\fT\u0001\u0000\u0000\u0000\u000eW\u0001\u0000\u0000\u0000\u0010Z\u0001"+
		"\u0000\u0000\u0000\u0012]\u0001\u0000\u0000\u0000\u0014l\u0001\u0000\u0000"+
		"\u0000\u0016n\u0001\u0000\u0000\u0000\u0018\u0083\u0001\u0000\u0000\u0000"+
		"\u001a\u008a\u0001\u0000\u0000\u0000\u001c\u00a1\u0001\u0000\u0000\u0000"+
		"\u001e#\u0003\u0010\b\u0000\u001f#\u0003\u0012\t\u0000 #\u0003\u0002\u0001"+
		"\u0000!#\u0003\u000e\u0007\u0000\"\u001e\u0001\u0000\u0000\u0000\"\u001f"+
		"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"!\u0001\u0000\u0000"+
		"\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$%\u0001\u0000"+
		"\u0000\u0000%\u0001\u0001\u0000\u0000\u0000&\'\u0005\u0011\u0000\u0000"+
		"\'*\u0003\u0004\u0002\u0000()\u0005\u0013\u0000\u0000)+\u0003\u0004\u0002"+
		"\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000\u0000+\u0003\u0001"+
		"\u0000\u0000\u0000,-\u0003\b\u0004\u0000-.\u0005\u0001\u0000\u0000./\u0003"+
		"\u0006\u0003\u0000/0\u0005\u0002\u0000\u000001\u0003\b\u0004\u00001:\u0001"+
		"\u0000\u0000\u000023\u0003\b\u0004\u000034\u0005\u0003\u0000\u000045\u0003"+
		"\u0006\u0003\u000056\u0005\u0001\u0000\u000067\u0003\b\u0004\u00007:\u0001"+
		"\u0000\u0000\u00008:\u0003\b\u0004\u00009,\u0001\u0000\u0000\u000092\u0001"+
		"\u0000\u0000\u000098\u0001\u0000\u0000\u0000:\u0005\u0001\u0000\u0000"+
		"\u0000;<\u0005\t\u0000\u0000<=\u0003\u001c\u000e\u0000=>\u0003\n\u0005"+
		"\u0000>?\u0005\n\u0000\u0000?\u0007\u0001\u0000\u0000\u0000@A\u0005\r"+
		"\u0000\u0000AB\u0003\u001c\u000e\u0000BC\u0003\n\u0005\u0000CD\u0005\u000e"+
		"\u0000\u0000D\t\u0001\u0000\u0000\u0000EN\u0005\u000b\u0000\u0000FK\u0003"+
		"\u001c\u000e\u0000GH\u0005\u0013\u0000\u0000HJ\u0003\u001c\u000e\u0000"+
		"IG\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000"+
		"\u0000KL\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000"+
		"\u0000\u0000NF\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000PS\u0005\f\u0000\u0000QS\u0001\u0000\u0000\u0000RE\u0001"+
		"\u0000\u0000\u0000RQ\u0001\u0000\u0000\u0000S\u000b\u0001\u0000\u0000"+
		"\u0000TU\u0003\u0010\b\u0000UV\u0003\u0012\t\u0000V\r\u0001\u0000\u0000"+
		"\u0000WX\u0005\u0004\u0000\u0000XY\u0005\u0016\u0000\u0000Y\u000f\u0001"+
		"\u0000\u0000\u0000Z[\u0005\u000f\u0000\u0000[\\\u0003\u0018\f\u0000\\"+
		"\u0011\u0001\u0000\u0000\u0000]^\u0005\u0010\u0000\u0000^_\u0003\u0014"+
		"\n\u0000_\u0013\u0001\u0000\u0000\u0000`m\u0005\u0005\u0000\u0000am\u0005"+
		"\u0016\u0000\u0000bg\u0003\u0016\u000b\u0000cd\u0005\u0013\u0000\u0000"+
		"df\u0003\u0016\u000b\u0000ec\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000"+
		"\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hk\u0001\u0000"+
		"\u0000\u0000ig\u0001\u0000\u0000\u0000jb\u0001\u0000\u0000\u0000jk\u0001"+
		"\u0000\u0000\u0000km\u0001\u0000\u0000\u0000l`\u0001\u0000\u0000\u0000"+
		"la\u0001\u0000\u0000\u0000lj\u0001\u0000\u0000\u0000m\u0015\u0001\u0000"+
		"\u0000\u0000no\u0005\u0016\u0000\u0000op\u0005\u0012\u0000\u0000pq\u0005"+
		"\u0016\u0000\u0000q\u0017\u0001\u0000\u0000\u0000rs\u0003\b\u0004\u0000"+
		"st\u0005\u0006\u0000\u0000tu\u0003\b\u0004\u0000u\u0084\u0001\u0000\u0000"+
		"\u0000vw\u0003\b\u0004\u0000wx\u0005\u0001\u0000\u0000xy\u0003\u0006\u0003"+
		"\u0000yz\u0005\u0002\u0000\u0000z{\u0003\b\u0004\u0000{\u0084\u0001\u0000"+
		"\u0000\u0000|}\u0003\b\u0004\u0000}~\u0005\u0003\u0000\u0000~\u007f\u0003"+
		"\u0006\u0003\u0000\u007f\u0080\u0005\u0001\u0000\u0000\u0080\u0081\u0003"+
		"\b\u0004\u0000\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0084\u0003\b"+
		"\u0004\u0000\u0083r\u0001\u0000\u0000\u0000\u0083v\u0001\u0000\u0000\u0000"+
		"\u0083|\u0001\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084"+
		"\u0019\u0001\u0000\u0000\u0000\u0085\u008b\u0005\u0007\u0000\u0000\u0086"+
		"\u0087\u0005\t\u0000\u0000\u0087\u0088\u0003\u001c\u000e\u0000\u0088\u0089"+
		"\u0005\n\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0085\u0001"+
		"\u0000\u0000\u0000\u008a\u0086\u0001\u0000\u0000\u0000\u008b\u001b\u0001"+
		"\u0000\u0000\u0000\u008c\u008e\u0005\u0016\u0000\u0000\u008d\u008c\u0001"+
		"\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u008d\u0001"+
		"\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092\u0001"+
		"\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092\u0094\u0005"+
		"\u0015\u0000\u0000\u0093\u008f\u0001\u0000\u0000\u0000\u0094\u0097\u0001"+
		"\u0000\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001"+
		"\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000\u0000\u0097\u0095\u0001"+
		"\u0000\u0000\u0000\u0098\u00a2\u0005\u0016\u0000\u0000\u0099\u009a\u0005"+
		"\u0016\u0000\u0000\u009a\u009c\u0005\u0015\u0000\u0000\u009b\u0099\u0001"+
		"\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d\u009b\u0001"+
		"\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u00a0\u0001"+
		"\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0\u00a2\u0005"+
		"\u0017\u0000\u0000\u00a1\u0095\u0001\u0000\u0000\u0000\u00a1\u009d\u0001"+
		"\u0000\u0000\u0000\u00a2\u001d\u0001\u0000\u0000\u0000\u0010\"$*9KNRg"+
		"jl\u0083\u008a\u008f\u0095\u009d\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}