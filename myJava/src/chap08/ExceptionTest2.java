package chap08;

public class ExceptionTest2 {

	public static void main(String[] args) {
		int [] arr = {1, 2, 3, 4, 5};
		int index = 3;
		
//		if(index >= 0 && index < arr.length ) {
//			System.out.println(arr[index]);
//		}
//		else {
//			System.out.println("�ε����� ������ ��� ���� �߻�!");
//		}
		
		try{
			System.out.println(arr[4]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�ε����� ������ ��� ���� �߻�!");
		}
		catch(Exception e){
			System.out.println("����ó�� �Ϸ�!");
		}
		
//			
//		}
		
		try{
			throw new Exception("����� ���� �߻�!");
		}
		catch(Exception e) {
			
		}
	}
}
