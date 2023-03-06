package chap04;

import java.util.*;

class FlowEx5 {
	public static void main(String[] args) { 
		int score;
		String grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수를 입력해주세요:");
		score = scanner.nextInt(); // 화면을 통해 입력받은 내용을 tmp에 저장
		scanner.close();
		
		if(score >= 0 & score <=100) {
			if(score >= 98) {
			grade = "A+";
		}
		else if(score >= 94) {
			grade = "A-";
		}
		else if(score >= 88) {
			grade = "B+";
		}
		else if(score >= 84) {
			grade = "B-";
		}
		else if(score >= 80) {
			grade = "B";
		}
		else {
			grade = "A+";
		}
		}
		else {
			System.out.println("올바른 시험 점수를 입력하세요!");
		}
		
//		System.out.printf("당신의 학점은 %c입니다.%n", grade);
		
		
		
		
//		int score = 0;
//		String grade;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("점수를 입력해주세요:");
//		score = scanner.nextInt(); // 화면을 통해 입력받은 내용을 tmp에 저장
//		scanner.close();
//		
//		if(score >= 98) {
//			grade = "A+";
//		}
//		else if(score >= 94) {
//			grade = "A-";
//		}
//		else if(score >= 88) {
//			grade = "B+";
//		}
//		else if(score >= 84) {
//			grade = "B-";
//		}
//		else if(score >= 80) {
//			grade = "B";
//		}
//		else {
//			grade = "A+";
//		}
		
//		int  score = 0;
//		char grade = ' ';
//		char opt   = '0';
//
//		System.out.print("점수를 입력해주세요.>");
//
//		Scanner scanner = new Scanner(System.in);
//		String tmp = scanner.nextLine(); // 화면을 통해 입력받은 내용을 tmp에 저장
//		score = Integer.parseInt(tmp);   // 입력받은 문자열(tmp)을 숫자로 변환
//		
//		System.out.printf("당신의 점수는 %d입니다.", score);
//
//		if (score >= 90) {		      
//			grade = 'A';
//			if (score >= 98) { 	      
//				opt = '+';	
//			} else if (score < 94) {  
//				opt = '-';
//			}
//		} else if (score >= 80){	  
//			grade = 'B';
//			if (score >= 88) {
//				opt = '+';
//			} else if (score < 84)	{
//				opt = '-';
//			}
//		} else {				      // 나머지는 C학점(grade)
//			grade = 'C';
//		}
//			
//		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
	}
}
