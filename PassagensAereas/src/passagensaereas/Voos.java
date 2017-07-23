package passagensaereas;

public class Voos extends InformacoesViagem{
    private String conexao;
public Voos(String origem,String destino){
    this.origem=origem;
    this.destino=destino;
}
    public String getConexao() {
        return conexao;
    }

    public void setConexao(String conexao) {
        this.conexao = conexao;
    }

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

   
}
