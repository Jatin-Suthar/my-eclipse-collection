package seiveOfEratosThene;

import java.util.Arrays;
import java.util.Scanner;

public class Algo {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		boolean result[] = appAlgo(n);
//		for(int i = 0 ; i < result.length ; i++) {
//			if(result[i]) {
//				System.out.println(i);
//			}
//		}j
//		int p = 5;
//		if(p > 0) {
//			int c = (int) Math.pow(p, 0.5);
//			boolean result = isPrime(p, c);
//			if(result) {
//				System.out.println("it is prime");
//			}else {
//				System.out.println("it is not prime");
//			}
//		}else {
//			System.out.println("it is prime");
//		}
//		int a = 5, b = 6;
//		if(a>b)
//			System.out.println(lcm(a,b,a));
//		else
//			System.out.println(lcm(a,b,b));
//		System.out.println(gcd(5,10));
		String s = "JECRC";
		reverseString(s);
		int sum = 0;
		System.out.println(sum("123", sum));
		System.out.println(sumOfDigits(1234, 0));
	}
	public static boolean isPrime(int n, int c) {
		if(c == 1) {
			return true;
		}
		
		if(n%c == 0) {
			return false;
		}
		return isPrime(n, c-1);
	}
	public static int lcm(int a, int b, int max) {
		if(max%Math.min(a, b) == 0) {
			return max;
		}
		
		return lcm(a,b,max+Math.max(a, b));
	}
	
	public static int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		
		return gcd(a, b%a);
	}

	public static boolean[] appAlgo(int n) {
		boolean[] isPrime = new boolean[n+1];
		
		Arrays.fill(isPrime, true);
		isPrime[0] = false;
		isPrime[1] = false;
		for(int i = 2 ; i*i <= n ; i++) {
			for(int j = i*2 ; j <= n ; j = j + i) {
				isPrime[j] = false;
			}
		}
		return isPrime;
	}
	public static void reverseString(String s) {
		if(s.length() == 1) {
			System.out.print(s.charAt(0)+" ");
			return;
		}
		
		reverseString(s.substring(1, s.length()));
		System.out.print(s.charAt(0) + " ");
	}
	public static int sum(String n, int sum) {
		if(n.length() == 1) {
			sum = sum + Character.getNumericValue(n.charAt(0));
			return sum;
		}
		
		sum = sum + Character.getNumericValue(n.charAt(0));
		
		return sum(n.substring(1, n.length()), sum);
	}
	public static int sumOfDigits(int n, int sum) {
		if(n < 10) {
			sum = sum + n%10;
			return sum;
		}
		
		sum = sum+n%10;
		return sumOfDigits(n/10, sum);
	}
}
