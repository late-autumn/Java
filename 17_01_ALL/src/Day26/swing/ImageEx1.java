package Day26.swing;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ImageEx1 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("이미지 로딩");
		
		//프레임의 위치 설정

		f.setPreferredSize(new Dimension(500, 400));
		f.setLocation(500,200);		
		Container contentPane = f.getContentPane();
		ImageEx2 imagePanel = new ImageEx2();
		
		contentPane.add(imagePanel,BorderLayout.CENTER);
				
		//텍스트 필드와 버튼을 패널에 위치
		JPanel controlPanel = new JPanel();
		JTextField text = new JTextField(30);
		JButton button = new JButton("이미지 로딩");
		
		controlPanel.add(text);
		controlPanel.add(button);
		
		contentPane.add(controlPanel, BorderLayout.SOUTH);
		button.addActionListener(new ImageEx2LoadActionListener(text,imagePanel));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
		
		
	}
}
