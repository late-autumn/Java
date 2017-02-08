package DB_Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBEx04 {

	public static void main(String[] args) {
		
		StringBuffer sql = new StringBuffer();
		sql.append("select deptno, dname, college, Loc ");
		sql.append("from department ");		
		
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pw = "tiger";
		try {
			//jdbc ����̺� �޸𸮿� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Connection ��ü ������ ( IP, ��Ʈ:SID, ���̵�, �н�����) 
		
			con = DriverManager.getConnection(url,id,pw);
			System.out.println("�����ͺ��̽��� ����Ǿ����ϴ�.");
			
			//Statment ��ü ���
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(sql.toString());
			
			while(rs.next()){
				int i = rs.getInt(1);			//deptno 
				String s1 = rs.getString(2);	//dname
				int j = rs.getInt("college");
				String s2 = rs.getString("Loc");
				
				System.out.println(i+"\t"+s1+"\t"+j+"\t"+s2);
			}
		
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

