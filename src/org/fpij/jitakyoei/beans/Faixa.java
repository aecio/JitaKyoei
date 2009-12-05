package org.fpij.jitakyoei.beans;

import java.util.Date;

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
