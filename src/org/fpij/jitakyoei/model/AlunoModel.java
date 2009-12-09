package org.fpij.jitakyoei.model;

import java.util.List;

import org.fpij.jitakyoei.model.beans.Aluno;

public interface AlunoModel {
	public Aluno save(Aluno obj) throws Exception;
	public Aluno update(Aluno obj) throws Exception;
	public void delete(Aluno obj) throws Exception;
	public List<Aluno> find(Aluno obj) throws Exception;
}
