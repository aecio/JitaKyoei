/*
 * Created by JFormDesigner on Tue Dec 08 14:00:22 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.fpij.jitakyoei.view.forms.FiliadoForm;

import net.java.dev.genesis.annotation.ViewHandler;
import net.java.dev.genesis.ui.swing.SwingBinder;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

/**
 * @author wansoul
 */
@ViewHandler
public class AlunoPanel extends JPanel {
	SwingBinder binder;

	private static final long serialVersionUID = 1L;
	public AlunoPanel() {
		initComponents();
	}

	public FiliadoPanel getFiliadoPanel() {
		return filiadoPanel;
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		filiadoPanel = new FiliadoPanel();
		panel = new JPanel();
		label1 = new JLabel();
		professor = new JComboBox();
		label2 = new JLabel();
		entidade = new JComboBox();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setName("this");
		setLayout(new FormLayout(
			"$lcgap, default:grow",
			"default, $lgap, default"));

		//---- filiadoPanel ----
		filiadoPanel.setName("filiadoPanel");
		add(filiadoPanel, cc.xy(2, 1));

		//======== panel ========
		{
			panel.setName("panel");
			panel.setLayout(new FormLayout(
				"42dlu, $lcgap, default:grow, $lcgap",
				"default, $lgap, default"));

			//---- label1 ----
			label1.setText("Professor:");
			label1.setName("label1");
			panel.add(label1, cc.xy(1, 1));

			//---- professor ----
			professor.setName("professor");
			panel.add(professor, cc.xywh(3, 1, 1, 1, CellConstraints.FILL, CellConstraints.DEFAULT));

			//---- label2 ----
			label2.setText("Entidade:");
			label2.setName("label2");
			panel.add(label2, cc.xy(1, 3));

			//---- entidade ----
			entidade.setName("entidade");
			panel.add(entidade, cc.xywh(3, 3, 1, 1, CellConstraints.FILL, CellConstraints.DEFAULT));
		}
		add(panel, cc.xywh(2, 3, 1, 1, CellConstraints.FILL, CellConstraints.DEFAULT));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private FiliadoPanel filiadoPanel;
	private JPanel panel;
	private JLabel label1;
	private JComboBox professor;
	private JLabel label2;
	private JComboBox entidade;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
