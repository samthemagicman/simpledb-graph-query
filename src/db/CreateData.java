package db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateData {

    public static void main(String[] args) {
        // Connection parameters
        String url = "jdbc:postgresql://localhost:5432/graphs"; // Replace 'mydatabase' with your database name
        String username = "postgres";
        String password = "postgres";

        // Establish connection
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to PostgreSQL database!");

            //drop tables
            dropTables(connection);

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


    public static void dropTables(Connection connection){
        try{
            connection.createStatement().execute("drop table if exists BuzzHub_nodes cascade");
            connection.createStatement().execute("drop table if exists BuzzHub_relationships cascade");
            System.out.println("Tables dropped.");
        } catch(SQLException e){
            System.out.println("Connection failure.");
            e.printStackTrace();   
        }
    }


    public static void insertEdgesData(Connection connection){
        // array of insert statements
        String[] insertValues = {
            "('Created', 1, 6, '2023-11-24', 'post', 'Post')",
            "('Created', 2, 7, '2023-10-15', 'Post', 'Post')",
            "('Created', 4, 8, '2023-12-05', 'Post', 'Post')",
            "('Created', 2, 9, '2023-10-10', 'Post', 'Post')",
            "('Created', 3, 10, '2023-11-30', 'Post', 'Post')",
            "('Created', 5, 11, '2023-11-25', 'Response', 'Comment')",
            "('Created', 1, 12, '2023-12-06', 'Thought', 'Comment')",
            "('Created', 3, 13, '2023-11-30', 'Response', 'Comment')",
            "('Created', 5, 14, '2023-10-24', 'Response', 'Comment')",
            "('Created', 4, 15, '2023-11-30', 'Thought', 'Comment')",
            "('Has A Comment', 6, 11, '2023-11-25', 'Response', 'CommentedOn')",
            "('Has A Comment', 8, 12, '2023-12-06', 'Thought', 'CommentedOn')",
            "('Has A Comment', 9, 13, '2023-11-30', 'Response', 'CommentedOn')",
            "('Has A Comment', 9, 14, '2023-10-24', 'Response', 'CommentedOn')",
            "('Has A Comment', 10, 15, '2023-11-30', 'Thought', 'CommentedOn')",
            "('Created', 1, 16, NULL, 'Love', 'Reaction')",
            "('Created', 5, 17, NULL, 'Love', 'Reaction')",
            "('Created', 5, 18, NULL, 'Like', 'Reaction')",
            "('Created', 3, 19, NULL, 'Like', 'Reaction')",
            "('Created', 4, 20, NULL, 'Love', 'Reaction')",
            "('Created', 2, 21, NULL, 'Dislike', 'Reaction')",
            "('Has A Reaction', 7, 16, NULL, 'Love', 'ReactedOn')",
            "('Has A Reaction', 7, 17, NULL, 'Love', 'ReactedOn')",
            "('Has A Reaction', 8, 18, NULL, 'Like', 'ReactedOn')",
            "('Has A Reaction', 7, 19, NULL, 'Like', 'ReactedOn')",
            "('Has A Reaction', 10, 20, NULL, 'Love', 'ReactedOn')",
            "('Has A Reaction', 10, 21, NULL, 'Dislike', 'ReactedOn')"
        };
        // insert statement
        String insertRelationships = "INSERT INTO BuzzHub_relationships (edge_type, edge_source_node_id, edge_target_node_id, edge_date_created, relationship_description, relationship_type) VALUES ";

        String[] insertStatements  = new String[insertValues.length];
        for(int i = 0; i < insertValues.length; i++){
            insertStatements[i] = insertRelationships + insertValues[i];
        }

        try {
            Statement statement = connection.createStatement();
            for(int i = 0; i < insertStatements.length; i++){
                statement.executeUpdate(insertStatements[i]);
            }

            System.out.println("Relationships inserted into Relationships table.");
        } catch (SQLException e) {
            System.out.println("Insertion failed! Check the stack trace:");
            e.printStackTrace();
        }

    }


    public static void insertNodesData(Connection connection){
        // array of insert statements
        String[] insertValues = {
            "('User', 'Riley Johnson', 'Riley', 'riley@email.com', '1994-09-12', NULL, '2023-11-17', NULL, 'USA', 'New York')",
            "('User', 'Alicia Smith', 'Alice', 'alicia@email.com', '1988-09-20', NULL, '2023-10-09', NULL, 'Canada', 'Toronto')",
            "('User', 'Bob Shaw', 'Shaw', 'bob@email.com', '1990-05-15', NULL, '2023-11-25', NULL, 'USA', 'Boston')",
            "('User', 'Nora Patel', 'Nora', 'nora@emil.com', '2000-11-08', NULL, '2023-10-04', NULL, 'USA', 'New York')",
            "('User', 'Marcus Thompson', 'Tom', 'marcus@email.com', '1996-12-21', NULL, '2023-05-16', NULL, 'Canada', 'Halifax')",
            "('Post', 'Post #1', NULL, NULL, NULL, 'Exploring new ideas', '2023-11-24', 'Tech, ideas', 'USA', 'New York')",
            "('Post', 'Explore', NULL, NULL, NULL, 'Travel, experiences', '2023-10-15', 'Travel, fun', 'Canada', 'Toronto')",
            "('Post', 'Post #2', NULL, NULL, NULL, 'Tips for healthy living', '2023-12-05', 'Health, tips', 'USA', 'New York')",
            "('Post', 'Recipe #1', NULL, NULL, NULL, 'Sharing new recipe', '2023-10-10', 'Food, recipe', 'Canada', 'Toronto')",
            "('Post', 'Review #1', NULL, NULL, NULL, 'Book, reviews', '2023-11-30', 'Book, review, rating', 'USA', 'Boston')",
            "('Comment', NULL, NULL, NULL, NULL, 'Great Post!', '2023-11-25', 'Feedback', 'Canada', 'Halifax')",
            "('Comment', NULL, NULL, NULL, NULL, 'Intersting Insights', '2023-12-06', 'Thoughts', 'USA', 'New York')",
            "('Comment', NULL, NULL, NULL, NULL, 'Yummy and healthy', '2023-11-30', 'Feedback', 'USA', 'Boston')",
            "('Comment', NULL, NULL, NULL, NULL, 'Really easy, Thank you for sharing', '2023-10-24', 'Feedback', 'Canada', 'Halifax')",
            "('Comment', NULL, NULL, NULL, NULL, 'Interesting outlook', '2023-11-30', 'Thoughts', 'USA', 'New York')",
            "('Reaction', NULL, NULL, NULL, NULL, 'Love', '2023-12-02', 'Love, heart', 'USA', 'New York')",
            "('Reaction', NULL, NULL, NULL, NULL, 'Love', '2023-10-09', 'Love, Heart', 'Canada', 'Halifax')",
            "('Reaction', NULL, NULL, NULL, NULL, 'Like', '2023-12-05', 'Like', 'Canada', 'Halifax')",
            "('Reaction', NULL, NULL, NULL, NULL, 'Like', '2023-12-06', 'Like', 'USA', 'Boston')",
            "('Reaction', NULL, NULL, NULL, NULL, 'Love', '2023-11-30', 'Love, heart', 'USA', 'New York')",
            "('Reaction', NULL, NULL, NULL, NULL, 'Dislike', '2023-12-01', 'Dislike', 'Canada', 'Toronto')"
        }; 

        // insert statement
        String insertStatement = "INSERT INTO BuzzHub_nodes (node_type, node_name, node_username, node_email, node_DOB, node_content, node_date_created, node_tags, node_country, node_city) VALUES ";
    
        String[] insertStatements  = new String[insertValues.length];
        for(int i = 0; i < insertValues.length; i++){
            insertStatements[i] = insertStatement + insertValues[i];
        }
        
        try {
            Statement statement = connection.createStatement();
            for(int i = 0; i < insertStatements.length; i++){
                statement.executeUpdate(insertStatements[i]);
            }
        
            System.out.println("Nodes inserted into BuzzHub_nodes table.");
        } catch (SQLException e) {
            System.out.println("Insertion failed! Check the stack trace:");
            e.printStackTrace();
        }
        
    }


    public static void createTables(Connection connection){
        try{

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
                + "node_tags VARCHAR(255),"
                + "node_country VARCHAR(255),"
                + "node_city VARCHAR(255)"
                + ");";
         
            // execute the statement
            connection.createStatement().execute("drop table if exists BuzzHub_nodes cascade");
            connection.createStatement().execute(createBuzzHubNodesTable);
            System.out.println("BuzzHub_nodes table created.");


            // create BuzzHub_edges table
            String createBuzzHubEdgesTable = "CREATE TABLE BuzzHub_relationships ("
                + "relationship_id SERIAL PRIMARY KEY,"
                + "edge_type VARCHAR(255),"
                + "edge_source_node_id INTEGER,"
                + "edge_target_node_id INTEGER,"
                + "edge_date_created DATE,"
                + "relationship_description VARCHAR(255),"
                + "relationship_type VARCHAR(255)," //reaction type, comment type, post type
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