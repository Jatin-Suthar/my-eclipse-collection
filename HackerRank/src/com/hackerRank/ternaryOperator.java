package com.hackerRank;

import java.util.Scanner;

public class ternaryOperator {
	public static void main(String[]  args) {
		Scanner sc = new Scanner(System.in);
	    int a = 3, b = 4;
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    int result = Math.max(Math.abs(x - a), Math.abs(y - b));
	    System.out.println(result);
	}
}
