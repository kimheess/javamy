package chap02;

import java.util.Scanner;    // Scanner�� ����ϱ� ���� �߰�

class ScannerEx { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);

//		System.out.print("ù ��° ������ �Է����ּ���:");

	
		System.out.print("�� ���� ������ �Է����ּ���:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
//		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ

//		System.out.println("�Է³��� :"+input);
		System.out.printf("num1: " + num1 + ",num2 : " + num2);
	} 
}
