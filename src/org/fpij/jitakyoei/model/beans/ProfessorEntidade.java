package org.fpij.jitakyoei.model.beans;

public class ProfessorEntidade {
	Professor professor;
	Entidade entidade;
	
	public ProfessorEntidade(Professor professor, Entidade entidade) {
		super();
		this.professor = professor;
		this.entidade = entidade;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof ProfessorEntidade){
			ProfessorEntidade other = (ProfessorEntidade) obj;
			return 	professor.filiado.id == other.professor.filiado.id &&
					entidade.nome.equals(other.entidade.nome);
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return professor.hashCode()+entidade.hashCode();
	}
	
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Entidade getEntidade() {
		return entidade;
	}
	public void setEntidade(Entidade entidade) {
		this.entidade = entidade;
	}
}
