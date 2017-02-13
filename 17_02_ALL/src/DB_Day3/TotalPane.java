package DB_Day3;
import javax.swing.*;

public class TotalPane extends JPanel{

	
	public TotalPane() {
		// TODO Auto-generated constructor stub
		
		this.setLayout(null);
		
		JTable table = new JTable(new EmployeModel());
		JScrollPane jp = new JScrollPane(table);
		jp.setBounds(10,100,500,400);
		add(jp);
	}
	
}
