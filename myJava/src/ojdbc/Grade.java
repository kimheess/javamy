package ojdbc;

import java.sql.*;
import java.util.ArrayList;

public class Grade {
	Connection conn;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	
	public Grade() {
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "scott";
		String pwd = "tiger";
		
		try {
			Class.forName(jdbc_driver);
			this.conn = DriverManager.getConnection(jdbc_url, user, pwd);  // --> �����ͺ��̽� ���� 
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	//�л� ���� �Է� 
	public int dynamicInsert(int Undergrad,String ename, String gender,int lang,int english,int maths, int science) {
		int rowCount = 0;
		this.sql = "insert into grade values(?, ?, ?, ?, ?, ?, ?)";
		
		try {
			this.pstmt = conn.prepareStatement(this.sql);
			pstmt.setInt(1, Undergrad);
			pstmt.setString(2, ename);
			pstmt.setString(3, gender);
			pstmt.setInt(4, lang);
			pstmt.setInt(5, english);
			pstmt.setInt(6, maths);
			pstmt.setInt(7, science);
			
			
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
	
	//��ü �л� ��ȸ
	public ArrayList<JdbcTest> staticSelect(){

		ArrayList<JdbcTest> rows = new ArrayList<JdbcTest>();
		this.sql = "select * from grade";
		
		
		try {
			this.stmt = conn.createStatement();
			this.rs = this.stmt.executeQuery(sql);
			
			
			while(this.rs.next()) {
				rows.add(new JdbcTest(this.rs.getInt("Undergrad"), this.rs.getString("ename"),this.rs.getString("gender"), this.rs.getInt("lang"),this.rs.getInt("english"),this.rs.getInt("maths"),this.rs.getInt("maths") ));
			}
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
		return rows;
	}
	
	//�й��� �̿��� ���� ��ȸ
	public JdbcTest dynamicSelect(int Undergrad){
		this.sql = "select * from grade where Undergrad = ?";
		JdbcTest jdbcTest = null;
		
		try {
			this.pstmt = conn.prepareStatement(sql);
			this.pstmt.setInt(1, Undergrad);
			
			this.rs = this.pstmt.executeQuery();
			
			// ����� �̸��� �����ϴٰ� ����!
			if(this.rs.next()) {
				jdbcTest = new JdbcTest(this.rs.getInt("Undergrad"), this.rs.getString("ename"),this.rs.getString("gender"),this.rs.getInt("lang"),this.rs.getInt("english"),this.rs.getInt("maths"),this.rs.getInt("science") );
			}
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
		return jdbcTest;
	}
	//��������
	public int dynamicupdate(int lang,int english,int maths, int science,int Undergrad) {
		int rowCount = 0;
		this.sql = "update grade set lang = ? ,english = ? ,maths = ? ,science = ? where Undergrad = ?";
		
		try {
			this.pstmt = conn.prepareStatement(this.sql);
			
			pstmt.setInt(1, lang);
			pstmt.setInt(2, english);
			pstmt.setInt(3, maths);
			pstmt.setInt(4, science);
			pstmt.setInt(5, Undergrad);
			
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
	
	public int dynamicdelete(int Undergrad) {
		int rowCount = 0;
//		this.sql = "insert into dept values(?,?, ?)";
		this.sql = "delete from grade where Undergrad = ? ";
		
		try {
			this.pstmt = conn.prepareStatement(this.sql);
			pstmt.setInt(1, Undergrad);
			
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
		Grade it = new Grade();
		int rowCount = 0;
		//�л� ���� �Է�
//		rowCount = it.dynamicInsert(1210, "�����","��",90,80,80,70);
//		System.out.println(rowCount + "���� ���� �ԷµǾ����ϴ�.");
		
		//��ü �л� ���� ��ȸ
//		ArrayList<JdbcTest> rows;
//		rows = it.staticSelect();
//		for(JdbcTest jdbcTest : rows) {
//			System.out.println(jdbcTest.getUndergrad() + "\t"+ jdbcTest.getename() + "\t" +jdbcTest.getgender()+"\t"+ jdbcTest.getlang()+"\t"+jdbcTest.getenglish()+"\t"+ jdbcTest.getmaths()+"\t"+jdbcTest.getscience() );
//		}
		
//		//�й��� �̿��� ���� ��ȸ
//		JdbcTest jdbcTest = it.dynamicSelect(1202);
//		System.out.println(jdbcTest.getUndergrad() + "\t"+ jdbcTest.getename() + "\t" +jdbcTest.getgender()+"\t"+ jdbcTest.getlang()+"\t"+jdbcTest.getenglish()+"\t"+ jdbcTest.getmaths()+"\t"+jdbcTest.getscience());
		
		//�й��� �̿��� �л� ���� ���� 
//		 rowCount = it.dynamicupdate(60,60,60,60,1202);
//		 System.out.println(rowCount + "���� ���� �����Ǿ����ϴ�.");
		
		//�й����� ���� ���� 
//		rowCount = it.dynamicdelete(1210);
//		System.out.println(rowCount + "���� ���� �����Ǿ����ϴ�.");
		
		
		it.closeConnection();
	}
}
