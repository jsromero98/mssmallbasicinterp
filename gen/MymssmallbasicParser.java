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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		MUL=18, DIV=19, ADD=20, SUB=21, OBJKEYWORD=22, LINE_COMMENT=23, WS=24, 
		AND=25, OR=26, EQ=27, NEQ=28, GE=29, LE=30, GT=31, LT=32, LPAREN=33, RPAREN=34, 
		LBRACK=35, RBRACK=36, INT=37, DOUBLE=38, STRING=39, ID=40, NEWLINE=41;
	public static final int
		RULE_inicio = 0, RULE_block = 1, RULE_blocknosub = 2, RULE_statement = 3, 
		RULE_statementnosub = 4, RULE_vardeclexpr = 5, RULE_arrdeclexpr = 6, RULE_exprand = 7, 
		RULE_expror = 8, RULE_label = 9, RULE_goto = 10, RULE_funccall = 11, RULE_keyobjcall = 12, 
		RULE_compexpr = 13, RULE_arithexpr = 14, RULE_term = 15, RULE_factor = 16, 
		RULE_atom = 17, RULE_varcall = 18, RULE_forexpr = 19, RULE_ifexpr = 20, 
		RULE_elseifexpr = 21, RULE_elseexpr = 22, RULE_whileexpr = 23, RULE_funcdef = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "block", "blocknosub", "statement", "statementnosub", "vardeclexpr", 
			"arrdeclexpr", "exprand", "expror", "label", "goto", "funccall", "keyobjcall", 
			"compexpr", "arithexpr", "term", "factor", "atom", "varcall", "forexpr", 
			"ifexpr", "elseifexpr", "elseexpr", "whileexpr", "funcdef"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'Goto'", "'.'", "','", "'For'", "'To'", "'Step'", "'EndFor'", 
			"'If'", "'Then'", "'EndIf'", "'ElseIf'", "'Else'", "'While'", "'EndWhile'", 
			"'Sub'", "'EndSub'", "'*'", "'/'", "'+'", "'-'", null, null, null, "'And'", 
			"'Or'", "'='", "'<>'", "'>='", "'<='", "'>'", "'<'", "'('", "')'", "'['", 
			"']'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "MUL", "DIV", "ADD", "SUB", "OBJKEYWORD", 
			"LINE_COMMENT", "WS", "AND", "OR", "EQ", "NEQ", "GE", "LE", "GT", "LT", 
			"LPAREN", "RPAREN", "LBRACK", "RBRACK", "INT", "DOUBLE", "STRING", "ID", 
			"NEWLINE"
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
			setState(50);
			block();
			setState(51);
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
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099524293156L) != 0)) {
				{
				{
				setState(53);
				statement();
				setState(61);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(57);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(54);
						match(NEWLINE);
						}
						}
						setState(59);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case 2:
					{
					setState(60);
					match(EOF);
					}
					break;
				}
				}
				}
				setState(67);
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
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1099524227620L) != 0)) {
				{
				{
				setState(68);
				statementnosub();
				setState(76);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__1:
				case T__4:
				case T__7:
				case T__8:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__16:
				case OBJKEYWORD:
				case LINE_COMMENT:
				case ID:
				case NEWLINE:
					{
					setState(72);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==NEWLINE) {
						{
						{
						setState(69);
						match(NEWLINE);
						}
						}
						setState(74);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case EOF:
					{
					setState(75);
					match(EOF);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(82);
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
		public GotoContext goto_() {
			return getRuleContext(GotoContext.class,0);
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
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				vardeclexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				arrdeclexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				forexpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				ifexpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				funcdef();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				whileexpr();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				match(LINE_COMMENT);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(90);
				label();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(91);
				goto_();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(92);
				keyobjcall();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(93);
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
		public GotoContext goto_() {
			return getRuleContext(GotoContext.class,0);
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
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				vardeclexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				arrdeclexpr();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				forexpr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				ifexpr();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(100);
				whileexpr();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(101);
				match(LINE_COMMENT);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(102);
				label();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(103);
				goto_();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(104);
				keyobjcall();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(105);
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
		public ExprandContext exprand() {
			return getRuleContext(ExprandContext.class,0);
		}
		public KeyobjcallContext keyobjcall() {
			return getRuleContext(KeyobjcallContext.class,0);
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
			setState(108);
			match(ID);
			setState(109);
			match(EQ);
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(110);
				exprand();
				}
				break;
			case 2:
				{
				setState(111);
				keyobjcall();
				}
				break;
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
	public static class ArrdeclexprContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MymssmallbasicParser.ID, 0); }
		public TerminalNode EQ() { return getToken(MymssmallbasicParser.EQ, 0); }
		public ExprandContext exprand() {
			return getRuleContext(ExprandContext.class,0);
		}
		public KeyobjcallContext keyobjcall() {
			return getRuleContext(KeyobjcallContext.class,0);
		}
		public List<TerminalNode> LBRACK() { return getTokens(MymssmallbasicParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(MymssmallbasicParser.LBRACK, i);
		}
		public List<ArithexprContext> arithexpr() {
			return getRuleContexts(ArithexprContext.class);
		}
		public ArithexprContext arithexpr(int i) {
			return getRuleContext(ArithexprContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(MymssmallbasicParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(MymssmallbasicParser.RBRACK, i);
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
			setState(114);
			match(ID);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(115);
				match(LBRACK);
				setState(116);
				arithexpr(0);
				setState(117);
				match(RBRACK);
				}
				}
				setState(123);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(124);
			match(EQ);
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(125);
				exprand();
				}
				break;
			case 2:
				{
				setState(126);
				keyobjcall();
				}
				break;
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
	public static class ExprandContext extends ParserRuleContext {
		public List<ExprorContext> expror() {
			return getRuleContexts(ExprorContext.class);
		}
		public ExprorContext expror(int i) {
			return getRuleContext(ExprorContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(MymssmallbasicParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(MymssmallbasicParser.AND, i);
		}
		public ExprandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprand; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitExprand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprandContext exprand() throws RecognitionException {
		ExprandContext _localctx = new ExprandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			expror();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(130);
				match(AND);
				setState(131);
				expror();
				}
				}
				setState(136);
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
	public static class ExprorContext extends ParserRuleContext {
		public List<CompexprContext> compexpr() {
			return getRuleContexts(CompexprContext.class);
		}
		public CompexprContext compexpr(int i) {
			return getRuleContext(CompexprContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(MymssmallbasicParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(MymssmallbasicParser.OR, i);
		}
		public ExprorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expror; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitExpror(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprorContext expror() throws RecognitionException {
		ExprorContext _localctx = new ExprorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expror);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			compexpr();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(138);
				match(OR);
				setState(139);
				compexpr();
				}
				}
				setState(144);
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
		enterRule(_localctx, 18, RULE_label);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			match(ID);
			setState(146);
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
	public static class GotoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MymssmallbasicParser.ID, 0); }
		public GotoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goto; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitGoto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GotoContext goto_() throws RecognitionException {
		GotoContext _localctx = new GotoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_goto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__1);
			setState(149);
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
		enterRule(_localctx, 22, RULE_funccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(ID);
			setState(152);
			match(LPAREN);
			setState(153);
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
		public List<ExprandContext> exprand() {
			return getRuleContexts(ExprandContext.class);
		}
		public ExprandContext exprand(int i) {
			return getRuleContext(ExprandContext.class,i);
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
		enterRule(_localctx, 24, RULE_keyobjcall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(OBJKEYWORD);
			setState(156);
			match(T__2);
			setState(157);
			match(ID);
			setState(158);
			match(LPAREN);
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2070181576704L) != 0)) {
				{
				setState(159);
				exprand();
				setState(166);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(160);
					match(T__3);
					setState(162);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 2070181576704L) != 0)) {
						{
						setState(161);
						exprand();
						}
					}

					}
					}
					setState(168);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(171);
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
		public TerminalNode EQ() { return getToken(MymssmallbasicParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(MymssmallbasicParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(MymssmallbasicParser.LT, 0); }
		public TerminalNode GT() { return getToken(MymssmallbasicParser.GT, 0); }
		public TerminalNode LE() { return getToken(MymssmallbasicParser.LE, 0); }
		public TerminalNode GE() { return getToken(MymssmallbasicParser.GE, 0); }
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
		enterRule(_localctx, 26, RULE_compexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			arithexpr(0);
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716864L) != 0)) {
				{
				setState(174);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8455716864L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(175);
				arithexpr(0);
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
	public static class ArithexprContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public ArithexprContext arithexpr() {
			return getRuleContext(ArithexprContext.class,0);
		}
		public TerminalNode ADD() { return getToken(MymssmallbasicParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(MymssmallbasicParser.SUB, 0); }
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
		return arithexpr(0);
	}

	private ArithexprContext arithexpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithexprContext _localctx = new ArithexprContext(_ctx, _parentState);
		ArithexprContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_arithexpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(179);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(186);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArithexprContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_arithexpr);
					setState(181);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(182);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==SUB) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(183);
					term(0);
					}
					} 
				}
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode MUL() { return getToken(MymssmallbasicParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(MymssmallbasicParser.DIV, 0); }
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
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_term, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(190);
			factor();
			}
			_ctx.stop = _input.LT(-1);
			setState(197);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(192);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(193);
					_la = _input.LA(1);
					if ( !(_la==MUL || _la==DIV) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(194);
					factor();
					}
					} 
				}
				setState(199);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 32, RULE_factor);
		int _la;
		try {
			setState(203);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ADD:
			case SUB:
				enterOuterAlt(_localctx, 1);
				{
				setState(200);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(201);
				atom();
				}
				break;
			case OBJKEYWORD:
			case LPAREN:
			case INT:
			case DOUBLE:
			case STRING:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
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
		public VarcallContext varcall() {
			return getRuleContext(VarcallContext.class,0);
		}
		public TerminalNode INT() { return getToken(MymssmallbasicParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(MymssmallbasicParser.DOUBLE, 0); }
		public TerminalNode STRING() { return getToken(MymssmallbasicParser.STRING, 0); }
		public KeyobjcallContext keyobjcall() {
			return getRuleContext(KeyobjcallContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(MymssmallbasicParser.LPAREN, 0); }
		public ExprandContext exprand() {
			return getRuleContext(ExprandContext.class,0);
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
		enterRule(_localctx, 34, RULE_atom);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				varcall();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(INT);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(207);
				match(DOUBLE);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(STRING);
				}
				break;
			case OBJKEYWORD:
				enterOuterAlt(_localctx, 5);
				{
				setState(209);
				keyobjcall();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 6);
				{
				setState(210);
				match(LPAREN);
				setState(211);
				exprand();
				setState(212);
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
	public static class VarcallContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MymssmallbasicParser.ID, 0); }
		public List<TerminalNode> LBRACK() { return getTokens(MymssmallbasicParser.LBRACK); }
		public TerminalNode LBRACK(int i) {
			return getToken(MymssmallbasicParser.LBRACK, i);
		}
		public List<ArithexprContext> arithexpr() {
			return getRuleContexts(ArithexprContext.class);
		}
		public ArithexprContext arithexpr(int i) {
			return getRuleContext(ArithexprContext.class,i);
		}
		public List<TerminalNode> RBRACK() { return getTokens(MymssmallbasicParser.RBRACK); }
		public TerminalNode RBRACK(int i) {
			return getToken(MymssmallbasicParser.RBRACK, i);
		}
		public VarcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varcall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MymssmallbasicVisitor ) return ((MymssmallbasicVisitor<? extends T>)visitor).visitVarcall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarcallContext varcall() throws RecognitionException {
		VarcallContext _localctx = new VarcallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_varcall);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(ID);
			setState(223);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(217);
					match(LBRACK);
					setState(218);
					arithexpr(0);
					setState(219);
					match(RBRACK);
					}
					} 
				}
				setState(225);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
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
	public static class ForexprContext extends ParserRuleContext {
		public VardeclexprContext vardeclexpr() {
			return getRuleContext(VardeclexprContext.class,0);
		}
		public List<ArithexprContext> arithexpr() {
			return getRuleContexts(ArithexprContext.class);
		}
		public ArithexprContext arithexpr(int i) {
			return getRuleContext(ArithexprContext.class,i);
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
		enterRule(_localctx, 38, RULE_forexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__4);
			setState(227);
			vardeclexpr();
			setState(228);
			match(T__5);
			setState(229);
			arithexpr(0);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(230);
				match(T__6);
				setState(231);
				arithexpr(0);
				}
			}

			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(234);
				match(NEWLINE);
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
			blocknosub();
			setState(241);
			match(T__7);
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
		public ExprandContext exprand() {
			return getRuleContext(ExprandContext.class,0);
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
		enterRule(_localctx, 40, RULE_ifexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			match(T__8);
			setState(244);
			match(LPAREN);
			setState(245);
			exprand();
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
			match(T__9);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(254);
				match(NEWLINE);
				}
				}
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(260);
			blocknosub();
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__11) {
				{
				{
				setState(261);
				elseifexpr();
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(267);
				elseexpr();
				}
			}

			setState(270);
			match(T__10);
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
		public ExprandContext exprand() {
			return getRuleContext(ExprandContext.class,0);
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
		enterRule(_localctx, 42, RULE_elseifexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__11);
			setState(273);
			match(LPAREN);
			setState(274);
			exprand();
			setState(275);
			match(RPAREN);
			setState(276);
			match(T__9);
			setState(277);
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
		enterRule(_localctx, 44, RULE_elseexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(T__12);
			setState(280);
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
		public ExprandContext exprand() {
			return getRuleContext(ExprandContext.class,0);
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
		enterRule(_localctx, 46, RULE_whileexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__13);
			setState(283);
			match(LPAREN);
			setState(284);
			exprand();
			setState(285);
			match(RPAREN);
			setState(289);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(286);
				match(NEWLINE);
				}
				}
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(292);
			blocknosub();
			setState(293);
			match(T__14);
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
		enterRule(_localctx, 48, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__15);
			setState(296);
			match(ID);
			setState(297);
			blocknosub();
			setState(298);
			match(T__16);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return arithexpr_sempred((ArithexprContext)_localctx, predIndex);
		case 15:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithexpr_sempred(ArithexprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001)\u012d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0005\u0001"+
		"8\b\u0001\n\u0001\f\u0001;\t\u0001\u0001\u0001\u0003\u0001>\b\u0001\u0005"+
		"\u0001@\b\u0001\n\u0001\f\u0001C\t\u0001\u0001\u0002\u0001\u0002\u0005"+
		"\u0002G\b\u0002\n\u0002\f\u0002J\t\u0002\u0001\u0002\u0003\u0002M\b\u0002"+
		"\u0005\u0002O\b\u0002\n\u0002\f\u0002R\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003_\b\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004k\b\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005q\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006x\b\u0006"+
		"\n\u0006\f\u0006{\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0080\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u0085\b"+
		"\u0007\n\u0007\f\u0007\u0088\t\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u008d"+
		"\b\b\n\b\f\b\u0090\t\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a3\b\f\u0005\f\u00a5\b\f"+
		"\n\f\f\f\u00a8\t\f\u0003\f\u00aa\b\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001"+
		"\r\u0003\r\u00b1\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0005\u000e\u00b9\b\u000e\n\u000e\f\u000e\u00bc\t\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u00c4\b\u000f\n\u000f\f\u000f\u00c7\t\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u00cc\b\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00d7\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u00de\b\u0012\n\u0012\f\u0012\u00e1\t\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u00e9\b\u0013\u0001\u0013\u0005\u0013\u00ec\b\u0013\n\u0013"+
		"\f\u0013\u00ef\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00f9\b\u0014"+
		"\n\u0014\f\u0014\u00fc\t\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0100"+
		"\b\u0014\n\u0014\f\u0014\u0103\t\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u0107\b\u0014\n\u0014\f\u0014\u010a\t\u0014\u0001\u0014\u0003\u0014\u010d"+
		"\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005"+
		"\u0017\u0120\b\u0017\n\u0017\f\u0017\u0123\t\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0000\u0002\u001c\u001e\u0019\u0000\u0002\u0004\u0006\b\n"+
		"\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.0\u0000"+
		"\u0003\u0001\u0000\u001b \u0001\u0000\u0014\u0015\u0001\u0000\u0012\u0013"+
		"\u0145\u00002\u0001\u0000\u0000\u0000\u0002A\u0001\u0000\u0000\u0000\u0004"+
		"P\u0001\u0000\u0000\u0000\u0006^\u0001\u0000\u0000\u0000\bj\u0001\u0000"+
		"\u0000\u0000\nl\u0001\u0000\u0000\u0000\fr\u0001\u0000\u0000\u0000\u000e"+
		"\u0081\u0001\u0000\u0000\u0000\u0010\u0089\u0001\u0000\u0000\u0000\u0012"+
		"\u0091\u0001\u0000\u0000\u0000\u0014\u0094\u0001\u0000\u0000\u0000\u0016"+
		"\u0097\u0001\u0000\u0000\u0000\u0018\u009b\u0001\u0000\u0000\u0000\u001a"+
		"\u00ad\u0001\u0000\u0000\u0000\u001c\u00b2\u0001\u0000\u0000\u0000\u001e"+
		"\u00bd\u0001\u0000\u0000\u0000 \u00cb\u0001\u0000\u0000\u0000\"\u00d6"+
		"\u0001\u0000\u0000\u0000$\u00d8\u0001\u0000\u0000\u0000&\u00e2\u0001\u0000"+
		"\u0000\u0000(\u00f3\u0001\u0000\u0000\u0000*\u0110\u0001\u0000\u0000\u0000"+
		",\u0117\u0001\u0000\u0000\u0000.\u011a\u0001\u0000\u0000\u00000\u0127"+
		"\u0001\u0000\u0000\u000023\u0003\u0002\u0001\u000034\u0005\u0000\u0000"+
		"\u00014\u0001\u0001\u0000\u0000\u00005=\u0003\u0006\u0003\u000068\u0005"+
		")\u0000\u000076\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:>\u0001\u0000\u0000\u0000"+
		";9\u0001\u0000\u0000\u0000<>\u0005\u0000\u0000\u0001=9\u0001\u0000\u0000"+
		"\u0000=<\u0001\u0000\u0000\u0000>@\u0001\u0000\u0000\u0000?5\u0001\u0000"+
		"\u0000\u0000@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000B\u0003\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000"+
		"\u0000DL\u0003\b\u0004\u0000EG\u0005)\u0000\u0000FE\u0001\u0000\u0000"+
		"\u0000GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000"+
		"\u0000\u0000IM\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000KM\u0005"+
		"\u0000\u0000\u0001LH\u0001\u0000\u0000\u0000LK\u0001\u0000\u0000\u0000"+
		"MO\u0001\u0000\u0000\u0000ND\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000Q\u0005\u0001"+
		"\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000S_\u0003\n\u0005\u0000T_\u0003"+
		"\f\u0006\u0000U_\u0003&\u0013\u0000V_\u0003(\u0014\u0000W_\u00030\u0018"+
		"\u0000X_\u0003.\u0017\u0000Y_\u0005\u0017\u0000\u0000Z_\u0003\u0012\t"+
		"\u0000[_\u0003\u0014\n\u0000\\_\u0003\u0018\f\u0000]_\u0003\u0016\u000b"+
		"\u0000^S\u0001\u0000\u0000\u0000^T\u0001\u0000\u0000\u0000^U\u0001\u0000"+
		"\u0000\u0000^V\u0001\u0000\u0000\u0000^W\u0001\u0000\u0000\u0000^X\u0001"+
		"\u0000\u0000\u0000^Y\u0001\u0000\u0000\u0000^Z\u0001\u0000\u0000\u0000"+
		"^[\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000"+
		"\u0000_\u0007\u0001\u0000\u0000\u0000`k\u0003\n\u0005\u0000ak\u0003\f"+
		"\u0006\u0000bk\u0003&\u0013\u0000ck\u0003(\u0014\u0000dk\u0003.\u0017"+
		"\u0000ek\u0005\u0017\u0000\u0000fk\u0003\u0012\t\u0000gk\u0003\u0014\n"+
		"\u0000hk\u0003\u0018\f\u0000ik\u0003\u0016\u000b\u0000j`\u0001\u0000\u0000"+
		"\u0000ja\u0001\u0000\u0000\u0000jb\u0001\u0000\u0000\u0000jc\u0001\u0000"+
		"\u0000\u0000jd\u0001\u0000\u0000\u0000je\u0001\u0000\u0000\u0000jf\u0001"+
		"\u0000\u0000\u0000jg\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"ji\u0001\u0000\u0000\u0000k\t\u0001\u0000\u0000\u0000lm\u0005(\u0000\u0000"+
		"mp\u0005\u001b\u0000\u0000nq\u0003\u000e\u0007\u0000oq\u0003\u0018\f\u0000"+
		"pn\u0001\u0000\u0000\u0000po\u0001\u0000\u0000\u0000q\u000b\u0001\u0000"+
		"\u0000\u0000ry\u0005(\u0000\u0000st\u0005#\u0000\u0000tu\u0003\u001c\u000e"+
		"\u0000uv\u0005$\u0000\u0000vx\u0001\u0000\u0000\u0000ws\u0001\u0000\u0000"+
		"\u0000x{\u0001\u0000\u0000\u0000yw\u0001\u0000\u0000\u0000yz\u0001\u0000"+
		"\u0000\u0000z|\u0001\u0000\u0000\u0000{y\u0001\u0000\u0000\u0000|\u007f"+
		"\u0005\u001b\u0000\u0000}\u0080\u0003\u000e\u0007\u0000~\u0080\u0003\u0018"+
		"\f\u0000\u007f}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000"+
		"\u0080\r\u0001\u0000\u0000\u0000\u0081\u0086\u0003\u0010\b\u0000\u0082"+
		"\u0083\u0005\u0019\u0000\u0000\u0083\u0085\u0003\u0010\b\u0000\u0084\u0082"+
		"\u0001\u0000\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084"+
		"\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u000f"+
		"\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008e"+
		"\u0003\u001a\r\u0000\u008a\u008b\u0005\u001a\u0000\u0000\u008b\u008d\u0003"+
		"\u001a\r\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008d\u0090\u0001\u0000"+
		"\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f\u0001\u0000"+
		"\u0000\u0000\u008f\u0011\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0005(\u0000\u0000\u0092\u0093\u0005\u0001\u0000"+
		"\u0000\u0093\u0013\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0002\u0000"+
		"\u0000\u0095\u0096\u0005(\u0000\u0000\u0096\u0015\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0005(\u0000\u0000\u0098\u0099\u0005!\u0000\u0000\u0099\u009a"+
		"\u0005\"\u0000\u0000\u009a\u0017\u0001\u0000\u0000\u0000\u009b\u009c\u0005"+
		"\u0016\u0000\u0000\u009c\u009d\u0005\u0003\u0000\u0000\u009d\u009e\u0005"+
		"(\u0000\u0000\u009e\u00a9\u0005!\u0000\u0000\u009f\u00a6\u0003\u000e\u0007"+
		"\u0000\u00a0\u00a2\u0005\u0004\u0000\u0000\u00a1\u00a3\u0003\u000e\u0007"+
		"\u0000\u00a2\u00a1\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a5\u0001\u0000\u0000\u0000\u00a4\u00a0\u0001\u0000\u0000"+
		"\u0000\u00a5\u00a8\u0001\u0000\u0000\u0000\u00a6\u00a4\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a9\u009f\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0005\"\u0000\u0000\u00ac\u0019\u0001\u0000\u0000\u0000"+
		"\u00ad\u00b0\u0003\u001c\u000e\u0000\u00ae\u00af\u0007\u0000\u0000\u0000"+
		"\u00af\u00b1\u0003\u001c\u000e\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b1\u0001\u0000\u0000\u0000\u00b1\u001b\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0006\u000e\uffff\uffff\u0000\u00b3\u00b4\u0003\u001e\u000f"+
		"\u0000\u00b4\u00ba\u0001\u0000\u0000\u0000\u00b5\u00b6\n\u0002\u0000\u0000"+
		"\u00b6\u00b7\u0007\u0001\u0000\u0000\u00b7\u00b9\u0003\u001e\u000f\u0000"+
		"\u00b8\u00b5\u0001\u0000\u0000\u0000\u00b9\u00bc\u0001\u0000\u0000\u0000"+
		"\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000"+
		"\u00bb\u001d\u0001\u0000\u0000\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000"+
		"\u00bd\u00be\u0006\u000f\uffff\uffff\u0000\u00be\u00bf\u0003 \u0010\u0000"+
		"\u00bf\u00c5\u0001\u0000\u0000\u0000\u00c0\u00c1\n\u0002\u0000\u0000\u00c1"+
		"\u00c2\u0007\u0002\u0000\u0000\u00c2\u00c4\u0003 \u0010\u0000\u00c3\u00c0"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c7\u0001\u0000\u0000\u0000\u00c5\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c5\u00c6\u0001\u0000\u0000\u0000\u00c6\u001f"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0007\u0001\u0000\u0000\u00c9\u00cc\u0003\"\u0011\u0000\u00ca\u00cc\u0003"+
		"\"\u0011\u0000\u00cb\u00c8\u0001\u0000\u0000\u0000\u00cb\u00ca\u0001\u0000"+
		"\u0000\u0000\u00cc!\u0001\u0000\u0000\u0000\u00cd\u00d7\u0003$\u0012\u0000"+
		"\u00ce\u00d7\u0005%\u0000\u0000\u00cf\u00d7\u0005&\u0000\u0000\u00d0\u00d7"+
		"\u0005\'\u0000\u0000\u00d1\u00d7\u0003\u0018\f\u0000\u00d2\u00d3\u0005"+
		"!\u0000\u0000\u00d3\u00d4\u0003\u000e\u0007\u0000\u00d4\u00d5\u0005\""+
		"\u0000\u0000\u00d5\u00d7\u0001\u0000\u0000\u0000\u00d6\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d6\u00ce\u0001\u0000\u0000\u0000\u00d6\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d0\u0001\u0000\u0000\u0000\u00d6\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d2\u0001\u0000\u0000\u0000\u00d7#\u0001\u0000\u0000"+
		"\u0000\u00d8\u00df\u0005(\u0000\u0000\u00d9\u00da\u0005#\u0000\u0000\u00da"+
		"\u00db\u0003\u001c\u000e\u0000\u00db\u00dc\u0005$\u0000\u0000\u00dc\u00de"+
		"\u0001\u0000\u0000\u0000\u00dd\u00d9\u0001\u0000\u0000\u0000\u00de\u00e1"+
		"\u0001\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e0%\u0001\u0000\u0000\u0000\u00e1\u00df\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e3\u0005\u0005\u0000\u0000\u00e3\u00e4\u0003"+
		"\n\u0005\u0000\u00e4\u00e5\u0005\u0006\u0000\u0000\u00e5\u00e8\u0003\u001c"+
		"\u000e\u0000\u00e6\u00e7\u0005\u0007\u0000\u0000\u00e7\u00e9\u0003\u001c"+
		"\u000e\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e8\u00e9\u0001\u0000"+
		"\u0000\u0000\u00e9\u00ed\u0001\u0000\u0000\u0000\u00ea\u00ec\u0005)\u0000"+
		"\u0000\u00eb\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000"+
		"\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0003\u0004\u0002\u0000\u00f1\u00f2\u0005\b\u0000\u0000"+
		"\u00f2\'\u0001\u0000\u0000\u0000\u00f3\u00f4\u0005\t\u0000\u0000\u00f4"+
		"\u00f5\u0005!\u0000\u0000\u00f5\u00f6\u0003\u000e\u0007\u0000\u00f6\u00fa"+
		"\u0005\"\u0000\u0000\u00f7\u00f9\u0005)\u0000\u0000\u00f8\u00f7\u0001"+
		"\u0000\u0000\u0000\u00f9\u00fc\u0001\u0000\u0000\u0000\u00fa\u00f8\u0001"+
		"\u0000\u0000\u0000\u00fa\u00fb\u0001\u0000\u0000\u0000\u00fb\u00fd\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd\u0101\u0005"+
		"\n\u0000\u0000\u00fe\u0100\u0005)\u0000\u0000\u00ff\u00fe\u0001\u0000"+
		"\u0000\u0000\u0100\u0103\u0001\u0000\u0000\u0000\u0101\u00ff\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0104\u0001\u0000"+
		"\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0104\u0108\u0003\u0004"+
		"\u0002\u0000\u0105\u0107\u0003*\u0015\u0000\u0106\u0105\u0001\u0000\u0000"+
		"\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000"+
		"\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010c\u0001\u0000\u0000"+
		"\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010d\u0003,\u0016\u0000"+
		"\u010c\u010b\u0001\u0000\u0000\u0000\u010c\u010d\u0001\u0000\u0000\u0000"+
		"\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u010f\u0005\u000b\u0000\u0000"+
		"\u010f)\u0001\u0000\u0000\u0000\u0110\u0111\u0005\f\u0000\u0000\u0111"+
		"\u0112\u0005!\u0000\u0000\u0112\u0113\u0003\u000e\u0007\u0000\u0113\u0114"+
		"\u0005\"\u0000\u0000\u0114\u0115\u0005\n\u0000\u0000\u0115\u0116\u0003"+
		"\u0004\u0002\u0000\u0116+\u0001\u0000\u0000\u0000\u0117\u0118\u0005\r"+
		"\u0000\u0000\u0118\u0119\u0003\u0004\u0002\u0000\u0119-\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0005\u000e\u0000\u0000\u011b\u011c\u0005!\u0000\u0000"+
		"\u011c\u011d\u0003\u000e\u0007\u0000\u011d\u0121\u0005\"\u0000\u0000\u011e"+
		"\u0120\u0005)\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000\u0120\u0123"+
		"\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0122"+
		"\u0001\u0000\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u0121"+
		"\u0001\u0000\u0000\u0000\u0124\u0125\u0003\u0004\u0002\u0000\u0125\u0126"+
		"\u0005\u000f\u0000\u0000\u0126/\u0001\u0000\u0000\u0000\u0127\u0128\u0005"+
		"\u0010\u0000\u0000\u0128\u0129\u0005(\u0000\u0000\u0129\u012a\u0003\u0004"+
		"\u0002\u0000\u012a\u012b\u0005\u0011\u0000\u0000\u012b1\u0001\u0000\u0000"+
		"\u0000\u001d9=AHLP^jpy\u007f\u0086\u008e\u00a2\u00a6\u00a9\u00b0\u00ba"+
		"\u00c5\u00cb\u00d6\u00df\u00e8\u00ed\u00fa\u0101\u0108\u010c\u0121";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}