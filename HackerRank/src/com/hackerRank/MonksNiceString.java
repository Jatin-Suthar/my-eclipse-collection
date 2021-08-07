package com.hackerRank;

import java.util.*;

public class MonksNiceString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a[] = new String[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.next();
		}
		System.out.println(0);
		for(int i = 1 ; i < n ; i++) {
			int result = 0;
			for(int j = i ; j > 0 ; j--) {
				result += find(a[i], a[j-1]);
			}
			System.out.println(result);
		}
	}
	public static int find(String a, String b) {
		if(a.length() == 1 && a.charAt(0) > b.charAt(0)) {
			return 1;
		}
		if((a.length() == 1 && a.charAt(0) < b.charAt(0)) || (a.length() == 1 && a.charAt(0) == b.charAt(0))) {
			return 0;
		}
		if(a.length() > 0 && a.charAt(0) > b.charAt(0)) {
			return 1;
		}
		if(a.charAt(0) == b.charAt(0) && a.length() > 1 && b.length() > 1) {
			return find(a.substring(1,a.length()), b.substring(1,b.length()));
		}else if(a.length() > 1 && b.length() == 1 && a.charAt(0) == b.charAt(0)) {
			return 1;
		}
		return 0;
	}
}
