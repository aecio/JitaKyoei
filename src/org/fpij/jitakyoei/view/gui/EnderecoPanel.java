/*
 * Created by JFormDesigner on Tue Dec 08 14:49:27 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import net.java.dev.genesis.annotation.ViewHandler;

import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;

/**
 * @author wansoul
 */
@ViewHandler
public class EnderecoPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	public EnderecoPanel() {
		initComponents();
	}

	public JTextField getRua() {
		return rua;
	}

	public JTextField getNumero() {
		return numero;
	}

	public JTextField getBairro() {
		return bairro;
	}

	public JTextField getCidade() {
		return cidade;
	}

	public JTextField getEstado() {
		return estado;
	}

	public JTextField getCep() {
		return cep;
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		label1 = new JLabel();
		rua = new JTextField();
		label2 = new JLabel();
		numero = new JTextField();
		label3 = new JLabel();
		bairro = new JTextField();
		label4 = new JLabel();
		cidade = new JTextField();
		label5 = new JLabel();
		estado = new JTextField();
		label6 = new JLabel();
		cep = new JTextField();
		CellConstraints cc = new CellConstraints();

		//======== this ========
		setBorder(new TitledBorder(null, "Endere\u00e7o:", TitledBorder.LEADING, TitledBorder.TOP));
		setName("this");
		setLayout(new FormLayout(
			"40dlu, $lcgap, 129dlu:grow, $lcgap, 23dlu, $lcgap, 31dlu:grow, $lcgap, 29dlu, $lcgap, 96dlu:grow",
			"2*(default, $lgap), default"));

		//---- label1 ----
		label1.setText("Rua:");
		label1.setName("label1");
		add(label1, cc.xy(1, 1));

		//---- rua ----
		rua.setName("rua");
		add(rua, cc.xywh(3, 1, 5, 1));

		//---- label2 ----
		label2.setText("N\u00famero:");
		label2.setName("label2");
		add(label2, cc.xy(9, 1));

		//---- numero ----
		numero.setName("numero");
		add(numero, cc.xy(11, 1));

		//---- label3 ----
		label3.setText("Bairro:");
		label3.setName("label3");
		add(label3, cc.xy(1, 3));

		//---- bairro ----
		bairro.setName("bairro");
		add(bairro, cc.xy(3, 3));

		//---- label4 ----
		label4.setText("Cidade:");
		label4.setName("label4");
		add(label4, cc.xy(5, 3));

		//---- cidade ----
		cidade.setName("cidade");
		add(cidade, cc.xywh(7, 3, 5, 1));

		//---- label5 ----
		label5.setText("Estado:");
		label5.setName("label5");
		add(label5, cc.xy(1, 5));

		//---- estado ----
		estado.setName("estado");
		add(estado, cc.xy(3, 5));

		//---- label6 ----
		label6.setText("CEP:");
		label6.setName("label6");
		add(label6, cc.xy(5, 5));

		//---- cep ----
		cep.setName("cep");
		add(cep, cc.xywh(7, 5, 5, 1));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JLabel label1;
	private JTextField rua;
	private JLabel label2;
	private JTextField numero;
	private JLabel label3;
	private JTextField bairro;
	private JLabel label4;
	private JTextField cidade;
	private JLabel label5;
	private JTextField estado;
	private JLabel label6;
	private JTextField cep;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
