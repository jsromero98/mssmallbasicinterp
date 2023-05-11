// Generated from C:/Users/johanlap21/Desktop/antlrmssmallbasicinter/grammar\Mymssmallbasic.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MymssmallbasicParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, MUL=17, 
		DIV=18, ADD=19, SUB=20, OBJKEYWORD=21, LINE_COMMENT=22, WS=23, AND=24, 
		OR=25, EQ=26, ROP=27, NEQ=28, GTE=29, LTE=30, GT=31, LT=32, LPAREN=33, 
		RPAREN=34, LBRACK=35, RBRACK=36, INT=37, DOUBLE=38, ID=39, STRING=40, 
		NEWLINE=41;
	public static final int
		RULE_inicio = 0, RULE_block = 1, RULE_blocknosub = 2, RULE_statement = 3, 
		RULE_statementnosub = 4, RULE_vardeclexpr = 5, RULE_arrdeclexpr = 6, RULE_expr = 7, 
		RULE_label = 8, RULE_funccall = 9, RULE_keyobjcall = 10, RULE_compexpr = 11, 
		RULE_arithexpr = 12, RULE_term = 13, RULE_factor = 14, RULE_atom = 15, 
		RULE_forexpr = 16, RULE_ifexpr = 17, RULE_elseifexpr = 18, RULE_elseexpr = 19, 
		RULE_whileexpr = 20, RULE_funcdef = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "block", "blocknosub", "statement", "statementnosub", "vardeclexpr", 
			"arrdeclexpr", "expr", "label", "funccall", "keyobjcall", "compexpr", 
			"arithexpr", "term", "factor", "atom", "forexpr", "ifexpr", "elseifexpr", 
			"elseexpr", "whileexpr", "funcdef"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'.'", "','", "'FOR'", "'To'", "'Step'", "'EndFor'", "'If'", 
			"'Then'", "'EndIf'", "'ElseIf'", "'Else'", "'While'", "'EndWhile'", "'Sub'", 
			"'EndSub'", "'*'", "'/'", "'+'", "'-'", null, null, null, "'And'", "'Or'", 
			"'='", null, "'<>'", "'>='", "'<='", "'>'", "'<'", "'('", "')'", "'['", 
			"']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", "OBJKEYWORD", 
			"LINE_COMMENT", "WS", "AND", "OR", "EQ", "ROP", "NEQ", "GTE", "LTE", 
			"GT", "LT", "LPAREN", "RPAREN", "LBRACK", "RBRACK", "INT", "DOUBLE", 
			"ID", "STRING", "NEWLINE"
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
	public String getGrammarFileName() { return "Mymssmallbasic.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MymssmallbasicParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MymssmallbasicParser.EOF, 0); }
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			block();
			setState(45);
			match(EOF);
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
	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> EOF() { return getTokens(MymssmallbasicParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(MymssmallbasicParser.EOF, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MymssmallbasicParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MymssmallbasicParser.NEWLINE, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549762146576L) != 0)) {
				{
				{
				setState(47);
				statement();
				setState(55);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(48);
						match(NEWLINE);
						}
						}
						setState(53);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(54);
					match(EOF);
					}
					break;
				}
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class BlocknosubContext extends ParserRuleContext {
		public List<StatementnosubContext> statementnosub() {
			return getRuleContexts(StatementnosubContext.class);
		}
		public StatementnosubContext statementnosub(int i) {
			return getRuleContext(StatementnosubContext.class,i);
		}
		public List<TerminalNode> EOF() { return getTokens(MymssmallbasicParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(MymssmallbasicParser.EOF, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MymssmallbasicParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MymssmallbasicParser.NEWLINE, i);
		}
		public BlocknosubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blocknosub; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitBlocknosub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlocknosubContext blocknosub() throws RecognitionException {
		BlocknosubContext _localctx = new BlocknosubContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_blocknosub);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 549762113808L) != 0)) {
				{
				{
				setState(62);
				statementnosub();
				setState(70);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__3:
				case T__6:
				case T__7:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__15:
				case OBJKEYWORD:
				case LINE_COMMENT:
				case ID:
				case NEWLINE:
					{
					setState(66);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(63);
						match(NEWLINE);
						}
						}
						setState(68);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case EOF:
					{
					setState(69);
					match(EOF);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class StatementContext extends ParserRuleContext {
		public VardeclexprContext vardeclexpr() {
			return getRuleContext(VardeclexprContext.class,0);
		}
		public ArrdeclexprContext arrdeclexpr() {
			return getRuleContext(ArrdeclexprContext.class,0);
		}
		public ForexprContext forexpr() {
			return getRuleContext(ForexprContext.class,0);
		}
		public IfexprContext ifexpr() {
			return getRuleContext(IfexprContext.class,0);
		}
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public WhileexprContext whileexpr() {
			return getRuleContext(WhileexprContext.class,0);
		}
		public TerminalNode LINE_COMMENT() { return getToken(MymssmallbasicParser.LINE_COMMENT, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public KeyobjcallContext keyobjcall() {
			return getRuleContext(KeyobjcallContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				vardeclexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(78);
				arrdeclexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(79);
				forexpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				ifexpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(81);
				funcdef();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(82);
				whileexpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(83);
				match(LINE_COMMENT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(84);
				label();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(85);
				keyobjcall();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(86);
				funccall();
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
	public static class StatementnosubContext extends ParserRuleContext {
		public VardeclexprContext vardeclexpr() {
			return getRuleContext(VardeclexprContext.class,0);
		}
		public ArrdeclexprContext arrdeclexpr() {
			return getRuleContext(ArrdeclexprContext.class,0);
		}
		public ForexprContext forexpr() {
			return getRuleContext(ForexprContext.class,0);
		}
		public IfexprContext ifexpr() {
			return getRuleContext(IfexprContext.class,0);
		}
		public WhileexprContext whileexpr() {
			return getRuleContext(WhileexprContext.class,0);
		}
		public TerminalNode LINE_COMMENT() { return getToken(MymssmallbasicParser.LINE_COMMENT, 0); }
		public LabelContext label() {
			return getRuleContext(LabelContext.class,0);
		}
		public KeyobjcallContext keyobjcall() {
			return getRuleContext(KeyobjcallContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public StatementnosubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementnosub; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitStatementnosub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementnosubContext statementnosub() throws RecognitionException {
		StatementnosubContext _localctx = new StatementnosubContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statementnosub);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				vardeclexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				arrdeclexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91);
				forexpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(92);
				ifexpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(93);
				whileexpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(94);
				match(LINE_COMMENT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(95);
				label();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(96);
				keyobjcall();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(97);
				funccall();
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
	public static class VardeclexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MymssmallbasicParser.ID, 0); }
		public TerminalNode EQ() { return getToken(MymssmallbasicParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VardeclexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardeclexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitVardeclexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VardeclexprContext vardeclexpr() throws RecognitionException {
		VardeclexprContext _localctx = new VardeclexprContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_vardeclexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(ID);
			setState(101);
			match(EQ);
			setState(102);
			expr();
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
	public static class ArrdeclexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MymssmallbasicParser.ID, 0); }
		public TerminalNode EQ() { return getToken(MymssmallbasicParser.EQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(MymssmallbasicParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(MymssmallbasicParser.LBRACK, i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(MymssmallbasicParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(MymssmallbasicParser.RBRACK, i);
		}
		public List<TerminalNode> INT() { return getTokens(MymssmallbasicParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(MymssmallbasicParser.INT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(MymssmallbasicParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MymssmallbasicParser.STRING, i);
		}
		public ArrdeclexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrdeclexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitArrdeclexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrdeclexprContext arrdeclexpr() throws RecognitionException {
		ArrdeclexprContext _localctx = new ArrdeclexprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_arrdeclexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(ID);
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(105);
				match(LBRACK);
				setState(106);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(107);
				match(RBRACK);
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			match(EQ);
			setState(114);
			expr();
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
	public static class ExprContext extends ParserRuleContext {
		public List<CompexprContext> compexpr() {
			return getRuleContexts(CompexprContext.class);
		}
		public CompexprContext compexpr(int i) {
			return getRuleContext(CompexprContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(MymssmallbasicParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(MymssmallbasicParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(MymssmallbasicParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(MymssmallbasicParser.OR, i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			compexpr();
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(117);
				_la = _input.LA(1);
				if ( !(_la==AND || _la==OR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(118);
				compexpr();
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class LabelContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MymssmallbasicParser.ID, 0); }
		public LabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_label; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelContext label() throws RecognitionException {
		LabelContext _localctx = new LabelContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			match(ID);
			setState(125);
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
	public static class FunccallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MymssmallbasicParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MymssmallbasicParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MymssmallbasicParser.RPAREN, 0); }
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitFunccall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ID);
			setState(128);
			match(LPAREN);
			setState(129);
			match(RPAREN);
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
	public static class KeyobjcallContext extends ParserRuleContext {
		public TerminalNode OBJKEYWORD() { return getToken(MymssmallbasicParser.OBJKEYWORD, 0); }
		public TerminalNode ID() { return getToken(MymssmallbasicParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(MymssmallbasicParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(MymssmallbasicParser.RPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public KeyobjcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyobjcall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitKeyobjcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyobjcallContext keyobjcall() throws RecognitionException {
		KeyobjcallContext _localctx = new KeyobjcallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_keyobjcall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(OBJKEYWORD);
			setState(132);
			match(T__1);
			setState(133);
			match(ID);
			setState(134);
			match(LPAREN);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2070175809536L) != 0)) {
				{
				setState(135);
				expr();
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(136);
					match(T__2);
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2070175809536L) != 0)) {
						{
						setState(137);
						expr();
						}
					}

					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(147);
			match(RPAREN);
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
	public static class CompexprContext extends ParserRuleContext {
		public List<ArithexprContext> arithexpr() {
			return getRuleContexts(ArithexprContext.class);
		}
		public ArithexprContext arithexpr(int i) {
			return getRuleContext(ArithexprContext.class,i);
		}
		public List<TerminalNode> ROP() { return getTokens(MymssmallbasicParser.ROP); }
		public TerminalNode ROP(int i) {
			return getToken(MymssmallbasicParser.ROP, i);
		}
		public CompexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitCompexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompexprContext compexpr() throws RecognitionException {
		CompexprContext _localctx = new CompexprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			arithexpr();
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ROP) {
				{
				{
				setState(150);
				match(ROP);
				setState(151);
				arithexpr();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class ArithexprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> ADD() { return getTokens(MymssmallbasicParser.ADD); }
		public TerminalNode ADD(int i) {
			return getToken(MymssmallbasicParser.ADD, i);
		}
		public List<TerminalNode> SUB() { return getTokens(MymssmallbasicParser.SUB); }
		public TerminalNode SUB(int i) {
			return getToken(MymssmallbasicParser.SUB, i);
		}
		public ArithexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitArithexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithexprContext arithexpr() throws RecognitionException {
		ArithexprContext _localctx = new ArithexprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arithexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			term();
			setState(162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ADD || _la==SUB) {
				{
				{
				setState(158);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(159);
				term();
				}
				}
				setState(164);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(MymssmallbasicParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(MymssmallbasicParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(MymssmallbasicParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(MymssmallbasicParser.DIV, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			factor();
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MUL || _la==DIV) {
				{
				{
				setState(166);
				_la = _input.LA(1);
				if ( !(_la==MUL || _la==DIV) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(167);
				factor();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
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
	public static class FactorContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode ADD() { return getToken(MymssmallbasicParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MymssmallbasicParser.SUB, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_factor);
		int _la;
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(173);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(174);
				atom();
				}
				break;
			case LPAREN:
			case INT:
			case DOUBLE:
			case ID:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				atom();
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
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MymssmallbasicParser.ID, 0); }
		public TerminalNode INT() { return getToken(MymssmallbasicParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(MymssmallbasicParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(MymssmallbasicParser.STRING, 0); }
		public TerminalNode LPAREN() { return getToken(MymssmallbasicParser.LPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MymssmallbasicParser.RPAREN, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atom);
		try {
			setState(186);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(ID);
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(INT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(DOUBLE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(STRING);
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				match(LPAREN);
				setState(183);
				expr();
				setState(184);
				match(RPAREN);
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
	public static class ForexprContext extends ParserRuleContext {
		public VardeclexprContext vardeclexpr() {
			return getRuleContext(VardeclexprContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public BlocknosubContext blocknosub() {
			return getRuleContext(BlocknosubContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MymssmallbasicParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MymssmallbasicParser.NEWLINE, i);
		}
		public ForexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitForexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForexprContext forexpr() throws RecognitionException {
		ForexprContext _localctx = new ForexprContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__3);
			setState(189);
			vardeclexpr();
			setState(190);
			match(T__4);
			setState(191);
			expr();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(192);
				match(T__5);
				setState(193);
				expr();
				}
			}

			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(196);
				match(NEWLINE);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			blocknosub();
			setState(203);
			match(T__6);
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
	public static class IfexprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MymssmallbasicParser.LPAREN, 0); }
		public CompexprContext compexpr() {
			return getRuleContext(CompexprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MymssmallbasicParser.RPAREN, 0); }
		public BlocknosubContext blocknosub() {
			return getRuleContext(BlocknosubContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MymssmallbasicParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MymssmallbasicParser.NEWLINE, i);
		}
		public List<ElseifexprContext> elseifexpr() {
			return getRuleContexts(ElseifexprContext.class);
		}
		public ElseifexprContext elseifexpr(int i) {
			return getRuleContext(ElseifexprContext.class,i);
		}
		public ElseexprContext elseexpr() {
			return getRuleContext(ElseexprContext.class,0);
		}
		public IfexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitIfexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfexprContext ifexpr() throws RecognitionException {
		IfexprContext _localctx = new IfexprContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_ifexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(T__7);
			setState(206);
			match(LPAREN);
			setState(207);
			compexpr();
			setState(208);
			match(RPAREN);
			setState(212);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(209);
				match(NEWLINE);
				}
				}
				setState(214);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(215);
			match(T__8);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(216);
				match(NEWLINE);
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(222);
			blocknosub();
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__10) {
				{
				{
				setState(223);
				elseifexpr();
				}
				}
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__11) {
				{
				setState(229);
				elseexpr();
				}
			}

			setState(232);
			match(T__9);
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
	public static class ElseifexprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MymssmallbasicParser.LPAREN, 0); }
		public CompexprContext compexpr() {
			return getRuleContext(CompexprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MymssmallbasicParser.RPAREN, 0); }
		public BlocknosubContext blocknosub() {
			return getRuleContext(BlocknosubContext.class,0);
		}
		public ElseifexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitElseifexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseifexprContext elseifexpr() throws RecognitionException {
		ElseifexprContext _localctx = new ElseifexprContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_elseifexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__10);
			setState(235);
			match(LPAREN);
			setState(236);
			compexpr();
			setState(237);
			match(RPAREN);
			setState(238);
			blocknosub();
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
	public static class ElseexprContext extends ParserRuleContext {
		public BlocknosubContext blocknosub() {
			return getRuleContext(BlocknosubContext.class,0);
		}
		public ElseexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitElseexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseexprContext elseexpr() throws RecognitionException {
		ElseexprContext _localctx = new ElseexprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elseexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__11);
			setState(241);
			blocknosub();
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
	public static class WhileexprContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(MymssmallbasicParser.LPAREN, 0); }
		public CompexprContext compexpr() {
			return getRuleContext(CompexprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(MymssmallbasicParser.RPAREN, 0); }
		public BlocknosubContext blocknosub() {
			return getRuleContext(BlocknosubContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(MymssmallbasicParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(MymssmallbasicParser.NEWLINE, i);
		}
		public WhileexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileexpr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitWhileexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileexprContext whileexpr() throws RecognitionException {
		WhileexprContext _localctx = new WhileexprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whileexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__12);
			setState(244);
			match(LPAREN);
			setState(245);
			compexpr();
			setState(246);
			match(RPAREN);
			setState(250);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(247);
				match(NEWLINE);
				}
				}
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(253);
			blocknosub();
			setState(254);
			match(T__13);
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
	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MymssmallbasicParser.ID, 0); }
		public BlocknosubContext blocknosub() {
			return getRuleContext(BlocknosubContext.class,0);
		}
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitFuncdef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__14);
			setState(257);
			match(ID);
			setState(258);
			blocknosub();
			setState(259);
			match(T__15);
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
		"\u0004\u0001)\u0106\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001"+
		"2\b\u0001\n\u0001\f\u00015\t\u0001\u0001\u0001\u0003\u00018\b\u0001\u0005"+
		"\u0001:\b\u0001\n\u0001\f\u0001=\t\u0001\u0001\u0002\u0001\u0002\u0005"+
		"\u0002A\b\u0002\n\u0002\f\u0002D\t\u0002\u0001\u0002\u0003\u0002G\b\u0002"+
		"\u0005\u0002I\b\u0002\n\u0002\f\u0002L\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0003\u0003X\b\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004c\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006"+
		"m\b\u0006\n\u0006\f\u0006p\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007x\b\u0007\n\u0007\f\u0007"+
		"{\t\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u008b\b\n\u0005"+
		"\n\u008d\b\n\n\n\f\n\u0090\t\n\u0003\n\u0092\b\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0099\b\u000b\n\u000b\f\u000b"+
		"\u009c\t\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00a1\b\f\n\f\f\f\u00a4"+
		"\t\f\u0001\r\u0001\r\u0001\r\u0005\r\u00a9\b\r\n\r\f\r\u00ac\t\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00b1\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u00bb\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00c3\b\u0010\u0001\u0010\u0005"+
		"\u0010\u00c6\b\u0010\n\u0010\f\u0010\u00c9\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0005\u0011\u00d3\b\u0011\n\u0011\f\u0011\u00d6\t\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u00da\b\u0011\n\u0011\f\u0011\u00dd\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0005\u0011\u00e1\b\u0011\n\u0011\f\u0011\u00e4\t\u0011\u0001"+
		"\u0011\u0003\u0011\u00e7\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u00f9\b\u0014\n\u0014\f\u0014\u00fc\t\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000"+
		"\u0004\u0002\u0000%%((\u0001\u0000\u0018\u0019\u0001\u0000\u0013\u0014"+
		"\u0001\u0000\u0011\u0012\u011a\u0000,\u0001\u0000\u0000\u0000\u0002;\u0001"+
		"\u0000\u0000\u0000\u0004J\u0001\u0000\u0000\u0000\u0006W\u0001\u0000\u0000"+
		"\u0000\bb\u0001\u0000\u0000\u0000\nd\u0001\u0000\u0000\u0000\fh\u0001"+
		"\u0000\u0000\u0000\u000et\u0001\u0000\u0000\u0000\u0010|\u0001\u0000\u0000"+
		"\u0000\u0012\u007f\u0001\u0000\u0000\u0000\u0014\u0083\u0001\u0000\u0000"+
		"\u0000\u0016\u0095\u0001\u0000\u0000\u0000\u0018\u009d\u0001\u0000\u0000"+
		"\u0000\u001a\u00a5\u0001\u0000\u0000\u0000\u001c\u00b0\u0001\u0000\u0000"+
		"\u0000\u001e\u00ba\u0001\u0000\u0000\u0000 \u00bc\u0001\u0000\u0000\u0000"+
		"\"\u00cd\u0001\u0000\u0000\u0000$\u00ea\u0001\u0000\u0000\u0000&\u00f0"+
		"\u0001\u0000\u0000\u0000(\u00f3\u0001\u0000\u0000\u0000*\u0100\u0001\u0000"+
		"\u0000\u0000,-\u0003\u0002\u0001\u0000-.\u0005\u0000\u0000\u0001.\u0001"+
		"\u0001\u0000\u0000\u0000/7\u0003\u0006\u0003\u000002\u0005)\u0000\u0000"+
		"10\u0001\u0000\u0000\u000025\u0001\u0000\u0000\u000031\u0001\u0000\u0000"+
		"\u000034\u0001\u0000\u0000\u000048\u0001\u0000\u0000\u000053\u0001\u0000"+
		"\u0000\u000068\u0005\u0000\u0000\u000173\u0001\u0000\u0000\u000076\u0001"+
		"\u0000\u0000\u00008:\u0001\u0000\u0000\u00009/\u0001\u0000\u0000\u0000"+
		":=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000"+
		"\u0000<\u0003\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000>F\u0003"+
		"\b\u0004\u0000?A\u0005)\u0000\u0000@?\u0001\u0000\u0000\u0000AD\u0001"+
		"\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000"+
		"CG\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000EG\u0005\u0000\u0000"+
		"\u0001FB\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000GI\u0001\u0000"+
		"\u0000\u0000H>\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000K\u0005\u0001\u0000\u0000"+
		"\u0000LJ\u0001\u0000\u0000\u0000MX\u0003\n\u0005\u0000NX\u0003\f\u0006"+
		"\u0000OX\u0003 \u0010\u0000PX\u0003\"\u0011\u0000QX\u0003*\u0015\u0000"+
		"RX\u0003(\u0014\u0000SX\u0005\u0016\u0000\u0000TX\u0003\u0010\b\u0000"+
		"UX\u0003\u0014\n\u0000VX\u0003\u0012\t\u0000WM\u0001\u0000\u0000\u0000"+
		"WN\u0001\u0000\u0000\u0000WO\u0001\u0000\u0000\u0000WP\u0001\u0000\u0000"+
		"\u0000WQ\u0001\u0000\u0000\u0000WR\u0001\u0000\u0000\u0000WS\u0001\u0000"+
		"\u0000\u0000WT\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001"+
		"\u0000\u0000\u0000X\u0007\u0001\u0000\u0000\u0000Yc\u0003\n\u0005\u0000"+
		"Zc\u0003\f\u0006\u0000[c\u0003 \u0010\u0000\\c\u0003\"\u0011\u0000]c\u0003"+
		"(\u0014\u0000^c\u0005\u0016\u0000\u0000_c\u0003\u0010\b\u0000`c\u0003"+
		"\u0014\n\u0000ac\u0003\u0012\t\u0000bY\u0001\u0000\u0000\u0000bZ\u0001"+
		"\u0000\u0000\u0000b[\u0001\u0000\u0000\u0000b\\\u0001\u0000\u0000\u0000"+
		"b]\u0001\u0000\u0000\u0000b^\u0001\u0000\u0000\u0000b_\u0001\u0000\u0000"+
		"\u0000b`\u0001\u0000\u0000\u0000ba\u0001\u0000\u0000\u0000c\t\u0001\u0000"+
		"\u0000\u0000de\u0005\'\u0000\u0000ef\u0005\u001a\u0000\u0000fg\u0003\u000e"+
		"\u0007\u0000g\u000b\u0001\u0000\u0000\u0000hn\u0005\'\u0000\u0000ij\u0005"+
		"#\u0000\u0000jk\u0007\u0000\u0000\u0000km\u0005$\u0000\u0000li\u0001\u0000"+
		"\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"qr\u0005\u001a\u0000\u0000rs\u0003\u000e\u0007\u0000s\r\u0001\u0000\u0000"+
		"\u0000ty\u0003\u0016\u000b\u0000uv\u0007\u0001\u0000\u0000vx\u0003\u0016"+
		"\u000b\u0000wu\u0001\u0000\u0000\u0000x{\u0001\u0000\u0000\u0000yw\u0001"+
		"\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000z\u000f\u0001\u0000\u0000"+
		"\u0000{y\u0001\u0000\u0000\u0000|}\u0005\'\u0000\u0000}~\u0005\u0001\u0000"+
		"\u0000~\u0011\u0001\u0000\u0000\u0000\u007f\u0080\u0005\'\u0000\u0000"+
		"\u0080\u0081\u0005!\u0000\u0000\u0081\u0082\u0005\"\u0000\u0000\u0082"+
		"\u0013\u0001\u0000\u0000\u0000\u0083\u0084\u0005\u0015\u0000\u0000\u0084"+
		"\u0085\u0005\u0002\u0000\u0000\u0085\u0086\u0005\'\u0000\u0000\u0086\u0091"+
		"\u0005!\u0000\u0000\u0087\u008e\u0003\u000e\u0007\u0000\u0088\u008a\u0005"+
		"\u0003\u0000\u0000\u0089\u008b\u0003\u000e\u0007\u0000\u008a\u0089\u0001"+
		"\u0000\u0000\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u008d\u0001"+
		"\u0000\u0000\u0000\u008c\u0088\u0001\u0000\u0000\u0000\u008d\u0090\u0001"+
		"\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001"+
		"\u0000\u0000\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001"+
		"\u0000\u0000\u0000\u0091\u0087\u0001\u0000\u0000\u0000\u0091\u0092\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u0005"+
		"\"\u0000\u0000\u0094\u0015\u0001\u0000\u0000\u0000\u0095\u009a\u0003\u0018"+
		"\f\u0000\u0096\u0097\u0005\u001b\u0000\u0000\u0097\u0099\u0003\u0018\f"+
		"\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000"+
		"\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000"+
		"\u0000\u009b\u0017\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000"+
		"\u0000\u009d\u00a2\u0003\u001a\r\u0000\u009e\u009f\u0007\u0002\u0000\u0000"+
		"\u009f\u00a1\u0003\u001a\r\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u0019\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a5\u00aa\u0003\u001c\u000e\u0000\u00a6"+
		"\u00a7\u0007\u0003\u0000\u0000\u00a7\u00a9\u0003\u001c\u000e\u0000\u00a8"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a9\u00ac\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a8\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab"+
		"\u001b\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0007\u0002\u0000\u0000\u00ae\u00b1\u0003\u001e\u000f\u0000\u00af"+
		"\u00b1\u0003\u001e\u000f\u0000\u00b0\u00ad\u0001\u0000\u0000\u0000\u00b0"+
		"\u00af\u0001\u0000\u0000\u0000\u00b1\u001d\u0001\u0000\u0000\u0000\u00b2"+
		"\u00bb\u0005\'\u0000\u0000\u00b3\u00bb\u0005%\u0000\u0000\u00b4\u00bb"+
		"\u0005&\u0000\u0000\u00b5\u00bb\u0005(\u0000\u0000\u00b6\u00b7\u0005!"+
		"\u0000\u0000\u00b7\u00b8\u0003\u000e\u0007\u0000\u00b8\u00b9\u0005\"\u0000"+
		"\u0000\u00b9\u00bb\u0001\u0000\u0000\u0000\u00ba\u00b2\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b3\u0001\u0000\u0000\u0000\u00ba\u00b4\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b5\u0001\u0000\u0000\u0000\u00ba\u00b6\u0001\u0000\u0000"+
		"\u0000\u00bb\u001f\u0001\u0000\u0000\u0000\u00bc\u00bd\u0005\u0004\u0000"+
		"\u0000\u00bd\u00be\u0003\n\u0005\u0000\u00be\u00bf\u0005\u0005\u0000\u0000"+
		"\u00bf\u00c2\u0003\u000e\u0007\u0000\u00c0\u00c1\u0005\u0006\u0000\u0000"+
		"\u00c1\u00c3\u0003\u000e\u0007\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c7\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c6\u0005)\u0000\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6"+
		"\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9"+
		"\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cb\u0003\u0004\u0002\u0000\u00cb"+
		"\u00cc\u0005\u0007\u0000\u0000\u00cc!\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0005\b\u0000\u0000\u00ce\u00cf\u0005!\u0000\u0000\u00cf\u00d0\u0003"+
		"\u0016\u000b\u0000\u00d0\u00d4\u0005\"\u0000\u0000\u00d1\u00d3\u0005)"+
		"\u0000\u0000\u00d2\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d6\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d7\u00db\u0005\t\u0000\u0000\u00d8\u00da\u0005)\u0000"+
		"\u0000\u00d9\u00d8\u0001\u0000\u0000\u0000\u00da\u00dd\u0001\u0000\u0000"+
		"\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00dc\u0001\u0000\u0000"+
		"\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000"+
		"\u0000\u00de\u00e2\u0003\u0004\u0002\u0000\u00df\u00e1\u0003$\u0012\u0000"+
		"\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e5\u00e7\u0003&\u0013\u0000\u00e6\u00e5\u0001\u0000\u0000\u0000\u00e6"+
		"\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0005\n\u0000\u0000\u00e9#\u0001\u0000\u0000\u0000\u00ea\u00eb"+
		"\u0005\u000b\u0000\u0000\u00eb\u00ec\u0005!\u0000\u0000\u00ec\u00ed\u0003"+
		"\u0016\u000b\u0000\u00ed\u00ee\u0005\"\u0000\u0000\u00ee\u00ef\u0003\u0004"+
		"\u0002\u0000\u00ef%\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\f\u0000"+
		"\u0000\u00f1\u00f2\u0003\u0004\u0002\u0000\u00f2\'\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0005\r\u0000\u0000\u00f4\u00f5\u0005!\u0000\u0000\u00f5"+
		"\u00f6\u0003\u0016\u000b\u0000\u00f6\u00fa\u0005\"\u0000\u0000\u00f7\u00f9"+
		"\u0005)\u0000\u0000\u00f8\u00f7\u0001\u0000\u0000\u0000\u00f9\u00fc\u0001"+
		"\u0000\u0000\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fe\u0003\u0004\u0002\u0000\u00fe\u00ff\u0005"+
		"\u000e\u0000\u0000\u00ff)\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u000f"+
		"\u0000\u0000\u0101\u0102\u0005\'\u0000\u0000\u0102\u0103\u0003\u0004\u0002"+
		"\u0000\u0103\u0104\u0005\u0010\u0000\u0000\u0104+\u0001\u0000\u0000\u0000"+
		"\u001937;BFJWbny\u008a\u008e\u0091\u009a\u00a2\u00aa\u00b0\u00ba\u00c2"+
		"\u00c7\u00d4\u00db\u00e2\u00e6\u00fa";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}