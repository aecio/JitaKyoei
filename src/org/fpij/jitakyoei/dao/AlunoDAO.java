package org.fpij.jitakyoei.dao;

import org.fpij.jitakyoei.beans.Aluno;

public class AlunoDAO extends DAO<Aluno>{
	@Override
	public boolean validate(Aluno object) {
		return true;
	}
}