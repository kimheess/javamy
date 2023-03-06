package chap05;

public class ArrayTest {

	public static void main(String[] args) {
		int [][] arr = {{1,2,3,4},
						{5,6,7,8},
						{9,10,11,12}
									};
		
		for(int i =0; i< arr.length;i++) { //arr.length: 3 
			for(int j=0; j<arr[i].length; j++) { // arr[i].lenth: 4
				System.out.print(arr[i][j]+"\t");
			}
		System.out.println();
		}
		
	}
}
