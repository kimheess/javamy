package chap04;
/*
	2단부터 9단 까지의 제목이 있는 수평 구구단 결과를 그림과 같이 출력하는 코드를 작성하세요.
	단 하나의 외부 for 반복문과 하나의 내부 for 반복문만 사용합니다.
	
*/
public class Gugudan7 {

	public static void main(String[] args) {
		// 중첩 while 반복문을 사용하여 레이블 있는 수평 구구단을 출력하는 코드를 작성하세요 
		
	
		for(int num=1; num<=9; num++) {
			for(int dan=2; dan<=9; dan++) {
				if(num==0) {
					System.out.printf(" [ %d 단 ] \t , dan");
				}else {
					System.out.printf("%d * %d = %2d  \t",dan , num , dan*num);
				}
				System.out.println();
			}		
		}	
		
	}
}

