package chap04;

/*
 ###���� ������ ���� �Ի� ���α׷� �ۼ��ϱ� ###
 ����ڿ��� �⵵�� ���� �Է����� �޾� �ش� ���� ������ ���ڸ�
 ����ϴ� �ڵ带 �ۼ��ϼ���
 [���� ��1]
 �⵵�� �Է��ϼ���: 2023 1				
 2023�� 1���� ������ ���ڴ� 31�Դϴ�. 	
 
 [���� ��2]
 �⵵�� �Է��ϼ���: 2020 2
 2020�� 2���� ������ ���ڴ� 29�� �Դϴ�.
 
 [�� ���� ������ ����]
 1. ū��: 1, 3, 5, 7, 8, 10, 12 => 31��
 2. ������: 4, 6, 9, 11 
 3. 2��: ���� => 29��, ���=> 28��
 */
import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		int year,month, monthLastDay=31;		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�⵵�� �Է��ϼ���:");
		year = sc.nextInt();
		month = sc.nextInt();
		sc.close();
		
		if(month == 2) {
			if(year % 4== 0 && year % 100 !=0 || year % 400==0) {
			monthLastDay=29;}
		}else {
			monthLastDay=28;
		}
		
		switch(month) {
		case 4: case 6: case 9: case 11:{
			monthLastDay = 30;
			break;
			}
		
		}
	
		System.out.printf("%d�� %d���� ������ ���ڴ� %d �Դϴ�." , year,month,monthLastDay);
		
		
		
		
//		if(year % 4==0 && year % 100!=0 || year % 400==0) {
//			switch(der) {
//				case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
//					System.out.println(year + "��" + der +"���� ������ ���ڴ� 31�� �Դϴ�");
//					break;
//				case 4: case 6: case 9: case 11:
//					System.out.println(year + "��" + der +"���� ������ ���ڴ� 30�� �Դϴ�");	
//					break;
//				case 2:
//					System.out.println(year + "��" + der +"���� ������ ���ڴ� 29�� �Դϴ�"); //����
//					break;
//			}}
//			else {	
//				//���
//			
//			switch(der) {
//				case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
//					System.out.println(year + "��" + der +"���� ������ ���ڴ� 31�� �Դϴ�");
//					break;
//				case 4: case 6: case 9: case 11:
//					System.out.println(year + "��" + der +"���� ������ ���ڴ� 30�� �Դϴ�");	
//					break;
//				case 2:	
//					System.out.println(year + "��" + der +"���� ������ ���ڴ� 28�� �Դϴ�");
//					break;
//		}		
	}
	

}


