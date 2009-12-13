package org.fpij.jitakyoei.view;

import java.util.List;

import javax.swing.JPanel;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.view.forms.CamposBuscaForm;
import org.fpij.jitakyoei.view.gui.ProfessorBuscarPanel;
@Form
public class ProfessorBuscarView implements ProfessorView, ViewComponent{
	private ProfessorBuscarPanel gui;
	private AppFacade facade;
	private CamposBuscaForm campoBusca;
	
	public ProfessorBuscarView() {
		gui = new ProfessorBuscarPanel();
		new SwingBinder(gui, this).bind();
		campoBusca = new CamposBuscaForm(gui.getBuscaCamposPanel());
	}
	
	@Action
	public void buscar(){
		System.out.println("ProfessoroBuscarForm.buscar()");
		System.out.println(campoBusca.getNome());
		/*TODO
		 * Implementar busca
		 */
	}
	
	@Override
	public JPanel getGui() {
		return gui;
	}

	@Override
	public void registerFacade(AppFacade fac) {
		this.facade = fac;
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
}
