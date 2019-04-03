/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL5_D;

/**
 *
 * @author Diana Barros
 */
public class MainVencimentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Objeto do tipo TrabalhadorPeca, de nome Jorge Silva que produziu 53 peças do tipo 1 e 62 do
//tipo 2;
//§ Objeto do tipo TrabalhadorComissao, de nome Susana Ferreira, com o salário base de 650,00€
//e uma comissão de 4,25% sobre as vendas efetuadas que totalizaram o valor de 2731,50€;
//§ Objeto do tipo TrabalhadorHora, de nome Carlos Miguel, que ganha por hora 4,50€ e com um
//total de horas de trabalho igual a 168.

        TrabalhadorPeca t1 = new TrabalhadorPeca("Jorge Silva", 53, 62);
        TrabalhadorComissao t2 = new TrabalhadorComissao("Susana Ferreira", 650f, 2731.50f, 4.25f);
        TrabalhadorHora t3 = new TrabalhadorHora("Carlos Miguel", 168, 4.5f);

        Object[] trabalhadores = new Object[10];

        trabalhadores[0] = t1;
        trabalhadores[1] = t2;
        trabalhadores[2] = t3;

        for (int i = 0; i < trabalhadores.length; i++) {
            if (trabalhadores[i] != null) {
                System.out.println("trabalhadores[i].toString()");
            }
        }

        for (int i = 0; i < trabalhadores.length; i++) {
            if (trabalhadores[i] != null && trabalhadores[i] instanceof TrabalhadorHora) {
                System.out.println(trabalhadores[i].toString());
            }
        }

        for (int i = 0; i < trabalhadores.length; i++) {
            if (trabalhadores[i] != null) {
                System.out.println(((Trabalhador) trabalhadores[i]).getNome());
                System.out.println(((Trabalhador) trabalhadores[i]).calcularVencimento());
            }
        }

        trabalhadores = (Trabalhador[]) trabalhadores;

       
    }

}
