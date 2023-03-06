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
		p.maeghodB(); ==> �� ����� �� ������? ==> X
		
		Child �ν��Ͻ��� ���� ������ methodB()�� ����ϵ��� �Ҽ� ������? 
		Child c = (Child)p;
		c.maeghodB();
		
		Parent p = new Parent();
		Child c = (Child)p;
		c.maeghodA();			//compile(OK), runtime(x, ClassCastException)
		 
		
		Other o = new Other();
//		Parent p = (Parent)o;	//��� ���谡 �ƴ� �ٸ� Ŭ������ Ŭ���� ����ȯ�� ����� �ƴϴ�.
		*/
		
		/*
		Parent p = new Parent();
		Child c = new Child();
		Other o = new Other();
		
		Object obj;
		obj = p;
//		obj.methodA(); �Ұ� 
		obj = c;
//		obj.methodB(); �Ұ�
		obj = o;
//		obj.methodC(); �Ұ�
		*/
//	    Object Ŭ���� Ÿ���� ���۷����� ��� �ڹ� ũ������ �ν��Ͻ��� ����ų �� �ִ�.
//		������ ������ �ִ�? �����ϱ� 	 	==>�θ� Ŭ������ �������� �ʴ� ����� ����� �� ����
//		��� ������ �ذ��� �� ������ ? ����� ����ȯ���� ���� ��� ���� �ϴ�	
		
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
�θ� Ŭ������ �ڽ� Ŭ���� �� ���������� �� ū Ÿ���� Ŭ������ �����ϱ��?
	==> �׻� �θ� Ŭ������ �� ũ��.

	��� ����� ������ ���� �ٽ�!!!
	==> *** �θ� Ŭ���� Ÿ���� ���۷����� �ڽ� Ŭ������ �ν��Ͻ��� ����ų �� �ִ� ***
	==> ��, �θ� Ŭ������ �������� �ʴ� ����� ����� �� ����!!! 
	==> �ڽ� Ŭ���� Ÿ���� ���۷����� �θ� Ŭ���� Ÿ���� �ν��Ͻ��� ����ų �� ����. (ClassCastException �߻�)

	Car <-- {Truck, Bus, Taxi ....}		short s = 10;
					int i = s;		(O, upCasting)
	Car myCar;
 	myCar = new Truck();		
	myCar = new Taxi();		
	myCar = new Bus();
	==============================================
	Car myCar = new Car();		int i = 10; 
	Truck myTruck = myCar;		short s = i;	(X, downCasting)
	==> �Ұ���!!!
	==============================================
	Car myCar = new Car();		int i = 10;
	Truck myTruck = (Truck)myCar;	short s = (short)i;	(O)
	==> compile OK!!!, runtime ClassCastException �߻�!!!




*/