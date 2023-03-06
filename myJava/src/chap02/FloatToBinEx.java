package chap02;
	
class FloatToBinEx {
	public static void main(String args[]) {
		float f = -9.1234567f;          //32bit: 1ㅣ8ㅣ23 => 1 0000 0001 000 0001 0010 0011 0001 1011 0XC111F9AE
		int i = Float.floatToIntBits(f);

		System.out.printf("%13.7f%n", f);
		System.out.printf("%13d%n", i);
		
		System.out.printf("%#X%n", i); // 16진수로 출력
	} // main의 끝
}
