import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class Terms {
    JFrame mainFrame;

    Terms() {
        mainFrame = new JFrame("Terms and Conditions!");

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
    }
}
