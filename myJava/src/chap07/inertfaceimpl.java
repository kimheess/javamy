package chap07;

import chap07.pacA.interfaceA;

public class inertfaceimpl implements interfaceB{
	
	public void methodA() {
		System.out.println("interfaceA.methodA() 재 정의!");
	}
	public void methodB(){
		System.out.println("interfaceB.methodB() 재 정의!");
	}

}
