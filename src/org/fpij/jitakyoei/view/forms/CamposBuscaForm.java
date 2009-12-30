package org.fpij.jitakyoei.view.forms;

import org.fpij.jitakyoei.view.gui.BuscaCamposPanel;

public class CamposBuscaForm {
	private BuscaCamposPanel buscaCamposPanel;
	
	public CamposBuscaForm(BuscaCamposPanel buscaCamposPanel) {
		this.buscaCamposPanel = buscaCamposPanel;
	}

	public String getNome() {
		return buscaCamposPanel.getNome().getText();
	}

	public void setNome(String nome) {
		buscaCamposPanel.getNome().setText(nome);
	}

	public String getRegistroFpij() {
		return buscaCamposPanel.getRegistroFpij().getText();
	}

	public void setRegistroFpij(String registroFpij) {
		buscaCamposPanel.getRegistroFpij().setText(registroFpij);
	}
	
}
