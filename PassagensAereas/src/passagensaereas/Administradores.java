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
public class Administradores {
    private String nome;
    private int vendas;
    private String senha;

    public Administradores(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }
    
    
    public boolean testaSenha(String nome,String senha){
        return this.nome.equals(nome) && this.senha.equals(senha);
    }
}
