package org.fpij.jitakyoei.view.forms;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.controller.MainAppController;
import org.fpij.jitakyoei.view.gui.MainAppFrame;

@Form
public class MainAppForm {
	
	private MainAppController controller;

	public MainAppForm(MainAppFrame mainFrame) {
		SwingBinder binder = new SwingBinder(mainFrame, this);
		binder.bind();
	}

	@Action
	public void cadastrarAlunoMenuItem(){
		controller.handleCadastrarAlunoAction();
	}

	public void registerController(MainAppController appController) {
		this.controller = appController;
	}
}
