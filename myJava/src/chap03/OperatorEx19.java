package chap03;

class OperatorEx19 {
	public static void main(String args[]) { 
		double x = 10.2;
		double y = 2.7;

		System.out.printf("%f을 %f로 나누면, \n", x, y); 
		System.out.printf("몫은 %d이고, 나머지는 %f입니다.\n", (int)(x / y), x % y); 
	}
}
