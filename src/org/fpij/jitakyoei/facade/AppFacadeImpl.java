package org.fpij.jitakyoei.facade;

import javax.swing.JOptionPane;

import org.fpij.jitakyoei.controller.AlunoBO;
import org.fpij.jitakyoei.controller.AlunoBOImpl;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.view.AppView;

public class AppFacadeImpl implements AppFacade {
	
	private AppView view;
	private AlunoBO alunoBO;
	
	public AppFacadeImpl(AppView view) {
		this.view = view;
		this.alunoBO = new AlunoBOImpl(view);
	}

	private void reportException(Exception e){
		view.displayException(e);
		throw new RuntimeException();
	}
	
	public void createAluno(Aluno aluno) {
		System.out.println("AppFacadeImpl.createAluno()");
		try{
			alunoBO.createAluno(aluno);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
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
