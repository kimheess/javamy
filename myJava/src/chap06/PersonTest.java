package chap06;

public class PersonTest {

	public static void main(String[] args) {
		Person p1,p2,p3,p4;
		
		p1 = new Person(52, 'M', "����ȣ");
		p2 = new Person(33, 'F', "�迬��");
		p3 = new Person(30, 'M', "�����");
		p4 = new Person(38, 'M', "������");

		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}

}
