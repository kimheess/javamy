package chap05;

class ArrayEx1 {
	public static void main(String[] args) { 
		int score = 90;
		String result = "1";
		
		if(score > 60) {
			result = "합격";
		}
		else {
			result = "불합격";
			
		}
		System.out.println(result);
	} // main
}
