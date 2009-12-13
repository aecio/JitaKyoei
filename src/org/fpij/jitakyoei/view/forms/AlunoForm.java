package org.fpij.jitakyoei.view.forms;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.DataProvider;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.model.dao.DAO;
import org.fpij.jitakyoei.model.dao.DAOImpl;
import org.fpij.jitakyoei.view.gui.AlunoPanel;

@Form
public class AlunoForm {
	private FiliadoForm filiadoForm;
	private Professor professor;
	private JComboBox professorCombo;
	private Entidade entidade;
	private JComboBox entidadeCombo;
	
	public AlunoForm(AlunoPanel alunoPanel) {
		SwingBinder binder = new SwingBinder(alunoPanel, this);
		binder.bind();
		filiadoForm = new FiliadoForm(alunoPanel.getFiliadoPanel());
		professorCombo = alunoPanel.getProfessor();
		entidadeCombo = new AlunoPanel().getEntidade();
	}
	
	@Action
	public void teste(){
		System.out.println(filiadoForm.getNome());
	}
	
	@DataProvider(objectField = "professor")
	public List<Professor> populaProfessor() {
		/*TODO
		 * Pegar dados do banco
		 */
		DAO<Professor> dao = new DAOImpl<Professor>(Professor.class);		
		return dao.list();
	}
	
	@DataProvider(objectField = "entidade")
	public List<Entidade> populaEntidade() {
		/*TODO
		 * Pegar dados do banco
		 */
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
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	public Aluno pegarBean() {
		System.out.println("AlunoForm.getBean()");		

		Aluno a = new Aluno();
		a.setFiliado(filiadoForm.pegarBean());
		System.out.println("AlunoForm.getBean() depois do getBean filiadoForm");
		a.setProfessor((Professor) professorCombo.getSelectedItem());
		a.setEntidade((Entidade) entidadeCombo.getSelectedItem());
		System.out.println(a.getProfessor() +" - "+a.getEntidade());
		return a;
	}
	
}