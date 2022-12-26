import javax.swing.*;
import org.w3c.dom.Text;
import java.awt.*;
import java.awt.event.*;

public class Calculation implements ActionListener {

    JFrame mainFrame;

    JLabel label1; // course
    JLabel label2; // credit
    JLabel label3; // grade
    JLabel label5; // quote
    JLabel label6; // semester
    JLabel label7; // SGPA

    JLabel label4; // calc png

    JLabel c1Label; // course number
    JLabel c2Label;
    JLabel c3Label;
    JLabel c4Label;
    JLabel c5Label;

    JLabel sem1Label; // semester number
    JLabel sem2Label;
    JLabel sem3Label;
    JLabel sem4Label;
    JLabel sem5Label;

    JTextField c1Field; // credit number
    JTextField c2Field;
    JTextField c3Field;
    JTextField c4Field;
    JTextField c5Field;

    JTextField s1Field; // SGPA
    JTextField s2Field;
    JTextField s3Field;
    JTextField s4Field;
    JTextField s5Field;

    JTextField g1Field; // grade number
    JTextField g2Field;
    JTextField g3Field;
    JTextField g4Field;
    JTextField g5Field;

    JButton button1; // add course
    JButton button2; // remove course
    JButton button3; // back
    JButton button4; // switch
    JButton button5; // calculate

    private int tracker; // tracks adding removing
    private int swapper; // swaps calculation between with course and with semester

