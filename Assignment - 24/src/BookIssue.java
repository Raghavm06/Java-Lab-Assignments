import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class BookIssue {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Book Issue Tracking System");

        JLabel l1 = new JLabel("Book ID:");
        JLabel l2 = new JLabel("Student Name:");
        JLabel l3 = new JLabel("Issue Date:");
        JLabel l4 = new JLabel("Return Date:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();
        JTextField t4 = new JTextField();

        JButton add = new JButton("Issue Book");
        JButton display = new JButton("Display Records");

        l1.setBounds(30, 30, 100, 30);
        t1.setBounds(140, 30, 200, 30);

        l2.setBounds(30, 70, 100, 30);
        t2.setBounds(140, 70, 200, 30);

        l3.setBounds(30, 110, 100, 30);
        t3.setBounds(140, 110, 200, 30);

        l4.setBounds(30, 150, 100, 30);
        t4.setBounds(140, 150, 200, 30);

        add.setBounds(50, 200, 120, 30);
        display.setBounds(190, 200, 140, 30);

        add.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {
                    String password = Files.readString(
                        Path.of("db_password.txt")
                    ).trim();

                    Connection con = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/jdbc_demo",
                        "root",
                        password
                    );

                    String sql =
                        "INSERT INTO book_issue VALUES (?, ?, ?, ?)";

                    PreparedStatement ps = con.prepareStatement(sql);

                    ps.setInt(1, Integer.parseInt(t1.getText()));
                    ps.setString(2, t2.getText());
                    ps.setString(3, t3.getText());
                    ps.setString(4, t4.getText());

                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(
                        frame,
                        "Book issue record added successfully."
                    );

                    ps.close();
                    con.close();

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(
                        frame,
                        "Error: " + ex.getMessage()
                    );
                }
            }
        });

        display.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {

                try {
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
                        "SELECT * FROM book_issue"
                    );

                    String data = "";

                    while (rs.next()) {
                        data += "Book ID: " + rs.getInt("book_id") + "\n";
                        data += "Student: " + rs.getString("student_name") + "\n";
                        data += "Issue Date: " + rs.getString("issue_date") + "\n";
                        data += "Return Date: " + rs.getString("return_date") + "\n";
                        data += "----------------------\n";
                    }

                    JOptionPane.showMessageDialog(frame, data);

                    rs.close();
                    st.close();
                    con.close();

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(
                        frame,
                        "Error: " + ex.getMessage()
                    );
                }
            }
        });

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(l3);
        frame.add(t3);
        frame.add(l4);
        frame.add(t4);
        frame.add(add);
        frame.add(display);

        frame.setSize(400, 290);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}