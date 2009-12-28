/*
 * Created by JFormDesigner on Sun Dec 13 11:24:52 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import net.java.dev.genesis.annotation.ViewHandler;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

/**
 * @author ASantos
 */
@ViewHandler
public class EntidadeBuscarPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	public EntidadeBuscarPanel() {
		initComponents();
	}

	public JTable getTblEntidades() {
		return tblEntidades;
	}

	public JTextField getNome() {
		return nome;
	}

	public JButton getBtnBuscar() {
		return btnBuscar;
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		label2 = new JLabel();
		nome = new JTextField();
		btnBuscar = new JButton();
		scrollPane1 = new JScrollPane();
		tblEntidades = new JTable();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setName("this");
		setLayout(new FormLayout(
			"25dlu, $lcgap, default:grow",
			"3*(default, $lgap), default"));

		//---- label1 ----
		label1.setText("Busca de Entidade:");
		label1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label1.setName("label1");
		add(label1, cc.xywh(1, 1, 3, 1));

		//---- label2 ----
		label2.setText("Nome:");
		label2.setName("label2");
		add(label2, cc.xy(1, 3));

		//---- nome ----
		nome.setName("nome");
		add(nome, cc.xy(3, 3));

		//---- btnBuscar ----
		btnBuscar.setText("Buscar");
		btnBuscar.setName("btnBuscar");
		add(btnBuscar, cc.xywh(1, 5, 3, 1, CellConstraints.CENTER, CellConstraints.DEFAULT));

		//======== scrollPane1 ========
		{
			scrollPane1.setName("scrollPane1");

			//---- tblEntidades ----
			tblEntidades.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Nome", "CNPJ", "Telefone 1", "Telefone 2"
				}
			));
			tblEntidades.setCellSelectionEnabled(true);
			tblEntidades.setName("tblEntidades");
			scrollPane1.setViewportView(tblEntidades);
		}
		add(scrollPane1, cc.xywh(1, 7, 3, 1));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private JLabel label2;
	private JTextField nome;
	private JButton btnBuscar;
	private JScrollPane scrollPane1;
	private JTable tblEntidades;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
