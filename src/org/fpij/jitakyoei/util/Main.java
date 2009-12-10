package org.fpij.jitakyoei.util;

import java.util.Locale;

import net.java.dev.genesis.helpers.StartupHelper;

import org.fpij.jitakyoei.view.gui.FPIJ_App;

public class Main {
	
	public static void main(String[] args) {
		//PlafOptions.setAsLookAndFeel();
//		new StartupHelper().initialize();
		
		FPIJ_App app = new FPIJ_App();
		
		app.setVisible(true);
	}
}