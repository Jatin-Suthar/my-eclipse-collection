package recursion;

import java.util.Arrays;
public class EasyQuestion {

	public static void main(String[] args) {

		int a[] = {2,3,1,5,4};
		Bubblesort(a , 5);
		System.out.println("sorted array is : ");
		System.out.println(Arrays.toString(a));
		
	}
	
	static int Bubblesort(int a[], int n) {
		if(n == 1) {
			return a[n-1];
		}
		for(int i = 0 ; i < n-1 ; i++) {
			if(a[i] > a[i+1]) {
				int temp = a[i];
				a[i] = a[i+1];
				a[i+1] = temp;
			}
		}
		return Bubblesort(a , n-1);
	}
	
}
