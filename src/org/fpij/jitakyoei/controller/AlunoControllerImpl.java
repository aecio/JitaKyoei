package org.fpij.jitakyoei.controller;

import java.util.List;

import org.fpij.jitakyoei.model.AlunoModel;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.view.AlunoView;

public class AlunoControllerImpl implements AlunoController{
	AlunoModel model;
	AlunoView view;
	
	public AlunoControllerImpl(AlunoModel model, AlunoView view) {
		this.model = model;
		this.view = view;
	}

	private void reportException(Exception e) {
		view.displayException(e.getMessage());
	}
	
	@Override
	public void handleCreateAction(Aluno obj) {
		try{
			obj = model.save(obj);
			view.displayResult(obj);
		}catch (Exception e) {
			reportException(e);
		}
	}

	@Override
	public void handleUpdateAction(Aluno obj) {
		try{
			obj = model.update(obj);
			view.displayResult(obj);
		}catch (Exception e) {
			reportException(e);
		}
	}

	@Override
	public void handleSearchAction(Aluno obj) {
		try{
			List<Aluno> result = model.find(obj);
			view.displayResult(result);
		}catch (Exception e) {
			reportException(e);
		}
	}
}