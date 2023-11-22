// Generated from C:/Users/samsa/Documents/GitHub/simpledb-graph-query/grammar/Cypher.g4 by ANTLR 4.13.1
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, WS=8, MATCH=9, 
		RETURN=10, PERIOD=11, COMMA=12, SEMICOLON=13, COLON=14, ID=15;
	public static final int
		RULE_query = 0, RULE_matchClause = 1, RULE_returnClause = 2, RULE_returnPattern = 3, 
		RULE_returnAll = 4, RULE_returnItem = 5, RULE_property = 6, RULE_pattern = 7, 
		RULE_relationshipPattern = 8, RULE_nodePattern = 9, RULE_nodeLabel = 10, 
		RULE_nodeId = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"query", "matchClause", "returnClause", "returnPattern", "returnAll", 
			"returnItem", "property", "pattern", "relationshipPattern", "nodePattern", 
			"nodeLabel", "nodeId"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'*'", "'-'", "'[]'", "'['", "']'", "'('", "')'", null, "'MATCH'", 
			"'RETURN'", "'.'", "','", "';'", "':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "WS", "MATCH", "RETURN", 
			"PERIOD", "COMMA", "SEMICOLON", "COLON", "ID"
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
		public List<ReturnClauseContext> returnClause() {
			return getRuleContexts(ReturnClauseContext.class);
		}
		public ReturnClauseContext returnClause(int i) {
			return getRuleContext(ReturnClauseContext.class,i);
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
			setState(24);
			matchClause();
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(25);
				returnClause();
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==RETURN );
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
		enterRule(_localctx, 2, RULE_matchClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(MATCH);
			setState(31);
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
		enterRule(_localctx, 4, RULE_returnClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(RETURN);
			setState(34);
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
		public ReturnAllContext returnAll() {
			return getRuleContext(ReturnAllContext.class,0);
		}
		public NodeIdContext nodeId() {
			return getRuleContext(NodeIdContext.class,0);
		}
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
		public ReturnPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterReturnPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitReturnPattern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitReturnPattern(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnPatternContext returnPattern() throws RecognitionException {
		ReturnPatternContext _localctx = new ReturnPatternContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returnPattern);
		int _la;
		try {
			setState(48);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				returnAll();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				nodeId();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(38);
					returnItem();
					setState(43);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(39);
						match(COMMA);
						setState(40);
						returnItem();
						}
						}
						setState(45);
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
	public static class ReturnAllContext extends ParserRuleContext {
		public ReturnAllContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnAll; }
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

	public final ReturnAllContext returnAll() throws RecognitionException {
		ReturnAllContext _localctx = new ReturnAllContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_returnAll);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(T__0);
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
		public NodeIdContext nodeId() {
			return getRuleContext(NodeIdContext.class,0);
		}
		public TerminalNode PERIOD() { return getToken(CypherParser.PERIOD, 0); }
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
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
		enterRule(_localctx, 10, RULE_returnItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			nodeId();
			setState(53);
			match(PERIOD);
			setState(54);
			property();
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
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CypherParser.ID, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(ID);
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
		enterRule(_localctx, 14, RULE_pattern);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(58);
				nodePattern();
				setState(59);
				match(T__1);
				setState(60);
				relationshipPattern();
				setState(61);
				match(T__1);
				setState(62);
				nodePattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
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
		public NodeIdContext nodeId() {
			return getRuleContext(NodeIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CypherParser.COLON, 0); }
		public NodeLabelContext nodeLabel() {
			return getRuleContext(NodeLabelContext.class,0);
		}
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
		enterRule(_localctx, 16, RULE_relationshipPattern);
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(67);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(T__3);
				setState(69);
				nodeId();
				setState(70);
				match(COLON);
				setState(71);
				nodeLabel();
				setState(72);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(74);
				match(T__3);
				setState(75);
				nodeId();
				setState(76);
				match(T__4);
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
	public static class NodePatternContext extends ParserRuleContext {
		public NodeIdContext nodeId() {
			return getRuleContext(NodeIdContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CypherParser.COLON, 0); }
		public NodeLabelContext nodeLabel() {
			return getRuleContext(NodeLabelContext.class,0);
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
		enterRule(_localctx, 18, RULE_nodePattern);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__5);
				setState(81);
				nodeId();
				setState(82);
				match(COLON);
				setState(83);
				nodeLabel();
				setState(84);
				match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(T__5);
				setState(87);
				nodeLabel();
				setState(88);
				match(T__6);
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
	public static class NodeLabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CypherParser.ID, 0); }
		public NodeLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterNodeLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitNodeLabel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitNodeLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeLabelContext nodeLabel() throws RecognitionException {
		NodeLabelContext _localctx = new NodeLabelContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nodeLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(ID);
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
	public static class NodeIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(CypherParser.ID, 0); }
		public NodeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).enterNodeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CypherListener ) ((CypherListener)listener).exitNodeId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CypherVisitor ) return ((CypherVisitor<? extends T>)visitor).visitNodeId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodeIdContext nodeId() throws RecognitionException {
		NodeIdContext _localctx = new NodeIdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_nodeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(ID);
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
		"\u0004\u0001\u000fa\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0001"+
		"\u0000\u0001\u0000\u0004\u0000\u001b\b\u0000\u000b\u0000\f\u0000\u001c"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"*\b\u0003\n\u0003\f\u0003-\t\u0003\u0003\u0003/\b\u0003\u0003\u00031\b"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007B\b\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0003\bO\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t[\b\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0000\u0000\f\u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0000\u0000]\u0000\u0018\u0001\u0000"+
		"\u0000\u0000\u0002\u001e\u0001\u0000\u0000\u0000\u0004!\u0001\u0000\u0000"+
		"\u0000\u00060\u0001\u0000\u0000\u0000\b2\u0001\u0000\u0000\u0000\n4\u0001"+
		"\u0000\u0000\u0000\f8\u0001\u0000\u0000\u0000\u000eA\u0001\u0000\u0000"+
		"\u0000\u0010N\u0001\u0000\u0000\u0000\u0012Z\u0001\u0000\u0000\u0000\u0014"+
		"\\\u0001\u0000\u0000\u0000\u0016^\u0001\u0000\u0000\u0000\u0018\u001a"+
		"\u0003\u0002\u0001\u0000\u0019\u001b\u0003\u0004\u0002\u0000\u001a\u0019"+
		"\u0001\u0000\u0000\u0000\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001a"+
		"\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000\u001d\u0001"+
		"\u0001\u0000\u0000\u0000\u001e\u001f\u0005\t\u0000\u0000\u001f \u0003"+
		"\u000e\u0007\u0000 \u0003\u0001\u0000\u0000\u0000!\"\u0005\n\u0000\u0000"+
		"\"#\u0003\u0006\u0003\u0000#\u0005\u0001\u0000\u0000\u0000$1\u0003\b\u0004"+
		"\u0000%1\u0003\u0016\u000b\u0000&+\u0003\n\u0005\u0000\'(\u0005\f\u0000"+
		"\u0000(*\u0003\n\u0005\u0000)\'\u0001\u0000\u0000\u0000*-\u0001\u0000"+
		"\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000,/\u0001"+
		"\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000.&\u0001\u0000\u0000\u0000"+
		"./\u0001\u0000\u0000\u0000/1\u0001\u0000\u0000\u00000$\u0001\u0000\u0000"+
		"\u00000%\u0001\u0000\u0000\u00000.\u0001\u0000\u0000\u00001\u0007\u0001"+
		"\u0000\u0000\u000023\u0005\u0001\u0000\u00003\t\u0001\u0000\u0000\u0000"+
		"45\u0003\u0016\u000b\u000056\u0005\u000b\u0000\u000067\u0003\f\u0006\u0000"+
		"7\u000b\u0001\u0000\u0000\u000089\u0005\u000f\u0000\u00009\r\u0001\u0000"+
		"\u0000\u0000:;\u0003\u0012\t\u0000;<\u0005\u0002\u0000\u0000<=\u0003\u0010"+
		"\b\u0000=>\u0005\u0002\u0000\u0000>?\u0003\u0012\t\u0000?B\u0001\u0000"+
		"\u0000\u0000@B\u0003\u0012\t\u0000A:\u0001\u0000\u0000\u0000A@\u0001\u0000"+
		"\u0000\u0000B\u000f\u0001\u0000\u0000\u0000CO\u0005\u0003\u0000\u0000"+
		"DE\u0005\u0004\u0000\u0000EF\u0003\u0016\u000b\u0000FG\u0005\u000e\u0000"+
		"\u0000GH\u0003\u0014\n\u0000HI\u0005\u0005\u0000\u0000IO\u0001\u0000\u0000"+
		"\u0000JK\u0005\u0004\u0000\u0000KL\u0003\u0016\u000b\u0000LM\u0005\u0005"+
		"\u0000\u0000MO\u0001\u0000\u0000\u0000NC\u0001\u0000\u0000\u0000ND\u0001"+
		"\u0000\u0000\u0000NJ\u0001\u0000\u0000\u0000O\u0011\u0001\u0000\u0000"+
		"\u0000PQ\u0005\u0006\u0000\u0000QR\u0003\u0016\u000b\u0000RS\u0005\u000e"+
		"\u0000\u0000ST\u0003\u0014\n\u0000TU\u0005\u0007\u0000\u0000U[\u0001\u0000"+
		"\u0000\u0000VW\u0005\u0006\u0000\u0000WX\u0003\u0014\n\u0000XY\u0005\u0007"+
		"\u0000\u0000Y[\u0001\u0000\u0000\u0000ZP\u0001\u0000\u0000\u0000ZV\u0001"+
		"\u0000\u0000\u0000[\u0013\u0001\u0000\u0000\u0000\\]\u0005\u000f\u0000"+
		"\u0000]\u0015\u0001\u0000\u0000\u0000^_\u0005\u000f\u0000\u0000_\u0017"+
		"\u0001\u0000\u0000\u0000\u0007\u001c+.0ANZ";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}