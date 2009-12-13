package org.fpij.jitakyoei.view.forms;

import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.model.beans.Endereco;
import org.fpij.jitakyoei.view.gui.EnderecoPanel;

@Form
public class EnderecoForm {
	private SwingBinder binder;
	private Endereco endereco;
	
	public EnderecoForm(EnderecoPanel enderecoPanel) {
		this.endereco = new Endereco();
		new SwingBinder(enderecoPanel, this.endereco).bind();
	}
	
	public Endereco pegarBean(){
		System.out.println("EnderecoForm.pegarBean()");
		return this.endereco;
	}
	
	public void limpar(){
		this.endereco = null;
	}

}
