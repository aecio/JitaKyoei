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
	public String toString(){
		return filiado.toString();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Aluno){
			Aluno other = (Aluno) obj;
			return 	filiado.id == other.filiado.id &&
			filiado.nome.equals(other.filiado.nome);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash = 7;
		return 29 * hash +(this.filiado.getId() != null ? (int)(long)this.filiado.getId() : 0);
	}
	
	public void copyProperties(Aluno other){
		this.filiado.copyProperties(other.getFiliado());
		this.entidade = other.getEntidade();
		this.professor = other.getProfessor();
	}
}