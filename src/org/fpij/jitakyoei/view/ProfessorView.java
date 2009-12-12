package org.fpij.jitakyoei.view;

import java.util.List;

import org.fpij.jitakyoei.model.beans.Professor;

public interface ProfessorView {
	
	public void displayException(String message);
	public void displayResult(Professor professor);
	public void displayResult(List<Professor> searchResult); 

}
