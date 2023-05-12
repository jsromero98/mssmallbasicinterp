// Generated from C:/Users/johanlap21/Desktop/antlrmssmallbasicinter/grammar\Mymssmallbasic.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MymssmallbasicParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MymssmallbasicVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(MymssmallbasicParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(MymssmallbasicParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#blocknosub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlocknosub(MymssmallbasicParser.BlocknosubContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MymssmallbasicParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#statementnosub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementnosub(MymssmallbasicParser.StatementnosubContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#vardeclexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVardeclexpr(MymssmallbasicParser.VardeclexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#arrdeclexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrdeclexpr(MymssmallbasicParser.ArrdeclexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#exprand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprand(MymssmallbasicParser.ExprandContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#expror}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpror(MymssmallbasicParser.ExprorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel(MymssmallbasicParser.LabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#funccall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunccall(MymssmallbasicParser.FunccallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#keyobjcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyobjcall(MymssmallbasicParser.KeyobjcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#compexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompexpr(MymssmallbasicParser.CompexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#arithexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithexpr(MymssmallbasicParser.ArithexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(MymssmallbasicParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(MymssmallbasicParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(MymssmallbasicParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#forexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForexpr(MymssmallbasicParser.ForexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#ifexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfexpr(MymssmallbasicParser.IfexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#elseifexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseifexpr(MymssmallbasicParser.ElseifexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#elseexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseexpr(MymssmallbasicParser.ElseexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#whileexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileexpr(MymssmallbasicParser.WhileexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MymssmallbasicParser#funcdef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncdef(MymssmallbasicParser.FuncdefContext ctx);
}