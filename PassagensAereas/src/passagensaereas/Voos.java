package passagensaereas;

public class Voos {
    private String origem, destino;
    private Poltronas poltronas[][] = new Poltronas[4][10];
    private int horarioSaida, horarioChegada; //mudar para o 'time' de data/hora
    private int idVoo, numAviao, dataSaida, dataChegada;

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public Poltronas[][] getPoltronas() {
        return poltronas;
    }

    public int getHorarioSaida() {
        return horarioSaida;
    }

    public int getHorarioChegada() {
        return horarioChegada;
    }

    public int getIdVoo() {
        return idVoo;
    }

    public int getNumAviao() {
        return numAviao;
    }

    public int getDataSaida() {
        return dataSaida;
    }

    public int getDataChegada() {
        return dataChegada;
    }
    
}
