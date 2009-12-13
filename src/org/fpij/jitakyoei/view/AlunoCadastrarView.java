package org.fpij.jitakyoei.view;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.view.forms.AlunoForm;
import org.fpij.jitakyoei.view.gui.AlunoCadastrarPanel;

@Form
public class AlunoCadastrarView implements AlunoView, ViewComponent {
	AlunoCadastrarPanel gui;
	private AlunoForm alunoForm;
	private AppFacade facade;

	public AlunoCadastrarView() {
		gui = new AlunoCadastrarPanel();
		new SwingBinder(gui, this).bind();
		gui.setVisible(true);
		alunoForm = new AlunoForm(gui.getAlunoPanel());
		alunoForm.registerFacade(facade);
	}

	@Action
	public void cadastrar() {
		Aluno aluno = alunoForm.pegarBean();
		try {
			System.out.println(facade);
			facade.createAluno(aluno);
//			System.out.println(aluno.toString());
			JOptionPane.showMessageDialog(gui, "Aluno cadastrado com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public JPanel getGui() {
		return gui;
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
	public void registerFacade(AppFacade fac) {
		this.facade = fac;
	}

}
