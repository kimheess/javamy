package chap05;

class ArrayEx7 {
	public static void main(String[] args) {
		int[] numArr = new int[10]; //�迭 10�� 

		for (int i=0; i < numArr.length ; i++ ) {
             numArr[i] = i;  // �迭�� 0~9�� ���ڷ� �ʱ�ȭ�Ѵ�.
			System.out.print(numArr[i]);  //9
		}
		System.out.println();

		for (int i=0; i < 100; i++ ) {
			int n = (int)(Math.random() * 9)+1;	// ������ �迭 ������ȣ(index 1~9)�� �����Ѵ�.
			//�迭�� 0��° ��ġ�� ���� n��° ��ġ�� ���� ��ȯ�Ѵ�.
			
			int tmp = numArr[0];          // tmp�� numarr1��° �ڸ����� �ش� 
			numArr[0] = numArr[n];  		  // arr�� arrn(���� 
			numArr[n] = tmp;               // ���� �ٲٱ� �� ���ؼ� for�� ���ư��鼭 �ڸ����� �ٲٴ°ǰ� �³� n�� ������ �����ڳ� 100�� ������ 
		}

		for (int i=0; i < numArr.length ; i++ )
			System.out.print(numArr[i]);		
	} // main�� ��
}
