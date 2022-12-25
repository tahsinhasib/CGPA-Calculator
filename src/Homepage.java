import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Homepage implements ActionListener {
    JFrame mainFrame;

    JLabel label1;

    JButton button1; // start
    JButton button2; // terms
    JButton button3; // exit

    Homepage() {
        mainFrame = new JFrame("CGPA Calculator");

        // color
        Color customColor = new Color(79, 123, 144);

        // button settings
        button1 = new JButton("Start");
        button1.setBounds(300, 250, 150, 30);
        button1.setVisible(true);
        button1.setFocusPainted(false);
        mainFrame.add(button1);

        button2 = new JButton("Help");
        button2.setBounds(300, 300, 150, 30);
        button2.setVisible(true);
        button2.setFocusPainted(false);
        button2.addActionListener(this);
        mainFrame.add(button2);

        button3 = new JButton("Exit");
        button3.setBounds(300, 350, 150, 30);
        button3.setVisible(true);
        button3.setFocusPainted(false);
        button3.addActionListener(this);
        mainFrame.add(button3);

        // settings for mainFrame
        mainFrame.setSize(800, 600);
        mainFrame.getContentPane().setBackground(customColor);
        mainFrame.setLayout(null);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button2) {
            new Terms();
        }
        if (e.getSource() == button3) {
            mainFrame.dispose();
        }
    }
}
