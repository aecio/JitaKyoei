package org.fpij.jitakyoei.model.beans;

public class Rg {
	String numero;
	String orgaoExpedidor;
	
	public Rg() {}
	
	public Rg(String numero, String orgaoExpedidor) {
		this.numero = numero;
		this.orgaoExpedidor = orgaoExpedidor;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Rg){
			Rg other = (Rg) obj;
			return 	numero.equals(other.numero)&&
					orgaoExpedidor.equals(other.orgaoExpedidor);
		}
		return false;
	}
	@Override
	public int hashCode() {
		return (int)(long) numero.hashCode()+orgaoExpedidor.hashCode();
	}
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getOrgaoExpedidor() {
		return orgaoExpedidor;
	}
	public void setOrgaoExpedidor(String orgaoExpedidor) {
		this.orgaoExpedidor = orgaoExpedidor;
	}
}
