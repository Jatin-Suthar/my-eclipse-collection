package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class AddFour {
	public static int add(ArrayList<Integer> al, int n) {
		int sum = 0;
		int l = 2*n;
		ArrayList<Integer> b = new ArrayList<>(l);
		for(int i = 0 ; i < n ; i++) {
			b.add(al.get(i));
		}
		for(int i = 0 ; i < n ; i++) {
			b.add(al.get(i));
		}
		for(int i = 0 ; i < n ; i++) {
			b.set(n+i, al.get(i));
		}
		int a[] = new int[n];
		for(int i = 0 ; i < n; i++) {
			sum = 0;
			sum = (b.get(i) + b.get(i+1) + b.get(i+2) + b.get(i+3));
			a[i] = sum;
		}
		Arrays.sort(a);
		int max = a[a.length-1];
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>(n);
		for(int i = 0 ; i < n ; i++) {
			al.add(sc.nextInt());
		}
		System.out.println(add(al , n));
	}
}
