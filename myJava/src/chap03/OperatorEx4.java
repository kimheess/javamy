package chap03;

class OperatorEx4 {
	public static void main(String[] args) {
		byte b1 = 10 , b2 = 20;
		byte b3 = (byte)(b1 + b2);  // (int)b1 + (int)b2  //(Type mismatch: cannot convert from int to byte)
		
		short s1 = 10 , s2 = 20;
		short s3 = (short)(s1 + s2); // int�� �ڵ� ������ �Ǳ� ������ ���� byte�� short�� ����� �ʿ䰡 ����.
		
		
		
//		int num1 = 7, num2 = 4;    //4: 2���� ��ȯ num2:0100 1�Ǻ��� =>~num2:1011,  2�Ǻ���=> 1�� ���� +1
//		int result1 = num1 - num2;
//		int result2 = num1+(~num2+1);
//		System.out.println("result = " + result1);
//		System.out.println("result = " + result2);
		
//		int i = -10;
//		i = +i;
//		System.out.println(i);
//
//		i=-10;
//		i = -i;
//		System.out.println(i);
//		
//		boolean b = true;
//		System.out.println("b+" + !b);
	}
}
