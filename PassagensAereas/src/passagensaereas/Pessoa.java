package passagensaereas;

public abstract class Pessoa {
    String nomePessoa;
    String cpf;
    
    public abstract String getNomePessoa();
    public abstract void setNomePessoa(String nomePessoa);

    public abstract String getCpf();
    public abstract void setCpf(String cpf);
}
