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
public class TrabalhadorContaPropria extends ContRendimento {


    private static int TAXA_SOBRE_RT = 3;
    private static int TAXA_SOBRE_OR_BAIXA = 2;
    private static int TAXA_SOBRE_OR_ALTA = 5;
    private static int LIMITE_TAXA_OR = 50000;
    private String profissao;
    public TrabalhadorContaPropria(String nome, String morada, float OR, float RT, String profissao) {
        super(nome, morada, OR, RT);
        this.profissao=profissao;
  
    }

    public TrabalhadorContaPropria() {
        super();

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

    /**
     * @return the TAXA_SOBRE_OR_BAIXA
     */
    public static int getTAXA_SOBRE_OR_BAIXA() {
        return TAXA_SOBRE_OR_BAIXA;
    }

    /**
     * @param aTAXA_SOBRE_OR_BAIXA the TAXA_SOBRE_OR_BAIXA to set
     */
    public static void setTAXA_SOBRE_OR_BAIXA(int aTAXA_SOBRE_OR_BAIXA) {
        TAXA_SOBRE_OR_BAIXA = aTAXA_SOBRE_OR_BAIXA;
    }

    /**
     * @return the TAXA_SOBRE_OR_ALTA
     */
    public static int getTAXA_SOBRE_OR_ALTA() {
        return TAXA_SOBRE_OR_ALTA;
    }

    /**
     * @param aTAXA_SOBRE_OR_ALTA the TAXA_SOBRE_OR_ALTA to set
     */
    public static void setTAXA_SOBRE_OR_ALTA(int aTAXA_SOBRE_OR_ALTA) {
        TAXA_SOBRE_OR_ALTA = aTAXA_SOBRE_OR_ALTA;
    }

    /**
     * @return the LIMITE_TAXA_OR
     */
    public static int getLIMITE_TAXA_OR() {
        return LIMITE_TAXA_OR;
    }

    /**
     * @param aLIMITE_TAXA_OR the LIMITE_TAXA_OR to set
     */
    public static void setLIMITE_TAXA_OR(int aLIMITE_TAXA_OR) {
        LIMITE_TAXA_OR = aLIMITE_TAXA_OR;
    }
    @Override
    public int getTaxaOR() {
        if (super.getRT() <= getLIMITE_TAXA_OR()) {
            return getTAXA_SOBRE_OR_BAIXA();
        }
        else{return getTAXA_SOBRE_OR_ALTA();}
    }
    
    @Override
    public int getTaxaRT() {
        return getTAXA_SOBRE_RT();
    }
   

}