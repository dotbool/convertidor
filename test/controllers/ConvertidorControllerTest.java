/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.math.BigDecimal;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.hamcrest.Matchers;
import org.hamcrest.number.IsCloseTo;

/**
 *
 * @author Javier Martínez Ruiz. DAM
 */
public class ConvertidorControllerTest {
    
    ConvertidorController instance;

    
    public ConvertidorControllerTest() {
    }
    
//    @BeforeClass 
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
    
    @Before //ejecuta código antes de cada @Test
    public void setUp() {
        instance = new ConvertidorController();
    }
    
    @After //ejecuta código después de cada @Test
    public void tearDown() {
    }

    /**
     * Test of dollarToEuro method, of class ConvertidorController.
     */
    @Test //con esta anotación JUnit reconce que es un test
    public void testDollarToEuro() {
        System.out.println("dollarToEuro");
        double dollars = 3.4;
        BigDecimal expResult = new BigDecimal(3.1412);
        BigDecimal result = instance.dollarToEuro(dollars);
        assertThat(expResult, Matchers.closeTo(result, new BigDecimal(0.0001)));
    }

    /**
     * Test of euroToDollar method, of class ConvertidorController.
     */
    @Test 
    public void testEuroToDollar() {
        System.out.println("euroToDollar");
        double euros = 1.5;
        BigDecimal expResult = new BigDecimal("1.6233");
        BigDecimal result = instance.euroToDollar(euros);
        assertEquals(expResult, result);
    }
    
}
