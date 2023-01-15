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

    JLabel label2; // home1

    Homepage() {
        mainFrame = new JFrame("CGPA Calculator");

        // color
        Color customColor = new Color(79, 123, 144);

        // button settings
        button1 = new JButton("Start");
        button1.setBounds(580, 250, 150, 30);
        button1.setVisible(true);
        button1.setFocusPainted(false);
        button1.addActionListener(this);
        mainFrame.add(button1);

        button2 = new JButton("Help");
        button2.setBounds(580, 300, 150, 30);
        button2.setVisible(true);
        button2.setFocusPainted(false);
        button2.addActionListener(this);
        mainFrame.add(button2);

        button3 = new JButton("Exit");
        button3.setBounds(580, 350, 150, 30);
        button3.setVisible(true);
        button3.setFocusPainted(false);
        button3.addActionListener(this);
        mainFrame.add(button3);

        label2 = new JLabel();
        label2.setIcon(new ImageIcon(getClass().getResource("/images/home1.png")));
        label2.setBounds(10, -20, 600, 600);
        label2.setVisible(true);
        mainFrame.add(label2);

        // settings for mainFrame
        mainFrame.setSize(800, 600);
        mainFrame.getContentPane().setBackground(customColor);
        mainFrame.setLayout(null);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\home1.png");
        mainFrame.setIconImage(icon);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button2) {
            new Terms();
        }
        if (e.getSource() == button3) {
            mainFrame.dispose();
        }
        if (e.getSource() == button1) {
            mainFrame.dispose();
            new Calculation();
        }
    }
}
