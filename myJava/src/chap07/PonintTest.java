package chap07;

public class PonintTest {

	public static void main(String[] args) {
		Point3D p3d1 = new Point3D();
		Point3D2 p3d2 = new Point3D2();
			
		p3d1.p.x =10;
		p3d1.p.y =20;
		p3d1.z =30;
		
		System.out.println(p3d1.p.x + ":" + p3d1.p.y +":" + p3d1.z);
		
		p3d2.x = 11;
		p3d2.y = 22;
		p3d2.z = 33;
		
		System.out.println(p3d2.x + ":" + p3d2.y +":" + p3d2.z);

	}

}
/*
Point3D2 is a Point
Point 3d has a Point

 부모 :자동차 , 자식:트럭 
 트럭is a자동차(o) <==> 자동차 is a 트럭(x) 

*/
