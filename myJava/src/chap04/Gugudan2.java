package chap04;

public class Gugudan2 {

	/*
	 2�ܺ��� 9�� ������ �������� ����� ����ϴ� �ڵ带 �ۼ��ϼ���.
	 ��, ��ø �ݺ����� ����� �� ���� �ϳ��� for �ݺ����� ����մϴ�.
	 [���� ��]
	 
	 2 * 1 = 2 
	 2 * 2 = 4 
	 . . . 
	 9 * 9 = 91 
	 */
	
	public static void main(String[] args) {
			int dan= 2,num = 1;
			for(int i=0; i<72;i++) {
				System.out.printf("%d * %d = %2d\n", dan , num ,dan*num);
				num++;
				
				if(num == 10) {
					num=1;
					dan++;
				}
				
			}
			
	}

}