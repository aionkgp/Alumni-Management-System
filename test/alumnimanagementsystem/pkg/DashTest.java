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
public class DashTest {
    
    public Dash d1 , d2;
    
    public DashTest() throws SQLException {
        this.d1 = new Dash("arun997");
        this.d1.setVisible(true);
        this.d2 = new Dash("chelsi998");
        this.d2.setVisible(true);
        
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
     * Test of main method, of class Dash.
     */
    @Test
    public void testMain() {
        assertTrue(d1.isVisible());
    }
    
    @Test
    public void testMain2() {
        assertNotNull(d1);
    }
    
    @Test
    public void testMain3() {
        assertTrue(d2.isVisible());
    }
    
    @Test
    public void testMain4() {
        assertNotNull(d2);
    }
    
    
    
}
