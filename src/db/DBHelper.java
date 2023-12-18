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

import graph.visitor.result.Node;
import graph.visitor.result.Pair;
import graph.visitor.result.Properties;
import model.MatchQueryResult;

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

    public Node createNodeInDb(Node node) {
        Pair[] properties = node.getProperties().getProperties();
        String[] propertyNames = Arrays.stream(properties)
                .map(pair -> "node_" + pair.getProperty())
                .toArray(String[]::new);

        String insertNode = "INSERT INTO " + nodes_table_name + " (node_type";
        if (propertyNames.length > 0) {
            insertNode += ", " + String.join(", ", propertyNames);
        }
        insertNode += ") VALUES (?";
        if (propertyNames.length > 0) {
            insertNode += ", " + String.join(", ", Arrays.stream(properties)
                    .map(pair -> "?")
                    .toArray(String[]::new));
        }
        insertNode += ");";
        // prepare statement
        PreparedStatement preparedStatement;
        try {
            preparedStatement = dbConnection.prepareStatement(insertNode, new String[] { "node_id" });
            preparedStatement.setString(1, node.getLabel());
            int i = 2;
            for (Pair pair : properties) {
                preparedStatement.setString(i, pair.getValue());
                i++;
            }

            // execute statement
            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Creating node failed, no rows affected.");
            }
            if (preparedStatement.getGeneratedKeys().next()) {
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                node.getProperties().addProperty(new Pair("id", String.valueOf(resultSet.getInt("node_id"))));
                return node;
            }
            throw new SQLException("Creating node failed, no ID obtained.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Node createRelationship(Node relationship, int nodeSource, int nodeTarget) {
        // create relationship use prepared statement
        String insertRelationship = "INSERT INTO " + relationships_table_name
                + " (edge_type, edge_source_node_id, edge_target_node_id, edge_date_created, relationship_description, relationship_type) VALUES "
                + "(?, ?, ?, ?, ?, ?)";

        try {
            // prepare statement
            PreparedStatement preparedStatement = dbConnection.prepareStatement(insertRelationship,
                    new String[] { "relationship_id" });
            preparedStatement.setString(1, relationship.getLabel());
            preparedStatement.setInt(2, nodeSource);
            preparedStatement.setInt(3, nodeTarget);
            preparedStatement.setDate(4, java.sql.Date.valueOf(LocalDate.now()));
            preparedStatement.setString(5, relationship.getProperties().get("description"));
            preparedStatement.setString(6, relationship.getLabel());

            int affectedRows = preparedStatement.executeUpdate();
            if (affectedRows == 0) {
                throw new SQLException("Creating node failed, no rows affected.");
            }
            if (preparedStatement.getGeneratedKeys().next()) {
                ResultSet resultSet = preparedStatement.getGeneratedKeys();
                relationship.getProperties()
                        .addProperty(new Pair("id", String.valueOf(resultSet.getInt("relationship_id"))));
                return relationship;
            }
        } catch (SQLException e) {
            System.out.println("Error creating relationship.");
            e.printStackTrace();
        }
        return null;
    }

    public Node createNodeFromResultSet(ResultSet resultSet, String label,
            String propertyPrefix)
            throws SQLException {
        Node newNode = new Node(Node.Type.NODE,
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

    public Node createNodeFromResultSet(ResultSet resultSet, String label)
            throws SQLException {
        // Node newNode = new
        // Node(Node.Type.NODE,
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

    public Node[] matchNode(Node node) {
        ArrayList<Node> nodes = new ArrayList<>();

        String selectNode = "SELECT *";
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
            }

            resultSet.close();
            preparedStatement.close();

        } catch (SQLException e) {
            System.out.println("Error returning node.");
            e.printStackTrace();
        }

        return nodes.toArray(Node[]::new);
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

    public void updateNodeProperties(Node node) throws Exception {
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

        try {
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

    public MatchQueryResult[] getNodesWithAnyRelationship(Node nodeSource,
            Node nodeTarget) {
        String[] sourceSelectProperties = nodeSource.getSelectProperties();
        String[] targetSelectProperties = nodeTarget.getSelectProperties();

        Pair[] nodeSourceFilter = nodeSource.getProperties().getProperties();
        Pair[] targetSourceFilter = nodeTarget.getProperties().getProperties();

        String sql = "SELECT " +
                "src.node_id AS source_node_id, " +
                "trgt.node_id AS target_node_id, ";

        ArrayList<MatchQueryResult> result = new ArrayList<>();

        for (String property : sourceSelectProperties) {
            if (property.equals("id") || property.equals("*")) {
                continue;
            }
            sql = sql + "src.node_" + property + " AS source_node_" + property + ", ";
        }

        for (String property : targetSelectProperties) {
            if (property.equals("id") || property.equals("*")) {
                continue;
            }
            sql = sql + "trgt.node_" + property + " AS target_node_" + property + ", ";
        }

        sql = sql.substring(0, sql.length() - 2) + " ";

        sql = sql + "FROM " +
                relationships_table_name + " r " +
                "JOIN " +
                nodes_table_name + " src ON r.edge_source_node_id = src.node_id " +
                "JOIN " +
                nodes_table_name + " trgt ON r.edge_target_node_id = trgt.node_id " +
                "WHERE ";

        for (Pair pair : nodeSourceFilter) {
            sql = sql + "src.node_" + pair.getProperty() + " = ? AND ";
        }
        for (Pair pair : targetSourceFilter) {
            sql = sql + "trgt.node_" + pair.getProperty() + " = ? AND ";
        }

        sql = sql.substring(0, sql.length() - 5) + ";";

        try {
            // prepared statement
            PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);
            // execute statement

            int i = 1;
            for (Pair pair : nodeSourceFilter) {
                preparedStatement.setString(i, pair.getValue());
                i++;
            }
            for (Pair pair : targetSourceFilter) {
                preparedStatement.setString(i, pair.getValue());
                i++;
            }

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Node sourceNode = createNodeFromResultSet(resultSet,
                        nodeSource.getLabel(), "source_node_");
                Node targetNode = createNodeFromResultSet(resultSet,
                        nodeTarget.getLabel(), "target_node_");

                MatchQueryResult matchQueryResult = new MatchQueryResult(sourceNode, targetNode);
                result.add(matchQueryResult);
            }
        } catch (SQLException e) {
            System.out.println("Error deleting node.");
            e.printStackTrace();
        }

        return result.toArray(MatchQueryResult[]::new);
    }

    public MatchQueryResult[] getNodesWithDirectedRelationship(Node nodeSource,
            Node nodeTarget,
            Node relationship) {
        String[] sourceSelectProperties = nodeSource.getSelectProperties();
        String[] targetSelectProperties = nodeTarget.getSelectProperties();
        String[] relationshipSelectProperties = relationship.getSelectProperties();

        Pair[] nodeSourceFilter = nodeSource.getProperties().getProperties();
        Pair[] targetSourceFilter = nodeTarget.getProperties().getProperties();
        Pair[] relationshipSourceFilter = relationship.getProperties().getProperties();

        String sql = "SELECT " +
                "src.node_id AS source_node_id, " +
                "trgt.node_id AS target_node_id, ";

        ArrayList<MatchQueryResult> result = new ArrayList<>();

        for (String property : sourceSelectProperties) {
            if (property.equals("id") || property.equals("*")) {
                continue;
            }
            sql = sql + "src.node_" + property + " AS source_node_" + property + ", ";
        }

        for (String property : targetSelectProperties) {
            if (property.equals("id") || property.equals("*")) {
                continue;
            }
            sql = sql + "trgt.node_" + property + " AS target_node_" + property + ", ";
        }

        for (String property : relationshipSelectProperties) {
            if (property.equals("id") || property.equals("*")) {
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
                nodes_table_name + " trgt ON r.edge_target_node_id = trgt.node_id " +
                "WHERE ";

        for (Pair pair : nodeSourceFilter) {
            sql = sql + "src.node_" + pair.getProperty() + " = ? AND ";
        }
        for (Pair pair : targetSourceFilter) {
            sql = sql + "trgt.node_" + pair.getProperty() + " = ? AND ";
        }
        for (Pair pair : relationshipSourceFilter) {
            sql = sql + "r.relationship_" + pair.getProperty() + " = ? AND ";
        }

        sql = sql.substring(0, sql.length() - 5) + ";";

        try {
            // prepared statement
            PreparedStatement preparedStatement = dbConnection.prepareStatement(sql);
            // execute statement

            int i = 1;
            for (Pair pair : nodeSourceFilter) {
                preparedStatement.setString(i, pair.getValue());
                i++;
            }
            for (Pair pair : targetSourceFilter) {
                preparedStatement.setString(i, pair.getValue());
                i++;
            }
            for (Pair pair : relationshipSourceFilter) {
                preparedStatement.setString(i, pair.getValue());
                i++;
            }

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Node sourceNode = createNodeFromResultSet(resultSet,
                        nodeSource.getLabel(), "source_node_");
                Node targetNode = createNodeFromResultSet(resultSet,
                        nodeTarget.getLabel(), "target_node_");
                Node relationshipNode = createNodeFromResultSet(resultSet,
                        nodeTarget.getLabel(), "relationship_");

                MatchQueryResult matchQueryResult = new MatchQueryResult(sourceNode, targetNode, relationshipNode);
                result.add(matchQueryResult);
            }
        } catch (SQLException e) {
            System.out.println("Error deleting node.");
            e.printStackTrace();
        }

        return result.toArray(MatchQueryResult[]::new);
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
