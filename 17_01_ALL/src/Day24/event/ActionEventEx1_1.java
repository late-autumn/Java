package Day24.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Day24.awt.WinEvent;
public class ActionEventEx1_1 extends Frame{

	private Button bt = new Button("버튼");
	
	
	public ActionEventEx1_1() {
		super("this외 처리법");
		setLayout(new BorderLayout());
		add(bt);
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("자체 처리 오버라이딩");
				
			}
		});
		
		setSize(300, 200);
		setVisible(true);
		WinEvent event = new WinEvent();
		addWindowListener(event);
		
	
	}
	
	
	
	
	
	public static void main(String[] args) {
		new ActionEventEx1_1();
	}
}
