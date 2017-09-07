/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Controller.Exceptions.NonNumberException;
import java.net.URL;
import java.util.ResourceBundle;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author psanz
 */
public class AutosVentanaEditableControllerTest {
    
    public AutosVentanaEditableControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of initialize method, of class AutosVentanaEditableController.
     */
        
    @Test
    public void testValidarNumerico(){
        
        System.out.println("* AutosVentanaEditableTest: testValidarNumerico()");
        AutosVentanaEditableController evaluator = new AutosVentanaEditableController();
        assertTrue(evaluator.ValidarNumerico("10"));
        assertTrue(evaluator.ValidarNumerico("10.01"));
        
        try{
           evaluator.ValidarNumerico("ASD");
           fail("NonNumberException Era esperado");
        }
        catch(NonNumberException e){
        
        } 
        try{
           evaluator.ValidarNumerico("10.00.00");
           fail("NonNumberException Era esperado");
        }
        catch(NonNumberException e){
        
        } 
        
        try{
           evaluator.ValidarNumerico("10,00");
           fail("NonNumberException Era esperado");
        }
        catch(NonNumberException e){
        
        } 
    
    
    }
    
}
