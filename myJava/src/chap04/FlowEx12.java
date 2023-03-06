package chap04;

class FlowEx12 {
	public static void main(String[] args) { 
//		for(int i=1;i<=5;i++)
//			System.out.println(i); // i의 값을 출력한다.
		int i;
				
		for(i=1; i<=5;i++) {
			System.out.print(i+ " "); 
			System.out.println(i+"\t");// println()대신 print()를 쓰면 가로로 출력된다.
		}
		System.out.println("\n i:" + i);
	}
}
