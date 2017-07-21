package passagensaereas;

public class Passageiro extends Pessoa {
        
    public Passageiro(String nome, double cpf) {
        this.nomePessoa = nomePessoa;
        this.cpf = cpf;
    }

    //get e set do nome do cliente
    public String getNomePessoa() {
        return nomePessoa;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    //get e set número do cpf do cliente
    public double getCpf() {
        return cpf;
    }
    public void setCpf(double cpf) {
        this.cpf = cpf;
    }
}