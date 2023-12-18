package client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class InputFileTest {

        public static void main(String[] args) {
                Client client = new Client();
                client.initialize();
                Scanner scn = new Scanner(System.in);
                System.out.println("Enter a query: ");

                // read input.txt
                String inp = "";
                try {
                        File myObj = new File("input.txt");
                        Scanner myReader = new Scanner(myObj);

                        while (myReader.hasNextLine()) {
                                String data = myReader.nextLine();
                                inp += data + "\n";
                        }

                        System.out.println(inp);

                        // pass to Client
                        String[][] outputs = client.processQueries(client.processQueryString(inp));

                        // print the last output of each query
                        for (int i = 0; i < outputs.length; i++) {
                                System.out.print(outputs[i][outputs[i].length - 1] + " ");
                                System.out.println();
                        }

                        // String output = client.processCommands(client.runQuery(inp));

                        // write to output.txt
                        try {
                                FileWriter myWriter = new FileWriter("output.txt");
                                // myWriter.write(output);
                                myWriter.close();
                                System.out.println("Successfully wrote to the file.");
                        } catch (IOException e) {
                                System.out.println("error occurred writing to output file.");
                                e.printStackTrace();
                        }
                        myReader.close();
                } catch (FileNotFoundException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                }

                // close connection
                client.close();
        }

}
