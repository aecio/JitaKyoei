package org.fpij.jitakyoei.beandeprecated;

import java.util.Date;

import org.fpij.jitakyoei.enums.Categoria;
import org.fpij.jitakyoei.enums.Classe;

public class Campeonato {
 
	private int idCampeonato;
	private String nome;	 
	private Date dataInicio;	 
	private Date dataFim;	 
	private String local;	 
	private Categoria[] categoria;	 
	private Classe[] classe;
	
	
	public Campeonato() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdCampeonato() {
		return idCampeonato;
	}

	public void setIdCampeonato(int idCampeonato) {
		this.idCampeonato = idCampeonato;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Categoria[] getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria[] categoria) {
		this.categoria = categoria;
	}

	public Classe[] getClasse() {
		return classe;
	}

	public void setClasse(Classe[] classe) {
		this.classe = classe;
	}
 	
}
 
