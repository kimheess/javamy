package chap07;

public class ShapeTest {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle(new Point(150,150),50);
		
		
		Point pArr[], p1, p2, p3; 
		p1 = new Point(100, 100);
		p2 = new Point(140, 50);
		p3 = new Point(200, 100);
		pArr = new Point[] {p1, p2, p3};
		
		Triangle t1 = new Triangle(pArr);
		Triangle t2 = new Triangle(p1, p2, p3);
		
		System.out.println(c1.color + " : " + c1.center.x + " : " + c1.center.y + " : " + c1.r);
		System.out.println(c1.draw());
		System.out.println("-------------------------");
		
		System.out.println(c2.color + " : " + c2.center.x + " : " + c2.center.y + " : " + c2.r);
		System.out.println(c2.draw());
		System.out.println("-------------------------");
		
		System.out.println(t1.color + "(" + t1.p[0].x + "," + t1.p[0].y + "),"
				+ "(" + t1.p[1].x + "," + t1.p[1].y + "),"
				+ "(" + t1.p[2].x + "," + t1.p[2].y + ") ");
		System.out.println(t1.draw());
		System.out.println("-------------------------");
		
		System.out.println(t2.color + "(" + t2.p[0].x + "," + t2.p[0].y + "),"
				+ "(" + t2.p[1].x + "," + t2.p[1].y + "),"
				+ "(" + t2.p[2].x + "," + t2.p[2].y + ")");
		System.out.println(t2.draw());
		
		
	}	

}
