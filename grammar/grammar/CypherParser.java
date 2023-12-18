// Generated from ./Cypher.g4 by ANTLR 4.13.1
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterCreateCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitCreateCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitCreateCommand(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterCreateNodeRelationship(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitCreateNodeRelationship(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitCreateNodeRelationship(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CreateSingleNodeContext extends CreateCommandPatternContext {
		public NodePatternContext node;
		public NodePatternContext nodePattern() {
			return getRuleContext(NodePatternContext.class,0);
		}
		public CreateSingleNodeContext(CreateCommandPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterCreateSingleNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitCreateSingleNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitCreateSingleNode(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterCreateNodeInverseRelationship(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitCreateNodeInverseRelationship(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitCreateNodeInverseRelationship(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterNodeRelationshipPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitNodeRelationshipPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitNodeRelationshipPattern(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterNodePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitNodePattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitNodePattern(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterNodeProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitNodeProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitNodeProperties(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterMatchAndReturnCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitMatchAndReturnCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitMatchAndReturnCommand(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterDeleteCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitDeleteCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitDeleteCommand(this);
			else return visitor.visitChildren(this);
		}
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
		public List<MatchPatternContext> matchPattern() {
			return getRuleContexts(MatchPatternContext.class);
		}
		public MatchPatternContext matchPattern(int i) {
			return getRuleContext(MatchPatternContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(CypherParser.COMMA, 0); }
		public MatchCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterMatchCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitMatchCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitMatchCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchCommandContext matchCommand() throws RecognitionException {
		MatchCommandContext _localctx = new MatchCommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_matchCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			match(MATCH);
			setState(91);
			matchPattern();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(92);
				match(COMMA);
				setState(93);
				matchPattern();
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
	public static class ReturnCommandContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CypherParser.RETURN, 0); }
		public ReturnPatternContext returnPattern() {
			return getRuleContext(ReturnPatternContext.class,0);
		}
		public ReturnCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterReturnCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitReturnCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitReturnCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnCommandContext returnCommand() throws RecognitionException {
		ReturnCommandContext _localctx = new ReturnCommandContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_returnCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(RETURN);
			setState(97);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterReturnSingleNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitReturnSingleNode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitReturnSingleNode(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnAllContext extends ReturnPatternContext {
		public ReturnAllContext(ReturnPatternContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterReturnAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitReturnAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitReturnAll(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterReturnMultipleNodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitReturnMultipleNodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitReturnMultipleNodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnPatternContext returnPattern() throws RecognitionException {
		ReturnPatternContext _localctx = new ReturnPatternContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_returnPattern);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new ReturnAllContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(99);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new ReturnSingleNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				match(ID);
				}
				break;
			case 3:
				_localctx = new ReturnMultipleNodesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(101);
					returnItem();
					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(102);
						match(COMMA);
						setState(103);
						returnItem();
						}
						}
						setState(108);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterReturnItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitReturnItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitReturnItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnItemContext returnItem() throws RecognitionException {
		ReturnItemContext _localctx = new ReturnItemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			((ReturnItemContext)_localctx).object = match(ID);
			setState(114);
			match(PERIOD);
			setState(115);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterMatchPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitMatchPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitMatchPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchPatternContext matchPattern() throws RecognitionException {
		MatchPatternContext _localctx = new MatchPatternContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_matchPattern);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				((MatchPatternContext)_localctx).nodeFrom = nodePattern();
				setState(118);
				match(T__5);
				setState(119);
				((MatchPatternContext)_localctx).nodeTo = nodePattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				((MatchPatternContext)_localctx).nodeFrom = nodePattern();
				setState(122);
				match(T__0);
				setState(123);
				((MatchPatternContext)_localctx).relationship = nodeRelationshipPattern();
				setState(124);
				match(T__1);
				setState(125);
				((MatchPatternContext)_localctx).nodeTo = nodePattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				((MatchPatternContext)_localctx).nodeTo = nodePattern();
				setState(128);
				match(T__2);
				setState(129);
				((MatchPatternContext)_localctx).relationship = nodeRelationshipPattern();
				setState(130);
				match(T__0);
				setState(131);
				((MatchPatternContext)_localctx).nodeFrom = nodePattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(133);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterRelationshipPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitRelationshipPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitRelationshipPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationshipPatternContext relationshipPattern() throws RecognitionException {
		RelationshipPatternContext _localctx = new RelationshipPatternContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relationshipPattern);
		try {
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				match(T__6);
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(LEFT_BRACKET);
				setState(138);
				pair();
				setState(139);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pair);
		int _la;
		try {
			int _alt;
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(146);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==ID) {
							{
							{
							setState(143);
							((PairContext)_localctx).property = match(ID);
							}
							}
							setState(148);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(149);
						match(COLON);
						}
						} 
					}
					setState(154);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
				}
				setState(155);
				((PairContext)_localctx).value = match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(156);
					((PairContext)_localctx).property = match(ID);
					setState(157);
					match(COLON);
					}
					}
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(163);
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
		"\u0004\u0001\u0017\u00a7\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
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
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"_\b\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0005\ni\b\n\n\n\f\nl\t\n\u0003\nn\b\n\u0003\np\b\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u0087\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u008e\b\r\u0001\u000e\u0005\u000e\u0091\b\u000e\n\u000e"+
		"\f\u000e\u0094\t\u000e\u0001\u000e\u0005\u000e\u0097\b\u000e\n\u000e\f"+
		"\u000e\u009a\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u009f"+
		"\b\u000e\n\u000e\f\u000e\u00a2\t\u000e\u0001\u000e\u0003\u000e\u00a5\b"+
		"\u000e\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0000\u00ae\u0000\"\u0001"+
		"\u0000\u0000\u0000\u0002&\u0001\u0000\u0000\u0000\u00049\u0001\u0000\u0000"+
		"\u0000\u0006;\u0001\u0000\u0000\u0000\b@\u0001\u0000\u0000\u0000\nR\u0001"+
		"\u0000\u0000\u0000\fT\u0001\u0000\u0000\u0000\u000eW\u0001\u0000\u0000"+
		"\u0000\u0010Z\u0001\u0000\u0000\u0000\u0012`\u0001\u0000\u0000\u0000\u0014"+
		"o\u0001\u0000\u0000\u0000\u0016q\u0001\u0000\u0000\u0000\u0018\u0086\u0001"+
		"\u0000\u0000\u0000\u001a\u008d\u0001\u0000\u0000\u0000\u001c\u00a4\u0001"+
		"\u0000\u0000\u0000\u001e#\u0003\u0010\b\u0000\u001f#\u0003\u0012\t\u0000"+
		" #\u0003\u0002\u0001\u0000!#\u0003\u000e\u0007\u0000\"\u001e\u0001\u0000"+
		"\u0000\u0000\"\u001f\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000"+
		"\"!\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000"+
		"\u0000$%\u0001\u0000\u0000\u0000%\u0001\u0001\u0000\u0000\u0000&\'\u0005"+
		"\u0011\u0000\u0000\'*\u0003\u0004\u0002\u0000()\u0005\u0013\u0000\u0000"+
		")+\u0003\u0004\u0002\u0000*(\u0001\u0000\u0000\u0000*+\u0001\u0000\u0000"+
		"\u0000+\u0003\u0001\u0000\u0000\u0000,-\u0003\b\u0004\u0000-.\u0005\u0001"+
		"\u0000\u0000./\u0003\u0006\u0003\u0000/0\u0005\u0002\u0000\u000001\u0003"+
		"\b\u0004\u00001:\u0001\u0000\u0000\u000023\u0003\b\u0004\u000034\u0005"+
		"\u0003\u0000\u000045\u0003\u0006\u0003\u000056\u0005\u0001\u0000\u0000"+
		"67\u0003\b\u0004\u00007:\u0001\u0000\u0000\u00008:\u0003\b\u0004\u0000"+
		"9,\u0001\u0000\u0000\u000092\u0001\u0000\u0000\u000098\u0001\u0000\u0000"+
		"\u0000:\u0005\u0001\u0000\u0000\u0000;<\u0005\t\u0000\u0000<=\u0003\u001c"+
		"\u000e\u0000=>\u0003\n\u0005\u0000>?\u0005\n\u0000\u0000?\u0007\u0001"+
		"\u0000\u0000\u0000@A\u0005\r\u0000\u0000AB\u0003\u001c\u000e\u0000BC\u0003"+
		"\n\u0005\u0000CD\u0005\u000e\u0000\u0000D\t\u0001\u0000\u0000\u0000EN"+
		"\u0005\u000b\u0000\u0000FK\u0003\u001c\u000e\u0000GH\u0005\u0013\u0000"+
		"\u0000HJ\u0003\u001c\u000e\u0000IG\u0001\u0000\u0000\u0000JM\u0001\u0000"+
		"\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LO\u0001"+
		"\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000NF\u0001\u0000\u0000\u0000"+
		"NO\u0001\u0000\u0000\u0000OP\u0001\u0000\u0000\u0000PS\u0005\f\u0000\u0000"+
		"QS\u0001\u0000\u0000\u0000RE\u0001\u0000\u0000\u0000RQ\u0001\u0000\u0000"+
		"\u0000S\u000b\u0001\u0000\u0000\u0000TU\u0003\u0010\b\u0000UV\u0003\u0012"+
		"\t\u0000V\r\u0001\u0000\u0000\u0000WX\u0005\u0004\u0000\u0000XY\u0005"+
		"\u0016\u0000\u0000Y\u000f\u0001\u0000\u0000\u0000Z[\u0005\u000f\u0000"+
		"\u0000[^\u0003\u0018\f\u0000\\]\u0005\u0013\u0000\u0000]_\u0003\u0018"+
		"\f\u0000^\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0011\u0001"+
		"\u0000\u0000\u0000`a\u0005\u0010\u0000\u0000ab\u0003\u0014\n\u0000b\u0013"+
		"\u0001\u0000\u0000\u0000cp\u0005\u0005\u0000\u0000dp\u0005\u0016\u0000"+
		"\u0000ej\u0003\u0016\u000b\u0000fg\u0005\u0013\u0000\u0000gi\u0003\u0016"+
		"\u000b\u0000hf\u0001\u0000\u0000\u0000il\u0001\u0000\u0000\u0000jh\u0001"+
		"\u0000\u0000\u0000jk\u0001\u0000\u0000\u0000kn\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000me\u0001\u0000\u0000\u0000mn\u0001\u0000\u0000"+
		"\u0000np\u0001\u0000\u0000\u0000oc\u0001\u0000\u0000\u0000od\u0001\u0000"+
		"\u0000\u0000om\u0001\u0000\u0000\u0000p\u0015\u0001\u0000\u0000\u0000"+
		"qr\u0005\u0016\u0000\u0000rs\u0005\u0012\u0000\u0000st\u0005\u0016\u0000"+
		"\u0000t\u0017\u0001\u0000\u0000\u0000uv\u0003\b\u0004\u0000vw\u0005\u0006"+
		"\u0000\u0000wx\u0003\b\u0004\u0000x\u0087\u0001\u0000\u0000\u0000yz\u0003"+
		"\b\u0004\u0000z{\u0005\u0001\u0000\u0000{|\u0003\u0006\u0003\u0000|}\u0005"+
		"\u0002\u0000\u0000}~\u0003\b\u0004\u0000~\u0087\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0003\b\u0004\u0000\u0080\u0081\u0005\u0003\u0000\u0000\u0081"+
		"\u0082\u0003\u0006\u0003\u0000\u0082\u0083\u0005\u0001\u0000\u0000\u0083"+
		"\u0084\u0003\b\u0004\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085\u0087"+
		"\u0003\b\u0004\u0000\u0086u\u0001\u0000\u0000\u0000\u0086y\u0001\u0000"+
		"\u0000\u0000\u0086\u007f\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u0019\u0001\u0000\u0000\u0000\u0088\u008e\u0005\u0007"+
		"\u0000\u0000\u0089\u008a\u0005\t\u0000\u0000\u008a\u008b\u0003\u001c\u000e"+
		"\u0000\u008b\u008c\u0005\n\u0000\u0000\u008c\u008e\u0001\u0000\u0000\u0000"+
		"\u008d\u0088\u0001\u0000\u0000\u0000\u008d\u0089\u0001\u0000\u0000\u0000"+
		"\u008e\u001b\u0001\u0000\u0000\u0000\u008f\u0091\u0005\u0016\u0000\u0000"+
		"\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0094\u0001\u0000\u0000\u0000"+
		"\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000"+
		"\u0095\u0097\u0005\u0015\u0000\u0000\u0096\u0092\u0001\u0000\u0000\u0000"+
		"\u0097\u009a\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009b\u0001\u0000\u0000\u0000"+
		"\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u00a5\u0005\u0016\u0000\u0000"+
		"\u009c\u009d\u0005\u0016\u0000\u0000\u009d\u009f\u0005\u0015\u0000\u0000"+
		"\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a3\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a5\u0005\u0017\u0000\u0000\u00a4\u0098\u0001\u0000\u0000\u0000"+
		"\u00a4\u00a0\u0001\u0000\u0000\u0000\u00a5\u001d\u0001\u0000\u0000\u0000"+
		"\u0011\"$*9KNR^jmo\u0086\u008d\u0092\u0098\u00a0\u00a4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}