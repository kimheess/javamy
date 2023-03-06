package chap04;

/*
  사용자에게 2단 부터 9단 사이의 구구단의 단을 입력 받아 해당 구구단의 결과를 출력하는 코드를 작성하세요.
  
  [실행 예]
  
  구구단의 단을 입력하세요 : 7
  
  [ 7단 ] 
  7 * 1 = 7
  7 * 2 = 14 
  . . .
  7 * 9 = 63
  
 */

import java.util.Scanner;

public class Gugudan1 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int dan;
		 System.out.print("구구단의 단을 입력하세요 :");
		 dan = sc.nextInt();
		 sc.close();
		 
		 System.out.printf("\n [ %d 단 ] %n", dan);
		
		 for(int num = 1; num <= 9; num++) {
			 System.out.printf("%d * %d = %2d %n" , dan ,num , dan*num );
		 	
		 }
	}

}
