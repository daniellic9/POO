package passagensaereas;

public class Voos extends InformacoesViagem{
    private Poltronas poltronas[][] = new Poltronas[8][4];
    private int idvoo,numPolt;

    public Voos(){
for(int i=0;i<8;i++){
    for(int j=0;j<4;j++){
        poltronas[i][j]=new Poltronas();
    }
}
    }
    public Voos(String origem,String destino){
        this.destino = destino;
        this.origem = origem; 
        for(int i=0;i<8;i++){
            for(int j=0;j<3;j++){
                poltronas[i][j]=new Poltronas();
            }
        }

    }
        
    public void imprimir(){
            System.out.println("Numero do Origem: "+origem);
            System.out.println("Numero do Conexao: "+conexao);
            System.out.println("Numero do Destino: "+destino);
    }
    
    public int getIdvoo() {
        return idvoo;
    }
    
    
    public boolean IsPoltronaOcupada(int x, int y){
        return this.poltronas[x][y].isOcupado();
    }
    
    public void setPoltronaOcupada(int x, int y){
        this.poltronas[x][y].setOcupado(true);
    }

    public void setIdvoo(int idvoo) {
        this.idvoo = idvoo;
    }
    private String conexao;
    
    
    public String getConexao() {
        return conexao;
    }

    public void setConexao(String conexao) {
        this.conexao = conexao;
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

    @Override
    public float getValor() {
        return this.valor;
    }

    @Override
    public void setValor(float valor) {
        this.valor=valor;
    }

   
}
