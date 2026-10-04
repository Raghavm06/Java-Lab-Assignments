import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDB {
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
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM student");

        while (rs.next()) {
            System.out.println("Roll No: " + rs.getInt("rollno"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("----------------------");
        }

        rs.close();
        st.close();
        con.close();
    }
}