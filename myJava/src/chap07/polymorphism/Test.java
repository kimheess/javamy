package chap07.polymorphism;

public class Test {

	public static void main(String[] args) {
		
		Parent p = new Child();
		Child c = new Child();
		
		p.methodA();
		c.methodB();
		c.methodA();
		
		/*
		Parent p = new Child();
		p.maeghodA();
		p.maeghodB(); ==> 왜 사용할 수 없을까? ==> X
		
		Child 인스턴스를 생성 했으니 methodB()를 사용하도록 할수 없을까? 
		Child c = (Child)p;
		c.maeghodB();
		
		Parent p = new Parent();
		Child c = (Child)p;
		c.maeghodA();			//compile(OK), runtime(x, ClassCastException)
		 
		
		Other o = new Other();
//		Parent p = (Parent)o;	//상속 관계가 아닌 다른 클래스는 클래스 형변환의 대상이 아니다.
		*/
		
		/*
		Parent p = new Parent();
		Child c = new Child();
		Other o = new Other();
		
		Object obj;
		obj = p;
//		obj.methodA(); 불가 
		obj = c;
//		obj.methodB(); 불가
		obj = o;
//		obj.methodC(); 불가
		*/
//	    Object 클래스 타입의 레퍼런스는 모든 자바 크래스의 인스턴스를 가리킬 수 있다.
//		하지만 문제가 있다? 무엇일까 	 	==>부모 클래스에 존재하지 않는 멤버는 사용할 수 없다
//		어떻게 문제를 해결할 수 있을까 ? 명시적 형변환으로 가능 사용 가능 하다	
		
//		Object obj;
//		obj = new Parent();
//		((Parent)obj).methodA(); 
//		obj = new Child();
//		((Child)obj).methodB();
//		obj = new Other();
//		((Other)obj).methodC();
	}

}

/*
부모 클래스와 자식 클래스 중 개념적으로 더 큰 타입의 클래스는 무엇일까요?
	==> 항상 부모 클래스가 더 크다.

	상속 기반의 다형성 구현 핵심!!!
	==> *** 부모 클래스 타입의 레퍼런스는 자식 클래스의 인스턴스를 가리킬 수 있다 ***
	==> 단, 부모 클래스에 존재하지 않는 멤버는 사용할 수 없다!!! 
	==> 자식 클래스 타입의 레퍼런스는 부모 클래스 타입의 인스턴스를 가리킬 수 없다. (ClassCastException 발생)

	Car <-- {Truck, Bus, Taxi ....}		short s = 10;
					int i = s;		(O, upCasting)
	Car myCar;
 	myCar = new Truck();		
	myCar = new Taxi();		
	myCar = new Bus();
	==============================================
	Car myCar = new Car();		int i = 10; 
	Truck myTruck = myCar;		short s = i;	(X, downCasting)
	==> 불가능!!!
	==============================================
	Car myCar = new Car();		int i = 10;
	Truck myTruck = (Truck)myCar;	short s = (short)i;	(O)
	==> compile OK!!!, runtime ClassCastException 발생!!!




*/