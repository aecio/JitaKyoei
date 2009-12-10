package org.fpij.jitakyoei.view;

import java.util.List;
import javax.swing.JPanel;
import org.fpij.jitakyoei.controller.AlunoController;
import org.fpij.jitakyoei.model.beans.Professor;

public interface ProfessorView {
	
	public void registerController(AlunoController c);
	public void displayException(String message);
	public void displayResult(Professor professor);
	public void displayResult(List<Professor> searchResult); 
	public JPanel getGui();

}
