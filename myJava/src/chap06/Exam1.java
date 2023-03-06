package chap06;
import java.util.Arrays;
/*
	ũ�Ⱑ 6�� ������ �迭�� ���� �� 
	1���� 45������ �ߺ����� �ʴ� 
	�ζ� ��ȣ 6���� �����Ͽ� 
	ũ�� ������� ������ �� 
	����ϴ� �ڵ带 �ۼ��ϼ���.
	��,Lotto Ŭ������ �����ϰ� 
	��ü���� ������ ������ �ذ��ϴ� �ڵ带 �ۼ��ϼ��� 
	
	[���� �� ]
	
	�ζ� ��ȣ: 3 14 21 29 33 42
*/
public class Exam1 {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		int lottoNum, temp;
		
		for(int i=0;i<lotto.length;i++) {
			while(true) {
				boolean isDuplicate = false;
				lottoNum = (int)(Math.random()*45) +1;
				
				for(int j=0; j<lotto.length;j++) {
					if(lottoNum == lotto[j]) {
						isDuplicate = true;
						break;
					}
				}
				
				if(!isDuplicate) {
					lotto[i]= lottoNum; 
					break;
				}
			}
		}
		
		/*		  ���� ���� �˰���
		  		0 1 2 3 4 5 <=index
		 		= 
		 		0 1 2 3 4 5 <=index
		 		* =	
		 		0 1 2 3 4 5 <=index
		 		* * = 
		 		0 1 2 3 4 5 <=index
		 		* * * =
		 		0 1 2 3 4 5 <=index
		 		* * * * = 
		 		0 1 2 3 4 5 <=index 
		 		* * * * * *     
		 		
		 */		
		
		for(int i = 0; i<lotto.length -1; i++) {
			for(int j= i+1; j<lotto.length;j++) {
				if(lotto[i]>lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
				}
			}
		}
		
		System.out.println("�ζ� ��ȣ��:"+ Arrays.toString(lotto));
	}
}







/*
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
		if(lotto[i]<lotto[j]) {
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
*/
	
