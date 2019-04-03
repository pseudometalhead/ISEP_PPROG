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
public class ElectricoBiHorario extends Eletrico {

    private String identificador;
    private int consumoVazio;
    private final String prefixo = "ELECTRICO-";

    private float CUSTO = (float) 0.14;
    private float CUSTO_VAZIO = (float) 0.066;

    public ElectricoBiHorario(String nome, int consumo, int consumoVazio) {
        super(nome, consumo);
        this.consumoVazio = consumoVazio;
    }

    @Override
    public float calcConsumo() {
        return super.getConsumo() * getCUSTO() + this.getConsumoVazio() * getCUSTO_VAZIO();
    }

    public String toString()
    {return String.format("NOME: %s \nCONSUMO: %d \nCONSUMO VAZIO: %d ", super.getNome(), super.getConsumo(), consumoVazio);}


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

    /**
     * @return the CUSTO_VAZIO
     */
    public float getCUSTO_VAZIO() {
        return CUSTO_VAZIO;
    }

    /**
     * @param CUSTO_VAZIO the CUSTO_VAZIO to set
     */
    public void setCUSTO_VAZIO(float CUSTO_VAZIO) {
        this.CUSTO_VAZIO = CUSTO_VAZIO;
    }

}
