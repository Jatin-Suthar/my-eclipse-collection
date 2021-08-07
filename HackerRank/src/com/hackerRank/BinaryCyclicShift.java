package com.hackerRank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Set;

public class BinaryCyclicShift {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- != 0) {
			int n = 0;
			n = sc.nextInt();
			int a[] = new int[n];
			int k = 0;
			k = sc.nextInt();
			
//			for(int i = 0 ; i < n ; i++) {
//				if(sc.hasNext()) {
//					a[i] = sc.nextInt();
//				}
//			}
			String s = "";
			if(sc.hasNext()) {
				s = sc.next();
			}
			for(int i = 0 ; i < n ; i++) {
				a[i] = Character.getNumericValue(s.charAt(i));
			}
			
			int result = cyclicShift(a, n);
			if(result == -1) {
				System.out.println("0");
			}else {
				System.out.println(result);
			}
		}
	}
	
	public static int cyclicShift(int a[], int n) {
		int count = 0;
		int storeMax = valueOfBinary(a, n);
		int result = storeMax;
		int storeArray[] = new int[n];
		int temp[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
			temp[i] = a[i];
		}
		
		for(int i = 0 ; i < n ; i++) {
			int first = temp[0];
			int j;
			int sum = 0;
			for( j = 0 ; j < n-1; j++) {
				temp[j] = temp[j+1];
			}
			temp[j] = first;
			sum = valueOfBinary(temp, n);
			if(sum == storeMax) {
				if(i == n-1) {
					if(result == storeMax) {
						count++;
					}
				}
				break;
			}
			if(storeMax < sum) {
				storeMax = sum;
				for(int p = 0 ; p < n ; p++) {
					storeArray[p] = temp[p];
				}
			}
			count++;
		}
		//store the element of storeArray in a
		for(int p = 0 ; p < n ; p++) {
			a[p] = storeArray[p];
		}
		
		for(int i = 0 ; i < n ; i++) {
			int first = storeArray[0];
			int j;
			for( j = 0 ; j < n-1; j++) {
				
				storeArray[j] = storeArray[j+1];
			}
			storeArray[j] = first;
			//if both storeArray and mainArray is same then return count
			for(int p = 0 ; p < n ; p++) {
				if(a[p] != storeArray[p]) {
					break;
				}else {
					if(p == n-1) {
						return count;
					}
				}
			}
			count++;
		}
		
		return -1;
	}
	public static int valueOfBinary(int a[] , int n) {
		int k = 2;
		int sum = 0;
		for(int i = n-1 ; i >= 0 ; i--) {
			if(a[i] == 1) {
				if(i == n-1) {
					sum = sum + a[i];
				}else {
					sum = sum + a[i]*k;
					k = k*2;
				}
			}else {
				k = k*2;
			}
		}
		return sum;
	}
}
