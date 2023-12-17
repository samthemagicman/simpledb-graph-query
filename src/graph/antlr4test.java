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
        // String inp = "CREATE (person:Person {name: \"Sam Salfi\", email:
        // \"samsalfi@yahoo.ca\"})-[:FRIENDS_WITH]->(:Person {name: \"Pamela\"})\n"
        String inp = "MATCH (person:Person {id: 40, email: \"samsalfi@yahoo.ca\"})\n" +
                "RETURN person\n";

        Client client = new Client();
        client.initialize();
        client.processCommands(client.runQuery(inp));
    }

}
