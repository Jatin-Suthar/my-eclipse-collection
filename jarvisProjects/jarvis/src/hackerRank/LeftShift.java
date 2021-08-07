package hackerRank;

import java.util.Scanner;

public class LeftShift {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int r = sc.nextInt();
		
		int a[] = new int[n];
				
		for(int a_i = 0 ; a_i < n ; a_i++) {
			
			a[a_i] = sc.nextInt();
			
		}
		
		int c[] = new int[n];
		
		int count = 0;
		
		for(int i = r ; i < a.length ; i++) {
			
			c[count] = a[i];
			count++;
			
		}
		
		count = a.length - r;
		
		for(int i = 0 ; i < r ; i++) {
			
			c[count] = a[i];
			count++;
			
		}
		
		for(int i = 0 ; i < c.length ; i++) {
			
			System.out.print(c[i] + " ");
			
		}
		
	}
	
}
