package org.fpij.jitakyoei.model.beans;

import net.java.dev.genesis.annotation.Form;

@Form
public class Endereco {
	String rua;
	String numero;
	String bairro;
	String cidade;
	String estado;
	String cep;
	
	public String toString(){
		return "\nRua: "+rua+
				"\nNumero: "+numero+
				"\nBairro: "+bairro+
				"\nCidade: "+cidade+
				"\nEstado: "+estado+
				"\nCep: "+cep;
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
