package Day25.swing;
import javax.swing.*;
import javax.swing.table.TableModel;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTable_PrintActionListener implements ActionListener {

	JTable table;
	
	public JTable_PrintActionListener(JTable table) {
		// TODO Auto-generated constructor stub
		this.table = table;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

		//모델을 가져온다.
		TableModel model = table.getModel();
		
		//모델에서 행과 열의 수를 가져옴
		int rowNum = model.getRowCount();
		int colNum = model.getColumnCount();
		
		//컬럼 이름을 가져와서 출력
		for(int col = 0; col<colNum;col++){
			String colName = model.getColumnName(col);
			System.out.print(colName+"\t");
		}
		//테이블을 데이터로 가져와 출력 
		System.out.println();
		
		for(int row=0;row<rowNum;row++){
			for(int col = 0; col<colNum;col++){
				Object obj = model.getValueAt(row, col);
				System.out.print(obj+"\t");
			}
			System.out.println();
		}
		System.out.println("------------------------");
	}

}
