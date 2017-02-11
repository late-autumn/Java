package DB_Day3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
/*
 * DAO(Data Access Object)Ŭ������ �������� ó���� �ϴ� �ܰ�
 * �ڷḦ �޾� �����ͺ��̽��� �Է°� ��ȸ�� �� ����
 */

public class EmployeeDAO {

	// �Ʒ��� �޼ҵ���� ���������� preparedStatement()�޼ҵ� ȣ���Ͽ� ������ �������
	// �����ͺ��̽��� ������ PreparedStatement ��ü�� ����

	// �ű� ����� ���
	public EmployeeVO getEmployeeregiste(EmployeeVO evo) throws Exception {

		// �������� ��
		String dml = "insert into employee (no, name, jobgrade, department, email)" + "values "
				+ "(employee_seq.nextval, ?,?,?,?)";

		Connection con = null;
		PreparedStatement pstmt = null;
		EmployeeVO retval = null;

		try {

			// DBUtil Ŭ������ getConnection() �޼ҵ�� �����ͺ��̽��� ����
			con = DBUtil.getConnection();

			// �Է¹��� ����� ������ ó���ϱ� ���� sql�� ����
			pstmt = con.prepareStatement(dml);

			pstmt.setString(1, evo.getName());
			pstmt.setString(2, evo.getJobGrade());
			pstmt.setInt(3, evo.getDepartment());
			pstmt.setString(4, evo.getEmail());

			// sql���� ������ ó�� ����� ����
			int i = pstmt.executeUpdate();

			retval = new EmployeeVO();

			// sql�� �������� EmployeeVO�� �����Ѵ�.
			retval.setStatus(i + " ");
		} catch (SQLException e) {
			System.out.println("e:[" + e + "]");
		} catch (Exception e) {
			System.out.println("e:[" + e + "]");
		} finally {
			try {
				// �����ͺ��̽��� ����Ǿ��� ������Ʈ ����
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException s) {
				System.out.println("s:["+s+"]");
			}
		}
		return retval;
	} // end getEmployssregiste()

	// ����� no, name�� �Է¹޾� ���������ȸ
	public EmployeeVO getEmployeeCheck(int no, String name) throws Exception{
	      
	      String dml = "select * from employee where no =? and name =? ";
	      
	      Connection con = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      EmployeeVO retval = null;
	    		  
	      try{
	    	 con = DBUtil.getConnection();
	    		  
	    	 pstmt = con.prepareStatement(dml);
	    	 pstmt.setInt(1, no);
	    	 pstmt.setString(2, name);
	    	
	    	 rs = pstmt.executeQuery();
	    	 
	    	 if(rs.next()){
	    		 retval = new EmployeeVO(
	    				 rs.getInt(1),
	    				 rs.getString(2),
	    				 rs.getString(3),
	    				 rs.getInt(4),
	    				 rs.getString(5));
	    	}
	      } catch (SQLException e) {
				System.out.println("e:[" + e + "]");
			} catch (Exception e) {
				System.out.println("e:[" + e + "]");
			} finally {
				try {
					// �����ͺ��̽��� ����Ǿ��� ������Ʈ ����
					if (pstmt != null)
						pstmt.close();
					if (con != null)
						con.close();
					if(rs != null)
						rs.close();
				} catch (SQLException s) {
					System.out.println("s:["+s+"]");
				}
			}
			return retval;
		} // end getEmployeeCheck()

	// ����� no�� �Է¹޾� ������ ��ȸ
	public EmployeeVO getEmployeeNo(int no) throws Exception {
		
	      String dml = "select * from employee where no =?  ";
	      
	      Connection con = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      EmployeeVO retval = null;
	    		  
	      try{
	    	 con = DBUtil.getConnection();
	    		  
	    	 pstmt = con.prepareStatement(dml);
	    	 pstmt.setInt(1, no);

	    	 rs = pstmt.executeQuery();
	    	 
	    	 if(rs.next()){
	    		 retval = new EmployeeVO(
	    				 rs.getInt(1),
	    				 rs.getString(2),
	    				 rs.getString(3),
	    				 rs.getInt(4),
	    				 rs.getString(5));
	    	}
	      } catch (SQLException e) {
				System.out.println("e:[" + e + "]");
			} catch (Exception e) {
				System.out.println("e:[" + e + "]");
			} finally {
				try {
					// �����ͺ��̽��� ����Ǿ��� ������Ʈ ����
					if (pstmt != null)
						pstmt.close();
					if (con != null)
						con.close();
					if(rs != null)
						rs.close();
				} catch (SQLException s) {
					System.out.println("s:["+s+"]");
				}
			}
			return retval;
	}

