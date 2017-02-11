package DB_Day2;
import java.sql.*;
import java.io.*;
import java.util.*;
public class DBEx10 {

	public static void main(String[] args)throws SQLException, IOException {

		//설정파일 객체 얻기
		Properties pro = new Properties();

		//설정 파일 불러오기 
		pro.load(new FileInputStream("src/department.properties"));

		Connection con = null;
		PreparedStatement pstmt = null;
		
		try{
			
			con = ConnUtil.getConnection();
			
			//department.properties 에 정의된 sql을 가져와서 
			//preparedStatement 만듬
			
			pstmt = con.prepareStatement(pro.getProperty("department_update"));
			
			//parameter 설정
			/*pstmt.setInt(1, 100);
			pstmt.setString(2, "산업공학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "4호관");
			*/ 
			//pstmt.setInt(1);
		
			//ResultSet i = pstmt.executeQuery();
			//System.out.println(i+"개의 행이 추가되었습니다.");
/*			while(i.next())
			{
				System.out.print(i.getInt("deptno" )+"\t");
				System.out.print(i.getString("dname" )+"\t");
				System.out.print(i.getInt("college")+"\t");
				System.out.print(i.getString("loc")+"\t");
				System.out.println();
			}*/
			
			
			pstmt.setString(1, "1호관");
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
