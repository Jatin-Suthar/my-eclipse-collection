package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a[] = new int[n]; 		
		int tallest = 0;
		
		int sum = 0;
		
		for(int i = 0 ; i < n ; i++) {
			
			a[i] = sc.nextInt();
			
		}
		
		Arrays.sort(a);
		
		for(int i = 0 ; i < n ; i++) {
			
			tallest = a[n-1];
			
			if(a[i] == tallest) {
				
				sum = sum + 1;
				
			}
			
		}
		
		System.out.println(sum);
		
	}

}
