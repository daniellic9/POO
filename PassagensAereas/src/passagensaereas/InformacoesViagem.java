package passagensaereas;

public abstract class InformacoesViagem {
     protected String origem, destino,data;
     protected String horarioSaida, horarioChegada; //mudar para o 'time' de data/hora

    public abstract String getOrigem();
    public abstract void setOrigem(String origem);
    public abstract String getDestino();
    public abstract void setDestino(String destino);
    public abstract String getHorarioSaida() ;
    public abstract void setHorarioSaida(String horarioSaida);
    public abstract String getHorarioChegada() ;
    public abstract void setHorarioChegada(String horarioChegada);
    public abstract String getData();
    public abstract void setData(String data) ;
}
