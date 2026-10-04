import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class HospitalLogin {
    public static void main(String[] args) throws Exception {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String password = Files.readString(
            Path.of("db_password.txt")
        ).trim();

        Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/jdbc_demo",
            "root",
            password
        );

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Login ID: ");
        String loginId = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        String sql = "SELECT * FROM hospital_staff WHERE login_id = ? AND password = ?";

        PreparedStatement ps = con.prepareStatement(sql);

        ps.setString(1, loginId);
        ps.setString(2, pass);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println("Login successful.");
            System.out.println("Access granted to " + rs.getString("role") + ".");
        } else {
            System.out.println("Invalid Login ID or Password.");
            System.out.println("Access denied.");
        }

        rs.close();
        ps.close();
        con.close();
        sc.close();
    }
}