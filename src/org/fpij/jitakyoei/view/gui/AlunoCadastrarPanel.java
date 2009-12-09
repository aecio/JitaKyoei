/*
 * Created by JFormDesigner on Tue Dec 08 19:48:43 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import java.awt.*;
import javax.swing.*;
import com.jgoodies.forms.layout.*;

/**
 * @author wansoul
 */
public class AlunoCadastrarPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public AlunoCadastrarPanel() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		filiadoPanel1 = new FiliadoPanel();
		panel1 = new JPanel();
		button1 = new JButton();
		button2 = new JButton();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setLayout(new FormLayout(
			"default:grow",
			"2*(default, $lgap), default"));

		//---- label1 ----
		label1.setText("Cadastro de Aluno:");
		label1.setFont(new Font("Tahoma", Font.BOLD, 18));
		add(label1, cc.xy(1, 1));
		add(filiadoPanel1, cc.xy(1, 3));

		//======== panel1 ========
		{
			panel1.setLayout(new FormLayout(
				"46dlu, 2*($lcgap, default)",
				"default"));

			//---- button1 ----
			button1.setText("Cadastrar");
			panel1.add(button1, cc.xy(3, 1));

			//---- button2 ----
			button2.setText("Cancelar");
			panel1.add(button2, cc.xy(5, 1));
		}
		add(panel1, cc.xy(1, 5));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private FiliadoPanel filiadoPanel1;
	private JPanel panel1;
	private JButton button1;
	private JButton button2;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
