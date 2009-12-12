package org.fpij.jitakyoei.view.forms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.DataProvider;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Endereco;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.view.gui.AlunoPanel;

@Form
public class AlunoForm {
	private FiliadoForm filiadoForm;
	private Professor professor;
//	private Entidade entidade;
//	private SwingBinder binder;
	
	public AlunoForm(AlunoPanel alunoPanel) {
		SwingBinder binder = new SwingBinder(alunoPanel, this);
		binder.bind();
		filiadoForm = new FiliadoForm(alunoPanel.getFiliadoPanel());
	}
	
	@Action
	public void teste(){
		System.out.println(filiadoForm.getNome());
	}
	
//	@DataProvider(widgetName="professor")
//	public List populaProfessor() {
//		List professores = new ArrayList();
//		professores.add(new Professor());
//		
//		return professores;
//	}

	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public Aluno pegarBean() {
		System.out.println("AlunoForm.getBean()");		

		Aluno a = new Aluno();
		a.setFiliado(filiadoForm.pegarBean());
		System.out.println("AlunoForm.getBean() depois do getBean filiadoForm");
		a.setProfessor(professor);
//		a.setEntidade(entidade);
		return a;
	}
	
}