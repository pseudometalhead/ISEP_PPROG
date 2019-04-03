package PL1_D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diana Barros
 */
public class ID {

    private String nome;
    private int idade;
    
    private static final int IDADE_POR_OMISSAO = 0;

    public ID() {
        this.nome = " ";
        this.idade= IDADE_POR_OMISSAO;
    }

    public ID(String nome) {
        this.nome = nome;
        this.idade= IDADE_POR_OMISSAO;
    }

    public ID(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return String.format("%s tem %d anos", nome, idade);
    }

}
