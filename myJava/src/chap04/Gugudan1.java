package chap04;

/*
  ����ڿ��� 2�� ���� 9�� ������ �������� ���� �Է� �޾� �ش� �������� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
  
  [���� ��]
  
  �������� ���� �Է��ϼ��� : 7
  
  [ 7�� ] 
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
		 System.out.print("�������� ���� �Է��ϼ��� :");
		 dan = sc.nextInt();
		 sc.close();
		 
		 System.out.printf("\n [ %d �� ] %n", dan);
		
		 for(int num = 1; num <= 9; num++) {
			 System.out.printf("%d * %d = %2d %n" , dan ,num , dan*num );
		 	
		 }
	}

}