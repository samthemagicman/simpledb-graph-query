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

                        // pass to Client
                        String[][] outputs = client.processQueries(client.processQueryString(inp));

                        try {
                                FileWriter myWriter = new FileWriter("output.txt");
                                // print the last output of each query
                                for (int i = 0; i < outputs.length; i++) {
                                        for (int j = 0; j < outputs[i].length; j++) {
                                                System.out.println(outputs[i][j]);
                                                myWriter.write(outputs[i][j] + "\n");
                                        }
                                }
                                myWriter.close();
                                System.out.println("Successfully wrote to the file.");
                        } catch (IOException e) {
                                System.out.println("error occurred writing to output file.");
                                e.printStackTrace();
                        }

                        // write to output.txt

                        myReader.close();
                } catch (FileNotFoundException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                }

                // close connection
                client.close();
        }

}
