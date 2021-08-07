package divideAndConqueror;

import java.util.*;     

public class MinMax {
	static class findMinMax {
		int min;
		int max;
	}
	static findMinMax getMinMax(int a[], int left , int right) {
		int n = a.length;
		findMinMax minmax = new findMinMax();
		findMinMax l = new findMinMax();
		findMinMax r = new findMinMax();
		int mid;
		if(left == right) {
			minmax.max = a[left];
			minmax.min = a[left];
			return minmax;
		}
		if(right == left + 1) {
			if(a[left] > a[right]) {
				minmax.max = a[left];
				minmax.min = a[right];
			}else {
				minmax.max = a[right];
				minmax.min = a[left];
			}
			return minmax;
		}
		mid = (left + right)/2;
		l = getMinMax(a, left, mid);
		r = getMinMax(a, mid+1, right);
		
		if(l.min < r.min) {
			minmax.min = l.min;
		}else {
			minmax.min = r.min;
		}
		if(l.max > r.max) {
			minmax.max = l.max;
		}else {
			minmax.max = r.max;
		}
		return minmax;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.print("Enter the element of the array : ");
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		findMinMax minmax = getMinMax(a , 0 , n-1);
		System.out.println("maximum element in array is : " + minmax.max);
		System.out.println("minimum element in array is : " + minmax.min);
		sc.close();
	}
}
