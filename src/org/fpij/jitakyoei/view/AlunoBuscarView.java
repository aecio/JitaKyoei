package org.fpij.jitakyoei.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.view.forms.CamposBuscaForm;
import org.fpij.jitakyoei.view.gui.AlunoBuscarPanel;

public class AlunoBuscarView implements ViewComponent {

	private AlunoBuscarPanel gui;
	private AppFacade facade;
	private CamposBuscaForm campoBusca;
	private DefaultTableModel alunoTableModel;
	private List<Aluno> alunoList;
	private Aluno aluno;
	private Aluno selectedAluno;
	public int MODO;
	
	public static int ALTERACAO = 1;
	public static int BUSCA = 2;
	
	public AlunoBuscarView(int MODO) {
		this();
		this.MODO = MODO;
	}
	
	public AlunoBuscarView() {
		gui = new AlunoBuscarPanel();
		gui.registerView(this);
		gui.getBuscar().addActionListener(new BuscarActionHandler());
		campoBusca = new CamposBuscaForm(gui.getBuscaCamposPanel());
		alunoTableModel = (DefaultTableModel) gui.getAlunoTable().getModel();
	}
	
	@Override
	public JPanel getGui() {
		return gui;
	}
	
	@Override
	public void registerFacade(AppFacade fac) {
		this.facade = fac;
		buscar();
	}

	public void buscar() {
		Filiado filiado = new Filiado();
		
		if(campoBusca.getNome()!=null && !campoBusca.getNome().trim().equals("")){
			filiado.setNome(campoBusca.getNome());
		}
		
		if((campoBusca.getRegistroFpij()!=null && !campoBusca.getRegistroFpij().trim().equals(""))){
			try{
				filiado.setId(Long.parseLong(campoBusca.getRegistroFpij()));
			}catch (Exception e) {
				JOptionPane.showMessageDialog(gui,"Nº de Registro inválido! No resgistro só pode haver números.");
				return;
			}
		}
		Aluno aluno = new Aluno();
		aluno.setFiliado(filiado);
		alunoList = facade.searchAluno(aluno);
		setAlunoList(alunoList);
	}
	
	private void setAlunoList(List<Aluno> alunoList) {
		Object[][] data = new Object[alunoList.size()][4];
		for (int i = 0; i < alunoList.size(); i++) {
			try{
				data[i][0] = alunoList.get(i).getFiliado().getId();
				data[i][1] = alunoList.get(i).getFiliado().getNome();
				data[i][2] = alunoList.get(i).getProfessor().getFiliado().getNome();
				data[i][3] = alunoList.get(i).getEntidade().getNome();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		alunoTableModel.setDataVector(data, new String[] { 
				"Resistro", "Nome", "Professor", "Entidade" });
	}

	public class BuscarActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			buscar();
		}
	}

	public List<Aluno> getAlunoList() {
		return alunoList;
	}


	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Aluno getSelectedAluno() {
		return selectedAluno;
	}

	public void setSelectedAluno(Aluno selectedAluno) {
		this.selectedAluno = selectedAluno;
	}

}
