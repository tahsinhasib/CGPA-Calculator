import javax.swing.*;

import org.w3c.dom.Text;

import java.awt.*;
import java.awt.event.*;

public class Calculation implements ActionListener {

    JFrame mainFrame;

    JLabel label1; // course
    JLabel label2; // credit
    JLabel label3; // grade

    JLabel label4; // calc

    JLabel c1Label; // course number
    JLabel c2Label;
    JLabel c3Label;
    JLabel c4Label;
    JLabel c5Label;

    JTextField c1Field; // credit number
    JTextField c2Field;
    JTextField c3Field;
    JTextField c4Field;
    JTextField c5Field;

    JTextField g1Field; // grade number
    JTextField g2Field;
    JTextField g3Field;
    JTextField g4Field;
    JTextField g5Field;

    JButton button1; // add course
    JButton button2; // remove course

    private int tracker;

    Calculation() {
        mainFrame = new JFrame("Calculation");

        tracker = 1;

        // color
        Color customColor = new Color(79, 123, 144);

        // for Jlabels
        label1 = new JLabel("Course");
        label1.setBounds(80, 40, 90, 30);
        label1.setForeground(Color.black);
        label1.setVisible(true);
        mainFrame.add(label1);

        label2 = new JLabel("Credit");
        label2.setBounds(215, 40, 90, 30);
        label2.setForeground(Color.black);
        label2.setVisible(true);
        mainFrame.add(label2);

        label3 = new JLabel("Grade");
        label3.setBounds(340, 40, 90, 30);
        label3.setForeground(Color.black);
        label3.setVisible(true);
        mainFrame.add(label3);

        c1Label = new JLabel("Course 1");
        c1Label.setBounds(80, 80, 90, 30);
        mainFrame.add(c1Label);

        c2Label = new JLabel("Course 2");
        c2Label.setBounds(80, 140, 90, 30);
        c2Label.setVisible(false);
        mainFrame.add(c2Label);

        c3Label = new JLabel("Course 3");
        c3Label.setBounds(80, 200, 90, 30);
        c3Label.setVisible(false);
        mainFrame.add(c3Label);

        c4Label = new JLabel("Course 4");
        c4Label.setBounds(80, 260, 90, 30);
        c4Label.setVisible(false);
        mainFrame.add(c4Label);

        c5Label = new JLabel("Course 5");
        c5Label.setBounds(80, 320, 90, 30);
        c5Label.setVisible(false);
        mainFrame.add(c5Label);

        // for credit text fields
        c1Field = new JTextField();
        c1Field.setBounds(190, 80, 90, 30);
        mainFrame.add(c1Field);

        c2Field = new JTextField();
        c2Field.setBounds(190, 140, 90, 30);
        c2Field.setVisible(false);
        mainFrame.add(c2Field);

        c3Field = new JTextField();
        c3Field.setBounds(190, 200, 90, 30);
        c3Field.setVisible(false);
        mainFrame.add(c3Field);

        c4Field = new JTextField();
        c4Field.setBounds(190, 260, 90, 30);
        c4Field.setVisible(false);
        mainFrame.add(c4Field);

        c5Field = new JTextField();
        c5Field.setBounds(190, 320, 90, 30);
        c5Field.setVisible(false);
        mainFrame.add(c5Field);

        // for grade text fields
        g1Field = new JTextField();
        g1Field.setBounds(310, 80, 90, 30);
        mainFrame.add(g1Field);

        g2Field = new JTextField();
        g2Field.setBounds(310, 140, 90, 30);
        g2Field.setVisible(false);
        mainFrame.add(g2Field);

        g3Field = new JTextField();
        g3Field.setBounds(310, 200, 90, 30);
        g3Field.setVisible(false);
        mainFrame.add(g3Field);

        g4Field = new JTextField();
        g4Field.setBounds(310, 260, 90, 30);
        g4Field.setVisible(false);
        mainFrame.add(g4Field);

        g5Field = new JTextField();
        g5Field.setBounds(310, 320, 90, 30);
        g5Field.setVisible(false);
        mainFrame.add(g5Field);

        // for buttons
        button1 = new JButton("Add Course");
        button1.setBounds(550, 180, 120, 30);
        button1.setFocusPainted(false);
        button1.addActionListener(this);
        mainFrame.add(button1);

        button2 = new JButton("Remove");
        button2.setBounds(550, 230, 120, 30);
        button2.setFocusPainted(false);
        button2.addActionListener(this);
        mainFrame.add(button2);

        // for picture
        label4 = new JLabel();
        label4.setIcon(new ImageIcon("images\\calc.png"));
        label4.setBounds(10, 10, 445, 525);
        label4.setVisible(true);
        mainFrame.add(label4);

        // settings for mainFrame
        mainFrame.setSize(800, 600);
        mainFrame.getContentPane().setBackground(customColor);
        mainFrame.setLayout(null);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Image icon = Toolkit.getDefaultToolkit().getImage("images\\home1.png");
        mainFrame.setIconImage(icon);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {
            switch (tracker) {
                case 1:
                    c2Label.setVisible(true);
                    c2Field.setVisible(true);
                    g2Field.setVisible(true);
                    tracker++;
                    break;
                case 2:
                    c3Label.setVisible(true);
                    c3Field.setVisible(true);
                    g3Field.setVisible(true);
                    tracker++;
                    break;
                case 3:
                    c4Label.setVisible(true);
                    c4Field.setVisible(true);
                    g4Field.setVisible(true);
                    tracker++;
                    break;
                case 4:
                    c5Label.setVisible(true);
                    c5Field.setVisible(true);
                    g5Field.setVisible(true);
                    tracker++;
                    break;
                default:
                    break;
            }
        }

        if (e.getSource() == button2) {
            switch (tracker) {
                case 2:
                    c2Label.setVisible(false);
                    c2Field.setVisible(false);
                    g2Field.setVisible(false);
                    c2Field.setText(null);
                    g2Field.setText(null);
                    tracker--;
                    break;
                case 3:
                    c3Label.setVisible(false);
                    c3Field.setVisible(false);
                    g3Field.setVisible(false);
                    c3Field.setText(null);
                    g3Field.setText(null);
                    tracker--;
                    break;
                case 4:
                    c4Label.setVisible(false);
                    c4Field.setVisible(false);
                    g4Field.setVisible(false);
                    c4Field.setText(null);
                    g4Field.setText(null);
                    tracker--;
                    break;
                case 5:
                    c5Label.setVisible(false);
                    c5Field.setVisible(false);
                    g5Field.setVisible(false);
                    c5Field.setText(null);
                    g5Field.setText(null);
                    tracker--;
                    break;
                default:
                    break;
            }
        }
    }

}
