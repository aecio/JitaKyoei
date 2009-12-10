package org.fpij.jitakyoei.view.forms;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.view.gui.AlunoCadastrarPanel;

@Form
public class AlunoCadastrarForm {
	private AlunoForm alunoForm;
	private SwingBinder binder;

	public AlunoCadastrarForm(AlunoCadastrarPanel cadastroAlunoPanel) {
		alunoForm = new AlunoForm(cadastroAlunoPanel.getAlunoPanel());
		binder = new SwingBinder(cadastroAlunoPanel, this);
		binder.bind();
	}

	@Action
	public void cadastrar() {
		System.out.println("AlunoCadastrarForm.cadastrar()");
		 Aluno aluno = alunoForm.pegarBean();
		
		 System.out.println(aluno.getFiliado().getNome());
		 System.out.println(aluno.getFiliado().getEndereco().getRua());
	}
}
