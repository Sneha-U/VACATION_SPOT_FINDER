import javax.swing.*;
import java.awt.*;

public class CheckPackage extends JFrame {

    CheckPackage () {

        this.setBounds(350, 150, 900, 600);

        String[] package1 = new String[]{"goa.jpg","Goa","Famous for its beaches, nightlife, and seafood","Cavelossim beach", "Varca Beach", "Basilica of bom jesus", "Candolim Beach", "Dudhsagar Falls", "Morjim beach", "", "", "Rs 12000 only"};
        String[] package2 = new String[]{"kerala.jpg","Kerala", "Known as \"God's Own Country\" with its serene backwaters, lush greenery, and authentic cuisine","Periyar wildlife sanctuary", "Edakkal caves", "Kumarakom Bird Sanctuary", "Padmanabhaswamy Temple", "Mananchira", "Thrissur Zoo", "", "", "Rs 25000 only"};
        String[] package3 = new String[]{"rajastan.jpg","Rajasthan"," Rich in history, palaces, forts, and vibrant culture with colorful festivals.","Bundi", "Banswara", "Ajmer", "Hill station", "Gateway city", "Jaisalmer", "", "", "Rs 32000 only"};
        String[] package4 = new String[]{"agra.jpg","Agra","Home to the iconic Taj Mahal, a symbol of love and one of the Seven Wonders of the World.","Agra Fort", "Fatehpur Sikri", "Jama Masjid", "Mehtab Bagh", "Tiranga Chowk", "Soami Bagh", "", "", "Rs 12000 only"};
        String[] package5 = new String[]{"ladakh.jpg","Leh-Ladakh","An adventure destination with its rugged terrain, snow-capped mountains, and Buddhist monasteries.", "breathtaking landscapes", "crystal clear skies", " highest mountain passes", "thrilling adventure activities", "Buddhist Monasteries and festivals", "Kargil", "", "", "Rs 25000 only"};
        String[] package6 = new String[]{"andaman.jpg","Andaman and Nicobar Islands"," Known for its clear turquoise waters, exotic marine life, and stunning beaches.", "stunning beaches", "Rich bio diversity", "Marine ecosystem", "Tropical evergreen forrest", "wildlife", "Site seeing", "", "", "Rs 32000 only"};
        String[] package7 = new String[]{"darjeeling.jpg","Darjeeling"," Famous for its tea plantations, panoramic views of the Himalayas, and colonial architecture.", "Tiger hill", "Himalayan railways", "Batasia loop", "Rangit valley", " Mountaineering Institute", "Peace Pagoda.", "", "", "Rs 12000 only"};
        String[] package8 = new String[]{"udaipur.jpg","Udaipur"," Known as the \"City of Lakes,\" with its beautiful palaces, lakes, and gardens.", "Havelock Island", "Baratang Island", "Radhanagar Beach", "Jolly Buoy Island", "Chidiya Tapu", "Cellular Jail", "", "", "Rs 25000 only"};
        String[] package9 = new String[]{"varanasi.jpg","Varanasi","Considered one of the oldest cities in the world, with its rich history, temples, and ghats.", "Kashi Vishwanath Temple", "Dasaswamedh Ghat.", "Assi Ghat", "Manikarnika Ghat.", "Chunar Fort.", "Tulsi Manas Temple.", "", "", "Rs 32000 only"};
        String[] package10 = new String[]{"rishikesh.jpg","Rishikesh","A spiritual destination with its yoga centers, ashrams, and adventure activities like white water rafting.", "Lakshman Jhula", "Ram Jhula", "Parmarth Niketan Ashram", "Triveni Ghat", " Beatles Ashram", "Gita Bhavan", "", "", "Rs 12000 only"};
        String[] package11 = new String[]{"shimla.jpg","Shimla","A charming hill station known for its colonial architecture, scenic views, and snowy peaks.", "Viper Island.", "Cellular Jail", "Chidiya Tapu", "Jolly Buoy Island", "Radhanagar Beach", "Baratang Island", "", "", "Rs 25000 only"};
        String[] package12 = new String[]{"munnar.jpg","Munnar","A picturesque hill station in Kerala, known for its tea gardens, waterfalls, and scenic beauty.","Havelock Island", "Cellular Jail National Memorial", "Samudrika Naval Marine Museum", "North Bay Beach", "Virgin forrest", "Rolling hill", "", "", "Rs 32000 only"};
        String[] package13 = new String[]{"hampi.jpg","Hampi"," A UNESCO World Heritage Site, known for its ancient temples, ruins, and monuments.", "Sri Virupaksha Temple", "Vijaya Vittala Temple", "Hemakuta Hill Temple Complex", "Hanuman Temple",  "Sasivekalu Ganesha Temple", "Lakshmi Narasimha Temple", "", "", "Rs 12000 only"};
        String[] package14 = new String[]{"jaipur.jpg","Jaipur","Known as the \"Pink City,\" with its beautiful palaces, forts, and rich cultural heritage.","Rutland Island", "Hawa mahal", "Beautiful terrace of Nahargarh Fort", "Panna Meena Ka Kund.", "Jaigarh Fort.", "Nahargarh Fort", "", "", "Rs 25000 only"};
        String[] package15 = new String[]{"mahabaleshwar.jpg","Mahabaleshwar","A popular hill station known for its scenic beauty, strawberry farms, and temples.", "Mahabaleshwar Temple", "Elephant's Head Point", "Velocity Entertainmentz", "Connaught Peak", "Chinaman's Falls", "Lingmala Waterfall", "", "", "Rs 32000 only"};
        String[] package16 = new String[]{"ooty.jpg","Ooty","Known for its scenic beauty, tea gardens, and colonial architecture.","Doddabetta Peak", "Botanical Garden", "Pykara Waterfalls,", "Rose Garden", "Stone House", "Toda Mund", "", "", "Rs 12000 only"};
        String[] package17 = new String[]{"manali.jpg","Manali","A popular hill station with scenic views of the Himalayas, adventure sports, and temples.", "Beas River.", "Hidimba Devi Temple", "Manikaran Gurudwara", "Solang Valley", "Jogini Waterfall", "Gulaba",  "", "", "Rs 25000 only"};
        String[] package18 = new String[]{"pondicherry.jpeg","Pondicherry","A charming coastal town with a French influence, known for its beaches and spiritual centers.","Rock Beach", "Mahatma Gandhi Statue", "The Pondicherry Museum", "Bharati Government Park", "Statue Of Dupleix ", "Eglise de Notre Dame des Anges", "", "", "Rs 32000 only"};
        String[] package19 = new String[]{"port1.jpg","Khajuraho","Famous for its ancient temples, rich history, and intricate carvings.","erotic sculptures", "Monuments", "Cravings", "sculptures",  "temples", "nature view", "", "", "Rs 32000 only"};
        String[] package20 = new String[]{"sikkim.jpg","Sikkim","A serene state with its pristine natural beauty, adventure sports, and Buddhist monasteries.","Nathula Pass", "Kanchenjunga Base Camp", "Lachen valley", "Pelling", "Teesta river", "Goechala source", "", "", "Rs 32000 only"};
        
        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel p1 = createPackage(package1);
        tabbedPane.addTab("Goa", null, p1);
        
        JPanel p2 = createPackage(package2);
        tabbedPane.addTab("Kerala", null, p2);
        
        JPanel p3 = createPackage(package3);
        tabbedPane.addTab("Rajasthan", null, p3);
        
        JPanel p4 = createPackage(package4);
        tabbedPane.addTab("Agra", null, p4);
        
        JPanel p5 = createPackage(package5);
        tabbedPane.addTab("Leh-Ladakh", null, p5);
        
        JPanel p6 = createPackage(package6);
        tabbedPane.addTab("Andaman and Nicobar Islands ", null, p6);
        
        JPanel p7 = createPackage(package7);
        tabbedPane.addTab("Darjeeling", null, p7);
        
        JPanel p8 = createPackage(package8);
        tabbedPane.addTab("Udaipur", null, p8);
        
        JPanel p9 = createPackage(package9);
        tabbedPane.addTab("Varanasi ", null, p9);
        
        JPanel p10 = createPackage(package10);
        tabbedPane.addTab("Rishikesh", null, p10);
        
        JPanel p11 = createPackage(package11);
        tabbedPane.addTab("Shimla", null, p11);
        
        JPanel p12 = createPackage(package12);
        tabbedPane.addTab("Munnar", null, p12);
        
        JPanel p13 = createPackage(package13);
        tabbedPane.addTab("Hampi", null, p13);
        
        JPanel p14 = createPackage(package14);
        tabbedPane.addTab("Jaipur", null, p14);
        
        JPanel p15 = createPackage(package15);
        tabbedPane.addTab("Mahabaleshwar", null, p15);
        
        JPanel p16 = createPackage(package16);
        tabbedPane.addTab("Ooty", null, p16);
        
        JPanel p17 = createPackage(package17);
        tabbedPane.addTab("Manali", null, p17);
        
        JPanel p18 = createPackage(package18);
        tabbedPane.addTab("Pondicherry", null, p18);
        
        JPanel p19 = createPackage(package19);
        tabbedPane.addTab("Khajuraho", null, p19);
        
        JPanel p20 = createPackage(package20);
        tabbedPane.addTab("Sikkim", null, p20);

        this.add(tabbedPane, BorderLayout.CENTER);
    }

