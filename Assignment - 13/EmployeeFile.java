import java.io.*;

public class EmployeeFile {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("employee.txt");

            writer.write("Employee ID: 101\n");
            writer.write("Name: Raghav\n");
            writer.write("Department: Computer Science\n");
            writer.write("Salary: 50000\n");

            writer.close();

            BufferedReader reader =
                new BufferedReader(new FileReader("employee.txt"));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("File Error: " + e.getMessage());
        }
    }
}