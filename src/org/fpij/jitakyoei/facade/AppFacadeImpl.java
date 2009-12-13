package org.fpij.jitakyoei.facade;

import javax.swing.JOptionPane;

import org.fpij.jitakyoei.business.AlunoBO;
import org.fpij.jitakyoei.business.AlunoBOImpl;
import org.fpij.jitakyoei.business.EntidadeBO;
import org.fpij.jitakyoei.business.EntidadeBOImpl;
import org.fpij.jitakyoei.business.ProfessorBO;
import org.fpij.jitakyoei.business.ProfessorBOImpl;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.view.AppView;

public class AppFacadeImpl implements AppFacade {
	
	private AppView view;
	private AlunoBO alunoBO;
	private ProfessorBO professorBO;
	private EntidadeBO entidadeBO;
	
	public AppFacadeImpl(AppView view) {
		this.view = view;
		this.alunoBO = new AlunoBOImpl(view);
		this.professorBO = new ProfessorBOImpl(view);
		this.entidadeBO = new EntidadeBOImpl(view);
	}

	private void reportException(Exception e){
		view.displayException(e);
		throw new RuntimeException();
	}
	
	@Override
	public void createAluno(Aluno aluno) {
		System.out.println("AppFacadeImpl.createAluno()");
		try{
			alunoBO.createAluno(aluno);
		}catch (Exception e) {
			reportException(e);
		}
	}

	@Override
	public void updateAluno(Aluno aluno) {
		try{
			alunoBO.updateAluno(aluno);
		}catch (Exception e) {
			reportException(e);
		}
	}

	@Override
	public void searchAluno(Aluno aluno) {
		try{
			alunoBO.createAluno(aluno);
		}catch (Exception e) {
			reportException(e);
		}
	}

	@Override
	public void listAlunos() {
		try{
			alunoBO.listAll();
		}catch (Exception e) {
			reportException(e);
		}
	}

	@Override
	public void createProfessor(Professor professor) {
		try{
			professorBO.createProfessor(professor);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			reportException(e);
		}		
	}

	@Override
	public void listProfessores() {
		try{
			professorBO.listAll();
		}catch (Exception e) {
			reportException(e);
		}
	}

	@Override
	public void searchProfessor(Professor professor) {
		try{
			professorBO.searchProfessor(professor);
		}catch (Exception e) {
			reportException(e);
		}
	}

	@Override
	public void updateProfessor(Professor professor) {
		try{
			professorBO.updateProfessor(professor);
		}catch (Exception e) {
			reportException(e);
		}
	}

	@Override
	public void createEntidade(Entidade entidade) {
		try{
			entidadeBO.createEntidade(entidade);
		}catch (Exception e) {
			reportException(e);
		}
	}

	@Override
	public void listEntidade() {
		try{
			entidadeBO.listAll();
		}catch (Exception e) {
			reportException(e);
		}
	}

	@Override
	public void searchEntidade(Entidade entidade) {
		try{
			entidadeBO.searchEntidade(entidade);
		}catch (Exception e) {
			reportException(e);
		}
	}

	@Override
	public void updateEntidade(Entidade entidade) {
		try{
			entidadeBO.updateEntidade(entidade);
		}catch (Exception e) {
			reportException(e);
		}
	}
}
