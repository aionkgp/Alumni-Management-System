/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnimanagementsystem.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aion
 */
public class LoginTest {
    
    static private Login ln , l;
    Connection con ;
    PreparedStatement pst;
    public String Username = "arun997";
//    String Password;
//    String userType;
    public String user;
    public String user2;
    public String eu;
    public String eu2;
    public LoginTest() throws SQLException {
        this.ln = new Login();
        ln.setVisible(true);
        this.l = new Login();
        l.setVisible(true);
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/AMS?autoReconnect=true&useSSL=false"+"&user=root&password=12321123.");
        eu = "arun997";
        pst = con.prepareStatement("SELECT * FROM user WHERE UserName=?");// AND Password=? AND UserType=?");
        pst.setString(1,Username);
//        pst.setString(2,Password);
//        pst.setString(3,userType);
        ResultSet rs = pst.executeQuery();
        while(rs.next())
            user = rs.getString("UserName");
        System.out.println(user);
        ////////////////////////////////////////////////////////////////
        
        Username = "chelsi9998";
        pst.setString(1,Username);
//        pst.setString(2,Password);
//        pst.setString(3,userType);
        rs = pst.executeQuery();
        while(rs.next())
            user2 = rs.getString("UserName");
        System.out.println(user);
        
        
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
        assertTrue(ln.isVisible());
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Login.
     */
    @Test
    public void testMain() {
         assertEquals(eu , user);
    }
    
       @Test
    public void testMain4() {
         assertEquals(eu2 , user2);
    }
    
    @Test
    public void testMain2() {
        assertNotNull(ln);
    }
    
    @Test
    public void testMain3() {
        assertTrue(ln.isVisible());
    }
    
    
      @Test
    public void testMain5() {
        assertNotNull(l);
    }
    
    @Test
    public void testMain6() {
        assertTrue(l.isVisible());
    }
    
//    @Test
//    public void testMain2() {
//        assertNotNull(ln);
//    }
//    
}
