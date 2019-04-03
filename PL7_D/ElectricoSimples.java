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
public class ElectricoSimples extends Eletrico {

    private String identificador;
    private int consumoVazio;
    private float pot;

    private float CUSTO_1 = (float) 0.13;
    private float CUSTO_2 = (float) 0.16;
    private float LIMITE_POT = (float) 6.9;

    public ElectricoSimples(String nome, int consumo, float pot) {
        super(nome, consumo);
        this.pot = pot;
    }
    @Override
    public String toString()
    {return String.format("NOME: %s \nCONSUMO: %d \nPOTÊNCIA: %f ", super.getNome(), super.getConsumo(), pot);}

    @Override
    public float calcConsumo() {
        if (this.pot < getLIMITE_POT()) {
            return super.getConsumo() * getCUSTO_1();
        } else {
            return super.getConsumo() * getCUSTO_2();
        }
    }


    /**
     * @return the consumoVazio
     */
    public int getConsumoVazio() {
        return consumoVazio;
    }

    /**
     * @param consumoVazio the consumoVazio to set
     */
    public void setConsumoVazio(int consumoVazio) {
        this.consumoVazio = consumoVazio;
    }

    /**
     * @return the pot
     */
    public float getPot() {
        return pot;
    }

    /**
     * @param pot the pot to set
     */
    public void setPot(int pot) {
        this.pot = pot;
    }


    /**
     * @return the CUSTO_1
     */
    public float getCUSTO_1() {
        return CUSTO_1;
    }

    /**
     * @param CUSTO_1 the CUSTO_1 to set
     */
    public void setCUSTO_1(float CUSTO_1) {
        this.CUSTO_1 = CUSTO_1;
    }

    /**
     * @return the CUSTO_2
     */
    public float getCUSTO_2() {
        return CUSTO_2;
    }

    /**
     * @param CUSTO_2 the CUSTO_2 to set
     */
    public void setCUSTO_2(float CUSTO_2) {
        this.CUSTO_2 = CUSTO_2;
    }

    /**
     * @return the LIMITE_POT
     */
    public float getLIMITE_POT() {
        return LIMITE_POT;
    }

    /**
     * @param LIMITE_POT the LIMITE_POT to set
     */
    public void setLIMITE_POT(float LIMITE_POT) {
        this.LIMITE_POT = LIMITE_POT;
    }

}
