package com.hackerRank;

import java.util.Scanner;

public class MonkArrangement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
			int n = sc.nextInt();
			int a[][] = new int[n][n];
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < n ; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			
			int result = 0;
			for(int i = 0 ; i < n ; i++) {
				for(int j = 0 ; j < n ; j++) {
					result +=findAllArrangement(a, n, i, j, a[i][j]);
				}
			}
			System.out.println(result);
		}
	}

	public static int findAllArrangement(int[][] a, int n , int p , int q, int x) {
		int count = 0;
		for(int i = p ; i < n ; i++) {
			for(int j = q ; j < n ; j++) {
				if(x > a[i][j]) {
					count++;
				}
			}
		}
		return count;
	}
}
