
import java.util.HashMap;
import java.util.List;

public class JsromeroMSSBVisitor extends MymssmallbasicBaseVisitor{
    HashMap<String,Object> varsymtable = new HashMap<>();
    HashMap<String, List<Object>> arrsymtable = new HashMap<>();
    HashMap<String, HashMap<String,Object>> dictsymtable = new HashMap<>();

    @Override
    public Object visitExprand(MymssmallbasicParser.ExprandContext ctx) {
        Object comp1 = visitExpror(ctx.expror(0));
        if ( ctx.AND(0) != null  && ctx.expror(1) != null ){
            Object comp2 = visitExpror(ctx.expror(1));
            if (comp1 instanceof Boolean && comp2 instanceof Boolean) {
                return (boolean) comp1 && (boolean) comp2;
            } else if ( comp1 instanceof String && comp2 instanceof String ) {
                boolean bool1 = comp1.toString().equals("\"true\"");
                boolean bool2 = comp2.toString().equals("\"true\"");
                return bool1 && bool2;
            }
        } else {
            return comp1;
        }
        return super.visitExprand(ctx);
    }

    @Override
    public Object visitExpror(MymssmallbasicParser.ExprorContext ctx) {
        Object comp1 = visitCompexpr(ctx.compexpr(0));
        //System.out.println(comp1.getClass());
        if (  ctx.OR(0) != null && ctx.compexpr(1) != null ){
            Object comp2 = visitCompexpr(ctx.compexpr(1));
            if (comp1 instanceof Boolean && comp2 instanceof Boolean){
                return (boolean) comp1 || (boolean) comp2;
            } else if ( comp1 instanceof String && comp2 instanceof String ) {
                boolean bool1 = comp1.toString().equalsIgnoreCase("\"true\"");
                boolean bool2 = comp2.toString().equalsIgnoreCase("\"true\"");
                return bool1 || bool2;
            }
        } else {
            return comp1;
        }
        return super.visitExpror(ctx);
    }

    @Override
    public Object visitKeyobjcall(MymssmallbasicParser.KeyobjcallContext ctx) {
        if ( ctx.OBJKEYWORD().toString().equals("TextWindow")){
            if (ctx.ID().toString().equals("WriteLine")){
                System.out.println( visitExprand(ctx.exprand(0)).toString() );
            } else if (ctx.ID().toString().equals("Write")){
                System.out.print( visitExprand(ctx.exprand(0)).toString());
            }
        }
        return super.visitKeyobjcall(ctx);
    }

    @Override
    public Object visitCompexpr(MymssmallbasicParser.CompexprContext ctx) {
        Object arith1 = visitArithexpr(ctx.arithexpr(0));
        if ( (ctx.EQ() != null || ctx.NEQ() != null || ctx.LT() != null || ctx.GT() != null || ctx.LE() != null || ctx.GE() != null ) && ctx.arithexpr(1) != null) {
            Object arith2 = visitArithexpr(ctx.arithexpr(1));
            if ( (arith1 instanceof Integer || arith1 instanceof  Double) && (arith2 instanceof Integer || arith2 instanceof  Double)) {
                if ( ctx.EQ() != null ){
                    return arith1 == arith2;
                } else if ( ctx.NEQ() != null ){
                    return arith1 != arith2;
                } else if ( ctx.LT() != null ){
                    return Double.parseDouble(arith1.toString()) < Double.parseDouble(arith2.toString());
                } else if ( ctx.GT() != null ){
                    return Double.parseDouble(arith1.toString()) > Double.parseDouble(arith2.toString());
                } else if ( ctx.LE() != null ){
                    return Double.parseDouble(arith1.toString()) <= Double.parseDouble(arith2.toString());
                } else if ( ctx.GE() != null ) {
                    return Double.parseDouble(arith1.toString()) >= Double.parseDouble(arith2.toString());
                }
            }
        } else {
            return arith1;
        }
        return super.visitCompexpr(ctx);
    }

    @Override
    public Object visitArithexpr(MymssmallbasicParser.ArithexprContext ctx) {
        Object term = visitTerm(ctx.term());
        if ( (ctx.ADD() != null || ctx.SUB() != null) && ctx.arithexpr() != null ){
            Object arith = visitArithexpr(ctx.arithexpr());
            if ( arith instanceof Integer && term instanceof Integer ){
                if (ctx.ADD() != null ){
                    return Integer.parseInt(arith.toString()) + Integer.parseInt(term.toString());
                } else if (ctx.SUB() != null ){
                    return Integer.parseInt(arith.toString()) - Integer.parseInt(term.toString());
                }
            } else if (arith instanceof Double || term instanceof Double ){
                if (ctx.ADD() != null ){
                    return Double.parseDouble(arith.toString()) + Double.parseDouble(term.toString());
                } else if (ctx.SUB() != null ){
                    return Double.parseDouble(arith.toString()) - Double.parseDouble(term.toString());
                }
            } else if (arith instanceof String && term instanceof String ) {
                if (ctx.ADD() != null ){
                    return arith + term.toString();
                }
            }
        }
        return term;
    }

