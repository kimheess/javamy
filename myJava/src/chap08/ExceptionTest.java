package chap08;

public class ExceptionTest {
	
	void methodA() throws Exception{
		throw new Exception("methodA 예외발생!");
	}
	
	void methodB() throws Exception{
		// 아래의 코드가 정상 실행되도록 코드를 작성하세요.
		methodA();
	}
	// 아래에 methodB() 를 호출하여 프로그램을 실행하는 코드를 추가하세요.
	public static void main(String [] args) {
		ExceptionTest test = new ExceptionTest();
		
		try{
			test.methodB();
		}
		catch(Exception e) {
			System.out.println("main() 메서드에서 예외 처리!");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}