package DB_Day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbEx02_myself {
public static void main(String[] args) {
		
	//쿼리 작성하기
	StringBuffer sql = new StringBuffer();
	
	
/*	sql.append("insert into test ");
	sql.append("values(200731029,'fox','전기기술자')");*/
	
	
	sql.append("update test ");
	sql.append("set ID = 2007310029  where PASS = 'fox'");
		
		
		Connection con = null;
		Statement stmt = null;
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String pw = "tiger";
		try {
			//jdbc 드라이브 메모리에 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Connection 객체 얻어오기 ( IP, 포트:SID, 아이디, 패스워드) 
		
			con = DriverManager.getConnection(url,id,pw);
			System.out.println("데이터베이스에 연결되었습니다.");
			
			//Statment 객체 얻기
			stmt = con.createStatement();
			//update()문 
			int result = stmt.executeUpdate(sql.toString());
			System.out.println(result+"개 행이 변경 되었습니다.");
		
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
