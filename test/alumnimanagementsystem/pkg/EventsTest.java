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
public class EventsTest {
    
    Events ev , e;
    public EventsTest() throws SQLException {
        this.ev = new Events("arun997", "Al");
        this.ev.setVisible(true);
        this.e = new Events("chelsi998", "Al");
        this.e.setVisible(true);
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
     * Test of main method, of class Events.
     */
    @Test
    public void testMain() {
        assertNotNull(ev);
    }
    
    @Test
    public void testMain2() {
         assertTrue(ev.isVisible());
    }   
       @Test
    public void testMain3() {
        assertNotNull(e);
    }
    
    @Test
    public void testMain4() {
         assertTrue(e.isVisible());
    }   
}
