import java.awt.*;         
import java.awt.event.*;
import javax.swing.*;        //framework for building GUI
import java.awt.Font;
import javax.swing.JFrame;

public class About extends JFrame implements ActionListener {

    String s;

    public About() {

        this.setBounds(530, 180, 500, 550);
        this.getContentPane().setBackground(Color.WHITE);
        this.setLayout(null);

        s = "                                    About Project          \n  "
                + "\nThe objective of the Vacation spot finder application"
                + "project is to develop a system that automates the processes "
                + "and activities of a travel and the purpose is to design a "
                + "system using which one can perform all operations related to "
                + "traveling.\n\n"
                + "This application will help in accessing the information related "
                + "to the travel to the particular destination with great ease. "
                + "The users can track the information related to their tours with "
                + "great ease through this application. The travel agency information "
                + "can also be obtained through this application.\n\n"
        ;

        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setFont(new Font("RALEWAY", Font.BOLD, 16));
        t1.setBounds(20, 100, 450, 300);
        this.add(t1);

        JLabel l1 = new JLabel("Travel and Tourism Management System");
        l1.setFont(new Font("Tahoma", Font.BOLD, 20));
        l1.setForeground(Color.RED);
        l1.setBounds(50, 10, 500, 80);
        this.add(l1);

        JButton b = new JButton("Exit");
        b.setBounds(180, 430, 120, 20);
        b.addActionListener(this);
        this.add(b);
    }

    public void actionPerformed(ActionEvent e) {
        dispose();
    }

    public static void main(String args[]) {
        new About().setVisible(true);
    }

}