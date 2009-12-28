package org.fpij.jitakyoei.view.forms;

import org.fpij.jitakyoei.model.beans.Endereco;
import org.fpij.jitakyoei.view.gui.EnderecoPanel;

public class EnderecoForm {
	private Endereco endereco;
	private EnderecoPanel enderecoPanel;

	/**
	 * Contrutor padrão que recebe somente EnderecoPanel. Um novo Endereco será
	 * instanciado.
	 * 
	 * @param enderecoPanel
	 * @param endereco
	 */
	public EnderecoForm(EnderecoPanel enderecoPanel) {
		this(enderecoPanel, new Endereco());
	}

	/**
	 * Contrutor que recebe um EnderecoPanel e um endereco. O EnderecoPanel será
	 * iniciado com os valores do Endereco passado por parâmetro.
	 * 
	 * @param enderecoPanel
	 * @param endereco
	 */
	public EnderecoForm(EnderecoPanel enderecoPanel, Endereco endereco) {
		this.enderecoPanel = enderecoPanel;
		this.setEndereco(endereco);
	}

	/**
	 * Retorna um endereço com os valores atualizados da GUI.
	 * 
	 * @return endereco
	 */
	public Endereco getEndereco() {
		endereco.setBairro(getBairro());
		endereco.setCep(getCep());
		endereco.setCidade(getCidade());
		endereco.setEstado(getEstado());
		endereco.setNumero(getNumero());
		endereco.setRua(getRua());
		return endereco;
	}

	/**
	 * Atualiza a GUI com endereço passado no parâmetro.
	 * 
	 * @param endereco
	 */
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
		setRua(endereco.getRua());
		setNumero(endereco.getNumero());
		setBairro(endereco.getBairro());
		setCidade(endereco.getCidade());
		setEstado(endereco.getEstado());
		setCep(endereco.getCep());
	}

	/* Métodos de acesso aos valores da GUI */
	public String getRua() {
		return enderecoPanel.getRua().getText();
	}

	public String getNumero() {
		return enderecoPanel.getNumero().getText();
	}

	public String getBairro() {
		return enderecoPanel.getBairro().getText();
	}

	public String getCidade() {
		return enderecoPanel.getCidade().getText();
	}

	public String getEstado() {
		return enderecoPanel.getEstado().getText();
	}

	public String getCep() {
		return enderecoPanel.getCep().getText();
	}

	/* Métodos modificadores da GUI */
	private void setCep(String cep) {
		enderecoPanel.getCep().setText(cep);
	}

	private void setEstado(String estado) {
		enderecoPanel.getEstado().setText(estado);
	}

	private void setCidade(String cidade) {
		enderecoPanel.getCidade().setText(cidade);
	}

	private void setBairro(String bairro) {
		enderecoPanel.getBairro().setText(bairro);
	}

	private void setNumero(String numero) {
		enderecoPanel.getNumero().setText(numero);
	}

	private void setRua(String rua) {
		enderecoPanel.getRua().setText(rua);
	}
}
