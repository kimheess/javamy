package chap05;

class ArrayEx7 {
	public static void main(String[] args) {
		int[] numArr = new int[10]; //배열 10줄 

		for (int i=0; i < numArr.length ; i++ ) {
             numArr[i] = i;  // 배열을 0~9의 숫자로 초기화한다.
			System.out.print(numArr[i]);  //9
		}
		System.out.println();

		for (int i=0; i < 100; i++ ) {
			int n = (int)(Math.random() * 9)+1;	// 임의의 배열 순서번호(index 1~9)를 생성한다.
			//배열의 0번째 위치의 값과 n번째 위치의 값을 교환한다.
			
			int tmp = numArr[0];          // tmp에 numarr1번째 자리수를 준다 
			numArr[0] = numArr[n];  		  // arr에 arrn(랜덤 
			numArr[n] = tmp;               // 변수 바꾸기 로 인해서 for문 돌아가면서 자릴수를 바꾸는건가 맞나 n이 랜덤한 값이자나 100번 돌리네 
		}

		for (int i=0; i < numArr.length ; i++ )
			System.out.print(numArr[i]);		
	} // main의 끝
}
