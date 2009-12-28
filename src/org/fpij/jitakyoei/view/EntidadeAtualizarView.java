package org.fpij.jitakyoei.view;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.view.forms.EntidadeForm;
import org.fpij.jitakyoei.view.gui.EntidadeAtualizarPanel;

@Form
public class EntidadeAtualizarView implements ViewComponent {

	private EntidadeAtualizarPanel gui;
	private AppFacade facade;
	private EntidadeForm entidadeForm;
	private Entidade entidade;
	
	
	public EntidadeAtualizarView() {
		gui = new EntidadeAtualizarPanel();
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
	public void atualizarEntidade(){
		try {
			entidade = entidadeForm.getEntidade(); 
			facade.updateEntidade(entidade);
			JOptionPane.showMessageDialog(gui, "Entidade alterada com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}