package Day26.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.*;
import java.applet.*;
import java.net.*;
public class AudioExPlayActionListener implements ActionListener {

	JTextField text;
	
	public AudioExPlayActionListener(JTextField text) {
		// TODO Auto-generated constructor stub
		this.text = text;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			
			File file = new File(text.getText());
			AudioClip audioclip = Applet.newAudioClip(file.toURL());
			audioclip.play();
			
		} catch (MalformedURLException mue) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(text, "잘못된 파일명입니다.","에러메세지",JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
