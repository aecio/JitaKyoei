package org.fpij.jitakyoei.view.forms;

import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.view.gui.EntidadePanel;

public class EntidadeForm {
	private Entidade entidade;
	private EntidadePanel entidadePanel;
	private EnderecoForm enderecoForm;

	public EntidadeForm(EntidadePanel entidadePanel) {
		init(entidadePanel, new Entidade());
	}
	
	public EntidadeForm(EntidadePanel entidadePanel, Entidade entidade) {
		init(entidadePanel, entidade);
		setEntidade(entidade);
	}
	
	private void init(EntidadePanel entidadePanel, Entidade entidade) {
		this.entidade = entidade;
		this.entidadePanel = entidadePanel;
		this.enderecoForm =  new EnderecoForm(entidadePanel.getEnderecoPanel());
	}
	
	public Entidade getEntidade(){
		entidade.setNome(getNome());
		entidade.setCnpj(getCnpj());
		entidade.setTelefone1(getTelefone1());
		entidade.setTelefone2(getTelefone2());
		entidade.setEndereco(enderecoForm.getEndereco());
		return entidade;
	}
	
	public void setEntidade(Entidade e){
		this.entidade = e;
		setNome(e.getNome());
		setCnpj(e.getCnpj());
		setTelefone1(e.getTelefone1());
		setTelefone2(e.getTelefone2());
		enderecoForm.setEndereco(e.getEndereco());
	}
	
	/*Métodos de acesso aos dados da GUI*/
	public String getNome() {
		return entidadePanel.getNome().getText();
	}
	public String getCnpj(){
		return entidadePanel.getCnpj().getText();
	}
	public String getTelefone1(){
		return entidadePanel.getTelefone1().getText();
	}
	public String getTelefone2(){
		return entidadePanel.getTelefone2().getText();
	}
	
	/*Métodos modificadores do dados da GUI */
	public void setNome(String nome) {
		entidadePanel.getNome().setText(nome);
	}
	public void setCnpj(String cnpj){
		entidadePanel.getCnpj().setText(cnpj);
	}
	public void setTelefone1(String telefone1){
		entidadePanel.getTelefone1().setText(telefone1);
	}
	public void setTelefone2(String telefone2){
		entidadePanel.getTelefone2().setText(telefone2);
	}
}
