import java.io.*;

public class PatientFile {

    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("patient.txt");

            writer.write("Patient ID: 201\n");
            writer.write("Name: Rahul\n");
            writer.write("Age: 35\n");
            writer.write("Diagnosis: Fever\n");

            writer.close();

            BufferedReader reader =
                new BufferedReader(new FileReader("patient.txt"));

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