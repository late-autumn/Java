package Day24.event;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Day24.awt.WinEvent;

import java.awt.*;
public class MouseEventEx extends Frame implements MouseListener {

	private Button bt = new Button("확인");
	private Button bt1 = new Button("취소");
	
	public MouseEventEx(){
		super("마우스 이벤트");
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
			System.out.println("마우스 버튼 누르다");
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		//버튼위로 올라갔다가 나오는 순간
		if(arg0.getSource()==bt1)
			System.out.println("취소버튼이다.");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==bt1){
			System.out.println("취소눌렀다.");
		}
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==bt1){
			System.out.println("취소눌렀다 놓았다.");
		}
	}
	
	public static void main(String[] args) {
		
		new MouseEventEx();
	}

}
