package Day23;

import java.awt.*;


public class FrameEx2 extends Frame{

	public FrameEx2() {
		// TODO Auto-generated constructor stub
		super("������");			//����
		setSize(300,200);			//������ ũ�� ����
		WinEvent event = new WinEvent();
		addWindowListener(event);

		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		
		new FrameEx2();
	}
}
