package org.fpij.jitakyoei.view;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.view.forms.CamposBuscaForm;
import org.fpij.jitakyoei.view.gui.AlunoBuscarPanel;
@Form
public class AlunoBuscarView implements AlunoView, ViewComponent {
	private AlunoBuscarPanel gui;
	private AppFacade facade;
	private CamposBuscaForm campoBusca;
	private  DefaultTableModel alunoTableModel;
	private AlunoAtualizarView alunoAtualizarView;
	
	public AlunoBuscarView(){
		gui = new AlunoBuscarPanel();
		new SwingBinder(gui, this).bind();
		campoBusca = new CamposBuscaForm(gui.getBuscaCamposPanel());
		alunoTableModel = (DefaultTableModel) gui.getAlunoTable().getModel();
	}
	
	public AlunoBuscarView(AlunoAtualizarView alunoAtualizarView) {
		gui = new AlunoBuscarPanel();
		new SwingBinder(gui, this).bind();
		campoBusca = new CamposBuscaForm(gui.getBuscaCamposPanel());
		alunoTableModel = (DefaultTableModel) gui.getAlunoTable().getModel();
		this.alunoAtualizarView = alunoAtualizarView;
	}

	@Action
	public void buscar(){
		
		System.out.println("AlunoBuscarView.buscar()");
		Aluno aluno = new Aluno();
		Filiado filiado = new Filiado();
		if(campoBusca.getRegistroFpij() != null){
			filiado.setId(Long.parseLong(campoBusca.getRegistroFpij()));
		}
		if(campoBusca.getNome() != null){
			filiado.setNome(campoBusca.getNome());
		}
		Professor p = new Professor();
		p.setFiliado(filiado);
		aluno.setProfessor(p);
		aluno.setFiliado(filiado);
		List<Aluno> aList = facade.searchAluno(aluno);//new ArrayList<Aluno>();
//		aList.add(aluno);
		System.out.println("antes de Object[][] data = new Object[aList.");
		Object[][] data = new Object[aList.size()][3];
		for (int i = 0; i < aList.size(); i++) {
			data[i][0] = aList.get(i).getFiliado().getId();
			data[i][1] = aList.get(i).getFiliado().getNome();
			data[i][2] = aList.get(i).getProfessor().getFiliado().getNome();
//			data[i][0] = aList.get(i).getEntidade().getNome();
			System.out.println(aList.get(i).getFiliado().getNome());
		}
		System.out.println("antes de alunoTableModel.setDataVector( ");
		alunoTableModel.setDataVector( data, new String[]{"Resistro", "Nome", "Professor"});//, "Entidade"});
		System.out.println("depois de alunoTableModel.setDataVector( ");
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
