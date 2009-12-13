package org.fpij.jitakyoei.util;

import java.util.ArrayList;
import java.util.List;

public enum CorFaixa {
	BRANCA("Branca"),
	CINZA("Cinza"),
	AZUL("Azul"),
	AMARELA("Amarela"),
	LARANJA("Laranja"),
	VERDE("Verde"),
	ROXA("Roxa"),
	MARROM("Marrom"),
	PRETA1DAN("Preta 1º Dan"),
	PRETA2DAN("Preta 2º Dan"),
	PRETA3DAN("Preta 3º Dan"),
	PRETA4DAN("Preta 4º Dan"),
	PRETA5DAN("Preta 5º Dan"),
	CORAL6DAN("Coral 6º Dan"),
	CORAL7DAN("Coral 7º Dan"),
	VERMELHA8DAN("Vermelha 8º Dan"),
	VERMELHA9DAN("Vermelha 9º Dan"),
	VERMELHA10DAN("Vermelha 10º Dan");
	
	public final String descricao;
	
	CorFaixa(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescricao(){
		return descricao;
	}
	
	public String toString(){
		return descricao;
	}
	
	public static List<CorFaixa> getCoresFaixa(){
		List<CorFaixa> cores = new ArrayList<CorFaixa>();
		cores.add(BRANCA);
		cores.add(CINZA);
		cores.add(AZUL);
		cores.add(AMARELA);
		cores.add(LARANJA);
		cores.add(VERDE);
		cores.add(ROXA);
		cores.add(MARROM);
		cores.add(PRETA1DAN);
		cores.add(PRETA2DAN);
		cores.add(PRETA3DAN);
		cores.add(PRETA4DAN);
		cores.add(PRETA5DAN);
		cores.add(CORAL6DAN);
		cores.add(CORAL7DAN);
		cores.add(VERMELHA8DAN);
		cores.add(VERMELHA9DAN);
		cores.add(VERMELHA10DAN);
		
		return cores;
	}
	
}
