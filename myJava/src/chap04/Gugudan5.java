package chap04;
/*
	 2�ܺ��� 9�� ������ �������� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
��, ��ø �ݺ����� ����մϴ�.

	[���� ��]
	[ 2 �� ]
	2 * 1 = 2 
	. . .
	[ 3 �� ]
	3 * 1 = 3
	. . . 
	[ 9 �� ]
	9 * 2 = 9
	. . .
*/
public class Gugudan5 {

	public static void main(String[] args) {
		for(int dan=2; dan<=9; dan++) {
			System.out.printf("\n [%d ��]%n",dan);
			for(int num=1; num<=9;num++) {
				System.out.printf("%d * %d = %2d%n" ,dan , num , dan*num);
			}
		}

	}

}