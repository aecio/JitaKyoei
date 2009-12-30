package org.fpij.jitakyoei.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.view.forms.CamposBuscaForm;
import org.fpij.jitakyoei.view.gui.ProfessorBuscarPanel;

public class ProfessorBuscarView implements ViewComponent{

	private ProfessorBuscarPanel gui;
	private AppFacade facade;
	private CamposBuscaForm campoBusca;
	private Professor selectedProfessor;
	private List<Professor> professorList;
	public static final int BUSCA_SOMENTE = 0;
	public static final int ALTERACAO = 1;
	
	public ProfessorBuscarView() {
		gui = new ProfessorBuscarPanel();
		gui.getBuscar().addActionListener(new BuscarActionHandler());
		campoBusca = new CamposBuscaForm(gui.getBuscaCamposPanel());
	}
	
	public ProfessorBuscarView(int MODO) {
		this();
		if(MODO == ALTERACAO){
			gui.getProfessores().addMouseListener(new TableProfessoresMouseClickedHandler());
		}
	}
	
	private void buscarProfessores(String nome, Long registroFpij) {
		Filiado filiado = new Filiado();
		filiado.setNome(nome);
		filiado.setId(registroFpij);
		Professor professor = new Professor();
		professor.setFiliado(filiado);
		try {
			professorList = facade.searchProfessor(professor);
			setProfessorList(professorList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public JPanel getGui() {
		return gui;
	}
	
	@Override
	public void registerFacade(AppFacade fac) {
		this.facade = fac;
		buscarProfessores(null, null);
	}
	
	public class BuscarActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			buscarProfessores(getNome(), getRegistroFpij());
		}
	}
	
	public class TableProfessoresMouseClickedHandler implements MouseListener {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			selectedProfessor = professorList.get(gui.getProfessores().getSelectedRow());
			gui.getParent().getParent().getParent().getParent().setVisible(false);
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {}
		@Override
		public void mouseExited(MouseEvent arg0) {}
		@Override
		public void mousePressed(MouseEvent arg0) {}
		@Override
		public void mouseReleased(MouseEvent arg0) {}
	}
	
	/* Métodos de acesso e modificação da GUI */
	
	public Professor getSelectedProfessor() {
		return selectedProfessor;
	}
	
	public Long getRegistroFpij() {
		String registro = campoBusca.getRegistroFpij().trim();
		if(registro==null || registro.equals("")){
		}
		else{
			try{
				return Long.parseLong(campoBusca.getRegistroFpij().trim());
			}catch (Exception e) {
				JOptionPane.showMessageDialog(gui, "Digite um número de registro válido!");
			}
		}
		return null;
	}
	
	public void setRegistroFpij(String registroFpij) {
		campoBusca.setRegistroFpij(registroFpij);
	}
	
	public String getNome() {
		return campoBusca.getNome();
	}
	
	public void setNome(String nome) {
		campoBusca.setNome(nome);
	}
	
	public void setProfessorList(List<Professor> professorList) {
		Object[][] dados = new Object[professorList.size()][4];
		for (int i = 0; i < professorList.size(); i++) {
			dados[i][0] = professorList.get(i).getFiliado().getId();
			dados[i][1] = professorList.get(i).getFiliado().getNome();
			dados[i][2] = professorList.get(i).getFiliado().getTelefone1();
			dados[i][3] = professorList.get(i).getFiliado().getTelefone2();
		}
		DefaultTableModel tblModel = (DefaultTableModel) gui.getProfessores().getModel();
		tblModel.setDataVector(dados, new String[]{
				"Registro FPIJ", "Nome", "Telefone 1", "Telefone 2" });	
	}
}
