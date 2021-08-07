package geeksForGeeksProblems;

import java.util.Scanner;

public class CountIndexes {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a[] = new int[n];
		
		int sum = 0;
		
		for(int i = 0 ; i < n ; i++) {
			
			a[i] = sc.nextInt();

		}
		
		for(int i = 0 ; i < n ; i++) {
			
			for(int k = n-1 ; k >= 0 ; k--) {
				
				if(a[i] < a[k]) {
				
					sum += 1;
					
					break;
					
				}
				
			}
			
		}
		
		System.out.println(sum);
		
	}

}
