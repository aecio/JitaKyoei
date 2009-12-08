package org.fpij.jitakyoei.model.beans;

public class Aluno {
	Filiado filiado;
	Entidade entidade;
	Professor professor;
	
	public Filiado getFiliado() {
		return filiado;
	}
	public void setFiliado(Filiado filiado) {
		this.filiado = filiado;
	}
	public Entidade getEntidade() {
		return entidade;
	}
	public void setEntidade(Entidade entidade) {
		this.entidade = entidade;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
}
