package passagensaereas;

import Data.Data;
import java.io.Serializable;


public abstract class InformacoesViagem implements Serializable{
    protected String origem, destino;
    protected String horarioSaida, horarioChegada; //mudar para o 'time' de data/hora
    protected float valor;
    Data data;
    
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
    public abstract Data getData();
    public abstract void setData(int dia, int mes, int ano);
}
