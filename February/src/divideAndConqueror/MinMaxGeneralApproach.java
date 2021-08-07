package divideAndConqueror;

import java.util.Scanner;

public class MinMaxGeneralApproach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.print("Enter the element of the array : ");
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("The Minimum element in the array is : " + minEle(a, n));
		System.out.println("The Maximum element in the array is : " + maxEle(a, n));
	}

	public static int maxEle(int[] a , int n) {
		int max = a[0];
		for(int i = 0 ; i < n ; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}

	public static int minEle(int[] a , int n) {
		int min = a[0];
		for(int i = 1 ; i < n ; i++) {
			if(min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}
}
