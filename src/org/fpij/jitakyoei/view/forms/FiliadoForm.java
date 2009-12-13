package org.fpij.jitakyoei.view.forms;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import net.java.dev.genesis.annotation.Action;
import net.java.dev.genesis.annotation.DataProvider;
import net.java.dev.genesis.annotation.Form;
import net.java.dev.genesis.ui.swing.SwingBinder;

import org.fpij.jitakyoei.model.beans.Faixa;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Rg;
import org.fpij.jitakyoei.util.CorFaixa;
import org.fpij.jitakyoei.view.gui.FiliadoPanel;

import com.toedter.calendar.JDateChooser;

@Form
public class FiliadoForm {
	private SwingBinder binder;
	private Filiado filiado;
	private String nome;
	private String cpf;
	private JDateChooser dataNascimento;
	private String rg;
	private String orgaoExpedidor;
	private String observacoes;
	private EnderecoForm enderecoForm;
	private String registroCbj;
	private String telefone1;
	private String telefone2;
	private Date ultimaAnuidade;
	private String email;
	private Faixa faixa;
	private List<Faixa> faixasList;
	private CorFaixa corFaixa;
	private JDateChooser dataEntregaDataChooser;
	private DefaultTableModel faixasModel;
	private SimpleDateFormat dataFormater;


	public FiliadoForm(FiliadoPanel filiadoPanel) {
		this.binder = new SwingBinder(filiadoPanel, this);
		binder.bind();
		this.enderecoForm = new EnderecoForm(filiadoPanel.getEnderecoPanel());
		dataEntregaDataChooser = filiadoPanel.getDataEntregaDataChooser();
		dataNascimento = filiadoPanel.getDataNascimentoDataChooser();
		faixasModel = (DefaultTableModel) filiadoPanel.getFaixasTable().getModel();
		faixasList = new ArrayList<Faixa>();
		dataFormater = new SimpleDateFormat("dd/MM/yyyy");
	}

	@Action
	public void adicionarFaixa(){
		System.out.println("FiliadoForm.adicionarFaixa()");
		faixa = new Faixa(corFaixa, dataEntregaDataChooser.getDate());
		faixasList.add(faixa);  

		Object[][] data = new Object[faixasList.size()][2];
		for (int i = 0; i < faixasList.size(); i++) {
			data[i][0] = faixasList.get(i).getCor();
			data[i][1] = dataFormater.format(faixasList.get(i).getDataEntrega());
		}
		faixasModel.setDataVector( data, new String[]{"Faixa","Data de Entrega"});
	}
	
	@DataProvider(objectField = "corFaixa")
	public List<CorFaixa> populaFaixa(){
		List<CorFaixa> cores = new ArrayList<CorFaixa>();
		cores = CorFaixa.getCoresFaixa();
		return cores;
	}

	public CorFaixa getCorFaixa() {
		return corFaixa;
	}
	
	public void setCorFaixa(CorFaixa corFaixa) {
		this.corFaixa = corFaixa;
	}
	
	public Filiado pegarBean(){
		System.out.println("FiliadoForm.pegarBean()");

		Filiado f = new Filiado();
		f.setDataNascimento(dataNascimento.getDate());
		f.setEmail(email);
		f.setFaixas(faixasList);
		f.setEndereco(enderecoForm.pegarBean());
		f.setCpf(cpf);
		f.setNome(nome);
		System.out.println("nome: "+nome);
		f.setRegistroCbj(registroCbj);
		f.setRg(new Rg(rg, orgaoExpedidor));
		f.setTelefone1(telefone1);
		f.setTelefone2(telefone2);
		f.setUltimaAnuidade(ultimaAnuidade);
		f.setObservacoes(observacoes);
		
		return f;
	}
	
	public Faixa getFaixa() {
		return faixa;
	}

	public void setFaixa(Faixa faixa) {
		this.faixa = faixa;
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
