package chap06;

import java.util.Arrays;

public class Test {
	
	void paramTest(int num) {
		num *= 2;
		System.out.println("paramTest num:" + num);
	}
	
	void paramTest2(int[] arr) {
		
		for(int i=0; i<arr.length;i++) {
			arr[i] *= 2;
		}
		
		System.out.println("paramTest2 arr:" + Arrays.toString(arr)); //2,4,6,8,10
	}
	
	
	public static void main(String[] args) {
		int num = 10;
		Test test = new Test();
		
		test.paramTest(num);
		

		System.out.println("main() num:" + num);
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println("main() arr:" + Arrays.toString(arr)); // 1, 2, 3, 4, 5
		
		test.paramTest2(arr);
		System.out.println("main() arr:" + Arrays.toString(arr)); // 2, 4, 6, 8, 10
		
	}

}


