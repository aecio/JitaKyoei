package org.fpij.jitakyoei.view.forms;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.view.gui.AlunoAtualizarPanel;
import org.fpij.jitakyoei.view.gui.AlunoBuscarPanel;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.DataProvider;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

@Form
public class AlunoBuscarForm {
	private SwingBinder binder;
//	private CamposBuscaForm camposBuscaForm;
	private Aluno aluno;
	private AlunoBuscarPanel alunoBPanel;

	
	public AlunoBuscarForm(AlunoBuscarPanel alunoBuscarPanel) {
		this.alunoBPanel = alunoBuscarPanel;
		try{
			binder = new SwingBinder(alunoBPanel, this);
			binder.bind();
		} catch(Exception e){
			System.out.println("\nErrroooooo");
			e.printStackTrace();
			System.out.println("\nErrroooooo\n");
		}
		
//		this.camposBuscaForm = new CamposBuscaForm(alunoBuscarPanel.getBuscaCamposPanel());
	}

	/*TODO
	 * Criar DataProvider
	 */
	@DataProvider(objectField = "aluno")
	public List populaAluno(){
		List a = new ArrayList();
		
		a.add(new Aluno());
		
		return a;
	}
	
	@Action
	public void buscar(){
		System.out.println("AlunoBuscarForm.buscar()");
//		System.out.println(camposBuscaForm.getNome());
//		System.out.println(camposBuscaForm.getRegistroFpij());
		alunoBPanel.add(new JButton("Botão01"));
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	

}
