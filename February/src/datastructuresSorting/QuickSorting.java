package datastructuresSorting;

import java.io.*;

public class QuickSorting {
	public static void main(String[] args) throws IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(input);
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		String s = br.readLine();
		String str1[] = s.split(" ");
		for(int i = 0 ; i < n ; i++) {
			a[i] = Integer.parseInt(str1[i]);
		}
		System.out.print("array before sorting : ");
		for(int i = 0 ; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
		Quick(a , 0 , a.length - 1);
		System.out.print("array after sorting : ");
		for(int i = 0 ; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static int partition(int[] a, int l, int r) {
		int pivot = a[r];
		int temp = 0;
		int i = (l - 1);
		for(int j = 0 ; j < r ; j++) {
			if(a[j] <= pivot) {
				i++;
				
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		temp = a[i+1];
		a[i+1] = a[r];
		a[r] = temp;
		
		return i+1;
	}

	public static void Quick(int[] a, int l, int r) {
		if(l < r) {
			int m = partition(a , l , r);
			
			Quick(a , l , m - 1);
			Quick(a , m + 1 , r);
		}
	}
}
