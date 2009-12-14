package org.fpij.jitakyoei.view;

import java.util.List;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.view.gui.EntidadeBuscarPanel;

@Form
public class EntidadeBuscarView implements ViewComponent {
	private EntidadeBuscarPanel gui;
	private AppFacade facade;
	private String nome;

	DefaultTableModel tblModel;

	public EntidadeBuscarView() {
		gui = new EntidadeBuscarPanel();
		new SwingBinder(gui, this).bind();
		gui.setVisible(true);
		tblModel = (DefaultTableModel) gui.getTblEntidades().getModel();
	}

	private void buscarEntidades(String nome) {
		Entidade entidade = new Entidade();
		entidade.setNome(nome);
		try {
			List<Entidade> result = facade.searchEntidade(entidade);

			Object[][] dados = new Object[result.size()][4];
			for (int i = 0; i < result.size(); i++) {
				dados[i][0] = result.get(i).getNome();
				dados[i][1] = result.get(i).getCnpj();
				dados[i][2] = result.get(i).getTelefone1();
				dados[i][3] = result.get(i).getTelefone2();
			}

			tblModel.setDataVector(dados, new String[] { "Nome", "CNPJ",
					"Telefone 1", "Telefone 2" });
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Action
	public void btnBuscar() {
		System.out.println("EntidadeBuscarView.buscar()");
		if(nome!=null && nome.trim().equals("")){
			nome = null;
		}
		buscarEntidades(nome);
		System.out.println(nome);
	}

	@Override
	public JPanel getGui() {
		return gui;
	}

	@Override
	public void registerFacade(AppFacade fac) {
		this.facade = fac;
		btnBuscar();
	}
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
