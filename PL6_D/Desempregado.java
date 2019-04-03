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
public class Desempregado extends Contribuinte {

    private static int TAXA_SOBRE_OR = 2;
    private int paragemMeses;

    public Desempregado(String nome, String morada, float OR, int paragemMeses) {
        super(nome, morada, OR);
        this.paragemMeses=paragemMeses;
    }

    public Desempregado() {
        super();
    }


    @Override
    public float calcularImposto() {
        return (getTAXA_SOBRE_OR() * this.getOR()) / 100;
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

}
