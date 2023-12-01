package graph;
import org.antlr.v4.runtime.CharStreams;

import java.util.Scanner;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.*;
import graph.grammar.*;
public class antlr4test {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a query: ");
        String inp = "CREATE (person:Person {name: \"Sam Salfi\", age: twentytwo})\n" + "MATCH (person:Person)-[likes:LIKES]-(movie:Movie)\n" +
                "RETURN person.name, person.born\n";

        // String input = scn.nextLine();

        var lexer = new CypherLexer(CharStreams.fromString(inp));
        var tokens = new CommonTokenStream(lexer);
        var parser = new CypherParser(tokens);
        var visitor = new CypherVisitor();
        var results = visitor.visit(parser.query());
        System.out.println(results);
    }


}
