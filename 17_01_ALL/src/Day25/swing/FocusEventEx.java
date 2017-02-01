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
		//�� �߰� 
		Panel p = new Panel(new GridLayout(3, 1));
		p.add(new Label("�̸� :"));
		p.add(new Label("��ȭ��ȣ :"));
		p.add(new Label("�ּ� :"));
		p.setBackground(Color.CYAN);
		add("West",p);
		
		
		//�ؽ�Ʈ �ʵ� �߰� 
		Panel p2 = new Panel(new GridLayout(3, 1));
		for(int i=0; i<tf.length;i++){
			tf[i] = new TextField();		//text �ʱ�ȭ 
			p2.add(tf[i]);
			tf[i].addFocusListener(this);
		}
		add("Center",p2);
		
	}
	
	
	
	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==tf[1]){
			
			if(tf[0].getText().trim().length() == 0){	//tf[0]�� �ؽ�Ʈ�� ������ ������ ����
				tf[0].setText("");
				
				try {
					Thread.sleep(3000);					//���� ���� �����Ÿ��� �Ѱ��ֱ� ���� 
				} catch (InterruptedException ee) {
					ee.printStackTrace();
				}
				tf[0].requestFocus();					

			}
			
		}
		if(e.getSource()==tf[2]){
			
			if(tf[1].getText().trim().length() == 0){	//tf[0]�� �ؽ�Ʈ�� ������ ������ ����
				tf[1].setText("");
				
				try {
					Thread.sleep(3000);					//���� ���� �����Ÿ��� �Ѱ��ֱ� ���� 
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
