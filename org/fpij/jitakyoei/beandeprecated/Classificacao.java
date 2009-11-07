package org.fpij.jitakyoei.beandeprecated;

import org.fpij.jitakyoei.enums.Categoria;
import org.fpij.jitakyoei.enums.Classe;
@Deprecated
public class Classificacao {
 
	private Classe classe;
	private Categoria categoria;
	
	public Classificacao(Classe classe, Categoria categoria) {
		super();
		this.classe = classe;
		this.categoria = categoria;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	 
}
 
