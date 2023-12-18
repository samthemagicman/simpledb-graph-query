// Generated from ./Cypher.g4 by ANTLR 4.13.1
package graph.grammar;
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
		RULE_multiQuery = 0, RULE_query = 1, RULE_createCommand = 2, RULE_createCommandPattern = 3, 
		RULE_nodeRelationshipPattern = 4, RULE_nodePattern = 5, RULE_nodeProperties = 6, 
		RULE_matchAndReturnCommand = 7, RULE_deleteCommand = 8, RULE_matchCommand = 9, 
		RULE_returnCommand = 10, RULE_returnPattern = 11, RULE_returnItem = 12, 
		RULE_matchPattern = 13, RULE_relationshipPattern = 14, RULE_pair = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"multiQuery", "query", "createCommand", "createCommandPattern", "nodeRelationshipPattern", 
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
	public static class MultiQueryContext extends ParserRuleContext {
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(CypherParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(CypherParser.SEMICOLON, i);
		}
		public MultiQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterMultiQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitMultiQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitMultiQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiQueryContext multiQuery() throws RecognitionException {
		MultiQueryContext _localctx = new MultiQueryContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_multiQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			query();
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(33);
				match(SEMICOLON);
				}
				break;
			}
			setState(38);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(36);
				match(SEMICOLON);
				setState(37);
				query();
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
		enterRule(_localctx, 2, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(44);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MATCH:
					{
					setState(40);
					matchCommand();
					}
					break;
				case RETURN:
					{
					setState(41);
					returnCommand();
					}
					break;
				case CREATE:
					{
					setState(42);
					createCommand();
					}
					break;
				case T__3:
					{
					setState(43);
					deleteCommand();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(46); 
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
		enterRule(_localctx, 4, RULE_createCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(CREATE);
			setState(49);
			createCommandPattern();
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(50);
				match(COMMA);
				setState(51);
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
		enterRule(_localctx, 6, RULE_createCommandPattern);
		try {
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new CreateNodeRelationshipContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				((CreateNodeRelationshipContext)_localctx).nodeFrom = nodePattern();
				setState(55);
				match(T__0);
				setState(56);
				((CreateNodeRelationshipContext)_localctx).relationship = nodeRelationshipPattern();
				setState(57);
				match(T__1);
				setState(58);
				((CreateNodeRelationshipContext)_localctx).nodeTo = nodePattern();
				}
				break;
			case 2:
				_localctx = new CreateNodeInverseRelationshipContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				((CreateNodeInverseRelationshipContext)_localctx).nodeTo = nodePattern();
				setState(61);
				match(T__2);
				setState(62);
				((CreateNodeInverseRelationshipContext)_localctx).relationship = nodeRelationshipPattern();
				setState(63);
				match(T__0);
				setState(64);
				((CreateNodeInverseRelationshipContext)_localctx).nodeFrom = nodePattern();
				}
				break;
			case 3:
				_localctx = new CreateSingleNodeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
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
		enterRule(_localctx, 8, RULE_nodeRelationshipPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(LEFT_BRACKET);
			setState(70);
			((NodeRelationshipPatternContext)_localctx).nodeNameAndLabel = pair();
			setState(71);
			((NodeRelationshipPatternContext)_localctx).properties = nodeProperties();
			setState(72);
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
		enterRule(_localctx, 10, RULE_nodePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(LEFT_PAREN);
			setState(75);
			((NodePatternContext)_localctx).nodeNameAndLabel = pair();
			setState(76);
			((NodePatternContext)_localctx).properties = nodeProperties();
			setState(77);
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
		enterRule(_localctx, 12, RULE_nodeProperties);
		int _la;
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(LEFT_BRACE);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON || _la==ID) {
					{
					setState(80);
					pair();
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(81);
						match(COMMA);
						setState(82);
						pair();
						}
						}
						setState(87);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(90);
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
		enterRule(_localctx, 14, RULE_matchAndReturnCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			matchCommand();
			setState(95);
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
		enterRule(_localctx, 16, RULE_deleteCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__3);
			setState(98);
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
		enterRule(_localctx, 18, RULE_matchCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(MATCH);
			setState(101);
			matchPattern();
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(102);
				match(COMMA);
				setState(103);
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
		enterRule(_localctx, 20, RULE_returnCommand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(RETURN);
			setState(107);
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
		enterRule(_localctx, 22, RULE_returnPattern);
		int _la;
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new ReturnAllContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(109);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new ReturnSingleNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(110);
				match(ID);
				}
				break;
			case 3:
				_localctx = new ReturnMultipleNodesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(111);
					returnItem();
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(112);
						match(COMMA);
						setState(113);
						returnItem();
						}
						}
						setState(118);
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
		enterRule(_localctx, 24, RULE_returnItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			((ReturnItemContext)_localctx).object = match(ID);
			setState(124);
			match(PERIOD);
			setState(125);
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
		enterRule(_localctx, 26, RULE_matchPattern);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				((MatchPatternContext)_localctx).nodeFrom = nodePattern();
				setState(128);
				match(T__5);
				setState(129);
				((MatchPatternContext)_localctx).nodeTo = nodePattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				((MatchPatternContext)_localctx).nodeFrom = nodePattern();
				setState(132);
				match(T__0);
				setState(133);
				((MatchPatternContext)_localctx).relationship = nodeRelationshipPattern();
				setState(134);
				match(T__1);
				setState(135);
				((MatchPatternContext)_localctx).nodeTo = nodePattern();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				((MatchPatternContext)_localctx).nodeTo = nodePattern();
				setState(138);
				match(T__2);
				setState(139);
				((MatchPatternContext)_localctx).relationship = nodeRelationshipPattern();
				setState(140);
				match(T__0);
				setState(141);
				((MatchPatternContext)_localctx).nodeFrom = nodePattern();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
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
		enterRule(_localctx, 28, RULE_relationshipPattern);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(T__6);
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				match(LEFT_BRACKET);
				setState(148);
				pair();
				setState(149);
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
		public TerminalNode COLON() { return getToken(CypherParser.COLON, 0); }
		public List<TerminalNode> ID() { return getTokens(CypherParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CypherParser.ID, i);
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
		enterRule(_localctx, 30, RULE_pair);
		int _la;
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(153);
					((PairContext)_localctx).property = match(ID);
					}
				}

				setState(156);
				match(COLON);
				setState(157);
				((PairContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ID || _la==QUOTE_STRING) ) {
					((PairContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				((PairContext)_localctx).property = match(ID);
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
		"\u0004\u0001\u0017\u00a2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0001\u0000\u0001\u0000\u0003\u0000#\b\u0000\u0001\u0000\u0001"+
		"\u0000\u0003\u0000\'\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0004\u0001-\b\u0001\u000b\u0001\f\u0001.\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00025\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"D\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006T\b\u0006\n\u0006\f\u0006"+
		"W\t\u0006\u0003\u0006Y\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006]\b"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0003\ti\b\t\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000bs\b"+
		"\u000b\n\u000b\f\u000bv\t\u000b\u0003\u000bx\b\u000b\u0003\u000bz\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0003\r\u0091\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0098\b\u000e\u0001\u000f\u0003"+
		"\u000f\u009b\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00a0"+
		"\b\u000f\u0001\u000f\u0000\u0000\u0010\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e\u0000\u0001\u0001\u0000"+
		"\u0016\u0017\u00a8\u0000 \u0001\u0000\u0000\u0000\u0002,\u0001\u0000\u0000"+
		"\u0000\u00040\u0001\u0000\u0000\u0000\u0006C\u0001\u0000\u0000\u0000\b"+
		"E\u0001\u0000\u0000\u0000\nJ\u0001\u0000\u0000\u0000\f\\\u0001\u0000\u0000"+
		"\u0000\u000e^\u0001\u0000\u0000\u0000\u0010a\u0001\u0000\u0000\u0000\u0012"+
		"d\u0001\u0000\u0000\u0000\u0014j\u0001\u0000\u0000\u0000\u0016y\u0001"+
		"\u0000\u0000\u0000\u0018{\u0001\u0000\u0000\u0000\u001a\u0090\u0001\u0000"+
		"\u0000\u0000\u001c\u0097\u0001\u0000\u0000\u0000\u001e\u009f\u0001\u0000"+
		"\u0000\u0000 \"\u0003\u0002\u0001\u0000!#\u0005\u0014\u0000\u0000\"!\u0001"+
		"\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#&\u0001\u0000\u0000\u0000"+
		"$%\u0005\u0014\u0000\u0000%\'\u0003\u0002\u0001\u0000&$\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\'\u0001\u0001\u0000\u0000\u0000(-\u0003"+
		"\u0012\t\u0000)-\u0003\u0014\n\u0000*-\u0003\u0004\u0002\u0000+-\u0003"+
		"\u0010\b\u0000,(\u0001\u0000\u0000\u0000,)\u0001\u0000\u0000\u0000,*\u0001"+
		"\u0000\u0000\u0000,+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000/\u0003\u0001\u0000"+
		"\u0000\u000001\u0005\u0011\u0000\u000014\u0003\u0006\u0003\u000023\u0005"+
		"\u0013\u0000\u000035\u0003\u0006\u0003\u000042\u0001\u0000\u0000\u0000"+
		"45\u0001\u0000\u0000\u00005\u0005\u0001\u0000\u0000\u000067\u0003\n\u0005"+
		"\u000078\u0005\u0001\u0000\u000089\u0003\b\u0004\u00009:\u0005\u0002\u0000"+
		"\u0000:;\u0003\n\u0005\u0000;D\u0001\u0000\u0000\u0000<=\u0003\n\u0005"+
		"\u0000=>\u0005\u0003\u0000\u0000>?\u0003\b\u0004\u0000?@\u0005\u0001\u0000"+
		"\u0000@A\u0003\n\u0005\u0000AD\u0001\u0000\u0000\u0000BD\u0003\n\u0005"+
		"\u0000C6\u0001\u0000\u0000\u0000C<\u0001\u0000\u0000\u0000CB\u0001\u0000"+
		"\u0000\u0000D\u0007\u0001\u0000\u0000\u0000EF\u0005\t\u0000\u0000FG\u0003"+
		"\u001e\u000f\u0000GH\u0003\f\u0006\u0000HI\u0005\n\u0000\u0000I\t\u0001"+
		"\u0000\u0000\u0000JK\u0005\r\u0000\u0000KL\u0003\u001e\u000f\u0000LM\u0003"+
		"\f\u0006\u0000MN\u0005\u000e\u0000\u0000N\u000b\u0001\u0000\u0000\u0000"+
		"OX\u0005\u000b\u0000\u0000PU\u0003\u001e\u000f\u0000QR\u0005\u0013\u0000"+
		"\u0000RT\u0003\u001e\u000f\u0000SQ\u0001\u0000\u0000\u0000TW\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VY\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000XP\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z]\u0005\f\u0000\u0000"+
		"[]\u0001\u0000\u0000\u0000\\O\u0001\u0000\u0000\u0000\\[\u0001\u0000\u0000"+
		"\u0000]\r\u0001\u0000\u0000\u0000^_\u0003\u0012\t\u0000_`\u0003\u0014"+
		"\n\u0000`\u000f\u0001\u0000\u0000\u0000ab\u0005\u0004\u0000\u0000bc\u0005"+
		"\u0016\u0000\u0000c\u0011\u0001\u0000\u0000\u0000de\u0005\u000f\u0000"+
		"\u0000eh\u0003\u001a\r\u0000fg\u0005\u0013\u0000\u0000gi\u0003\u001a\r"+
		"\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u0013\u0001"+
		"\u0000\u0000\u0000jk\u0005\u0010\u0000\u0000kl\u0003\u0016\u000b\u0000"+
		"l\u0015\u0001\u0000\u0000\u0000mz\u0005\u0005\u0000\u0000nz\u0005\u0016"+
		"\u0000\u0000ot\u0003\u0018\f\u0000pq\u0005\u0013\u0000\u0000qs\u0003\u0018"+
		"\f\u0000rp\u0001\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000wo\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xz\u0001\u0000\u0000\u0000ym\u0001\u0000\u0000\u0000yn\u0001\u0000\u0000"+
		"\u0000yw\u0001\u0000\u0000\u0000z\u0017\u0001\u0000\u0000\u0000{|\u0005"+
		"\u0016\u0000\u0000|}\u0005\u0012\u0000\u0000}~\u0005\u0016\u0000\u0000"+
		"~\u0019\u0001\u0000\u0000\u0000\u007f\u0080\u0003\n\u0005\u0000\u0080"+
		"\u0081\u0005\u0006\u0000\u0000\u0081\u0082\u0003\n\u0005\u0000\u0082\u0091"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0003\n\u0005\u0000\u0084\u0085\u0005"+
		"\u0001\u0000\u0000\u0085\u0086\u0003\b\u0004\u0000\u0086\u0087\u0005\u0002"+
		"\u0000\u0000\u0087\u0088\u0003\n\u0005\u0000\u0088\u0091\u0001\u0000\u0000"+
		"\u0000\u0089\u008a\u0003\n\u0005\u0000\u008a\u008b\u0005\u0003\u0000\u0000"+
		"\u008b\u008c\u0003\b\u0004\u0000\u008c\u008d\u0005\u0001\u0000\u0000\u008d"+
		"\u008e\u0003\n\u0005\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f\u0091"+
		"\u0003\n\u0005\u0000\u0090\u007f\u0001\u0000\u0000\u0000\u0090\u0083\u0001"+
		"\u0000\u0000\u0000\u0090\u0089\u0001\u0000\u0000\u0000\u0090\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u001b\u0001\u0000\u0000\u0000\u0092\u0098\u0005"+
		"\u0007\u0000\u0000\u0093\u0094\u0005\t\u0000\u0000\u0094\u0095\u0003\u001e"+
		"\u000f\u0000\u0095\u0096\u0005\n\u0000\u0000\u0096\u0098\u0001\u0000\u0000"+
		"\u0000\u0097\u0092\u0001\u0000\u0000\u0000\u0097\u0093\u0001\u0000\u0000"+
		"\u0000\u0098\u001d\u0001\u0000\u0000\u0000\u0099\u009b\u0005\u0016\u0000"+
		"\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0015\u0000"+
		"\u0000\u009d\u00a0\u0007\u0000\u0000\u0000\u009e\u00a0\u0005\u0016\u0000"+
		"\u0000\u009f\u009a\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u001f\u0001\u0000\u0000\u0000\u0011\"&,.4CUX\\htwy\u0090"+
		"\u0097\u009a\u009f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}