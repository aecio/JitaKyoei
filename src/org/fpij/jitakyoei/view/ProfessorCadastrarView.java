package org.fpij.jitakyoei.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.model.beans.ProfessorEntidade;
import org.fpij.jitakyoei.view.forms.ProfessorForm;
import org.fpij.jitakyoei.view.gui.ProfessorCadastrarPanel;

public class ProfessorCadastrarView implements ProfessorView, ViewComponent {
	ProfessorCadastrarPanel gui;
	private ProfessorForm professorForm;
	private AppFacade facade;
	private MainAppView parent;
	
	public ProfessorCadastrarView(MainAppView parent){
		this.parent = parent;
		gui = new ProfessorCadastrarPanel();
		new SwingBinder(gui, this).bind();
		gui.setVisible(true);
		professorForm = new ProfessorForm(gui.getProfessorPanel());
	}
	
	@Action
	public void cadastrar() {
		try{
			
		
			Professor professor = professorForm.pegarBean();
			List<Entidade> entidades = professorForm.getEntidadesList();
			
			List<ProfessorEntidade> relacionamentos = new ArrayList<ProfessorEntidade>();
			for (Entidade entidade : entidades) {
				relacionamentos.add(new ProfessorEntidade(professor, entidade));
			}
			
			facade.createProfessor(professor);
			facade.createProfessorEntidade(relacionamentos);
		
			JOptionPane.showMessageDialog(gui, "Professor cadastrado com sucesso!");
			
			parent.removeTabPanel(gui);			
		}catch (Exception e) {
		}
		
	}
	
	@Action
	public void cancelar(){
		parent.removeTabPanel(gui);
	}

	@Override
	public JPanel getGui() {
		return gui;
	}
	
	@Override
	public void displayException(String message) {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayResult(Professor professor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayResult(List<Professor> searchResult) {
		// TODO Auto-generated method stub

	}

	@Override
	public void registerFacade(AppFacade fac) {
		this.facade = fac;
	}

}
