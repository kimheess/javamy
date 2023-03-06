package ojdbc;

import java.sql.*;
import java.util.*;
/*
   	jave.sql.Date : 날짜(o) , 시간 (x)
   	jave.sql.Time : 날짜(x) , 시간 (o)
   	java.sql.Timestamp : 날짜(o) , 시간 (o)  <= java.util.Date 자식 클래스 
 */





	public class JdbcEmp {
		Connection conn;
		PreparedStatement pstmt;
		ResultSet rs;
		String sql;
		
		public JdbcEmp() {
			String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
			String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "scott";
			String pwd = "tiger";
			
			try {
				Class.forName(jdbc_driver);
				this.conn = DriverManager.getConnection(jdbc_url, user, pwd);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void dynamicSelect(){
//			this.sql = "select empno, ename, sal, to_char(hiredate,'YYYY-MM-DD HH24:MI:SS') as hiredate  from emp where empno = ?"; //문자열로 출력되는 hiredate
			
			this.sql = "select empno, ename, sal, hiredate from emp where empno = ?";
			
			try {
				this.pstmt = conn.prepareStatement(sql);
				this.pstmt.setInt(1, 7369);
				
				this.rs = this.pstmt.executeQuery();
				
				if(this.rs.next()) {
//					System.out.println(this.rs.getInt("empno") +"\t" + this.rs.getString("ename")+ "\t"
//							+ this.rs.getDouble("sal") + "\t" + this.rs.getString("hiredate"));
					
//					Date hiredate = this.rs.getDate("hiredate");
//					String newHiredate = hiredate.getYear() + "/" + hiredate.getMonth() + "/" + hiredate.getDate() 
//					+ " " +	hiredate.getHours(); //+ ":" + hiredate.getMinutes()+ ":" + hiredate.getSeconds();
					
					
//					Timestamp timestamp = this.rs.getTimestamp("hiredate");
					// java.util.Date uDate = timestamp;
					java.util.Date uDate = this.rs.getTimestamp("hiredate");
					
					System.out.println(this.rs.getInt("empno") +"\t" + this.rs.getString("ename")+ "\t"
							+ this.rs.getDouble("sal"));
					
					
					
//					System.out.printf("입사일시: %1$tY년 %1$tm월 %1$td일 %1$tH시 %1$tM분 %1$tS초",uDate);
//					String newHiredate = uDate.getYear() + "/" + uDate.getMonth() + "/" + uDate.getDate() 
//					+ " " +	uDate.getHours() + ":" + uDate.getMinutes()+ ":" + uDate.getSeconds();
					
					Calendar calendar = Calendar.getInstance();
					calendar.setTime(uDate);
					
					String newHiredate = calendar.get(Calendar.YEAR) + "/" +  (calendar.get(Calendar.MONTH))+1 + "/" +  calendar.get(Calendar.DATE) 
					+ " " +	 calendar.get(Calendar.HOUR) + ":" +  calendar.get(Calendar.MINUTE)+ ":" +  calendar.get(Calendar.SECOND);
					
					System.out.println(this.rs.getInt("empno") +"\t" + this.rs.getString("ename")+ "\t"
							+ this.rs.getDouble("sal") + "\t" + newHiredate);
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
			JdbcEmp je = new JdbcEmp();
			je.dynamicSelect();
			
			je.closeConnection();

	}
}

