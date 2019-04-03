package PL1_D;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Diana Barros
 */
public class MainCumprimentar {

    /**
     * @param args the command line arguments
     */
    final static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Qual e o seu nome?");
        String nome = ler.nextLine();
        ID a1 = new ID(nome);
        System.out.println("Ola, " + nome);
        
        System.out.println("TESTE");
        System.out.println(a1.getNome());
        System.out.println(a1.toString());
        
        System.out.println("Qual e o seu nome?");
        nome = ler.nextLine();
        System.out.println("Qual é a sua idade?");
        int idade = ler.nextInt();
        ID a2 = new ID(nome, idade);
        System.out.println("Ola, " + nome);
        
        System.out.println("TESTE");
        System.out.println(a2.getNome());
        System.out.println(a2.toString());
        
        a2.setIdade(12);
        a2.setNome("Mariana");
        System.out.println(a2.toString());

    }

}
