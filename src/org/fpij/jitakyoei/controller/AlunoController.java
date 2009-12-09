package org.fpij.jitakyoei.controller;

import org.fpij.jitakyoei.model.beans.Aluno;

public interface AlunoController {
	public void handleCreateAction(Aluno obj);
	public void handleUpdateAction(Aluno obj);
	public void handleSearchAction(Aluno obj);
}
