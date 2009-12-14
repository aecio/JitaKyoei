package org.fpij.jitakyoei.model.beans;


public class Entidade {
	String nome;
	String cnpj;
	String telefone1;
	String telefone2;
	Endereco endereco;
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Entidade){
			Entidade other = (Entidade) obj;
			return nome == other.nome;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash = 7;
		return 29 * hash +(this.nome != null ? this.nome.hashCode() : 0);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}
	public String getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString(){
		return this.nome;
	}

	public void copyProperties(Entidade entidade) {
		nome = entidade.nome;
		cnpj = entidade.cnpj;
		telefone1 = entidade.telefone1;
		telefone2 = entidade.telefone2;
		endereco = entidade.endereco;
	}
}