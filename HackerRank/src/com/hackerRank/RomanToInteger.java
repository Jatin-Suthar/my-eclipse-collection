package com.hackerRank;

import java.util.*;

public class RomanToInteger {
	public static int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10); 
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for(int i = 0 ; i < s.length() ; i++) {
        	if(i != s.length()-1 && (map.get(s.charAt(i)) < map.get(s.charAt(i+1)))) {
        		result = result - map.get(s.charAt(i));
        		continue;
        	}
        	result = result + map.get(s.charAt(i));
        }
        return result;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int result = romanToInt(s);
		System.out.println(result);
	}
}
