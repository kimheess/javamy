package chap04;
/*
 	2�ܺ��� 9�� ������ ���� ������ ����� �׸��� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
*/
public class Gugudan6 {
	
	public static void main(String[] args) {
		int num=1; 
		while(num <=9) {
			int dan = 2;
			while( dan <=9)  {
				
				System.out.printf("%d * %d = %2d \t",dan , num , dan*num);
				dan++;	
			}
				num++;
				System.out.println();
		}			
	}
}


//for(int num=1; num <=9; num++) {
//	for(int dan = 2; dan <=9; dan++) {
//		System.out.printf("%d * %d = %2d \t",dan , num , dan*num);
//		}
//		System.out.println();