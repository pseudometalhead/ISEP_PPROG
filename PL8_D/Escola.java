/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL8_D;

/**
 *
 * @author Diana Barros
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Professor p1 = new Professor("Alexandre Gouveia",  999999999, Professor.getADJUNTO());
        Professor p2 = new Professor("Fernando Duarte",  999999999, Professor.getASSISTENTE());
        Professor p3 = new Professor("Luiz Faria",  999999999, Professor.getCOORDENADOR());
        
        Aluno a1 = new Aluno("André Azevedo", 999999999, 1130740);
        Aluno a2 = new Aluno("Sara Silva", 999999999, 1130648);
        
        Bolseiro b1 = new Bolseiro("Duarte Amorim", 258594306, 1130674, 200f);
        Bolseiro b2 = new Bolseiro("Tiago Ferreira", 999999999, 1130672, 300f);
        
        
        Pessoa[] p = new Pessoa[10];
       
        p[0]=p1; 
        p[1]=p2;
        p[2]=p3;
        
        p[3]=a1;
        p[4]=a2;
        
        p[5]=b1;
        p[6]=b2;
    
        System.out.println("\n### Listar os nomes de professores e alunos acompanhados do nome da classe correspondente ###");
        for(int i=0; i<p.length; i++) {
            if(p[i] != null) {
                System.out.printf("Nome: %s Classe: %s%n%n", p[i].getNome(), p[i].getClass().getSimpleName());
            }
        }
        
        System.out.println("\n### Listar o nome e a categoria de cada um dos professores ###");
        for(int i=0; i<p.length; i++) {
            if(p[i] instanceof Professor) {
                System.out.printf("Nome: %s  Categoria: %s%n", p[i].getNome(),((Professor) p[i]).getCategoria());
            }
        }
        
        System.out.println("\n### Listar todos os alunos da escola ###");
        for(int i=0; i<p.length; i++) {
            if(p[i] instanceof Aluno) {
                System.out.println(p[i]);
            }
        }
        
        System.out.println("\n### Listar o número e o nome de cada um dos alunos que não recebem bolsa ###");
        for(int i=0; i<p.length; i++) {
            if(p[i] instanceof Aluno && !(p[i] instanceof Bolseiro)) {
                //if(p[i] != null && p[i].getClass() == Aluno.class)
                Aluno a = (Aluno) p[i];
                System.out.printf("Nr. Mec: %d  Nome: %s%n", a.getNumeroMecanografico(), a.getNome());
            }
        }
        
        System.out.println("\n### Mostrar o encargo mensal da escola com os vencimentos dos professores e as bolsas dos alunos. ###");
        float encargos = 0;
        for(int i=0; i<p.length; i++) {
            if(p[i] instanceof Rendimento) {
                encargos+=((Rendimento) p[i]).calcRend();
            }
        }
        System.out.printf("%Encargos com Vencimentos e Bolsas: %.2f €%n", encargos);
        
        }
    
}
