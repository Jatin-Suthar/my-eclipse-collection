package StringMatching;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value : ");
		int a = sc.nextInt();
		System.out.println("Enter the second value : ");
		int b = sc.nextInt();
		System.out.println("Greatest Common Search is : " + gcd(a,b));
	}

	public static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		if(a == 0) {
			return b;
		}
		if(b == 0) {
			return a;
		}
		if(a == b) {
			return a;
		}
		
		if(a > b) {
			return gcd(a-b , b);
		}else {
			return gcd(a , b-a);
		}
	}
}
