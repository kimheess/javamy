package chap03;


import java.util.Scanner;
public class Exam1t {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double num;
		
		System.out.print("�ϳ��� �Ǽ��� �Է��ϼ���:");
		num = sc.nextDouble();
		sc.close();
		
		System.out.println("����:" + (int)num);
		System.out.println("�ݿø�:" + (int)(num+0.5));
	}
}
