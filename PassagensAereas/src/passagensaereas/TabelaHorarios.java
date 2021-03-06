package passagensaereas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TabelaHorarios extends AbstractTableModel{
    private ArrayList<Voos> voosDisponiveis = new <Voos>ArrayList();

    
    private String [] colunas={"id","Horário","Origem","Destino","Valor"};

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
                return voosDisponiveis.get(linha).getIdvoo();
            case 1:
                return horario;
            case 2:
                return voosDisponiveis.get(linha).getOrigem();
            case 3:
                return voosDisponiveis.get(linha).getDestino();
            case 4:
                return voosDisponiveis.get(linha).getValor();
            default:
                return null;
        }
    }
    public void addRow(Voos p){
        this.voosDisponiveis.add(p);
        this.fireTableDataChanged();
    }
}
