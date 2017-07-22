/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Disco;

import java.util.ArrayList;
import passagensaereas.Passagem;
import passagensaereas.Voos;

/**
 *
 * @author danie
 */
public interface InterfaceDisco {
    
    /**
     * Salva em um arquivo do disco os Voos
     * @param Voo - Objeto voo criado
     */
    public void salvarVoos();
    
    /**
     * Carrega um arquivo contendo todos os Voos 
     * @return Voos - retorna um vetor de voos
     */
    public ArrayList<Voos> carregarVoos();
    
    /**
     * Salva em um arquivo do disco os Voos
     * @param passagem 
     */
    public void salvarPassagem();
    
    /**
     * Carrega um arquivo contendo as passagems
     * @return 
     */
    public ArrayList<Passagem> carregarPassagens();
    
}
