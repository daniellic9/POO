package passagensaereas;

public class Voos extends InformacoesViagem{

    public Poltronas[][] getPoltronas() {
        return poltronas;
    }

    public void setPoltronas(Poltronas[][] poltronas) {
        this.poltronas = poltronas;
    }

    public int getNumAviao() {
        return numAviao;
    }

    public void setNumAviao(int numAviao) {
        this.numAviao = numAviao;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
   
    private Poltronas poltronas[][] = new Poltronas[4][10];
    
    private int numAviao;

    @Override
    public String getOrigem() {
        return this.origem;
    }

    @Override
    public void setOrigem(String origem) {
       this.origem=origem;
    }

    @Override
    public String getDestino() {
       return this.destino;
    }

    @Override
    public void setDestino(String destino) {
        this.destino=destino;
    }

    @Override
    public int getHorarioSaida() {
        return this.horarioSaida;
    }

    @Override
    public void setHorarioSaida(int horarioSaida) {
        this.horarioSaida=horarioSaida;
    }

    @Override
    public int getHorarioChegada() {
        return this.horarioChegada;
    }

    @Override
    public void setHorarioChegada(int horarioChegada) {
        this.horarioChegada=horarioChegada;
    }

   
}
