
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Myconnector {
    public static Connection getConnection()
   {
        Connection con = null;
        try {
            
            String conString = "jdbc:mysql://localhost:3306/citydb?serverTimezone=UTC";
            con = DriverManager.getConnection(conString,"root","");
            System.out.println("Connection created");
            
        } catch (SQLException ex) {
           System.out.print(ex.getMessage());
           JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE );
        }
        return con;
    }

}
