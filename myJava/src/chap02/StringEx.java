package chap02;

class StringEx {
	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str  = name + 8.0;

		System.out.println(name); // "Ja" + "va" 문자열에 +는 합치기 연산자 
		System.out.println(str);  // name + 8.0; name이 문자열 이기 때문에 "java"+8.0이므로 8.0이 "8.0"으로 변경 "
		System.out.println(7 + " "); //위에와 같은 맥락 
		System.out.println(" " + 7); //공백도 영향을 받는다 
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + ""); // 연산자는 앞에부터()없을시 +가 먼저기 때문에 14로 더하기가 이뤄진 후에 14로 변경 
		System.out.println("" + 7 + 7); // 문자열이 앞에 왔기 때문에 결과는 "77"
	}
}