    Calculation() {
        mainFrame = new JFrame("Calculation");

        tracker = 1;
        swapper = 1;

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

        label6 = new JLabel("Semester");
        label6.setBounds(80, 40, 90, 30);
        label6.setForeground(Color.black);
        label6.setVisible(false);
        mainFrame.add(label6);

        label7 = new JLabel("SGPA");
        label7.setBounds(340, 40, 90, 30);
        label7.setForeground(Color.black);
        label7.setVisible(false);
        mainFrame.add(label7);

        label4 = new JLabel("<html>Click here to switch the calculation type<br><br>Now displaying</html>");
        label4.setBounds(500, 40, 300, 50);
        label4.setForeground(Color.black);
        label4.setVisible(true);
        mainFrame.add(label4);

        // course wise displays as default
        c1Label = new JLabel("COURSE 1");
        c1Label.setBounds(80, 80, 90, 30);
        mainFrame.add(c1Label);

        c2Label = new JLabel("COURSE 2");
        c2Label.setBounds(80, 140, 90, 30);
        c2Label.setVisible(false);
        mainFrame.add(c2Label);

        c3Label = new JLabel("COURSE 3");
        c3Label.setBounds(80, 200, 90, 30);
        c3Label.setVisible(false);
        mainFrame.add(c3Label);

        c4Label = new JLabel("COURSE 4");
        c4Label.setBounds(80, 260, 90, 30);
        c4Label.setVisible(false);
        mainFrame.add(c4Label);

        c5Label = new JLabel("COURSE 5");
        c5Label.setBounds(80, 320, 90, 30);
        c5Label.setVisible(false);
        mainFrame.add(c5Label);

        // semester wise stays hidden until user proceeds to it
        sem1Label = new JLabel("SEMESTER 1");
        sem1Label.setBounds(80, 80, 90, 30);
        sem1Label.setVisible(false);
        mainFrame.add(sem1Label);

        sem2Label = new JLabel("SEMESTER 2");
        sem2Label.setBounds(80, 140, 90, 30);
        sem2Label.setVisible(false);
        mainFrame.add(sem2Label);

        sem3Label = new JLabel("SEMESTER 3");
        sem3Label.setBounds(80, 200, 90, 30);
        sem3Label.setVisible(false);
        mainFrame.add(sem3Label);

        sem4Label = new JLabel("SEMESTER 4");
        sem4Label.setBounds(80, 260, 90, 30);
        sem4Label.setVisible(false);
        mainFrame.add(sem4Label);

        sem5Label = new JLabel("SEMESTER 5");
        sem5Label.setBounds(80, 320, 90, 30);
        sem5Label.setVisible(false);
        mainFrame.add(sem5Label);

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
        button1 = new JButton("ADD COURSE");
        button1.setBounds(550, 180, 120, 30);
        button1.setFocusPainted(false);
        button1.addActionListener(this);
        mainFrame.add(button1);

        button2 = new JButton("REMOVE");
        button2.setBounds(550, 230, 120, 30);
        button2.setFocusPainted(false);
        button2.addActionListener(this);
        mainFrame.add(button2);

        button3 = new JButton("BACK");
        button3.setBounds(550, 280, 120, 30);
        button3.setFocusPainted(false);
        button3.addActionListener(this);
        mainFrame.add(button3);

        button4 = new JButton("WITH COURSE");
        button4.setBounds(600, 70, 160, 30);
        button4.setFocusPainted(false);
        button4.addActionListener(this);
        mainFrame.add(button4);

        button5 = new JButton("CALCULATE");
        button5.setBounds(530, 350, 160, 30);
        button5.setBackground(Color.red);
        button5.setForeground(Color.white);
        button5.setFocusPainted(false);
        button5.addActionListener(this);
        mainFrame.add(button5);

        // for picture
        label4 = new JLabel();
        label4.setIcon(new ImageIcon("src\\images\\calc.png"));
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

        Image icon = Toolkit.getDefaultToolkit().getImage("src\\images\\home1.png");
        mainFrame.setIconImage(icon);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button1) {
            switch (tracker) {
                case 1:
                    if (swapper == 0) {
                        sem2Label.setVisible(true);
                        c2Field.setVisible(true);
                        g2Field.setVisible(true);
                        tracker++;
                    } else {
                        c2Label.setVisible(true);
                        c2Field.setVisible(true);
                        g2Field.setVisible(true);
                        tracker++;
                    }
                    break;
                case 2:
                    if (swapper == 0) {
                        sem3Label.setVisible(true);
                        c3Field.setVisible(true);
                        g3Field.setVisible(true);
                        tracker++;
                    } else {
                        c3Label.setVisible(true);
                        c3Field.setVisible(true);
                        g3Field.setVisible(true);
                        tracker++;
                    }
                    break;
                case 3:
                    if (swapper == 0) {
                        sem4Label.setVisible(true);
                        c4Field.setVisible(true);
                        g4Field.setVisible(true);
                        tracker++;
                    } else {
                        c4Label.setVisible(true);
                        c4Field.setVisible(true);
                        g4Field.setVisible(true);
                        tracker++;
                    }
                    break;
                case 4:
                    if (swapper == 0) {
                        sem5Label.setVisible(true);
                        c5Field.setVisible(true);
                        g5Field.setVisible(true);
                        tracker++;
                    } else {
                        c5Label.setVisible(true);
                        c5Field.setVisible(true);
                        g5Field.setVisible(true);
                        tracker++;
                    }
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

        if (e.getSource() == button3) {
            mainFrame.dispose();
            new Homepage();
        }

        if (e.getSource() == button4) {
            switch (swapper) {
                case 1:
                    swapper = 0;
                    button4.setText("WITH SEMESTER");
                    break;
                case 0:
                    swapper = 1;
                    button4.setText("WITH COURSE");
                default:
                    break;
            }
        }

        if (e.getSource() == button4 && swapper == 0) {
            tracker = 1; // tracker resets
            label1.setVisible(false);
            label3.setVisible(false);
            c1Label.setVisible(false);
            c2Label.setVisible(false);
            c3Label.setVisible(false);
            c4Label.setVisible(false);
            c5Label.setVisible(false);
            // course field
            c2Field.setVisible(false);
            c3Field.setVisible(false);
            c4Field.setVisible(false);
            c5Field.setVisible(false);
            // grade field
            g2Field.setVisible(false);
            g3Field.setVisible(false);
            g4Field.setVisible(false);
            g5Field.setVisible(false);
            // now turns the semester wise on
            sem1Label.setVisible(true);
            label6.setVisible(true);
            label7.setVisible(true);
        }

    }

}
