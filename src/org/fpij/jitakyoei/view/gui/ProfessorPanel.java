/*
 * Created by JFormDesigner on Tue Dec 08 21:12:29 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import javax.swing.*;
import com.jgoodies.forms.layout.*;

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

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		filiadoPanel = new FiliadoPanel();
		panel1 = new JPanel();
		label1 = new JLabel();
		scrollPane1 = new JScrollPane();
		entidades = new JTable();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setName("this");
		setLayout(new FormLayout(
			"default:grow",
			"2*(default, $lgap), default"));

		//---- filiadoPanel ----
		filiadoPanel.setName("filiadoPanel");
		add(filiadoPanel, cc.xy(1, 1));

		//======== panel1 ========
		{
			panel1.setName("panel1");
			panel1.setLayout(new FormLayout(
				"42dlu, $lcgap, 134dlu:grow, $lcgap",
				"49dlu"));

			//---- label1 ----
			label1.setText("Entidades:");
			label1.setName("label1");
			panel1.add(label1, cc.xy(1, 1));

			//======== scrollPane1 ========
			{
				scrollPane1.setName("scrollPane1");

				//---- entidades ----
				entidades.setName("entidades");
				scrollPane1.setViewportView(entidades);
			}
			panel1.add(scrollPane1, cc.xy(3, 1));
		}
		add(panel1, cc.xy(1, 3));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private FiliadoPanel filiadoPanel;
	private JPanel panel1;
	private JLabel label1;
	private JScrollPane scrollPane1;
	private JTable entidades;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
