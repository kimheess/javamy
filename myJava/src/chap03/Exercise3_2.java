package chap03;

public class Exercise3_2 {

	public static void main(String[] args) {
		int numOfApples = 123; //����� ����
		int sizeOfBuket = 10;  //�ٱ����� ũ�� (�ٱ��Ͽ� ���� �� �ִ� ����� ����)
		int numOfBucket = Math.round(numOfApples / sizeOfBuket)+1;  //��� ����� ��µ� �ʿ��� �ٱ��� �� 
		
		System.out.println(numOfBucket);

	}

}
