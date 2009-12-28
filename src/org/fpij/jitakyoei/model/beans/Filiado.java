package org.fpij.jitakyoei.model.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Filiado {
	Long id;
	String nome;
	String registroCbj;
	Date dataNascimento;
	Date dataCadastro;
	String telefone1;
	String telefone2;
	String email;
	String cpf;
	String observacoes;
	Rg rg = new Rg();
	Endereco endereco = new Endereco();
	List<Faixa> faixas = new ArrayList<Faixa>();
	
	public String toString(){
		String filiado = "Nome: "+nome+
						"\nRegistroCbj: "+registroCbj+
						"\nDataNasc: "+dataNascimento+
						"\nE-mail: "+email+
						"\nCPF: "+cpf;
		return filiado;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Filiado){
			Filiado other = (Filiado) obj;
			return 	id == other.id &&
					nome.equals(other.nome);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return (int)(long) id;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegistroCbj() {
		return registroCbj;
	}
	public void setRegistroCbj(String registroCbj) {
		this.registroCbj = registroCbj;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Rg getRg() {
		return rg;
	}
	public void setRg(Rg rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public List<Faixa> getFaixas() {
		return faixas;
	}
	public void setFaixas(List<Faixa> faixas) {
		this.faixas = faixas;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public void copyProperties(Filiado f) {
		id = f.id;
		nome = f.nome;
		registroCbj = f.registroCbj;
		dataNascimento = f.dataNascimento;
		dataCadastro = f.dataCadastro;
		endereco = f.endereco;
		telefone1 = f.telefone1;
		telefone2 = f.telefone2;
		email = f.email;
		rg = f.rg;
		cpf = f.cpf;
		observacoes = f.observacoes;
		faixas.clear();
		faixas.addAll(f.faixas);
	}
}
