package org.dei.tributaveis;

public class MainTributaveis {

    public static void main(String[] args) {
        /*Na classe principal, chamada MainTributaveis, crie e mostre no ecrã uma instância da classe Veiculo
com matrícula 22-33-CC, encarnado e com cilindrada de 1000 cc. */
        Veiculo v1 = new Veiculo("22-33-CC", 1000, "encarnado");

        /*Crie e mostre no ecrã uma nova instância da classe Veiculo com matrícula 44-55-DD, azul e com
cilindrada de 2500 cc. Use a interface Cores para definir a cor do novo veículo*/
        Veiculo v2 = new Veiculo("44-55-DD", 2500, Cores.AZUL);

        /*Crie e mostre no ecrã uma nova instância da classe Veiculo com matrícula 11-22-BB, verde e com
cilindrada 1400 cc. Especifique a cor do novo veículo através da classe Veiculo.*/
        Veiculo v3 = new Veiculo("11-22-BB", 1400, Cores.VERDE);

        /* Crie e mostre no ecrã uma instância da classe Moradia com a morada Rua do Bocage, com cor cinzenta e
com área de 90 metros quadrados.*/
        Moradia c = new Moradia("Rua do Bocage", 90, "cinza");

        /*Crie e imprima o conteúdo de uma variável capaz de guardar qualquer referência das instâncias
existentes.*/
        Object teste = c;
        System.out.println(teste.toString());
        teste = v1;
        System.out.println(teste.toString());

        Tributavel[] tributaveis = new Tributavel[10];

        tributaveis[0] = v1;
        tributaveis[1] = v2;
        tributaveis[2] = v3;
        tributaveis[3] = c;
        
        
        float total=0;
        for (int i = 0; i < tributaveis.length; i++) {
            if(tributaveis[i] !=null)
            {total=total+(tributaveis[i].calcImposto());}         
        }
        
        System.out.printf("Total %.2f €" , total);
        
        

    }

}
