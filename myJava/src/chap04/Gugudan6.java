package chap04;
/*
 	2단부터 9단 까지의 수평 구구단 결과를 그림과 같이 출력하는 코드를 작성하세요.
*/
public class Gugudan6 {
	
	public static void main(String[] args) {
		int num=1; 
		while(num <=9) {
			int dan = 2;
			while( dan <=9)  {
				
				System.out.printf("%d * %d = %2d \t",dan , num , dan*num);
				dan++;	
			}
				num++;
				System.out.println();
		}			
	}
}


//for(int num=1; num <=9; num++) {
//	for(int dan = 2; dan <=9; dan++) {
//		System.out.printf("%d * %d = %2d \t",dan , num , dan*num);
//		}
//		System.out.println();