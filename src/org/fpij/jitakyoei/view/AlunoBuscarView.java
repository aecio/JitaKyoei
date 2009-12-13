package org.fpij.jitakyoei.view;

import java.util.List;

import javax.swing.JPanel;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.view.forms.CamposBuscaForm;
import org.fpij.jitakyoei.view.gui.AlunoBuscarPanel;
@Form
public class AlunoBuscarView implements AlunoView, ViewComponent {
	AlunoBuscarPanel gui;
	private AppFacade facade;
	private CamposBuscaForm campoBusca;
	
	public AlunoBuscarView(){
		gui = new AlunoBuscarPanel();
		new SwingBinder(gui, this).bind();
		campoBusca = new CamposBuscaForm(gui.getBuscaCamposPanel());
	}
	
	@Action
	public void buscar(){
		System.out.println("AlunoBuscarForm.buscar()");
		try{
			System.out.println(campoBusca.pegarBean());
		}catch (Exception e) {
			System.out.println("errrrrrrrrrooo");
			e.printStackTrace();
			System.out.println("errrrrrrrrrooo");
		}
	}
	
	@Override
	public JPanel getGui() {
		return gui;
	}
	
	@Override
	public void displayResult(Aluno aluno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void displayResult(List<Aluno> searchResult) {
		// TODO Auto-generated method stub
	}

	@Override
	public void registerFacade(AppFacade fac) {
		this.facade = fac;		
	}

}
