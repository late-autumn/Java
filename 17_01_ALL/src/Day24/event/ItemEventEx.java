package Day24.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import Day24.awt.WinEvent;

import java.awt.*;

public class ItemEventEx extends Frame implements ItemListener, ActionListener {

	private Label lb = new Label("������:", Label.RIGHT);
	private Label lb1 = new Label("�������:", Label.RIGHT);
	private Label lb2 = new Label("����:", Label.RIGHT);

	// textField

	private TextField blood_Type = new TextField();
	private TextField area = new TextField();
	private TextField birth_Type = new TextField();

	// choice
	private Choice year = new Choice();
	private Choice month = new Choice();
	private Choice day = new Choice();
	private Choice blood_choice = new Choice();

	private List list = new List(3, false);

	private Button end_button = new Button("������");

	public ItemEventEx() {
		super("�׸� �̺�Ʈ");
		setForm();
		blood_Type.setEditable(false);
		area.setEditable(false);
		birth_Type.setEditable(false);
		
		blood_choice.addItemListener(this);
		day.addItemListener(this);
		list.addItemListener(this);
		list.addActionListener(this);
		end_button.addActionListener(this);
		setSize(400, 300);
		setVisible(true);
		WinEvent event = new WinEvent();
		addWindowListener(event);
		

	}

	public void setForm() {

		setLayout(new GridLayout(2, 1));

		Panel p = new Panel(new BorderLayout());

		Panel p1_label = new Panel(new GridLayout(3, 1));
		p1_label.add(lb);
		p1_label.add(lb1);
		p1_label.add(lb2);
		p.add("West", p1_label);

		Panel p2_text_field = new Panel(new GridLayout(3, 1));
		p2_text_field.add(blood_Type);
		p2_text_field.add(birth_Type);
		p2_text_field.add(area);
		p.add("Center", p2_text_field);

		Panel p3_choice = new Panel(new GridLayout(4, 1));
		p3_choice.add(blood_choice);
		p3_choice.add(year);
		p3_choice.add(month);
		p3_choice.add(day);

		blood_choice.add("A��");
		blood_choice.add("B��");
		blood_choice.add("O��");
		blood_choice.add("AB��");

		for(int i=1980;i<=2017;i++){
			year.add(i+"��");
		}
		for(int i=1;i<=12;i++){
			month.add(i+"��");
		}
		for(int i=1;i<=31;i++){
			day.add(i+"��");
		}
		add(p);		
		p.add("East", p3_choice);

		Panel p4 =new Panel(new BorderLayout());
		p4.add("Center",list);
		p4.add("East", end_button);
		
		list.add("����");
		list.add("���");
		list.add("����");
		list.add("������");
		list.add("��û��");
		list.add("����");
		list.add("����");
		list.add("���ֵ�");
		
		add(p4);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		// �����ۿ� ����method
		if(e.getSource()==blood_choice){
			
			String imsi  = blood_choice.getSelectedItem();
			blood_Type.setText(imsi);
		
		}else if(e.getSource()==day){
			
			String imsi = year.getSelectedItem();
			String imsi1 = month.getSelectedItem();
			String imsi2 = day.getSelectedItem();
			birth_Type.setText(imsi+imsi1+imsi2);
		
		}else if(e.getSource()==list){
			
			String imsi = list.getSelectedItem();
			area.setText(imsi+"����");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// �׼ǿ� ���� method
		if(e.getSource()==list){
			
			int i= list.getSelectedIndex();
			list.remove(i);
		}
		else if (e.getSource()==end_button){
			System.exit(0);
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ItemEventEx();
	}

}
