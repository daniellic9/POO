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
public class NewClassmodle extends AbstractTableModel{
    private ArrayList<Voos> vendas=new <Voos>ArrayList();
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
        switch(coluna){
            case 0:
                return vendas.get(linha).getVoo();
            case 1:
                return vendas.get(linha).getHorario();
            case 2:
                return vendas.get(linha).getOrigem();
            case 3:
                return vendas.get(linha).getDestino();
            default:
                return null;
        }
    }

    public ArrayList<Voos> getVendas() {
        return vendas;
    }

    public String[] getColunas() {
        return colunas;
    }
    
}
