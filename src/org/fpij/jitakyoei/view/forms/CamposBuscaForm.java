package org.fpij.jitakyoei.view.forms;

import org.fpij.jitakyoei.view.gui.BuscaCamposPanel;

import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

@Form
public class CamposBuscaForm {
	private String nome;
	private String registroFpij;
	private SwingBinder binder;
	
	public CamposBuscaForm(BuscaCamposPanel buscaCamposPanel) {
		binder = new SwingBinder(buscaCamposPanel, this);
		binder.bind();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegistroFpij() {
		return registroFpij;
	}

	public void setRegistroFpij(String registroFpij) {
		this.registroFpij = registroFpij;
	}
	
	
	

}
