/*
 * Created by JFormDesigner on Tue Dec 08 14:00:22 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view;

import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.layout.*;

/**
 * @author Brainrain
 */
public class AlunoPanel extends JPanel {
	public AlunoPanel() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		filiadoPanel1 = new FiliadoPanel();
		panel1 = new JPanel();
		label1 = new JLabel();
		comboBox1 = new JComboBox();
		label2 = new JLabel();
		comboBox2 = new JComboBox();
		panel2 = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setLayout(new FormLayout(
			"$lcgap, default",
			"4*($lgap, default)"));
		add(filiadoPanel1, cc.xy(2, 4));

		//======== panel1 ========
		{
			panel1.setLayout(new FormLayout(
				"42dlu, $lcgap, default:grow, $lcgap",
				"default, $lgap, default"));

			//---- label1 ----
			label1.setText("Professor:");
			panel1.add(label1, cc.xy(1, 1));
			panel1.add(comboBox1, cc.xywh(3, 1, 1, 1, CellConstraints.FILL, CellConstraints.DEFAULT));

			//---- label2 ----
			label2.setText("Entidade:");
			panel1.add(label2, cc.xy(1, 3));
			panel1.add(comboBox2, cc.xywh(3, 3, 1, 1, CellConstraints.FILL, CellConstraints.DEFAULT));
		}
		add(panel1, cc.xywh(2, 6, 1, 1, CellConstraints.FILL, CellConstraints.DEFAULT));

		//======== panel2 ========
		{
			panel2.setLayout(new FormLayout(
				"41dlu, 2*($lcgap, default)",
				"default"));

			//---- button1 ----
			button1.setText("Confirmar");
			panel2.add(button1, cc.xy(3, 1));

			//---- button2 ----
			button2.setText("Cancelar");
			panel2.add(button2, cc.xy(5, 1));
		}
		add(panel2, cc.xy(2, 8));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private FiliadoPanel filiadoPanel1;
	private JPanel panel1;
	private JLabel label1;
	private JComboBox comboBox1;
	private JLabel label2;
	private JComboBox comboBox2;
	private JPanel panel2;
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
