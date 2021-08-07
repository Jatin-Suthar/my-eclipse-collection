package com.hackerRank;

import java.util.*;

import java.io.*;

public class MinAndOrXor {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
			int n = sc.nextInt();
			ArrayList<Integer> al = new ArrayList<>();
			for(int i = 0 ; i < n ; i++) {
				al.add(sc.nextInt());
			}
			
			if(n == 1) {
				System.out.println(al.get(0));
			}else {
				int result = getAnswer(n, al);
				System.out.println(result);
			}
		}
		sc.close();
	}
	public static int getAnswer(int n, ArrayList<Integer> al) {
		Stack<Integer> stack = new Stack<>();
		int min = 0;
		int result = 0;
		for(int i = n-1 ; i > 0 ; i--) {
			min = (al.get(i) & al.get(i-1)) ^ (al.get(i) | al.get(i-1));
			stack.push(min);
			for(int j = i-1 ; j > 1 ; j--) {
				result = (al.get(i) & al.get(j-1)) ^ (al.get(i) | al.get(j-1));
				if(stack.peek() > result) {
					stack.pop();
					stack.push(result);
				}
			}
		}
		int minimum = Collections.min(stack);
		return minimum;
	}
}
