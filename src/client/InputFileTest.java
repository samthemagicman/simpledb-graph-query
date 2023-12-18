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

                                // pass to Client
                                client.processQueries(client.processQueryString(inp));

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
