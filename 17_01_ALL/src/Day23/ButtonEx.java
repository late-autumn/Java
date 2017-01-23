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
		super("버튼");
		
		setLayout(new GridLayout(4,3,5,5)); 		//가로와 세로 그리고 가로와 세로 사이의 간격 
		
		for(int i=0; i<bt.length;i++){
			bt[i] = new Button(str[i]);
			bt[i].setFont(new Font("굴림체",Font.BOLD,40));
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
