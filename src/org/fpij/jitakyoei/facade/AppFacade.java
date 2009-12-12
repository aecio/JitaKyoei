package org.fpij.jitakyoei.facade;

import org.fpij.jitakyoei.model.beans.Aluno;

public interface AppFacade {

	public abstract void createAluno(Aluno aluno);

	public abstract void updateAluno(Aluno aluno);

	public abstract void searchAluno(Aluno aluno);

	public abstract void listAlunos(Aluno aluno);

}