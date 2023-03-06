package chap03;

public class PhyiscData {
	//--- 신체검사 데이터 ---//
         String name;          // 이름
         int    height;        // 키
         double vision;        // 시력

        //--- 생성자(constructor) ---/
         PhyiscData(null, height,0.0){
        	 	
         }
         public PhyiscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        //--- 문자열로 만들어 반환하는 메서드 --//
        public String toString() {
            return name + " " + height + " " + vision;
        }
}
