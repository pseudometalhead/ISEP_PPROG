package PL9_D;

/**
 * Esta classe permite a construção de uma hierarquia de classes para
 * representarem diferentes tipos de trabalhadores. Especifica membros comuns a
 * todas as classes da hierarquia.
 *
 * @author ISEP-DEI-PPROG
 */
public abstract class Trabalhador implements Comparable{

    /**
     * O nome do trabalhador.
     */
    private String nome;

    /**
     * O nome por omissão do trabalhador.
     */
    private static final String NOME_POR_OMISSAO = "sem nome";

    /**
     * Inicializa o nome do trabalhador com o nome recebido.
     *
     * @param nome o nome do trabalhador
     */
    public Trabalhador(String nome) {
        this.nome = nome;
    }

    /**
     * Inicializa o nome do trabalhador com o nome por omissão.
     */
    public Trabalhador() {
        nome = Trabalhador.NOME_POR_OMISSAO;
    }

    /**
     * Devolve o nome do trabalhador.
     *
     * @return nome do trabalhador
     */
    public String getNome() {
        return nome;
    }

    /**
     * Modifica o nome do trabalhador.
     *
     * @param nome o novo nome do trabalhador
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Devolve o nome do trabalhador.
     *
     * @return nome do trabalhador
     */
    @Override
    public String toString() {
        return nome;
    }

//    /**
//     * Compara o trabalhador com o objeto recebido.
//     *
//     * @param outroObjeto o objeto a comparar com o trabalhador
//     * @return true se o objeto recebido representar outro trabalhador
//     * equivalente ao trabalhador. Caso contrário, retorna false.
//     */
//    @Override
//    public boolean equals(Object outroObjeto) {
//        if (this == outroObjeto) {
//            return true;
//        }
//        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
//            return false;
//        }
//        Trabalhador t = (Trabalhador) outroObjeto;
//        return this.nome.equalsIgnoreCase(t.nome);
//    }

    @Override
    public int compareTo(Object outroObj) {
        float outroVenc = ((Trabalhador) outroObj).calcularVencimento();
        float esteVenc = this.calcularVencimento();

        if (esteVenc < outroVenc) {
            return -1;
        } else if (esteVenc > outroVenc) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Permite o cálculo do vencimento do trabalhador através do polimorfismo.
     *
     * @return vencimento do trabalhador
     */
    public abstract float calcularVencimento();

}
