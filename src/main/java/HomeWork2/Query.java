package HomeWork2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Query {
    public static void displayAllEmployees() {
        String query = "SELECT * FROM employees";
        try (Connection conn = CreateConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Age: " + rs.getInt("age") +
                        ", Department: " + rs.getString("department") +
                        ", Salary: " + rs.getDouble("salary"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

