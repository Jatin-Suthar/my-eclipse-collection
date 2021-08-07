package com.hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int y = sc.nextInt();
			int a[] = new int[n];
			for(int i = 0 ; i < n ; i++) {
				a[i] = sc.nextInt();
			}
			int result = findMaxPeriods(a,n,x,y);
			System.out.println(result);
		}
	}

	public static int findMaxPeriods(int a[], int n, int x, int y) {
		int attend = 0;
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = x ; i <= y ; i++) {
			al.add(i);
		}
		for(int i = 0 ; i < n ; i++) {
			if(!al.contains(a[i])) {
				attend++;
			}
		}
		return attend;
	}
}
