package chap07;

import chap07.pacA.interfaceA;

public interface interfaceB extends interfaceA{
	public static final int num = 1234;
	
	public void methodB(int data); //�߻� �޼���
	
	default void defaultMethod() {
		System.out.println("interfaceB.defaultMethod() ȣ��!");
		System.out.println("num" + num);
	}
	
	static void staticMethod() {
		System.out.println("interfaceB.staticMethod() ȣ��!");
		System.out.println("num" + num);
	}
}
