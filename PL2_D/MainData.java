package PL2_D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diana Barros
 */
public class MainData {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Data data1 = new Data(2019,2,21);
        System.out.println(data1.toString());
        
        Data data2= new Data(1974,4,25);
        System.out.println(data2.getAno() + "/" +data2.getMes()+"/"+ data2.getDia());
        System.out.println(data2.toAnoMesDiaString());
        
        System.out.println(data1.isMaior(data2));
        
        System.out.println(data1.calcularDiferenca(data2));
        
        System.out.println(data1.calcularDiferenca(2019,12,25));
        
        System.out.println(data2.determinarDiaDaSemana());
        
        System.out.println(Data.isAnoBissexto(1974));
        
        System.out.println(Data.isAnoBissexto(data2.getAno()));
        //data2.isAnoBissexto(data2.getAno());
    }
    
}
