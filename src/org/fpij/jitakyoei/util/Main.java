package org.fpij.jitakyoei.util;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

import org.fpij.jitakyoei.view.MainAppView;

public class Main {
	
	public static void main(String[] args) {
//		PlafOptions.setAsLookAndFeel();
		try {
		    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
		        if ("Nimbus".equals(info.getName())) {
		            UIManager.setLookAndFeel(info.getClassName());
		            break;
		        }
		    }
		} catch (Exception e) {
		    // If Nimbus is not available, you can set the GUI to another look and feel.
		}
		new MainAppView();
	}
}