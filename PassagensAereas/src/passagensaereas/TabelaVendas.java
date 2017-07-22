/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passagensaereas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author danie
 */
public class TabelaVendas extends AbstractTableModel{
    private ArrayList<Passagem> vendas=new <Passagem>ArrayList();
    
    private String [] colunas={"Voo","Horário","Origem","Destino"};

    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    @Override
    public int getRowCount() {
        return vendas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    
    @Override
    public Object getValueAt(int linha, int coluna) {
        String horario = vendas.get(linha).getHorarioSaida()+"-"+vendas.get(linha).getHorarioChegada();
        switch(coluna){
            case 0:
                return vendas.get(linha).getIdVoo();
            case 1:
                return horario;
            case 2:
                return vendas.get(linha).getOrigem();
            case 3:
                return vendas.get(linha).getDestino();
            default:
                return null;
        }
    }

    public ArrayList<Passagem> getVendas() {
        return vendas;
    }

    public String[] getColunas() {
        return colunas;
    }
    
}
