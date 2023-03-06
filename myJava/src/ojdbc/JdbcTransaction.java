package ojdbc;

import java.sql.*;

public class JdbcTransaction {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	public JdbcTransaction() {
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "scott";
		String pwd = "tiger";
		
		try {
			Class.forName(jdbc_driver);
			this.conn = DriverManager.getConnection(jdbc_url, user, pwd);
			conn.setAutoCommit(false);  //���� Ŀ�� �� Ȱ��ȭ
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	public int dynamicInsert(String username, String email) {
		int rowCount = 0;
		this.sql = "insert into jdbc_test values(?, ?)";
		
		try {
			this.pstmt = this.conn.prepareStatement(this.sql);
			this.pstmt.setString(1, username);
			this.pstmt.setString(2, email);
			
			rowCount = pstmt.executeUpdate();
			
			
//			if(rowCount == 1) { 
//				this.conn.rollback();
//			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(!this.pstmt.isClosed()) {
					this.pstmt.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return rowCount;
	}
	public void closeConnection() {
		try {
			if(!this.conn.isClosed()) {
				this.conn.close();
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		JdbcTransaction jt = new JdbcTransaction();
		Savepoint s1 = null,s2 = null ,s3 = null;
		int rowCount = 0;
		
		// rowCount = it.staticInsert("ȫ�浿", "hong@naver.com");
		rowCount = jt.dynamicInsert("����ȣ", "pa��@nate.com");
		System.out.println(rowCount + "���� ���� �ԷµǾ����ϴ�.");
		
		try {
			 s1 = jt.conn.setSavepoint("s1");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		rowCount = jt.dynamicInsert("�����", "son@daum.net");
		System.out.println(rowCount + "���� ���� �ԷµǾ����ϴ�.");
		try {
			 s2 = jt.conn.setSavepoint("s2");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		rowCount = jt.dynamicInsert("�迬��", "kim_yk@naver.com");
		System.out.println(rowCount + "���� ���� �ԷµǾ����ϴ�.");
		try {
			 s3 = jt.conn.setSavepoint("s3");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			jt.conn.rollback(s2);
			jt.conn.commit();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		jt.closeConnection();

	}

}
