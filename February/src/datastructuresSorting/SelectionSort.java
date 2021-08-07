package datastructuresSorting;

import java.util.Scanner;

public class SelectionSort {
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
		Selection(a);
		System.out.println();
		System.out.print("array after sorting : ");
		for(int i = 0 ; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void Selection(int[] a) {
		int temp = 0;
		int n = a.length;
		for(int i = 0 ; i < n-1 ; i++) {
			int select = i;
			for(int j = i+1 ; j < n ; j++) {
				if(a[select] > a[j]) {
					temp = a[select];
					a[select] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}

	
