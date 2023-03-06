package chap06;

public class FactorialTest {
	
	long factorial(int num) {
		long result =0;
		
		if(num==1) {
			result = 1;
		}else {
			result = num * factorial(num-1);
		}
		return result;
	}
	
	public static void main(String[] args) {
		FactorialTest test = new FactorialTest();
		System.out.println(test.factorial(7));

	}

}
