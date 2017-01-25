package Day24.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class DialogEx extends Frame{

	private Dialog d = new Dialog(this,"��ȸ����",false);
	
	private Label dlb = new Label("�̸��� �ֹι�ȣ�� ��й�ȣ ã��");
	private Label dlb1 = new Label("�̸�:",Label.RIGHT);
	private Label dlb2 = new Label("�ֹι�ȣ:",Label.RIGHT);
	private Label dlb3 = new Label("-",Label.CENTER);
	
	private TextField dtf = new TextField(20);		//�̸�
	private TextField dtf1 = new TextField(6);		//�ֹι�ȣ ���ڸ�
	private TextField dtf2 = new TextField(7);		//�ֹι�ȣ ���ڸ�
	
	private Button but = new Button("ã��");
	private Button but1 = new Button("���");
	
	
	
	public DialogEx() {
		// TODO Auto-generated constructor stub
			super("Dialog ��ȭ����");
			
			setDialog();
			setSize(300,200);
			setVisible(true);
			d.setVisible(true);
			WinEvent event = new WinEvent();
			addWindowListener(event);
			d.addWindowListener(event);
			
			
	}
	
	private void setDialog(){
		
		d.setLayout(new BorderLayout()); 		//��ȭ ������ ���̾ƿ� ���� 
		d.add("North",dlb);
		
		//�г� ����
		
		Panel p1 = new Panel(new BorderLayout());		//����� ��ư������ ������ ��� ����
		Panel p2 = new Panel(new GridLayout(2, 1));		//�̸�, �ֹι�ȣ ���� ǥ���� ����
		
		p2.add(dlb1);									//�̸� ���� ǥ��
		p2.add(dlb2);									//�ֹι�ȣ �� ǥ��
		
		p1.add("West",p2);								//��ü ������ �̸�, �ֹι�ȣ �� ǥ��

		//�ؽ�Ʈ �Է� �г� ����
		Panel p3 = new Panel(new GridLayout(2, 1));
		Panel tfPanel = new Panel(new FlowLayout(FlowLayout.LEFT));	//�̸� �Է��ʵ� ����(��)
		
		tfPanel.add(dtf);								//�̸� �Է� �ʵ�
		p3.add(tfPanel);								//p3 = ����Է��ʵ念��(�г�),�̸��� �Էºκ��� �־��ش�.
		
		Panel p4 = new Panel(new FlowLayout(FlowLayout.LEFT));
		p4.add(dtf1);
		p4.add(dlb3);
		p4.add(dtf2);
		
		p3.add(p4);
		p1.add("Center", p3);
		d.add("Center",p1);
		
		//��ư�߰� 
		Panel p = new Panel(new FlowLayout());
		p.add(but);
		p.add(but1);
		
		d.add("South", p);
		
		d.setSize(260, 130);
		d.setResizable(false);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		new DialogEx();
		
		
	}
}
