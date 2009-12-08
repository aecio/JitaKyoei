package org.fpij.jitakyoei.controller;

import org.fpij.jitakyoei.model.beans.Professor;

public interface ProfessorController {
	public void handleCreateAction(Professor obj);
	public void handleDeleteAction(Professor obj);
	public void handleUpdateAction(Professor obj);
}
