package Day24.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Day24.awt.WinEvent;
public class ActionEventEx1_1 extends Frame{

	private Button bt = new Button("��ư");
	
	
	public ActionEventEx1_1() {
		super("this�� ó����");
		setLayout(new BorderLayout());
		add(bt);
		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("��ü ó�� �������̵�");
				
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
