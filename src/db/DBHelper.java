package db;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Node;
import model.Relationship;

public class DBHelper {

    private Connection dbConnection; 
    private String nodes_table_name; 
    private String relationships_table_name;

    public DBHelper(String nodes_table_name, String relationships_table_name){
        DBConnector dbConnector = new DBConnector();
        dbConnection = dbConnector.getConnection();
        this.nodes_table_name = nodes_table_name;
        this.relationships_table_name = relationships_table_name;
    }

    public void createNode(Node node){

        // Create node use prepared statement
        String insertNode = "INSERT INTO " + nodes_table_name + " (node_type, node_name, node_email, node_dob, node_content, node_date_created, node_tags) VALUES "
            + "(?, ?, ?, ?, ?, ?, ?)";
        
        try {
            // prepare statement
            PreparedStatement preparedStatement = dbConnection.prepareStatement(insertNode);
            preparedStatement.setString(1, node.getNode_type());
            preparedStatement.setString(2, node.getNode_name());
            preparedStatement.setString(3, node.getNode_email());
            preparedStatement.setString(4, node.getNode_dob());
            preparedStatement.setString(5, node.getNode_content());
            preparedStatement.setString(6, node.getNode_date_created());
            preparedStatement.setString(7, node.getNode_tags());

            // execute statement
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error creating node.");
            e.printStackTrace();
        }
    }


    public void createRelationship(Relationship relationship){
        // create relationship use prepared statement
        String insertRelationship = "INSERT INTO " + relationships_table_name + " (edge_source_node_id, edge_target_node_id, relationship_type) VALUES "
            + "(?, ?, ?)";
        
        try {
            // prepare statement
            PreparedStatement preparedStatement = dbConnection.prepareStatement(insertRelationship);
            preparedStatement.setInt(1, relationship.getEdge_source_node_id());
            preparedStatement.setInt(2, relationship.getEdge_target_node_id());
            preparedStatement.setString(3, relationship.getRelationship_type());

            // execute statement
            preparedStatement.executeUpdate();
        } catch(SQLException e){
            System.out.println("Error creating relationship.");
            e.printStackTrace();
        }
    }


    public Node returnNode(String node_type, String[] conditions){

        Node node = null;
        
        // create select statement using prepared statement
        String selectNode = "SELECT * FROM " + nodes_table_name + " WHERE node_type = ? AND ";
        for (int i = 0; i < conditions.length; i++){
            selectNode = selectNode + conditions[i] + " AND ";
        }

        // remove last AND
        selectNode = selectNode.substring(0, selectNode.length() - 5);

       try{
            // prepared statement
            PreparedStatement preparedStatement = dbConnection.prepareStatement(selectNode);
            preparedStatement.setString(1, node_type);

            // execute statement and get result set
            ResultSet resultSet =preparedStatement.executeQuery();


            // parse result set
            while (resultSet.next()){
                int node_id = resultSet.getInt("node_id");
                String node_name = resultSet.getString("node_name");
                String node_username = resultSet.getString("node_username");
                String node_email = resultSet.getString("node_email");
                String node_dob = resultSet.getString("node_dob");
                String node_content = resultSet.getString("node_content");
                String node_date_created = resultSet.getString("node_date_created");
                String node_tags = resultSet.getString("node_tags");

                node = new Node(node_id, node_type, node_name, node_username, node_email, node_dob, node_content, node_date_created, node_tags);
            }

            resultSet.close();
            preparedStatement.close();

       }catch(SQLException e){
           System.out.println("Error returning node.");
           e.printStackTrace();
       }

        return node;

    }


