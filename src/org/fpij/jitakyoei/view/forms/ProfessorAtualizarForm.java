package org.fpij.jitakyoei.view.forms;

import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.view.gui.ProfessorAtualizarPanel;
import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

@Form
public class ProfessorAtualizarForm {
	private ProfessorForm professorForm;
	private SwingBinder binder;

	public ProfessorAtualizarForm(ProfessorAtualizarPanel professorAtualizarPanel) {
		professorForm = new ProfessorForm(professorAtualizarPanel.getProfessorPanel());
		binder = new SwingBinder(professorAtualizarPanel, this);
		binder.bind();
	}
	
	@Action
	public void cadastrar() {
		Professor professor = professorForm.pegarBean();
		System.out.println(professor.toString());
	}
}
