package org.fpij.jitakyoei.view.forms;

import java.util.List;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.view.gui.ProfessorBuscarPanel;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

@Form
public class ProfessorBuscarForm {
	private SwingBinder binder;
	private CamposBuscaForm camposBuscaForm;
	private List<Professor> professores;
	
	public ProfessorBuscarForm(ProfessorBuscarPanel professorBuscarPanel) {
		binder = new SwingBinder(professorBuscarPanel, this);
		binder.bind();
		this.camposBuscaForm = new CamposBuscaForm(professorBuscarPanel.getBuscaCamposPanel());
		
	}
}
