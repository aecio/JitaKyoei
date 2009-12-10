package org.fpij.jitakyoei.controller;

import org.fpij.jitakyoei.model.AlunoModel;
import org.fpij.jitakyoei.view.AlunoCadastrarView;
import org.fpij.jitakyoei.view.MainAppView;

public class MainAppControllerImpl implements MainAppController {
	MainAppView appView;
	AlunoModel alunoModel;
	
	@Override
	public void handleAtualizarAlunoAction() {	
		
	}

	@Override
	public void handleBuscarAlunoAction() {

	}

	@Override
	public void handleCadastrarAlunoAction() {
		try{
		System.out.println("MainAppControllerImpl.handleCadastrarAlunoAction()");
		AlunoCadastrarView alunoView = new AlunoCadastrarView();
		AlunoControllerImpl alunoController = new AlunoControllerImpl(alunoModel, alunoView);
		alunoView.registerController(alunoController);
		System.out.println(alunoController);
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
