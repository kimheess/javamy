package chap04;

class FlowEx26 {
	public static void main(String[] args) { 
		int sum = 0;
		int i = 1;
		
		while(true) {
			sum += i;
			System.out.printf("%d - %d%n", i , sum);
			
			if((sum + i + 1) > 100) {
				break;
			}else {
				i++;
			}
		}
		System.out.printf("sum: " + sum + ", i : " +i);
	} // main�� ��
}
//1���� 100������ ���� 5050�Դϴ�. �׷��ٸ� 1���� ������� ���� ���ʷ� 1000�� �ʰ��ϴ� ���ϱ��?


//int num = 0;
//int sum = 0;
//
//while(sum<= 1000) {
//	num++;
//	sum += num;
//	
//}
//System.out.printf("1���� %d ������ ���� %d �Դϴ�." , num,sum);
//
//int sum = 0; 
//for(int num = 1; num<=1000; num++) {
//	sum+= num;
//}
//System.out.printf("1���� %d ������ ���� %d �Դϴ�." , num,sum);


/*
  �Ʒ��� �ڵ尡 ������ ���� �ڵ����� �����ϴ� ������ �ۼ��ϼ��� 
  
  �� :1���� ������� ���� ������ 100 ������ ���ϱ��? 
 */
//int sum = 0;
//int i   = 0;
//																	//sum += ++i -> sum :1
//while((sum += ++i) <= 100) { // i�� 1�� �������Ѽ� sum�� ��� ���س�����.//++i 		->  i: 1 
//	
//	System.out.printf("%d - %d%n", i, sum);
//}
//int sum =0, i=1;
//while(sum<=100) {
//	sum += i;
//	System.out.printf("%d - %d%n", i, sum);
////	i++;
////}
//int sum =0, i=1;
//while(sum>100) {
//	sum += i;
//	System.out.printf("%d - %d%n", i, sum-1);
//	i++;
//}