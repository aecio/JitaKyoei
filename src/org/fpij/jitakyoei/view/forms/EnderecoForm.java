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
		binder = new SwingBinder(enderecoPanel, this);
		binder.bind();
	}
	
	public Endereco pegarBean(){
		System.out.println("EnderecoForm.pegarBean()");
		Endereco e = new Endereco();
		e.setRua(rua);
		e.setNumero(numero);
		e.setBairro(bairro);
		e.setCidade(cidade);
		e.setEstado(estado);
		e.setCep(cep);
		return e;
	}
	
	public void limpar(){
		rua = null;
		numero = null;
		bairro = null;
		cidade = null;
		estado = null;
		cep = null;
		binder.bind();
	}

	public void popularCampos(Endereco endereco) {
		rua = endereco.getRua();
		numero = endereco.getNumero();
		bairro = endereco.getBairro();
		cidade = endereco.getCidade();
		estado = endereco.getEstado();
		cep = endereco.getCep();
		binder.bind();
	}

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
