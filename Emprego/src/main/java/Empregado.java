
import com.mycompany.utilitarios.Data;
import com.mycompany.utilitarios.Tempo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Diana Barros
 */
public class Empregado {

    private String primeiroNome;
    private String ultimoNome;
    private Data dataContrato;
    private Tempo horaEntrada;
    private Tempo horaSaida;

    private static String NOME_POR_OMISSAO = "";
    private static Data DATA_POR_OMISSAO = new Data();
    private static Tempo HORA_POR_OMISSAO = new Tempo();

    Empregado(String primeiroNome, String ultimoNome, Data dataContrato, Tempo horaEntrada, Tempo horaSaida) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.dataContrato = dataContrato;
        this.horaEntrada = horaEntrada;
        this.horaSaida = horaSaida;
    }

    Empregado() {
    }

    /**
     * @return the primeiroNome
     */
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    /**
     * @return the ultimoNome
     */
    public String getUltimoNome() {
        return ultimoNome;
    }

    /**
     * @return the dataContrato
     */
    public Data getDataContrato() {
        return dataContrato;
    }

    /**
     * @return the horaEntrada
     */
    public Tempo getHoraEntrada() {
        return horaEntrada;
    }

    /**
     * @return the horaSaida
     */
    public Tempo getHoraSaida() {
        return horaSaida;
    }

    /**
     * @param primeiroNome the primeiroNome to set
     */
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    /**
     * @param ultimoNome the ultimoNome to set
     */
    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    /**
     * @param aDataContrato the dataContrato to set
     */
    public void setDataContrato(Data aDataContrato) {
        dataContrato = aDataContrato;
    }

    /**
     * @param aHoraEntrada the horaEntrada to set
     */
    public void setHoraEntrada(Tempo aHoraEntrada) {
        horaEntrada = aHoraEntrada;
    }

    /**
     * @param aHoraSaida the horaSaida to set
     */
    public void setHoraSaida(Tempo aHoraSaida) {
        horaSaida = aHoraSaida;
    }



    @Override
    public boolean equals(Object outroObjeto) {
        if (!super.equals(outroObjeto) &&!(outroObjeto instanceof Empregado) ) {
            return false;
        }
        Empregado teste = (Empregado) outroObjeto;
        return (this.getPrimeiroNome()).equals(teste.getPrimeiroNome()) && this.getUltimoNome().equals(teste.getUltimoNome())
                && (this.getDataContrato()).equals(teste.getDataContrato()) && (this.getHoraEntrada()).equals(teste.getHoraEntrada())
                && (this.getHoraSaida()).equals(teste.getHoraSaida());
    }
    
    public String toString()
    {return String.format("%nNome: %s%s %nData Contrato: %d-%d-%d $Hora Entrada: %dh%d Hora Saída: %dh%d", getPrimeiroNome(), getUltimoNome(), getDataContrato().getDia(), getDataContrato().getMes(),getDataContrato().getAno(), getHoraEntrada().getHoras(),getHoraEntrada().getMinutos(), getHoraSaida().getHoras(), getHoraSaida().getMinutos());}

    public int calcHorasTrabalhadas() {
        int segundos= this.getHoraEntrada().diferencaEmSegundos(this.horaSaida);
        return (Math.round((segundos /60f/60f)))*5;
    }
    
    
    
    public int tempoContrato() {
    return (this.dataContrato).diferenca(Data.dataAtual());
}

}
