package chap07;

public class Parent {
	int a;
	
	Parent(){
		this.a =100;
		
	}
	
	public void methodA() {
		System.out.println("parent.methodA() 호출");
	}
}

//자식에 의해서 자동으로 생성되는 부모 인스턴스는 매개변수 없는
//생성자를 이용하여 인스턴스를 생성한다.