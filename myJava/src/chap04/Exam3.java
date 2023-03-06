package chap04;

/*
 ###월의 마지막 일자 게산 프로그램 작성하기 ###
 사용자에게 년도와 월을 입력으로 받아 해당 월의 마지막 일자를
 출력하는 코드를 작성하세요
 [실행 예1]
 년도를 입력하세요: 2023 1				
 2023년 1월의 마지막 일자는 31입니다. 	
 
 [실행 예2]
 년도를 입력하세요: 2020 2
 2020년 2월의 마지막 일자는 29일 입니다.
 
 [각 월의 마지막 일자]
 1. 큰달: 1, 3, 5, 7, 8, 10, 12 => 31일
 2. 작은달: 4, 6, 9, 11 
 3. 2월: 윤년 => 29일, 평년=> 28일
 */
import java.util.Scanner;

public class Exam3 {
	public static void main(String[] args) {
		int year,month, monthLastDay=31;		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력하세요:");
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
	
		System.out.printf("%d년 %d월의 마지막 일자는 %d 입니다." , year,month,monthLastDay);
		
		
		
		
//		if(year % 4==0 && year % 100!=0 || year % 400==0) {
//			switch(der) {
//				case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
//					System.out.println(year + "년" + der +"월의 마지막 일자는 31일 입니다");
//					break;
//				case 4: case 6: case 9: case 11:
//					System.out.println(year + "년" + der +"월의 마지막 일자는 30일 입니다");	
//					break;
//				case 2:
//					System.out.println(year + "년" + der +"월의 마지막 일자는 29일 입니다"); //윤년
//					break;
//			}}
//			else {	
//				//평년
//			
//			switch(der) {
//				case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
//					System.out.println(year + "년" + der +"월의 마지막 일자는 31일 입니다");
//					break;
//				case 4: case 6: case 9: case 11:
//					System.out.println(year + "년" + der +"월의 마지막 일자는 30일 입니다");	
//					break;
//				case 2:	
//					System.out.println(year + "년" + der +"월의 마지막 일자는 28일 입니다");
//					break;
//		}		
	}
	

}



