/*
 * Created by JFormDesigner on Sun Dec 13 10:43:25 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

/**
 * @author ASantos
 */
@SuppressWarnings("serial")
public class EntidadeAtualizarPanel extends JPanel {

	public EntidadeAtualizarPanel() {
		initComponents();
	}

	public EntidadePanel getEntidadePanel() {
		return entidadePanel;
	}

	public JButton getAtualizarEntidade() {
		return atualizarEntidade;
	}

	public JButton getCancelar() {
		return cancelar;
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		entidadePanel = new EntidadePanel();
		atualizarEntidade = new JButton();
		cancelar = new JButton();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setName("this");
		setLayout(new FormLayout(
			"42dlu, $lcgap, 63dlu, $lcgap, 55dlu, $lcgap, 149dlu:grow",
			"2*(default, $lgap), default"));

		//---- label1 ----
		label1.setText("Altera\u00e7\u00e3o de Entidade:");
		label1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label1.setName("label1");
		add(label1, cc.xywh(1, 1, 7, 1));

		//---- entidadePanel ----
		entidadePanel.setName("entidadePanel");
		add(entidadePanel, cc.xywh(1, 3, 7, 1));

		//---- atualizarEntidade ----
		atualizarEntidade.setText("Atualizar");
		atualizarEntidade.setName("atualizarEntidade");
		add(atualizarEntidade, cc.xy(3, 5));

		//---- cancelar ----
		cancelar.setText("Cancelar");
		cancelar.setName("cancelar");
		add(cancelar, cc.xy(5, 5));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private EntidadePanel entidadePanel;
	private JButton atualizarEntidade;
	private JButton cancelar;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
