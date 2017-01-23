package Day23;

import java.awt.*;

public class ButtonEx extends Frame{

	private String[] str ={
			"7","8","9",
			"4","5","6",
			"1","2","3",
			"#","0","*"
	};
	private Button[] bt = new Button[str.length];

	public ButtonEx() {
		super("��ư");
		
		setLayout(new GridLayout(4,3,5,5)); 		//���ο� ���� �׸��� ���ο� ���� ������ ���� 
		
		for(int i=0; i<bt.length;i++){
			bt[i] = new Button(str[i]);
			bt[i].setFont(new Font("����ü",Font.BOLD,40));
			add(bt[i]);
		}
		
		setSize(400,400);
		setVisible(true);
		WinEvent event = new WinEvent();
		addWindowListener(event);
		
		
		
	}
	
	public static void main(String[] args) {
		new ButtonEx();
	}
}
