package DB_Day2;

import java.sql.*;

/*
 * 1. jdbc를 이용하여 연결할때
 * 2. Driver 검색
 * 3. 데이터베이스 연결
 * 4. 쿼리문 작성
 * 5. 결과 담기
 * 6. 사용후 반드시 close()한다.
 */

public class DbEx01 {
	public static void main(String[] args) {
	
		Connection con = null;
		Statement stmt = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pw = "tiger";
		try {
			//jdbc 드라이브 메모리에 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Connection 객체 얻어오기 ( IP, 포트:SID, 아이디, 패스워드) 
		
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
			System.out.println("데이터베이스에 연결되었습니다.");
			
			//Statment 객체 얻기
			stmt = con.createStatement();
			
			//쿼리 작성하기
			StringBuffer sql = new StringBuffer();
			sql.append("insert into department ");
			sql.append("values(206,'전파공학과',600,'9호관')");
			
			//또다른 방법 
			/*String sql = "insert into department"; 
			 *sql += "values(203,'전자공학과',200,'7호관')"
			 */
			
			//쿼리 실행하기 
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result+"개 행이 추가되었습니다.");
			
			
		} catch (ClassNotFoundException ce) {
			// TODO: handle exception
			System.out.println("드라이브를 찾을 수 없습니다. ");
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
