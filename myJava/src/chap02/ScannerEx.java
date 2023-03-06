package chap02;

import java.util.Scanner;    // Scanner를 사용하기 위해 추가

class ScannerEx { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);

//		System.out.print("첫 번째 정수를 입력해주세요:");

	
		System.out.print("두 개의 정수를 입력해주세요:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
//		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환

//		System.out.println("입력내용 :"+input);
		System.out.printf("num1: " + num1 + ",num2 : " + num2);
	} 
}
