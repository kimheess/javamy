package chap04;

import java.util.Scanner;
/*
 	����ڿ��� ����� ���� ������ �Է� �޾� ������ ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
 	
 	1) ����� ���� ���� ��� 80�� �̻��̸� �հ�
 	2) ����� ���� ���� �� �� �����̶� 60�� �̸��̸� ����
 	3) ����� �������� ��� 80�� �̻��̸� �հ� 
 	�� AND ������ (& or &&)�� ����� �� �����ϴ�.
 	
 	
 */

public class Exam1 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int math ,eng;
		String result = "";
		
		System.out.print("����, ���� ������ �Է��ϼ��� >>>");
		eng = sc.nextInt();
		math = sc.nextInt();
	//	3) ����� �������� ��� 80�� �̻��̸� �հ� 
	// 	�� AND ������ (& or &&)�� ����� �� �����ϴ�
		
		if(!(math < 80 == eng < 80)) {
			result = "���հ�";
		}else 
			result = "�հ�";
		System.out.println(result);
		
		
//		System.out.println(result);
		
//		����� ���� ���� ��� 80���̸� �հ�
//		if(eng >= 80 & math >= 80) {
//			result = "�հ��Դϴ�.";
//		}else {
//			result = "���հ� �Դϴ�.";
//		}
//		
//		System.out.println(result);
		
// 		����� �������� �� �� �����̶� ���� 
//		
//		if(eng < 60 | math < 60) {
//			result = "������ �ֽ��ϴ�.";
//			}else {
//				result = "������ �����ϴ�.";
//			}
////	
//		System.out.println(result);
//		
		
		
		}
	}