package chap04;
/*
	 2단부터 9단 까지의 구구단의 결과를 출력하는 코드를 작성하세요.


[실행 예]

2 * 1 = 2 
. . .

3 * 1 = 3
. . . 

9 * 2 = 9
. . .
*/
public class Gugudan4 {
	public static void main(String[] args) {
		for(int dan=2; dan<=9; dan++) {
			for(int num=1; num<=9;num++) {
				System.out.printf("%d * %d = %2d%n " ,dan , num , dan*num);
			}
		}
	}
}
