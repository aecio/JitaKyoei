package org.fpij.jitakyoei.view;

import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;
import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.dao.DAOImpl;
import org.fpij.jitakyoei.view.forms.CamposBuscaForm;
import org.fpij.jitakyoei.view.gui.AlunoBuscarPanel;
@Form
public class AlunoBuscarView implements AlunoView, ViewComponent {
	private AlunoBuscarPanel gui;
	private AppFacade facade;
	private CamposBuscaForm campoBusca;
	private DefaultTableModel alunoTableModel;
	private List<Aluno> alunoList;
	private Aluno aluno;
	private SwingBinder binder;
	private Aluno selectedAluno;
	
	public AlunoBuscarView() {
		gui = new AlunoBuscarPanel();
		gui.registerView(this);
		gui.registerView(this);
		binder = new SwingBinder(gui, this);
		binder.bind();
		campoBusca = new CamposBuscaForm(gui.getBuscaCamposPanel());
		alunoTableModel = (DefaultTableModel) gui.getAlunoTable().getModel();
	}

	@Action
	public void buscar(){
		System.out.println("AlunoBuscarView.buscar()");
		Aluno aluno = new Aluno();
		Filiado filiado = new Filiado();
		if(campoBusca.getRegistroFpij() != null){
			filiado.setId(Long.parseLong(campoBusca.getRegistroFpij()));
		} else {
			filiado.setId(null);
		}
		if(campoBusca.getNome() != null){
			filiado.setNome(campoBusca.getNome());
		} else {
			filiado.setNome(null);
		}
		aluno.setFiliado(filiado);
		aluno.setProfessor(null);
		alunoList = new DAOImpl<Aluno>(Aluno.class).search(aluno);

		Object[][] data = new Object[alunoList.size()][4];
		for (int i = 0; i < alunoList.size(); i++) {
			data[i][0] = alunoList.get(i).getFiliado().getId();
			data[i][1] = alunoList.get(i).getFiliado().getNome();
			data[i][2] = alunoList.get(i).getProfessor().getFiliado().getNome();
			data[i][3] = alunoList.get(i).getEntidade().getNome();
		}
		System.out.println("antes de alunoTableModel.setDataVector( ");
		alunoTableModel.setDataVector( data, new String[]{"Resistro", "Nome", "Professor", "Entidade"});
		System.out.println("depois de alunoTableModel.setDataVector( ");
	}
	public SwingBinder getBinder() {
		return binder;
	}

	public List<Aluno> getAlunoList() {
		return alunoList;
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

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Aluno getSelectedAluno() {
		return selectedAluno;
	}

	public void setSelectedAluno(Aluno selectedAluno) {
		this.selectedAluno = selectedAluno;
	}

}
