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

//	Ações de Aluno
	@Action
	public void cadastrarAlunoMenuItem(){
		controller.handleCadastrarAlunoAction();
	}
	
	@Action
	public void cadastrarAlunoIcon(){
		cadastrarAlunoMenuItem();
	}
	
	@Action
	public void alterarAlunoMenuItem(){
		System.out.println("MainAppForm.alterarAlunoMenuItem()");
		controller.handleAtualizarAlunoAction();
	}
	@Action
	public void alterarAlunoIcon(){
		alterarAlunoMenuItem();
	}
	
	@Action
	public void buscarAlunoMenuItem(){
		System.out.println("MainAppForm.buscarAlunoMenuItem()");
		controller.handleBuscarAlunoAction();
	}
	@Action
	public void buscarAlunoIcon(){
		buscarAlunoMenuItem();
	}
	
//	Ações de Professor
	@Action
	public void cadastrarProfessorMenuItem(){
		System.out.println("MainAppForm.cadastrarProfessorMenuItem()");
	}
	@Action
	public void cadastrarProfessorIcon(){
		cadastrarProfessorMenuItem();
	}
	
	@Action
	public void alterarProfessorMenuItem(){
		System.out.println("MainAppForm.alterarProfessorMenuItem()");
	}
	@Action
	public void alterarProfessorIcon(){
		alterarProfessorMenuItem();
	}
	
	@Action
	public void buscarProfessorMenuItem(){
		System.out.println("MainAppForm.buscarProfessorMenuItem()");
	}
	@Action
	public void buscarProfessorIcon(){
		buscarProfessorMenuItem();
	}
//	Ações de Entidade
	@Action
	public void cadastrarEntidadeMenuItem(){
		System.out.println("MainAppForm.cadastrarEntidadeMenuItem()");
	}
	@Action
	public void cadastrarEntidadeIcon(){
		cadastrarEntidadeMenuItem();
	}
	
	@Action
	public void alterarEntidadeMenuItem(){
		System.out.println("MainAppForm.alterarEntidadeMenuItem()");
	}
	@Action
	public void alterarEntidadeIcon(){
		alterarEntidadeMenuItem();
	}
	
	@Action
	public void buscarEntidadeMenuItem(){
		System.out.println("MainAppForm.buscarEntidadeMenuItem()");
	}
	@Action
	public void buscarEntidadeIcon(){
		buscarEntidadeMenuItem();
	}
	
	public void registerController(MainAppController appController) {
		this.controller = appController;
	}
}
