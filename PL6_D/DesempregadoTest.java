/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL6_D;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diana Barros
 */
public class DesempregadoTest {
    
    public DesempregadoTest() {
    }

    /**
     * Test of calcularImposto method, of class Desempregado.
     */
    @Test
    public void testCalcularImposto() {
        System.out.println("calcularImposto");
        Desempregado instance = new Desempregado();
        float expResult = 0.0F;
        float result = instance.calcularImposto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTAXA_SOBRE_OR method, of class Desempregado.
     */
    @Test
    public void testGetTAXA_SOBRE_OR() {
        System.out.println("getTAXA_SOBRE_OR");
        int expResult = 0;
        int result = Desempregado.getTAXA_SOBRE_OR();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTAXA_SOBRE_OR method, of class Desempregado.
     */
    @Test
    public void testSetTAXA_SOBRE_OR() {
        System.out.println("setTAXA_SOBRE_OR");
        int aTAXA_SOBRE_OR = 0;
        Desempregado.setTAXA_SOBRE_OR(aTAXA_SOBRE_OR);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
