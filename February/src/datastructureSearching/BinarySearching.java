package datastructureSearching;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

import datastructuresSorting.QuickSorting;
public class BinarySearching {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		Arrays.sort(a);
		System.out.println();
		int result = binarysearch(a, 0, a.length-1, x);
		if(result == -1) {
			System.out.println("Element Not Found !");
		}else {
			System.out.println("Element Found at position : " + result);
		}
	}
	public static int binarysearch(int a[] , int l , int r , int x) {
		int m = l + (r - l)/2;
		
		if(a[m] == x) {
			return m;
		}
	
		if(a[m] > x) {
			return binarysearch(a, l, m-1, x);
		}else if(a[m] < x) {
			return binarysearch(a, m+1, r, x);
		}else {
			return -1;
		}
	}
}
