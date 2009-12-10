package org.fpij.jitakyoei.view.forms;

import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.view.gui.AlunoAtualizarPanel;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

@Form
public class AlunoAtualizarForm {
	private AlunoForm alunoForm;
	private SwingBinder binder;
	
	public AlunoAtualizarForm(AlunoAtualizarPanel alunoAtualizarPanel) {
		alunoForm = new AlunoForm(alunoAtualizarPanel.getAlunoPanel());
		binder = new SwingBinder(alunoAtualizarPanel, this);
		binder.bind();
	}
	
	@Action
	public void atualizar(){
		Aluno aluno = alunoForm.pegarBean();
		System.out.println(aluno.toString());		
	}
	
}
