package org.fpij.jitakyoei.view;

import java.awt.Component;
import java.awt.Dialog.ModalityType;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.util.CloseTabIcon;
import org.fpij.jitakyoei.view.gui.MainAppFrame;
import org.fpij.jitakyoei.view.gui.SobrePanel;

@Form
public class MainAppView implements AppView {
	MainAppFrame frame;
	private AppFacade facade;

	public MainAppView() {
		frame = new MainAppFrame();
		new SwingBinder(frame, this).bind();
		frame.setVisible(true);
	}

	@Override
	public void handleModelChange(Object obj) {
		/**
		 * TODO: Atualizar os dados dos panels abertos
		 */
	}

	public void displayException(Exception e) {
		JOptionPane.showMessageDialog(frame, e.getMessage());
	}

	private void displayTabPanel(ViewComponent viewComponent, String titulo) {
		viewComponent.registerFacade(this.facade);
		frame.getTabbedPane().addTab(" " + titulo + "  ", new CloseTabIcon(), viewComponent.getGui(), titulo);
		frame.getTabbedPane().setSelectedComponent(viewComponent.getGui());
		frame.repaint();
		frame.setVisible(true);
		frame.validate();
	}

	private void displayPanel(JPanel panel, String titulo) {
		frame.getTabbedPane().addTab(" " + titulo + "  ", new CloseTabIcon(), panel, titulo);
		frame.getTabbedPane().setSelectedComponent(panel);
		frame.repaint();
		frame.setVisible(true);
		frame.validate();
	}
	
	public void removeTabPanel(Component viewComponent){
		frame.getTabbedPane().remove(viewComponent);
	}

	/* Ações de Aluno */
	@Action
	public void cadastrarAlunoMenuItem() {
		displayTabPanel(new AlunoCadastrarView(this), "Cadastrar Aluno");
	}

	@Action
	public void cadastrarAlunoIcon() {
		cadastrarAlunoMenuItem();
	}

	@Action
	public void alterarAlunoMenuItem() {
		try {
			JDialog dialog = new JDialog(frame);
			dialog.setTitle("Selecione o Aluno a ser Alterado");
			AlunoBuscarView buscarView = new AlunoBuscarView(AlunoBuscarView.ALTERACAO);
			buscarView.registerFacade(facade);
			dialog.getContentPane().add(buscarView.getGui());
			dialog.setModalityType(ModalityType.APPLICATION_MODAL);
			dialog.setSize(600, 450);
			dialog.setLocationRelativeTo(frame);
			dialog.setVisible(true);
			Aluno alunoSelecionado = buscarView.getSelectedAluno();
			if (alunoSelecionado != null) {
				AlunoAtualizarView atualizarView = new AlunoAtualizarView(this, alunoSelecionado);
				displayTabPanel(atualizarView, "Alterar Aluno");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Action
	public void alterarAlunoIcon() {
		alterarAlunoMenuItem();
	}

	@Action
	public void buscarAlunoMenuItem() {
		displayTabPanel(new AlunoBuscarView(), "Buscar Aluno");
	}

	@Action
	public void buscarAlunoIcon() {
		buscarAlunoMenuItem();
	}

	// Ações de Professor
	@Action
	public void cadastrarProfessorMenuItem() {
		int i = JOptionPane.showConfirmDialog(frame,
				"O professor já tem registro como aluno na FPIJ?",
				"Confirmação", JOptionPane.YES_NO_OPTION);

		if (i == JOptionPane.YES_OPTION) {
			JDialog dialog = new JDialog(frame);
			ProfessorBuscarView view = new ProfessorBuscarView();
			view.registerFacade(facade);
			dialog.getContentPane().add(view.getGui());
			dialog.setModalityType(ModalityType.APPLICATION_MODAL);
			dialog.setSize(600, 400);
			dialog.setLocationRelativeTo(frame);
			dialog.setVisible(true);
		} else {
			displayTabPanel(new ProfessorCadastrarView(this), "Cadastrar Professor");
		}
	}

	@Action
	public void cadastrarProfessorIcon() {
		cadastrarProfessorMenuItem();
	}

	@Action
	public void alterarProfessorMenuItem() {
		try {
			JDialog dialog = new JDialog(frame);
			dialog.setTitle("Selecione o Professor a ser Alterado");
			ProfessorBuscarView buscarView = new ProfessorBuscarView(ProfessorBuscarView.ALTERACAO);
			buscarView.registerFacade(facade);
			dialog.getContentPane().add(buscarView.getGui());
			dialog.setModalityType(ModalityType.APPLICATION_MODAL);
			dialog.setSize(600, 450);
			dialog.setLocationRelativeTo(frame);
			dialog.setVisible(true);
			Professor professorSelecionado = buscarView.getSelectedProfessor();
			if (professorSelecionado != null) {
				ProfessorAtualizarView atualizarView = new ProfessorAtualizarView(this, professorSelecionado);
				displayTabPanel(atualizarView, "Alterar Professor");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Action
	public void alterarProfessorIcon() {
		alterarProfessorMenuItem();
	}

	@Action
	public void buscarProfessorMenuItem() {
		displayTabPanel(new ProfessorBuscarView(), "Buscar Professor");
	}

	@Action
	public void buscarProfessorIcon() {
		buscarProfessorMenuItem();
	}

	// Ações de Entidade
	@Action
	public void cadastrarEntidadeMenuItem() {
		displayTabPanel(new EntidadeCadastrarView(this), "Cadastrar Entidade");
	}

	@Action
	public void cadastrarEntidadeIcon() {
		cadastrarEntidadeMenuItem();
	}

	@Action
	public void alterarEntidadeMenuItem() {
		JDialog dialog = new JDialog(frame);
		dialog.setTitle("Selecione a Entidade a ser alterada");
		EntidadeBuscarView buscarView = new EntidadeBuscarView(EntidadeBuscarView.ALTERACAO);
		buscarView.registerFacade(facade);
		dialog.getContentPane().add(buscarView.getGui());
		dialog.setModalityType(ModalityType.APPLICATION_MODAL);
		dialog.setSize(600, 450);
		dialog.setLocationRelativeTo(frame);
		dialog.setVisible(true);
		Entidade entidadeSelecionada = buscarView.getSelectedEntidade();
		if (entidadeSelecionada != null) {
			EntidadeAtualizarView atualizarView = new EntidadeAtualizarView(this, entidadeSelecionada);
			displayTabPanel(atualizarView, "Alterar Entidade");
		}
	}

	@Action
	public void alterarEntidadeIcon() {
		alterarEntidadeMenuItem();
	}

	@Action
	public void buscarEntidadeMenuItem() {
		displayTabPanel(new EntidadeBuscarView(), "Busca de Entidade");
	}

	@Action
	public void buscarEntidadeIcon() {
		buscarEntidadeMenuItem();
	}


	@Action
	public void sobreMenuItem() {
		displayPanel(new SobrePanel(), "Desenvolvedores");
	}

	@Action
	public void botaoSplash() {
		sobreMenuItem();
	}

	@Override
	public void registerFacade(AppFacade facade) {
		this.facade = facade;
	}
}
