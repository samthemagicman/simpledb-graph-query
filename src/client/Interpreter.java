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
                client.processQueries(client.processQueryString(inp));
                inp = "";
            }
            inp += "\n";
        }

        scn.close();
        client.close();
    }
}
