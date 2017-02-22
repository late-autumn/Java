package Day24.event;

import java.awt.*;
import java.awt.event.*;
public class WindowEventEx3 extends Frame{

	public WindowEventEx3() {
		// TODO Auto-generated constructor stub
		super("익명클래스를 이용한 윈도우 종료 ");
	
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
			System.exit(0);
			}
		});
		
		setSize(300, 200);
		setVisible(true);
	
	
	}
	
	public static void main(String[] args) {
		new WindowEventEx3();
	}
}
