/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL4_D;

/**
 *
 * @author Diana Barros
 */
public class MainTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Utente a1= new Utente("Diana", 'F', 22, 1.53, 57);
        System.out.println(a1.toString());
        
        Utente a2=new Utente("Tina", 'F', 70, 2.00, 57);
        System.out.println(a2.toString());
        
        System.out.println(a1.maisNovo(a2));
        
        
    }
    
}
