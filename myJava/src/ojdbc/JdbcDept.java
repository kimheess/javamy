package ojdbc;

import java.sql.*;

/*
   DEPT ���̺� ���� insert, update,delete �۾��� �����ϰ�
   ��ü�� ���� ���� ����(select)�ϴ� ������ �����Ͽ� �� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
   �� �۾����� ������ ���� �Ǵ� ������ ������ ����� �����Ͽ� �۾��� �����մϴ�. 
 */

public class JdbcDept {
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	String sql;
	
	public JdbcDept() {
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "scott";
		String pwd = "tiger";
		
		try {
			Class.forName(jdbc_driver);
			this.conn = DriverManager.getConnection(jdbc_url, user, pwd);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public int staticInserts(int DEPTNO ,String DNAME, String LOC) {
		int rowCount = 0;
		
		try {
			this.stmt = conn.createStatement();
			this.sql = "insert into dept values ('" + DEPTNO + "', '" + DNAME + "', '" + LOC + "')";
			rowCount = stmt.executeUpdate(this.sql);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(!this.stmt.isClosed()) {
					this.stmt.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return rowCount;
	}
	
	public int dynamicInsert(int DEPTNO ,String DNAME, String LOC) {
		int rowCount = 0;
		this.sql = "insert into dept values(?,?, ?)";
		
		try {
			this.pstmt = conn.prepareStatement(this.sql);
			pstmt.setInt(1, DEPTNO);
			pstmt.setString(2, DNAME);
			pstmt.setString(3, LOC);
			
			rowCount = pstmt.executeUpdate();
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
	public int staticupdate(int DEPTNO ,String DNAME, String LOC) {
		int rowCount = 0;
		
		try {
			this.stmt = conn.createStatement();
//			this.sql = "insert into dept values ('" + DEPTNO + "', '" + DNAME + "', '" + LOC + "')";
//			this.sql = "delete from dept where deptno = " + DEPTNO;
			this.sql = "update dept set DNAME = '" + DNAME + "', " + "LOC ='" + LOC + "' WHERE DEPTNO = " + DEPTNO +";";

			rowCount = stmt.executeUpdate(this.sql);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(!this.stmt.isClosed()) {
					this.stmt.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return rowCount;
	}
	public int dynamicupdate(String DNAME, String LOC,int DEPTNO ) {
		int rowCount = 0;
//		this.sql = "insert into dept values(?,?, ?)";
//		this.sql = "update dept set DNAME = '" + DNAME + "', " + "LOC ='" + LOC + "' WHERE DEPTNO = " + DEPTNO +";";
		this.sql = "update dept set DNAME = ? , LOC = ? where DEPTNO = ? ";
		
		try {
			this.pstmt = conn.prepareStatement(this.sql);
			
			pstmt.setString(1, DNAME);
			pstmt.setString(2, LOC);
			pstmt.setInt(3, DEPTNO);
			
			rowCount = pstmt.executeUpdate();
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
	public int staticdelete(int DEPTNO) {
		int rowCount = 0;
		
		try {
			this.stmt = conn.createStatement();
//			this.sql = "insert into dept values ('" + DEPTNO + "', '" + DNAME + "', '" + LOC + "')";
			this.sql = "delete from dept where deptno = " + DEPTNO;
			rowCount = stmt.executeUpdate(this.sql);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(!this.stmt.isClosed()) {
					this.stmt.close();
				}
			}
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return rowCount;
	}
	public int dynamicdelete(int DEPTNO) {
		int rowCount = 0;
//		this.sql = "insert into dept values(?,?, ?)";
		this.sql = "delete from dept where deptno = ? ";
		
		try {
			this.pstmt = conn.prepareStatement(this.sql);
			pstmt.setInt(1, DEPTNO);
//			pstmt.setString(2, DNAME);
//			pstmt.setString(3, LOC);
			
			rowCount = pstmt.executeUpdate();
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
		JdbcDept it = new JdbcDept();
		int rowCount = 0;
		
//		 rowCount = it.staticInserts( 2 ,"rroe", "zzz"); 
//		 rowCount = it.dynamicInsert(80, "Eclipse", "SEOUL");
		
//		 rowCount = it.staticupdate(50, "pse", "UL");
		 rowCount = it.dynamicupdate("pse", "UL",40);
		 
//		 rowCount = it.staticdelete(50); 
//		 rowCount = it.dynamicdelete(2); 
//		System.out.println(rowCount + "���� ���� �ԷµǾ����ϴ�.");
//		System.out.println(rowCount + "���� ���� �����Ǿ����ϴ�."); 
//		System.out.println(rowCount + "���� ���� �����Ǿ����ϴ�.");
		
		
		it.closeConnection();
	}
}