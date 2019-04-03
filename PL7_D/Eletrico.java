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
public abstract class Eletrico extends Contador {

    private final String identificador;
    private static int contElectro;
    private final String prefixo = "ELECTRICO-";

    public Eletrico(String nome, int consumo) {
        super(nome, consumo);
        identificador = prefixo + ++contElectro;
    }

    public static int getContElectro() {
        return contElectro;
    }

    @Override
    public String getIdentificador() {
        return identificador;
    }

}
