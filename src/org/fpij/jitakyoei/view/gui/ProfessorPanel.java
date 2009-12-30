/*
 * Created by JFormDesigner on Tue Dec 08 21:12:29 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

/**
 * @author wansoul
 */
public class ProfessorPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public ProfessorPanel() {
		initComponents();
	}

	public FiliadoPanel getFiliadoPanel() {
		return filiadoPanel;
	}

	public JTable getEntidadesTable() {
		return entidadesTable;
	}

	public JButton getAdicionarEntidade() {
		return adicionarEntidade;
	}

	public JComboBox getEntidade() {
		return entidade;
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		filiadoPanel = new FiliadoPanel();
		panel1 = new JPanel();
		panel2 = new JPanel();
		label1 = new JLabel();
		entidade = new JComboBox();
		adicionarEntidade = new JButton();
		scrollPane1 = new JScrollPane();
		entidadesTable = new JTable();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setName("this");
		setLayout(new FormLayout(
			"475dlu:grow",
			"3*(default, $lgap), top:58dlu"));

		//---- filiadoPanel ----
		filiadoPanel.setName("filiadoPanel");
		add(filiadoPanel, cc.xy(1, 1));

		//======== panel1 ========
		{
			panel1.setName("panel1");
			panel1.setLayout(new FormLayout(
				"45dlu, 2*($lcgap), default, $lcgap, 308dlu, 134dlu:grow, $lcgap",
				"default"));

			//======== panel2 ========
			{
				panel2.setName("panel2");
				panel2.setLayout(new FormLayout(
					"45dlu:grow",
					"fill:default:grow"));

				//---- label1 ----
				label1.setText("Entidades:");
				label1.setName("label1");
				panel2.add(label1, cc.xy(1, 1));
			}
			panel1.add(panel2, cc.xy(1, 1));

			//---- entidade ----
			entidade.setName("entidade");
			panel1.add(entidade, cc.xywh(4, 1, 3, 1));

			//---- adicionarEntidade ----
			adicionarEntidade.setText("Adicionar Entidade");
			adicionarEntidade.setName("adicionarEntidade");
			panel1.add(adicionarEntidade, cc.xy(7, 1));
		}
		add(panel1, cc.xy(1, 3));

		//======== scrollPane1 ========
		{
			scrollPane1.setName("scrollPane1");

			//---- entidadesTable ----
			entidadesTable.setName("entidadesTable");
			scrollPane1.setViewportView(entidadesTable);
		}
		add(scrollPane1, cc.xywh(1, 5, 1, 3));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private FiliadoPanel filiadoPanel;
	private JPanel panel1;
	private JPanel panel2;
	private JLabel label1;
	private JComboBox entidade;
	private JButton adicionarEntidade;
	private JScrollPane scrollPane1;
	private JTable entidadesTable;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
