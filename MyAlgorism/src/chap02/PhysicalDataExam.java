package chap02;

public class PhysicalDataExam {

	public static void main(String[] args) {		
		PhysicalDataManager manager = new PhysicalDataManager(new PhysicalData[] {
				new PhysicalData("강민하", 162, 0.3),
				new PhysicalData("김찬우", 173, 0.7),
				new PhysicalData("박준서", 175, 2.0),
				new PhysicalData("유서범", 171, 1.5),
				new PhysicalData("이수연", 168, 0.4),
				new PhysicalData("장경오", 174, 1.2),
				new PhysicalData("황지안", 169, 0.8),
		});
		
		
		System.out.println("★신체검사 리스트★");
		System.out.println("이름      키   시력 ");
		System.out.println("=====================");
		
		for(int i = 0; i<manager.x.length  ; i++) {
			System.out.printf("%-7s%3d%5.1f\n", 
					manager.x[i].name, manager.x[i].height, manager.x[i].vision);
		}
		
			System.out.printf("\n 평균키 : %5.1fcm\n", manager.aveheight() );
			
			System.out.println("\n시력 분포");
			for(int i = 0 ; i < PhysicalDataManager.VMAX; i++) {
				System.out.printf("%3.1f~: %2d명\n" , i /10.0 , manager.vdist[i]);
			}
	}

}
//x[0] = new PhisicalData("강민하", 162, 0.3); 
//x[1] = new PhisicalData("김찬우", 173, 0.7);
//x[2] = new PhisicalData("박준서", 175, 2.0);
//x[3] = new PhisicalData("유서범", 171, 1.5);
//x[4] = new PhisicalData("이수연", 168, 0.4);
//x[5] = new PhisicalData("장경오", 174, 1.2);
//x[6] = new PhisicalData("황지안", 169, 0.8);