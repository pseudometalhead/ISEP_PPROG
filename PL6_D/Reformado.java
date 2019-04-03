/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL6_D;

/**
 *
 * @author Diana Barros
 */
public class Reformado extends ContRendimento {

    /**
     * @return the TAXA_SOBRE_OR
     */
    public static int getTAXA_SOBRE_OR() {
        return TAXA_SOBRE_OR;
    }

    /**
     * @param aTAXA_SOBRE_OR the TAXA_SOBRE_OR to set
     */
    public static void setTAXA_SOBRE_OR(int aTAXA_SOBRE_OR) {
        TAXA_SOBRE_OR = aTAXA_SOBRE_OR;
    }

    /**
     * @return the TAXA_SOBRE_RT
     */
    public static int getTAXA_SOBRE_RT() {
        return TAXA_SOBRE_RT;
    }

    /**
     * @param aTAXA_SOBRE_RT the TAXA_SOBRE_RT to set
     */
    public static void setTAXA_SOBRE_RT(int aTAXA_SOBRE_RT) {
        TAXA_SOBRE_RT = aTAXA_SOBRE_RT;
    }

    private static int TAXA_SOBRE_OR = 1;
    private static int TAXA_SOBRE_RT=3;
    
    
    public Reformado(String nome, String morada, float OR, float RT) {
        super(nome, morada, OR, RT);
  
    }

    public Reformado() {
        super();

    }


    @Override
    public int getTaxaRT() {
        return getTAXA_SOBRE_RT();}
    
    @Override
    public int getTaxaOR() {
        return getTAXA_SOBRE_OR();
    }
   

}

