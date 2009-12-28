package org.fpij.jitakyoei.view;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.view.forms.EntidadeForm;
import org.fpij.jitakyoei.view.gui.EntidadeCadastrarPanel;

@Form
public class EntidadeCadastrarView implements ViewComponent {

	private EntidadeCadastrarPanel gui;
	private AppFacade facade;
	private EntidadeForm entidadeForm;
	private Entidade entidade;
	private MainAppView parent;
	
	
	public EntidadeCadastrarView(MainAppView parent) {
		this.parent = parent;
		gui = new EntidadeCadastrarPanel();
		new SwingBinder(gui, this).bind();
		entidadeForm = new EntidadeForm(gui.getEntidadePanel());
		gui.setVisible(true);
	}

	@Override
	public JPanel getGui() {
		return gui;
	}

	@Override
	public void registerFacade(AppFacade fac) {
		this.facade = fac;
	}
	
	@Action
	public void cadastrarEntidade(){
		System.out.println("EntidadeCadastrarView.cadastrarEntidade()");
		try {
			Entidade novaEntidade = entidadeForm.getEntidade();
			facade.createEntidade(novaEntidade);
			JOptionPane.showMessageDialog(gui, "Entidade cadastrada com sucesso!");
			parent.removeTabPanel(gui);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	@Action
	public void cancelar(){
		parent.removeTabPanel(gui);
	}
}
