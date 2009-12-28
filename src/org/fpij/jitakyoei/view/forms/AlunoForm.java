package org.fpij.jitakyoei.view.forms;

import java.util.List;

import javax.swing.JComboBox;

import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.model.dao.DAOImpl;
import org.fpij.jitakyoei.view.gui.AlunoPanel;

public class AlunoForm {
	private Aluno aluno;
	private AlunoPanel alunoPanel;
	private FiliadoForm filiadoForm;
	
	public AlunoForm(AlunoPanel alunoPanel) {
		init(alunoPanel, new Aluno());
	}
	
	public AlunoForm(AlunoPanel alunoPanel, Aluno aluno){
		init(alunoPanel, aluno);
		setAluno(aluno);
	}
	
	private void init(AlunoPanel alunoPanel, Aluno aluno){
		this.aluno = aluno;
		this.alunoPanel = alunoPanel;
		this.filiadoForm = new FiliadoForm(alunoPanel.getFiliadoPanel());
		populaProfessorCombo();
		populaEntidadeCombo();
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno; 
		filiadoForm.setFiliado(aluno.getFiliado());
		setProfessor(aluno.getProfessor());
		setEntidade(aluno.getEntidade());
	}
	
	public Aluno getAluno() {
		aluno.setFiliado(filiadoForm.getFiliado());
		aluno.setProfessor(getProfessor());
		aluno.setEntidade(getEntidade());
		return aluno;
	}

	public void populaProfessorCombo(){
		JComboBox professorCombo = alunoPanel.getProfessor();
		List<Professor> resultProfessores = null;
		try{
			resultProfessores  = new DAOImpl<Professor>(Professor.class).list();
		}catch (Exception e) {
			e.printStackTrace();
		}
		for (Professor p : resultProfessores) {
			professorCombo.addItem(p);
		}
		professorCombo.setSelectedItem(null);
	}
	
	public void populaEntidadeCombo(){
		JComboBox entidadeCombo = alunoPanel.getEntidade();
		List<Entidade> resultEntidades = null;	
		try{
			resultEntidades = new DAOImpl<Entidade>(Entidade.class).list();
		}catch (Exception e) {
			e.printStackTrace();
		}
		for (Entidade e : resultEntidades) {
			entidadeCombo.addItem(e);
		}
		entidadeCombo.setSelectedItem(null);
	}
	
	/* Métodos de acesso ao dados da GUI */
	public Entidade getEntidade() {
		return (Entidade) alunoPanel.getEntidade().getSelectedItem();
	}
	public Professor getProfessor() {
		return (Professor) alunoPanel.getProfessor().getSelectedItem();
	}
	
	/* Métodos modificadores dos dados dad GUI */
	public void setEntidade(Entidade entidade) {
		alunoPanel.getEntidade().setSelectedItem(entidade);
	}
	public void setProfessor(Professor professor) {
		alunoPanel.getProfessor().setSelectedItem(professor);
	}
}