package DB_Day2;

//delete ���� 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx03 {

	public static void main(String[] args) {
		
		StringBuffer sql = new StringBuffer();
		sql.append("delete department ");
		sql.append("where dname='��ǻ�Ͱ���' ");
		
		
		Connection con = null;
		Statement stmt = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pw = "tiger";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,id,pw);
			stmt = con.createStatement();
			//delete()�� 
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result+"�� ���� ���� �Ǿ����ϴ�.");
		
		} catch (ClassNotFoundException ce) {
			// TODO: handle exception
			System.out.println("����̺긦 ã�� �� �����ϴ�. ");
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


