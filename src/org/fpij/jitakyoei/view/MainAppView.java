package org.fpij.jitakyoei.view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.util.CloseTabIcon;
import org.fpij.jitakyoei.view.gui.MainAppFrame;
@Form
public class MainAppView {
	MainAppFrame frame;
	
	public MainAppView() {
		frame = new MainAppFrame();
		new SwingBinder(frame, this).bind();
		frame.setVisible(true);
	}
	
	public void handleModelChange(){
		
	}
	
	public void displayFrame(ViewComponent alunoView, String titulo){
		JFrame f = new JFrame(titulo);
		f.getContentPane().add(alunoView.getGui());
		f.setSize(600, 350);
		f.setLocationRelativeTo(frame);
		f.setAlwaysOnTop(true);
		f.setVisible(true);
	}
	
	public void displayPanel(ViewComponent viewComponent){
		frame.getMainPanel().removeAll();
		frame.getMainPanel().add(viewComponent.getGui(), BorderLayout.CENTER);
		frame.repaint();
		frame.setVisible(true);
		frame.validate();
		System.out.println("MainAppView.display()");
	}
	
	public void displayTabPanel(ViewComponent viewComponent, String titulo){
		frame.getMainPanel().removeAll();
		frame.getTabbedPane().addTab(" "+titulo, new CloseTabIcon(), viewComponent.getGui(), titulo);
		frame.repaint();
		frame.setVisible(true);
		frame.validate();
		System.out.println("MainAppView.display()");
	}

//	Ações de Aluno
	@Action
	private void cadastrarAlunoMenuItem(){
		displayTabPanel(new AlunoCadastrarView(), "Cadastrar Aluno");
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
		displayTabPanel(new AlunoBuscarView(), "Buscar Aluno");
	}
	@Action
	public void buscarAlunoIcon(){
		buscarAlunoMenuItem();
	}
	
//	Ações de Professor
	@Action
	public void cadastrarProfessorMenuItem(){
		System.out.println("MainAppForm.cadastrarProfessorMenuItem()");
		displayTabPanel(new ProfessorCadastrarView(), "Cadastrar Professor");
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
