package chap06;

public class Car {
	
	String color;
	String gear;
	int door;
	
	Car(){ //�Ű������� ���� ������
		this("����","�ڵ�",4);
	}
	Car(String color,String gear,int door){
		this.color = color;
		this.gear = gear;
		this.door = door;
	}
	public String toString() {
		return this.color + " : " + this.gear + " : " + this.door;
	}

	
}
