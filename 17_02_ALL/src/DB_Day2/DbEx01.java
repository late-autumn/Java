package DB_Day2;

import java.sql.*;

/*
 * 1. jdbc�� �̿��Ͽ� �����Ҷ�
 * 2. Driver �˻�
 * 3. �����ͺ��̽� ����
 * 4. ������ �ۼ�
 * 5. ��� ���
 * 6. ����� �ݵ�� close()�Ѵ�.
 */

public class DbEx01 {
	public static void main(String[] args) {
	
		Connection con = null;
		Statement stmt = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pw = "tiger";
		try {
			//jdbc ����̺� �޸𸮿� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Connection ��ü ������ ( IP, ��Ʈ:SID, ���̵�, �н�����) 
		
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			System.out.println("�����ͺ��̽��� ����Ǿ����ϴ�.");
			
			//Statment ��ü ���
			stmt = con.createStatement();
			
			//���� �ۼ��ϱ�
			StringBuffer sql = new StringBuffer();
			sql.append("insert into department ");
			sql.append("values(206,'���İ��а�',600,'9ȣ��')");
			
			//�Ǵٸ� ��� 
			/*String sql = "insert into department"; 
			 *sql += "values(203,'���ڰ��а�',200,'7ȣ��')"
			 */
			
			//���� �����ϱ� 
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result+"�� ���� �߰��Ǿ����ϴ�.");
			
			
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
