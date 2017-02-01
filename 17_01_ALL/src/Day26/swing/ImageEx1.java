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
		
		JFrame f = new JFrame("�̹��� �ε�");
		
		//�������� ��ġ ����

		f.setPreferredSize(new Dimension(500, 400));
		f.setLocation(500,200);		
		Container contentPane = f.getContentPane();
		ImageEx2 imagePanel = new ImageEx2();
		
		contentPane.add(imagePanel,BorderLayout.CENTER);
				
		//�ؽ�Ʈ �ʵ�� ��ư�� �гο� ��ġ
		JPanel controlPanel = new JPanel();
		JTextField text = new JTextField(30);
		JButton button = new JButton("�̹��� �ε�");
		
		controlPanel.add(text);
		controlPanel.add(button);
		
		contentPane.add(controlPanel, BorderLayout.SOUTH);
		button.addActionListener(new ImageEx2LoadActionListener(text,imagePanel));
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
		
		
	}
}
