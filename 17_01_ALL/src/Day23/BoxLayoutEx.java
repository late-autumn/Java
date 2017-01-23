package Day23;
import java.awt.*;
import javax.swing.*;
public class BoxLayoutEx extends JFrame{

	private JButton bt1, bt2, bt3, bt4, bt5;
	
	public BoxLayoutEx(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("박스 레이아웃");
		setSize(300,180);
		
		Container cp = getContentPane();
		//cp.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS)); //Y축 수직으로 나열 X로 바꾸면 수평으로 나열
		//cp.setLayout(new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS));
		cp.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);	//오른쪽에서 왼쪽으로 정렬 
		cp.setLayout(new BoxLayout(getContentPane(), BoxLayout.LINE_AXIS));
	
		bt1 = new JButton("버튼1");
		bt2 = new JButton("Button2");
		bt3 = new JButton("BoxLayout 3");
		bt4 = new JButton("BoxLayout.X_AXIS 4");
		bt5 = new JButton("BoxLayout.Y_AXIS 5");
		
		
		add(bt1);add(bt2);add(bt3);add(bt4);add(bt5);
		setVisible(true);
		
	}
	

	
	
	public static void main(String[] args) {
		new BoxLayoutEx();
		
	}
}
