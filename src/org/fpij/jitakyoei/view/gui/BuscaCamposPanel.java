/*
 * Created by JFormDesigner on Tue Dec 08 21:37:20 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import net.java.dev.genesis.annotation.ViewHandler;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

/**
 * @author wansoul
 */
@ViewHandler
public class BuscaCamposPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public BuscaCamposPanel() {
		initComponents();
	}

	public JTextField getRegistroFpij() {
		return registroFpij;
	}

	public JTextField getNome() {
		return nome;
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label2 = new JLabel();
		registroFpij = new JTextField();
		label1 = new JLabel();
		nome = new JTextField();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setName("this");
		setLayout(new FormLayout(
			"48dlu, $lcgap, default:grow",
			"default, $lgap, default"));

		//---- label2 ----
		label2.setText("Registro FPIJ:");
		label2.setName("label2");
		add(label2, cc.xy(1, 1));

		//---- registroFpij ----
		registroFpij.setName("registroFpij");
		add(registroFpij, cc.xy(3, 1));

		//---- label1 ----
		label1.setText("Nome:");
		label1.setName("label1");
		add(label1, cc.xy(1, 3));

		//---- nome ----
		nome.setName("nome");
		add(nome, cc.xy(3, 3));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label2;
	private JTextField registroFpij;
	private JLabel label1;
	private JTextField nome;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
