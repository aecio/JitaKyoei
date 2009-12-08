/*
 * Created by JFormDesigner on Tue Dec 08 14:49:27 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view;

import javax.swing.*;
import javax.swing.border.*;
import com.jgoodies.forms.layout.*;

/**
 * @author Brainrain
 */
public class EnderecoPanel extends JPanel {
	public EnderecoPanel() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		textField1 = new JTextField();
		label2 = new JLabel();
		textField8 = new JTextField();
		label3 = new JLabel();
		textField2 = new JTextField();
		label4 = new JLabel();
		textField7 = new JTextField();
		label5 = new JLabel();
		textField5 = new JTextField();
		label6 = new JLabel();
		textField6 = new JTextField();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setBorder(new TitledBorder("Endere\u00e7o:"));
		setName("this");
		setLayout(new FormLayout(
			"40dlu, $lcgap, 109dlu, $lcgap, 33dlu, $lcgap, 26dlu, $lcgap, 96dlu",
			"2*(default, $lgap), default"));

		//---- label1 ----
		label1.setText("Rua:");
		label1.setName("label1");
		add(label1, cc.xy(1, 1));

		//---- textField1 ----
		textField1.setName("textField1");
		add(textField1, cc.xywh(3, 1, 3, 1));

		//---- label2 ----
		label2.setText("N\u00famero:");
		label2.setName("label2");
		add(label2, cc.xy(7, 1));

		//---- textField8 ----
		textField8.setName("textField8");
		add(textField8, cc.xy(9, 1));

		//---- label3 ----
		label3.setText("Bairro:");
		label3.setName("label3");
		add(label3, cc.xy(1, 3));

		//---- textField2 ----
		textField2.setName("textField2");
		add(textField2, cc.xy(3, 3));

		//---- label4 ----
		label4.setText("Cidade:");
		label4.setName("label4");
		add(label4, cc.xy(5, 3));

		//---- textField7 ----
		textField7.setName("textField7");
		add(textField7, cc.xywh(7, 3, 3, 1));

		//---- label5 ----
		label5.setText("Estado:");
		label5.setName("label5");
		add(label5, cc.xy(1, 5));

		//---- textField5 ----
		textField5.setName("textField5");
		add(textField5, cc.xy(3, 5));

		//---- label6 ----
		label6.setText("CEP:");
		label6.setName("label6");
		add(label6, cc.xy(5, 5));

		//---- textField6 ----
		textField6.setName("textField6");
		add(textField6, cc.xywh(7, 5, 3, 1));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private JTextField textField1;
	private JLabel label2;
	private JTextField textField8;
	private JLabel label3;
	private JTextField textField2;
	private JLabel label4;
	private JTextField textField7;
	private JLabel label5;
	private JTextField textField5;
	private JLabel label6;
	private JTextField textField6;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
