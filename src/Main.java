import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        try{
            MymssmallbasicLexer lexer = new MymssmallbasicLexer(CharStreams.fromFileName("input/input.txt"));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MymssmallbasicParser parser = new MymssmallbasicParser(tokens);
            ParseTree tree = parser.inicio();

            JsromeroMSSBVisitor loader = new JsromeroMSSBVisitor();
            loader.visit(tree);
        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }
}

