package Day26.swing;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AudioEx {

	public static void main(String[] args) {
		
	JFrame f = new JFrame("����� �÷��̾�");
		
		//�������� ��ġ ����

		f.setPreferredSize(new Dimension(500, 400));
		f.setLocation(500,200);		
		Container contentPane = f.getContentPane();
		
		contentPane.setLayout(new FlowLayout());
		
		JTextField text = new JTextField(30);
		JButton button = new JButton("�÷���");
		
		contentPane.add(text);
		contentPane.add(button);
		button.addActionListener(new AudioExPlayActionListener(text));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.pack();
	
		
		
	}
	
}
