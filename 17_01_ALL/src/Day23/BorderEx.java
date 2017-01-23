package Day23;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;

public class BorderEx extends Frame{

	Label a,b,c,d,e;
	public BorderEx(){
		super("Border Layout");

		setLayout(new BorderLayout());
		
		a = new Label("↑",Label.CENTER);
		b = new Label("↓",Label.CENTER);
		c = new Label("←",Label.CENTER);
		d = new Label("→",Label.CENTER);
		e = new Label("○",Label.CENTER);
		
		//전체 배경 설정
		setBackground(Color.GRAY);
		//바탕색 설정
		a.setBackground(Color.red);
		b.setBackground(Color.YELLOW);
		c.setBackground(Color.GREEN);
		d.setBackground(Color.blue);
		e.setBackground(Color.magenta);
		
		//전경색 설정
		a.setForeground(Color.WHITE);
		b.setForeground(Color.WHITE);
		c.setForeground(Color.WHITE);
		d.setForeground(Color.WHITE);
		e.setForeground(Color.WHITE);
		
		//border에 레이아웃 추가
		add("North",a);
		add("South",b);
		add(c,BorderLayout.WEST);
		add("East",d);
		add(e);
		
		setLocation(500, 300);	//실행창 위치 
		
		//setSize(400, 300);	//size 대신 pack() 사용 
		pack();					//크기 변경 가능 
		
		setVisible(true);
		
		WinEvent event = new WinEvent();
		addWindowListener(event);
		
		
		
	}
	
	
	
	public static void main(String[] args) {
	
		new BorderEx();
	}
}
