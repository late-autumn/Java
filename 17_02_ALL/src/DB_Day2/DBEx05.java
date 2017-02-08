package DB_Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBEx05 {

	public static void main(String[] args) {
		
		StringBuffer sql = new StringBuffer();
		sql.append("insert into professor ");
		sql.append("values(?,?,?,?,?,sysdate,?,?)");

		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			//DB ����̹� ���� 
			
			//PreparedStatement ��ü ���
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			
			//�Ķ���� ����
			///������ ?(���ε� ����)�� ��ü �� ���� �� �����ϱ� 
			
			pstmt.setInt(1, 9921);
			pstmt.setString(2, "������");
			pstmt.setString(3, "jeongwoo");
			pstmt.setString(4, "�ð�");
			pstmt.setInt(5, 460);
			pstmt.setInt(6, 30);
			pstmt.setInt(7, 206);
			
			//���� ����
			int i = pstmt.executeUpdate();
			System.out.println(i+"���� ���� �߰��Ǿ����ϴ�.");
			
		} catch (SQLException e) {
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
