/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL8_D;
public class Pessoa {

	private String nome;
	private int nic;
        
        private static final String NOME_POR_OMISSAO=" ";
        private static final int NIC_POR_OMISSAO=00000000;

	/**
	 * 
	 * @param nome
	 * @param nic
	 */
	public Pessoa(String nome, int nic) {
		this.nome =nome;
                this.nic=nic;
	}

	public Pessoa() {
	this.nome=NOME_POR_OMISSAO;
        this.nic=NIC_POR_OMISSAO;
        
	}

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the nic
     */
    public int getNic() {
        return nic;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @param nic the nic to set
     */
    public void setNic(int nic) {
        this.nic = nic;
    }

}