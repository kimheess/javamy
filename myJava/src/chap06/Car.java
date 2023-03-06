package chap06;

public class Car {
	
	String color;
	String gear;
	int door;
	
	Car(){ //매개변수가 없는 생성자
		this("검정","자동",4);
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
