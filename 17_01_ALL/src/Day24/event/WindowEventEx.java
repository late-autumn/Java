package Day24.event;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowEventEx extends Frame implements WindowListener {

	public WindowEventEx() {
		// TODO Auto-generated constructor stub
		super("Listener 이용 윈도우 종료");
		addWindowListener(this);
		
		setSize(300,200);
		setVisible(true);
		
	}
	
	
	
	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		// 윈도우가 닫히고 나서 
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		//종료버튼 눌렀을때 처리
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		//윈도우 열릴 때 
	}
	
	public static void main(String[] args) {
		new WindowEventEx();
	}
}
