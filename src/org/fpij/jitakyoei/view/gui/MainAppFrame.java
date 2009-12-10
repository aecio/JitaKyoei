/*
 * Created by JFormDesigner on Tue Dec 08 15:20:26 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import net.java.dev.genesis.annotation.ViewHandler;

/**
 * @author wansoul
 */
@ViewHandler
public class MainAppFrame extends JFrame {
		
	private static final long serialVersionUID = 1L;
	public MainAppFrame() {
		initComponents();
	}

	public JPanel getMainPanel() {
		return mainPanel;
	}
	
	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		mainMenuBar = new JMenuBar();
		menu1 = new JMenu();
		cadastrarAlunoMenuItem = new JMenuItem();
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
		mainPanel = new JPanel();

		//======== this ========
		setTitle("JitaKyoei - Federa\u00e7\u00e3o Piauiense de Jud\u00f4");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setIconImage(new ImageIcon("C:\\Documents and Settings\\User\\Meus documentos\\[ADS-IV]\\AOO\\Trabalho Final\\icon-logo.png").getImage());
		setName("this");
		Container contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== mainMenuBar ========
		{
			mainMenuBar.setName("mainMenuBar");

			//======== menu1 ========
			{
				menu1.setText("Cadastrar");
				menu1.setName("menu1");

				//---- cadastrarAlunoMenuItem ----
				cadastrarAlunoMenuItem.setText("Aluno");
				cadastrarAlunoMenuItem.setName("cadastrarAlunoMenuItem");
				menu1.add(cadastrarAlunoMenuItem);

				//---- menuItem10 ----
				menuItem10.setText("Professor");
				menuItem10.setName("menuItem10");
				menu1.add(menuItem10);

				//---- menuItem15 ----
				menuItem15.setText("Entidade");
				menuItem15.setName("menuItem15");
				menu1.add(menuItem15);
			}
			mainMenuBar.add(menu1);

			//======== menu4 ========
			{
				menu4.setText("Buscar");
				menu4.setName("menu4");

				//---- menuItem4 ----
				menuItem4.setText("Aluno");
				menuItem4.setName("menuItem4");
				menu4.add(menuItem4);

				//---- menuItem11 ----
				menuItem11.setText("Professor");
				menuItem11.setName("menuItem11");
				menu4.add(menuItem11);

				//---- menuItem16 ----
				menuItem16.setText("Entidade");
				menuItem16.setName("menuItem16");
				menu4.add(menuItem16);
			}
			mainMenuBar.add(menu4);

			//======== menu5 ========
			{
				menu5.setText("Alterar");
				menu5.setName("menu5");

				//---- menuItem9 ----
				menuItem9.setText("Aluno");
				menuItem9.setName("menuItem9");
				menu5.add(menuItem9);

				//---- menuItem12 ----
				menuItem12.setText("Professor");
				menuItem12.setName("menuItem12");
				menu5.add(menuItem12);

				//---- menuItem17 ----
				menuItem17.setText("Entidade");
				menuItem17.setName("menuItem17");
				menu5.add(menuItem17);
			}
			mainMenuBar.add(menu5);

			//======== menu3 ========
			{
				menu3.setText("Relat\u00f3rios");
				menu3.setName("menu3");

				//---- menuItem6 ----
				menuItem6.setText("Aniversariantes do M\u00eas");
				menuItem6.setName("menuItem6");
				menu3.add(menuItem6);

				//---- menuItem5 ----
				menuItem5.setText("Relat\u00f3rio de Alunos");
				menuItem5.setName("menuItem5");
				menu3.add(menuItem5);

				//---- menuItem7 ----
				menuItem7.setText("Relat\u00f3rio de Professores");
				menuItem7.setName("menuItem7");
				menu3.add(menuItem7);

				//---- menuItem8 ----
				menuItem8.setText("Relat\u00f3rio de Institui\u00e7\u00f5es");
				menuItem8.setName("menuItem8");
				menu3.add(menuItem8);
			}
			mainMenuBar.add(menu3);

			//======== menu2 ========
			{
				menu2.setText("Ajuda");
				menu2.setName("menu2");

				//---- menuItem1 ----
				menuItem1.setText("Sobre");
				menuItem1.setName("menuItem1");
				menu2.add(menuItem1);
			}
			mainMenuBar.add(menu2);
		}
		setJMenuBar(mainMenuBar);

		//======== mainPanel ========
		{
			mainPanel.setName("mainPanel");
			mainPanel.setLayout(new BorderLayout());
		}
		contentPane.add(mainPanel, BorderLayout.CENTER);
		setSize(705, 575);
		setLocationRelativeTo(null);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JMenuBar mainMenuBar;
	private JMenu menu1;
	private JMenuItem cadastrarAlunoMenuItem;
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
	private JPanel mainPanel;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
