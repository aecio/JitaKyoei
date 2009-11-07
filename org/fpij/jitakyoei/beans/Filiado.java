package org.fpij.jitakyoei.beans;

import java.util.Date;
import java.util.List;

public class Filiado extends Pessoa{
	String identidade;
	String cpf;
	Date dataCadastro;
	Boolean isento;
	Long regFpij;
	String regCbj;
	List<Faixa> faixas;
}
