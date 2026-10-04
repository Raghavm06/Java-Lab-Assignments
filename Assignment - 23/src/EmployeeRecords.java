import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeRecords {
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

        ResultSet rs = st.executeQuery(
            "SELECT ID, NAME, DEPARTMENT, SALARY FROM company"
        );

        while (rs.next()) {
            System.out.println("Employee ID: " + rs.getInt("ID"));
            System.out.println("Name: " + rs.getString("NAME"));
            System.out.println("Department: " + rs.getString("DEPARTMENT"));
            System.out.println("Salary: " + rs.getInt("SALARY"));
            System.out.println("----------------------");
        }

        rs.close();
        st.close();
        con.close();
    }
}