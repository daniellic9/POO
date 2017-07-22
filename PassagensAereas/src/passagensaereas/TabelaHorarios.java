/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passagensaereas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *Tabela
 * @author arthur
 */
public class TabelaHorarios extends AbstractTableModel{
    private ArrayList<Passagem> voosDisponiveis=new <Passagem>ArrayList();

    
    private String [] colunas={"Horário","Origem","Destino","Valor"};

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
    public Object getValueAt(int linha, int coluna) {
        String horario = voosDisponiveis.get(linha).getHorarioSaida()+"-"+voosDisponiveis.get(linha).getHorarioChegada();
        switch(coluna){
            case 0:
                return horario;
            case 1:
                return voosDisponiveis.get(linha).getOrigem();
            case 2:
                return voosDisponiveis.get(linha).getDestino();
            case 3:
                return voosDisponiveis.get(linha).getValor();
            default:
                return null;
        }
    }
    public void addRow(Passagem p){
        this.voosDisponiveis.add(p);
    }
}
