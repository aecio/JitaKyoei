package org.fpij.jitakyoei.view.forms;

import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.view.gui.BuscaCamposPanel;

@Form
public class CamposBuscaForm {
	private String nome;
	private String registroFpij;
	
	public CamposBuscaForm(BuscaCamposPanel buscaCamposPanel) {
		new SwingBinder(buscaCamposPanel, this).bind();
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
