import javax.swing.*;
import java.awt.event.*;

public class Calculator {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Calculator");

        JLabel l1 = new JLabel("First Number:");
        l1.setBounds(40, 30, 100, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 30, 150, 30);

        JLabel l2 = new JLabel("Second Number:");
        l2.setBounds(40, 70, 100, 30);

        JTextField t2 = new JTextField();
        t2.setBounds(150, 70, 150, 30);

        JButton add = new JButton("Add");
        add.setBounds(70, 120, 100, 40);

        JButton sub = new JButton("Subtract");
        sub.setBounds(180, 120, 100, 40);

        JLabel result = new JLabel("Result:");
        result.setBounds(100, 180, 200, 30);

        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                result.setText("Result: " + (a + b));
            }
        });

        sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                result.setText("Result: " + (a - b));
            }
        });

        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(add);
        frame.add(sub);
        frame.add(result);

        frame.setSize(350, 260);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}