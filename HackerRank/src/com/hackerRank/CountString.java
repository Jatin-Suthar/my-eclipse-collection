package com.hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class CountString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
			int left = 0, right = 0;
			int result = 0;
			String a = sc.next();
			String sub = sc.next();
			if((a.substring(a.length()-sub.length())).equals(sub)) {
				result = 1;
			}else if(checkBothString(a.substring(a.length()-sub.length()), sub)) {
				result = 1;
			}
			left = countFromLeft(a.substring(0, a.length()-1), sub);
			right = countFromLeft(a.substring(1, a.length()), sub);
			result = left + right;
			System.out.println(result);
		}
	}
	public static int countFromLeft(String a, String sub) {
		if(a.length() == sub.length()) {
			if(a.equals(sub)) {
				return 1;
			}else if(checkBothString(a, sub)) {
				return 1;
			}else {
				return 0;
			}
		}
		String temp = a.substring(a.length()-sub.length(), a.length());
		if(temp == sub) {
			return 1 + countFromLeft(a.substring(0, a.length()-1), sub);
		}else if(checkBothString(temp, sub)) {
			return 1 + countFromLeft(a.substring(0, a.length()-1), sub);
		}else {
			return countFromLeft(a.substring(0, a.length()-1), sub);
		}
	}
	public static int countFromRight(String a, String sub) {
		if(a.length() == sub.length()) {
			if(a.equals(sub)) {
				return 1;
			}else if(checkBothString(a, sub)) {
				return 1;
			}else {
				return 0;
			}
		}
		String temp = a.substring(0, sub.length());
		if(temp == sub) {
			return 1 + countFromLeft(a.substring(1, a.length()), sub);
		}else if(checkBothString(temp, sub)) {
			return 1 + countFromLeft(a.substring(1, a.length()), sub);
		}else {
			return countFromLeft(a.substring(1, a.length()), sub);
		}
	}
	public static boolean checkBothString(String a, String b) {
		String a1[] = a.split("");
		String a2[] = b.split("");
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		
		for(int i = 0 ; i < a1.length ; i++) {
			if(a1[i].charAt(0) != a2[i].charAt(0)) {
				return false;
			}
		}
		return true;
	}
}
