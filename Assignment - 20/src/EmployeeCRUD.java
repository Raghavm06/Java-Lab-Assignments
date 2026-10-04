import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeCRUD {
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
            "INSERT INTO company VALUES (101, 'Amit', 25, 'Pune', 50000)"
        );

        System.out.println("Employee inserted.");

        // UPDATE
        st.executeUpdate(
            "UPDATE company SET SALARY = 55000 WHERE ID = 101"
        );

        System.out.println("Employee updated.");

        // READ
        ResultSet rs = st.executeQuery(
            "SELECT * FROM company"
        );

        System.out.println("\nEmployee Records:");

        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("ID"));
            System.out.println("Name: " + rs.getString("NAME"));
            System.out.println("Age: " + rs.getInt("AGE"));
            System.out.println("Address: " + rs.getString("ADDRESS"));
            System.out.println("Salary: " + rs.getInt("SALARY"));
            System.out.println("----------------------");
        }

        // DELETE
        st.executeUpdate(
            "DELETE FROM company WHERE ID = 101"
        );

        System.out.println("Employee deleted.");

        rs.close();
        st.close();
        con.close();
    }
}