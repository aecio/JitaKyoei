package org.fpij.jitakyoei.util;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.facade.AppFacadeImpl;
import org.fpij.jitakyoei.view.AppView;
import org.fpij.jitakyoei.view.MainAppView;

public class Main {
	
	public static void main(String[] args) {
//		new StartupHelper().initialize();
//		PlafOptions.setAsLookAndFeel();
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
		AppView view = new MainAppView();
		AppFacade facade = new AppFacadeImpl(view);
		view.registerFacade(facade);
	}
}