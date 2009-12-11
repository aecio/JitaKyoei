package org.fpij.jitakyoei.controller;

import org.fpij.jitakyoei.model.AlunoModel;
import org.fpij.jitakyoei.view.AlunoAtualizarView;
import org.fpij.jitakyoei.view.AlunoBuscarView;
import org.fpij.jitakyoei.view.AlunoCadastrarView;
import org.fpij.jitakyoei.view.AlunoView;
import org.fpij.jitakyoei.view.MainAppView;

public class MainAppControllerImpl implements MainAppController {
	MainAppView appView;
	AlunoView alunoView;
	AlunoModel alunoModel;
	AlunoControllerImpl alunoController;
	
	@Override
	public void handleAtualizarAlunoAction() {
		alunoView = new AlunoAtualizarView();
		alunoController = new AlunoControllerImpl(alunoModel, alunoView);
		alunoView.registerController(alunoController);
		appView.display(alunoView);
	}

	@Override
	public void handleBuscarAlunoAction() {
		alunoView = new AlunoBuscarView();
		alunoController = new AlunoControllerImpl(alunoModel, alunoView);
		alunoView.registerController(alunoController);
		appView.display(alunoView);
	}

	@Override
	public void handleCadastrarAlunoAction() {
		try{
			AlunoCadastrarView alunoView = new AlunoCadastrarView();
			alunoController = new AlunoControllerImpl(alunoModel, alunoView);
			alunoView.registerController(alunoController);
			appView.display(alunoView);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public void registerView(MainAppView appView) {
		this.appView = appView;
	}

}
