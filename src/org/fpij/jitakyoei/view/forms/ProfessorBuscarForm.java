package org.fpij.jitakyoei.view.forms;

import java.util.List;

import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.view.gui.ProfessorBuscarPanel;

@Form
public class ProfessorBuscarForm {
	private SwingBinder binder;
	private CamposBuscaForm camposBuscaForm;
	private List<Professor> professores;
	private ProfessorBuscarPanel gui;
	
	public ProfessorBuscarForm(ProfessorBuscarPanel professorBuscarPanel) {
		gui = professorBuscarPanel;
		new SwingBinder(gui, this).bind();
		this.camposBuscaForm = new CamposBuscaForm(gui.getBuscaCamposPanel());
	}
}
