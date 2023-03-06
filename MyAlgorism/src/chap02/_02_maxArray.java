package chap02;

public class _02_maxArray {

	public static void main(String[] args) {
		int [] a = {30,40,300,50,20,80,10,220};
		int max;
		
		max = a[0];
		for(int i = 0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			
			}
			System.out.println(a[i]);
		}
		System.out.println(max);
			
	}

}
