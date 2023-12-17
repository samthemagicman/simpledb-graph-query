package graph;

import db.DBHelper;
import org.antlr.v4.runtime.CharStreams;

import java.util.Scanner;

import org.antlr.v4.runtime.CommonTokenStream;
import graph.grammar.*;
import graph.visitor.CypherVisitor;

public class Antlr4test {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a query: ");
        String inp = "CREATE (person:Person {name: \"Sam Salfi\", email: \"samsalfi@yahoo.ca\"})-[:FRIENDS_WITH]->(:Person {name: \"Pamela\"})\n"
                + "MATCH (person:Person)-[likes:LIKES]-(movie:Movie)\n" +
                "RETURN person.name, person.born\n";

        // String input = scn.nextLine();

        // var lexer = new CypherLexer(CharStreams.fromString(inp));
        // var tokens = new CommonTokenStream(lexer);
        // var parser = new CypherParser(tokens);
        // var visitor = new CypherVisitor();
        // var results = visitor.visit(parser.query());

        Client client = new Client();
        client.initialize();
        client.processCommands(client.runQuery(inp));
    }

}
