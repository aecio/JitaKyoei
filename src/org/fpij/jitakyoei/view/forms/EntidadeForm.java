package org.fpij.jitakyoei.view.forms;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.binding.AbstractBinder;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.view.gui.EntidadePanel;

@Form
public class EntidadeForm {
	private EnderecoForm enderecoForm;
	
	private Entidade entidade;

	private AbstractBinder binder;

	public EntidadeForm(EntidadePanel entidadePanel) {
		this.entidade = new Entidade();
		binder = new SwingBinder(entidadePanel, entidade);
		binder.bind();
		enderecoForm =  new EnderecoForm(entidadePanel.getEnderecoPanel());  
	}
	
	public Entidade pegarBean(){
		entidade.setEndereco(enderecoForm.pegarBean());
		return entidade;
	}
	
	public void limpar(){
		this.entidade = new Entidade();
		enderecoForm.limpar();
	}
	
	@Action
	public void teste(){
		Entidade e = pegarBean();
		System.out.println(e.getNome());
		System.out.println(e.getTelefone1());
		System.out.println(e.getEndereco().getBairro());
	}

	public Entidade getEntidade() {
		return entidade;
	}

	public void setEntidade(Entidade entidade) {
		this.entidade = entidade;
	}
	
}
