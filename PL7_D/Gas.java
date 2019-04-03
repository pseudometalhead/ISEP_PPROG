/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL7_D;

/**
 *
 * @author Diana Barros
 */
public class Gas extends Contador {

    private final String identificador;
    private static int contGas;
    private float CUSTO = (float) 0.8;
    private final String prefixo = "GAS-";

    public Gas(String nome, int consumo) {
        super(nome, consumo);
        identificador = prefixo + ++contGas;
    }
    public String toString()
    {return String.format("NOME: %s \nCONSUMO: %d ", super.getNome(), super.getConsumo());}

    @Override
    public float calcConsumo() {
        return super.getConsumo()* getCUSTO();
    }

    /**
     * @return the identificador
     */
    public String getIdentificador() {
        return identificador;
    }

    /**
     * @return the contGas
     */
    public  static int getContGas() {
        return contGas;
    }

    /**
     * @return the CUSTO
     */
    public float getCUSTO() {
        return CUSTO;
    }

    /**
     * @param CUSTO the CUSTO to set
     */
    public void setCUSTO(float CUSTO) {
        this.CUSTO = CUSTO;
    }

}
