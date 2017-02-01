package Day25.swing;

import java.awt.*;
import javax.swing.*;

public class JFrameEx extends JFrame{

	
	public JFrameEx() {
		super("JFrame Swing");
		
		JButton bt1 = new JButton("북");
		JButton bt2 = new JButton("남");
		JButton bt3 = new JButton("동");
		JButton bt4 = new JButton("서");

		//swing은 담을때 컨테이너를 사용해서 add해줘야한다. 컨테이너에서 컴포넌트를 가져옴
		Container con = getContentPane();
		//swing 이용 버튼 
		con.add("North", bt1);
		
		//이건 프레임에 올리기 위한 add
		add("South",bt2);
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//x버튼을 눌렀을때 종료 처리
 
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameEx();
	}

}
