/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL8_D;
public class Bolseiro extends Aluno implements Rendimento {
     private float valorBolsa;

    public Bolseiro(String nome, int nic, int numeroMecanografico, float valorBolsa) {
        super(nome, nic, numeroMecanografico);
        this.valorBolsa=valorBolsa;
    }

     @Override
	public float calcRend() {
		return valorBolsa;
	}

}