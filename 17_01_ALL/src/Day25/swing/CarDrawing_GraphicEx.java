package Day25.swing;

import java.awt.*;
import javax.swing.*;

public class CarDrawing_GraphicEx {

	
	public static void main(String[] args) {

		JFrame f = new JFrame("자동차 그리기");
		
		f.setLocation(500, 200);
		f.setPreferredSize(new Dimension(400,300));
		
		Container contentPane = f.getContentPane();
		
		CarDrawingPanel drawingPanel = new CarDrawingPanel();
		contentPane.add(drawingPanel);
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
		
		
		
		
	}
}
