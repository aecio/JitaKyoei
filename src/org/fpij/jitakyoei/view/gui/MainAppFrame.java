/*
 * Created by JFormDesigner on Tue Dec 08 15:20:26 GMT-03:00 2009
 */

package org.fpij.jitakyoei.view.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.WindowConstants;

import net.java.dev.genesis.annotation.ViewHandler;

import org.fpij.jitakyoei.util.DatabaseManager;

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

	private void thisWindowOpened(WindowEvent e) {
//		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}

	public JTabbedPane getTabbedPane() {
		return tabbedPane;
	}

	private void thisWindowClosed(WindowEvent e) {
		JOptionPane.showMessageDialog(this, "Fechando o banco de dados... ;)");
		DatabaseManager.close();
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		mainMenuBar = new JMenuBar();
		menu1 = new JMenu();
		cadastrarAlunoMenuItem = new JMenuItem();
		cadastrarProfessorMenuItem = new JMenuItem();
		cadastrarEntidadeMenuItem = new JMenuItem();
		menu4 = new JMenu();
		buscarAlunoMenuItem = new JMenuItem();
		buscarProfessorMenuItem = new JMenuItem();
		buscarEntidadeMenuItem = new JMenuItem();
		menu5 = new JMenu();
		alterarAlunoMenuItem = new JMenuItem();
		alterarProfessorMenuItem = new JMenuItem();
		alterarEntidadeMenuItem = new JMenuItem();
		menu3 = new JMenu();
		menuItem6 = new JMenuItem();
		menuItem5 = new JMenuItem();
		menuItem7 = new JMenuItem();
		menuItem8 = new JMenuItem();
		menu2 = new JMenu();
		sobreMenuItem = new JMenuItem();
		mainToolBar = new JToolBar();
		cadastrarAlunoIcon = new JButton();
		alterarAlunoIcon = new JButton();
		buscarAlunoIcon = new JButton();
		cadastrarProfessorIcon = new JButton();
		alterarProfessorIcon = new JButton();
		buscarProfessorIcon = new JButton();
		cadastrarEntidadeIcon = new JButton();
		alterarEntidadeIcon = new JButton();
		buscarEntidadeIcon = new JButton();
		tabbedPane = new JTabbedPane();
		mainPanel = new JPanel();
		botaoSplash = new JButton();

		//======== this ========
		setTitle("JitaKyoei - Federa\u00e7\u00e3o Piauiense de Jud\u00f4");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setIconImage(new ImageIcon("C:\\Documents and Settings\\User\\Meus documentos\\[ADS-IV]\\AOO\\Trabalho Final\\icon-logo.png").getImage());
		setName("this");
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent e) {
				thisWindowClosed(e);
			}
			@Override
			public void windowOpened(WindowEvent e) {
				thisWindowOpened(e);
			}
		});
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
				cadastrarAlunoMenuItem.setIcon(new ImageIcon(getClass().getResource("/aluno_add-16.png")));
				cadastrarAlunoMenuItem.setName("cadastrarAlunoMenuItem");
				menu1.add(cadastrarAlunoMenuItem);

				//---- cadastrarProfessorMenuItem ----
				cadastrarProfessorMenuItem.setText("Professor");
				cadastrarProfessorMenuItem.setIcon(new ImageIcon(getClass().getResource("/teacher_add-16.png")));
				cadastrarProfessorMenuItem.setName("cadastrarProfessorMenuItem");
				menu1.add(cadastrarProfessorMenuItem);

				//---- cadastrarEntidadeMenuItem ----
				cadastrarEntidadeMenuItem.setText("Entidade");
				cadastrarEntidadeMenuItem.setIcon(new ImageIcon(getClass().getResource("/entidade_add-16.png")));
				cadastrarEntidadeMenuItem.setName("cadastrarEntidadeMenuItem");
				menu1.add(cadastrarEntidadeMenuItem);
			}
			mainMenuBar.add(menu1);

			//======== menu4 ========
			{
				menu4.setText("Buscar");
				menu4.setName("menu4");

				//---- buscarAlunoMenuItem ----
				buscarAlunoMenuItem.setText("Aluno");
				buscarAlunoMenuItem.setIcon(new ImageIcon(getClass().getResource("/aluno_search-16.png")));
				buscarAlunoMenuItem.setName("buscarAlunoMenuItem");
				menu4.add(buscarAlunoMenuItem);

				//---- buscarProfessorMenuItem ----
				buscarProfessorMenuItem.setText("Professor");
				buscarProfessorMenuItem.setIcon(new ImageIcon(getClass().getResource("/teacher_search-16.png")));
				buscarProfessorMenuItem.setName("buscarProfessorMenuItem");
				menu4.add(buscarProfessorMenuItem);

				//---- buscarEntidadeMenuItem ----
				buscarEntidadeMenuItem.setText("Entidade");
				buscarEntidadeMenuItem.setIcon(new ImageIcon(getClass().getResource("/entidade_search-16.png")));
				buscarEntidadeMenuItem.setName("buscarEntidadeMenuItem");
				menu4.add(buscarEntidadeMenuItem);
			}
			mainMenuBar.add(menu4);

			//======== menu5 ========
			{
				menu5.setText("Alterar");
				menu5.setName("menu5");

				//---- alterarAlunoMenuItem ----
				alterarAlunoMenuItem.setText("Aluno");
				alterarAlunoMenuItem.setIcon(new ImageIcon(getClass().getResource("/aluno_edit-16.png")));
				alterarAlunoMenuItem.setName("alterarAlunoMenuItem");
				menu5.add(alterarAlunoMenuItem);

				//---- alterarProfessorMenuItem ----
				alterarProfessorMenuItem.setText("Professor");
				alterarProfessorMenuItem.setIcon(new ImageIcon(getClass().getResource("/teacher_edit-16.png")));
				alterarProfessorMenuItem.setName("alterarProfessorMenuItem");
				menu5.add(alterarProfessorMenuItem);

				//---- alterarEntidadeMenuItem ----
				alterarEntidadeMenuItem.setText("Entidade");
				alterarEntidadeMenuItem.setIcon(new ImageIcon(getClass().getResource("/entidade_edit-16.png")));
				alterarEntidadeMenuItem.setName("alterarEntidadeMenuItem");
				menu5.add(alterarEntidadeMenuItem);
			}
			mainMenuBar.add(menu5);

			//======== menu3 ========
			{
				menu3.setText("Relat\u00f3rios");
				menu3.setName("menu3");

				//---- menuItem6 ----
				menuItem6.setText("Aniversariantes do M\u00eas");
				menuItem6.setIcon(new ImageIcon(getClass().getResource("/calendario.png")));
				menuItem6.setName("menuItem6");
				menu3.add(menuItem6);

				//---- menuItem5 ----
				menuItem5.setText("Relat\u00f3rio de Alunos");
				menuItem5.setIcon(new ImageIcon(getClass().getResource("/relatorio-16.png")));
				menuItem5.setName("menuItem5");
				menu3.add(menuItem5);

				//---- menuItem7 ----
				menuItem7.setText("Relat\u00f3rio de Professores");
				menuItem7.setIcon(new ImageIcon(getClass().getResource("/relatorio-16.png")));
				menuItem7.setName("menuItem7");
				menu3.add(menuItem7);

				//---- menuItem8 ----
				menuItem8.setText("Relat\u00f3rio de Institui\u00e7\u00f5es");
				menuItem8.setIcon(new ImageIcon(getClass().getResource("/relatorio-16.png")));
				menuItem8.setName("menuItem8");
				menu3.add(menuItem8);
			}
			mainMenuBar.add(menu3);

			//======== menu2 ========
			{
				menu2.setText("Ajuda");
				menu2.setName("menu2");

				//---- sobreMenuItem ----
				sobreMenuItem.setText("Sobre");
				sobreMenuItem.setIcon(new ImageIcon(getClass().getResource("/info.png")));
				sobreMenuItem.setName("sobreMenuItem");
				menu2.add(sobreMenuItem);
			}
			mainMenuBar.add(menu2);
		}
		setJMenuBar(mainMenuBar);

		//======== mainToolBar ========
		{
			mainToolBar.setFloatable(false);
			mainToolBar.setName("mainToolBar");

			//---- cadastrarAlunoIcon ----
			cadastrarAlunoIcon.setIcon(new ImageIcon(getClass().getResource("/aluno_add.png")));
			cadastrarAlunoIcon.setToolTipText("Novo Aluno");
			cadastrarAlunoIcon.setName("cadastrarAlunoIcon");
			mainToolBar.add(cadastrarAlunoIcon);

			//---- alterarAlunoIcon ----
			alterarAlunoIcon.setIcon(new ImageIcon(getClass().getResource("/aluno_edit.png")));
			alterarAlunoIcon.setToolTipText("Editar Aluno");
			alterarAlunoIcon.setName("alterarAlunoIcon");
			mainToolBar.add(alterarAlunoIcon);

			//---- buscarAlunoIcon ----
			buscarAlunoIcon.setToolTipText("Buscar Aluno");
			buscarAlunoIcon.setIcon(new ImageIcon(getClass().getResource("/aluno_search.png")));
			buscarAlunoIcon.setName("buscarAlunoIcon");
			mainToolBar.add(buscarAlunoIcon);
			mainToolBar.addSeparator();

			//---- cadastrarProfessorIcon ----
			cadastrarProfessorIcon.setIcon(new ImageIcon(getClass().getResource("/teacher_add.png")));
			cadastrarProfessorIcon.setToolTipText("Novo Professor");
			cadastrarProfessorIcon.setName("cadastrarProfessorIcon");
			mainToolBar.add(cadastrarProfessorIcon);

			//---- alterarProfessorIcon ----
			alterarProfessorIcon.setIcon(new ImageIcon(getClass().getResource("/teacher_edit.png")));
			alterarProfessorIcon.setToolTipText("Editar Professor");
			alterarProfessorIcon.setName("alterarProfessorIcon");
			mainToolBar.add(alterarProfessorIcon);

			//---- buscarProfessorIcon ----
			buscarProfessorIcon.setIcon(new ImageIcon(getClass().getResource("/teacher_search.png")));
			buscarProfessorIcon.setToolTipText("Buscar Professor");
			buscarProfessorIcon.setName("buscarProfessorIcon");
			mainToolBar.add(buscarProfessorIcon);
			mainToolBar.addSeparator();

			//---- cadastrarEntidadeIcon ----
			cadastrarEntidadeIcon.setIcon(new ImageIcon(getClass().getResource("/entidade_add.png")));
			cadastrarEntidadeIcon.setToolTipText("Nova Entidade");
			cadastrarEntidadeIcon.setName("cadastrarEntidadeIcon");
			mainToolBar.add(cadastrarEntidadeIcon);

			//---- alterarEntidadeIcon ----
			alterarEntidadeIcon.setIcon(new ImageIcon(getClass().getResource("/entidade_edit.png")));
			alterarEntidadeIcon.setToolTipText("Editar Entidade");
			alterarEntidadeIcon.setName("alterarEntidadeIcon");
			mainToolBar.add(alterarEntidadeIcon);

			//---- buscarEntidadeIcon ----
			buscarEntidadeIcon.setIcon(new ImageIcon(getClass().getResource("/entidade_search.png")));
			buscarEntidadeIcon.setToolTipText("Buscar Entidade");
			buscarEntidadeIcon.setName("buscarEntidadeIcon");
			mainToolBar.add(buscarEntidadeIcon);
		}
		contentPane.add(mainToolBar, BorderLayout.NORTH);

		//======== tabbedPane ========
		{
			tabbedPane.setName("tabbedPane");

			//======== mainPanel ========
			{
				mainPanel.setName("mainPanel");
				mainPanel.setLayout(new BorderLayout());

				//---- botaoSplash ----
				botaoSplash.setIcon(new ImageIcon(getClass().getResource("/FPIJ-splash.png")));
				botaoSplash.setName("botaoSplash");
				mainPanel.add(botaoSplash, BorderLayout.CENTER);
			}
			tabbedPane.addTab("JitaKyoei", mainPanel);

		}
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		setSize(965, 720);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JMenuBar mainMenuBar;
	private JMenu menu1;
	private JMenuItem cadastrarAlunoMenuItem;
	private JMenuItem cadastrarProfessorMenuItem;
	private JMenuItem cadastrarEntidadeMenuItem;
	private JMenu menu4;
	private JMenuItem buscarAlunoMenuItem;
	private JMenuItem buscarProfessorMenuItem;
	private JMenuItem buscarEntidadeMenuItem;
	private JMenu menu5;
	private JMenuItem alterarAlunoMenuItem;
	private JMenuItem alterarProfessorMenuItem;
	private JMenuItem alterarEntidadeMenuItem;
	private JMenu menu3;
	private JMenuItem menuItem6;
	private JMenuItem menuItem5;
	private JMenuItem menuItem7;
	private JMenuItem menuItem8;
	private JMenu menu2;
	private JMenuItem sobreMenuItem;
	private JToolBar mainToolBar;
	private JButton cadastrarAlunoIcon;
	private JButton alterarAlunoIcon;
	private JButton buscarAlunoIcon;
	private JButton cadastrarProfessorIcon;
	private JButton alterarProfessorIcon;
	private JButton buscarProfessorIcon;
	private JButton cadastrarEntidadeIcon;
	private JButton alterarEntidadeIcon;
	private JButton buscarEntidadeIcon;
	private JTabbedPane tabbedPane;
	private JPanel mainPanel;
	private JButton botaoSplash;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}
