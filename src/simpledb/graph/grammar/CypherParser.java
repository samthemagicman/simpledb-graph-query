// Generated from .//Cypher.g4 by ANTLR 4.13.1
package simpledb.graph.grammar;
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
		T__0=1, T__1=2, T__2=3, WS=4, LEFT_BRACKET=5, RIGHT_BRACKET=6, LEFT_BRACE=7, 
		RIGHT_BRACE=8, LEFT_PAREN=9, RIGHT_PAREN=10, MATCH=11, RETURN=12, CREATE=13, 
		PERIOD=14, COMMA=15, SEMICOLON=16, COLON=17, ID=18, QUOTE_STRING=19;
	public static final int
		RULE_query = 0, RULE_createCommand = 1, RULE_createCommandPattern = 2, 
		RULE_createCommandProperties = 3, RULE_matchClause = 4, RULE_returnClause = 5, 
		RULE_returnPattern = 6, RULE_returnItem = 7, RULE_pattern = 8, RULE_relationshipPattern = 9, 
		RULE_nodePattern = 10, RULE_pair = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "createCommand", "createCommandPattern", "createCommandProperties", 
			"matchClause", "returnClause", "returnPattern", "returnItem", "pattern", 
			"relationshipPattern", "nodePattern", "pair"
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
		public MatchClauseContext matchClause() {
			return getRuleContext(MatchClauseContext.class,0);
		}
		public ReturnClauseContext returnClause() {
			return getRuleContext(ReturnClauseContext.class,0);
		}
		public CreateCommandContext createCommand() {
			return getRuleContext(CreateCommandContext.class,0);
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
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MATCH:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				matchClause();
				setState(25);
				returnClause();
				}
				break;
			case CREATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				createCommand();
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
	public static class CreateCommandContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(CypherParser.CREATE, 0); }
		public CreateCommandPatternContext createCommandPattern() {
			return getRuleContext(CreateCommandPatternContext.class,0);
		}
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(CREATE);
			setState(31);
			createCommandPattern();
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
		public TerminalNode LEFT_PAREN() { return getToken(CypherParser.LEFT_PAREN, 0); }
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public CreateCommandPropertiesContext createCommandProperties() {
			return getRuleContext(CreateCommandPropertiesContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(CypherParser.RIGHT_PAREN, 0); }
		public CreateCommandPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createCommandPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterCreateCommandPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitCreateCommandPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitCreateCommandPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateCommandPatternContext createCommandPattern() throws RecognitionException {
		CreateCommandPatternContext _localctx = new CreateCommandPatternContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createCommandPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(LEFT_PAREN);
			setState(34);
			pair();
			setState(35);
			createCommandProperties();
			setState(36);
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
	public static class CreateCommandPropertiesContext extends ParserRuleContext {
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
		public CreateCommandPropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createCommandProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterCreateCommandProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitCreateCommandProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitCreateCommandProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateCommandPropertiesContext createCommandProperties() throws RecognitionException {
		CreateCommandPropertiesContext _localctx = new CreateCommandPropertiesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createCommandProperties);
		int _la;
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_BRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				match(LEFT_BRACE);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID || _la==QUOTE_STRING) {
					{
					setState(39);
					pair();
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(40);
						match(COMMA);
						setState(41);
						pair();
						}
						}
						setState(46);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(49);
				match(RIGHT_BRACE);
				}
				break;
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
	public static class MatchClauseContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(CypherParser.MATCH, 0); }
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public MatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterMatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitMatchClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitMatchClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchClauseContext matchClause() throws RecognitionException {
		MatchClauseContext _localctx = new MatchClauseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_matchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(MATCH);
			setState(54);
			pattern();
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
	public static class ReturnClauseContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(CypherParser.RETURN, 0); }
		public ReturnPatternContext returnPattern() {
			return getRuleContext(ReturnPatternContext.class,0);
		}
		public ReturnClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterReturnClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitReturnClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitReturnClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnClauseContext returnClause() throws RecognitionException {
		ReturnClauseContext _localctx = new ReturnClauseContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(RETURN);
			setState(57);
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
		enterRule(_localctx, 12, RULE_returnPattern);
		int _la;
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new ReturnAllContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(T__0);
				}
				break;
			case 2:
				_localctx = new ReturnSingleNodeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				match(ID);
				}
				break;
			case 3:
				_localctx = new ReturnMultipleNodesContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(61);
					returnItem();
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(62);
						match(COMMA);
						setState(63);
						returnItem();
						}
						}
						setState(68);
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
		enterRule(_localctx, 14, RULE_returnItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			((ReturnItemContext)_localctx).object = match(ID);
			setState(74);
			match(PERIOD);
			setState(75);
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
	public static class PatternContext extends ParserRuleContext {
		public List<NodePatternContext> nodePattern() {
			return getRuleContexts(NodePatternContext.class);
		}
		public NodePatternContext nodePattern(int i) {
			return getRuleContext(NodePatternContext.class,i);
		}
		public RelationshipPatternContext relationshipPattern() {
			return getRuleContext(RelationshipPatternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		PatternContext _localctx = new PatternContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pattern);
		try {
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				nodePattern();
				setState(78);
				match(T__1);
				setState(79);
				relationshipPattern();
				setState(80);
				match(T__1);
				setState(81);
				nodePattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				nodePattern();
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
		enterRule(_localctx, 18, RULE_relationshipPattern);
		try {
			setState(91);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(T__2);
				}
				break;
			case LEFT_BRACKET:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(LEFT_BRACKET);
				setState(88);
				pair();
				setState(89);
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
	public static class NodePatternContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(CypherParser.LEFT_PAREN, 0); }
		public PairContext pair() {
			return getRuleContext(PairContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(CypherParser.RIGHT_PAREN, 0); }
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
		enterRule(_localctx, 20, RULE_nodePattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(LEFT_PAREN);
			setState(94);
			pair();
			setState(95);
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
		enterRule(_localctx, 22, RULE_pair);
		int _la;
		try {
			int _alt;
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(97);
						((PairContext)_localctx).property = match(ID);
						setState(98);
						match(COLON);
						}
						} 
					}
					setState(103);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				setState(104);
				((PairContext)_localctx).value = match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID) {
					{
					{
					setState(105);
					((PairContext)_localctx).property = match(ID);
					setState(106);
					match(COLON);
					}
					}
					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(112);
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
		"\u0004\u0001\u0013t\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0003\u0000\u001d\b\u0000\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003+\b\u0003\n\u0003\f\u0003.\t\u0003\u0003\u00030\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u00034\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006A\b\u0006\n\u0006\f\u0006D\t\u0006"+
		"\u0003\u0006F\b\u0006\u0003\u0006H\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0003\bU\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\\\b\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000bd"+
		"\b\u000b\n\u000b\f\u000bg\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000bl\b\u000b\n\u000b\f\u000bo\t\u000b\u0001\u000b\u0003\u000b"+
		"r\b\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0000\u0000t\u0000\u001c\u0001\u0000\u0000\u0000"+
		"\u0002\u001e\u0001\u0000\u0000\u0000\u0004!\u0001\u0000\u0000\u0000\u0006"+
		"3\u0001\u0000\u0000\u0000\b5\u0001\u0000\u0000\u0000\n8\u0001\u0000\u0000"+
		"\u0000\fG\u0001\u0000\u0000\u0000\u000eI\u0001\u0000\u0000\u0000\u0010"+
		"T\u0001\u0000\u0000\u0000\u0012[\u0001\u0000\u0000\u0000\u0014]\u0001"+
		"\u0000\u0000\u0000\u0016q\u0001\u0000\u0000\u0000\u0018\u0019\u0003\b"+
		"\u0004\u0000\u0019\u001a\u0003\n\u0005\u0000\u001a\u001d\u0001\u0000\u0000"+
		"\u0000\u001b\u001d\u0003\u0002\u0001\u0000\u001c\u0018\u0001\u0000\u0000"+
		"\u0000\u001c\u001b\u0001\u0000\u0000\u0000\u001d\u0001\u0001\u0000\u0000"+
		"\u0000\u001e\u001f\u0005\r\u0000\u0000\u001f \u0003\u0004\u0002\u0000"+
		" \u0003\u0001\u0000\u0000\u0000!\"\u0005\t\u0000\u0000\"#\u0003\u0016"+
		"\u000b\u0000#$\u0003\u0006\u0003\u0000$%\u0005\n\u0000\u0000%\u0005\u0001"+
		"\u0000\u0000\u0000&/\u0005\u0007\u0000\u0000\',\u0003\u0016\u000b\u0000"+
		"()\u0005\u000f\u0000\u0000)+\u0003\u0016\u000b\u0000*(\u0001\u0000\u0000"+
		"\u0000+.\u0001\u0000\u0000\u0000,*\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000\u0000/\'\u0001"+
		"\u0000\u0000\u0000/0\u0001\u0000\u0000\u000001\u0001\u0000\u0000\u0000"+
		"14\u0005\b\u0000\u000024\u0001\u0000\u0000\u00003&\u0001\u0000\u0000\u0000"+
		"32\u0001\u0000\u0000\u00004\u0007\u0001\u0000\u0000\u000056\u0005\u000b"+
		"\u0000\u000067\u0003\u0010\b\u00007\t\u0001\u0000\u0000\u000089\u0005"+
		"\f\u0000\u00009:\u0003\f\u0006\u0000:\u000b\u0001\u0000\u0000\u0000;H"+
		"\u0005\u0001\u0000\u0000<H\u0005\u0012\u0000\u0000=B\u0003\u000e\u0007"+
		"\u0000>?\u0005\u000f\u0000\u0000?A\u0003\u000e\u0007\u0000@>\u0001\u0000"+
		"\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CF\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000"+
		"E=\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FH\u0001\u0000\u0000"+
		"\u0000G;\u0001\u0000\u0000\u0000G<\u0001\u0000\u0000\u0000GE\u0001\u0000"+
		"\u0000\u0000H\r\u0001\u0000\u0000\u0000IJ\u0005\u0012\u0000\u0000JK\u0005"+
		"\u000e\u0000\u0000KL\u0005\u0012\u0000\u0000L\u000f\u0001\u0000\u0000"+
		"\u0000MN\u0003\u0014\n\u0000NO\u0005\u0002\u0000\u0000OP\u0003\u0012\t"+
		"\u0000PQ\u0005\u0002\u0000\u0000QR\u0003\u0014\n\u0000RU\u0001\u0000\u0000"+
		"\u0000SU\u0003\u0014\n\u0000TM\u0001\u0000\u0000\u0000TS\u0001\u0000\u0000"+
		"\u0000U\u0011\u0001\u0000\u0000\u0000V\\\u0005\u0003\u0000\u0000WX\u0005"+
		"\u0005\u0000\u0000XY\u0003\u0016\u000b\u0000YZ\u0005\u0006\u0000\u0000"+
		"Z\\\u0001\u0000\u0000\u0000[V\u0001\u0000\u0000\u0000[W\u0001\u0000\u0000"+
		"\u0000\\\u0013\u0001\u0000\u0000\u0000]^\u0005\t\u0000\u0000^_\u0003\u0016"+
		"\u000b\u0000_`\u0005\n\u0000\u0000`\u0015\u0001\u0000\u0000\u0000ab\u0005"+
		"\u0012\u0000\u0000bd\u0005\u0011\u0000\u0000ca\u0001\u0000\u0000\u0000"+
		"dg\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fh\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000\u0000hr\u0005\u0012"+
		"\u0000\u0000ij\u0005\u0012\u0000\u0000jl\u0005\u0011\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000"+
		"mn\u0001\u0000\u0000\u0000np\u0001\u0000\u0000\u0000om\u0001\u0000\u0000"+
		"\u0000pr\u0005\u0013\u0000\u0000qe\u0001\u0000\u0000\u0000qm\u0001\u0000"+
		"\u0000\u0000r\u0017\u0001\u0000\u0000\u0000\f\u001c,/3BEGT[emq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}