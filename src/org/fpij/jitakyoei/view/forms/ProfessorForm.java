package org.fpij.jitakyoei.view.forms;

import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.view.gui.AlunoPanel;
import org.fpij.jitakyoei.view.gui.ProfessorPanel;

import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

@Form
public class ProfessorForm {
	private FiliadoForm filiadoForm;
	private Entidade entidade;
	private SwingBinder binder;
	
	
	public void ProfessorForm(ProfessorPanel professorPanel) {
		binder = new SwingBinder(professorPanel, this);
		binder.bind();
		filiadoForm = new FiliadoForm(professorPanel.getFiliadoPanel());
	}
	
	public Professor pegarBean(){
		Professor p = new Professor();
		
		p.setFiliado(filiadoForm.getFiliado());
		
		return p;
	}
	
	public Entidade getEntidade() {
		return entidade;
	}
	
	public void setEntidade(Entidade entidade) {
		this.entidade = entidade;
	}

}
