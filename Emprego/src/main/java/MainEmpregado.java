
import com.mycompany.utilitarios.Data;
import com.mycompany.utilitarios.Tempo;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Diana Barros
 */
public class MainEmpregado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Crie e visualize uma instância de Data para representar a data atual");     
        Data agora = Data.dataAtual();
        System.out.printf(agora.toString());
        agora = new Data(2,3,3);
        agora.setData(2013, 4, 4);
        System.out.println(agora);

        System.out.println("\n\nCrie e visualize duas instâncias de Tempo");     
        Tempo tempo1 = new Tempo(20, 3, 2);
        Tempo tempo2 = new Tempo(20,2, 5);
        System.out.println(tempo1.toString());
        System.out.println(tempo2.toString());

        //Crie duas instâncias de Empregado usando para o efeito as instâncias de Data e de Tempo criadas anteriormente; 
        Empregado empregado1 = new Empregado("Rui", "Flash", agora, tempo1, tempo2);
        Empregado empregado2 = new Empregado("Rui", "Not So Flash", agora, tempo1, tempo2);

            //Verifique se os atributos do tipo Data dos empregados criados possuem referências partilhadas; 
        //TODO
        
        
        //Verifique se os atributos do tipo Tempo dos empregados criados possuem referências
        //partilhadas; 
        //TODO
        
        
        //Altere o conteúdo do objeto Data e o conteúdo dos objetos Tempo inicialmente criados;
        agora.setData(2014, 7, 7);       
        tempo1.setTempo(8, 0, 0);
        tempo2.setTempo(17, 0, 0);
        
        //Visualize as instâncias de Data e de Tempo, bem como as instâncias de Empregado criadas; 
        System.out.println(agora.toString());
        System.out.println(tempo1.toString());
        System.out.println(tempo2.toStringHHMMSS());
        System.out.println(empregado1.toString());
        System.out.println(empregado2.toString());

        //Altere a data de contrato e as horas de entrada e de saída do segundo empregado; 
        empregado2.setDataContrato(new Data(2010,4,5));
        
        
        //) Armazene as instâncias de Empregado criadas num contentor de objetos do tipo ArrayList;
        ArrayList <Empregado> empregados=new ArrayList <>();
        empregados.add(empregado1);
        empregados.add(empregado2);
        
        
 
    }

}
