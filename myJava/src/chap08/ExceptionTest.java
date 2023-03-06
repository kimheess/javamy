package chap08;

public class ExceptionTest {
	
	void methodA() throws Exception{
		throw new Exception("methodA ���ܹ߻�!");
	}
	
	void methodB() throws Exception{
		// �Ʒ��� �ڵ尡 ���� ����ǵ��� �ڵ带 �ۼ��ϼ���.
		methodA();
	}
	// �Ʒ��� methodB() �� ȣ���Ͽ� ���α׷��� �����ϴ� �ڵ带 �߰��ϼ���.
	public static void main(String [] args) {
		ExceptionTest test = new ExceptionTest();
		
		try{
			test.methodB();
		}
		catch(Exception e) {
			System.out.println("main() �޼��忡�� ���� ó��!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}