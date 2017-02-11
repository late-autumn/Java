package DB_Day2;
/*
 * transaction : ������ �۾� ����
 * insert, delete, update ���� �۾��� �ϳ��� ������ �۾� ������ 
 * ��� ���� ����� ��� �۾��� ����ó���� ��쿡�� commit��
 * �����ؼ� DB�� �ݿ��ϰ� ���� ������ �ϳ��� ����ó���� ���� �ʾ��� ���
 * rollback�� �����ؼ� �۾��������� ��� �۾��� ����� 
 * 
 */


import java.sql.*;
public class DBEx08 {

	public static void main(String[] args) {
		
		//������ ����
		StringBuffer sql1 = new StringBuffer();
		sql1.append("insert into department ");
		sql1.append("values(?,?,?,?) ");
		
		//������ ����
		StringBuffer sql2 = new StringBuffer();
		sql2.append("update department ");
		sql2.append("set dname = ? , loc = ? ");
		sql2.append("where deptno = ? ");
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			//			Ʈ����� ���� 
			//�ϳ��� ������ �۾� ���� ����
			//DB ����
			con = ConnUtil.getConnection();
			
			//autoCommit()����� ��Ȱ��ȭ ��
			con.setAutoCommit(false);
			
			//============= ù��° �۾� (�����ͻ���)============
			pstmt = con.prepareStatement(sql1.toString());
			pstmt.setInt(1, 255);
			pstmt.setString(2, "�ٹ����а�");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "6ȣ��");
			pstmt.executeUpdate();
			
			//============ 1�� �۾� ���� =====================

			//============= �ι�° �۾� (�����ͼ���)============
			pstmt = con.prepareStatement(sql2.toString());
			
			pstmt.setString(1, "������а�");
			pstmt.setString(2, "4ȣ��");
			pstmt.setInt(3, 255);
			pstmt.executeUpdate();
			//============ 2�� �۾� ���� =====================
			
			//������ ���������� ����� ��� DB�� �ݿ�
			con.commit();
			System.out.println("DB�� �ݿ��Ǿ����ϴ�. ");
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			//�ѹ� ó�� 
			try{
				con.rollback();
				System.out.println("�ѹ� ���� ");
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
			//===============Ʈ����� ����================================
		}
		
	}
}