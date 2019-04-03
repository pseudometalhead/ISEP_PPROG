/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL8_D;
public class Aluno extends Pessoa {

	private int numeroMecanografico;
        private static final int NUMERO_MECANOGRAFICO_POR_OMISSAO=0000;

	/**
	 * 
	 * @param nome
	 * @param nic
	 * @param numeroMecanografico
	 */
	public Aluno(String nome, int nic, int numeroMecanografico) {
		super(nome, nic);
                this.numeroMecanografico=numeroMecanografico;
	}
        
        public Aluno()
        {super();
        this.numeroMecanografico=NUMERO_MECANOGRAFICO_POR_OMISSAO;
        }

    /**
     * @return the numeroMecanografico
     */
    public int getNumeroMecanografico() {
        return numeroMecanografico;
    }

    /**
     * @param numeroMecanografico the numeroMecanografico to set
     */
    public void setNumeroMecanografico(int numeroMecanografico) {
        this.numeroMecanografico = numeroMecanografico;
    }
}