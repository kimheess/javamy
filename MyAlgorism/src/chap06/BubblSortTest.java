package chap06;

import java.util.Arrays;

public class BubblSortTest {
	
	void swap(int [] arr, int idx1, int idx2) {
		int x = arr[idx1];
		arr[idx1] = arr[idx2];
		arr[idx2] = x;
	}
	void bubbleSort1 (int[] arr) {
		int lastIdx = arr.length-1;
		
		for(int i = 0; i<lastIdx; i++) {
			for(int j = lastIdx; j> i; j--) {
				if(arr[j-1]>arr[j]) {
					this.swap(arr,j-1,j);
				}
			}
		}
	}
	void bubbleSort2 (int[] arr) {
		int lastIdx = arr.length-1;
		
		for(int i = 0; i<lastIdx; i++) {
			int swapCount = 0;
			
			for(int j = lastIdx; j> i; j--) {
				if(arr[j-1]>arr[j]) {
					this.swap(arr,j-1,j);
					swapCount++;
				}
			}
			if(swapCount == 0) {
				break;
			}
		}
	}
//	void bubbleSort(int[] arr, int n) {
//		for(int i = 0; i< n -1; i++) { 		// 인덱스가 0부터 시작이니까 n-1이 배열의 끝 자리가 된다 
//			for(int j = n-1; j > i; j--) {
//				if(arr[j-1] > arr[j]) {
//					swap(arr,j-1,j);
//				}
//			}
//		}
//	}
	public static void main(String[] args) {
		int[] arr = {1,6,4,3,7,8,9};
		int[] arr2 = {1,3,9,4,7,8,6};
		BubblSortTest test = new BubblSortTest();
		
		
		//버블 정렬을 이용하여 arr배열을 정려하는 코드를 작성하세요.
		System.out.println(Arrays.toString(arr2));
		test.bubbleSort2(arr2);
		System.out.println(Arrays.toString(arr2));
	}

}
