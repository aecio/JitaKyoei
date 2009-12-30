/*
 * Created by JFormDesigner on Mon Dec 07 20:56:28 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.toedter.calendar.JDateChooser;

/**
 * @author wansoul
 */
@SuppressWarnings("serial")
public class FiliadoPanel extends JPanel {

	public FiliadoPanel() {
		initComponents();
	}

	public EnderecoPanel getEnderecoPanel() {
		return enderecoPanel;
	}

	public JTable getFaixasTable() {
		return faixasTable;
	}

	public JDateChooser getDataEntregaDataChooser() {
		return dataEntregaDataChooser;
	}

	public JDateChooser getDataNascimentoDataChooser() {
		return dataNascimentoDataChooser;
	}

	public JTextField getNome() {
		return nome;
	}

	public JTextField getRegistroCbj() {
		return registroCbj;
	}

	public JTextField getCpf() {
		return cpf;
	}

	public JTextField getEmail() {
		return email;
	}

	public JTextField getRg() {
		return rg;
	}

	public JTextField getOrgaoExpedidor() {
		return orgaoExpedidor;
	}

	public JTextField getTelefone1() {
		return telefone1;
	}

	public JTextField getTelefone2() {
		return telefone2;
	}

	public JComboBox getCorFaixa() {
		return corFaixa;
	}

	public JButton getAdicionarFaixa() {
		return adicionarFaixa;
	}

	public JTextArea getObservacoes() {
		return observacoes;
	}
	
	@SuppressWarnings("unchecked")
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		nome = new JTextField();
		label5 = new JLabel();
		registroCbj = new JTextField();
		label12 = new JLabel();
		cpf = new JTextField();
		label6 = new JLabel();
		email = new JTextField();
		label2 = new JLabel();
		dataNascimentoDataChooser = new JDateChooser();
		label3 = new JLabel();
		rg = new JTextField();
		label4 = new JLabel();
		orgaoExpedidor = new JTextField();
		label10 = new JLabel();
		telefone1 = new JTextField();
		label11 = new JLabel();
		telefone2 = new JTextField();
		tabbedPane1 = new JTabbedPane();
		enderecoPanel = new EnderecoPanel();
		panel1 = new JPanel();
		label7 = new JLabel();
		corFaixa = new JComboBox();
		label8 = new JLabel();
		dataEntregaDataChooser = new JDateChooser();
		adicionarFaixa = new JButton();
		scrollPane2 = new JScrollPane();
		faixasTable = new JTable();
		panel2 = new JPanel();
		scrollPane1 = new JScrollPane();
		observacoes = new JTextArea();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setName("this");
		setLayout(new FormLayout(
			"$lcgap, pref, $lcgap, 109dlu:grow, $lcgap, 65dlu, $lcgap, 29dlu:grow, $lcgap, 46dlu, $lcgap, default",
			"5*($lgap, default), $lgap, 107dlu:grow"));

		//---- label1 ----
		label1.setText("Nome:");
		label1.setName("label1");
		add(label1, cc.xy(2, 2));

		//---- nome ----
		nome.setName("nome");
		add(nome, cc.xywh(4, 2, 7, 1));

		//---- label5 ----
		label5.setText("Registro CBJ:");
		label5.setName("label5");
		add(label5, cc.xy(2, 4));

		//---- registroCbj ----
		registroCbj.setName("registroCbj");
		add(registroCbj, cc.xy(4, 4));

		//---- label12 ----
		label12.setText("CPF:");
		label12.setName("label12");
		add(label12, cc.xy(6, 4));

		//---- cpf ----
		cpf.setName("cpf");
		add(cpf, cc.xywh(8, 4, 3, 1));

		//---- label6 ----
		label6.setText("E-mail");
		label6.setName("label6");
		add(label6, cc.xy(2, 6));

		//---- email ----
		email.setName("email");
		add(email, cc.xy(4, 6));

		//---- label2 ----
		label2.setText("Data de Nascimento:");
		label2.setName("label2");
		add(label2, cc.xy(6, 6));

		//---- dataNascimentoDataChooser ----
		dataNascimentoDataChooser.setName("dataNascimentoDataChooser");
		add(dataNascimentoDataChooser, cc.xywh(8, 6, 3, 1));

		//---- label3 ----
		label3.setText("RG:");
		label3.setName("label3");
		add(label3, cc.xy(2, 8));

		//---- rg ----
		rg.setName("rg");
		add(rg, cc.xy(4, 8));

		//---- label4 ----
		label4.setText("\u00d3rg\u00e3o Expedidor:");
		label4.setName("label4");
		add(label4, cc.xy(6, 8));

