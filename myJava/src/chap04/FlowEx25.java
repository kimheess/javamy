package chap04;

import java.util.*;


/*
  2534 10���� ���� �������� ������ 
  								 
   �� :2534                   ������:4 
   �� :253					 ������:3
   �� :25					 ������
   �� :2	
 */

class FlowEx25 {
	public static void main(String[] args) { 
		int num = 0; 
		int sum = 0;

		System.out.print("���ڸ� �Է��ϼ���.(��:12345)>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); // ȭ���� ���� �Է¹��� ������ tmp�� ����
		num = Integer.parseInt(tmp);      // �Է¹��� ���ڿ�(tmp)�� ���ڷ� ��ȯ

		while(num!=0) {    
			// num�� 10���� ���� �������� sum�� ����
			sum += num%10; 	// sum = sum + num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);

			num /= 10;  // num = num / 10;  num�� 10���� ���� ���� �ٽ� num�� ����
		}
		
		System.out.println("�� �ڸ����� ��:"+ sum);
	}
}
