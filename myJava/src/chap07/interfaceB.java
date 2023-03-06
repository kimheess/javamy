package chap07;

import chap07.pacA.interfaceA;

public interface interfaceB extends interfaceA{
	public static final int num = 1234;
	
	public void methodB(int data); //추상 메서드
	
	default void defaultMethod() {
		System.out.println("interfaceB.defaultMethod() 호출!");
		System.out.println("num" + num);
	}
	
	static void staticMethod() {
		System.out.println("interfaceB.staticMethod() 호출!");
		System.out.println("num" + num);
	}
}
