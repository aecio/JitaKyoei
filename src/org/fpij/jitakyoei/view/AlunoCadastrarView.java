package org.fpij.jitakyoei.view;

import java.util.List;

import javax.swing.JPanel;

import org.fpij.jitakyoei.controller.AlunoController;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.view.forms.AlunoCadastrarForm;
import org.fpij.jitakyoei.view.gui.AlunoCadastrarPanel;

public class AlunoCadastrarView implements AlunoView {
	AlunoController controller;
	AlunoCadastrarPanel gui;
	AlunoCadastrarForm form;
	
	public AlunoCadastrarView(){
		this.gui = new AlunoCadastrarPanel();
		this.form = new AlunoCadastrarForm(gui);
	}
	
	@Override
	public JPanel getGui(){
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
	public void registerController(AlunoController controller) {
		this.controller = controller;
	}
}
