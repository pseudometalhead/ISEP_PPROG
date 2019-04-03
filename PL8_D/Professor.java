/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL8_D;

public class Professor extends Pessoa implements Rendimento {

    private String categoria;
    private static int vencimentosBase=1500;
     private static float taxaPAdjunto = 20;
    
    private static float taxaPCoordenador = 50;
    
    private static float vencimentoBase = 1500;
    
    private static String ASSISTENTE = "Assistente";
    
    private static String ADJUNTO = "Adjunto";
    
    private static String COORDENADOR = "Coordenador";

    Professor(String nome, int nic, String categoria) {
        super(nome, nic);
        this.categoria = categoria;
    }

    /**
     * @return the categoria
     */
    public String getCategoria() {
        return categoria;
    }

    /**
     * @return the vencimentosBase
     */
    public static int getVencimentosBase() {
        return vencimentosBase;
    }

    /**
     * @return the taxaPAdjunto
     */
    public static float getTaxaPAdjunto() {
        return taxaPAdjunto;
    }

    /**
     * @return the taxaPCoordenador
     */
    public static float getTaxaPCoordenador() {
        return taxaPCoordenador;
    }

    /**
     * @return the vencimentoBase
     */
    public static float getVencimentoBase() {
        return vencimentoBase;
    }

    /**
     * @return the ASSISTENTE
     */
    public static String getASSISTENTE() {
        return ASSISTENTE;
    }

    /**
     * @return the ADJUNTO
     */
    public static String getADJUNTO() {
        return ADJUNTO;
    }

    /**
     * @return the COORDENADOR
     */
    public static String getCOORDENADOR() {
        return COORDENADOR;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    /**
     * @param aVencimentosBase the vencimentosBase to set
     */
    public static void setVencimentosBase(int aVencimentosBase) {
        vencimentosBase = aVencimentosBase;
    }

    /**
     * @param aTaxaPAdjunto the taxaPAdjunto to set
     */
    public static void setTaxaPAdjunto(float aTaxaPAdjunto) {
        taxaPAdjunto = aTaxaPAdjunto;
    }

    /**
     * @param aTaxaPCoordenador the taxaPCoordenador to set
     */
    public static void setTaxaPCoordenador(float aTaxaPCoordenador) {
        taxaPCoordenador = aTaxaPCoordenador;
    }

    /**
     * @param aVencimentoBase the vencimentoBase to set
     */
    public static void setVencimentoBase(float aVencimentoBase) {
        vencimentoBase = aVencimentoBase;
    }

    /**
     * @param aASSISTENTE the ASSISTENTE to set
     */
    public static void setASSISTENTE(String aASSISTENTE) {
        ASSISTENTE = aASSISTENTE;
    }

    /**
     * @param aADJUNTO the ADJUNTO to set
     */
    public static void setADJUNTO(String aADJUNTO) {
        ADJUNTO = aADJUNTO;
    }

    /**
     * @param aCOORDENADOR the COORDENADOR to set
     */
    public static void setCOORDENADOR(String aCOORDENADOR) {
        COORDENADOR = aCOORDENADOR;
    }

    public float calcRend() { if(getCategoria().equalsIgnoreCase(Professor.getADJUNTO())) {
            return (Professor.getVencimentoBase() * (1 + Professor.getTaxaPAdjunto()/100));
        } else if(getCategoria().equalsIgnoreCase(Professor.getCOORDENADOR())) {
            return (Professor.getVencimentoBase() * (1 + Professor.getTaxaPCoordenador()/100));
        } else {
            return Professor.getVencimentoBase();
        }
    }
;

}
