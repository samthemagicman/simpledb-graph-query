package client;

import db.DBHelper;
import org.antlr.v4.runtime.CharStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.antlr.v4.runtime.CommonTokenStream;

import graph.grammar.*;
import graph.visitor.CypherVisitor;

public class app {

    public static void main(String[] args) {
        Client client = new Client();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a query: ");
        // String inp = "CREATE (person:Person {name: \"Sam Salfi\", email:
        // \"samsalfi@yahoo.ca\"})-[:FRIENDS_WITH]->(:Person {name: \"Pamela\"})\n"
        String inp = "MATCH (person:Person {id: 40, email: \"samsalfi@yahoo.ca\"})\n" +
                "RETURN person\n";


        client.initialize();
        client.processCommands(client.runQuery(inp));
    
        // //read input.txt
        // String inp = "";
        // try {
        //     File myObj = new File("input.txt");
        //     Scanner myReader = new Scanner(myObj);

        //     while (myReader.hasNextLine()) {
        //       String data = myReader.nextLine();
        //       inp += data + "\n";

    //           //pass to Client
    //             client.initialize();
    //             client.processCommands(client.runQuery(inp));

    //             // String output = client.processCommands(client.runQuery(inp));
                
    //             // write to output.txt
    //             try {
    //                 FileWriter myWriter = new FileWriter("output.txt");
    //                 myWriter.write(output);
    //                 myWriter.close();
    //                 System.out.println("Successfully wrote to the file.");
    //               } catch (IOException e) {
    //                 System.out.println("error occurred writing to output file.");
    //                 e.printStackTrace();
    //               }

    //         }
    //         myReader.close();
    //       } catch (FileNotFoundException e) {
    //         System.out.println("An error occurred.");
    //         e.printStackTrace();
    //       }

    //       //close connection
    //         client.close();
    }

}