package Day25.swing;
import java.awt.*;
import javax.swing.*;
public class JTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("학생정보");
		f.setPreferredSize(new Dimension(300,200));
		f.setLocation(500, 400);
		Container content_Pane = f.getContentPane();
		
		String[] col_name = {"이름","나이","성별"};		//컬럼 이름
		
		Object data[][] = {
				{"가나다",60,'남'},
				{"라마바",50,'여'},
				{"사아자",40,'남'},
				{"차카타",30,'여'},
				{"파하",20,'남'}				
		};
		JTable table = new JTable(data,col_name);
		JScrollPane scroll_pane = new JScrollPane(table);
		content_Pane.add(scroll_pane, BorderLayout.CENTER);
		
		JPanel panl = new JPanel(new GridLayout(2, 1));
		
		JButton button = new JButton("출력");
		
		button.addActionListener(new JTable_PrintActionListener(table)); 
		//content_Pane.add(button, BorderLayout.SOUTH);
		
		JButton button2 = new JButton("추가");
		button2.addActionListener(new JTable_PrintActionListener(table));
		panl.add("West",button);
		panl.add("South", button2);
		content_Pane.add(panl,BorderLayout.SOUTH);
	//	content_Pane.add(button2, BorderLayout.WEST);
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
		
		
		
	}

}
