package chap04;

/*
  ### ���� ��� ���α׷� �ۼ��ϱ� ###
  
  ����ڿ��� �⵵�� �Է����� �޾� ���� ���θ� �Ǵ��Ͽ� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
  
  [���� ��1]					[���� ��2]
  �⵵�� �Է��ϼ���: 2023		�⵵�� �Է��ϼ���: 2020
  2023���� ����Դϴ�.			2020���� �����Դϴ�.
  
  [���� �Ǵ� �˰���]
  1. 4�� ����� �ش� �����Դϴ�.
  2. 100�� ����� �ش� ����Դϴ�. ==> 4�ǹ���̰� 100�ǹ���� �ƴϸ� �����Դϴ�.
  3. 400�� ����� �ش� �����Դϴ�.
  
  	2020: ����,  2100: ���,  2000: ����,  2023: ��� 
  	
  	[�ڵ� ���� ����]
  	1. if... else if ... else ������ ����Ͽ� ������ �ذ��մϴ�.
  	2. if ... else ������ ����Ͽ� ������ �ذ��մϴ�.
 */
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		int year;
		String result ="";
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�⵵�� �Է��ϼ���:");
		year = sc.nextInt();
		sc.close();

//		2020: ����,  2100: ���,  2000: ����,  2023: ��� 
//		year % 4== 0 && year % 100 !=0 || year % 400==0 4�ǹ���̰� 100�ǹ���� �ƴϸ� �����Դϴ�
		
//		if(year % 400 == 0) {
//			result = "����";
//		}else if(year % 100 == 0) {
//			result = "���";
//		}else if(year % 4 == 0) {
//			result = "����";
//		}else {
//			result = "���";
//		}
//		System.out.printf("%d���� %s �Դϴ�.", year,result);
		
		if(year % 4== 0 && year % 100 !=0 || year % 400==0 ) { //4�ǹ���̰� 100�ǹ���� �ƴϸ� �����Դϴ�.
			result = "����";
		}else {
			result = "���";
		}
		
		System.out.printf("%d���� %s �Դϴ�.", year,result);
		
//      #####���� �Ѱ�##############		
////		if(year%4==0) {
////			System.out.printf("%d���� ���� �Դϴ�",year);
////		}else if(year % 100==0) {
////			System.out.printf("%d���� ��� �Դϴ�",year);
////		}else if(year % 400==0) {
////			System.out.printf("%d���� ���� �Դϴ�",year);
////		}else {
////			System.out.printf("%d���� ��� �Դϴ�",year);
////		}
//		
//		if((year % 4)==0&&(year%100!=0)) {
//			System.out.printf("%s���� ���� �Դϴ�",year);
//		}else if((year % 100)==0&&(year%400!=0)) {
//			System.out.printf("%s���� ��� �Դϴ�",year);
//		}else if((year % 400)==0) {
//			System.out.printf("%s���� ���� �Դϴ�",year);
//		}else {
//			System.out.printf("%s���� ��� �Դϴ�",year);
//		}
//////			
//		if(year % 4==0 && year % 100!=0 || year % 400==0) {
//			System.out.printf("%s���� ���� �Դϴ�",year);
//		}else {
//			System.out.printf("%s���� ��� �Դϴ�",year);
//		}		

	}

}
