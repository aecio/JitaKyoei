package org.fpij.jitakyoei.model.beans;

import java.util.Date;
import java.util.Set;

public class Filiado {
	Long id;
	String nome;
	String registroCbj;
	Date dataNascimento;
	Date dataCadastro;
	Endereco endereco;
	String telefone1;
	String telefone2;
	String email;
	Rg rg;
	String cpf;
	Date ultimaAnuidade;
	Set<Faixa> faixas;
	
	public String toString(){
		String filiado = "Nome: "+nome+
						"\nRegistroCbj: "+registroCbj+
						"\nDataNasc: "+dataNascimento+
						"\nE-mail: "+email+
						"\nCPF: "+cpf+
						endereco.toString();
		return filiado;
		
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
	public Date getUltimaAnuidade() {
		return ultimaAnuidade;
	}
	public void setUltimaAnuidade(Date ultimaAnuidade) {
		this.ultimaAnuidade = ultimaAnuidade;
	}
	public Set<Faixa> getFaixas() {
		return faixas;
	}
	public void setFaixas(Set<Faixa> faixas) {
		this.faixas = faixas;
	}
}
