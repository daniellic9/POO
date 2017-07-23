package passagensaereas;

import java.io.Serializable;

public abstract class InformacoesViagem implements Serializable{
     protected String origem, destino,data;
     protected String horarioSaida, horarioChegada; //mudar para o 'time' de data/hora
    protected float valor;
    
    public abstract float getValor();
    public abstract void setValor(float valor);
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
