package source;

import model.Candidato;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class CandTable extends AbstractTableModel {
	
	private List<Candidato> dados = new ArrayList<>();
	private String[] colunas = {"Candidato","Setor","Número","Votos"};

    //metodo para nomear as colunas
    @Override
    public String getColumnName(int column) {
        return colunas[column]; 
    }
        
	//metodo para deixar a largura da tabela na quantidade de colunas
	public int getColumnCount() {
		return colunas.length;
	}
        //metodo para deixar a o tamanho da tabela na quantidade de linhas
	@Override 
	public int getRowCount() {
		return dados.size();
	}

	
	@Override
	public Object getValueAt(int Linhas, int Coluna) {
		switch (Coluna) {
		case 0:
			return dados.get(Linhas).getName();
		
		case 1:
			return dados.get(Linhas).getSetor();
			
		case 2:
			return dados.get(Linhas).getNumber();
                    
                case 3:
                        return dados.get(Linhas).getVoto();

		}
		return null;
	}
        
    //metodo de alterar dados da tabela
    @Override
    public void setValueAt (Object valor, int Linhas, int coluna){
    
        switch (coluna) {
		case 0:
			dados.get(Linhas).setName((String) valor);
                    break;
		case 1:
			 dados.get(Linhas).setSetor((String) valor);
                    break;
                    
		case 2:
			 dados.get(Linhas).setNumber(Integer.parseInt((String) valor));
                    break;
		}
        //metodo para atualizar a tabbela depois de uma alteração.
        fireTableCellUpdated(Linhas, Linhas);

    }

    //metodo de adicionar tabela
    public void addRow(Candidato p) {
        this.dados.add(p);
        //atualizar após inserir tabela
        this.fireTableDataChanged(); 
    }
    //metodo de remover tabela
    public void removeRow (int linha){
        
        this.dados.remove(linha);
        //atualizar após deletar
        this.fireTableRowsDeleted(linha, linha);
    }
   
}
