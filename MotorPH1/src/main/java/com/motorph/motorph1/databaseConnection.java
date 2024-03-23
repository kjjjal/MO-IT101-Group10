
package com.motorph.motorph1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class databaseConnection {
  
    public databaseConnection() {
        try {
            // Register the PostgreSQL driver
            Class.forName("org.postgresql.Driver");

            // Establish the connection
            Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/employeetable", "postgres", "root");
            System.out.println("Connected to the PostgreSQL database successfully.");

            // Perform database operations here...

            // Close the connection when done
            connection.close();
        } catch (ClassNotFoundException e) {
            System.err.println("PostgreSQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Failed to connect to the PostgreSQL database.");
            e.printStackTrace();
        }
    }
    
    
}
