package chap03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearchEaxm {

	public static void main(String[] args) {
		public static final Comparator<PhyiscData> SS =  new HeightOrderComparator();
		
		 Scanner stdIn = new Scanner(System.in);
		 PhyiscData[] x = {                    // 키의 오름차순으로 정렬
	            new PhyiscData("강민하", 162, 0.3),
	            new PhyiscData("이수연", 168, 0.4),
	            new PhyiscData("황지안", 169, 0.8),
	            new PhyiscData("유서범", 171, 1.5),
	            new PhyiscData("김찬우", 173, 0.7),
	            new PhyiscData("장경오", 174, 1.2),
	            new PhyiscData("박준서", 175, 2.0),
	        };
	        System.out.print("키가 몇 cm인 사람을 찾고 있나요?: ");
	        int height = stdIn.nextInt();                // 킷값을 읽어 들임
	        int idx = Arrays.binarySearch( x,new PhyiscData(height),HEIGHT_ORDER);

	        if (idx < 0)
	            System.out.println("그 값의 요소가 없습니다.");
	        else {
	            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
	            System.out.println("찾은 데이터: " + x[idx]);
	        }
	}

}
