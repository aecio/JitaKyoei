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

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		filiadoPanel1 = new FiliadoPanel();
		panel1 = new JPanel();
		label1 = new JLabel();
		comboBox1 = new JComboBox();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setLayout(new FormLayout(
			"default:grow",
			"2*(default, $lgap), default"));
		add(filiadoPanel1, cc.xy(1, 1));

		//======== panel1 ========
		{
			panel1.setLayout(new FormLayout(
				"42dlu, $lcgap, 134dlu:grow, $lcgap",
				"default"));

			//---- label1 ----
			label1.setText("Entidade:");
			panel1.add(label1, cc.xy(1, 1));
			panel1.add(comboBox1, cc.xy(3, 1));
		}
		add(panel1, cc.xy(1, 3));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private FiliadoPanel filiadoPanel1;
	private JPanel panel1;
	private JLabel label1;
	private JComboBox comboBox1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