    public Node[] returnNodes(String node_type, String[] conditions){

        Node[] nodes = null;
        
        // create select statement using prepared statement
        String selectNode = "SELECT * FROM " + nodes_table_name + " WHERE node_type = ? AND ";
        for (int i = 0; i < conditions.length; i++){
            selectNode = selectNode + conditions[i] + " AND ";
        }

        // remove last AND
        selectNode = selectNode.substring(0, selectNode.length() - 5);

       try{
            // prepared statement
            PreparedStatement preparedStatement = dbConnection.prepareStatement(selectNode);
            preparedStatement.setString(1, node_type);

            // execute statement and get result set
            ResultSet resultSet =preparedStatement.executeQuery();

            // get number of rows
            int rowCount = 0;
            while (resultSet.next()){
                rowCount++;
            }

            // create array of nodes
            nodes = new Node[rowCount];

            // parse result set
            int i = 0;
            while (resultSet.next()){
                int node_id = resultSet.getInt("node_id");
                String node_name = resultSet.getString("node_name");
                String node_username = resultSet.getString("node_username");
                String node_email = resultSet.getString("node_email");
                String node_dob = resultSet.getString("node_dob");
                String node_content = resultSet.getString("node_content");
                String node_date_created = resultSet.getString("node_date_created");
                String node_tags = resultSet.getString("node_tags");

                nodes[i] = new Node(node_id, node_type, node_name, node_username, node_email, node_dob, node_content, node_date_created, node_tags);
                i++;
            }

            resultSet.close();
            preparedStatement.close();

       }catch(SQLException e){
           System.out.println("Error returning node");
           e.printStackTrace();
       }

        return nodes;
    }


    public void DeleteNode(int node_id){
        // create delete statement using prepared statement
        String deleteMatchingEdges = "DELETE FROM " + relationships_table_name + " WHERE edge_source_node_id = ? OR edge_target_node_id = ?";
        String deleteNode = "DELETE FROM " + nodes_table_name + " WHERE node_id = ?";

        try{
            // prepared statement
            PreparedStatement preparedStatement = dbConnection.prepareStatement(deleteMatchingEdges);
            preparedStatement.setInt(1, node_id);
            preparedStatement.setInt(2, node_id);

            // execute statement
            preparedStatement.executeUpdate();

            // prepared statement
            preparedStatement = dbConnection.prepareStatement(deleteNode);
            preparedStatement.setInt(1, node_id);

            // execute statement
            preparedStatement.executeUpdate();
        } catch(SQLException e){
            System.out.println("Error deleting node.");
            e.printStackTrace();
        }
    }


    public void DeleteRelationship(Relationship relationship){

        // create delete statement using prepared statement
        String deleteRelationship = "DELETE FROM " + relationships_table_name + " WHERE edge_source_node_id = ? AND edge_target_node_id = ? AND relationship_type = ?";

        try{
            // prepared statement
            PreparedStatement preparedStatement = dbConnection.prepareStatement(deleteRelationship);
            preparedStatement.setInt(1, relationship.getEdge_source_node_id());
            preparedStatement.setInt(2, relationship.getEdge_target_node_id());
            preparedStatement.setString(3, relationship.getRelationship_type());

            // execute statement
            preparedStatement.executeUpdate();
        } catch(SQLException e){
            System.out.println("Error deleting relationship.");
            e.printStackTrace();
        }
    }


    public void updateNodeProperties(int node_id, String node_type, String[] updates){
        // create update statement using prepared statement
        String updateNode = "UPDATE " + nodes_table_name + " SET ";
        for (int i = 0; i < updates.length; i++){
            updateNode = updateNode + updates[i] + ", ";
        }

        // remove last comma
        updateNode = updateNode.substring(0, updateNode.length() - 2);

        // add where clause
        updateNode = updateNode + " WHERE node_id = ? AND node_type = ?";

        try{
            // prepared statement
            PreparedStatement preparedStatement = dbConnection.prepareStatement(updateNode);
            preparedStatement.setInt(1, node_id);
            preparedStatement.setString(2, node_type);

            // execute statement
            preparedStatement.executeUpdate();
        } catch(SQLException e){
            System.out.println("Error updating node properties.");
            e.printStackTrace();
        }
    }


    
}
