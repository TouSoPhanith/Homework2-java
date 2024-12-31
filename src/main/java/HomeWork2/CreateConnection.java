package HomeWork2;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/employee_management";
    private static final String USER = "root"; // Replace with your MySQL username
    private static final String PASSWORD = "password"; // Replace with your MySQL password

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connected successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
