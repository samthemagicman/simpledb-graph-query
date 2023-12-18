package client;

import java.util.Scanner;

public class Interpreter {
    public static void main(String[] args) {
        Client client = new Client();
        client.initialize();
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter a query: ");

        String inp = "";

        while (true) {
            String data = scn.nextLine();
            if (data.equals("quit"))
                break;
            inp += data;
            if (inp.endsWith(";")) {
                System.out.println("--- Processing ---");
                try {
                    String[][] outputs = client.processQueries(client.processQueryString(inp));

                    // print output
                    for (int i = 0; i < outputs.length; i++) {
                        for (int j = 0; j < outputs[i].length; j++) {
                            System.out.println(outputs[i][j]);
                        }
                        System.out.println();
                    }

                } catch (Exception e) {
                    System.out.println("Error occurred: " + e.getMessage());
                }
                inp = "";
            }
            inp += "\n";
        }

        scn.close();
        client.close();
    }
}