		//---- orgaoExpedidor ----
		orgaoExpedidor.setName("orgaoExpedidor");
		add(orgaoExpedidor, cc.xywh(8, 8, 3, 1));

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
		add(telefone2, cc.xywh(8, 10, 3, 1));

		//======== tabbedPane1 ========
		{
			tabbedPane1.setName("tabbedPane1");

			//---- enderecoPanel ----
			enderecoPanel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP));
			enderecoPanel.setName("enderecoPanel");
			tabbedPane1.addTab("Endere\u00e7o", enderecoPanel);


			//======== panel1 ========
			{
				panel1.setBorder(new TitledBorder(""));
				panel1.setName("panel1");
				panel1.setLayout(new FormLayout(
					"39dlu, $lcgap, 65dlu:grow, $lcgap, 53dlu, $lcgap, 52dlu:grow, $lcgap, 52dlu",
					"default, $lgap, fill:48dlu:grow"));

				//---- label7 ----
				label7.setText("Cor:");
				label7.setName("label7");
				panel1.add(label7, cc.xy(1, 1));

				//---- corFaixa ----
				corFaixa.setName("corFaixa");
				panel1.add(corFaixa, cc.xy(3, 1));

				//---- label8 ----
				label8.setText("Data de Entrega:");
				label8.setName("label8");
				panel1.add(label8, cc.xy(5, 1));

				//---- dataEntregaDataChooser ----
				dataEntregaDataChooser.setName("dataEntregaDataChooser");
				panel1.add(dataEntregaDataChooser, cc.xy(7, 1));

				//---- adicionarFaixa ----
				adicionarFaixa.setText("Adicionar");
				adicionarFaixa.setName("adicionarFaixa");
				panel1.add(adicionarFaixa, cc.xy(9, 1));

				//======== scrollPane2 ========
				{
					scrollPane2.setName("scrollPane2");

					//---- faixasTable ----
					faixasTable.setModel(new DefaultTableModel(
						new Object[][] {
						},
						new String[] {
							"Faixa", "Data de Entrega"
						}
					) {
						Class[] columnTypes = new Class[] {
							Object.class, Object.class
						};
						boolean[] columnEditable = new boolean[] {
							false, true
						};
						@Override
						public Class<?> getColumnClass(int columnIndex) {
							return columnTypes[columnIndex];
						}
						@Override
						public boolean isCellEditable(int rowIndex, int columnIndex) {
							return columnEditable[columnIndex];
						}
					});
					{
						TableColumnModel cm = faixasTable.getColumnModel();
						cm.getColumn(0).setResizable(false);
					}
					faixasTable.setName("faixasTable");
					scrollPane2.setViewportView(faixasTable);
				}
				panel1.add(scrollPane2, cc.xywh(1, 3, 9, 1));
			}
			tabbedPane1.addTab("Faixas", panel1);


			//======== panel2 ========
			{
				panel2.setName("panel2");
				panel2.setLayout(new BorderLayout());

				//======== scrollPane1 ========
				{
					scrollPane1.setName("scrollPane1");

					//---- observacoes ----
					observacoes.setLineWrap(true);
					observacoes.setName("observacoes");
					scrollPane1.setViewportView(observacoes);
				}
				panel2.add(scrollPane1, BorderLayout.CENTER);
			}
			tabbedPane1.addTab("observa\u00e7\u00f5es", panel2);

		}
		add(tabbedPane1, cc.xywh(2, 12, 11, 1, CellConstraints.DEFAULT, CellConstraints.FILL));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private JTextField nome;
	private JLabel label5;
	private JTextField registroCbj;
	private JLabel label12;
	private JTextField cpf;
	private JLabel label6;
	private JTextField email;
	private JLabel label2;
	private JDateChooser dataNascimentoDataChooser;
	private JLabel label3;
	private JTextField rg;
	private JLabel label4;
	private JTextField orgaoExpedidor;
	private JLabel label10;
	private JTextField telefone1;
	private JLabel label11;
	private JTextField telefone2;
	private JTabbedPane tabbedPane1;
	private EnderecoPanel enderecoPanel;
	private JPanel panel1;
	private JLabel label7;
	private JComboBox corFaixa;
	private JLabel label8;
	private JDateChooser dataEntregaDataChooser;
	private JButton adicionarFaixa;
	private JScrollPane scrollPane2;
	private JTable faixasTable;
	private JPanel panel2;
	private JScrollPane scrollPane1;
	private JTextArea observacoes;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
