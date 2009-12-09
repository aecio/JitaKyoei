/*
 * Created by JFormDesigner on Tue Dec 08 20:03:45 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import javax.swing.*;
import com.jgoodies.forms.layout.*;
import org.fpij.jitakyoei.view.*;

/**
 * @author Brainrain
 */
public class AlunoAtualizarPanel extends JPanel {
	public AlunoAtualizarPanel() {
		initComponents();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		alunoPanel1 = new AlunoPanel();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setLayout(new FormLayout(
			"default, $lcgap, default",
			"2*(default, $lgap), default"));
		add(alunoPanel1, cc.xy(1, 3));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private AlunoPanel alunoPanel1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
