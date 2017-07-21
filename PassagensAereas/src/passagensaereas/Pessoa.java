package passagensaereas;

public abstract class Pessoa {
    String nomePessoa;
    double cpf;
    
    public abstract String getNomePessoa();
    public abstract void setNomePessoa(String nomePessoa);

    public abstract double getCpf();
    public abstract void setCpf(double cpf);
}
