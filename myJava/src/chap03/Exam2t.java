package chap03;

import java.util.Scanner;

public class Exam2t {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money;
		
		System.out.print("계산하실 금액을 입력하세요:");
		money = sc.nextInt();
		
		System.out.print("구매하신 금액을 입력하세요:");
		money -= sc.nextInt();
		
		System.out.printf("%n거스름돈:%d원%n",money);
		System.out.printf("500원 짜리 동전:%d개%n",money/500);
		
		money %= 500;
		System.out.printf("100원 짜리 동전:%d개%n",money/100);
		
		money %= 100;
		System.out.printf("50원 짜리 동전:%d개%n",money/50);
		
		money %= 50;
		System.out.printf("10원 짜리 동전:%d개%n",money/10);
		
		money %= 10;
		System.out.printf("나머지 거스름돈:%d개%n",money);
		
	}
}
