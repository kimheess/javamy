package chap02;

class PrintfEx1 {
	public static void main(String[] args) {
		byte  b = 1;
		short s = 2;
		char  c = 'A';

		int  finger = 10; 
		long big = 100_000_000_000L;       
		long hex = 0xFFFF_FFFF_FFFF_FFFFL ;  // long hex = 0xFFFFFFFFFFFFFFFFL;

		int octNum = 010;       //  8진수 10, 10진수로는 8
		int hexNum = 0x10;      // 16진수 10, 10진수로는 16
		int binNum = 0b10;      //  2진수 10, 10진수로는 2

		System.out.printf("b=%d%n", b);
		System.out.printf("s=%d%n", s);
		System.out.printf("c=%c, %d %n", c, (int)c);
		System.out.printf("finger=[%5d]%n",  finger); //앞에 숫자가 붙으면(5) 5자리를 갖게 출력 한다 오른쪽정렬  
		System.out.printf("finger=[%-5d]%n", finger); //위와 같다 -붙으면 왼쪽정렬
		System.out.printf("finger=[%05d]%n", finger); //위와 같다 공백이 아닌 자릿수를0으로 채워라
		System.out.printf("big=%d%n", big);
		System.out.printf("hex=%#x%n", hex); // '#'은 접두사(16진수 0x, 8진수 0) x는 8진수 또는 16진수로 출력 한다 
		System.out.printf("octNum=%o, %d%n", octNum, octNum); //%o는 8진수나타내기   
		System.out.printf("hexNum=%#x, %d%n", hexNum, hexNum);   
		System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum);  //%s는 문자열 출력
	}
}
