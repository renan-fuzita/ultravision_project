/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectivity;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Priscila
 */
public class ConnectionClass {
    Connection conn = null;
    public Connection getConnection(){
        
        String dbName = "Ultravision";
        String dbUser = "root";
        String dbPassword = "";
        
        
        try {
            Class.forName ("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/"+dbName,dbUser,dbPassword);
            
        } catch (Exception ex) {
            return null;
        }
        
        return conn;
    }
    
}
