package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

import graph.visitor.result.Pair;
import graph.visitor.result.Properties;
import model.MatchQueryResult;
import model.Node;
import model.Relationship;

public class DBHelper {

    private Connection dbConnection;
    private String nodes_table_name;
    private String relationships_table_name;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public DBHelper(String nodes_table_name, String relationships_table_name) {
        DBConnector dbConnector = new DBConnector();
        dbConnection = dbConnector.getConnection();
        this.nodes_table_name = nodes_table_name;
        this.relationships_table_name = relationships_table_name;
    }

    public int createNode(Node node) {

        // Create node use prepared statement
        String insertNode = "INSERT INTO " + nodes_table_name
                + "(node_type, node_name, node_username, node_email, node_content, node_date_created, node_tags, node_country, node_city) VALUES "
                + "(?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            // prepare statement
            PreparedStatement preparedStatement = dbConnection.prepareStatement(insertNode, new String[] { "node_id" });
            preparedStatement.setString(1, node.getLabel());
            preparedStatement.setString(2, node.getName());
            preparedStatement.setString(3, node.getUsername());
            preparedStatement.setString(4, node.getEmail());
            preparedStatement.setString(5, node.getContent());
            preparedStatement.setDate(6, java.sql.Date.valueOf(node.getDateCreated()));
            preparedStatement.setString(7, node.getTags());
            preparedStatement.setString(8, node.getCountry());
            preparedStatement.setString(9, node.getCity());

            // execute statement
            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Creating node failed, no rows affected.");
            }
            if (preparedStatement.getGeneratedKeys().next()) {
                return preparedStatement.getGeneratedKeys().getInt(1);
            }

        } catch (SQLException e) {
            System.out.println("Error creating node.");
            e.printStackTrace();
        }
        return -1;
    }

    public void createRelationship(Relationship relationship) {
        // create relationship use prepared statement
        String insertRelationship = "INSERT INTO " + relationships_table_name
                + " (edge_type, edge_source_node_id, edge_target_node_id, edge_date_created, relationship_description, relationship_type) VALUES "
                + "(?, ?, ?, ?, ?, ?)";

        try {
            // prepare statement
            PreparedStatement preparedStatement = dbConnection.prepareStatement(insertRelationship);
            preparedStatement.setString(1, relationship.getEdgeType());
            preparedStatement.setInt(2, relationship.getEdgeSourceNodeId());
            preparedStatement.setInt(3, relationship.getEdgeTargetNodeId());
            preparedStatement.setDate(4, java.sql.Date.valueOf(relationship.getEdgeDateCreated()));
            preparedStatement.setString(5, relationship.getDescription());
            preparedStatement.setString(6, relationship.getLabel());

            // execute statement
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error creating relationship.");
            e.printStackTrace();
        }
    }

    public graph.visitor.result.Node createNodeFromResultSet(ResultSet resultSet, String label,
            String propertyPrefix)
            throws SQLException {
        graph.visitor.result.Node newNode = new graph.visitor.result.Node(graph.visitor.result.Node.Type.NODE,
                new Properties(), "", label);

        ResultSetMetaData rsmd = resultSet.getMetaData();
        for (int j = 1; j <= rsmd.getColumnCount(); j++) {
            String columnName = rsmd.getColumnName(j);
            if (columnName.startsWith(propertyPrefix)) {
                newNode.getProperties()
                        .addProperty(new Pair(columnName.replace(propertyPrefix, ""), resultSet.getString(columnName)));
            }
        }
        return newNode;
    }

    public graph.visitor.result.Node createNodeFromResultSet(ResultSet resultSet, String label)
            throws SQLException {
        // graph.visitor.result.Node newNode = new
        // graph.visitor.result.Node(graph.visitor.result.Node.Type.NODE,
        // new Properties(), "", label);

        // ResultSetMetaData rsmd = resultSet.getMetaData();
        // for (int j = 1; j <= rsmd.getColumnCount(); j++) {
        // String columnName = rsmd.getColumnName(j);
        // newNode.getProperties()
        // .addProperty(new Pair(columnName.replace("node_", ""),
        // resultSet.getString(columnName)));
        // }
        return createNodeFromResultSet(resultSet, label, "node_");
    }

    public graph.visitor.result.Node[] matchNode(graph.visitor.result.Node node) {
        ArrayList<graph.visitor.result.Node> nodes = new ArrayList<>();
        String[] selectProperties = node.getSelectProperties();

        String selectNode = "SELECT ";
        if (selectProperties.length == 0) {
            selectNode += "*";
        } else {
            selectNode += String.join(", ", Arrays.stream(selectProperties)
                    .map(property -> "node_" + property)
                    .toArray(String[]::new));
        }
        selectNode += " FROM " + nodes_table_name + " WHERE node_type = ?";

        // Add properties to the WHERE clause
        Properties nodeProperties = node.getProperties();
        for (Pair property : nodeProperties.getProperties()) {
            selectNode += " AND node_" + property.getProperty() + " = ?";
        }
        selectNode += ";";

        try {
            // prepared statement
            PreparedStatement preparedStatement = dbConnection.prepareStatement(selectNode);
            preparedStatement.setString(1, node.getLabel());
            int i = 2;
            for (Pair property : nodeProperties.getProperties()) {
                preparedStatement.setString(i, property.getValue());
                i++;
            }

            // execute statement and get result set
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                nodes.add(createNodeFromResultSet(resultSet, node.getLabel()));
                // nodes.add(createNodeFromResultSet(resultSet, selectProperties,
                // node.getLabel()));
            }

            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println("Error returning node.");
            e.printStackTrace();
        }

        return nodes.toArray(graph.visitor.result.Node[]::new);
    }

    public Node[] returnNodes(String node_type) {

        ArrayList<Node> nodes = new ArrayList<>();

        // create select statement using prepared statement
        String selectNode = "SELECT  * FROM " + nodes_table_name + " WHERE node_type = ?;";

        try {
            // prepared statement
            PreparedStatement preparedStatement = dbConnection.prepareStatement(selectNode);
            preparedStatement.setString(1, node_type);

            // execute statement and get result set
            ResultSet resultSet = preparedStatement.executeQuery();

            // parse result set
            int i = 0;
            while (resultSet.next()) {
                int rs_node_id = resultSet.getInt("node_id");
                String rs_node_type = resultSet.getString("node_type");
                String node_name = resultSet.getString("node_name");
                String node_username = resultSet.getString("node_username");
                String node_email = resultSet.getString("node_email");
                String node_content = resultSet.getString("node_content");
                java.sql.Date node_date_created_sql = resultSet.getDate("node_date_created");
                LocalDate node_date_created = node_date_created_sql.toLocalDate();
                String node_tags = resultSet.getString("node_tags");
                String node_country = resultSet.getString("node_country");
                String node_city = resultSet.getString("node_city");

                nodes.add(new Node(rs_node_id, rs_node_type, node_name, node_username, node_email,
                        node_content, node_date_created, node_tags, node_country, node_city));
            }

            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println("Error returning node");
            e.printStackTrace();
        }

        return nodes.toArray(Node[]::new);
    }

    public Node[] returnNodes(String node_type, String[] conditions) {

        Node[] nodes = null;

        // create select statement using prepared statement
        String selectNode = "SELECT * FROM " + nodes_table_name + " WHERE node_type = ? AND ";
        for (int i = 0; i < conditions.length; i++) {
            selectNode = selectNode + conditions[i] + " AND ";
        }

        // remove last AND
        selectNode = selectNode.substring(0, selectNode.length() - 5);

        try {
            // prepared statement
            PreparedStatement preparedStatement = dbConnection.prepareStatement(selectNode);
            preparedStatement.setString(1, node_type);

            // execute statement and get result set
            ResultSet resultSet = preparedStatement.executeQuery();

            // get number of rows
            int rowCount = 0;
            while (resultSet.next()) {
                rowCount++;
            }

            // create array of nodes
            nodes = new Node[rowCount];

            // parse result set
            int i = 0;
            while (resultSet.next()) {
                int rs_node_id = resultSet.getInt("node_id");
                String rs_node_type = resultSet.getString("node_type");
                String node_name = resultSet.getString("node_name");
                String node_username = resultSet.getString("node_username");
                String node_email = resultSet.getString("node_email");
                String node_content = resultSet.getString("node_content");
                java.sql.Date node_date_created_sql = resultSet.getDate("node_date_created");
                LocalDate node_date_created = node_date_created_sql.toLocalDate();
                String node_tags = resultSet.getString("node_tags");
                String node_country = resultSet.getString("node_country");
                String node_city = resultSet.getString("node_city");

                nodes[i] = new Node(rs_node_id, rs_node_type, node_name, node_username, node_email,
                        node_content, node_date_created, node_tags, node_country, node_city);
                i++;
            }

            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println("Error returning node");
            e.printStackTrace();
        }

        return nodes;
    }

    public void DeleteNode(int node_id) {
        // create delete statement using prepared statement
        String deleteMatchingEdges = "DELETE FROM " + relationships_table_name
                + " WHERE edge_source_node_id = ? OR edge_target_node_id = ?";
        String deleteNode = "DELETE FROM " + nodes_table_name + " WHERE node_id = ?";

        try {
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
        } catch (SQLException e) {
            System.out.println("Error deleting node.");
            e.printStackTrace();
        }
    }

    public void DeleteRelationship(int edge_source_node_id, int edge_target_node_id) {

        // create delete statement using prepared statement
        String deleteRelationship = "DELETE FROM " + relationships_table_name
                + " WHERE edge_source_node_id = ? AND edge_target_node_id = ?";

        try {
            // prepared statement
            PreparedStatement preparedStatement = dbConnection.prepareStatement(deleteRelationship);
            preparedStatement.setInt(1, edge_source_node_id);
            preparedStatement.setInt(2, edge_target_node_id);

            // execute statement
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error deleting relationship.");
            e.printStackTrace();
        }
    }

    public void updateNodeProperties(graph.visitor.result.Node node) throws Exception {
        // create update statement using prepared statement
        String[] selectProperties = node.getSelectProperties();

        String updateNode = "UPDATE " + nodes_table_name + " SET ";
        if (selectProperties.length == 0) {
            throw new Exception("No properties to update");
        } else {
            updateNode += String.join(", ", Arrays.stream(selectProperties)
                    .map(property -> "node_" + property + " = ?")
                    .toArray(String[]::new));
        }

        updateNode += " WHERE node_type = ?";

        // Add properties to the WHERE clause
        Properties nodeProperties = node.getProperties();
        for (Pair property : nodeProperties.getProperties()) {
            updateNode += " AND node_" + property.getProperty() + " = ?";
        }

        updateNode += ";";

        try{
            // prepared statement
            PreparedStatement preparedStatement = dbConnection.prepareStatement(updateNode);
            preparedStatement.setString(1, node.getLabel());
            int i = 2;
            for (Pair property : nodeProperties.getProperties()) {
                preparedStatement.setString(i, property.getValue());
                i++;
            }

            // execute statement
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error updating node.");
            e.printStackTrace();   
        }
        
    }

    public MatchQueryResult[] getNodesWithUndirectedRelationship(graph.visitor.result.Node nodeSource,
            graph.visitor.result.Node nodeTarget,
            graph.visitor.result.Node relationship) {

        // Pair[] sourceProperties = nodeSource.getProperties().getProperties();
        // Pair[] targetProperties = nodeTarget.getProperties().getProperties();
        // Pair[] relationshipProperties = relationship.getProperties().getProperties();

        String[] sourceProperties = nodeSource.getSelectProperties();
        String[] targetProperties = nodeTarget.getSelectProperties();
        String[] relationshipProperties = relationship.getSelectProperties();

        String sql = "SELECT " +
                "src.node_id AS source_node_id, " +
                "trgt.node_id AS target_node_id, ";

        ArrayList<MatchQueryResult> result = new ArrayList<>();

        for (String property : sourceProperties) {
            if (property.equals("id")) {
                continue;
            }
            sql = sql + "src.node_" + property + " AS source_node_" + property + ", ";
        }

        for (String property : targetProperties) {
            if (property.equals("id")) {
                continue;
            }
            sql = sql + "trgt.node_" + property + " AS target_node_" + property + ", ";
        }

        for (String property : relationshipProperties) {
            if (property.equals("id")) {
                continue;
            }
            sql = sql + "r.relationship_" + property + " AS relationship_" + property + ", ";
        }

        sql = sql.substring(0, sql.length() - 2) + " ";

        sql = sql + "FROM " +
                relationships_table_name + " r " +
                "JOIN " +
                nodes_table_name + " src ON r.edge_source_node_id = src.node_id " +
                "JOIN " +
                nodes_table_name + " trgt ON r.edge_target_node_id = trgt.node_id;";

        try {
            // prepared statement
            PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);
            // execute statement
            ResultSet resultSet = preparedStatement.executeQuery();
            System.out.println(preparedStatement);
            while (resultSet.next()) {
                graph.visitor.result.Node sourceNode = createNodeFromResultSet(resultSet,
                        nodeSource.getLabel(), "source_node_");
                graph.visitor.result.Node targetNode = createNodeFromResultSet(resultSet,
                        nodeTarget.getLabel(), "target_node_");
                graph.visitor.result.Node relationshipNode = createNodeFromResultSet(resultSet,
                        relationship.getLabel(), "relationship_");

                MatchQueryResult matchQueryResult = new MatchQueryResult(sourceNode, targetNode, relationshipNode);
                result.add(matchQueryResult);
            }
        } catch (SQLException e) {
            System.out.println("Error deleting node.");
            e.printStackTrace();
        }

        return result.toArray(MatchQueryResult[]::new);
    }

    public Node[] searchNodesViaEdges(String src_node_type, String dest_node_type, String src_node_conditions,
            String dest_node_conditions, String relationship_conditions, String relationship_type) {

        Node[] nodes = null;

        // create select statement using prepared statement
        String selectNodes = "SELECT " + nodes_table_name + ".* FROM " + nodes_table_name + " JOIN "
                + relationships_table_name + " ON " + nodes_table_name + ".node_id = " +
                relationships_table_name + ".edge_target_node_id WHERE " + relationships_table_name
                + ".relationship_type = ? AND "
                + relationships_table_name + ".edge_source_node_id = (SELECT node_id FROM " + nodes_table_name
                + " WHERE node_type = ? AND "
                + src_node_conditions + ") AND " + nodes_table_name + ".node_type = ? AND " + dest_node_conditions;

        try {
            // prepared statement
            PreparedStatement preparedStatement = dbConnection.prepareStatement(selectNodes);
            preparedStatement.setString(1, relationship_type);
            preparedStatement.setString(2, src_node_type);
            preparedStatement.setString(3, dest_node_type);

            // execute statement and get result set
            ResultSet resultSet = preparedStatement.executeQuery();

            // get number of rows
            int rowCount = 0;
            while (resultSet.next()) {
                rowCount++;
            }

            // create array of nodes
            nodes = new Node[rowCount];

            // parse result set
            int i = 0;
            while (resultSet.next()) {
                int rs_node_id = resultSet.getInt("node_id");
                String rs_node_type = resultSet.getString("node_type");
                String node_name = resultSet.getString("node_name");
                String node_username = resultSet.getString("node_username");
                String node_email = resultSet.getString("node_email");
                String node_content = resultSet.getString("node_content");
                java.sql.Date node_date_created_sql = resultSet.getDate("node_date_created");
                LocalDate node_date_created = node_date_created_sql.toLocalDate();
                String node_tags = resultSet.getString("node_tags");
                String node_country = resultSet.getString("node_country");
                String node_city = resultSet.getString("node_city");

                nodes[i] = new Node(rs_node_id, rs_node_type, node_name, node_username, node_email,
                        node_content, node_date_created, node_tags, node_country, node_city);
                i++;

            }

            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println("Error searching nodes");
            e.printStackTrace();
        }

        return nodes;

    }


    public void closeDBConnection() {
        try {
            dbConnection.close();
        } catch (SQLException e) {
            System.out.println("Error closing database connection.");
            e.printStackTrace();
        }
    }
}
