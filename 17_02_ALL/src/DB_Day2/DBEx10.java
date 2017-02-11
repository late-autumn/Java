package DB_Day2;
import java.sql.*;
import java.io.*;
import java.util.*;
public class DBEx10 {

	public static void main(String[] args)throws SQLException, IOException {

		//�������� ��ü ���
		Properties pro = new Properties();

		//���� ���� �ҷ����� 
		pro.load(new FileInputStream("src/department.properties"));

		Connection con = null;
		PreparedStatement pstmt = null;
		
		try{
			
			con = ConnUtil.getConnection();
			
			//department.properties �� ���ǵ� sql�� �����ͼ� 
			//preparedStatement ����
			
			pstmt = con.prepareStatement(pro.getProperty("department_update"));
			
			//parameter ����
			/*pstmt.setInt(1, 100);
			pstmt.setString(2, "������а�");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "4ȣ��");
			*/ 
			//pstmt.setInt(1);
		
			//ResultSet i = pstmt.executeQuery();
			//System.out.println(i+"���� ���� �߰��Ǿ����ϴ�.");
/*			while(i.next())
			{
				System.out.print(i.getInt("deptno" )+"\t");
				System.out.print(i.getString("dname" )+"\t");
				System.out.print(i.getInt("college")+"\t");
				System.out.print(i.getString("loc")+"\t");
				System.out.println();
			}*/
			
			
			pstmt.setString(1, "1ȣ��");
			pstmt.setInt(2, 100);
			int j = pstmt.executeUpdate();
			
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(pstmt!= null) pstmt.close();
				if(con!=null) con.close();
			} catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
		}
	}
}
