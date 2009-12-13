package org.fpij.jitakyoei.util;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
 
/**
 * This class encapsulates an icon that can be added to the selector tab of a JTabbedPane to allow 
 * clicks upon it to close its owning tab.
 * <p>
 * Created on 19/06/2006 by Tim Ryan
 */
public class CloseTabIcon implements Icon {
 
	private final Icon icon;
	private JTabbedPane tabbedPane = null;
	private transient Rectangle position = null;
 
	/**
	 * Creates a new instance of CloseTabIcon.
	 */
	public CloseTabIcon() {
		this.icon = new ImageIcon(CloseTabIcon.class.getResource("/close.gif"));
	}
 
	/**
	 * when painting, remember last position painted so we can see if the user clicked on the icon.
	 */
	public void paintIcon(Component component, Graphics g, int x, int y) {
 
		// Lazily create a link to the owning JTabbedPane and attach a listener to it, so clicks on the
		// selector tab can be intercepted by this code.
		if (tabbedPane == null) {
			tabbedPane = (JTabbedPane) component;
 
			tabbedPane.addMouseListener(new MouseAdapter() {
 
				@Override
				public void mouseReleased(MouseEvent e) {
					// asking for isConsumed is *very* important, otherwise more than one tab might get closed!
					if (! e.isConsumed() && position.contains(e.getX(), e.getY())) {
						Component c = tabbedPane.getSelectedComponent();
						tabbedPane.remove(c);
						e.consume();
					}
				}
			});
		}
 
		position = new Rectangle(x, y, getIconWidth(), getIconHeight());
		icon.paintIcon(component, g, x, y);
	}
 
	/**
	 * just delegate
	 */
	public int getIconWidth() {
		return icon.getIconWidth();
	}
 
	/**
	 * just delegate
	 */
	public int getIconHeight() {
		return icon.getIconHeight();
	}
 
}