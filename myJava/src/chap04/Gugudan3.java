package chap04;

/*
  	 2�ܺ��� 9�� ������ �������� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
	 ��, ��ø �ݺ����� ����� �� ���� �ϳ��� for �ݺ����� ����մϴ�.
	 
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

public class Gugudan3 {
	public static void main(String[] args) {
		int dan= 2,num = 1;
		
		for(int i=0; i<72;i++) {
			if(num ==1) {
				System.out.printf("[%d ��]%n" ,dan);
			}
			System.out.printf("%d * %d = %2d\n", dan , num ,dan*num);
			num++;
			
			if(num == 10) {
				num=1;
				dan++;
				System.out.println();
				}	
		}
	}
}