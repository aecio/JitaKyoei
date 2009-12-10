package org.fpij.jitakyoei.view;

import java.awt.BorderLayout;

import org.fpij.jitakyoei.controller.MainAppController;
import org.fpij.jitakyoei.view.forms.MainAppForm;
import org.fpij.jitakyoei.view.gui.MainAppFrame;

public class MainAppView {
	MainAppFrame frame;
	MainAppForm form;
	
	public MainAppView() {
		frame = new MainAppFrame();
		form = new MainAppForm(frame);
		frame.setVisible(true);
	}
	
	public void display(AlunoView alunoView){
		frame.getMainPanel().add(alunoView.getGui(), BorderLayout.CENTER);
		frame.validate();
		System.out.println("MainAppView.display()");
	}
	
	public void regiterController(MainAppController appController){
		form.registerController(appController);
	}
}
