package Day25.swing;

import java.awt.*;
import java.awt.event.*;

public class FocusEventEx extends Frame implements FocusListener {

	private TextField[] tf = new TextField[3];
	
	public FocusEventEx() {
		super("Focus Event");
		
		setForm();
		setSize(300, 200);
		setVisible(true);
		
		WinEvent w = new WinEvent();
		addWindowListener(w);
		
	
	}	
	
	public void setForm(){
		
		setLayout(new BorderLayout());
		//라벨 추가 
		Panel p = new Panel(new GridLayout(3, 1));
		p.add(new Label("이름 :"));
		p.add(new Label("전화번호 :"));
		p.add(new Label("주소 :"));
		p.setBackground(Color.CYAN);
		add("West",p);
		
		
		//텍스트 필드 추가 
		Panel p2 = new Panel(new GridLayout(3, 1));
		for(int i=0; i<tf.length;i++){
			tf[i] = new TextField();		//text 초기화 
			p2.add(tf[i]);
			tf[i].addFocusListener(this);
		}
		add("Center",p2);
		
	}
	
	
	
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf[1]){
			
			if(tf[0].getText().trim().length() == 0){	//tf[0]의 텍스트의 공백을 제거한 길이
				tf[0].setText("");
				
				try {
					Thread.sleep(3000);					//글자 쓸때 깜빡거림을 넘겨주기 위해 
				} catch (InterruptedException ee) {
					ee.printStackTrace();
				}
				tf[0].requestFocus();					

			}
			
		}
		if(e.getSource()==tf[2]){
			
			if(tf[1].getText().trim().length() == 0){	//tf[0]의 텍스트의 공백을 제거한 길이
				tf[1].setText("");
				
				try {
					Thread.sleep(3000);					//글자 쓸때 깜빡거림을 넘겨주기 위해 
				} catch (InterruptedException ee) {
					ee.printStackTrace();
				}
				tf[1].requestFocus();					

			}
			
		}
		
		
		
	}

	@Override
	public void focusLost(FocusEvent e) {}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FocusEventEx();
	}

}
