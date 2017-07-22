package passagensaereas;

public class Voos extends InformacoesViagem {
    private Poltronas poltronas[][] = new Poltronas[4][10];
    private int numAviao;
    
    String vetorOrigem[] = { "São Paulo", "Rio de Janeiro", "Vitória", "Porto Alegre", "Manaus", "Fortaleza",
                              "Belo Horizonte", "Natal", "Brasília" };
    
    String vetorDestino[] = { "São Paulo", "Rio de Janeiro", "Vitória", "Porto Alegre", "Manaus", "Fortaleza",
                              "Belo Horizonte", "Natal", "Brasília" };
    
// ------------------- método que define as rotas de viagem
    public boolean rotasViagem(String origem, String destino) {
        boolean resp = false, vagasDisponiveis = true;
        String op = "";
        int i, n = 9;
        
        for(i=0; i<n; i++) {
            if( ((origem.equals(vetorOrigem[i].equals("Manaus"))) 
                || (origem.equals(vetorOrigem[i].equals("Natal"))) 
                || (origem.equals(vetorOrigem[i].equals("Fortaleza")))) 
                    && ((destino.equals(vetorDestino[i].equals("São Paulo")))
                || (destino.equals(vetorDestino[i].equals("Rio de Janeiro"))) 
                || (destino.equals(vetorDestino[i].equals("Vitória"))) 
                || (destino.equals(vetorDestino[i].equals("Porto Alegre"))) 
                || (destino.equals(vetorDestino[i].equals("Belo Horizonte")))) ) {
                
                if(vagasDisponiveis == true) {             
                    System.out.println("Não existe rota direto. Deseja comprar a passagem indo por Brasília?");
                    //fazer um botão de sim ou não
                    if(op == "sim") {
                        resp = true;
                    }
                }
                else if(vagasDisponiveis == false)
                    System.out.println("Não temos cadeiras para esse dia! Deseja comprar outro dia?");
            }
            else if( ((origem.equals(vetorOrigem[i].equals("Manaus"))) 
                || (origem.equals(vetorOrigem[i].equals("Natal"))) 
                || (origem.equals(vetorOrigem[i].equals("Fortaleza")))
                || (origem.equals(vetorOrigem[i].equals("Belo Horizonte"))) 
                || (origem.equals(vetorOrigem[i].equals("Porto Alegre"))) 
                || (origem.equals(vetorOrigem[i].equals("Vitória"))) 
                || (origem.equals(vetorOrigem[i].equals("Rio de Janeiro"))) 
                || (origem.equals(vetorOrigem[i].equals("São Paulo")))) 
                    && ((destino.equals(vetorDestino[i].equals("Brasília")))) ) {
                
                if(vagasDisponiveis == true) {             
                    //escolher as cadeiras
                }
                else if(vagasDisponiveis == false)
                    System.out.println("Não temos cadeiras para esse dia! Deseja comprar outro dia?");
            }
            
            else if (origem.equals(destino))
                System.out.println("Erro, você não pode ir para o mesmo lugar!");
        }      
        return resp;
    }
// --------------------------------------------------------

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
