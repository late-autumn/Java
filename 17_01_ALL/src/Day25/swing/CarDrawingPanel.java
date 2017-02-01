package Day25.swing;

import javax.swing.JPanel;
import java.applet.*;
import java.awt.Graphics;

import javax.swing.*;

public class CarDrawingPanel extends JPanel{

	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawRect(100, 110, 200, 40);
		g.drawRect(150, 70, 100, 40);
		g.drawOval(125, 150, 30,30);
		g.drawOval(250, 150, 30, 30);
		g.drawLine(50, 180, 350, 180);
	}
	
	
}
