package org.fpij.jitakyoei.view.forms;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JPanel;

import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.model.dao.DAOImpl;
import org.fpij.jitakyoei.view.ViewComponent;
import org.fpij.jitakyoei.view.gui.AlunoPanel;
import org.fpij.jitakyoei.view.gui.EntidadePanel;
import org.fpij.jitakyoei.view.gui.FiliadoPanel;

@Form
public class AlunoForm implements ViewComponent{
	private FiliadoForm filiadoForm;
	private Professor professor = null;
	private Entidade entidade;
	private JComboBox professorCombo;
	private JComboBox entidadeCombo;
	private AlunoPanel gui;
	private AppFacade facade;
	private List<Professor> resultProfessores;
	private List<Entidade> resultEntidades;
	private SwingBinder binder;
	private FiliadoPanel filiadoPanel;
	
	public AlunoForm(AlunoPanel alunoPanel, Aluno aluno){
		this.entidade = aluno.getEntidade();
		this.professor = aluno.getProfessor();
		this.gui = alunoPanel;
		binder = new SwingBinder(gui, this);
		binder.bind();
		
		filiadoForm = new FiliadoForm(gui.getFiliadoPanel());
		professorCombo = gui.getProfessor();
		entidadeCombo = gui.getEntidade();
		populaProfessorCombo();
		populaEntidadeCombo();
		setFiliadoPanel(gui.getFiliadoPanel());
	}
	
	public AlunoForm(AlunoPanel alunoPanel) {
		this.gui = alunoPanel;
		binder = new SwingBinder(gui, this);
		binder.bind();
		filiadoForm = new FiliadoForm(gui.getFiliadoPanel());
		professorCombo = gui.getProfessor();
		entidadeCombo = gui.getEntidade();
		populaProfessorCombo();
		populaEntidadeCombo();
	}
	
	public void popularCampos(Aluno aluno) {
		filiadoForm.popuparCampos(aluno.getFiliado());
		professorCombo.setSelectedItem(aluno.getProfessor());
		entidadeCombo.setSelectedItem(aluno.getEntidade());
	}	
	
	public FiliadoPanel getFiliadoPanel() {
		return filiadoPanel;
	}

	public void setFiliadoPanel(FiliadoPanel filiadoPanel) {
		this.filiadoPanel = filiadoPanel;
		binder.bind();
	}

	public void populaProfessorCombo(){
		try{
			resultProfessores = new ArrayList<Professor>();
			resultProfessores.addAll(new DAOImpl<Professor>(Professor.class).list());
		}catch (Exception e) {
			e.printStackTrace();
		}
		for (Professor p : resultProfessores) {
			professorCombo.addItem(p);
		}
		professorCombo.setSelectedItem(null);
	}
	
	public void populaEntidadeCombo(){
		try{
			resultEntidades = new ArrayList<Entidade>();
			resultEntidades.addAll(new DAOImpl<Entidade>(Entidade.class).list());
		}catch (Exception e) {
			e.printStackTrace();
		}
		for (Entidade e : resultEntidades) {
			entidadeCombo.addItem(e);
		}
		entidadeCombo.setSelectedItem(null);
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

	@Override
	public JPanel getGui() {
		return gui;
	}

	@Override
	public void registerFacade(AppFacade fac) {
		this.facade = fac;		
	}
	
}