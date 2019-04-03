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
public class TrabalhadorContaOutrem extends ContRendimento {

    private static int TAXA_SOBRE_OR = 2;
    private static int TAXA_SOBRE_RT_BAIXA = 1;
    private static int TAXA_SOBRE_RT_ALTA = 2;
    private static int LIMITE_TAXA_RT = 30000;
    private String empresa;

    public TrabalhadorContaOutrem(String nome, String morada, float OR, float RT, String empresa) {
        super(nome, morada, OR, RT);
        this.empresa=empresa;

    }

    public TrabalhadorContaOutrem() {
        super();

    }


    @Override
    public int getTaxaRT() {
        if (super.getRT() <= getLIMITE_TAXA_RT()) {
            return getTAXA_SOBRE_RT_BAIXA();
        } else {
            return getTAXA_SOBRE_RT_ALTA();
        }
    }

    @Override
    public int getTaxaOR() {
        return getTAXA_SOBRE_OR();
    }

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
     * @return the TAXA_SOBRE_RT_BAIXA
     */
    public static int getTAXA_SOBRE_RT_BAIXA() {
        return TAXA_SOBRE_RT_BAIXA;
    }

    /**
     * @param aTAXA_SOBRE_RT_BAIXA the TAXA_SOBRE_RT_BAIXA to set
     */
    public static void setTAXA_SOBRE_RT_BAIXA(int aTAXA_SOBRE_RT_BAIXA) {
        TAXA_SOBRE_RT_BAIXA = aTAXA_SOBRE_RT_BAIXA;
    }

    /**
     * @return the TAXA_SOBRE_RT_ALTA
     */
    public static int getTAXA_SOBRE_RT_ALTA() {
        return TAXA_SOBRE_RT_ALTA;
    }

    /**
     * @param aTAXA_SOBRE_RT_ALTA the TAXA_SOBRE_RT_ALTA to set
     */
    public static void setTAXA_SOBRE_RT_ALTA(int aTAXA_SOBRE_RT_ALTA) {
        TAXA_SOBRE_RT_ALTA = aTAXA_SOBRE_RT_ALTA;
    }

    /**
     * @return the LIMITE_TAXA_RT
     */
    public static int getLIMITE_TAXA_RT() {
        return LIMITE_TAXA_RT;
    }

    /**
     * @param aLIMITE_TAXA_RT the LIMITE_TAXA_RT to set
     */
    public static void setLIMITE_TAXA_RT(int aLIMITE_TAXA_RT) {
        LIMITE_TAXA_RT = aLIMITE_TAXA_RT;
    }

}
