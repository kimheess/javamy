package chap07;

public class Circle extends Shape{
	Point center;
	int r;
	
	Circle(){
		this(new Point(), 100);
	}
	
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return "반지름이" + this.r + "인 원의 객체";
	}
}
