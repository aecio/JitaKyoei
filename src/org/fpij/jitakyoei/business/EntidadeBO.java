package org.fpij.jitakyoei.business;

import java.util.List;

import org.fpij.jitakyoei.model.beans.Entidade;

public interface EntidadeBO {
	public void createEntidade(Entidade entidade) throws Exception;
	public void updateEntidade(Entidade entidade) throws Exception;
	public List<Entidade> searchEntidade(Entidade entidade) throws Exception;
	public List<Entidade> listAll() throws Exception;
}
