/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hp
 */
public class MoviesTest {
    
    public MoviesTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getAllMov method, of class Movies.
     */
    @Test
    public void testGetAllMov() {
        System.out.println("getAllMov");
        Movies instance = new Movies();
        List<Movies> expResult = null;
        List<Movies> result = instance.getAllMov();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of goBack method, of class Movies.
     */
    @Test
    public void testGoBack() {
        System.out.println("goBack");
        Movies instance = new Movies();
        String expResult = "";
        String result = instance.goBack();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteMov method, of class Movies.
     */
    @Test
    public void testDeleteMov() {
        System.out.println("deleteMov");
        int ids = 0;
        Movies instance = new Movies();
        String expResult = "";
        String result = instance.deleteMov(ids);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getById method, of class Movies.
     */
    @Test
    public void testGetById() {
        System.out.println("getById");
        int ids = 0;
        Movies instance = new Movies();
        String expResult = "";
        String result = instance.getById(ids);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of saveMov method, of class Movies.
     */
    @Test
    public void testSaveMov() {
        System.out.println("saveMov");
        Movies instance = new Movies();
        String expResult = "";
        String result = instance.saveMov();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editMov method, of class Movies.
     */
    @Test
    public void testEditMov() {
        System.out.println("editMov");
        Movies instance = new Movies();
        String expResult = "";
        String result = instance.editMov();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Movies.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Movies instance = new Movies();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Movies.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Movies instance = new Movies();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTitle method, of class Movies.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Movies instance = new Movies();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTitle method, of class Movies.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Movies instance = new Movies();
        instance.setTitle(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYtlink method, of class Movies.
     */
    @Test
    public void testGetYtlink() {
        System.out.println("getYtlink");
        Movies instance = new Movies();
        String expResult = "";
        String result = instance.getYtlink();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYtlink method, of class Movies.
     */
    @Test
    public void testSetYtlink() {
        System.out.println("setYtlink");
        String ytlink = "";
        Movies instance = new Movies();
        instance.setYtlink(ytlink);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGenre method, of class Movies.
     */
    @Test
    public void testGetGenre() {
        System.out.println("getGenre");
        Movies instance = new Movies();
        String expResult = "";
        String result = instance.getGenre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setGenre method, of class Movies.
     */
    @Test
    public void testSetGenre() {
        System.out.println("setGenre");
        String genre = "";
        Movies instance = new Movies();
        instance.setGenre(genre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRdate method, of class Movies.
     */
    @Test
    public void testGetRdate() {
        System.out.println("getRdate");
        Movies instance = new Movies();
        Date expResult = null;
        Date result = instance.getRdate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRdate method, of class Movies.
     */
    @Test
    public void testSetRdate() {
        System.out.println("setRdate");
        Date rdate = null;
        Movies instance = new Movies();
        instance.setRdate(rdate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLanguage method, of class Movies.
     */
    @Test
    public void testGetLanguage() {
        System.out.println("getLanguage");
        Movies instance = new Movies();
        String expResult = "";
        String result = instance.getLanguage();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLanguage method, of class Movies.
     */
    @Test
    public void testSetLanguage() {
        System.out.println("setLanguage");
        String language = "";
        Movies instance = new Movies();
        instance.setLanguage(language);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCasts method, of class Movies.
     */
    @Test
    public void testGetCasts() {
        System.out.println("getCasts");
        Movies instance = new Movies();
        String expResult = "";
        String result = instance.getCasts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCasts method, of class Movies.
     */
    @Test
    public void testSetCasts() {
        System.out.println("setCasts");
        String casts = "";
        Movies instance = new Movies();
        instance.setCasts(casts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDirector method, of class Movies.
     */
    @Test
    public void testGetDirector() {
        System.out.println("getDirector");
        Movies instance = new Movies();
        String expResult = "";
        String result = instance.getDirector();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDirector method, of class Movies.
     */
    @Test
    public void testSetDirector() {
        System.out.println("setDirector");
        String director = "";
        Movies instance = new Movies();
        instance.setDirector(director);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProduction method, of class Movies.
     */
    @Test
    public void testGetProduction() {
        System.out.println("getProduction");
        Movies instance = new Movies();
        String expResult = "";
        String result = instance.getProduction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProduction method, of class Movies.
     */
    @Test
    public void testSetProduction() {
        System.out.println("setProduction");
        String production = "";
        Movies instance = new Movies();
        instance.setProduction(production);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTempimg method, of class Movies.
     */
    @Test
    public void testGetTempimg() {
        System.out.println("getTempimg");
        Movies instance = new Movies();
        String expResult = "";
        String result = instance.getTempimg();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTempimg method, of class Movies.
     */
    @Test
    public void testSetTempimg() {
        System.out.println("setTempimg");
        String tempimg = "";
        Movies instance = new Movies();
        instance.setTempimg(tempimg);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
