package chap08;

public class ExceptionTest2 {

	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
		int index = 3;
		
//		if(index >= 0 && index < arr.length ) {
//			System.out.println(arr[index]);
//		}
//		else {
//			System.out.println("인덱스의 범위를 벗어난 접근 발생!");
//		}
		
		try{
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인덱스의 범위를 벗어난 접근 발생!");
		}
		catch(Exception e){
			System.out.println("예외처리 완료!");
		}
		
//			
//		}
		
		try{
			throw new Exception("명시적 예외 발생!");
		}
		catch(Exception e) {
			
		}
	}
}
