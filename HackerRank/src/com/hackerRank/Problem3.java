package com.hackerRank;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
			int n1 = sc.nextInt();
			int n2 = sc.nextInt();
			int k = sc.nextInt();
			int p = sc.nextInt();
			if(p == 0) {
				int noOfways = ricksTurn(n1,k);
				System.out.println(noOfways);
			}else if(p == 1) {
				int noOfways = montysTurn(n2,k);
				System.out.println(noOfways);
			}
		}
	}

	public static int montysTurn(int n2, int k) {
		int ways = 0;
		//make a for loop and check the data
		if(k % 2 == 0) {
			for(int i = 2 ; i <= k ; i++) {
				if(i % 2 == 0) {
					ways++;
				}
			}
		}else if(k % 2 != 0) {
			ways = 1;
			for(int i = 2 ; i <= k ; i++) {
				if(i % 2 != 0) {
					ways++;
				}
			}
		}
		return ways;
	}

	public static int ricksTurn(int n1, int k) {
		int ways = 0;
		if(k % 2 == 0) {
			for(int i = 2 ; i <= k ; i++) {
				if(i % 2 != 0) {
					ways++;
				}
			}
		}else if(k % 2 != 0) {
			ways = 1;
			for(int i = 2 ; i <= k ; i++) {
				if(i % 2 == 0) {
					ways++;
				}
			}
		}
		return ways;
	}
}
