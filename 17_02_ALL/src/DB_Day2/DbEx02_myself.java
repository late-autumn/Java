package DB_Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbEx02_myself {
public static void main(String[] args) {
		
	//���� �ۼ��ϱ�
	StringBuffer sql = new StringBuffer();
	
	
/*	sql.append("insert into test ");
	sql.append("values(200731029,'fox','��������')");*/
	
	
	sql.append("update test ");
	sql.append("set ID = 2007310029  where PASS = 'fox'");
		
		
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
