package org.fpij.jitakyoei.view.forms;

import java.util.Date;

import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Rg;
import org.fpij.jitakyoei.view.gui.FiliadoPanel;

@Form
public class FiliadoForm {
	private SwingBinder binder;
	private Filiado filiado;
	private String nome;
	private String cpf;
	private String dataNascimento;
	private String rg;
	private String orgaoExpedidor;
	private String observacoes;
	private EnderecoForm enderecoForm;
	private String registroCbj;
	private String telefone1;
	private String telefone2;
	private Date ultimaAnuidade;
	private String email;
	
	public FiliadoForm(FiliadoPanel filiadoPanel) {
		this.binder = new SwingBinder(filiadoPanel, this);
		binder.bind();
		this.enderecoForm = new EnderecoForm(filiadoPanel.getEnderecoPanel());
	}
	
	public Filiado pegarBean(){
		System.out.println("FiliadoForm.pegarBean()");

		Filiado f = new Filiado();
		/**
		 * FIXME: Converter para data
		 */
//		f.setDataNascimento(new DateFormat.);
		f.setEmail(email);
//		f.setFaixas(faixas);
		f.setEndereco(enderecoForm.pegarBean());
		f.setCpf(cpf);
		f.setNome(nome);
		System.out.println("nome: "+nome);
		f.setRegistroCbj(registroCbj);
		f.setRg(new Rg(rg, orgaoExpedidor));
		f.setTelefone1(telefone1);
		f.setTelefone2(telefone2);
		f.setUltimaAnuidade(ultimaAnuidade);
		
		return f;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Filiado getFiliado() {
		return filiado;
	}

	public void setFiliado(Filiado filiado) {
		this.filiado = filiado;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}

	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public String getRegistroCbj() {
		return registroCbj;
	}

	public void setRegistroCbj(String registroCbj) {
		this.registroCbj = registroCbj;
	}

	public String getTelefone1() {
		return telefone1;
	}

	public void setTelefone1(String telefone1) {
		this.telefone1 = telefone1;
	}

	public String getTelefone2() {
		return telefone2;
	}

	public void setTelefone2(String telefone2) {
		this.telefone2 = telefone2;
	}

	public Date getUltimaAnuidade() {
		return ultimaAnuidade;
	}

	public void setUltimaAnuidade(Date ultimaAnuidade) {
		this.ultimaAnuidade = ultimaAnuidade;
	}
}
