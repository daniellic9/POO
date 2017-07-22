/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passagensaereas;

/**
 *
 * @author arthur
 */
public class Passagem extends InformacoesViagem {
    private float valor;
     private String idVoo;

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getIdVoo() {
        return idVoo;
    }

    public void setIdVoo(String idVoo) {
        this.idVoo = idVoo;
    }
    
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
      public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
   
    
}
