package Day25.swing;

import java.awt.*;
import javax.swing.*;

public class JFrameEx extends JFrame{

	
	public JFrameEx() {
		super("JFrame Swing");
		
		JButton bt1 = new JButton("��");
		JButton bt2 = new JButton("��");
		JButton bt3 = new JButton("��");
		JButton bt4 = new JButton("��");

		//swing�� ������ �����̳ʸ� ����ؼ� add������Ѵ�. �����̳ʿ��� ������Ʈ�� ������
		Container con = getContentPane();
		//swing �̿� ��ư 
		con.add("North", bt1);
		
		//�̰� �����ӿ� �ø��� ���� add
		add("South",bt2);
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//x��ư�� �������� ���� ó��
 
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameEx();
	}

}
