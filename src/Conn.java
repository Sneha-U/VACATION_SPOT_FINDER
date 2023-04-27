import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {

    Connection c;
    Statement s;

    public Conn () {
        try {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/vacation_spot_finder_db", "root", "Varshitha*123");
            s = c.createStatement();

        } catch (SQLException e) {
            System.out.println("Something Went Wrong: " + e.getMessage());
        }
    }
}
