package chap03;

import java.util.Scanner;

public class Exam2t {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money;
		
		System.out.print("����Ͻ� �ݾ��� �Է��ϼ���:");
		money = sc.nextInt();
		
		System.out.print("�����Ͻ� �ݾ��� �Է��ϼ���:");
		money -= sc.nextInt();
		
		System.out.printf("%n�Ž�����:%d��%n",money);
		System.out.printf("500�� ¥�� ����:%d��%n",money/500);
		
		money %= 500;
		System.out.printf("100�� ¥�� ����:%d��%n",money/100);
		
		money %= 100;
		System.out.printf("50�� ¥�� ����:%d��%n",money/50);
		
		money %= 50;
		System.out.printf("10�� ¥�� ����:%d��%n",money/10);
		
		money %= 10;
		System.out.printf("������ �Ž�����:%d��%n",money);
		
	}
}
