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
public abstract class ContRendimento extends Contribuinte {

    private float RT;
    private static final float RT_POR_OMISSAO = 0;

    public ContRendimento(String nome, String morada, float OR, float RT) {
        super(nome, morada, OR);
        this.RT = RT;
    }

    public ContRendimento() {
        super();
        this.RT = RT_POR_OMISSAO;

    }

    public float getRT() {
        return RT;
    }

    public void setRT(float RT) {
        this.RT = RT;
    }

    public abstract int getTaxaRT();

    public abstract int getTaxaOR();

    @Override
    public String toString() {
        return String.format("%s \nRT:%.2f", super.toString(), RT);
    } 
    @Override
    public float calcularImposto() {
        return super.getOR() * getTaxaOR() + this.RT * getTaxaRT();
    }
}
