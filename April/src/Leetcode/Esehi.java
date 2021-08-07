package Leetcode;

import java.util.Scanner;

public class Esehi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//yahape function likh
		
		for(int i = 1 ; i <= n ; i++) {
			if((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FIZZBUZZ");
			}else if((i % 3 == 0) || (i % 5 == 0)) {
				if(i % 3 == 0) {
					System.out.println("FIZZ");
				}else {
					System.out.println("BUZZ");
				}
			}else {
				System.out.println(i);
			}
		}
	}
}
