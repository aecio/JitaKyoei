package org.fpij.jitakyoei.view;

import java.util.List;

import org.fpij.jitakyoei.controller.AlunoController;
import org.fpij.jitakyoei.model.beans.Aluno;

public interface AlunoView {
	public void registerController(AlunoController c);
	public void displayException(String message);
	public void displayResult(Aluno aluno);
	public void displayResult(List<Aluno> searchResult); 
}
