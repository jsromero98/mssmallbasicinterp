import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            MymssmallbasicLexer lexer ;
            if (args.length>0) {
                lexer = new MymssmallbasicLexer(CharStreams.fromFileName(args[0]));
            } else {
                System.out.println("console in mode:");
                lexer = new MymssmallbasicLexer(CharStreams.fromStream(System.in));
            }
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MymssmallbasicParser parser = new MymssmallbasicParser(tokens);
            ParseTree tree = parser.inicio();

            JsromeroMSSBVisitor loader = new JsromeroMSSBVisitor();
            loader.visit(tree);
            if (args.length>0) {
                System.out.println();
                System.out.println("Symbol table ----");
                System.out.println();
                System.out.println(loader.symtable);
            }
        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }
}

