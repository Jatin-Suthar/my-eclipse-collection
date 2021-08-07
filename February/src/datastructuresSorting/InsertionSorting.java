package datastructuresSorting;

import java.util.Scanner;

public class InsertionSorting {
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
		Insertion(a);
		System.out.println();
		System.out.print("array after sorting : ");
		for(int i = 0 ; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void Insertion(int[] a) {
		int temp = 0;
		int n = a.length;
		for(int i = 1 ; i < n ; i++) {
			for(int j = 1 ; j < i+1 ; j++) {
				if(a[j-1] > a[i]) {
					temp = a[i];
					a[i] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
	}
}