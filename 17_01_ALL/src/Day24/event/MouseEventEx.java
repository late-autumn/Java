package Day24.event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Day24.awt.WinEvent;

import java.awt.*;
public class MouseEventEx extends Frame implements MouseListener {

	private Button bt = new Button("Ȯ��");
	private Button bt1 = new Button("���");
	
	public MouseEventEx(){
		super("���콺 �̺�Ʈ");
		setLayout(new FlowLayout());
		add(bt);
		add(bt1);
		bt.addMouseListener(this);
		bt1.addMouseListener(this);
		
		setSize(300,200);
		setVisible(true);
		WinEvent event = new WinEvent();
		addWindowListener(event);
	
		
	}
	
	
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==bt){
			System.out.println("���콺 ��ư ������");
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		//��ư���� �ö󰬴ٰ� ������ ����
		if(arg0.getSource()==bt1)
			System.out.println("��ҹ�ư�̴�.");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==bt1){
			System.out.println("��Ҵ�����.");
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==bt1){
			System.out.println("��Ҵ����� ���Ҵ�.");
		}
	}
	
	public static void main(String[] args) {
		
		new MouseEventEx();
	}

}
