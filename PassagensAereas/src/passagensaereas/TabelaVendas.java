package passagensaereas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class TabelaVendas extends AbstractTableModel{
    private ArrayList<Passagem> vendas = new <Passagem>ArrayList();
    
    private final String[] colunas = {"idVoo", "Nome do Passageiro ", "Horário", "Origem", "Destino", "Valor"};

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
            case 4:
                return vendas.get(linha).getValor();
            case 5:
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
