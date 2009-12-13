package org.fpij.jitakyoei.facade;

import org.fpij.jitakyoei.controller.AlunoBO;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.view.AppView;

public class AppFacadeImpl implements AppFacade {
	
	private AppView view;
	private AlunoBO alunoBO;
	
	public AppFacadeImpl(AppView view, AlunoBO alunoBO) {
		this.view = view;
		this.alunoBO = alunoBO;
	}

	private void reportException(Exception e){
		view.displayException(e);
	}
	
	public void createAluno(Aluno aluno) {
		try{
			alunoBO.createAluno(aluno);
		}catch (Exception e) {
			reportException(e);
		}
	}

	public void updateAluno(Aluno aluno) {
		try{
			alunoBO.updateAluno(aluno);
		}catch (Exception e) {
			reportException(e);
		}
	}

	public void searchAluno(Aluno aluno) {
		try{
			alunoBO.createAluno(aluno);
		}catch (Exception e) {
			reportException(e);
		}
	}

	public void listAlunos(Aluno aluno) {
		try{
			alunoBO.listAll();
		}catch (Exception e) {
			reportException(e);
		}
	}

}
