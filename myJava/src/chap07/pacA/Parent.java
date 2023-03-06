package chap07.pacA;

public class Parent {
	private int num1;
	int num2;
	
	public Parent(){
		this.num1 = 1234;
		this.num2 = 4321;
	}
	
	protected int methodA() {
		return this.num1; 
		
	}
	
	public int methodB() {
		return this.num2;
		
	}
}



/*
	protected 멤버는 부모와 서로 다른 패키지에
	소속된 자식에게 제공되는 멤버를 지정하기 위한
	목적으로 사용한다.
*/