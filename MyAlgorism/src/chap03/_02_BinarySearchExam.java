package chap03;

import java.util.Arrays;
import java.util.Collections;

// 이진 검색 
public class _02_BinarySearchExam {
	int binarySearch(int [] arr, int key){
		int result = -1;
		int pl,pr,pc;
		
		pl = 0;
		pr = arr.length  -1;
		
		while(true) {
			pc = (pl + pr) /2;
			
			System.out.printf("pl : %d, pr: %d, pc: %d, arr[%d] : %d\n",pl,pr,pc,pc,arr[pc]);
			
			if(arr[pc] == key) {
				result = pc;
				break;
			}
			else if(arr[pc] < key) {
				pl = pc + 1;
			}
			else {
				pr = pc - 1;
			}
			
			if(pl > pr) {
				break;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Integer[] arr = {5, 2, 4, 1, 6, 3, 7};
		int key = 1;
		
		// Arrays.sort(arr); Arrays.sort : 오름차순 정렬
		 Arrays.sort(arr, Collections.reverseOrder()); 
		
		System.out.println(Arrays.toString(arr));
		System.out.println("Arrays.binarySearch(arr,key)exam.binarySearch(arr,key): " + Arrays.binarySearch(arr,key));
		
		
//		int [] arr = {5, 7, 15, 28, 29, 31, 39, 58, 68,  70, 95};
//		int key = 39;
	
//		System.out.println("\n\nArrays.binarySearch(arr,key)exam.binarySearch(arr,key): " + Arrays.binarySearch(arr,key));
		
//		_02_BinarySearchExam exam= new _02_BinarySearchExam();
//		System.out.println("\n\n\texam.binarySearch(arr,key): " + exam.binarySearch(arr,key));
	}
}
