package chap05;
/*
	ũ�Ⱑ 6�� ������ �迭�� ���� �� 
	1���� 45������ �ߺ����� �ʴ� 
	�ζ� ��ȣ�� �����Ͽ� 
	ũ�� ������� ������ �� 
	����ϴ� �ڵ带 �ۼ��ϼ���.
	
	[���� �� ]
	
	�ζ� ��ȣ: 3 14 21 29 33 42
*/
public class Exam1 {

	public static void main(String[] args) {
		int [] lotto = new int[6];
		int max =0,n =0;
		for(int i = 0; i<lotto.length;i++) { 		 
			lotto[i] = (int)(Math.random()*45)+1;    	//lotto�� ���� ����
			for(int j=0; j<i; j++) {				 	//lotto�� ����� ������ ���ؼ� ���� ���� ������ ���ο� ���� ���� �� �ٽ� for������.. 
				if(lotto[i]==lotto[j]) {
					lotto[i] = (int)(Math.random()*45)+1;
					break;
				}
			}
		}
		
		
		for(int i=0;i<lotto.length;i++) {
			for(int j=0;j<i;j++ ) {	
				if(lotto[i]>lotto[j]) {
					max = lotto[i]; 
					lotto[i] = lotto[j];	
					lotto[j] = max;
				}
			}
		}
			System.out.print("�ζ� ��ȣ��:" );
			for (int i=0;i<lotto.length;i++) {
				System.out.print(" " + lotto[i]);
			}
			
			
		}
		
		
	}


