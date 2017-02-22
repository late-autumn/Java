package Day25.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Label;
import java.awt.Panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JTableEx2 {

	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		JFrame f = new JFrame("학생정보");
		f.setPreferredSize(new Dimension(300,200));
		f.setLocation(500, 400);
		Container content_Pane = f.getContentPane();
		
		String[] col_names = {"이름","나이","성별"};		//컬럼 이름
		
		DefaultTableModel model = new DefaultTableModel(col_names, 0);
		JTable table = new JTable(model);
		
		JScrollPane scrollPane = new JScrollPane(table);
		content_Pane.add(scrollPane, BorderLayout.CENTER);
		
		//패널 추가 
		Panel panel = new Panel();
		
		//텍스트 필드 추가 
		JTextField tx1 = new JTextField(10);
		JTextField tx2 = new JTextField(3);
		JTextField tx3 = new JTextField(2);
		
		//버튼 추가
		
		JButton button1 = new JButton("추가");
		JButton button2 = new JButton("삭제");

		panel.add(new Label("이름"));
		panel.add(tx1);
		panel.add(new Label("나이"));
		panel.add(tx2);
		panel.add(new Label("성별"));
		panel.add(tx3);
		
		panel.add(button1);
		panel.add(button2);
		
		content_Pane.add(panel,BorderLayout.SOUTH);
		
		//추가버튼 
		button1.addActionListener(new JTable_AddActionListener(table, tx1, tx2, tx3));
		//삭제버튼
		button2.addActionListener(new JTable_RemoveActionListener(table));
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
		f.setVisible(true);
		
		
	}
}
