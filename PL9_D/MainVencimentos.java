package PL9_D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainVencimentos {

    public static void main(String[] args) {

        TrabalhadorComissao tc = new TrabalhadorComissao("Susana Ferreira", 500.0f, 1500.0f, 6f);
        TrabalhadorPeca tp = new TrabalhadorPeca("Jorge Silva", 20, 30);
        TrabalhadorHora th = new TrabalhadorHora("Carlos Miguel", 160, 3.5f);

        List<Trabalhador> trabs = new ArrayList<>();
        trabs.add(tc);
        trabs.add(tp);
        trabs.add(th);

        
        
        System.out.println("### Trabalhadores ###");    
        listar(trabs);
        
        //1. Comparable 
        //1a) Ordenação crescente dos vencimentos
        Collections.sort(trabs);
        System.out.println("### Trabalhadores ordem crescente vencimentos ###");  
        listar(trabs);            
        
        //1b) Ordenação decrescente dos vencimentos
        Collections.sort(trabs, Collections.reverseOrder());
        
        System.out.println("### Trabalhadores ordem decrescente vencimentos ###");  
        listar(trabs);
        
        //2. Comparator
        //cria um objeto do tipo Comparator com denominação critNumerico
        Comparator critNumerico = new Comparator() {
            @Override
            //rebe dois objetos como argumento
            public int compare(Object obj1, Object obj2) {
                //cast d objeto 1 para um objeto do tipo Trabalhador
                float venc1 = ((Trabalhador) obj1).calcularVencimento(); 
                float venc2 = ((Trabalhador) obj2).calcularVencimento();
                
                if (venc1 < venc2) {
                    return -1;
                } else if (venc1 > venc2) {
                    return 1;
                } else
                    return 0;
                }
        };
        
        Comparator critAlfabetico = new Comparator() {
            @Override
            public int compare(Object obj1, Object obj2) {
                String nome1 = ((Trabalhador) obj1).getNome();
                String nome2 = ((Trabalhador) obj2).getNome();
                
                return nome1.compareTo(nome2);
            }
        };
        
        //2a) Ordenação crescente dos vencimentos
        System.out.println("\n\n### Trabalhadores por ordem crescente dos Vencimentos (Objectos Comparable)");
        Collections.sort(trabs, critNumerico);
        listar(trabs);
        
        //2b) Ordenação decrescente dos vencimentos
        System.out.println("\n\n### Trabalhadores por ordem crescente dos Vencimentos (Objectos Comparable)");
        Collections.sort(trabs, Collections.reverseOrder(critNumerico));
        listar(trabs);
        
        //2c) Ordenação alfabética dos nomes
        System.out.println("\n\n### Trabalhadores por ordem Alfabética do Nome (Objectos Comparable)");
        Collections.sort(trabs, critAlfabetico);
        listar(trabs);

    }

    private static void listar(List<Trabalhador> trabs) {
        for (Trabalhador trab : trabs) {
            if (trab != null) {
                System.out.printf("%s, vencimento = %.2f€%n", trab.getNome(), 
                                    trab.calcularVencimento());
            }
        }
    }
    
    

}
