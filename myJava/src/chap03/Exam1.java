package chap03;

import java.util.Scanner;

/* 
 * 사용자에게 하나의 실수를 입력 받아 다음의 결과를 출력하는 코드를 작성하세요.
 * 단, Math.round()는 사용하지 않습니다.
 * 
 * [실행 결과1]					[실행결과2]
 * 
 * 하나의 실수를 입력하세요: 3.64    하나의 실수를 입력하세요:3.27
 * 
 * 버림:3						버림:3
 * 반올림:4						반올림:3
 */

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("하나의 실수를 입력하세요:");
		double num= sc.nextDouble();
		
		
		System.out.printf("버림: %d%n" , (int)num);
		System.out.printf("반올림: %.0f" , (double)num);
		
	 
		
		
	}

}
	