package chap03;

import java.util.Scanner;

/*
  ���� ��ȯ ���α׷��� ������ ���� �����ϼ���.
  ��,������ ū ������ �켱���� ��ȯ�մϴ�.
  �����ϸ� �ϳ��� ������ ����մϴ�.
  
  [���� ���]
  
  ����Ͻ� �ݾ��� �Է��ϼ���: 10000
  �����Ͻ� �ݾ��� �Է��ϼ���: 6234
  
  �Ž�����:3766��
  500�� ¥�� ����: 7��
  100�� ¥�� ����: 2��
  50��¥�� ���� : 1��
  10��¥�� ���� : 1��
  ������ �Ž�����: 6�� 
*/
public class Exam2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("����Ͻ� �ݾ��� �Է��ϼ���:");
		int num= sc.nextInt();
		System.out.printf("�����Ͻ� �ݾ��� �Է��ϼ���:");
		int num1= sc.nextInt();
		int num2 = num-num1; //�Ž����� 
		System.out.println("�Ž�����:" + (num2) +"��"); 
		System.out.println("500�� ¥�� ����:" + (num2/500) +"��");
		System.out.println("100�� ¥�� ����:" + (num2/500)/100 +"��");
		
//		System.out.println("50�� ¥�� ����:" + num2/50 +"��");
//		System.out.println("10�� ¥�� ����:" + num2/10 +"��");
//		System.out.println("������ �Ž�����:" + num2%1 +"��");
		

	}

}
