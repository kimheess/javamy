package ojdbc;

import java.sql.*;
import java.util.ArrayList;
//���� ���� �ޱ����� ArrayList �̿��Ͽ� �ۼ�
public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<JdbcTest> rows = new ArrayList<JdbcTest>();
		
		rows.add(new JdbcTest("�����","cucucu1232@naver.com"));
		rows.add(new JdbcTest("�����","pack2@naver.com"));
		rows.add(new JdbcTest("ȫ�浿","hong@nate.com"));
	
		// rows �� ����� ��� ȸ�� ������ ����ϴ� �ڵ带 �ۼ��ϼ���.
		for(JdbcTest jdbcTest : rows) {
			System.out.println(jdbcTest.getUsername() + "\t"+ jdbcTest.getEmail());
		}
		
	}

}
