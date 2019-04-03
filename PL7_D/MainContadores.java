/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL7_D;

/**
 *
 * @author Diana Barros
 */
public class MainContadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ElectricoSimples c1 = new ElectricoSimples("Mariana", 232, 6.8f);
        ElectricoBiHorario c2 = new ElectricoBiHorario("Mariano", 232, 300);
        Gas c3 = new Gas("Mário", 232);

        Contador[] contadores = new Contador[10];
        contadores[0] = c1;
        contadores[1] = c2;
        contadores[2] = c3;

        for (int i = 0; i < contadores.length; i++) {
            if (contadores[i] != null) {
                System.out.println(contadores[i].toString());
            }
        }

        System.out.println("\n\nCONTADORES ELECTRICOS");
        System.out.println(Eletrico.getContElectro());

        System.out.println("\n\nListe os identificadores dos contadores de eletricidade com tarifário bi-horário, armazenados no\n"
                + "contentor;");
        for (int i = 0; i < contadores.length; i++) {
            if (contadores[i] != null && contadores[i] instanceof ElectricoBiHorario) {
                System.out.println(contadores[i].getIdentificador());
            }
        }

        System.out.println("\n\nListe os identificadores dos contadores, acompanhados do respetivo custo do consumo. Para o efeito\n"
                + "deve usar o mecanismo do polimorfismo, sem recorrer ao método reescrito toString;");
        for (int i = 0; i < contadores.length; i++) {
            if (contadores[i] != null) {
                System.out.println(contadores[i].getIdentificador());
                System.out.println(contadores[i].calcConsumo());
            }
        }
        
        System.out.println("\n\nMostre o maior valor consumido de gás;");
        float maior = 0;
        for (int i = 0; i < contadores.length; i++) {
            
            if (contadores[i] != null && contadores[i] instanceof Gas) {
                if (contadores[i].calcConsumo() > maior) {
                    maior = contadores[i].calcConsumo();
                }
            }
        }
        System.out.println(maior);
        
        

    }

}
