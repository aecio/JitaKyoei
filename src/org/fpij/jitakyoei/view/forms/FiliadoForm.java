package org.fpij.jitakyoei.view.forms;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import org.fpij.jitakyoei.model.beans.Faixa;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.util.CorFaixa;
import org.fpij.jitakyoei.view.gui.FiliadoPanel;

public class FiliadoForm {
	private Filiado filiado;
	private FiliadoPanel filiadoPanel;
	private EnderecoForm enderecoForm;
	private SimpleDateFormat dataFormater;

	/**
	 * Contrutor padrão que recebe somente FiliadoPanel. Um novo Filiado será
	 * instanciado.
	 * 
	 * @param enderecoPanel
	 * @param endereco
	 */
	public FiliadoForm(FiliadoPanel filiadoPanel) {
		this.filiado = new Filiado();
		init(filiadoPanel);
	}

	/**
	 * Contrutor que recebe um FiliadoPanel e um Filiado. O FiliadoPanel será
	 * iniciado com os valores do Filiado passado por parâmetro.
	 * 
	 * @param enderecoPanel
	 * @param endereco
	 */
	public FiliadoForm(FiliadoPanel filiadoPanel, Filiado filiado) {
		init(filiadoPanel);
		this.setFiliado(filiado);
	}

	/**
	 * Inicializa os atributos da classe e a interface gráfica. Chamado somente
	 * pelos contrutores da classe.
	 * 
	 * @param filiadoPanel
	 * @param filiado
	 */
	private void init(FiliadoPanel filiadoPanel) {
		this.filiadoPanel = filiadoPanel;
		this.enderecoForm = new EnderecoForm(filiadoPanel.getEnderecoPanel());
		this.dataFormater = new SimpleDateFormat("dd/MM/yyyy");
		this.filiadoPanel.getAdicionarFaixa().addActionListener(
				new AdicionarFaixaActionHandler());
		this.setCorFaixaItens(CorFaixa.getCoresFaixa());
	}

	/**
	 * Atualiza a GUI com Filiado passado no parâmetro.
	 * 
	 * @param endereco
	 */
	public void setFiliado(Filiado filiado) {
		this.filiado = filiado;
		setNome(filiado.getNome());
		setCpf(filiado.getCpf());
		setEmail(filiado.getEmail());
		setObservacoes(filiado.getObservacoes());
		setOrgaoExpedidor(filiado.getRg().getOrgaoExpedidor());
		setNumero(filiado.getRg().getNumero());
		setTelefone1(filiado.getTelefone1());
		setTelefone2(filiado.getTelefone2());
		setRegistroCbj(filiado.getRegistroCbj());
		setDataNascimento(filiado.getDataNascimento());
		setFaixasList(filiado.getFaixas());
		enderecoForm.setEndereco(filiado.getEndereco());
	}

	/**
	 * Retorna um Filiado com os valores atualizados da GUI.
	 * 
	 * @return endereco
	 */
	public Filiado getFiliado() {
		filiado.setDataNascimento(getDataNascimento());
		filiado.setEmail(getEmail());
		filiado.setCpf(getCpf());
		filiado.setNome(getNome());
		filiado.setRegistroCbj(getRegistroCbj());
		filiado.setTelefone1(getTelefone1());
		filiado.setTelefone2(getTelefone2());
		filiado.setObservacoes(getObservacoes());
		filiado.getRg().setNumero(getNumero());
		filiado.getRg().setOrgaoExpedidor(getOrgaoExpedidor());
		filiado.setEndereco(enderecoForm.getEndereco());
		return filiado;
	}

	/**
	 * Classe interna responsável por detectar os cliques no botão
	 * "Adicionar Faixa".
	 * 
	 * @author Aécio
	 */
	class AdicionarFaixaActionHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent arg0) {
			filiado.getFaixas().add(new Faixa(getCorFaixa(), getDataEntrega()));
			setFaixasList(filiado.getFaixas());
		}
	}

	/* Métodos de acesso à GUI */
	
	public String getNome() {
		return filiadoPanel.getNome().getText();
	}

	public void setNome(String nome) {
		filiadoPanel.getNome().setText(nome);
	}

	public String getCpf() {
		return filiadoPanel.getCpf().getText();
	}

	public void setCpf(String cpf) {
		filiadoPanel.getCpf().setText(cpf);
	}

	public String getNumero() {
		return filiadoPanel.getRg().getText();
	}

	public void setNumero(String numero) {
		filiadoPanel.getRg().setText(numero);
	}

	public String getOrgaoExpedidor() {
		return filiadoPanel.getOrgaoExpedidor().getText();
	}

	public void setOrgaoExpedidor(String orgaoExpedidor) {
		filiadoPanel.getOrgaoExpedidor().setText(orgaoExpedidor);
	}

	public String getObservacoes() {
		return filiadoPanel.getObservacoes().getText();
	}

	public void setObservacoes(String observacoes) {
		filiadoPanel.getObservacoes().setText(observacoes);
	}

	public String getRegistroCbj() {
		return filiadoPanel.getRegistroCbj().getText();
	}

	public void setRegistroCbj(String registroCbj) {
		filiadoPanel.getRegistroCbj().setText(registroCbj);
	}

	public String getTelefone1() {
		return filiadoPanel.getTelefone1().getText();
	}

	public void setTelefone1(String telefone1) {
		filiadoPanel.getTelefone1().setText(telefone1);
	}

	public String getTelefone2() {
		return filiadoPanel.getTelefone2().getText();
	}

	public void setTelefone2(String telefone2) {
		filiadoPanel.getTelefone2().setText(telefone2);
	}

	public String getEmail() {
		return filiadoPanel.getEmail().getText();
	}

	public void setEmail(String email) {
		filiadoPanel.getEmail().setText(email);
	}

	private CorFaixa getCorFaixa() {
		return (CorFaixa) filiadoPanel.getCorFaixa().getSelectedItem();
	}

	private void setCorFaixaItens(List<CorFaixa> cores) {
		for (CorFaixa cor : cores) {
			filiadoPanel.getCorFaixa().addItem(cor);
		}
	}

	private Date getDataEntrega() {
		return filiadoPanel.getDataEntregaDataChooser().getDate();
	}

	public void setFaixasList(List<Faixa> faixasList) {
		Object[][] data = new Object[faixasList.size()][2];
		for (int i = 0; i < faixasList.size(); i++) {
			data[i][0] = faixasList.get(i).getCor();
			data[i][1] = dataFormater
					.format(faixasList.get(i).getDataEntrega());
		}
		DefaultTableModel faixasModel = (DefaultTableModel) filiadoPanel
				.getFaixasTable().getModel();
		faixasModel.setDataVector(data, new String[] { "Faixa",
				"Data de Entrega" });
	}

	public Date getDataNascimento() {
		return filiadoPanel.getDataNascimentoDataChooser().getDate();
	}

	public void setDataNascimento(Date dataNascimento) {
		filiadoPanel.getDataNascimentoDataChooser().setDate(dataNascimento);
	}
}
