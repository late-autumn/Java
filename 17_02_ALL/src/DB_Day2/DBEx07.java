package DB_Day2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBEx07 {

	public static void main(String[] args) {
		
		StringBuffer sql = new StringBuffer();
		sql.append("select a.name, a.profno,a.position, b.dname ");
		sql.append("from professor a, department b ");
		sql.append("where a.deptno = b.deptno and a.deptno = ? ");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try{
			
			
			con = ConnUtil.getConnection();
			
			pstmt = con.prepareStatement(sql.toString());
			
			// ? �� ��ü��  �������� ������ 
			pstmt.setInt(1, 204);
			//���� ������Ѽ� ��� �� ���
			rs = pstmt.executeQuery();
			
			//����� ���� �ϱ�
			
			while(rs.next()){
				System.out.print(rs.getString("name" )+"\t");
				System.out.print(rs.getInt("profno" )+"\t");
				System.out.print(rs.getString("dname")+"\t");
				System.out.print(rs.getString("position")+"\t");
				
			}
			
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