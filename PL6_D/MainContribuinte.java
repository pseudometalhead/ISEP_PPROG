/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL6_D;

import java.util.ArrayList;

/**
 *
 * @author Diana Barros
 */
public class MainContribuinte {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        Reformado c1 = new Reformado("Diana", "Rua 3", 3000f, 200f);
//        TrabalhadorContaOutrem c2 = new TrabalhadorContaOutrem("Gabriel", "Alameda 2", 1000f, 1200f);
//        TrabalhadorContaPropria c3 = new TrabalhadorContaPropria("Tiago", "Alameda 2", 10f, 1f);
//        Desempregado c4 = new Desempregado("Pi", "Rua 3", 5f);
//        Reformado c5 = new Reformado("Cláudia", "Rua 3", 3000f, 200f);
//        TrabalhadorContaOutrem c6 = new TrabalhadorContaOutrem("Cláudio", "Alameda 2", 1000f, 1200f);
//        TrabalhadorContaPropria c7 = new TrabalhadorContaPropria("Claudina", "Alameda 2", 10f, 1f);
//        Desempregado c8 = new Desempregado("Claudete", "Rua 3", 5f);
//
//        Contribuinte[] contribuintes = new Contribuinte[10];
//        contribuintes[0] = c1;
//        contribuintes[1] = c2;
//        contribuintes[2] = c3;
//        contribuintes[3] = c4;
//        contribuintes[4] = c5;
//        contribuintes[5] = c6;
//        contribuintes[6] = c7;
//        contribuintes[7] = c8;
//
//        System.out.println("Varrimento do contentor para apresentação de cada objeto e respetivo valor do imposto\n"
//                + "extraordinário.");
//
//        for (int i = 0; i < contribuintes.length; i++) {
//            if (contribuintes[i] != null) {
//                System.out.println("\n" + contribuintes[i].toString());
//                System.out.println(contribuintes[i].calcularImposto());
//            }
//
//        }
//
//        System.out.println("\n\nVarrimento do contentor para apresentação do nome e imposto extraordinário a pagar pelos\n"
//                + "contribuintes desempregados.");
//
//        for (int i = 0; i < contribuintes.length; i++) {
//            if (contribuintes[i] != null && contribuintes[i] instanceof Desempregado) {
//                System.out.println("\n" + contribuintes[i].getNome());
//                System.out.println(contribuintes[i].calcularImposto());
//            }
//        }
//
//        Desempregado.setTAXA_SOBRE_OR(5);
//
//        System.out.println("\n\nVarrimento do contentor para apresentação do nome e imposto extraordinário a pagar pelos\n"
//                + "contribuintes desempregados. TAXA_OR=5");
//
//        for (int i = 0; i < contribuintes.length; i++) {
//            if (contribuintes[i] != null && contribuintes[i] instanceof Desempregado) {
//                System.out.println("\n" + contribuintes[i].getNome());
//                System.out.println(contribuintes[i].calcularImposto());
//            }
//
//        }

        ArrayList<Contribuinte> contribuintes = new ArrayList<Contribuinte>();

        contribuintes.add(new Desempregado("Lito Vidal", "Lisboa", 230, 1));
        contribuintes.add(new Reformado("Valter Cubilhas", "Olival", 600, 400));
        contribuintes.add(new Desempregado("Paulo Santos", "Braga", 150, 4));
        contribuintes.add(new TrabalhadorContaOutrem("Ana", "Ovar", 1800, 300, "CMM"));
        contribuintes.add(new Reformado("Jaime Magalhães", "Porto", 1500, 100));
        contribuintes.add(new TrabalhadorContaOutrem("Salvio", "Seixal", 8000, 1000, "SSB"));
        contribuintes.add(new TrabalhadorContaPropria("Mário", "Guarda", 1500, 300, "Eletricista"));
        contribuintes.add(new Reformado("Aníbal Silva", "Coimbra", 1000, 500));
        contribuintes.add(new TrabalhadorContaOutrem("João", "Lisboa", 800, 100, "CML"));
        contribuintes.add(new TrabalhadorContaPropria("Carla", "Porto", 15000, 1000, "Advogado"));
        contribuintes.add(new Desempregado("Maria Sá", "Afife", 230, 8));
        
        for (int i = 0; i < contribuintes.size(); i++) {
            System.out.println("-----------------");
            System.out.println((contribuintes.get(i)).toString());
            System.out.println("-----------------");
        }
        
       contribuintes.remove(new Desempregado("Lito Vidal", "Lisboa", 230, 1));

            System.out.println("-----------------");
            System.out.println((contribuintes.get(0)).toString());
            System.out.println("-----------------");
            
            System.out.println((new Desempregado("Lito Vidal", "Lisboa", 230, 1)).equals((new Desempregado("Lito Vidal", "Lisboa", 230, 1))));
            System.out.println((new Desempregado("Lito Vidal", "Lisboa", 230, 1)).equals((new Desempregado("Lito Vidal", "Lisboa", 230, 4))));         
            System.out.println((new Desempregado("Lito Vidal", "Lisboa", 230, 1)).equals((new Reformado("Valter Cubilhas", "Olival", 600, 400))));


    }
}
