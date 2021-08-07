package com.hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class Problem5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			boolean result[] = checkPrime(y);
			int resultSum = 0;
			for(int i = x ; i <= y ; i++) {
				if(result[i] == true) {
					resultSum = resultSum + convertXOR(i);
				}
			}
			System.out.println(resultSum);
		}
	}
	public static boolean[] checkPrime(int n) {
		boolean[] isPrime = new boolean[n+1];
		
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for(int i = 2 ; i*i <= n ; i++) {
			for(int j = i*2 ; j <= n ; j = j + i) {
				isPrime[j] = false;
			}
		}
		return isPrime;
	}
	public static int convertXOR(int i) {
		int converted = 0;
		int num = 0;
		String s = String.valueOf(i);
		if(s.length() == 1) {
			return i;
		}
		if(i == 11) {
			return i;
		}
		for(int j = 0 ; j < s.length()-1 ; j++) {
			converted = converted + Character.getNumericValue(s.charAt(j)) ^ Character.getNumericValue(s.charAt(j+1));
		}
		int flag = 0;
		for(int k = 2 ; k < converted/2 ; k++) {
			if(converted % k == 0) {
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			num = converted;
		}
		return num;
	}
}
