package org.fpij.jitakyoei.view.forms;

import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.model.beans.Endereco;
import org.fpij.jitakyoei.view.gui.EnderecoPanel;

@Form
public class EnderecoForm {
	private String rua;
	private String numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private SwingBinder binder;
	
	public EnderecoForm(EnderecoPanel enderecoPanel) {
		this.binder = new SwingBinder(enderecoPanel, this);
	}
	
	public Endereco pegarBean(){
		System.out.println("EnderecoForm.pegarBean()");
		binder.bind();
		Endereco e = new Endereco();
		e.setBairro(bairro);
		e.setCep(cep);
		e.setCidade(cidade);
		e.setEstado(estado);
		e.setNumero(numero);
		e.setRua(rua);
		return e;
	}
	
	public void limpar(){
		setRua(null);
		setNumero(null);
		setBairro(null);
		setCidade(null);
		setEstado(null);
		setCep(null);
	}
	

//	public void addDados(){
//		setRua("Rua dos Problemas");
//		setNumero("321");
//		setBairro("Confusão");
//		setCidade("Teresina");
//		setEstado("Piauí");
//		setCep("64025-100");
//	}
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
}
