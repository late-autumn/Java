package Day24.event;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Day24.awt.WinEvent;

public class ActionEventEx1 extends Frame implements ActionListener {

	private Button bt = new Button("Ȯ��");
	private Button bt2 = new Button("����");
	public ActionEventEx1() {
		// TODO Auto-generated constructor stub
		super("��ư �̺�Ʈ");
		
		setLayout(new FlowLayout());
		add(bt);
		add(bt2);
		bt.addActionListener(this);
		bt2.addActionListener(this);
		WinEvent event = new WinEvent();
		addWindowListener(event);
		setSize(300, 200);
		setVisible(true);
		
	}

	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==bt){
		System.out.println("�� ������ ");
		}else if(arg0.getSource()==bt2){
		System.out.println("����?");
		System.exit(0);
		}
	}

	
	
	public static void main(String[] args) {
		
		new ActionEventEx1();
	}
}
