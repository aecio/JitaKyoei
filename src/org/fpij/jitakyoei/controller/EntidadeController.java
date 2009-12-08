package org.fpij.jitakyoei.controller;

import org.fpij.jitakyoei.model.beans.Entidade;

public interface EntidadeController {
	public void handleCreateAction(Entidade obj);
	public void handleDeleteAction(Entidade obj);
	public void handleUpdateAction(Entidade obj);
}
