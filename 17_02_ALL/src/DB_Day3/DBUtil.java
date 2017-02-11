package DB_Day3;
import java.sql.*;
public class DBUtil {

	static final String driver ="oracle.jdbc.driver.OracleDriver";
	static final String url ="jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	
	public static Connection getConnection()throws Exception{
		
		Class.forName(driver);
		
		Connection con = DriverManager.getConnection(url,"scott","tiger");
		
		return con;
	}
}
