package chap07;

public class interfaceTest {

	public static void main(String[] args) {
		interfaceB b = new inertfaceimpl();
		
		System.out.println(interfaceB.num);
		System.out.println(b.num);
		
		//interfaceB.methodB();
		b.methodB();
		
		b.defaultMethod();
		
		interfaceB.staticMethod();
	}

}
