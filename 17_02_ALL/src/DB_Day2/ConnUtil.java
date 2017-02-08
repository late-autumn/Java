package DB_Day2;

//Driver를 제공해 주는 컨넥션 유틸 클래스 
import java.sql.*;
public class ConnUtil {

	static {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException ce) {
			// TODO: handle exception
			ce.printStackTrace();
		}
	}
	
	public static Connection getConnection()throws SQLException{
		
		return DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl","scott","tiger");
	}
	
	
	
}
