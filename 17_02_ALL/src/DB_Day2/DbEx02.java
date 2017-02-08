package DB_Day2;

/*
 * ������ ������Ʈ(����)
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbEx02 {
	public static void main(String[] args) {
		
		StringBuffer sql = new StringBuffer();
		sql.append("update department ");
		sql.append("set dname='��ǻ�Ͱ���' ");
		sql.append("where deptno=203 ");		
		
		
		
		Connection con = null;
		Statement stmt = null;
		
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
			//update()�� 
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
