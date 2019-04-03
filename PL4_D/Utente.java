/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL4_D;

/**
 *
 * @author Diana Barros
 */
public class Utente {
    

    /**
     * Nome por omissão
     */
    private static final String NOME_POR_OMISSAO = "";
    /**
     * Genero por omissão.
     */
    private static final char GENERO_POR_OMISSAO = ' ';
    /**
     * Idade por omissão.
     */
    private static final int IDADE_POR_OMISSAO = 0;
    /**
     * Altura por omissão.
     */
    private static final double ALTURA_POR_OMISSAO = 0;
    /**
     * Peso por omissão
     */
    private static final double PESO_POR_OMISSAO = 0;
    /**
     * Nome do utente.
     */
    private String nome;
    /**
     * Genero do utente.
     */
    private char genero;
    /**
     * Genero do utente.
     */
    private int idade;
    /**
     * Idade do utente.
     */
    private double altura;
    /**
     * Peso do utente.
     */
    private double peso;

    /**
     * Limite máximo do IMC magro.
     */
    private static int LIMITE_IMC_MAGRO = 18;
    /**
     * Limite mínimo do IMC obeso.
     */
    private static int LIMITE_IMC_OBESO = 25;
    /**
     * Total de utentes.
     */
    private static int totalUtentes = 0;

    /**
     * Cria um objeto Utente e incrementa totalUtentes.
     */
    public Utente() {
        this.nome = NOME_POR_OMISSAO;
        this.genero = GENERO_POR_OMISSAO;
        this.idade = IDADE_POR_OMISSAO;
        this.altura = ALTURA_POR_OMISSAO;
        this.peso = PESO_POR_OMISSAO;
        totalUtentes++;
    }

    /**
     * Cria um objeto Utente com nome e idade passados por parametro e
     * incrementa totalUtentes.
     *
     * @param nome
     * @param idade
     */
    public Utente(String nome, int idade) {
        this.nome = nome;
        this.genero = GENERO_POR_OMISSAO;
        this.idade = idade;
        this.altura = ALTURA_POR_OMISSAO;
        this.peso = PESO_POR_OMISSAO;
        totalUtentes++;
    }

    /**
     * Cria um objeto Utente com nome, genero, idade, altura e peso passados por
     * paramentro e incrementa totalUtentes.
     *
     * @param nome
     * @param genero
     * @param idade
     * @param altura
     * @param peso
     */
    public Utente(String nome, char genero, int idade, double altura, double peso) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        totalUtentes++;
    }

    /**
     * Devolve o número de objectos do tipo Utente criados.
     *
     * @return getTotalUtentes
     */
    public static int getTotalUtentes() {
        return totalUtentes;
    }

    /**
     * Devolve atributo nome de um objeto Utente.
     *
     * @return nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Devolve genero de um Utente.
     *
     * @return genero
     */
    public char getGenero() {
        return genero;
    }

    /**
     * Devolve idade de um Utente.
     *
     * @return idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Devolve altura de um Utente.
     *
     * @return utente
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Devolve peso de um Utente.
     *
     * @return peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Altera nome de um Utente segundo uma nova String passada por parametro.
     *
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Altera genero de um Utente para um novo genero passado por parametro.
     *
     * @param genero
     */
    public void setGenero(char genero) {
        this.genero = genero;
    }

    /**
     * Altera idade de um Utente para uma nova idade passada por parametro.
     *
     * @param idade
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Altera altura de um Utente para uma nova altura passada por parametro.
     *
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Altera peso de um Utente para um novo peso passado por parametro.
     *
     * @param peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Devolve uma String com infos acerca de um Utente - nome, idade, genero,
     * altura e peso.
     *
     * @return String
     */
    public String toString() {
        return String.format("NOME: %s \nIDADE: %d \nGENERO: %c \nALTURA: %f \nPESO: %f ", nome, idade, genero, altura, peso);
    }

    /**
     * Calcula a diferença de idades entre dois utentes - segundo utente passado
     * por parametro.
     *
     * @param outroUtente
     * @return int diferencaIdade
     */
    public int diferencaIdades(Utente outroUtente) {
        return this.idade - outroUtente.idade;
    }

    /**
     * Calcula a diferença de idades entre dois utentes - segunda idade passada
     * por parametro.
     *
     * @param idade
     * @return int diferencaIdade
     */
    public int diferencaIdades(int idade) {
        return this.idade - idade;
    }

    /**
     * Calcula IMC com base em altura em metros e peso em kilos.
     *
     * @return IMC ou 0 caso a altura introduzida seja 0.
     */
    public double calculaIMC() {
        if (this.altura != 0) {
            return this.peso / (this.altura * this.altura);
        }
        return 0;
    }

    /**
     * Encontra grau de obesidade com base no cálculo de IMC.
     *
     * @return String.
     */
    public String grauObesidade() {
        double IMC = calculaIMC();
        if (IMC == 0) {
            return "Impossível calcular IMC.";
        }
        if (IMC < 18) {
            return "Magro";
        } else {
            if (IMC <= 25) {
                return "Saudável";
            } else {
                return "Obeso";
            }
        }
    }

    /**
     * Verifica se IMC se encontra dentro do limite saudável.
     *
     * @return
     */
    public boolean isSaudavel() {
        if (calculaIMC() > LIMITE_IMC_MAGRO && calculaIMC() <= 25) {
            return true;
        }
        return false;
    }

//    public String maisNovo(Utente outroUtente) {
//        int dif = outroUtente.diferencaIdades(this.idade);
//        if (dif < 0) {
//            return String.format("O mais novo é %s.", outroUtente.getNome());
//        } else {
//            if (dif == 0) {
//                return "Ambos têm a mesma idade.";
//            } else {
//                return String.format("O mais novo é %s.", this.nome);
//            }
//        }
//    }
    /**
     * Devolve utente mais novo entre dois.
     *
     * @param outroUtente
     * @return objeto Utente
     */
    public Utente maisNovo(Utente outroUtente) {
        int dif = outroUtente.diferencaIdades(this.idade);
        if (dif < 0) {
            return outroUtente;
        } else {
            if (dif == 0) {
                return null;
            } else {
                return this;
            }
        }
    }

    /**
     * Devolve limite para grau de obesidade ser igual a magro.
     *
     * @return
     */
    public static int getLIMITE_IMC_MAGRO() {
        return LIMITE_IMC_MAGRO;
    }

    /**
     * Devolve limite para grau de obesidade ser igual a obeso.
     *
     * @return
     */
    public static int getLIMITE_IMC_OBESO() {
        return LIMITE_IMC_OBESO;
    }

    /**
     * Redefine limite para grau de obesidade ser igual a magro.
     *
     * @param magro
     */
    public static void setLIMITE_IMC_MAGRO(int magro) {
        LIMITE_IMC_MAGRO = magro;
    }

    /**
     * Redefine limite para grau de obesidade ser igual a obeso.
     *
     * @param obeso
     */
    public static void setLIMITE_IMC_OBESO(int obeso) {
        LIMITE_IMC_OBESO = obeso;
    }

}
