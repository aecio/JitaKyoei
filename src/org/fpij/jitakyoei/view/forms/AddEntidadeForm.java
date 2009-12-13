package org.fpij.jitakyoei.view.forms;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.DataProvider;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.view.gui.AddEntidadesPanel;

@Form
public class AddEntidadeForm {
	private AddEntidadesPanel gui;
	private Entidade entidade;
	private List<Entidade> entidadesList;
	private DefaultTableModel entidadesTableModel;
	private ProfessorForm professorForm;

	public AddEntidadeForm(ProfessorForm professorForm){
		System.out.println("AddEntidadeForm.AddEntidadeForm()");
		this.entidadesList = professorForm.getEntidadesList();
		gui = new AddEntidadesPanel();
		new SwingBinder(gui, this).bind();
		gui.setVisible(true);
		gui.setAlwaysOnTop(true);
		entidadesTableModel = (DefaultTableModel) gui.getEntidadesTable().getModel();
		this.professorForm = professorForm;
	}
	
	@Action
	public void adicionar(){
		System.out.println("AddEntidadeForm.adicionar()");
		entidadesList.add((Entidade) gui.getEntidade().getSelectedItem());

		Object[][] data = new Object[entidadesList.size()][2];
		for (int i = 0; i < entidadesList.size(); i++) {
			data[i][0] = entidadesList.get(i).getNome();
		}
		entidadesTableModel.setDataVector( data, new String[]{"Entidade"});
		professorForm.getEntidadesTableModel().setDataVector( data, new String[]{"Entidade"});
	}
	@Action
	public void retornar(){
		gui.dispose();
	}
	@DataProvider(objectField="entidade")
	public List<Entidade> populaEntidade(){
		List<Entidade> entidades = new ArrayList<Entidade>();
		Entidade e = new Entidade();
		e.setNome("Academi 1");
		e.setCnpj("916666570001");
		entidades.add(e);
		e = new Entidade();
		e.setNome("Academi 2");
		e.setCnpj("1234560001");
		entidades.add(e);
		
		return entidades;		
	}
	
	public Entidade getEntidade() {
		return entidade;
	}

	public void setEntidade(Entidade entidade) {
		this.entidade = entidade;
	}
	
	
}
