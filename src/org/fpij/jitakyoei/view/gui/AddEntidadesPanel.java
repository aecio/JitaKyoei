/*
 * Created by JFormDesigner on Sun Dec 13 05:26:08 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.jgoodies.forms.layout.*;

/**
 * @author wansoul
 */
public class AddEntidadesPanel extends JFrame {

	private static final long serialVersionUID = 1L;
	public AddEntidadesPanel() {
		initComponents();
	}

	public JComboBox getEntidade() {
		return entidade;
	}

	public JTable getEntidadesTable() {
		return entidadesTable;
	}

	private void entidadesTableKeyReleased(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_DELETE){
			System.out.println(this.getEntidadesTable().getSelectedRow());
		}
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label2 = new JLabel();
		label1 = new JLabel();
		entidade = new JComboBox();
		adicionar = new JButton();
		scrollPane1 = new JScrollPane();
		entidadesTable = new JTable();
		retornar = new JButton();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setTitle("Adicionar Entidades");
		setName("this");
		Container contentPane = getContentPane();
		contentPane.setLayout(new FormLayout(
			"56dlu, $lcgap, 138dlu:grow, $lcgap, 63dlu",
			"3*(default, $lgap), default"));

		//---- label2 ----
		label2.setText("Adicionar Entidades");
		label2.setFont(new Font("Dialog", Font.BOLD, 18));
		label2.setName("label2");
		contentPane.add(label2, cc.xywh(1, 1, 3, 1));

		//---- label1 ----
		label1.setText("Entidades:");
		label1.setName("label1");
		contentPane.add(label1, cc.xy(1, 3));

		//---- entidade ----
		entidade.setName("entidade");
		contentPane.add(entidade, cc.xy(3, 3));

		//---- adicionar ----
		adicionar.setText("Adicionar");
		adicionar.setName("adicionar");
		contentPane.add(adicionar, cc.xy(5, 3));

		//======== scrollPane1 ========
		{
			scrollPane1.setName("scrollPane1");

			//---- entidadesTable ----
			entidadesTable.setName("entidadesTable");
			entidadesTable.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					entidadesTableKeyReleased(e);
				}
			});
			scrollPane1.setViewportView(entidadesTable);
		}
		contentPane.add(scrollPane1, cc.xywh(1, 5, 5, 1));

		//---- retornar ----
		retornar.setText("Retornar");
		retornar.setName("retornar");
		contentPane.add(retornar, cc.xy(3, 7));
		setSize(545, 340);
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label2;
	private JLabel label1;
	private JComboBox entidade;
	private JButton adicionar;
	private JScrollPane scrollPane1;
	private JTable entidadesTable;
	private JButton retornar;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
