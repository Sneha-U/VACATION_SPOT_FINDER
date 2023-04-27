import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckHotels extends JFrame implements ActionListener{

    JButton b;
    String username;
    
    CheckHotels (String username) {
        this.username = username;
        
        this.setBounds(350, 150, 900, 600);
        String[] hotel1 = new String[]{"htl1.jpg","Ritz-Carlton Hotel", "Cost per person 2000rs", "Cost per person(AC) 3000rs", "Including food 3000rs/4000rs"};
        String[] hotel2 = new String[]{"htl2.jpg","Rosewood Hotels & Resorts.",  "Cost per person 2000rs", "Cost per person(AC) 2500rs", "Including food 2500rs/3000rs"};
        String[] hotel3 = new String[]{"htl3.jpg","Aman Resorts", "Cost per person 2000rs", "Cost per person(AC) 3000rs", "Including food 2500rs/3500rs"};
        String[] hotel4 = new String[]{"htl4.jpg","Taj Resorts and Palaces.", "Cost per person 2000rs", "Cost per person(AC) 3000rs", "Including food 3500rs/4500rs"};
        String[] hotel5 = new String[]{"htl5.jpg","Le meridian Group of Hotels", "Cost per person 3000rs", "Cost per person(AC) 3500rs", "Including food 4000rs/4500rs"};
        String[] hotel6 = new String[]{"htl6.jpg","Maurya Sheraton Hotels",  "Cost per person 3500rs", "Cost per person(AC) 4500rs", "Including food 4500rs/5500rs"};
        String[] hotel7 = new String[]{"htl7.jpg","Oberoi Hotels and Resorts.", "Cost per person 4000rs", "Cost per person(AC) 4500rs", "Including food 5500rs/6000rs"};
        
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel p1 = createPackage(hotel1);
        tabbedPane.addTab("Ritz-Carlton Hotel", null, p1);
        
        JPanel p2 = createPackage(hotel2);
        tabbedPane.addTab("Rosewood Hotels & Resorts.", null, p2);
        
        JPanel p3 = createPackage(hotel3);
        tabbedPane.addTab("Aman Resorts", null, p3);
        
        JPanel p4 = createPackage(hotel4);
        tabbedPane.addTab("Taj Resorts and Palaces.", null, p4);
        
        JPanel p5 = createPackage(hotel5);
        tabbedPane.addTab("Le meridian Group of Hotels", null, p5);
        
        JPanel p6 = createPackage(hotel6);
        tabbedPane.addTab("Maurya Sheraton Hotels", null, p6);
        
        JPanel p7 = createPackage(hotel7);
        tabbedPane.addTab("Oberoi Hotels and Resorts.", null, p7);
        


        b = new JButton("Book Now");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(150, 400, 100, 25);
        b.addActionListener(this);
        add(b);
        
        this.add(tabbedPane, BorderLayout.CENTER);
    }
    
    public JPanel createPackage (String[] pack) {
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);

        JLabel l1 = new JLabel(pack[1]);
        l1.setBounds(250, 20, 500, 30);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(l1);

        JLabel l2 = new JLabel(pack[2]);
        l2.setBounds(50, 150, 1200, 30);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l2.setForeground(Color.RED);
        p1.add(l2);

        JLabel l3 = new JLabel(pack[3]);
        l3.setBounds(50, 200, 300, 30);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l3.setForeground(Color.BLUE);
        p1.add(l3);

        JLabel l4 = new JLabel(pack[4]);
        l4.setBounds(50, 250, 300, 30);
        l4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l4.setForeground(Color.RED);
        p1.add(l4);
        

//        b = new JButton("Book Now");
//        b.setBackground(Color.BLACK);
//        b.setForeground(Color.WHITE);
//        b.setBounds(150, 400, 100, 25);
//        b.addActionListener(this);
//        p1.add(b);
        
        ImageIcon i1 = new ImageIcon(this.getClass().getResource("/" + pack[0] + ""));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(350, 110, 500, 300);
        p1.add(l12);

        return p1;
        
    }
    
    public void actionPerformed (ActionEvent ae) {
        if(ae.getSource() == b) {
            new BookHotel(username).setVisible(true);
        }
    }

    public static void main(String[] args) {
        new CheckHotels("manvanthgs").setVisible(true);
    }
}