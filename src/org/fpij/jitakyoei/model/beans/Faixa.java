package org.fpij.jitakyoei.model.beans;

import java.util.Date;

import org.fpij.jitakyoei.util.CorFaixa;

public class Faixa {
	CorFaixa cor;
	Date dataEntrega;
	
	public Faixa() {
		super();
	}

	public Faixa(CorFaixa cor, Date dataEntrega) {
		super();
		this.cor = cor;
		this.dataEntrega = dataEntrega;
	}

	public CorFaixa getCor() {
		return cor;
	}
	
	public void setCor(CorFaixa cor) {
		this.cor = cor;
	}
	public Date getDataEntrega() {
		return dataEntrega;
	}
	public void setDataEntrega(Date dataEntrega) {
		this.dataEntrega = dataEntrega;
	}
	
	public String toString(){
		return this.cor + " - "+ this.dataEntrega;
	}
}
