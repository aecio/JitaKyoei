package org.fpij.jitakyoei.view;

import java.util.List;

import javax.swing.JPanel;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.view.forms.ProfessorForm;
import org.fpij.jitakyoei.view.gui.ProfessorCadastrarPanel;

public class ProfessorCadastrarView implements ProfessorView, ViewComponent {
	ProfessorCadastrarPanel gui;
	private ProfessorForm professorForm;
	
	public ProfessorCadastrarView(){
		gui = new ProfessorCadastrarPanel();
		new SwingBinder(gui, this).bind();
	}
	
	@Action
	public void cadastrar() {
		Professor professor = professorForm.pegarBean();
		System.out.println(professor.toString());
	}

	@Override
	public JPanel getGui() {
		return gui;
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

}
