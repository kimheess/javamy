package chap03;

class OperatorEx8 {
	public static void main(String args[]) { 
		int a = 1000000;    // 1,000,000   1�鸸 
		int b = 2000000;    // 2,000,000   2�鸸 

		long c = a * b;     // a * b = 2,000,000,000,000 ?

		System.out.println(c); //�����÷ο� 
		
		long c2 = (long)a * b;     // a * b = 2,000,000,000,000 ?

		System.out.println(c2); //�����÷ο� 
	}
}
