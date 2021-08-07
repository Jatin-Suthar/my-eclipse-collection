package problems;

import java.util.*;
public class TrappingRainWater {

	public static int trap(int a[]) {
		int result = 0;
		
		if(a == null || a.length <= 2) return 0;
		
		int left[] = new int[a.length];
		int right[] = new int[a.length];
		
		int max = a[0];
		left[0] = a[0];
		for(int i = 1 ; i < a.length ; i++) {
			if(a[i] < max) {
				left[i] = max;
			}else {
				left[i] = a[i];
				max = a[i];
			}
		}
		
		max = a[a.length-1];
		right[a.length-1] = a[a.length-1];
		for(int i = a.length-2 ; i >= 0 ; i--) {
			if(a[i] < max) {
				right[i] = max;
			}else {
				right[i] = a[i];
				max = a[i];
			}
		}
		
		for(int i = 0 ; i < a.length ; i++) {
			result += Math.min(left[i], right[i]) - a[i];
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0 ; i < n ; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println(trap(a));
		}
		sc.close();
	}
	
}

