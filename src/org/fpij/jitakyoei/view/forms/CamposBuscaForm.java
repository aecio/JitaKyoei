package org.fpij.jitakyoei.view.forms;

import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.view.gui.BuscaCamposPanel;

import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

@Form
public class CamposBuscaForm {
	private String nome;
	private String registroFpij;
	private Aluno aluno;
	
	public CamposBuscaForm(BuscaCamposPanel buscaCamposPanel) {
		new SwingBinder(buscaCamposPanel, this).bind();
	}
	
	public Aluno pegarBean(){
		/*TODO
		 * Instanciar direito esse Aluno - Tah dando pau aqui
		 */
		aluno = new Aluno();
		aluno.setEntidade(null);
		aluno.setProfessor(null);
		Filiado filiado = new Filiado();
		filiado.setNome(nome);
		filiado.setId(Long.parseLong(registroFpij));
		aluno.setFiliado(filiado);
		return aluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegistroFpij() {
		return registroFpij;
	}

	public void setRegistroFpij(String registroFpij) {
		this.registroFpij = registroFpij;
	}
	
}
