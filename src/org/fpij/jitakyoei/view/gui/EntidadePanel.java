/*
 * Created by JFormDesigner on Wed Dec 09 14:41:56 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

/**
 * @author wansoul
 */
public class EntidadePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public EntidadePanel() {
		initComponents();
	}

	public EnderecoPanel getEnderecoPanel() {
		return enderecoPanel;
	}

	public JTextField getNome() {
		return nome;
	}

	public JTextField getCnpj() {
		return cnpj;
	}

	public JTextField getTelefone1() {
		return telefone1;
	}

	public JTextField getTelefone2() {
		return telefone2;
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		nome = new JTextField();
		label2 = new JLabel();
		cnpj = new JTextField();
		label3 = new JLabel();
		telefone1 = new JTextField();
		label4 = new JLabel();
		telefone2 = new JTextField();
		enderecoPanel = new EnderecoPanel();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setName("this");
		setLayout(new FormLayout(
			"41dlu, $rgap, 116dlu:grow, $rgap, 44dlu, $lcgap, 129dlu:grow",
			"fill:default, 3*($lgap, default)"));

		//---- label1 ----
		label1.setText("Entidade:");
		label1.setName("label1");
		add(label1, cc.xy(1, 1));

		//---- nome ----
		nome.setName("nome");
		add(nome, cc.xywh(3, 1, 5, 1));

		//---- label2 ----
		label2.setText("CNPJ:");
		label2.setName("label2");
		add(label2, cc.xy(1, 3));

		//---- cnpj ----
		cnpj.setName("cnpj");
		add(cnpj, cc.xywh(3, 3, 5, 1));

		//---- label3 ----
		label3.setText("Telefone 1:");
		label3.setName("label3");
		add(label3, cc.xy(1, 5));

		//---- telefone1 ----
		telefone1.setName("telefone1");
		add(telefone1, cc.xy(3, 5));

		//---- label4 ----
		label4.setText("Telefone 2:");
		label4.setName("label4");
		add(label4, cc.xy(5, 5));

		//---- telefone2 ----
		telefone2.setName("telefone2");
		add(telefone2, cc.xy(7, 5));

		//---- enderecoPanel ----
		enderecoPanel.setName("enderecoPanel");
		add(enderecoPanel, cc.xywh(1, 7, 7, 1));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private JTextField nome;
	private JLabel label2;
	private JTextField cnpj;
	private JLabel label3;
	private JTextField telefone1;
	private JLabel label4;
	private JTextField telefone2;
	private EnderecoPanel enderecoPanel;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
