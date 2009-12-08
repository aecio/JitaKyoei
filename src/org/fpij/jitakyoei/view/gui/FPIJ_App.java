/*
 * Created by JFormDesigner on Tue Dec 08 15:20:26 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.jgoodies.forms.layout.*;
import org.fpij.jitakyoei.view.*;

/**
 * @author Brainrain
 */
public class FPIJ_App extends JFrame {
	public FPIJ_App() {
		initComponents();
	}

	private void thisWindowClosed(WindowEvent e) {
		
	}
	
	

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		menuBar1 = new JMenuBar();
		menu1 = new JMenu();
		menuItem3 = new JMenuItem();
		menuItem10 = new JMenuItem();
		menuItem15 = new JMenuItem();
		menu4 = new JMenu();
		menuItem4 = new JMenuItem();
		menuItem11 = new JMenuItem();
		menuItem16 = new JMenuItem();
		menu5 = new JMenu();
		menuItem9 = new JMenuItem();
		menuItem12 = new JMenuItem();
		menuItem17 = new JMenuItem();
		menu3 = new JMenu();
		menuItem6 = new JMenuItem();
		menuItem5 = new JMenuItem();
		menuItem7 = new JMenuItem();
		menuItem8 = new JMenuItem();
		menu2 = new JMenu();
		menuItem1 = new JMenuItem();
		toolBar1 = new JToolBar();
		button1 = new JButton();
		alunoAtualizarPanel1 = new AlunoAtualizarPanel();

		//======== this ========
		setTitle("JitaKyoei - Federa\u00e7\u00e3o Piauiense de Jud\u00f4");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setIconImage(new ImageIcon("C:\\Documents and Settings\\User\\Meus documentos\\[ADS-IV]\\AOO\\Trabalho Final\\icon-logo.png").getImage());
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				thisWindowClosed(e);
			}
		});
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== menuBar1 ========
		{

			//======== menu1 ========
			{
				menu1.setText("Cadastrar");

				//---- menuItem3 ----
				menuItem3.setText("Aluno");
				menu1.add(menuItem3);

				//---- menuItem10 ----
				menuItem10.setText("Professor");
				menu1.add(menuItem10);

				//---- menuItem15 ----
				menuItem15.setText("Entidade");
				menu1.add(menuItem15);
			}
			menuBar1.add(menu1);

			//======== menu4 ========
			{
				menu4.setText("Buscar");

				//---- menuItem4 ----
				menuItem4.setText("Aluno");
				menu4.add(menuItem4);

				//---- menuItem11 ----
				menuItem11.setText("Professor");
				menu4.add(menuItem11);

				//---- menuItem16 ----
				menuItem16.setText("Entidade");
				menu4.add(menuItem16);
			}
			menuBar1.add(menu4);

			//======== menu5 ========
			{
				menu5.setText("Alterar");

				//---- menuItem9 ----
				menuItem9.setText("Aluno");
				menu5.add(menuItem9);

				//---- menuItem12 ----
				menuItem12.setText("Professor");
				menu5.add(menuItem12);

				//---- menuItem17 ----
				menuItem17.setText("Entidade");
				menu5.add(menuItem17);
			}
			menuBar1.add(menu5);

			//======== menu3 ========
			{
				menu3.setText("Relat\u00f3rios");

				//---- menuItem6 ----
				menuItem6.setText("Aniversariantes do M\u00eas");
				menu3.add(menuItem6);

				//---- menuItem5 ----
				menuItem5.setText("Relat\u00f3rio de Alunos");
				menu3.add(menuItem5);

				//---- menuItem7 ----
				menuItem7.setText("Relat\u00f3rio de Professores");
				menu3.add(menuItem7);

				//---- menuItem8 ----
				menuItem8.setText("Relat\u00f3rio de Institui\u00e7\u00f5es");
				menu3.add(menuItem8);
			}
			menuBar1.add(menu3);

			//======== menu2 ========
			{
				menu2.setText("Ajuda");

				//---- menuItem1 ----
				menuItem1.setText("Sobre");
				menu2.add(menuItem1);
			}
			menuBar1.add(menu2);
		}
		setJMenuBar(menuBar1);

		//======== toolBar1 ========
		{
			toolBar1.setFloatable(false);

			//---- button1 ----
			button1.setIcon(new ImageIcon("C:\\Documents and Settings\\User\\Meus documentos\\[ADS-IV]\\AOO\\Trabalho Final\\icon-logo-32.png"));
			toolBar1.add(button1);
		}
		contentPane.add(toolBar1, BorderLayout.NORTH);
		contentPane.add(alunoAtualizarPanel1, BorderLayout.CENTER);
		setSize(705, 575);
		setLocationRelativeTo(null);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JMenuBar menuBar1;
	private JMenu menu1;
	private JMenuItem menuItem3;
	private JMenuItem menuItem10;
	private JMenuItem menuItem15;
	private JMenu menu4;
	private JMenuItem menuItem4;
	private JMenuItem menuItem11;
	private JMenuItem menuItem16;
	private JMenu menu5;
	private JMenuItem menuItem9;
	private JMenuItem menuItem12;
	private JMenuItem menuItem17;
	private JMenu menu3;
	private JMenuItem menuItem6;
	private JMenuItem menuItem5;
	private JMenuItem menuItem7;
	private JMenuItem menuItem8;
	private JMenu menu2;
	private JMenuItem menuItem1;
	private JToolBar toolBar1;
	private JButton button1;
	private AlunoAtualizarPanel alunoAtualizarPanel1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
