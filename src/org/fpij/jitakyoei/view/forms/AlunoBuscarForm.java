package org.fpij.jitakyoei.view.forms;

import java.util.ArrayList;
import java.util.List;

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
	private CamposBuscaForm camposBuscaForm;
	private List<Aluno> alunos;

	
	public AlunoBuscarForm(AlunoBuscarPanel alunoBuscarPanel) {
		binder = new SwingBinder(alunoBuscarPanel, this);
		binder.bind();
		this.camposBuscaForm = new CamposBuscaForm(alunoBuscarPanel.getBuscaCamposPanel());
		
	}

	/*TODO
	 * Criar DataProvider
	 */
	@DataProvider(objectField="alunos",widgetName="alunos")
	public List<Aluno> buscar(){
		return getAlunos();
	}

	public List<Aluno> getAlunos() {
		return this.alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		Aluno a = new Aluno();
		System.out.println("AlunoBuscarForm.setEndereco()");
		this.alunos.add(a);
	}

}
