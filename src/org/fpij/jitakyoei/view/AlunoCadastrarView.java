package org.fpij.jitakyoei.view;

import java.util.List;

import javax.swing.JPanel;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.view.forms.AlunoForm;
import org.fpij.jitakyoei.view.gui.AlunoCadastrarPanel;
@Form
public class AlunoCadastrarView implements AlunoView, ViewComponent{
	AlunoCadastrarPanel gui;
	private AlunoForm alunoForm;
	
	public AlunoCadastrarView(){
		gui = new AlunoCadastrarPanel();
		new SwingBinder(gui , this).bind();
		gui.setVisible(true);
		alunoForm = new AlunoForm(gui.getAlunoPanel());
	}
	
	@Action
	public void cadastrar() {
		/*TODO
		 * Chamar método do Facade
		 */
		Aluno aluno = alunoForm.pegarBean();
		System.out.println(aluno.toString());
	}
	
	@Override
	public JPanel getGui(){
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

}
