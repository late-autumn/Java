package DB_Day2;
//update 

import java.sql.*;
public class DBEx06 {

	public static void main(String[] args) {
		
		StringBuffer sql = new StringBuffer();
		sql.append("update professor ");
		sql.append("set sal =?");
		sql.append("where name=? ");
		Connection con = null;
		PreparedStatement pstmt = null;
		
		
		try {
			
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 500);
			pstmt.setString(2, "홍길동");
			
			int i = pstmt.executeUpdate();
			System.out.println(i+"개의 행이 추가되었습니다.");
			
			
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
