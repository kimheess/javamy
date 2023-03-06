package ojdbc;

import java.sql.*;
import java.util.ArrayList;
//여러 행을 받기위해 ArrayList 이용하여 작성
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<JdbcTest> rows = new ArrayList<JdbcTest>();
		
		rows.add(new JdbcTest("김희수","cucucu1232@naver.com"));
		rows.add(new JdbcTest("김덕배","pack2@naver.com"));
		rows.add(new JdbcTest("홍길동","hong@nate.com"));
	
		// rows 에 저장된 모든 회원 정보를 출력하는 코드를 작성하세요.
		for(JdbcTest jdbcTest : rows) {
			System.out.println(jdbcTest.getUsername() + "\t"+ jdbcTest.getEmail());
		}
		
	}

}
