package org.dei.tributaveis;

public class Veiculo extends Tributavel implements Cores {

    private String matricula;
    private int cilindrada;
    private String cor;

    private static int LIMITE_CILINDRADA = 1500;
    private static int IMPOSTO_1 = 15;
    private static int IMPOSTO_2 = 40;

//    Variáveis para a alínea 13    
//    private static int limiteEscalao1 = 1500;
//    private static float impostoEscalao1 = 15;
//    private static float impostoEscalao2 = 40;    
    public Veiculo(String matricula, int cilindrada, String cor) {
        this.matricula = matricula;
        this.cilindrada = cilindrada;
        this.cor = cor;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public String getCor() {
        return cor;
    }

    /**
     * @return the LIMITE_CILINDRADA
     */
    public static int getLIMITE_CILINDRADA() {
        return LIMITE_CILINDRADA;
    }

    /**
     * @return the IMPOSTO_1
     */
    public static int getIMPOSTO_1() {
        return IMPOSTO_1;
    }

    /**
     * @return the IMPOSTO_2
     */
    public static int getIMPOSTO_2() {
        return IMPOSTO_2;
    }

    /**
     * @param aLIMITE_CILINDRADA the LIMITE_CILINDRADA to set
     */
    public static void setLIMITE_CILINDRADA(int aLIMITE_CILINDRADA) {
        LIMITE_CILINDRADA = aLIMITE_CILINDRADA;
    }

    /**
     * @param aIMPOSTO_1 the IMPOSTO_1 to set
     */
    public static void setIMPOSTO_1(int aIMPOSTO_1) {
        IMPOSTO_1 = aIMPOSTO_1;
    }

    /**
     * @param aIMPOSTO_2 the IMPOSTO_2 to set
     */
    public static void setIMPOSTO_2(int aIMPOSTO_2) {
        IMPOSTO_2 = aIMPOSTO_2;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return String.format("Veículo com matrícula %s e cilindrada %d tem cor %s",
                matricula, cilindrada, cor);
    }

    @Override
    float calcImposto() {
        if (cilindrada < LIMITE_CILINDRADA) {
            return IMPOSTO_1;
        } else {
            return IMPOSTO_2;
        }
    }

}
