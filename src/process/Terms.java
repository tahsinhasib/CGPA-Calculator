package process;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Terms {
    JFrame mainFrame;

    JLabel label1;
    JLabel label2;

    Terms() {
        mainFrame = new JFrame("Terms and Conditions!");

        label1 = new JLabel(
                "<html>This application is limited to calculate maximum of 5 for both course wise and semester wise. The program gives a default NaN for calculating course wise GPA with null courses. However, when calculating semester wise the grade will impact if there remains null value for CGPA of semester.</html>");
        label1.setBounds(25, 25, 330, 90);
        label1.setForeground(Color.black);
        mainFrame.add(label1);

        label2 = new JLabel("MD. TAHSIN HASIB");
        label2.setBounds(220, 190, 190, 30);
        label2.setForeground(Color.black);
        mainFrame.add(label2);

        // color componenets
        Color customColor = new Color(79, 123, 144);

        // settings for mainFrame
        mainFrame.setSize(400, 300);
        mainFrame.getContentPane().setBackground(customColor);
        mainFrame.setLayout(null);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setResizable(false);
        // mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Image icon = Toolkit.getDefaultToolkit().getImage("images\\home1.png");
        mainFrame.setIconImage(icon);
    }
}
