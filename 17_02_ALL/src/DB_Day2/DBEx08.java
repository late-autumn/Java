package DB_Day2;
/*
 * transaction : 논리적인 작업 단위
 * insert, delete, update 등의 작업을 하나의 논리적인 작업 단위로 
 * 묶어서 쿼리 실행시 모든 작업이 정상처리된 경우에는 commit을
 * 실행해서 DB에 반영하고 쿼리 실행중 하나라도 정상처리가 되지 않았을 경우
 * rollback을 실행해서 작업단위내의 모든 작업을 취소함 
 * 
 */


import java.sql.*;
public class DBEx08 {

	public static void main(String[] args) {
		
		//데이터 삽입
		StringBuffer sql1 = new StringBuffer();
		sql1.append("insert into department ");
		sql1.append("values(?,?,?,?) ");
		
		//데이터 수정
		StringBuffer sql2 = new StringBuffer();
		sql2.append("update department ");
		sql2.append("set dname = ? , loc = ? ");
		sql2.append("where deptno = ? ");
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			//			트랜잭션 시작 
			//하나의 논리적인 작업 단위 시작
			//DB 연결
			con = ConnUtil.getConnection();
			
			//autoCommit()기능을 비활성화 함
			con.setAutoCommit(false);
			
			//============= 첫번째 작업 (데이터삽입)============
			pstmt = con.prepareStatement(sql1.toString());
			pstmt.setInt(1, 255);
			pstmt.setString(2, "핵물리학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "6호관");
			pstmt.executeUpdate();
			
			//============ 1번 작업 종료 =====================

			//============= 두번째 작업 (데이터수정)============
			pstmt = con.prepareStatement(sql2.toString());
			
			pstmt.setString(1, "생명공학과");
			pstmt.setString(2, "4호관");
			pstmt.setInt(3, 255);
			pstmt.executeUpdate();
			//============ 2번 작업 종료 =====================
			
			//쿼리가 정상적으로 실행된 경우 DB에 반영
			con.commit();
			System.out.println("DB에 반영되었습니다. ");
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			//롤백 처리 
			try{
				con.rollback();
				System.out.println("롤백 실행 ");
			}catch(SQLException s){
				s.printStackTrace();
			}
		}finally{
			try {
				if(pstmt!= null) pstmt.close();
				if(con!=null) con.close();
			} catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
			//===============트랜잭션 종료================================
		}
		
	}
}