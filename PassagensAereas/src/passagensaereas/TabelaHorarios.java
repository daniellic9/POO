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
 * @author arthur
 */
public class TabelaHorarios extends AbstractTableModel{
    private ArrayList<Voos> voosDisponiveis=new <Voos>ArrayList();
    
    private String [] colunas={"Horário","Origem","Destino","Valor","Poltronas Disponiveis"};

    @Override
    public String getColumnName(int column){
        return colunas[column];
    }
    @Override
    public int getRowCount() {
        return voosDisponiveis.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
