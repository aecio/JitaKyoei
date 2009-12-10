package org.fpij.jitakyoei.util;

import org.fpij.jitakyoei.controller.MainAppController;
import org.fpij.jitakyoei.controller.MainAppControllerImpl;
import org.fpij.jitakyoei.view.MainAppView;

import com.pagosoft.plaf.PlafOptions;

public class Main {
	
	public static void main(String[] args) {
		PlafOptions.setAsLookAndFeel();
		MainAppController appController = new MainAppControllerImpl();
		MainAppView appView = new MainAppView();
		appView.regiterController(appController);
		appController.registerView(appView);
	}
}