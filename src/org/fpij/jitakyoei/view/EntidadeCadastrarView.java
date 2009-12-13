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
	
	
	public EntidadeCadastrarView() {
		novoForm();
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
			entidade = entidadeForm.pegarBean(); 
			facade.createEntidade(entidade);
			entidadeForm.limpar();
			JOptionPane.showMessageDialog(gui, "Entidade cadastrada com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		novoForm();
		
	}

	public void novoForm() {
		entidade = new Entidade();
		System.out.println("EntidadeCadastrarView.novoForm()");
		gui = new EntidadeCadastrarPanel();
		new SwingBinder(gui, this).bind();
		entidadeForm = new EntidadeForm(gui.getEntidadePanel());
		gui.setVisible(true);
	}
}
