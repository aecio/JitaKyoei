package org.fpij.jitakyoei.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.view.forms.EntidadeForm;
import org.fpij.jitakyoei.view.gui.EntidadeAtualizarPanel;

public class EntidadeAtualizarView implements ViewComponent {

	private EntidadeAtualizarPanel gui;
	private AppFacade facade;
	private EntidadeForm entidadeForm;
	private MainAppView parent;
	
	
	public EntidadeAtualizarView(MainAppView parent, Entidade entidade) {
		this.parent = parent;
		gui = new EntidadeAtualizarPanel();
		gui.getCancelar().addActionListener(new CancelarActionHandler());
		gui.getAtualizarEntidade().addActionListener(new AtualizarActionHandler());
		entidadeForm = new EntidadeForm(gui.getEntidadePanel(), entidade);
		gui.setVisible(true);
	}

	@Override
	public JPanel getGui() {
		return gui;
	}

	@Override
	public void registerFacade(AppFacade fac) {
		this.facade = fac;
	}
	
	/**
	 * Classe interna responsável por responder aos cliques no botão "Cadastrar".
	 * 
	 * @author Aécio
	 */
	public class AtualizarActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			try {
				facade.updateEntidade(entidadeForm.getEntidade()); 
				JOptionPane.showMessageDialog(gui, "Entidade alterada com sucesso!");
				parent.removeTabPanel(gui);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * Classe interna responsável por responder aos cliques no botão "Cancelar".
	 * 
	 * @author Aécio
	 */
	public class CancelarActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			parent.removeTabPanel(gui);
		}
	}
}