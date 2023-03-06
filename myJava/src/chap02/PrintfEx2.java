package chap02;

class PrintfEx2 {
	public static void main(String[] args) {
		String url = "www.codechobo.com";

		float f1 = .10f;   // 0.10, 1.0e-1
		float f2 = 1e1f;   // 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;

		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); //%f는 실수 출력 %e  과학적 표기법 %g 실수 값을 가장 최적화된 표현으로 출력 
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2); //%f는 소숫점이하 6자리 까지만 출력 한다 
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		System.out.printf("d= %f %n", d);
		System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점 10자리
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url); //%s는 문자열 출력 
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url); // 왼쪽 정렬
		System.out.printf("[%.8s]%n", url);  // 왼쪽에서 8글자만 출력
	}
}
