package chap05;

class ArrayEx4 {
	public static void main(String[] args) {
		char[] abc = { 'A', 'B', 'C', 'D'};
		char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);

		// �迭 abc�� num�� �ٿ��� �ϳ��� �迭(result)�� �����.
		char[] result = new char[abc.length+num.length];
		
		System.arraycopy(abc, 0, result, 0, abc.length); //result: 'A' 'B''C' D' 0 0 0 0 0 0 0 0 0 0
		
		System.arraycopy(num, 0, result, abc.length, num.length); // result: 'A' 'B''C' D' '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
		System.out.println(result);

		// �迭 abc�� �迭 num�� ù ��° ��ġ���� �迭 abc�� ���̸�ŭ ����
		System.arraycopy(abc, 0, num, 0, abc.length);	 //num:'A', 'B', 'C', 'D', '4', '5', '6', '7', '8', '9'
		System.out.println(num);

	     // number�� �ε���6 ��ġ�� 3���� ����
		System.arraycopy(abc, 0, num, 6, 3); //  num:'A', 'B', 'C', 'D', '4', '5', 'A', 'B', 'C', '9' 
		System.out.println(num);				//	 num: 		
	}
}
