import javax.swing.*;
import java.awt.event.*;

public class StudentForm {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Student Registration Form");

        JLabel l1 = new JLabel("Name:");
        l1.setBounds(50, 30, 100, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 30, 150, 30);

        JLabel l2 = new JLabel("Roll No:");
        l2.setBounds(50, 70, 100, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(150, 70, 150, 30);

        JLabel l3 = new JLabel("Course:");
        l3.setBounds(50, 110, 100, 30);

        JTextField t3 = new JTextField();
        t3.setBounds(150, 110, 150, 30);

        JButton button = new JButton("Register");
        button.setBounds(120, 160, 120, 40);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame,
                    "Name: " + t1.getText() +
                    "\nRoll No: " + t2.getText() +
                    "\nCourse: " + t3.getText());
            }
        });

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(l3);
        frame.add(t3);
        frame.add(button);

        frame.setSize(380, 270);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}