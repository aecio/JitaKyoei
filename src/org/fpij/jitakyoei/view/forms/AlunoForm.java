package org.fpij.jitakyoei.view.forms;

import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.view.gui.AlunoPanel;

@Form
public class AlunoForm {
	private FiliadoForm filiadoForm;
	private Professor professor;
	private Entidade entidade;
	private SwingBinder binder;
	
	public AlunoForm(AlunoPanel alunoPanel) {
		binder = new SwingBinder(alunoPanel, this);
		binder.bind();
		filiadoForm = new FiliadoForm(alunoPanel.getFiliadoPanel());
	}
	

	public Aluno pegarBean() {
		System.out.println("AlunoForm.getBean()");		

		Aluno a = new Aluno();
		a.setFiliado(filiadoForm.pegarBean());
		System.out.println("AlunoForm.getBean() depois do getBean filiadoForm");
		a.setProfessor(professor);
		a.setEntidade(entidade);
		return a;
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