package com.hackerRank;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int length = sc.nextInt();
		String[] a = new String[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.next();
		}
		int count = 0;
		for(int i = 0 ; i < n ; i++) {
			if(a[i].length() == length) {
				count++;
			}
		}
		System.out.println(count);
	}
}
