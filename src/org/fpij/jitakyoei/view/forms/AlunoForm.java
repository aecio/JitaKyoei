package org.fpij.jitakyoei.view.forms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import net.java.dev.genesis.annotation.DataProvider;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Endereco;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.view.gui.AlunoPanel;

@Form
public class AlunoForm {
	private FiliadoForm filiadoForm;
	private Professor professor;
	private Entidade entidade;
	private SwingBinder binder;
	List<Entidade> entidades;
	
	
	public AlunoForm(AlunoPanel alunoPanel) {
		binder = new SwingBinder(alunoPanel, this);
		binder.bind();
		filiadoForm = new FiliadoForm(alunoPanel.getFiliadoPanel());
	}
	

	public Aluno pegarBean() {
		System.out.println("AlunoForm.getBean()");		

		Aluno a = new Aluno();
		a.setFiliado(filiadoForm.pegarBean());
		System.out.println("AlunoForm.getBean() depois do getBean filiadoForm");
//		a.setProfessor(professor);
		a.setEntidade(entidade);
		return a;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
//	@DataProvider(objectField="entidades")
//	public List<Entidade> entidades(){
//		entidades = new ArrayList<Entidade>();
//		Endereco end = new Endereco();
//		end.setBairro("PP");
//		end.setCep("64025");
//		
//		Entidade e = new Entidade();
//		e.setEndereco(end);
//		e.setNome("Nome");
//		e.setTelefone1("3232");
//		e.setTelefone2("323232");
//		
//		entidades.add(e);
//		
//		return entidades;
//	}
	
	public Entidade getEntidade() {
		return entidade;
	}
	
	public void setEntidade(Entidade entidade) {
		this.entidade = entidade;
	}
}