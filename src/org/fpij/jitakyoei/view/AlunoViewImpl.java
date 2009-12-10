package org.fpij.jitakyoei.view;

import java.util.List;

import org.fpij.jitakyoei.controller.AlunoController;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.view.forms.AlunoCadastrarForm;
import org.fpij.jitakyoei.view.gui.AlunoCadastrarPanel;

public class AlunoViewImpl implements AlunoView {
	AlunoController controller;
	AlunoCadastrarPanel gui;
	AlunoCadastrarForm form;
	
	public AlunoViewImpl() {
		gui = new AlunoCadastrarPanel();
		form = new AlunoCadastrarForm(gui);
	}

	public AlunoCadastrarPanel getGui(){
		return gui;
	}
	
	@Override
	public void displayException(String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayResult(Aluno aluno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayResult(List<Aluno> searchResult) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerController(AlunoController c) {
		// TODO Auto-generated method stub

	}

}
