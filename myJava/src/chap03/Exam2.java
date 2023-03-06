package chap03;

import java.util.Scanner;

/*
  동전 교환 프로그램을 다음과 같이 생성하세요.
  단,단위가 큰 동전을 우선으로 교환합니다.
  가능하면 하나의 변수만 사용합니다.
  
  [실행 결과]
  
  계산하실 금액을 입력하세요: 10000
  구매하신 금액을 입력하세요: 6234
  
  거스름돈:3766원
  500원 짜리 동전: 7개
  100원 짜리 동전: 2개
  50원짜리 동전 : 1개
  10원짜리 동전 : 1개
  나머지 거스름돈: 6원 
*/
public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("계산하실 금액을 입력하세요:");
		int num= sc.nextInt();
		System.out.printf("구매하신 금액을 입력하세요:");
		int num1= sc.nextInt();
		int num2 = num-num1; //거스름돈 
		System.out.println("거스름돈:" + (num2) +"원"); 
		System.out.println("500원 짜리 동전:" + (num2/500) +"개");
		System.out.println("100원 짜리 동전:" + (num2/500)/100 +"개");
		
//		System.out.println("50원 짜리 동전:" + num2/50 +"개");
//		System.out.println("10원 짜리 동전:" + num2/10 +"개");
//		System.out.println("나머지 거스름돈:" + num2%1 +"개");
		

	}

}
