import java.util.HashMap;

public class JsromeroMSSBVisitor extends MymssmallbasicBaseVisitor{
    HashMap<String,Object> symtable = new HashMap<>();

    @Override
    public Object visitExpr(MymssmallbasicParser.ExprContext ctx) {
        Object comp1 = visitCompexpr(ctx.compexpr(0));
        if ( (ctx.AND() != null || ctx.OR() != null) && ctx.compexpr(1) != null ){
            Object comp2 = visitCompexpr(ctx.compexpr(1));
            boolean bool1 = comp1.toString().equals("\"true\"");
            boolean bool2 = comp2.toString().equals("\"true\"");
            if (ctx.AND(0) != null){
                return bool1 && bool2;
            } else if (ctx.OR(0) != null){
                return bool1 | bool2;
            }
        } else {
            return comp1;
        }
        return super.visitExpr(ctx);
    }

    @Override
    public Object visitKeyobjcall(MymssmallbasicParser.KeyobjcallContext ctx) {
        if ( ctx.OBJKEYWORD().toString().equals("TextWindow")){
            if (ctx.ID().toString().equals("WriteLine")){
                System.out.println( visitExpr(ctx.expr(0)) );
            }
        }
        return super.visitKeyobjcall(ctx);
    }

    @Override
    public Object visitCompexpr(MymssmallbasicParser.CompexprContext ctx) {
        Object arith1 = visitArithexpr(ctx.arithexpr(0));
        if (ctx.ROP() != null && ctx.arithexpr(1) != null) {
            Object arith2 = visitArithexpr(ctx.arithexpr(1));
            String operator = ctx.ROP(0).toString();
            //System.out.println(arith1 + ","+arith1.getClass() + " - " + operator +","+ operator.getClass() + " - " + arith2 + ","+arith2.getClass() );
            if ( (arith1 instanceof Integer || arith1 instanceof  Double) && (arith2 instanceof Integer || arith2 instanceof  Double)) {
                switch (operator) {
                    case "=":
                        return arith1 == arith2;
                    case "<>":
                        return arith1 != arith2;
                    case ">=":
                        return Double.parseDouble(arith1.toString()) >= Double.parseDouble(arith2.toString());
                    case "<=":
                        return Double.parseDouble(arith1.toString()) <= Double.parseDouble(arith2.toString());
                    case ">":
                        return Double.parseDouble(arith1.toString()) > Double.parseDouble(arith2.toString());
                    case "<":
                        return Double.parseDouble(arith1.toString()) < Double.parseDouble(arith2.toString());
                }
            }
        } else {
            return arith1;
        }
        return super.visitCompexpr(ctx);
    }

    @Override
    public Object visitArithexpr(MymssmallbasicParser.ArithexprContext ctx) {
        Object term1 = visitTerm(ctx.term(0));
        if ( (ctx.ADD(0) != null || ctx.SUB(0) != null) && ctx.term(1) != null ){
            Object term2 = visitTerm(ctx.term(1));
            if ( term1 instanceof Integer && term2 instanceof Integer ){
                if (ctx.ADD(0) != null ){
                    return Integer.parseInt(term1.toString()) + Integer.parseInt(term2.toString());
                } else if (ctx.SUB(0) != null ){
                    return Integer.parseInt(term1.toString()) - Integer.parseInt(term2.toString());
                }
            } else if (term1 instanceof Double || term2 instanceof Double ){
                if (ctx.ADD(0) != null ){
                    return Double.parseDouble(term1.toString()) + Double.parseDouble(term2.toString());
                } else if (ctx.SUB(0) != null ){
                    return Double.parseDouble(term1.toString()) - Double.parseDouble(term2.toString());
                }
            } else if (term1 instanceof String && term2 instanceof String ) {
                if (ctx.ADD(0) != null ){
                    return term1.toString() + term2.toString();
                }
            }
        } else {
            return term1;
        }
        return super.visitArithexpr(ctx);
    }

    @Override
    public Object visitTerm(MymssmallbasicParser.TermContext ctx) {
        Object factor1 = visitFactor(ctx.factor(0));
        if ( (ctx.MUL(0) != null || ctx.DIV(0) != null) && ctx.factor(1) != null ){
            Object factor2 = visitFactor(ctx.factor(1));
            if (factor1 instanceof Integer && factor2 instanceof Integer){
                if (ctx.MUL(0) != null ){
                    return Integer.parseInt(factor1.toString()) * Integer.parseInt(factor2.toString());
                } else if (ctx.DIV(0) != null){
                    if (Double.parseDouble(factor2.toString()) == 0.0){
                        System.err.printf(" Error arimetico, division por 0 .\n");
                        System.exit(-1);
                    } else {
                        int remainder = Integer.parseInt(factor1.toString()) % Integer.parseInt(factor2.toString());
                        if (remainder == 0) {
                            return Integer.parseInt(factor1.toString()) / Integer.parseInt(factor2.toString());
                        } else {
                            return Double.parseDouble(factor1.toString()) / Double.parseDouble(factor2.toString());
                        }
                    }
                }
            } else if (factor1 instanceof Double || factor2 instanceof Double){
                if (ctx.MUL(0) != null ){
                    return Double.parseDouble(factor1.toString()) * Double.parseDouble(factor2.toString());
                } else if (ctx.DIV(0) != null){
                    if (Double.parseDouble(factor2.toString()) == 0.0){
                        System.err.printf("Error arimetico, division por 0 .\n");
                        System.exit(-1);
                    } else {
                        return Double.parseDouble(factor1.toString()) / Double.parseDouble(factor2.toString());
                    }
                }
            }
        } else {
            return factor1;
        }
        return super.visitTerm(ctx);
    }

    @Override
    public Object visitFactor(MymssmallbasicParser.FactorContext ctx) {
        Object atom = visitAtom(ctx.atom());
        if (atom instanceof Integer){
            if (ctx.SUB() != null) {
                return - Integer.parseInt(atom.toString());
            } else if (ctx.ADD() != null ) {
                return Integer.parseInt(atom.toString());
            }
        } else if (atom instanceof Double){
            if (ctx.SUB() != null) {
                return - Double.parseDouble(atom.toString());
            } else if (ctx.ADD() != null ) {
                return Double.parseDouble(atom.toString());
            }
        }
        return atom;
    }

    @Override
    public Object visitAtom(MymssmallbasicParser.AtomContext ctx) {
        if ( ctx.ID() != null ) {
            return symtable.get(ctx.ID().getText());
        } else if ( ctx.INT() != null ) {
            return Integer.parseInt(ctx.INT().getText());
        } else if ( ctx.DOUBLE() != null ) {
            return Double.parseDouble(ctx.DOUBLE().getText());
        } else if ( ctx.STRING() != null ) {
            return ctx.STRING().getText();
        } else if ( ctx.LPAREN() != null && ctx.RPAREN() != null ){
            return visitExpr(ctx.expr());
        }
        return super.visitAtom(ctx);
    }

    @Override
    public Object visitVardeclexpr(MymssmallbasicParser.VardeclexprContext ctx) {
        String varname = ctx.ID().getText();
        if (symtable.get(varname) != null){
            int line = ctx.ID().getSymbol().getLine();
            int col = ctx.ID().getSymbol().getCharPositionInLine()+1;
            System.err.printf("<%d:%d> Error semantico, la variable con nombre: \"" + varname + "\" ya fue declarada.\n", line, col);
            System.exit(-1);
        } else {
            symtable.put(varname, visitExpr(ctx.expr()));
        }
        return super.visitVardeclexpr(ctx);
    }


}
