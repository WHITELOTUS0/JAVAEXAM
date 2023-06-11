package JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCCon {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "";
        String password = "Bujumbura1#";

        try {
            // Register the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            // Perform database operations....
            String insertQuery = "INSERT INTO mytable (Name, Password) VALUES (?, ?)";
            PreparedStatement statement = connection.prepareStatement(insertQuery);
            // Set the parameter values
            statement.setString(1, "sharo");
            statement.setString(2, "password123");

            // Execute the INSERT statement
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Values inserted successfully!");
            } else {
                System.out.println("No rows affected. Insertion failed.");
            }

            // Close the connection
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Failed to connect to the database!");
            e.printStackTrace();
        }
    }
}

