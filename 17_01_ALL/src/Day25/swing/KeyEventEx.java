package Day25.swing;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyEventEx extends Frame implements KeyListener {

	Label label = new Label("주민번호:",Label.RIGHT);
	Label label2 = new Label("-",Label.CENTER);
	
	TextField text_field = new TextField(10);
	TextField text_field2 = new TextField(10);
	
	Button button = new Button("확인");
	
	public KeyEventEx() {
		// TODO Auto-generated constructor stub
		super("Key Event");
		setForm();
		setSize(400, 100);
		setVisible(true);
		WinEvent w = new WinEvent();
		addWindowListener(w);
		text_field.addKeyListener(this);
		text_field2.addKeyListener(this);
		button.addKeyListener(this);
	}
	
	public void setForm(){
		
		setLayout(new BorderLayout());
		add("West",label);
		
		Panel p = new Panel(new FlowLayout(FlowLayout.LEFT));
		p.add("West",text_field);
		p.add("Center",label2);
		p.add("East",text_field2);
		add("Center",p);
		
		Panel p2 = new Panel(new FlowLayout(FlowLayout.RIGHT));
		p2.add(button);
		add("South",p2);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button){
			System.exit(0);
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

		if(e.getSource()==text_field){
			if(text_field.getText().trim().length()==6){
				text_field2.requestFocus();
			}
		}
		if(e.getSource()==text_field2){
			if(text_field2.getText().trim().length()==7){
				button.requestFocus();
			}
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventEx();
	}

}
