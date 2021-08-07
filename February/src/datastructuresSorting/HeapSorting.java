package datastructuresSorting;

import java.io.*;

public class HeapSorting {
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
		Heap(a , 0 , a.length - 1);
		System.out.print("array after sorting : ");
		for(int i = 0 ; i < n ; i++) {
			System.out.print(a[i] + " ");
		}
	}

	private static void Heap(int[] a, int i, int j) {
		//bad me padhunga
	}
}
