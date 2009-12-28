/*
 * Created by JFormDesigner on Tue Dec 08 21:33:28 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.view.AlunoBuscarView;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

/**
 * @author wansoul
 */
public class AlunoBuscarPanel extends JPanel {
	
	private AlunoBuscarView view;
	
	private static final long serialVersionUID = 1L;
	public AlunoBuscarPanel() {
		initComponents();
	}
	
	public void registerView(AlunoBuscarView alunoBuscarView){
		this.view = alunoBuscarView;
	}
	
	public AlunoBuscarView getView(){
		return this.view;
	}

	public BuscaCamposPanel getBuscaCamposPanel() {
		return buscaCamposPanel;
	}

	public JScrollPane getScrollPane1() {
		return scrollPane1;
	}

	public JTable getAlunoTable() {
		return alunoTable;
	}
	
	public void refresh(){
		this.repaint();
		this.validate();
	}

	private void alunoTableMouseReleased(MouseEvent e) {
		if(view.MODO == AlunoBuscarView.ALTERACAO){
			Aluno callback = view.getAlunoList().get(this.getAlunoTable().getSelectedRow());
			view.setSelectedAluno(callback);
			this.getParent().getParent().getParent().getParent().setVisible(false);
		}
	}

	public JButton getBuscar() {
		return buscar;
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		buscaCamposPanel = new BuscaCamposPanel();
		panel1 = new JPanel();
		buscar = new JButton();
		scrollPane1 = new JScrollPane();
		alunoTable = new JTable();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setName("this");
		setLayout(new FormLayout(
			"default:grow",
			"3*(default, $lgap), top:default:grow"));

		//---- label1 ----
		label1.setText("Buscar Aluno");
		label1.setFont(new Font("Dialog", Font.BOLD, 18));
		label1.setName("label1");
		add(label1, cc.xy(1, 1));

		//---- buscaCamposPanel ----
		buscaCamposPanel.setName("buscaCamposPanel");
		add(buscaCamposPanel, cc.xy(1, 3));

		//======== panel1 ========
		{
			panel1.setName("panel1");
			panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));

			//---- buscar ----
			buscar.setText("Buscar");
			buscar.setName("buscar");
			panel1.add(buscar);
		}
		add(panel1, cc.xy(1, 5));

		//======== scrollPane1 ========
		{
			scrollPane1.setName("scrollPane1");

			//---- alunoTable ----
			alunoTable.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
					"Regisro", "Nome", "Professor", "Entidade"
				}
			));
			{
				TableColumnModel cm = alunoTable.getColumnModel();
				cm.getColumn(0).setMaxWidth(70);
				cm.getColumn(0).setPreferredWidth(70);
			}
			alunoTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
			alunoTable.setName("alunoTable");
			alunoTable.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseReleased(MouseEvent e) {
					alunoTableMouseReleased(e);
				}
			});
			scrollPane1.setViewportView(alunoTable);
		}
		add(scrollPane1, cc.xy(1, 7));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private BuscaCamposPanel buscaCamposPanel;
	private JPanel panel1;
	private JButton buscar;
	private JScrollPane scrollPane1;
	public JTable alunoTable;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
