/*
 * Created by JFormDesigner on Mon Dec 07 20:56:28 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net.java.dev.genesis.annotation.ViewHandler;
import net.java.dev.genesis.ui.swing.SwingBinder;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

/**
 * @author wansoul
 */
@ViewHandler
public class FiliadoPanel extends JPanel {
	SwingBinder binder;

	private static final long serialVersionUID = 1L;
	public FiliadoPanel() {
		initComponents();
	}

	public EnderecoPanel getEnderecoPanel() {
		return enderecoPanel;
	}
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		nome = new JTextField();
		label12 = new JLabel();
		cpf = new JTextField();
		label2 = new JLabel();
		dataNascimento = new JTextField();
		label3 = new JLabel();
		rg = new JTextField();
		label4 = new JLabel();
		orgaoExpedidor = new JTextField();
		enderecoPanel = new EnderecoPanel();
		label10 = new JLabel();
		telefone1 = new JTextField();
		label11 = new JLabel();
		telefone2 = new JTextField();
		label13 = new JLabel();
		scrollPane1 = new JScrollPane();
		observacoes = new JTextArea();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setName("this");
		setLayout(new FormLayout(
			"$lcgap, pref, $lcgap, 109dlu, $lcgap, 69dlu, $lcgap, 99dlu:grow, $lcgap",
			"3*($lgap, default), $lgap, fill:61dlu, $lgap, default, $lgap, 55dlu"));

		//---- label1 ----
		label1.setText("Nome:");
		label1.setName("label1");
		add(label1, cc.xy(2, 2));

		//---- nome ----
		nome.setName("nome");
		add(nome, cc.xywh(4, 2, 5, 1));

		//---- label12 ----
		label12.setText("CPF:");
		label12.setName("label12");
		add(label12, cc.xy(2, 4));

		//---- cpf ----
		cpf.setName("cpf");
		add(cpf, cc.xy(4, 4));

		//---- label2 ----
		label2.setText("Data de Nascimento:");
		label2.setName("label2");
		add(label2, cc.xy(6, 4));

		//---- dataNascimento ----
		dataNascimento.setName("dataNascimento");
		add(dataNascimento, cc.xy(8, 4));

		//---- label3 ----
		label3.setText("RG:");
		label3.setName("label3");
		add(label3, cc.xy(2, 6));

		//---- rg ----
		rg.setName("rg");
		add(rg, cc.xy(4, 6));

		//---- label4 ----
		label4.setText("\u00d3rg\u00e3o Exp.:");
		label4.setName("label4");
		add(label4, cc.xy(6, 6));

		//---- orgaoExpedidor ----
		orgaoExpedidor.setName("orgaoExpedidor");
		add(orgaoExpedidor, cc.xy(8, 6));

		//---- enderecoPanel ----
		enderecoPanel.setName("enderecoPanel");
		add(enderecoPanel, cc.xywh(1, 8, 9, 1));

		//---- label10 ----
		label10.setText("Fone 1:");
		label10.setName("label10");
		add(label10, cc.xy(2, 10));

		//---- telefone1 ----
		telefone1.setName("telefone1");
		add(telefone1, cc.xy(4, 10));

		//---- label11 ----
		label11.setText("Fone 2:");
		label11.setName("label11");
		add(label11, cc.xy(6, 10));

		//---- telefone2 ----
		telefone2.setName("telefone2");
		add(telefone2, cc.xy(8, 10));

		//---- label13 ----
		label13.setText("Observa\u00e7\u00f5es:");
		label13.setName("label13");
		add(label13, cc.xy(2, 12));

		//======== scrollPane1 ========
		{
			scrollPane1.setName("scrollPane1");

			//---- observacoes ----
			observacoes.setLineWrap(true);
			observacoes.setName("observacoes");
			scrollPane1.setViewportView(observacoes);
		}
		add(scrollPane1, cc.xywh(4, 12, 5, 1));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private JTextField nome;
	private JLabel label12;
	private JTextField cpf;
	private JLabel label2;
	private JTextField dataNascimento;
	private JLabel label3;
	private JTextField rg;
	private JLabel label4;
	private JTextField orgaoExpedidor;
	private EnderecoPanel enderecoPanel;
	private JLabel label10;
	private JTextField telefone1;
	private JLabel label11;
	private JTextField telefone2;
	private JLabel label13;
	private JScrollPane scrollPane1;
	private JTextArea observacoes;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
