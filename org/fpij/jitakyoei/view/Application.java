package org.fpij.jitakyoei.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Application {

	private JFrame jFrame = null;  //  @jve:decl-index=0:visual-constraint="15,-6"
	private JPanel jContentPane = null;
	private JMenuBar jJMenuBar = null;
	private JMenu arquivoMenu = null;
	private JMenu cadastrosMenu = null;
	private JMenu ajudaMenu = null;
	private JMenuItem exitMenuItem = null;
	private JMenuItem aboutMenuItem = null;
	private JDialog aboutDialog = null;  //  @jve:decl-index=0:visual-constraint="228,287"
	private JPanel aboutContentPane = null;
	private JLabel aboutVersionLabel = null;
	private JMenuItem cadastoAlunoMenuItem = null;
	private JMenuItem cadastroProfessorMenuItem = null;
	private JMenuItem cadastroEntidadeMenuItem = null;
	/**
	 * This method initializes jFrame
	 * 
	 * @return javax.swing.JFrame
	 */
	private JFrame getJFrame() {
		if (jFrame == null) {
			jFrame = new JFrame();
			jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jFrame.setPreferredSize(new Dimension(200, 50));
			jFrame.setJMenuBar(getJJMenuBar());
			jFrame.setSize(668, 285);
			jFrame.setContentPane(getJContentPane());
			jFrame.setTitle("Application");
		}
		return jFrame;
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
		}
		return jContentPane;
	}

	/**
	 * This method initializes jJMenuBar	
	 * 	
	 * @return javax.swing.JMenuBar	
	 */
	private JMenuBar getJJMenuBar() {
		if (jJMenuBar == null) {
			jJMenuBar = new JMenuBar();
			jJMenuBar.setDoubleBuffered(true);
			jJMenuBar.add(getArquivoMenu());
			jJMenuBar.add(getCadastrosMenu());
			jJMenuBar.add(getAjudaMenu());
		}
		return jJMenuBar;
	}

	/**
	 * This method initializes jMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getArquivoMenu() {
		if (arquivoMenu == null) {
			arquivoMenu = new JMenu();
			arquivoMenu.setText("Arquivo");
			arquivoMenu.add(getExitMenuItem());
		}
		return arquivoMenu;
	}

	/**
	 * This method initializes jMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getCadastrosMenu() {
		if (cadastrosMenu == null) {
			cadastrosMenu = new JMenu();
			cadastrosMenu.setText("Cadastros");
			cadastrosMenu.add(getCadastoAlunoMenuItem());
			cadastrosMenu.add(getCadastroProfessorMenuItem());
			cadastrosMenu.add(getCadastroEntidadeMenuItem());
		}
		return cadastrosMenu;
	}

	/**
	 * This method initializes jMenu	
	 * 	
	 * @return javax.swing.JMenu	
	 */
	private JMenu getAjudaMenu() {
		if (ajudaMenu == null) {
			ajudaMenu = new JMenu();
			ajudaMenu.setText("Ajuda");
			ajudaMenu.add(getAboutMenuItem());
		}
		return ajudaMenu;
	}

	/**
	 * This method initializes jMenuItem	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getExitMenuItem() {
		if (exitMenuItem == null) {
			exitMenuItem = new JMenuItem();
			exitMenuItem.setText("Exit");
			exitMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
		}
		return exitMenuItem;
	}

	/**
	 * This method initializes jMenuItem	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getAboutMenuItem() {
		if (aboutMenuItem == null) {
			aboutMenuItem = new JMenuItem();
			aboutMenuItem.setText("About");
			aboutMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JDialog aboutDialog = getAboutDialog();
					aboutDialog.pack();
					Point loc = getJFrame().getLocation();
					loc.translate(20, 20);
					aboutDialog.setLocation(loc);
					aboutDialog.setVisible(true);
				}
			});
		}
		return aboutMenuItem;
	}

	/**
	 * This method initializes aboutDialog	
	 * 	
	 * @return javax.swing.JDialog
	 */
	private JDialog getAboutDialog() {
		if (aboutDialog == null) {
			aboutDialog = new JDialog(getJFrame(), true);
			aboutDialog.setTitle("Sobre o JitaKyoei");
			aboutDialog.setSize(new Dimension(236, 106));
			aboutDialog.setContentPane(getAboutContentPane());
		}
		return aboutDialog;
	}

	/**
	 * This method initializes aboutContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getAboutContentPane() {
		if (aboutContentPane == null) {
			aboutContentPane = new JPanel();
			aboutContentPane.setLayout(new BorderLayout());
			aboutContentPane.add(getAboutVersionLabel(), BorderLayout.CENTER);
		}
		return aboutContentPane;
	}

	/**
	 * This method initializes aboutVersionLabel	
	 * 	
	 * @return javax.swing.JLabel	
	 */
	private JLabel getAboutVersionLabel() {
		if (aboutVersionLabel == null) {
			aboutVersionLabel = new JLabel();
			aboutVersionLabel.setText("Versão 0.1-dev");
			aboutVersionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return aboutVersionLabel;
	}

	/**
	 * This method initializes cadastoAlunoMenuItem	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getCadastoAlunoMenuItem() {
		if (cadastoAlunoMenuItem == null) {
			cadastoAlunoMenuItem = new JMenuItem();
			cadastoAlunoMenuItem.setText("Aluno");
			cadastoAlunoMenuItem.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					System.out.println("actionPerformed()");
				}
			});
		}
		return cadastoAlunoMenuItem;
	}
	
	/**
	 * This method initializes cadastroProfessorMenuItem	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getCadastroProfessorMenuItem() {
		if (cadastroProfessorMenuItem == null) {
			cadastroProfessorMenuItem = new JMenuItem();
			cadastroProfessorMenuItem.setText("Professor");
		}
		return cadastroProfessorMenuItem;
	}

	/**
	 * This method initializes cadastroEntidadeMenuItem	
	 * 	
	 * @return javax.swing.JMenuItem	
	 */
	private JMenuItem getCadastroEntidadeMenuItem() {
		if (cadastroEntidadeMenuItem == null) {
			cadastroEntidadeMenuItem = new JMenuItem();
			cadastroEntidadeMenuItem.setText("Entidade");
		}
		return cadastroEntidadeMenuItem;
	}

	/**
	 * Launches this application
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Application application = new Application();
				application.getJFrame().setVisible(true);
			}
		});
	}

}
