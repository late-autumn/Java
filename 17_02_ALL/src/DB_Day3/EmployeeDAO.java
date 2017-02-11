package DB_Day3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
/*
 * DAO(Data Access Object)클래스가 데이터의 처리를 하는 단계
 * 자료를 받아 데이터베이스에 입력과 조회를 할 것임
 */

public class EmployeeDAO {

	// 아래의 메소드들은 공통적으로 preparedStatement()메소드 호출하여 쿼리를 실행시켜
	// 데이터베이스를 조작할 PreparedStatement 객체를 얻음

	// 신규 사용자 등록
	public EmployeeVO getEmployeeregiste(EmployeeVO evo) throws Exception {

		// 개발자의 몫
		String dml = "insert into employee (no, name, jobgrade, department, email)" + "values "
				+ "(employee_seq.nextval, ?,?,?,?)";

		Connection con = null;
		PreparedStatement pstmt = null;
		EmployeeVO retval = null;

		try {

			// DBUtil 클래스의 getConnection() 메소드로 데이터베이스와 연결
			con = DBUtil.getConnection();

			// 입력받은 사용자 정보를 처리하기 위한 sql문 생성
			pstmt = con.prepareStatement(dml);

			pstmt.setString(1, evo.getName());
			pstmt.setString(2, evo.getJobGrade());
			pstmt.setInt(3, evo.getDepartment());
			pstmt.setString(4, evo.getEmail());

			// sql문을 수행후 처리 결과를 얻어옴
			int i = pstmt.executeUpdate();

			retval = new EmployeeVO();

			// sql문 수행결과를 EmployeeVO에 저장한다.
			retval.setStatus(i + " ");
		} catch (SQLException e) {
			System.out.println("e:[" + e + "]");
		} catch (Exception e) {
			System.out.println("e:[" + e + "]");
		} finally {
			try {
				// 데이터베이스에 연결되었던 오브젝트 해제
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

	// 사원의 no, name을 입력받아 사원정보조회
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
					// 데이터베이스에 연결되었던 오브젝트 해제
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

	// 사원의 no을 입력받아 정보를 조회
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
					// 데이터베이스에 연결되었던 오브젝트 해제
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

	// 사원의 name을 입력받아 정보를 조회
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
					// 데이터베이스에 연결되었던 오브젝트 해제
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
	//전체 사원 조회 
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
					// 데이터베이스에 연결되었던 오브젝트 해제
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
				// 데이터베이스에 연결되었던 오브젝트 해제
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
