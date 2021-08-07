package com.hackerRank;

import java.util.*;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String length = s.substring(s.indexOf("N")+2);
		int n = Integer.parseInt(length);
		int a[] = new int[n];
		String str = s.substring(s.indexOf("{")+1, s.indexOf("}"));
		String arr[] = str.split(",");
		for(int i = 0 ; i < n; i++) {
			a[i] = Integer.parseInt(arr[i]);
		}
		int num = 0;
		int j = 0; 
		
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n-1 ; i++) {
			int count = 1;
			num = a[i] - a[i+1];
			for(j = i+1 ; j < n-1 ; j++) {
				if(a[j] - a[j+1] != num) {
					al.add(count);
					break;
				}else {
					count++;
				}
				if(j == n-2) {
					al.add(count);
				}
			}
		}
		
		Collections.sort(al);
		
		if(al.isEmpty()) {
			System.out.println(0);
		}else {
			System.out.println(al.remove(al.size()-1));
		}
	}
}
