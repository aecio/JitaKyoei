package org.fpij.jitakyoei.view;

import org.fpij.jitakyoei.facade.AppFacade;

public interface AppView {
	public void handleModelChange(Object obj);
	public void displayException(Exception e);
	public void registerFacade(AppFacade facade);
}
