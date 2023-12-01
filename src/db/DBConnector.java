package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

    private static String url = "jdbc:postgresql://localhost:5432/graphs"; 
    private String username = "postgres";
    private String password = "postgres";
    private Connection connection;
    
    public DBConnector(){

        // Establish connection
        try {
            connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to PostgreSQL database!");
        } catch (SQLException e){
            System.out.println("Connection failure.");
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return connection;
    }
}
