package passagensaereas;

public class Passagem extends InformacoesViagem {
private int idpassagem;

    public Passagem(int idpassagem, Voos voo) {
        this.idpassagem = idpassagem;
        this.data = voo.data;
        this.destino = voo.destino;
        this.horarioChegada = voo.horarioChegada;
        this.horarioSaida = voo.horarioSaida;
        this.origem = voo.origem;
        this.valor = voo.valor;
    }



    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
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
    public String getHorarioSaida() {
        return this.horarioSaida;
    }

    @Override
    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida=horarioSaida;
    }

    @Override
    public String getHorarioChegada() {
        return this.horarioChegada;
    }

    @Override
    public void setHorarioChegada(String horarioChegada) {
        this.horarioChegada=horarioChegada;
    }
      public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }
   
    
}
