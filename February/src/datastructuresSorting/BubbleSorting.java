package datastructuresSorting;

import java.util.Scanner;

public class BubbleSorting {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("array before sorting : ");
		for(int i = 0 ; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
		bubble(a);
		System.out.println();
		System.out.print("array after sorting : ");
		for(int i = 0 ; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void bubble(int[] a) {
		int temp = 0;
		int n = a.length;
		for(int i = 0 ; i < n ; i++) {
			for(int j = 1 ; j < n-i ; j++) {
				if(a[j-1] > a[j]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
