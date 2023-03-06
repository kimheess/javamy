package chap03;

class OperatorEx4 {
	public static void main(String[] args) {
		byte b1 = 10 , b2 = 20;
		byte b3 = (byte)(b1 + b2);  // (int)b1 + (int)b2  //(Type mismatch: cannot convert from int to byte)
		
		short s1 = 10 , s2 = 20;
		short s3 = (short)(s1 + s2); // int로 자동 연산이 되기 때문에 굳이 byte와 short를 사용할 필요가 없다.
		
		
		
//		int num1 = 7, num2 = 4;    //4: 2진수 변환 num2:0100 1의보수 =>~num2:1011,  2의보수=> 1의 보수 +1
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
