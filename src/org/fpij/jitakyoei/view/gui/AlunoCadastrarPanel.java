/*
 * Created by JFormDesigner on Tue Dec 08 19:48:43 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

/**
 * @author wansoul
 */
public class AlunoCadastrarPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public AlunoCadastrarPanel() {
		initComponents();
	}

	public AlunoPanel getAlunoPanel() {
		return alunoPanel;
	}

	public JButton getCadastrar() {
		return cadastrar;
	}

	public JButton getCancelar() {
		return cancelar;
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		alunoPanel = new AlunoPanel();
		panel1 = new JPanel();
		cadastrar = new JButton();
		cancelar = new JButton();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setName("this");
		setLayout(new FormLayout(
			"default:grow",
			"2*(default, $lgap), default"));

		//---- label1 ----
		label1.setText("Cadastro de Aluno:");
		label1.setFont(new Font("Tahoma", Font.BOLD, 18));
		label1.setName("label1");
		add(label1, cc.xy(1, 1));

		//---- alunoPanel ----
		alunoPanel.setName("alunoPanel");
		add(alunoPanel, cc.xy(1, 3));

		//======== panel1 ========
		{
			panel1.setName("panel1");
			panel1.setLayout(new FormLayout(
				"42dlu, 2*($lcgap, default)",
				"default"));

			//---- cadastrar ----
			cadastrar.setText("Cadastrar");
			cadastrar.setName("cadastrar");
			panel1.add(cadastrar, cc.xy(3, 1));

			//---- cancelar ----
			cancelar.setText("Cancelar");
			cancelar.setName("cancelar");
			panel1.add(cancelar, cc.xy(5, 1));
		}
		add(panel1, cc.xy(1, 5));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private AlunoPanel alunoPanel;
	private JPanel panel1;
	private JButton cadastrar;
	private JButton cancelar;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
