package org.fpij.jitakyoei.model.beans;

import java.util.Date;

import org.fpij.jitakyoei.enums.CorFaixa;

public class Faixa {
	CorFaixa cor;
	Date dataEntrega;
	
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
}
