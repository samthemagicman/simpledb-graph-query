package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresJDBCExample {

    public static void main(String[] args) {
        // Connection parameters
        String url = "jdbc:postgresql://localhost:5432/graphs"; // Replace 'mydatabase' with your database name
        String username = "postgres";
        String password = "postgres";

        // Establish connection
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to PostgreSQL database!");

            // Create tables
            createTables(connection);

            // insert data
            insertNodesData(connection);

            // insert edges data
            insertEdgesData(connection);
           

        } catch (SQLException e) {
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }



    public static void insertEdgesData(Connection connection){
         
        String insertRelationships = "INSERT INTO buzzhub_relationships (edge_source_node_id, edge_target_node_id, relationship_type) VALUES "
            + "(1, 3, 'Created'), " // User 1 created Post 1
            + "(2, 3, 'Created'), " // User 2 created Post 1
            + "(4, 3, 'CommentOn'), " // Comment 4 made on Post 1
            + "(1, 4, 'Commented'), " // User 1 commented on Comment 4
            + "(2, 4, 'Commented'), " // User 2 commented on Comment 4
            + "(1, 5, 'Reacted'), " // User 1 reacted to Post 1
            + "(2, 5, 'Reacted')"; // User 2 reacted to Post 1

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(insertRelationships);

            System.out.println("Relationships inserted into Relationships table.");
        } catch (SQLException e) {
            System.out.println("Insertion failed! Check the stack trace:");
            e.printStackTrace();
        }

    }


    public static void insertNodesData(Connection connection){
        String insertUserAlice = "INSERT INTO buzzhub_nodes (node_type, node_name, node_username, node_email, node_dob) VALUES ('User', 'Alice', 'alice123', 'alice@email.com', '1990-05-15')";
        String insertUserBob = "INSERT INTO buzzhub_nodes (node_type, node_name, node_username, node_email, node_dob) VALUES ('User', 'Bob', 'bob_1987', 'bob@email.com', '1987-11-20')";
        String insertPost = "INSERT INTO buzzhub_nodes (node_type, node_name, node_content, node_date_created, node_tags) VALUES ('Post', 'Post #1', 'Exciting news!', '2023-11-25 08:30:00', '#news #update')";
        String insertComment = "INSERT INTO buzzhub_nodes (node_type, node_name, node_content, node_date_created) VALUES ('Comment', 'Comment #1', 'Great update!', '2023-11-25 09:00:00')";
        String insertReaction = "INSERT INTO buzzhub_nodes (node_type, node_name, node_date_created) VALUES ('Reaction', 'Like', '2023-11-25 09:05:00')";
        
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(insertUserAlice);
            statement.executeUpdate(insertUserBob);
            statement.executeUpdate(insertPost);
            statement.executeUpdate(insertComment);
            statement.executeUpdate(insertReaction);
        
            System.out.println("Nodes inserted into BuzzHub_nodes table.");
        } catch (SQLException e) {
            System.out.println("Insertion failed! Check the stack trace:");
            e.printStackTrace();
        }
        
    }


    public static void createTables(Connection connection){
        try{

            // TO DO: add country, city
             // create BuzzHub_nodes table
             String createBuzzHubNodesTable = "CREATE TABLE BuzzHub_nodes ("
                + "node_id SERIAL PRIMARY KEY,"
                + "node_type VARCHAR(255),"
                + "node_name VARCHAR(255),"
                + "node_username VARCHAR(255),"
                + "node_email VARCHAR(255),"
                + "node_DOB DATE,"
                + "node_content VARCHAR(255),"
                + "node_date_created DATE,"
                + "node_tags VARCHAR(255)"
                + ");";
         
            // execute the statement
            connection.createStatement().execute("drop table if exists BuzzHub_nodes cascade");
            connection.createStatement().execute(createBuzzHubNodesTable);
            System.out.println("BuzzHub_nodes table created.");


            // TO DO: add edge properties like reaction type, comment type, post type
            // create BuzzHub_edges table
            String createBuzzHubEdgesTable = "CREATE TABLE BuzzHub_relationships ("
                + "relationship_id SERIAL PRIMARY KEY,"
                + "relationship_type VARCHAR(255),"
                + "edge_source_node_id INTEGER,"
                + "edge_target_node_id INTEGER,"
                + "FOREIGN KEY (edge_source_node_id) REFERENCES BuzzHub_nodes(node_id),"
                + "FOREIGN KEY (edge_target_node_id) REFERENCES BuzzHub_nodes(node_id)"
                + ");";

            // execute the statement
            connection.createStatement().execute("drop table if exists BuzzHub_relationships cascade");
            connection.createStatement().execute(createBuzzHubEdgesTable);
            System.out.println("BuzzHub_edges table created.");
        } catch(SQLException e){
            System.out.println("Connection failure.");
            e.printStackTrace();   
        }
    }
}