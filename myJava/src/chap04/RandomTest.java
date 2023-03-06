package chap04;

public class RandomTest {

	public static void main(String[] args) {
		double randNum = Math.random();
		int rangeNum = (int)(randNum * 10)+1; //1부터 10 사이의 임의의 정수 
		
		
		System.out.println("randNum:"+ randNum);
		System.out.println("randgNum:"+ rangeNum);

	}

}
