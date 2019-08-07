/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alumnimanagementsystem.pkg;

import java.sql.SQLException;
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
public class ProfileTest {
    
    public Profile pr;
    public Profile pr2;
    public ProfileTest() throws SQLException {
        this.pr = new Profile("arun997");
        this.pr.setVisible(true);
        this.pr2 = new Profile("chelsi998");
        this.pr2.setVisible(true);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Profile.
     */
    @Test
    public void testMain() {
        assertTrue(pr.isVisible());
    }
    
    @Test
    public void testMain2() {
        assertNotNull(pr);
    }
    @Test
    public void testMain3() {
        assertTrue(pr2.isVisible());
    }
    
    @Test
    public void testMain4() {
        assertNotNull(pr2);
    }    
}
