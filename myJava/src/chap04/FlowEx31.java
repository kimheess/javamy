package chap04;

class FlowEx31 {
	public static void main(String[] args) {
		//1���� 100 ������ ���� 3�� ����� ������ ���� ���Ͽ� ����ϴ� �ڵ带 �ۼ��ϼ��� 
		int sum = 0;
		int i=1;
		while(i<=100) {
			if (i%3 !=0) {
				i++;
				continue;
			}
			
			sum += i;
			i++;
		}
		System.out.println("1���� 100 ������ �� �� 3�� ����� ������ ���� " + sum + "�Դϴ�.");
		
		
		
		
//		for(int i=1;i <= 100;i++) {
//			if (i%3 !=0) {
//				continue;
//			}
//			sum += i;
//		}
//		System.out.println("1���� 100 ������ �� �� 3�� ����� ������ ���� " + sum + "�Դϴ�.");
	}
}
