package org.fpij.jitakyoei.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.view.gui.MainAppFrame;
@Form
public class MainAppView {
	MainAppFrame frame;
	
	public MainAppView() {
		frame = new MainAppFrame();
		new SwingBinder(frame, this).bind();
		frame.setVisible(true);
	}
	
	public void displayFrame(AlunoView alunoView, String titulo){
		JFrame jf = new JFrame(titulo);
		jf.getContentPane().add(alunoView.getGui());
		jf.setSize(600, 350);
		jf.setAlwaysOnTop(true);
		jf.setVisible(true);
		jf.setLocationRelativeTo(frame);
	}
	
	public void displayPanel(AlunoView alunoView){
		frame.getMainPanel().removeAll();
		frame.getMainPanel().add(alunoView.getGui(), BorderLayout.CENTER);
		frame.setVisible(true);
		System.out.println("MainAppView.display()");
	}

//	Ações de Aluno
	@Action
	public void cadastrarAlunoMenuItem(){
		displayPanel(new AlunoCadastrarView());
	}
	
	@Action
	public void cadastrarAlunoIcon(){
		cadastrarAlunoMenuItem();
	}
	
	@Action
	public void alterarAlunoMenuItem(){
		System.out.println("MainAppForm.alterarAlunoMenuItem()");
		displayFrame(new AlunoBuscarView(), "Buscar Aluno");
//		displayPanel(new AlunoAtualizarView());
	}
	@Action
	public void alterarAlunoIcon(){
		alterarAlunoMenuItem();
	}
	
	@Action
	public void buscarAlunoMenuItem(){
		System.out.println("MainAppForm.buscarAlunoMenuItem()");
		displayPanel(new AlunoBuscarView());
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
}
