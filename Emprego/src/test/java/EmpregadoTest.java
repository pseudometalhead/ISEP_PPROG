/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mycompany.utilitarios.Data;
import com.mycompany.utilitarios.Tempo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diana Barros
 */
public class EmpregadoTest {
    
    public EmpregadoTest() {
    }

    /**
     * Test of equals method, of class Empregado.
     */
    @Test
    public void equalsPrimeiroNome() {
        System.out.println("equals");
        Empregado outroObjeto = new Empregado("Mario", "Silva", new Data(1996, 7,7), new Tempo(8,0,0), new Tempo(8,0,0));
        Empregado instance = new Empregado("Mario", "Silva", new Data(1996, 7,7), new Tempo(8,0,0), new Tempo(8,0,0));
        String a= instance.getPrimeiroNome();
        String b= outroObjeto.getPrimeiroNome();
        boolean expResult = true;
        boolean result = a.equals(b);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Empregado.
     */
    @Test
    public void testEquals1() {
        System.out.println("equals");
        Object outroObjeto = new Empregado("Mario", "Silva", new Data(1996, 7,7), new Tempo(8,0,0), new Tempo(8,0,0));
        Empregado instance = new Empregado("Mario", "Silva", new Data(1996, 7,7), new Tempo(8,0,0), new Tempo(8,0,0));      
        boolean expResult = true;
        boolean result = instance.equals((Empregado)outroObjeto);
        assertEquals(expResult, result);
    }

/**
     * Test of equals method, of class Empregado.
     */
    @Test
    public void testEquals2() {
        System.out.println("equals");
        Object outroObjeto = new Empregado("Mário", "Silva", new Data(1996, 7,7), new Tempo(8,0,0), new Tempo(8,0,0));;
        Empregado instance = new Empregado("Mári", "Silva", new Data(1996, 7,7), new Tempo(8,0,0), new Tempo(8,0,0));
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }    
    
    /**
     * Test of equals method, of class Empregado.
     */
    @Test
    public void testEquals3() {
        System.out.println("equals");
        Object outroObjeto = new Empregado("Mário", "Silva", new Data(1996, 7,7), new Tempo(8,0,0), new Tempo(8,0,0));;
        Empregado instance = new Empregado("Mário", "Silv", new Data(1996, 7,7), new Tempo(8,0,0), new Tempo(8,0,0));
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Empregado.
     */
    @Test
    public void testEquals4() {
        System.out.println("equals");
        Object outroObjeto = new Empregado("Mário", "Silva", new Data(1996, 6,7), new Tempo(8,0,0), new Tempo(8,0,0));;
        Empregado instance = new Empregado("Mário", "Silva", new Data(1996, 7,7), new Tempo(8,0,0), new Tempo(8,0,0));
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Empregado.
     */
    @Test
    public void testEquals5() {
        System.out.println("equals");
        Object outroObjeto = new Empregado("Mário", "Silva", new Data(1996, 7,7), new Tempo(8,1,0), new Tempo(8,0,0));
        Empregado instance = new Empregado("Mário", "Silva", new Data(1996, 7,7), new Tempo(8,0,0), new Tempo(8,0,0));
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of equals method, of class Empregado.
     */
    @Test
    public void testEquals6() {
        System.out.println("equals");
        Object outroObjeto = new Empregado("Mário", "Silva", new Data(1996, 7,7), new Tempo(8,0,0), new Tempo(8,0,1));
        Empregado instance = new Empregado("Mário", "Silva", new Data(1996, 7,7), new Tempo(8,0,0), new Tempo(8,0,0));
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of calcHorasTrabalhadas method, of class Empregado.
     */
    @Test
    public void testCalcHorasTrabalhadas1() {
        System.out.println("calcHorasTrabalhadas");
        Empregado instance = new Empregado("Mário", "Silva", new Data(1996, 7,7), new Tempo(8,0,0), new Tempo(16,0,0));
        int expResult = 40;
        int result = instance.calcHorasTrabalhadas();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of calcHorasTrabalhadas method, of class Empregado.
     */
    @Test
    public void testCalcHorasTrabalhadas2() {
        System.out.println("calcHorasTrabalhadas");
        Empregado instance = new Empregado("Mário", "Silva", new Data(1996, 7,7), new Tempo(8,0,0), new Tempo(15,59,59));
        int expResult = 40;
        int result = instance.calcHorasTrabalhadas();
        assertEquals(expResult, result);
    }
    
   /**
     * Test of tempoContrato method, of class Empregado.
     */
    @Test
    public void testTempoContrato1() {
        System.out.println("tempoContrato");
        Empregado instance = new Empregado("Mário", "Silva", new Data(2019, 3,1), new Tempo(8,0,0), new Tempo(15,59,59));
        int expResult = 27;
        int result = instance.tempoContrato();
        assertEquals(expResult, result);
}
   
}
