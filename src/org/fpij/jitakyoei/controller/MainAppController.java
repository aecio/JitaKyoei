package org.fpij.jitakyoei.controller;

import org.fpij.jitakyoei.view.MainAppView;

public interface MainAppController {
	public void handleCadastrarAlunoAction();
	public void handleAtualizarAlunoAction();
	public void handleBuscarAlunoAction();
	public void registerView(MainAppView appView);
}
