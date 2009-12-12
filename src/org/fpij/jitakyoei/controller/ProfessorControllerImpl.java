package org.fpij.jitakyoei.controller;

import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.view.ProfessorView;

public class ProfessorControllerImpl implements ProfessorController {
//	private ProfessorModel model;
	private ProfessorView view;

	public ProfessorControllerImpl(){
//		this.model = model;
		this.view = view;
	}
	
	private void reportException(Exception e) {
		view.displayException(e.getMessage());
	}
	
	@Override
	public void handleCreateAction(Professor obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleDeleteAction(Professor obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void handleUpdateAction(Professor obj) {
		// TODO Auto-generated method stub
		
	}

}
