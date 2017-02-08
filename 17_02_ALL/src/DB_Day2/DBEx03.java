package DB_Day2;

//delete 삭제 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx03 {

	public static void main(String[] args) {
		
		StringBuffer sql = new StringBuffer();
		sql.append("delete department ");
		sql.append("where dname='컴퓨터공학' ");
		
		
		Connection con = null;
		Statement stmt = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pw = "tiger";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,id,pw);
			stmt = con.createStatement();
			//delete()문 
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result+"개 행이 삭제 되었습니다.");
		
		} catch (ClassNotFoundException ce) {
			// TODO: handle exception
			System.out.println("드라이브를 찾을 수 없습니다. ");
		}catch(SQLException se){
			se.printStackTrace();
	    }finally{
	         try{
	            if(con != null)con.close();
	            
	         }catch(SQLException se){
	            se.printStackTrace();
	         }
	         try {
	            if(stmt != null)
	               stmt.close();
	         } catch (SQLException se) {
	            // TODO: handle exception
	         }
	         
	      }
	} 
}


