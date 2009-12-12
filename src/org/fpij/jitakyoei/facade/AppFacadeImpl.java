package org.fpij.jitakyoei.facade;

import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.view.AppView;

public class AppFacadeImpl implements AppFacade {
	
	private AppView view;

	private void reportException(Exception e){
		view.displayException(e);
	}
	
	public void createAluno(Aluno aluno) {
	}

	public void updateAluno(Aluno aluno) {

	}

	public void searchAluno(Aluno aluno) {

	}

	public void listAlunos(Aluno aluno) {

	}

}
