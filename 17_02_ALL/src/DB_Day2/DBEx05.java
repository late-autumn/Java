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
			
			//DB 드라이버 연결 
			
			//PreparedStatement 객체 얻기
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql.toString());
			
			//파라미터 셋팅
			///쿼리의 ?(바인딩 변수)에 대체 될 실제 값 저장하기 
			
			pstmt.setInt(1, 9921);
			pstmt.setString(2, "최정우");
			pstmt.setString(3, "jeongwoo");
			pstmt.setString(4, "시간");
			pstmt.setInt(5, 460);
			pstmt.setInt(6, 30);
			pstmt.setInt(7, 206);
			
			//쿼리 실행
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
