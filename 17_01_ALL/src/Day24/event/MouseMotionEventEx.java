package Day24.event;

import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import Day24.awt.WinEvent;

public class MouseMotionEventEx extends Frame implements MouseMotionListener {

	public MouseMotionEventEx() {
		super("마우스 모션 이벤트");
		
		
		setSize(300,200);
		setVisible(true);
		WinEvent event = new WinEvent();
		addWindowListener(event);
		addMouseMotionListener(this);
	}
	
	
	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==this)
			System.out.println("X:"+arg0.getX()+", Y:"+arg0.getY());
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

		if(arg0.getSource()==this)
			System.out.println("X:"+arg0.getX()+", Y:"+arg0.getY());
	}
	public static void main(String[] args) {
		new MouseMotionEventEx();
	}

}
