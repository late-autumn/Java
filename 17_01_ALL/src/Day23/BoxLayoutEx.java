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
		cp.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
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
