package simpledb.graph;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import simpledb.remote.SimpleDriver;

public class simpleDBHelper {

    private static Connection conn = null;

    public simpleDBHelper() {
        try {
            // connect to database server
            Driver d = new SimpleDriver();
            conn = d.connect("jdbc:simpledb://localhost", null);
        }
        catch(SQLException e) {
            System.err.println("Error connecting to database server.");
            System.exit(1);
        }
    }



    public void createNewTable(String nodeTableName, String schema, String edgeTableName){
        try {
            // query directly using JDBC APIs
            Statement stmt = conn.createStatement();
            String sqlText = "create table " + nodeTableName + " (" + schema + ")";
            int rs = stmt.executeUpdate(sqlText);

            schema = "id int, source int, destination int, relationshipType varchar(20),"
                    + "    FOREIGN KEY (source) REFERENCES " + nodeTableName + "(node_id),"
                    + "    FOREIGN KEY (destination) REFERENCES " + nodeTableName + "(node_id)";
            sqlText = "create table " + edgeTableName + " (" + schema + ")";
        }
        catch(SQLException e) {
            System.err.println("Error creating new table.");
            System.exit(1);
        }
    }
 
    public int checkIfTableExists(String tblName){
        try {
            // query directly using JDBC APIs
            Statement stmt = conn.createStatement();
            // this could lead to sql injection but simpleDB does not support prepared statements
            String sqlText = "select tblname from tblcat where tblname = '" + tblName + "'";
            ResultSet rs = stmt.executeQuery(sqlText);
            if (rs != null){
                while (rs.next()) {
                    System.out.println(rs.getString("tblname"));
                }
            }
        }
        catch(SQLException e) {
            System.err.println("Error checking if table exists.");
            System.exit(1);
        }
        return 0;
    }
}
