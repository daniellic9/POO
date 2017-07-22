package passagensaereas;

public abstract class InformacoesViagem {
     protected String origem, destino, data;
     protected int horarioSaida, horarioChegada; //mudar para o 'time' de data/hora

    public abstract String getOrigem();
    public abstract void setOrigem(String origem);
    public abstract String getDestino();
    public abstract void setDestino(String destino);
    public abstract int getHorarioSaida() ;
    public abstract void setHorarioSaida(int horarioSaida);
    public abstract int getHorarioChegada() ;
    public abstract void setHorarioChegada(int horarioChegada);
    public abstract String getData();
    public abstract void setData(String data) ;
}
