package Day23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
public class TextEx2 extends Frame implements ActionListener {

	private TextField tf = new TextField(10);

	public TextEx2() {
		super("Text Event");
		
		setLayout(new FlowLayout());
		
		add(tf);
		
		setSize(300,200);
		setVisible(true);
		
		tf.addActionListener(this);
		
		WinEvent event = new WinEvent();
		addWindowListener(event);
		
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트 실행 메소드 

		if(e.getSource()==tf){
			String imsi = tf.getText();
			System.out.println("메세지:"+imsi);
			tf.setText("");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new TextEx2();
	}

}
