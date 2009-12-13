package org.fpij.jitakyoei.util;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import org.fpij.jitakyoei.view.MainAppView;

public class Main {
	
	public static void main(String[] args) {
//		PlafOptions.setAsLookAndFeel();
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		    	System.out.println(info.getName());
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}
		new MainAppView();
	}
}