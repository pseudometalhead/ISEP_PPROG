/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PL3_D;

/**
 *
 * @author Diana Barros
 */
public class Tempo {

    private int hora;
    private int minuto;
    private int segundo;

    private static final int HORA_POR_OMISSAO = 0;
    private static final int MINUTO_POR_OMISSAO = 0;
    private static final int SEGUNDO_POR_OMISSAO = 0;

    /**
     * Cria objeto tempo - default HH:MM:SS.
     *
     * @param hora
     * @param minuto
     * @param segundo
     */
    public Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    /**
     * Cria objeto tempo - default HH:MM:00.
     *
     * @param hora
     * @param minuto
     */
    public Tempo(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = SEGUNDO_POR_OMISSAO;
    }

    /**
     * Cria objeto tempo - default HH:00:00.
     *
     * @param hora
     */
    public Tempo(int hora) {
        this.hora = hora;
        this.minuto = MINUTO_POR_OMISSAO;
        this.segundo = SEGUNDO_POR_OMISSAO;
    }

    /**
     * Cria objeto tempo - default 00:00:00.
     */
    public Tempo() {
        this.hora = HORA_POR_OMISSAO;
        this.minuto = MINUTO_POR_OMISSAO;
        this.segundo = SEGUNDO_POR_OMISSAO;
    }

    /**
     *
     * @return hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * Altera para os valores passados por parametro a hora, minuto e segundo de
     * um objeto tempo.
     *
     * @param hora
     * @param minuto
     * @param segunfo
     */
    public void setTempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    /**
     *
     * @return minuto
     */
    public int getMinuto() {
        return minuto;
    }

    /**
     *
     * @return segundo
     */
    public int getSegundo() {
        return segundo;
    }

    /**
     * Devolve uma string no formato HH:MM:SS.
     *
     * @return
     */
    public String to24() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    /**
     * Devolve uma string no formato HH:MM:SS AM-PM.
     *
     * @return
     */
    public String to12() {
        String AM_PM = "AM";
        int aux = hora;
        if (hora >= 12) {
            aux = hora - 12;
            AM_PM = "PM";
        }
        return String.format("%02d:%02d:%02d %s", aux, minuto, segundo, AM_PM);
    }

    /**
     * Acrescenta a um tempo um segundo.
     */
    public void addSecond() {
        if (this.segundo < 59) {
            this.segundo++;
        } else {
            this.segundo = 0;
            if (this.minuto < 59) {
                this.minuto++;
            } else {
                this.minuto = 0;
                if (this.hora < 23) {
                    this.hora++;
                } else {
                    this.hora = 0;
                }
            }
        }
    }

    /**
     * Acrescenta a um tempo 1 segundo.
     */
    public void tick() {
        if (++segundo % 60 == 0) {
            segundo = 0;
            if (++minuto % 60 == 0) {
                minuto = 0;
                if (++hora % 24 == 0) {
                    hora = hora - 24;
                }
            }
        }
    }

    /**
     * Converte HH:MM:SS para segundos.
     *
     * @return int total de segundos
     */
    public int toSecond() {
        return hora * 60 * 60 + minuto * 60 + segundo;
    }

    /**
     * Verifica se uma hora é superior a outra.
     *
     * @param outroTempo
     * @return boolean
     */
    public boolean isMaior(Tempo outroTempo) {
        if (outroTempo.toSecond() < toSecond()) {
            return true;
        }
        return false;
    }

    /**
     * Verifica se uma hora é superior a outra.
     *
     * @param h
     * @param m
     * @param s
     * @return boolean
     */
    public boolean isMaior(int h, int m, int s) {
        if (new Tempo(h, m, s).toSecond() < toSecond()) {
            return true;
        }
        return false;
    }

    /**
     * Calcula diferença entre dois tempos (segundos).
     *
     * @param outroTempo
     * @return segundos
     */
    public int calcularDiferencaSegundos(Tempo outroTempo) {
        int totalSegundos = toSecond();
        int totalSegundos1 = outroTempo.toSecond();

        return Math.abs(totalSegundos - totalSegundos1);
    }

    /**
     * Calcula diferença entre dois tempos (HH:MM:SS).
     *
     * @param outroTempo
     * @return HH:MM:SS
     */
    public String calcularDiferencaTempo(Tempo outroTempo) {
        int total = calcularDiferencaSegundos(outroTempo);
        int h = total / 3600;
        int m = (total % 3600) / 60;
        int s = total % 60;
        return new Tempo(h, m, s).to24();
    }

}