    public JPanel createPackage (String[] pack) {
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);

        JLabel l1 = new JLabel(pack[1]);
        l1.setBounds(50, 5, 300, 30);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        p1.add(l1);

        JLabel l2 = new JLabel(pack[2]);
        l2.setBounds(30, 60, 1200, 30);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l2.setForeground(Color.RED);
        p1.add(l2);

        JLabel l3 = new JLabel(pack[3]);
        l3.setBounds(30, 110, 300, 30);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l3.setForeground(Color.BLUE);
        p1.add(l3);

        JLabel l4 = new JLabel(pack[4]);
        l4.setBounds(30, 160, 300, 30);
        l4.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l4.setForeground(Color.RED);
        p1.add(l4);

        JLabel l5 = new JLabel(pack[5]);
        l5.setBounds(30, 210, 300, 30);
        l5.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l5.setForeground(Color.BLUE);
        p1.add(l5);

        JLabel l6 = new JLabel(pack[6]);
        l6.setBounds(30, 260, 300, 30);
        l6.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l6.setForeground(Color.RED);
        p1.add(l6);

        JLabel l7 = new JLabel(pack[7]);
        l7.setBounds(30, 310, 300, 30);
        l7.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l7.setForeground(Color.BLUE);
        p1.add(l7);

        JLabel l8 = new JLabel(pack[8]);
        l8.setBounds(30, 360, 300, 30);
        l8.setFont(new Font("Tahoma", Font.PLAIN, 20));
        l8.setForeground(Color.RED);
        p1.add(l8);

        JLabel l9 = new JLabel(pack[9]);
        l9.setBounds(30, 430, 300, 30);
        l9.setFont(new Font("Tahoma", Font.PLAIN, 30));
        l9.setForeground(Color.BLUE);
        p1.add(l9);

        JLabel l10 = new JLabel(pack[10]);
        l10.setBounds(300, 470, 300, 30);
        l10.setFont(new Font("Tahoma", Font.BOLD, 30));
        l10.setForeground(Color.RED);
        p1.add(l10);

        JLabel l11 = new JLabel(pack[11]);
        l11.setBounds(700, 470, 300, 30);
        l11.setFont(new Font("Tahoma", Font.BOLD, 20));
        l11.setForeground(Color.RED);
        p1.add(l11);
        ImageIcon i1 = new ImageIcon(this.getClass().getResource("/" + pack[0] + ""));
        Image i2 = i1.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l12 = new JLabel(i3);
        l12.setBounds(350, 110, 500, 300);
        p1.add(l12);

        return p1;
    }

    public static void main(String[] args) {
        new CheckPackage().setVisible(true);
    }
}
