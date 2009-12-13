/*
 * Created by JFormDesigner on Tue Dec 08 21:23:32 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.layout.*;

/**
 * @author wansoul
 */
public class ProfessorAtualizarPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public ProfessorAtualizarPanel() {
		initComponents();
	}

	public ProfessorPanel getProfessorPanel() {
		return professorPanel;
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		professorPanel = new ProfessorPanel();
		panel1 = new JPanel();
		atualizar = new JButton();
		cancelar = new JButton();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setName("this");
		setLayout(new FormLayout(
			"default:grow",
			"2*(default, $lgap), default"));

		//---- label1 ----
		label1.setText("Atualizar Professor");
		label1.setFont(new Font("Dialog", Font.BOLD, 18));
		label1.setName("label1");
		add(label1, cc.xy(1, 1));

		//---- professorPanel ----
		professorPanel.setName("professorPanel");
		add(professorPanel, cc.xy(1, 3));

		//======== panel1 ========
		{
			panel1.setName("panel1");
			panel1.setLayout(new FormLayout(
				"43dlu, 2*($lcgap, default)",
				"default"));

			//---- atualizar ----
			atualizar.setText("Atualizar");
			atualizar.setName("atualizar");
			panel1.add(atualizar, cc.xy(3, 1));

			//---- cancelar ----
			cancelar.setText("Cancelar");
			cancelar.setName("cancelar");
			panel1.add(cancelar, cc.xy(5, 1));
		}
		add(panel1, cc.xy(1, 5));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private ProfessorPanel professorPanel;
	private JPanel panel1;
	private JButton atualizar;
	private JButton cancelar;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
