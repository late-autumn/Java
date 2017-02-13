package DB_Day3;
//사원 전체를 보기 위한 객체

import java.util.*;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

public class EmployeModel extends AbstractTableModel{

	Object[][] data;
	Object[] columnName;
	
	EmployeeDAO emDao = new EmployeeDAO();
	EmployeeVO emVo;
	ArrayList<String> title;
	ArrayList<EmployeeVO> list;
	
	public EmployeModel() {				//생성자
		
		title = emDao.getColumnName();
		columnName = title.toArray();
		int columnCount = title.size();
		
		list = emDao.getEmployeetotal();
		
		int rowCount = list.size();
		
		data = new Object[rowCount][columnCount];
		
		for(int index =0; index < rowCount; index++){
			
			emVo = list.get(index);
			data[index][0] = emVo.getNo();
			data[index][1] = emVo.getName();
			data[index][2] = emVo.getJobGrade();
			data[index][3] = emVo.getDepartment();
			data[index][4] = emVo.getEmail();
			
		}
		
		
	}
	
	
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		if(columnName ==null){
			return 0;
		}
		else
		return columnName.length;
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		if(data == null){
		return 0;
		}
		else
			return data.length;
	}
	
	
	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return (String)columnName[column];
	}
	
	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex];
	}
	
	
	
	
	
	
}
