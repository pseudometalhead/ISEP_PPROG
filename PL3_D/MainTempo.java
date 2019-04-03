/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL3_D;

/**
 *
 * @author Diana Barros
 */
public class MainTempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("PL3");
        System.out.println("t1=5 horas, 30 minutos e 12 segundos");
        Tempo t1 = new Tempo(5, 30, 12);
        System.out.println(t1.to12());

        System.out.println("t1+1segundo");
        t1.addSecond();
        System.out.println(t1.to12());
        
        System.out.println("t2 =18 horas, 5 minutos e 20 segundos");
        Tempo t2 = new Tempo(18, 5, 20);
        System.out.println(t2.to12());
        
        System.out.println("t1 é maior do que o tempo t2? esperado: false");
        System.out.println(t1.isMaior(t2));
        
        System.out.println("t1 é maior que 23 horas, 7 minutos e 4 segundos");
        System.out.println(t1.isMaior(23,7,4));
        
        System.out.println("diferença entre o tempo t1 e o tempo t2 - segundos");
        System.out.println(t1.calcularDiferencaSegundos(t2));
        
        System.out.println("diferença entre o tempo t1 e o tempo t2 - tempo");
        System.out.println(t1.calcularDiferencaTempo(t2));
        
        
        //_______________TESTES_________________________
        System.out.println("\n\n\n TESTES");
        Tempo teste=new Tempo(23,59,59);
        System.out.println("23:59:59");
        teste.tick();
        System.out.println(teste.to24());
        System.out.println("22:10:59");
        teste.setTempo(22, 10, 59);
        teste.tick();
        System.out.println(teste.to24());
        System.out.println("22:59:59");
        teste.setTempo(22, 59, 59);
        teste.tick();
        System.out.println(teste.to24());
        System.out.println("22:10:44");
        teste.setTempo(22, 10, 44);
        teste.tick();
        System.out.println(teste.to24());

    }

}
