package org.fpij.jitakyoei.view.forms;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.view.gui.ProfessorPanel;

@Form
public class ProfessorForm {
	private FiliadoForm filiadoForm;
	private Entidade entidade;
	private SwingBinder binder;
	private DefaultTableModel entidadesTableModel;
	private List<Entidade> entidadesList;
	
	
	public ProfessorForm(ProfessorPanel professorPanel) {
		binder = new SwingBinder(professorPanel, this);
		binder.bind();
		filiadoForm = new FiliadoForm(professorPanel.getFiliadoPanel());
		entidadesTableModel = (DefaultTableModel) professorPanel.getEntidadesTable().getModel();
		entidadesList = new ArrayList<Entidade>();
	}
	
	@Action
	public void adicionarEntidade(){
		System.out.println("ProfessorForm.adicionar()");
		new AddEntidadeForm(this);
	}
	
	public Professor pegarBean(){
		Professor p = new Professor();
		p.setFiliado(filiadoForm.pegarBean());
		return p;
	}
	
	public Entidade getEntidade() {
		return entidade;
	}
	
	public void setEntidade(Entidade entidade) {
		this.entidade = entidade;
	}

	public List<Entidade> getEntidadesList() {
		return entidadesList;
	}

	public void setEntidadesList(List<Entidade> entidadesList) {
		this.entidadesList = entidadesList;
	}

	public DefaultTableModel getEntidadesTableModel() {
		return entidadesTableModel;
	}

	public void setEntidadesTableModel(DefaultTableModel entidadesTableModel) {
		this.entidadesTableModel = entidadesTableModel;
	}
	
}
