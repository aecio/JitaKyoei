package org.fpij.jitakyoei.view.forms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.model.dao.DAOImpl;
import org.fpij.jitakyoei.view.gui.ProfessorPanel;

public class ProfessorForm {
	private Professor professor;
	private ProfessorPanel professorPanel;
	private FiliadoForm filiadoForm;

	public ProfessorForm(ProfessorPanel professorPanel) {
		init(professorPanel, new Professor());
	}

	public ProfessorForm(ProfessorPanel professorPanel, Professor professor) {
		init(professorPanel, professor);
		setProfessor(professor);
	}

	private void init(ProfessorPanel professorPanel, Professor professor) {
		this.professor = professor;
		this.professorPanel = professorPanel;
		this.professorPanel.getAdicionarEntidade().addActionListener(
				new AdicionarEntidadeActionHandler());
		this.filiadoForm = new FiliadoForm(professorPanel.getFiliadoPanel());
		populaEntidadeCombo();
	}

	private void setProfessor(Professor professor) {
		this.professor = professor;
		filiadoForm.setFiliado(professor.getFiliado());
		setEntidadesList(professor.getEntidades());
	}

	public Professor getProfessor() {
		professor.setFiliado(filiadoForm.getFiliado());
		return professor;
	}

	public class AdicionarEntidadeActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			professor.getEntidades().add(getEntidade());
			setEntidadesList(professor.getEntidades());
		}
	}

	private void populaEntidadeCombo() {
		JComboBox entidadeCombo = professorPanel.getEntidade();
		List<Entidade> resultEntidades = new DAOImpl<Entidade>(Entidade.class).list();
		for (Entidade e : resultEntidades) {
			entidadeCombo.addItem(e);
		}
		entidadeCombo.setSelectedItem(null);
	}

	private Entidade getEntidade() {
		return (Entidade) professorPanel.getEntidade().getSelectedItem();
	}

	public List<Entidade> getEntidadesList() {
		return professor.getEntidades();
	}

	public void setEntidadesList(List<Entidade> entidadesList) {
		Object[][] data = new Object[entidadesList.size()][2];
		for (int i = 0; i < entidadesList.size(); i++) {
			data[i][0] = entidadesList.get(i).getNome();
		}
		DefaultTableModel entidadesTableModel = (DefaultTableModel) professorPanel
				.getEntidadesTable().getModel();
		entidadesTableModel.setDataVector(data, new String[] { "Entidade" });
	}
}
