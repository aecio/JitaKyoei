package org.fpij.jitakyoei.beandeprecated;
import org.fpij.jitakyoei.enums.Categoria;
import org.fpij.jitakyoei.enums.Classe;
import org.fpij.jitakyoei.enums.Graduacao;
import org.fpij.jitakyoei.enums.TipoFiliado;

@Deprecated
public class Filiado {
	private int idFiliado;
	private String nome;
	private String rg; 
	private String cpf;
	private TipoFiliado tipoFiliado;
	private Graduacao graduacao;
	private Classificacao classificacao=null;
	private String endereco;
	private String telefone;
	private String celular;
	
	public Filiado(){
		super();
		this.classificacao = new Classificacao(null,null);
	}
	
	public int getIdFiliado(){
		return idFiliado;
	}
	public void setIdFiliado(int registroFPIJ){
		this.idFiliado = registroFPIJ;		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}	
	public TipoFiliado getTipoFiliado() {
		return tipoFiliado;
	}
	public void setTipoFiliado(TipoFiliado tipoFiliado) {
		this.tipoFiliado = tipoFiliado;
	}
	public Graduacao getFaixa() {
		return graduacao;
	}
	public void setGraduacao(Graduacao faixa) {
		this.graduacao = faixa;
	}
	public Classe getClasse() {
		return classificacao.getClasse();
	}
	public void setClasse(Classe classe) {
		this.classificacao.setClasse(classe);
	}
	public Categoria getCategoria() {
		return classificacao.getCategoria();
	}
	public void setCategoria(Categoria categoria) {
		this.classificacao.setCategoria(categoria);
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
}
