package org.fpij.jitakyoei.view;

import java.awt.Component;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.model.beans.Endereco;
import org.fpij.jitakyoei.model.beans.Entidade;
import org.fpij.jitakyoei.view.forms.EntidadeForm;
import org.fpij.jitakyoei.view.gui.EntidadeCadastrarPanel;

@Form
public class EntidadeCadastrarView implements ViewComponent {

	private EntidadeCadastrarPanel gui;
	private AppFacade facade;
	private EntidadeForm entidadeForm;
	private Entidade entidade;
	private MainAppView parent;
	
	
	public EntidadeCadastrarView(MainAppView parent) {
		this.parent = parent;
		System.out.println("EntidadeCadastrarView.novoForm()");
		gui = new EntidadeCadastrarPanel();
		new SwingBinder(gui, this).bind();
		entidadeForm = new EntidadeForm(gui.getEntidadePanel());
		gui.setVisible(true);
	}

	@Override
	public JPanel getGui() {
		return gui;
	}

	@Override
	public void registerFacade(AppFacade fac) {
		this.facade = fac;
	}
	
	@Action
	public void cadastrarEntidade(){
		System.out.println("EntidadeCadastrarView.cadastrarEntidade()");
		try {
			Entidade e = entidadeForm.pegarBean();
			
			Endereco novoEndereco = new Endereco();
			novoEndereco.setBairro(e.getEndereco().getBairro());
			novoEndereco.setCep(e.getEndereco().getCep());
			novoEndereco.setCidade(e.getEndereco().getCidade());
			novoEndereco.setEstado(e.getEndereco().getEstado());
			novoEndereco.setNumero(e.getEndereco().getNumero());
			novoEndereco.setRua(e.getEndereco().getRua());
			
			Entidade novaEntidade = new Entidade();
			novaEntidade.setNome(e.getNome());
			novaEntidade.setCnpj(e.getCnpj());
			novaEntidade.setTelefone1(e.getTelefone1());
			novaEntidade.setTelefone2(e.getTelefone2());
			novaEntidade.setEndereco(novoEndereco);
			
			facade.createEntidade(novaEntidade);
			entidadeForm.limpar();
			JOptionPane.showMessageDialog(gui, "Entidade cadastrada com sucesso!");
			parent.removeTabPanel(gui);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	@Action
	public void cancelar(){
		parent.removeTabPanel(gui);
	}

	public void novoForm() {
		entidade = new Entidade();
		System.out.println("EntidadeCadastrarView.novoForm()");
		gui = new EntidadeCadastrarPanel();
		new SwingBinder(gui, this).bind();
		entidadeForm = new EntidadeForm(gui.getEntidadePanel());
		gui.setVisible(true);
	}
}
