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
public abstract class Contador {
    private String nome;
    private int consumo;
    private String identificador;
    private static final String NOME_POR_OMISSAO = "sem nome";
    private static final int CONSUMO_POR_OMISSAO = 0;
    
    public Contador(String nome, int consumo) {
        this.nome = nome;
        this.consumo = consumo;
    }
    public Contador(int consumo) {
        this.nome = NOME_POR_OMISSAO;
        this.consumo = consumo;
    }
    public Contador() {
        this.nome = NOME_POR_OMISSAO;
        this.consumo = CONSUMO_POR_OMISSAO;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the consumo
     */
    public int getConsumo() {
        return consumo;
    }

    /**
     * @param consumo the consumo to set
     */
    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }

    /**
     * @return the identificador
     */
    public String getIdentificador() {
        return identificador;
    }
    
    public abstract float calcConsumo();
    
    
}
