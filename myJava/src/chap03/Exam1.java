package chap03;

import java.util.Scanner;

/* 
 * ����ڿ��� �ϳ��� �Ǽ��� �Է� �޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
 * ��, Math.round()�� ������� �ʽ��ϴ�.
 * 
 * [���� ���1]					[������2]
 * 
 * �ϳ��� �Ǽ��� �Է��ϼ���: 3.64    �ϳ��� �Ǽ��� �Է��ϼ���:3.27
 * 
 * ����:3						����:3
 * �ݿø�:4						�ݿø�:3
 */

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ϳ��� �Ǽ��� �Է��ϼ���:");
		double num= sc.nextDouble();
		
		
		System.out.printf("����: %d%n" , (int)num);
		System.out.printf("�ݿø�: %.0f" , (double)num);
		
	 
		
		
	}

}
	