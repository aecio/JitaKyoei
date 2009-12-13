package org.fpij.jitakyoei.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.util.CloseTabIcon;
import org.fpij.jitakyoei.view.gui.AlunoAtualizarPanel;
import org.fpij.jitakyoei.view.gui.MainAppFrame;
import org.fpij.jitakyoei.view.gui.ProfessorBuscarPanel;
import org.fpij.jitakyoei.view.gui.SobrePanel;

@Form
public class MainAppView implements AppView {
	MainAppFrame frame;
	private AppFacade facade;
	
	public MainAppView() {
		frame = new MainAppFrame();
		new SwingBinder(frame, this).bind();
		frame.setVisible(true);
	}
	
	@Override
	public void handleModelChange(Object obj){
		//Atualizar os panels
	}
	
	public void displayException(Exception e){
		JOptionPane.showMessageDialog(frame, e.getMessage());
	}
	
	private void displayFrame(ViewComponent alunoView, String titulo){
		JFrame f = new JFrame(titulo);
		f.getContentPane().add(alunoView.getGui());
		f.setSize(600, 350);
		f.setLocationRelativeTo(frame);
		f.setAlwaysOnTop(true);
		f.setVisible(true);
	}
	
	private void displayTabPanel(ViewComponent viewComponent, String titulo){
		viewComponent.registerFacade(this.facade);
		frame.getTabbedPane().addTab(" "+titulo+"  ", new CloseTabIcon(), viewComponent.getGui(), titulo);
		frame.getTabbedPane().setSelectedComponent(viewComponent.getGui());
		frame.repaint();
		frame.setVisible(true);
		frame.validate();
		System.out.println("MainAppView.display()");
	}
	private void displayPanel(JPanel panel, String titulo){
		frame.getTabbedPane().addTab(" "+titulo+"  ", new CloseTabIcon(), panel, titulo);
		frame.getTabbedPane().setSelectedComponent(panel);
		frame.repaint();
		frame.setVisible(true);
		frame.validate();
		System.out.println("MainAppView.display()");
	}

//	Ações de Aluno
	@Action
	public void cadastrarAlunoMenuItem(){
		displayTabPanel(new AlunoCadastrarView(), "Cadastrar Aluno");
	}
	
	@Action
	public void cadastrarAlunoIcon(){
		cadastrarAlunoMenuItem();
	}
	
	@Action
	public void alterarAlunoMenuItem(){
		System.out.println("MainAppForm.alterarAlunoMenuItem()");
		AlunoAtualizarView alunoAtualizarView = new AlunoAtualizarView();
		displayFrame(new AlunoBuscarView(alunoAtualizarView), "Buscar Aluno");
		displayTabPanel(alunoAtualizarView, "Alterar Aluno");
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
		displayTabPanel(new ProfessorAtualizarView(), "Alterar Professor");
	}
	@Action
	public void alterarProfessorIcon(){
		alterarProfessorMenuItem();
	}
	
	@Action
	public void buscarProfessorMenuItem(){
		System.out.println("MainAppForm.buscarProfessorMenuItem()");
		displayPanel(new ProfessorBuscarPanel(), "Buscar Professor");
	}
	@Action
	public void buscarProfessorIcon(){
		buscarProfessorMenuItem();
	}

//	Ações de Entidade
	@Action
	public void cadastrarEntidadeMenuItem(){
		System.out.println("MainAppForm.cadastrarEntidadeMenuItem()");
		displayTabPanel(new EntidadeCadastrarView(), "Cadastrar Entidade");
	}
	@Action
	public void cadastrarEntidadeIcon(){
		cadastrarEntidadeMenuItem();
	}
	
	@Action
	public void alterarEntidadeMenuItem(){
		System.out.println("MainAppForm.alterarEntidadeMenuItem()");
		displayTabPanel(new EntidadeAtualizarView	(), "Alterar Entidade");
	}
	
	@Action
	public void alterarEntidadeIcon(){
		System.out.println("MainAppView.alterarEntidadeIcon()");
		alterarEntidadeMenuItem();
	}
	
	@Action
	public void buscarEntidadeMenuItem(){
		System.out.println("MainAppForm.buscarEntidadeMenuItem()");
		displayTabPanel(new EntidadeBuscarView(), "Busca de Entidade");
	}
	@Action
	public void buscarEntidadeIcon(){
		buscarEntidadeMenuItem();
	}

	@Override
	public void registerFacade(AppFacade facade) {
		this.facade = facade;
	}
	
	@Action
	public void sobreMenuItem(){
		displayPanel(new SobrePanel(), "Desenvolvedores");
	}
	@Action
	public void botaoSphash(){
		sobreMenuItem();
	}
	
}
