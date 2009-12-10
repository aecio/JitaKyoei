package org.fpij.jitakyoei.view;

import java.util.List;
import javax.swing.JPanel;
import org.fpij.jitakyoei.controller.AlunoController;
import org.fpij.jitakyoei.controller.ProfessorController;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.view.forms.ProfessorCadastrarForm;
import org.fpij.jitakyoei.view.gui.ProfessorCadastrarPanel;

public class ProfessorCadastrarView implements ProfessorView {
	
	ProfessorController controller;
	ProfessorCadastrarPanel gui;
	ProfessorCadastrarForm form;
	
	public ProfessorCadastrarView(){
		gui = new ProfessorCadastrarPanel();
//		form = new ProfessorCadastrarForm(gui);
	}

	@Override
	public JPanel getGui() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void displayException(String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayResult(Professor professor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayResult(List<Professor> searchResult) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerController(AlunoController c) {
		// TODO Auto-generated method stub

	}

}
