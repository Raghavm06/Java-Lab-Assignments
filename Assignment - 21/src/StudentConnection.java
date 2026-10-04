import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;

public class StudentConnection {
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

        if (con != null) {
            System.out.println(
                "Student database is connected successfully."
            );
        }

        con.close();
    }
}