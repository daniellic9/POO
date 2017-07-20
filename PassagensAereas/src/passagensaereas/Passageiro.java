package passagensaereas;

public class Passageiro {
    private String nomeCliente;
    private double cpf;
    
    public Passageiro(String nome, double cpf) {
        this.nomeCliente = nome;
        this.cpf = cpf;
    }

    //get e set do nome do cliente
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    //get e set número do cpf do cliente
    public double getCpf() {
        return cpf;
    }
    public void setCpf(double cpf) {
        this.cpf = cpf;
    }
}