package chap02;

class VarEx2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int tmp = 0;
	
		System.out.println("x:"+ x + " y:" + y);
		
		tmp = x; //tmp�� x���� ���� tmp 10 
		x = y;   //x�� ���� �ƴ� x�� y�� �ִ´� �׷� x�� 20 y�� ��� 
		y = tmp; //�ٽ� tmp ���� y�� ���� y�� 10 

		System.out.printf("x:%d y:%d%n"  ,x,y);
	}
}
