import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentCRUD {
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

        // INSERT
        st.executeUpdate(
            "INSERT INTO student VALUES (6, 'Rahul', 'CSE', 82)"
        );

        System.out.println("Student inserted.");

        // UPDATE
        st.executeUpdate(
            "UPDATE student SET marks = 90 WHERE rollno = 6"
        );

        System.out.println("Student updated.");

        // READ
        ResultSet rs = st.executeQuery(
            "SELECT * FROM student"
        );

        System.out.println("\nStudent Records:");

        while (rs.next()) {
            System.out.println("Roll No: " + rs.getInt("rollno"));
            System.out.println("Name: " + rs.getString("name"));
            System.out.println("Course: " + rs.getString("course"));
            System.out.println("Marks: " + rs.getInt("marks"));
            System.out.println("----------------------");
        }

        // DELETE
        st.executeUpdate(
            "DELETE FROM student WHERE rollno = 6"
        );

        System.out.println("Student deleted.");

        rs.close();
        st.close();
        con.close();
    }
}