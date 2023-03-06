package chap03;


import java.util.Scanner;
public class Exam1t {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double num;
		
		System.out.print("하나의 실수를 입력하세요:");
		num = sc.nextDouble();
		sc.close();
		
		System.out.println("버림:" + (int)num);
		System.out.println("반올림:" + (int)(num+0.5));
	}
}
