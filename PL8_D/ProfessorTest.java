/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL8_D;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diana Barros
 */
public class ProfessorTest {
    
    public ProfessorTest() {
    }

    /**
     * Test of calcRend method, of class Professor.
     */
    @Test
    public void testCalcRendAdjunto() {
        System.out.println("calcRend");
        Professor instance = new Professor("Sérgio", 14502758, "adjunto");
        float expResult =1800.0F;
        float result = instance.calcRend();
        assertEquals(expResult, result, 2.0);

    }
    
    /**
     * Test of calcRend method, of class Professor.
     */
    @Test
    public void testCalcRendAssistente() {
        System.out.println("calcRend");
        Professor instance = new Professor("Sérgio", 14502758, "assistente");
        float expResult = 1500.0F;
        float result = instance.calcRend();
        assertEquals(expResult, result, 2.0);
      
    }
    
    /**
     * Test of calcRend method, of class Professor.
     */
    @Test
    public void testCalcRendCoordenador() {
        System.out.println("calcRend");
        Professor instance = new Professor("Sérgio", 14502758, "coordenador");
        float expResult = 2250.0F;
        float result = instance.calcRend();
        assertEquals(expResult, result, 2.0);
    }
    
}
