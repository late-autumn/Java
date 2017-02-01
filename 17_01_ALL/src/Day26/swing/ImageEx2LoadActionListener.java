package Day26.swing;

import java.awt.event.*;
import javax.swing.*;

public class ImageEx2LoadActionListener implements ActionListener {

	JTextField text ;
	ImageEx2 imagePanel;
	
	public ImageEx2LoadActionListener(JTextField text,ImageEx2 imagePanel) {
		this.text = text;
		this.imagePanel = imagePanel;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		imagePanel.setPath(text.getText());	//text에서 getText로 이름을 가져올수있다.
		imagePanel.repaint();
		
	}

}
