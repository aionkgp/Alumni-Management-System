/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnimanagementsystem.pkg;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aion
 */
public class AlumniManagementSystem {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        System.out.println("hello world");
        Login lg = null;
        lg = new Login();
        lg.setVisible(true);
        
    }
    
}
