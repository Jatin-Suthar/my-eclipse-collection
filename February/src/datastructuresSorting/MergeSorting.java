package datastructuresSorting;

import java.util.Scanner;

public class MergeSorting {
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
		Sort(a , 0 , a.length);
		System.out.println();
		System.out.print("array after sorting : ");
		for(int i = 0 ; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void Sort(int[] a, int l, int r) {
		if(l < r) {
			int m = (l + r)/2;
			
			Sort(a, l, m);
			Sort(a, m+1, r);
			
			Merge(a, l, m, r);
		}
	}
	public static void Merge(int a[], int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int L[] = new int[n1];
		int R[] = new int[n2];
		
		for(int i = 0 ; i < n1 ; i++) {
			L[i] = a[l + i];
		}
		for(int i = 0 ; i < n2 ; i++) {
			R[i] = a[m + 1 + i];
		}
		
		int i = 0;
		int j = 0;
		int k = l;
		
		while(i < n1 && j < n2) {
			if(L[i] <= R[k]) {
				a[k] = L[i];
				i++;
			}else {
				a[k] = R[j];
				j++;
			}
			k++;
		}
		while(i < n1) {
			a[k] = L[i];
			i++;
			k++;
		}
		while(j < n2) {
			a[k] = R[j];
			j++;
			k++;
		}
	}
}
