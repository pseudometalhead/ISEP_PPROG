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
public abstract class Contribuinte {

    /**
     * O nome do contribuinte.
     */
    private String nome;

    /**
     * Morada do contribuinte.
     */
    private String morada;
    /**
     * Outros rendimentos.
     */
    private float OR;

    /**
     * O nome por omissão do contribuinte.
     */
    private static final String NOME_POR_OMISSAO = "sem nome";
    /**
     * Morada por omissão do contribuinte.
     */
    private static final String MORADA_POR_OMISSAO = "sem morada";
    /**
     * Outros rendimentos por omissão do contribuinte.
     */
    private static final float OR_POR_OMISSAO = 0;

    /**
     * MORADA_POR_OMISSAO Inicializa o nome do contribuinte com o nome recebido.
     *
     * @param nome o nome do contribuinte
     */
    public Contribuinte(String nome, String morada, float OR) {
        this.nome = nome;
        this.morada = morada;
        this.OR = OR;
    }

    public Contribuinte() {
        this.nome = NOME_POR_OMISSAO;
        this.morada = MORADA_POR_OMISSAO;
        this.OR = OR_POR_OMISSAO;
    }

    /**
     * Devolve o nome do contribuinte.
     *
     * @return nome do contribuinte
     */
    public String getNome() {
        return nome;
    }

    /**
     * Modifica o nome do contribuinte.
     *
     * @param nome o novo nome do contribuinte
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public float getOR() {
        return OR;
    }

    public void setOR(float OR) {
        this.OR = OR;
    }

    /**
     * Devolve o nome do trabalhador.
     *
     * @return nome do trabalhador
     */
    @Override
    public String toString() {
        return String.format("NOME: %s \nMORADA: %s \nOR: %.2f ", nome, morada, OR);
    }

    /**
     * Permite o cálculo do vencimento do trabalhador através do polimorfismo.
     *
     * @return vencimento do trabalhador
     */
    public abstract float calcularImposto();
    
    public boolean equals(Object outroObjeto)
    {        if (!super.equals(outroObjeto) && !(outroObjeto instanceof Contribuinte)) {
            return false;
        }

        return (this.nome).equals(((Contribuinte) outroObjeto).getNome())
                && (this.morada).equals(((Contribuinte) outroObjeto).getMorada()) 
                && this.OR == ((Contribuinte) outroObjeto).getOR();}
}
