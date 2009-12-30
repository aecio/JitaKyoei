package org.fpij.jitakyoei.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.view.gui.EntidadeBuscarPanel;

public class EntidadeBuscarView implements ViewComponent {

	private EntidadeBuscarPanel gui;
	private AppFacade facade;
	public List<Entidade> entidadeList;
	private Entidade selectedEntidade;
	public int MODO = 0;
	public static final int BUSCA_SOMENTE = 0;
	public static final int ALTERACAO = 1;

	public EntidadeBuscarView() {
		gui = new EntidadeBuscarPanel();
		gui.getBtnBuscar().addActionListener(new BuscarActionHandler());
		gui.getTblEntidades().addMouseListener(new TableMouseClickedHandler());
		gui.setVisible(true);
	}
	public EntidadeBuscarView(int MODO) {
		this();
		this.MODO = MODO; 
	}

	private void buscarEntidades(String nome) {
		Entidade entidade = new Entidade();
		entidade.setNome(nome);
		try {
			entidadeList = facade.searchEntidade(entidade);
			setEntidadeList(entidadeList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public class BuscarActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			String nome = getNome();
			if(nome!=null && nome.trim().equals("")){
				nome = null;
			}
			buscarEntidades(nome);
		}
	}
	
	public class TableMouseClickedHandler implements MouseListener{
		@Override
		public void mouseClicked(MouseEvent e) {
			if(MODO == ALTERACAO){
				selectedEntidade = entidadeList.get(gui.getTblEntidades().getSelectedRow());
				gui.getParent().getParent().getParent().getParent().setVisible(false);
			}
		}
		@Override public void mouseEntered(MouseEvent e) {}
		@Override public void mouseExited(MouseEvent e) {}
		@Override public void mousePressed(MouseEvent e) {}
		@Override public void mouseReleased(MouseEvent e) {}
	}

	@Override
	public JPanel getGui() {
		return gui;
	}

	@Override
	public void registerFacade(AppFacade fac) {
		this.facade = fac;
		buscarEntidades(null);
	}
	
	/* Métodos de acesso e modificação da GUI */
	
	public Entidade getSelectedEntidade() {
		return selectedEntidade;
	}
	
	public String getNome() {
		return gui.getNome().getText();
	}
	
	public void setNome(String nome) {
		gui.getNome().setText(nome);
	}
	
	private void setEntidadeList(List<Entidade> entidadeList) {
		Object[][] dados = new Object[entidadeList.size()][4];
		for (int i = 0; i < entidadeList.size(); i++) {
			dados[i][0] = entidadeList.get(i).getNome();
			dados[i][1] = entidadeList.get(i).getCnpj();
			dados[i][2] = entidadeList.get(i).getTelefone1();
			dados[i][3] = entidadeList.get(i).getTelefone2();
		}
		DefaultTableModel tblModel = (DefaultTableModel) gui.getTblEntidades().getModel();
		tblModel.setDataVector(dados, new String[] 
		                                         { "Nome", "CNPJ", "Telefone 1", "Telefone 2" });	
	}
}
