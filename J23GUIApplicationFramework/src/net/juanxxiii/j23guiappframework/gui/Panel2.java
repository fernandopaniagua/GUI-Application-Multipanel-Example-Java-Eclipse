package net.juanxxiii.j23guiappframework.gui;

import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;

public class Panel2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public Panel2() {
		setBackground(SystemColor.inactiveCaption);
		
		JLabel lblPanel = new JLabel("PANEL 2");
		add(lblPanel);

	}

}
