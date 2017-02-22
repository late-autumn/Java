package Day23;

import java.awt.*;


public class FrameEx2 extends Frame{

	public FrameEx2() {
		// TODO Auto-generated constructor stub
		super("프레임");			//제목
		setSize(300,200);			//프레임 크기 설정
		WinEvent event = new WinEvent();
		addWindowListener(event);

		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		
		new FrameEx2();
	}
}
