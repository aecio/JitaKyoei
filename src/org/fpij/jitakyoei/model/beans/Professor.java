package org.fpij.jitakyoei.model.beans;

public class Professor {
	Filiado filiado;
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Professor){
			Professor other = (Professor) obj;
			return 	filiado.id == other.filiado.id;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash = 7;
		return 29 * hash +(this.filiado.getId() != null ? (int)(long)this.filiado.getId() : 0);
	}

	public Filiado getFiliado() {
		return filiado;
	}

	public void setFiliado(Filiado filiado) {
		this.filiado = filiado;
	}
	
	public String toString(){
		return this.filiado.getNome();
	}
}
