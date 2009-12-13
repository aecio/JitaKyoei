package org.fpij.jitakyoei.view;

import java.util.List;

import org.fpij.jitakyoei.model.beans.Aluno;

@Deprecated
public interface AlunoView {
	public void displayResult(Aluno aluno);
	public void displayResult(List<Aluno> searchResult); 
}
