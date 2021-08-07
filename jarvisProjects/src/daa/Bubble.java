package daa;

import java.util.Scanner;

public class Bubble {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int a[] = new int[length];
		for(int i = 0 ; i < a.length ; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("before sorting : ");
		for(int i = 0 ; i < a.length ; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		bubblesort(a);
		System.out.print("after sorting : ");
		for(int i = 0 ; i < a.length ; i++) {
			System.out.print(a[i] + " ");
		}
	}
	public static void bubblesort(int a[]) {
		int n = a.length;
		int temp = 0;
		for(int i = 0 ; i < n ; i++) {
			for(int j = 1 ; j < (n-i) ; j++) {
				if(a[j-1] > a[j]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
