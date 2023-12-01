package simpledb.graph;

import java.util.Scanner;
import java.util.regex.Pattern;

public class graphInterpreter {

    private static simpleDBHelper db = new simpleDBHelper();
    private static Scanner scanner = new Scanner(System.in);
    private static String graphName = "";
    public static void main(String[] args){
        
        // print opening message to user:
        int userinput = openingMessage();

        if(userinput == 1){
            graphName = createNewGraph();
        }
        else if(userinput == 2){
            loadExistingGraph();
        }
        else{
            System.exit(0);
        }

        // print message to user
        System.out.println("Please enter the query you want to execute");
        System.out.println("or exit to exit the program:");

        String userQuery = "";
        userQuery = scanner.nextLine();

        while (userQuery.toLowerCase() != "exit") {
            // parse and execute query
            parseAndExecuteQuery(userQuery);

            System.out.println("Please enter the query you want to execute");
            System.out.println("or exit to exit the program:");
            
            userQuery = scanner.nextLine();
        }
        System.out.println("Exiting program.");
        System.exit(0);
    }

    public static void parseAndExecuteQuery(String cypherQuery){
        // parse query
        cypherQuery = cypherQuery.toLowerCase();
        String[] queryParts = cypherQuery.split(" ");

        if (queryParts[0] == "create"){
            resolveCreateQuery(queryParts, cypherQuery);
        }
    }

    public static void resolveCreateQuery(String[] queryParts, String cypherQuery){

        // create node example: CREATE (node:Label {property: value}) 
        // create edge example: CREATE (node1)-[:RELATIONSHIP]->(node2)

        Pattern nodePattern = Pattern.compile("\\(\\w+\\:\\w+ \\{\\w+\\:\\w+\\}\\)");
        Pattern edgePattern = Pattern.compile("\\(\\w+\\)\\-\\[\\:\\w+\\]\\>\\(\\w+\\)");

        if (nodePattern.matcher(cypherQuery).matches()){
            // create node
            createNode(queryParts, cypherQuery);
        }
        else if (edgePattern.matcher(cypherQuery).matches()){
            // create edge
            // createEdge(queryParts);
        }
        else{
            System.err.println("Wrong query format. Please try again.");
            System.exit(1);
        }
    }

    public static void createNode(String[] queryParts, String cypherQuery) {
        // create node example: CREATE (node:Label {property: value, property2: value2}) 
        String nodeTableName = graphName + "_nodes";
        
        // get node id
        String nodeId = queryParts[1].split(":")[0].substring(1);
        // get node label/type
        String nodeLabel = queryParts[1].split(":")[1];

        // get node properties
        String nodeProperties = cypherQuery.split("\\{")[1].split("\\}")[0];
        String[] nodePropertiesArray = nodeProperties.split(",");

        // String[] nodePropertiesName = new String[nodePropertiesArray.length];
        // String[] nodePropertiesValue = new String[nodePropertiesArray.length];
        String propertiesName = "";
        String propertiesValue = "";

        for (int i = 0; i < nodePropertiesArray.length; i++) {
            propertiesName = propertiesName + nodePropertiesArray[i].split(":")[0] + ", ";
            propertiesValue = propertiesValue + nodePropertiesArray[i].split(":")[1] + ", ";
        }

        String sqlQuery = "INSERT INTO " + nodeTableName + " (" +  propertiesName + nodeId + ", " + nodeLabel +") VALUES (" 
                        + propertiesValue + nodeId + ", " + nodeLabel +")";

    
        //send to db helper to execute



    }

    public static void loadExistingGraph(){
        // print message to user
        System.out.println("Please enter the name of the graph you want to load:");

        String userGraphName = "";
        // get user input using scanner
        try {
            userGraphName = scanner.nextLine();
        } catch (Exception e) {
            System.err.println("Wrong input type. Please try again.");
            System.exit(1);
        }

        // check if the graph exists
        try{
            int result = db.checkIfTableExists(userGraphName);
            if (result == 0){
                graphName = userGraphName;
            }
        }
        catch(Exception e){
            System.err.println("Error loading graph.");
            System.exit(1);
        }

    }

    public static String createNewGraph(){
        // print message to user
        System.out.println("Please enter the name of the new graph:");

        // get user input using scanner
        String newGraphName = "";
        String newGraphSchema = "";
        String nodeTableName = "";
        String edgeTableName = "";
        try {
            newGraphName = scanner.nextLine();
            nodeTableName = newGraphName + "_nodes";
            edgeTableName = newGraphName + "_edges";

            System.out.println("Please enter the schema of the new graph:");
            newGraphSchema = scanner.nextLine();

        } catch (Exception e) {
            System.err.println("Wrong input type. Please try again.");
            System.exit(1);
        }

        try{
            db.createNewTable(nodeTableName, newGraphSchema, edgeTableName);
        }
        catch(Exception e){
            System.err.println("Error creating new table.");
            System.exit(1);
        }
        return newGraphName;

    }

    public static int openingMessage(){
        System.out.println("Welcome to the Graph Interpreter!");
        System.out.println("Please select one of the option to continue:");
        System.out.println("1. Create a new graph");
        System.out.println("2. Load an existing graph");

        // get user input using scanner
        int userInput = 0;
        try {
            userInput = scanner.nextInt();
        } catch (Exception e) {
            System.err.println("Wrong input type. Please try again.");
            System.exit(1);
        }
        return userInput;
    }
}
