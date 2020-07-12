package org.example;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 * @author vprusa
 * */
public class Main {
    /*
    // Scala
    object HelloWorld {
      def main(args: Array[String]) : Int {
        println("Hello, world!")
      }
    }

    // CPP

    #include <iostream>

    int main(int argc, char *argv[]) {
        std::cout << "Hello World!";
        return 0;
    }

    */

    public static void main(String ... args) {
        Main m = new Main();
        m.test();
    }

    private void test() {
        // https://www.baeldung.com/java-antlr
        // visitObjectDef will be visited
        String javaClassContent = "  object HelloWorld {\n" +
                "    def main(args: Array[String]) {\n" +
                "      println(\"Hello, world!\")\n" +
                "    }\n" +
                "  }";
        ScalaLexer lexer = new ScalaLexer(CharStreams.fromString(javaClassContent));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        ScalaParser parser = new ScalaParser(tokens);
        ParseTree tree = parser.compilationUnit();
        System.out.println(tree.getText());
        ScalaCppEmitter emitter = new ScalaCppEmitter();
        emitter.visit(tree);
        String cppCode = emitter.getSpacedText(emitter.prc);
        System.out.println(cppCode);
        String cppCode2 = emitter.getSpacedText(emitter.prcMain);
        System.out.println(cppCode2);
    }

}
