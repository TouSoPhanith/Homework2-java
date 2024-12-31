package HomeWork2;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Operations {

    public static boolean insertEmployee(String name, String surname, int age) {
        String query = "INSERT INTO employee (name, surname, age) VALUES (?, ?, ?)";
        try (Connection connection = CreateConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, surname);
            stmt.setInt(3, age);
            stmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean deleteEmployee(int eid) {
        String query = "DELETE FROM employee WHERE eid = ?";
        try (Connection connection = CreateConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setInt(1, eid);
            stmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean updateEmployee(int eid, String name, String surname, int age) {
        String query = "UPDATE employee SET name = ?, surname = ?, age = ? WHERE eid = ?";
        try (Connection connection = CreateConnection.getConnection();
             PreparedStatement stmt = connection.prepareStatement(query)) {
            stmt.setString(1, name);
            stmt.setString(2, surname);
            stmt.setInt(3, age);
            stmt.setInt(4, eid);
            stmt.executeUpdate();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}



