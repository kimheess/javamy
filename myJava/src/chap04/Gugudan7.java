package chap04;
/*
	2�ܺ��� 9�� ������ ������ �ִ� ���� ������ ����� �׸��� ���� ����ϴ� �ڵ带 �ۼ��ϼ���.
	�� �ϳ��� �ܺ� for �ݺ����� �ϳ��� ���� for �ݺ����� ����մϴ�.
	
*/
public class Gugudan7 {

	public static void main(String[] args) {
		// ��ø while �ݺ����� ����Ͽ� ���̺� �ִ� ���� �������� ����ϴ� �ڵ带 �ۼ��ϼ��� 
		
	
		for(int num=1; num<=9; num++) {
			for(int dan=2; dan<=9; dan++) {
				if(num==0) {
					System.out.printf(" [ %d �� ] \t , dan");
				}else {
					System.out.printf("%d * %d = %2d  \t",dan , num , dan*num);
				}
				System.out.println();
			}		
		}	
		
	}
}

