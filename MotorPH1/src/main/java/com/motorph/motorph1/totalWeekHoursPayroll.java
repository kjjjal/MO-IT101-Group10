/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.motorph.motorph1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class totalWeekHoursPayroll {
    String selectedWeekForLabel;
    String accountNumber;
    String selectedWeekPayroll;
    int selectedWeekPayrollInt;
    private static Connection connection;
    private static PreparedStatement statement;
    private static ResultSet resultSet;

    public totalWeekHoursPayroll(String pSelectedWeekForLabel, String pAccountNumber){
        
        selectedWeekForLabel = pSelectedWeekForLabel;
        accountNumber = pAccountNumber;
        
        System.out.println("attendanceclass" + selectedWeekForLabel + accountNumber);
        try {
                // Register the PostgreSQL driver
                Class.forName("org.postgresql.Driver");

                // Establish the connection
                Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/employeetable", "postgres", "root");
                System.out.println("Connected to the PostgreSQL database successfully.");

                // Code for query to input total week hours in attendance sheet in the database
                String sqlQuery = "SELECT " + selectedWeekForLabel + " FROM attendance WHERE accountNumber = ?";
                try (PreparedStatement pstmt = connection.prepareStatement(sqlQuery)) {
                    // Set the parameter in the prepared statement
                    pstmt.setString(1, accountNumber);

                    // Execute the query
                    ResultSet rs = pstmt.executeQuery();

                    // Check if any row was returned
                    if (rs.next()) {
                        // Retrieve the value from the selectedWeekPayroll column
                        selectedWeekPayroll = rs.getString(selectedWeekForLabel);
                        selectedWeekPayrollInt = rs.getInt(selectedWeekForLabel);
                        System.out.println("Selected Week Payroll for Account Number " + accountNumber + ": " + selectedWeekPayrollInt);
                        MotorPH mph1 = new MotorPH();
                        mph1.selectedWeekHoursInt = selectedWeekPayrollInt;
                       
                    } else {
                        System.out.println("No data found for Account Number: " + accountNumber);
                    }
                }
                // Close the connection when done
                connection.close();
                } catch (ClassNotFoundException e) {
                System.err.println("PostgreSQL JDBC Driver not found.");
                e.printStackTrace();
                } catch (SQLException e) {
                System.err.println("Failed to connect to the PostgreSQL database.");
                e.printStackTrace();
                }
        
        System.out.println(selectedWeekPayroll);
    }
    
}
