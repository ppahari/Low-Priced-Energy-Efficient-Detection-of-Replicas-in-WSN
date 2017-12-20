/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package middle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author IBN 03
 */
public class DataB {
      public static Connection getConnection(){
       
             Connection conn=null;
        try {
       
            
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/low","root","root");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conn;
    
    
    
    }
    
}
