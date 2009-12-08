/*
 * Created by JFormDesigner on Tue Dec 08 14:00:22 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.layout.*;
import org.fpij.jitakyoei.view.*;

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
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setLayout(new FormLayout(
			"$lcgap, default:grow",
			"default, $lgap, default"));
		add(filiadoPanel1, cc.xywh(2, 1, 1, 1, CellConstraints.FILL, CellConstraints.DEFAULT));

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
		add(panel1, cc.xywh(2, 3, 1, 1, CellConstraints.FILL, CellConstraints.DEFAULT));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private FiliadoPanel filiadoPanel1;
	private JPanel panel1;
	private JLabel label1;
	private JComboBox comboBox1;
	private JLabel label2;
	private JComboBox comboBox2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
