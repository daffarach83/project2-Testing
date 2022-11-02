/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hp
 */
public class StaffTest {
    
    public StaffTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of login method, of class Staff.
     */
    @Test
    public void testLogin() {
        System.out.println("Test login");
        
        Staff instance = new Staff();
        instance.setUsername("admin");
        instance.setPassword("admin"); 
    
        String expResult = "dashboard";
        String result = instance.login();
        System.out.println(expResult);
        System.out.println(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of logout method, of class Staff.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.logout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Staff.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Staff instance = new Staff();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Staff.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Staff instance = new Staff();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class Staff.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class Staff.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        Staff instance = new Staff();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class Staff.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        Staff instance = new Staff();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class Staff.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        Staff instance = new Staff();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
