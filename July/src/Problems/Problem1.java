package Problems;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i = 0;
		
		double carry = 0;
		int days = 0;
		
		for(i = 2 ; i <= a ; i++) {
			carry = (carry + 1/Math.pow(i, 0.5));
			days++;
		}
		int n = (int) carry;
		double temp = 0;
		System.out.println(n);
		do {
			
		}while(temp != 3);
		if(a <= 15) {
			System.out.println(a + 4);
		}else {
			System.out.println(days);
		}
	}
}	