    @Override
    public Object visitTerm(MymssmallbasicParser.TermContext ctx) {
        Object factor = visitFactor(ctx.factor());
        if ( (ctx.MUL() != null || ctx.DIV() != null) && ctx.term() != null ){
            Object term = visitTerm(ctx.term());
            if (term instanceof Integer && factor instanceof Integer){
                if (ctx.MUL() != null ){
                    return Integer.parseInt(term.toString()) * Integer.parseInt(factor.toString());
                } else if (ctx.DIV() != null){
                    if (Double.parseDouble(factor.toString()) == 0.0){
                        System.err.printf(" Error arimetico, division por 0 .\n");
                        System.exit(-1);
                    } else {
                        int remainder = Integer.parseInt(term.toString()) % Integer.parseInt(factor.toString());
                        if (remainder == 0) {
                            return Integer.parseInt(term.toString()) / Integer.parseInt(factor.toString());
                        } else {
                            return Double.parseDouble(term.toString()) / Double.parseDouble(factor.toString());
                        }
                    }
                }
            } else if (term instanceof Double || factor instanceof Double){
                if (ctx.MUL() != null ){
                    return Double.parseDouble(term.toString()) * Double.parseDouble(factor.toString());
                } else if (ctx.DIV() != null){
                    if (Double.parseDouble(factor.toString()) == 0.0){
                        System.err.printf("Error arimetico, division por 0 .\n");
                        System.exit(-1);
                    } else {
                        return Double.parseDouble(term.toString()) / Double.parseDouble(factor.toString());
                    }
                }
            }
        }
        return factor;
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
        if ( ctx.varcall() != null ) {
            return visitVarcall(ctx.varcall());
        } else if ( ctx.INT() != null ) {
            return Integer.parseInt(ctx.INT().getText());
        } else if ( ctx.DOUBLE() != null ) {
            return Double.parseDouble(ctx.DOUBLE().getText());
        } else if ( ctx.STRING() != null ) {
            // comp1.toString().equals("\"true\"");
            if (ctx.STRING().getText().equalsIgnoreCase("\"true\"")){
                return true;
            } else if (ctx.STRING().getText().equalsIgnoreCase("\"false\"")){
                return false;
            } else {
                return ctx.STRING().getText().replaceAll("^\"|\"$", "");
            }
        } else if ( ctx.LPAREN() != null && ctx.RPAREN() != null ){
            return visitExprand(ctx.exprand());
        }
        return super.visitAtom(ctx);
    }

    @Override
    public Object visitVarcall(MymssmallbasicParser.VarcallContext ctx) {
        // TODO insert onto hashmaps
        return super.visitVarcall(ctx);
    }

    @Override
    public Object visitVardeclexpr(MymssmallbasicParser.VardeclexprContext ctx) {
        // TODO add lists and dicts
        String varname = ctx.ID().getText();
        if (varsymtable.get(varname) != null){
            varsymtable.replace(varname, visitExprand(ctx.exprand()));
        } else {
            varsymtable.put(varname, visitExprand(ctx.exprand()));
        }
        return super.visitVardeclexpr(ctx);
    }

    @Override
    public Object visitIfexpr(MymssmallbasicParser.IfexprContext ctx) {
        Object exprres = visitExprand(ctx.exprand());
        if (exprres instanceof Boolean){
            if (Boolean.parseBoolean(exprres.toString())){
                return visitBlocknosub(ctx.blocknosub());
            } else {
                boolean verflag = false;
                int elseifcount = ctx.elseifexpr().size();
                if (elseifcount > 0){
                    for (int i = 0; i < elseifcount; i++) {
                        Object elifexprres = visitExprand(ctx.elseifexpr(i).exprand());
                        if ((boolean) elifexprres){
                            visitBlocknosub(ctx.elseifexpr(i).blocknosub());
                            verflag = true;
                        }
                        if (verflag){
                            break;
                        }
                    }
                } if (! verflag ){
                    return visitElseexpr(ctx.elseexpr());
                }
            }
        }
        return super.visitIfexpr(ctx);
    }

    @Override
    public Object visitForexpr(MymssmallbasicParser.ForexprContext ctx) {
        visitVardeclexpr(ctx.vardeclexpr());
        String varname = ctx.vardeclexpr().ID().getText();
        int index =  Integer.parseInt(varsymtable.get(ctx.vardeclexpr().ID().getText()).toString());
        int limit = Integer.parseInt(visitArithexpr(ctx.arithexpr(0)).toString());
        int steping = 1;
        if ( ctx.arithexpr(1) != null ){
            steping = (int) visitArithexpr(ctx.arithexpr(1));
        }
        for ( ; index <= limit; ) {
            visitBlocknosub(ctx.blocknosub());
            int stepped = index += steping;
            varsymtable.put(varname,stepped);
        }
        return null;
    }

    @Override
    public Object visitWhileexpr(MymssmallbasicParser.WhileexprContext ctx) {
        Object exprres = visitExprand(ctx.exprand());
        while ((boolean) exprres){
            visitBlocknosub(ctx.blocknosub());
            exprres = visitExprand(ctx.exprand());
        }
        return super.visitWhileexpr(ctx);
    }
}
