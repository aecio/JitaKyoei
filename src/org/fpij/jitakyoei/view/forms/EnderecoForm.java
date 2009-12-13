package org.fpij.jitakyoei.view.forms;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.model.beans.Endereco;
import org.fpij.jitakyoei.view.gui.EnderecoPanel;

@Form
public class EnderecoForm {
	private Endereco endereco;
	SwingBinder binder;
	
	
	public EnderecoForm(EnderecoPanel enderecoPanel) {
		endereco = new Endereco();
		binder = new SwingBinder(enderecoPanel, this.endereco);
		binder.bind();
	}
	
	public Endereco pegarBean(){
		System.out.println("EnderecoForm.pegarBean()");
		
		return endereco;
	}

	public void limpar(){
		setEndereco(null);
		binder.refresh();
	}
	

//	public void addDados(){
//		setRua("Rua dos Problemas");
//		setNumero("321");
//		setBairro("Confus�o");
//		setCidade("Teresina");
//		setEstado("Piau�");
//		setCep("64025-100");
//	}
//	
//	public String getRua() {
//		return rua;
//	}
//	public void setRua(String rua) {
//		this.rua = rua;
//	}
//	public String getNumero() {
//		return numero;
//	}
//	public void setNumero(String numero) {
//		this.numero = numero;
//	}
//	public String getBairro() {
//		return bairro;
//	}
//	public void setBairro(String bairro) {
//		this.bairro = bairro;
//	}
//	public String getCidade() {
//		return cidade;
//	}
//	public void setCidade(String cidade) {
//		this.cidade = cidade;
//	}
//	public String getEstado() {
//		return estado;
//	}
//	public void setEstado(String estado) {
//		this.estado = estado;
//	}
//	public String getCep() {
//		return cep;
//	}
//	public void setCep(String cep) {
//		this.cep = cep;
//	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
}
