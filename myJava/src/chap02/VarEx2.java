package chap02;

class VarEx2 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int tmp = 0;
	
		System.out.println("x:"+ x + " y:" + y);
		
		tmp = x; //tmp에 x값이 들어간다 tmp 10 
		x = y;   //x는 빈값이 됐다 x에 y를 넣는다 그럼 x는 20 y는 빈다 
		y = tmp; //다시 tmp 값을 y에 대입 y는 10 

		System.out.printf("x:%d y:%d%n"  ,x,y);
	}
}
