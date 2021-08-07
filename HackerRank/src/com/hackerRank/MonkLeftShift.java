package com.hackerRank;

import java.io.*;
import java.util.*;

public class MonkLeftShift {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int a[] = new int[n];
			
			for(int i = 0 ; i < n ; i++) {
				a[i] = sc.nextInt();
			}
//			
//			for(int i = 0 ; i < x ; i++){
//				int temp = a[a.length-1];
//
//				for(int j = a.length-1 ; j > 0 ; j--){
//					a[j] = a[j-1];
//				}
//
//				a[0] = temp;
//			}
			/* these code is not feasible for long inputs like in lacs dont know y */
//			function(a,n,x);
//			ArrayList<Integer> al = new ArrayList<>();
//			if(x > n) {
//				x = x % n;
//			}
//			int b[] = new int[n];
//			
//			ArrayList<Integer> result = differentApproach1(a, x, n, al);
			
			rightRotate(a, x , n);
			
			for(int i = 0 ; i < n ; i++) {
				System.out.print(a[i] + " ");
			}
			
//			differentApproach1(a,x,n, al);
			//this function takes O(n) complexity.
			System.out.println();
		}
	}
	public static void function(int a[] , int n , int x) {
		for(int i = 0 ; i < x ; i++) {
			int temp = a[a.length-1];
			for(int j = n-1 ; j > 0 ; j--) {
				a[j] = a[j-1];
			}
			a[0] = temp;
		}
	}
	public static void differentApproach(int a[] , int x , int n) {
		int temp[] = new int[n];
		int k = 0;
		for(int i = n-x ; i < n ; i++) {
			temp[k] = a[i];
			k++;
		}
		for(int i = 0 ; i < n - x ; i++) {
			temp[i + x] = a[i];
		}
		for(int i = 0 ; i < n; i++) {
			a[i] = temp[i];
		}
	}
	public static ArrayList<Integer> differentApproach1(int a[] , int x , int n, ArrayList<Integer> al) {
		for(int i = n-x ; i < n ; i++) {
			al.add(a[i]);
		}
		for(int i = 0 ; i < n - x ; i++) {
			al.add(a[i]);
		}

//		while(al.size() != 0) {
//			System.out.print(al.remove(0));
//			System.out.print(" ");
//		}
		return al;
	}
	public static void rightRotate(int a[] , int d , int n){
		while (d > n) {
            d = d - n;
        }
        d = n - d;
        d = d % n;
        int j , k , temp;
		int gcd = gcd(d, n); 
		for(int i = 0 ; i < gcd ; i++){
			temp = a[i];
			j = i;
			while(true) {
				k = j + d;
				if(k >= n){
					k = k - n;
				}
				if(k == i)
					break;
				a[j] = a[k];
				j = k;
			}
			a[j] = temp;
		}
	}
	public static int gcd(int a, int b){
		if(b == 0)
			return a;
		else
			return gcd(b, a % b);
	}
}
