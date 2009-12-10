/*
 * Created by JFormDesigner on Wed Dec 09 14:41:56 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import javax.swing.*;
import com.jgoodies.forms.layout.*;

/**
 * @author wansoul
 */
public class EntidadePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public EntidadePanel() {
		initComponents();

	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		textField1 = new JTextField();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setName("this");
		setLayout(new FormLayout(
			"41dlu, default:grow",
			"fill:default"));

		//---- label1 ----
		label1.setText("Entidade");
		label1.setName("label1");
		add(label1, cc.xy(1, 1));

		//---- textField1 ----
		textField1.setName("textField1");
		add(textField1, cc.xy(2, 1));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private JTextField textField1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
