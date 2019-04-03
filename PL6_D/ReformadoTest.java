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
public class ReformadoTest {
    
    public ReformadoTest() {
    }

    /**
     * Test of getTAXA_SOBRE_OR method, of class Reformado.
     */
    @Test
    public void testGetTAXA_SOBRE_OR() {
        System.out.println("getTAXA_SOBRE_OR");
        int expResult = 0;
        int result = Reformado.getTAXA_SOBRE_OR();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTAXA_SOBRE_OR method, of class Reformado.
     */
    @Test
    public void testSetTAXA_SOBRE_OR() {
        System.out.println("setTAXA_SOBRE_OR");
        int aTAXA_SOBRE_OR = 0;
        Reformado.setTAXA_SOBRE_OR(aTAXA_SOBRE_OR);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTAXA_SOBRE_RT method, of class Reformado.
     */
    @Test
    public void testGetTAXA_SOBRE_RT() {
        System.out.println("getTAXA_SOBRE_RT");
        int expResult = 0;
        int result = Reformado.getTAXA_SOBRE_RT();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTAXA_SOBRE_RT method, of class Reformado.
     */
    @Test
    public void testSetTAXA_SOBRE_RT() {
        System.out.println("setTAXA_SOBRE_RT");
        int aTAXA_SOBRE_RT = 0;
        Reformado.setTAXA_SOBRE_RT(aTAXA_SOBRE_RT);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxaRT method, of class Reformado.
     */
    @Test
    public void testGetTaxaRT() {
        System.out.println("getTaxaRT");
        Reformado instance = new Reformado();
        int expResult = 0;
        int result = instance.getTaxaRT();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaxaOR method, of class Reformado.
     */
    @Test
    public void testGetTaxaOR() {
        System.out.println("getTaxaOR");
        Reformado instance = new Reformado();
        int expResult = 0;
        int result = instance.getTaxaOR();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
