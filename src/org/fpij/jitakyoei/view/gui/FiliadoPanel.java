/*
 * Created by JFormDesigner on Mon Dec 07 20:56:28 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jgoodies.forms.layout.*;
import org.fpij.jitakyoei.view.*;

/**
 * @author Brainrain
 */
public class FiliadoPanel extends JPanel {
	public FiliadoPanel() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		textField1 = new JTextField();
		label12 = new JLabel();
		textField2 = new JTextField();
		label2 = new JLabel();
		textField12 = new JTextField();
		label3 = new JLabel();
		textField3 = new JTextField();
		label4 = new JLabel();
		textField4 = new JTextField();
		enderecoPanel1 = new EnderecoPanel();
		label10 = new JLabel();
		textField10 = new JTextField();
		label11 = new JLabel();
		textField11 = new JTextField();
		label13 = new JLabel();
		scrollPane1 = new JScrollPane();
		textArea1 = new JTextArea();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setLayout(new FormLayout(
			"$lcgap, pref, $lcgap, 109dlu, $lcgap, 69dlu, $lcgap, 99dlu:grow, $lcgap",
			"3*($lgap, default), $lgap, fill:61dlu, $lgap, default, $lgap, 61dlu"));

		//---- label1 ----
		label1.setText("Nome:");
		add(label1, cc.xy(2, 2));
		add(textField1, cc.xywh(4, 2, 5, 1));

		//---- label12 ----
		label12.setText("CPF:");
		add(label12, cc.xy(2, 4));
		add(textField2, cc.xy(4, 4));

		//---- label2 ----
		label2.setText("Data de Nascimento:");
		add(label2, cc.xy(6, 4));
		add(textField12, cc.xy(8, 4));

		//---- label3 ----
		label3.setText("RG:");
		add(label3, cc.xy(2, 6));
		add(textField3, cc.xy(4, 6));

		//---- label4 ----
		label4.setText("\u00d3rg\u00e3o Exp.:");
		add(label4, cc.xy(6, 6));
		add(textField4, cc.xy(8, 6));
		add(enderecoPanel1, cc.xywh(1, 8, 9, 1));

		//---- label10 ----
		label10.setText("Fone 1:");
		add(label10, cc.xy(2, 10));
		add(textField10, cc.xy(4, 10));

		//---- label11 ----
		label11.setText("Fone 2:");
		add(label11, cc.xy(6, 10));
		add(textField11, cc.xy(8, 10));

		//---- label13 ----
		label13.setText("Observa\u00e7\u00f5es:");
		add(label13, cc.xy(2, 12));

		//======== scrollPane1 ========
		{

			//---- textArea1 ----
			textArea1.setLineWrap(true);
			scrollPane1.setViewportView(textArea1);
		}
		add(scrollPane1, cc.xywh(4, 12, 5, 1));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private JTextField textField1;
	private JLabel label12;
	private JTextField textField2;
	private JLabel label2;
	private JTextField textField12;
	private JLabel label3;
	private JTextField textField3;
	private JLabel label4;
	private JTextField textField4;
	private EnderecoPanel enderecoPanel1;
	private JLabel label10;
	private JTextField textField10;
	private JLabel label11;
	private JTextField textField11;
	private JLabel label13;
	private JScrollPane scrollPane1;
	private JTextArea textArea1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
