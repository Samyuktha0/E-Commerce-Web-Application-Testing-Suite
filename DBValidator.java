package utils;

import java.sql.*;

public class DBValidator {
    public static boolean validateOrder(String userId) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "password");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM orders WHERE user_id = '" + userId + "' AND status = 'confirmed'");
            return rs.next();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
