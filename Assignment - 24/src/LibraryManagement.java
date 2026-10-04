import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class LibraryManagement {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Library Management System");

        JLabel l1 = new JLabel("Book ID:");
        JLabel l2 = new JLabel("Title:");
        JLabel l3 = new JLabel("Author:");

        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JTextField t3 = new JTextField();

        JButton add = new JButton("Add Book");
        JButton display = new JButton("Display Books");

        l1.setBounds(30, 30, 100, 30);
        t1.setBounds(130, 30, 200, 30);

        l2.setBounds(30, 70, 100, 30);
        t2.setBounds(130, 70, 200, 30);

        l3.setBounds(30, 110, 100, 30);
        t3.setBounds(130, 110, 200, 30);

        add.setBounds(50, 160, 120, 30);
        display.setBounds(190, 160, 140, 30);

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

                    String sql = "INSERT INTO library VALUES (?, ?, ?)";

                    PreparedStatement ps = con.prepareStatement(sql);

                    ps.setInt(1, Integer.parseInt(t1.getText()));
                    ps.setString(2, t2.getText());
                    ps.setString(3, t3.getText());

                    ps.executeUpdate();

                    JOptionPane.showMessageDialog(
                        frame,
                        "Book added successfully."
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
                        "SELECT * FROM library"
                    );

                    String data = "";

                    while (rs.next()) {
                        data += "Book ID: " + rs.getInt("book_id") + "\n";
                        data += "Title: " + rs.getString("title") + "\n";
                        data += "Author: " + rs.getString("author") + "\n";
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
        frame.add(add);
        frame.add(display);

        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}