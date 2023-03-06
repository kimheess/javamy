package chap03;

class OperatorEx11 {
	public static void main(String args[]) { 
//		char a = 'a';  		//97
//		char d = 'd';  		//100
//
//		char zero = '0';	//48
//		char two  = '2';	//50 
//
//		System.out.printf("'%c' - '%c' = %d\n", d, a, d - a); // 'd' - 'a' = 3
//		System.out.printf("'%c' - '%c' = %d\n", two, zero, two - zero);
//		System.out.printf("'%c'=%d\n", a, (int)a);
//		System.out.printf("'%c'=%d\n", d, (int)d);
//		System.out.printf("'%c'=%d\n", zero, (int)zero);
//		System.out.printf("'%c'=%d\n", two,  (int)two);
		
		float pi = 3.141592f;
		float shortPi = (int)(pi*1000)/1000f;
		
		System.out.println(shortPi);
	}
}