	// ����� name�� �Է¹޾� ������ ��ȸ
	public EmployeeVO getEmployeeName(String name) throws Exception {
	      String dml = "select * from employee where name =? ";
	      
	      Connection con = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      EmployeeVO retval = null;
	    		  
	      try{
	    	 con = DBUtil.getConnection();
	    		  
	    	 pstmt = con.prepareStatement(dml);
	    	 pstmt.setString(1, name);
	    	
	    	 rs = pstmt.executeQuery();
	    	 
	    	 if(rs.next()){
	    		 retval = new EmployeeVO(
	    				 rs.getInt(1),
	    				 rs.getString(2),
	    				 rs.getString(3),
	    				 rs.getInt(4),
	    				 rs.getString(5));
	    	}
	      } catch (SQLException e) {
				System.out.println("e:[" + e + "]");
			} catch (Exception e) {
				System.out.println("e:[" + e + "]");
			} finally {
				try {
					// �����ͺ��̽��� ����Ǿ��� ������Ʈ ����
					if (pstmt != null)
						pstmt.close();
					if (con != null)
						con.close();
					if(rs != null)
						rs.close();
				} catch (SQLException s) {
					System.out.println("s:["+s+"]");
				}
			}
			return retval;
	}
	//��ü ��� ��ȸ 
	public ArrayList<EmployeeVO>getEmployeetotal(){
		
		  ArrayList<EmployeeVO> list = new ArrayList<>();
	      String tml = "select * from employee ";
	      
	      Connection con = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      EmployeeVO emVO = null;
	    		  
	      try{
	    	 con = DBUtil.getConnection();
	    		  
	    	 pstmt = con.prepareStatement(tml);
	    	
	    	 rs = pstmt.executeQuery();
	    	 
	    	 while(rs.next()){
	    		 emVO = new EmployeeVO(
	    				 rs.getInt(1),
	    				 rs.getString(2),
	    				 rs.getString(3),
	    				 rs.getInt(4),
	    				 rs.getString(5));
	    		 list.add(emVO);
	    	 }//end while 
	      
	      }catch (SQLException e) {
				System.out.println("e:[" + e + "]");
			} catch (Exception e) {
				System.out.println("e:[" + e + "]");
			} finally {
				try {
					// �����ͺ��̽��� ����Ǿ��� ������Ʈ ����
					if (pstmt != null)
						pstmt.close();
					if (con != null)
						con.close();
					if(rs != null)
						rs.close();
				} catch (SQLException s) {
					System.out.println("s:["+s+"]");
				}
			} // end finally
	      return list;
	} //end method 
	
	
	public ArrayList<String> getColumnName(){
		
		ArrayList<String> columnName = new ArrayList<>();
		
		String sql = "select * from employee";
		
	    Connection con = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;
		
	    ResultSetMetaData rsmd = null;
	    
	    try{
	    	
	    	con = DBUtil.getConnection();
	    	pstmt = con.prepareStatement(sql);
	    	rs =  pstmt.executeQuery();
	    	rsmd = rs.getMetaData();
	    	
	    	int cols = rsmd.getColumnCount();
	    	
	    	for(int i=1; i<=cols; i++){
	    		columnName.add(rsmd.getColumnName(i));
	    	}
  	
	    }catch (SQLException e) {
			System.out.println("e:[" + e + "]");
		} catch (Exception e) {
			System.out.println("e:[" + e + "]");
		} finally {
			try {
				// �����ͺ��̽��� ����Ǿ��� ������Ʈ ����
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
				if(rs != null)
					rs.close();
			} catch (SQLException s) {
				System.out.println("s:["+s+"]");
			}
		} // end finally
	    return columnName;
} //end method 
	
	
	
	
}
