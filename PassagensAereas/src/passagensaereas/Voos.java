package passagensaereas;

public class Voos extends InformacoesViagem{
    private Poltronas poltronas[][] = new Poltronas[4][10];
    private int numAviao,numPolt;
    private String conexao;
    
    public void imprimir(){
            System.out.println("Numero do Aviao: "+numAviao);
            System.out.println("Numero do Origem: "+origem);
            System.out.println("Numero do Conexao: "+conexao);
            System.out.println("Numero do Destino: "+destino);
    }
    
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
