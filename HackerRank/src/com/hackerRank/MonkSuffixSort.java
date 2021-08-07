package com.hackerRank;

import java.util.*;

public class MonkSuffixSort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int k = sc.nextInt();
		Set<String> set = new HashSet<>();
		for(int i = 0 ; i < s.length() ; i++) {
			set.add(s.substring(i, s.length()));
		}
		Object[] b = set.toArray();
		Arrays.sort(b);
		System.out.println(b[k-1]);
	}
}
