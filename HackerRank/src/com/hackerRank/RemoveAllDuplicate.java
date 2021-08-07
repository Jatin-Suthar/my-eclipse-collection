package com.hackerRank;

import java.io.PrintStream;
import java.util.*;

public class RemoveAllDuplicate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String result = removeDuplicates(s);
		System.out.println(result);

		int a = 0;
		int b = 1;
		System.out.println(factorial(5));
	}
	public static String removeDuplicates(String s) {
        Set<String> set = new HashSet<>();
        String temp = "";
        String str[] = s.split("");
        ArrayList<String> a = new ArrayList<>();
        a.add("");
        for(int i = 0 ; i < str.length ; i++) {
        	if(a.contains(str[i])) {
        		a.remove(str[i]);
        	}else {
        		a.add(str[i]);
        	}
        }
        while(!a.isEmpty()) {
        	temp += a.remove(0);
        }
        return temp;
    }
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		
		return n*factorial(n-1);
	}
}
