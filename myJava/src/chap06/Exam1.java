package chap06;
import java.util.Arrays;
/*
	크기가 6인 정수형 배열을 만든 후 
	1부터 45사이의 중복되지 않는 
	로또 번호 6개를 생성하여 
	크기 순서대로 저장한 후 
	출력하는 코드를 작성하세요.
	단,Lotto 클래스를 생성하고 
	객체지향 적으로 문제를 해결하는 코드를 작성하세요 
	
	[실행 예 ]
	
	로또 번호: 3 14 21 29 33 42
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
		
		/*		  선택 정렬 알고리즘
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
		
		System.out.println("로또 번호는:"+ Arrays.toString(lotto));
	}
}







/*
int [] lotto = new int[6];
int max =0,n =0;
for(int i = 0; i<lotto.length;i++) { 		 
	lotto[i] = (int)(Math.random()*45)+1;    	//lotto에 난수 저장
	for(int j=0; j<i; j++) {				 	//lotto에 저장된 난수를 비교해서 같은 값이 있으면 새로운 난수 생성 후 다시 for문으로.. 
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
	System.out.print("로또 번호는:" );
	for (int i=0;i<lotto.length;i++) {
		System.out.print(" " + lotto[i]);
	}
*/
	
