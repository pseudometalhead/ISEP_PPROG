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
public class MainUtente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Utente u1 = new Utente("Diana", 'F', 22, 1.53, 56);
        Utente u2 = new Utente("Gabriel", 'M', 22, 1.93, 63);
        Utente u3 = new Utente("Alice", 'F', 54, 1.57, 67);
        Utente u4 = new Utente("Tina", 'F', 46, 1.68, 67);
        Utente u5 = new Utente("Pi", 'M', 28, 0.30, 2.45);

        Utente[] utentes = new Utente[5];
        utentes[0] = u1;
        utentes[1] = u2;
        utentes[2] = u3;
        utentes[3] = u4;
        utentes[4] = u5;

        System.out.println("\nUTENTES toString");
        for (int i = 0; i < utentes.length; i++) {
            System.out.println("\n" + utentes[i].toString());
        }
        
        System.out.println("\nNOME + IMC + GRAU DE OBESIDADE");
        for (int i = 0; i < utentes.length; i++) {
            System.out.println(utentes[i].getNome());
            System.out.println(utentes[i].calculaIMC());
            System.out.println(utentes[i].grauObesidade());
        }

        System.out.println("\nIMPRIME NÃO SAUDÁVEIS APENAS");
        for (int i = 0; i < utentes.length; i++) {
            if (!utentes[i].isSaudavel()) {
                System.out.println(utentes[i].getNome());
                System.out.println(utentes[i].grauObesidade());
            }
        }
        
        Utente.setLIMITE_IMC_OBESO(19);
        
        System.out.println("\nNOME + IMC + GRAU DE OBESIDADE  LIMITE_IMC_OBESO=19");
        for (int i = 0; i < utentes.length; i++) {
            System.out.println(utentes[i].getNome());
            System.out.println(utentes[i].calculaIMC());
            System.out.println(utentes[i].grauObesidade());
        }
        
        
        u5.setIdade(u1.getIdade());
        System.out.println(u5.toString());
        
        
        if(u5.maisNovo(u1)== null)
        {System.out.println("Têm a mesma idade!");}
        else{System.out.println("O mais novo é" + u5.maisNovo(u1).getNome());}
            

    }

}
