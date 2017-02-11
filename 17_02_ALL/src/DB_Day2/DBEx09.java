package DB_Day2;
import java.io.*;
import java.sql.*;
public class DBEx09 {

	public static void main(String[] args)throws Exception {
		
		//키보드와 연결된 스트림 얻기 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("sql 입력:");
		String sql = br.readLine();
		
		Connection con = ConnUtil.getConnection();
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		ResultSet rs = pstmt.executeQuery();
				
		//쿼리 수행결과집합의 부가정보를 가지고 있는 ResultSetMetaData 얻기
		ResultSetMetaData rsmd = rs.getMetaData();
		
		System.out.println("컬럼의 개수:"+rsmd.getColumnCount());
		
		/*//컬럼이름
		for(int i=1; i<=rsmd.getColumnCount();i++){
			System.out.print(rsmd.getColumnName(i)+"\t");
		}
		System.out.println();
		
		//컬럼타입
		for(int i=1; i<=rsmd.getColumnCount();i++){
			System.out.print(rsmd.getColumnName(i)+"\t");
		}
		System.out.println();*/
		
		int colcount = rsmd.getColumnCount();
		
		while(rs.next()){
			
			for(int colNum = 1; colNum <= colcount;colNum++){
				int colType = rsmd.getColumnType(colNum);
				
				switch(colType){
				case Types.NUMERIC:
					System.out.print(rs.getInt(colNum)+"\t");
					break;
				case Types.VARCHAR:
					System.out.print(rs.getString(colNum)+"\t");
					break;
				case Types.DATE:
					System.out.print(rs.getString(colNum)+"\t");
					break;
					
				}//end switch
			}//end for
			
			System.out.println();
		}//end while
		
		br.close();
		rs.close();
		pstmt.close();
		con.close();
		
	}
}
