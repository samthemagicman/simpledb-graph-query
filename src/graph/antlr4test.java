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
        // String inp = "CREATE (person:Person {name:
        // \"Sam\"})-[:FRIENDS_WITH]->(:Person {name: \"Keir\"})";
        String inp = "MATCH (person:Person {email: \"samsalfi@yahoo.ca\"})<-[r:FRIENDS_WITH]-(m:Person)\n"
                +
                "RETURN m.name, person.name, person.email, m.email, r.description\n";

        Client client = new Client();
        client.initialize();
        client.processCommands(client.runQuery(inp));
    }

}
